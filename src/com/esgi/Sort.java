package com.esgi;

public interface Sort<Abc> {

    void exec(Abc[] arr);
    void exec(Abc[] arr, boolean ascOrDesc);
}
