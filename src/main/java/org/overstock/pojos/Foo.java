package org.overstock.pojos;

public class Foo {

    public Foo(int field1, String field2, long field3){
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public Foo(){}

    public int field1 = 1;
    public String field2;
    public long field3;
    public String field4;

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public void setField3(long field3) {
        this.field3 = field3;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String toString(){
        return "{field1: " + field1 + ", field2: " + field2 + ", field3: " + field3 + ", field4: " + field4 + "}";
    }

}
