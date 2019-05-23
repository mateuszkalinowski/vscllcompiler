package pl.mateuszkalinowski.vscllcompiler.entities;

import pl.mateuszkalinowski.vscllcompiler.enums.VariableType;

public class StackValue {
    public String name;
    public VariableType type;

    public StackValue(String name, VariableType type ){
        this.name = name;
        this.type = type;
    }
}