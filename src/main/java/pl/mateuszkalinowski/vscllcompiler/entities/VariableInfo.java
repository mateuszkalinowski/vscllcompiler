package pl.mateuszkalinowski.vscllcompiler.entities;

import pl.mateuszkalinowski.vscllcompiler.enums.VariableType;

public class VariableInfo {
    public VariableType variableType;
    public String address;
    public String scope;

    public VariableInfo(VariableType variableType, String address, String scope) {
        this.variableType = variableType;
        this.address = address;
        this.scope = scope;
    }
}
