package com.example.newhtmlproject.Model;

public class DTO {
    private String value_1;

    public DTO() {
    }

    public DTO(String value_1) {
        this.value_1 = value_1;
    }

    @Override
    public String toString() {
        return "DTO{" +
            "value_1='" + value_1 + '\'' +
            '}';
    }

    public String getValue_1() {
        return value_1;
    }

    public void setValue_1(String value_1) {
        this.value_1 = value_1;
    }

}
