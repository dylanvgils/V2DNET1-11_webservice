
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.storagelogiclibrary.ArrayOfCustomerProduct;
import org.datacontract.schemas._2004._07.storagelogiclibrary.ArrayOfStoreProduct;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IStoreService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.storagelogiclibrary.ObjectFactory.class,
    org.datacontract.schemas._2004._07.storelogiclibrary.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface IStoreService {


    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "CheckLogin", action = "http://tempuri.org/IStoreService/CheckLogin")
    @WebResult(name = "CheckLoginResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CheckLogin", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CheckLogin")
    @ResponseWrapper(localName = "CheckLoginResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CheckLoginResponse")
    public Boolean checkLogin(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        String password);

    /**
     * 
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Register", action = "http://tempuri.org/IStoreService/Register")
    @WebResult(name = "RegisterResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Register", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Register")
    @ResponseWrapper(localName = "RegisterResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RegisterResponse")
    public String register(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

    /**
     * 
     * @return
     *     returns org.datacontract.schemas._2004._07.storagelogiclibrary.ArrayOfStoreProduct
     */
    @WebMethod(operationName = "GetProducts", action = "http://tempuri.org/IStoreService/GetProducts")
    @WebResult(name = "GetProductsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetProducts", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProducts")
    @ResponseWrapper(localName = "GetProductsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProductsResponse")
    public ArrayOfStoreProduct getProducts();

    /**
     * 
     * @param quantity
     * @param productName
     * @param username
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "BuyProduct", action = "http://tempuri.org/IStoreService/BuyProduct")
    @WebResult(name = "BuyProductResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "BuyProduct", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuyProduct")
    @ResponseWrapper(localName = "BuyProductResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuyProductResponse")
    public Boolean buyProduct(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "productName", targetNamespace = "http://tempuri.org/")
        String productName,
        @WebParam(name = "quantity", targetNamespace = "http://tempuri.org/")
        Integer quantity);

    /**
     * 
     * @param username
     * @return
     *     returns org.datacontract.schemas._2004._07.storagelogiclibrary.ArrayOfCustomerProduct
     */
    @WebMethod(operationName = "GetAllOrders", action = "http://tempuri.org/IStoreService/GetAllOrders")
    @WebResult(name = "GetAllOrdersResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetAllOrders", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAllOrders")
    @ResponseWrapper(localName = "GetAllOrdersResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAllOrdersResponse")
    public ArrayOfCustomerProduct getAllOrders(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

    /**
     * 
     * @param username
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "GetBalance", action = "http://tempuri.org/IStoreService/GetBalance")
    @WebResult(name = "GetBalanceResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetBalance", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetBalance")
    @ResponseWrapper(localName = "GetBalanceResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetBalanceResponse")
    public Double getBalance(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

}
