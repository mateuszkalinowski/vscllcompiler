package pl.mateuszkalinowski.vscllcompiler.preprocessor;

import pl.mateuszkalinowski.vscllcompiler.exceptions.PreprocessorException;

import java.io.*;
import java.util.ArrayList;

public class Preprocessor {
    public static String preprocessor(String file) throws IOException, PreprocessorException {
        String path = "afterPreprocessing.vscll";

        File processedFile = new File(path);
        processedFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(processedFile);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        ArrayList<String> finalFile = new ArrayList<>();
        processFile(finalFile, file);
        for (String line : finalFile) {
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        return path;


    }

    public static void processFile(ArrayList<String> lines, String path) throws IOException, PreprocessorException {
        BufferedReader bf = new BufferedReader(new FileReader(path));
        String line = bf.readLine();

        boolean blockComment = false;

        int lineCounter = 0;
        while (line != null) {
            lineCounter++;
            boolean addLine = true;

            int indexOfOneLineComment = line.indexOf("//");
            if (indexOfOneLineComment != -1) {
                line = line.substring(0, indexOfOneLineComment);
                if (line.length() == 0)
                    addLine = false;
            }

            line = line.replaceAll("\\/[*].*[*]\\/", "");

            int index = line.indexOf("/*");

            if (!blockComment && index != -1) {
                blockComment = true;
                line = line.substring(0, index);
            }

            index = line.indexOf("*/");

            if (blockComment && index != -1) {
                blockComment = false;
                int endIndex = index + 2;
                if (endIndex < line.length())
                    line = line.substring(endIndex);
                else
                    addLine = false;
            }

            if (blockComment)
                addLine = false;

            if (line.startsWith("#include")) {
                String file = "";
                try {
                    String include[] = line.split("[ ]+");
                    if (include[1].startsWith("\"") && include[1].endsWith("\"")) {
                        file = include[1].substring(1, include[1].length() - 1);
                        processFile(lines, file);
                    } else {
                        throw new PreprocessorException("Include directive syntax error", lineCounter, path);
                    }
                } catch (IOException e) {
                    throw new PreprocessorException(String.format("File '%s' not found", file), lineCounter, path);
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new PreprocessorException("Include directive syntax error", lineCounter, path);
                }
                addLine = false;
            }

            if (addLine)
                lines.add(line);
            line = bf.readLine();
        }
    }
}
