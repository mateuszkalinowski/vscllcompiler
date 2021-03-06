package pl.mateuszkalinowski.vscllcompiler.entities;

import pl.mateuszkalinowski.vscllcompiler.enums.VariableType;

public class Table {
    public String size;
    public VariableType type;
    public String address;
    public String scope;

    public Table(String size, VariableType type, String address, String scope) {
        this.size = size;
        this.type = type;
        this.address = address;
        this.scope = scope;
    }
}
