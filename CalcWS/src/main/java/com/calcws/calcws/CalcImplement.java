package com.calcws.calcws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class CalcImplement implements CalcInterface {
    @WebMethod
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
