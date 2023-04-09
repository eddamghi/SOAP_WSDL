# SOAP_WSDL
This project is a web-based banking service implemented using Java and JAX-WS. It consists of two parts: a server-side application and a client-side application.

The server-side application contains three classes. The first class, Account, is a data model that represents a bank account with fields for the account code, balance, 
and creation date. The second class, BankService, is a web service that provides several methods for interacting with bank accounts. These methods include 
conversionEuroToDollar, which converts a given amount from Euros to Dollars; getAccount, which retrieves an account by its code; and getAccounts,
which retrieves a list of all accounts. The third class, ServerJaxWS, is responsible for publishing the BankService web service so that it
can be accessed by clients.

The client-side application, ClientJaxWS, contains two classes. The first class is a proxy file that is generated from the WSDL of the BankService web service. 
This proxy file provides an interface for calling the methods of the BankService. 
The second class, ClientWS, uses the proxy to call the conversionEuroToDollar and getAccount methods of the BankService.
<img width="1424" alt="SOAP_WSDL (1)" src="https://user-images.githubusercontent.com/60891109/230770961-a63f19f3-736e-463c-988f-f86a26fb2a32.png">

Overall, this project provides a simple yet functional example of how to implement a web-based banking service using Java and JAX-WS
