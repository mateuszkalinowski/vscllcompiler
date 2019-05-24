package pl.mateuszkalinowski.vscllcompiler.entities;

import pl.mateuszkalinowski.vscllcompiler.enums.VariableType;

import java.util.ArrayList;

public class FunctionInfo {
    public VariableType functionType;
    public ArrayList<VariableType> parametersTypes = new ArrayList<>();

    public FunctionInfo(VariableType functionType) {
        this.functionType = functionType;
    }
}
