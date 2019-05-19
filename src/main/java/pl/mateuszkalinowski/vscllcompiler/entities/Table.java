package pl.mateuszkalinowski.vscllcompiler.entities;

import pl.mateuszkalinowski.vscllcompiler.enums.VariableType;

public class Table {
    public String size;
    public VariableType type;

    public Table(String size, VariableType type) {
        this.size = size;
        this.type = type;
    }
}
