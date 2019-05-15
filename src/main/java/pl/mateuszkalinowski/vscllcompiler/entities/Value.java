package pl.mateuszkalinowski.vscllcompiler.entities;

import pl.mateuszkalinowski.vscllcompiler.enums.VariableType;

public class Value {
    public String name;
    public VariableType type;

    public Value(String name, VariableType type ){
        this.name = name;
        this.type = type;
    }
}