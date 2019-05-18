package pl.mateuszkalinowski.vscllcompiler.llvm;

class LLVMGenerator{

    static String header_text = "";
    static String main_text = "";
    static int reg = 1;
    static int str_i = 0;

    static void print_i32(String id){
        main_text += "%"+reg+" = load i32, i32* "+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %"+(reg-1)+")\n";
        reg++;
    }

    static void print_double(String id){
        main_text += "%"+reg+" = load double, double* "+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
        reg++;
    }

    static void print_static_string(String text){
        int str_len = text.length();
        String str_type = "["+(str_len+2)+" x i8]";
        header_text += "@str"+str_i+" = constant"+str_type+" c\""+text+"\\0A\\00\"\n";
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( "+str_type+", "+str_type+"* @str"+str_i+", i32 0, i32 0))\n";
        str_i++;
        reg++;
    }

    static void scan_i32(String id) {
        main_text += "%" + reg + "= call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.str, i32 0, i32 0), i32* "+ id + ")";
        reg++;
    }

    static void scan_double(String id) {
        main_text += "%"+reg+" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), double* "+ id+ ")\n";
        reg++;
    }

    static void declare_i32(String id){
        main_text += "%"+id+" = alloca i32\n";
    }

    static void declare_double(String id){
        main_text += "%"+id+" = alloca double\n";
    }

    static void assign_i32(String id, String value){
        main_text += "store i32 "+value+", i32* %"+id+"\n";
    }

    static void assign_double(String id, String value){
        main_text += "store double "+value+", double* %"+id+"\n";
    }


    static void load_i32(String id){
        main_text += "%"+reg+" = load i32, i32* "+id+"\n";
        reg++;
    }

    static void load_double(String id){
        main_text += "%"+reg+" = load double, double* "+id+"\n";
        reg++;
    }

    static void add_i32(String val1, String val2){
        main_text += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void add_double(String val1, String val2){
        main_text += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
        reg++;
    }

    static void sub_i32(String val1, String val2){
        main_text += "%"+reg+" = sub i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void sub_double(String val1, String val2){
        main_text += "%"+reg+" = fsub double "+val1+", "+val2+"\n";
        reg++;
    }

    static void mult_i32(String val1, String val2){
        main_text += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void mult_double(String val1, String val2){
        main_text += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
        reg++;
    }

    static void sitofp(String id){
        main_text += "%"+reg+" = sitofp i32 "+id+" to double\n";
        reg++;
    }

    static void fptosi(String id){
        main_text += "%"+reg+" = fptosi double "+id+" to i32\n";
        reg++;
    }


    static String generate(){
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @scanf(i8*, ...)\n";
        text += "@strp = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@.str = constant [3 x i8] c\"%d\\00\"\n";
        text += "@.str.1 = constant [4 x i8] c\"%lf\\00\"\n";
        text += header_text;
        text += "define i32 @main() nounwind{\n";
        text += "%tmpi = alloca i32\n";
        text += "%tmpd = alloca double\n";
        text += main_text;
        text += "ret i32 0 }\n";
        return text;
    }

}
