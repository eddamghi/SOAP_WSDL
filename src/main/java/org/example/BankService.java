package org.example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

// POJO - Plain Old Java Object
@WebService(serviceName = "BankService")
public class BankService {

    @WebMethod(operationName = "conversionEuroToDollar")
    public double conversion( @WebParam(name = "amount") double amount) {
        return amount * 0.8;
    }

    @WebMethod(operationName = "getAccount")
    public Account getAccount(@WebParam(name = "code") int code) {
        return new Account(code, 1000, new Date());
    }
    @WebMethod(operationName = "getAccounts")
    public List<Account> getAccounts() {
        return Arrays.asList(
                new Account(1, 1000, new Date()),
                new Account(2, 2000, new Date()),
                new Account(3, 3000, new Date())
        );
    }
}
