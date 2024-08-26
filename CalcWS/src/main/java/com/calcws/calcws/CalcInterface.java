package com.calcws.calcws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface CalcInterface {
    @WebMethod
    int add(int num1, int num2);
}
