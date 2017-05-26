
package org.tempuri;

import org.datacontract.schemas._2004._07.storagelogiclibrary.ArrayOfCustomerProduct;
import org.datacontract.schemas._2004._07.storagelogiclibrary.ArrayOfStoreProduct;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckLoginPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _CheckLoginUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _GetProductsResponseGetProductsResult_QNAME = new QName("http://tempuri.org/", "GetProductsResult");
    private final static QName _GetAllOrdersResponseGetAllOrdersResult_QNAME = new QName("http://tempuri.org/", "GetAllOrdersResult");
    private final static QName _RegisterResponseRegisterResult_QNAME = new QName("http://tempuri.org/", "RegisterResult");
    private final static QName _BuyProductProductName_QNAME = new QName("http://tempuri.org/", "productName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuyProductResponse }
     * 
     */
    public BuyProductResponse createBuyProductResponse() {
        return new BuyProductResponse();
    }

    /**
     * Create an instance of {@link CheckLoginResponse }
     * 
     */
    public CheckLoginResponse createCheckLoginResponse() {
        return new CheckLoginResponse();
    }

    /**
     * Create an instance of {@link GetBalance }
     * 
     */
    public GetBalance createGetBalance() {
        return new GetBalance();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link BuyProduct }
     * 
     */
    public BuyProduct createBuyProduct() {
        return new BuyProduct();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link GetBalanceResponse }
     * 
     */
    public GetBalanceResponse createGetBalanceResponse() {
        return new GetBalanceResponse();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetAllOrders }
     * 
     */
    public GetAllOrders createGetAllOrders() {
        return new GetAllOrders();
    }

    /**
     * Create an instance of {@link CheckLogin }
     * 
     */
    public CheckLogin createCheckLogin() {
        return new CheckLogin();
    }

    /**
     * Create an instance of {@link GetAllOrdersResponse }
     * 
     */
    public GetAllOrdersResponse createGetAllOrdersResponse() {
        return new GetAllOrdersResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = CheckLogin.class)
    public JAXBElement<String> createCheckLoginPassword(String value) {
        return new JAXBElement<String>(_CheckLoginPassword_QNAME, String.class, CheckLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = CheckLogin.class)
    public JAXBElement<String> createCheckLoginUsername(String value) {
        return new JAXBElement<String>(_CheckLoginUsername_QNAME, String.class, CheckLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStoreProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProductsResult", scope = GetProductsResponse.class)
    public JAXBElement<ArrayOfStoreProduct> createGetProductsResponseGetProductsResult(ArrayOfStoreProduct value) {
        return new JAXBElement<ArrayOfStoreProduct>(_GetProductsResponseGetProductsResult_QNAME, ArrayOfStoreProduct.class, GetProductsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllOrdersResult", scope = GetAllOrdersResponse.class)
    public JAXBElement<ArrayOfCustomerProduct> createGetAllOrdersResponseGetAllOrdersResult(ArrayOfCustomerProduct value) {
        return new JAXBElement<ArrayOfCustomerProduct>(_GetAllOrdersResponseGetAllOrdersResult_QNAME, ArrayOfCustomerProduct.class, GetAllOrdersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterResult", scope = RegisterResponse.class)
    public JAXBElement<String> createRegisterResponseRegisterResult(String value) {
        return new JAXBElement<String>(_RegisterResponseRegisterResult_QNAME, String.class, RegisterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = GetAllOrders.class)
    public JAXBElement<String> createGetAllOrdersUsername(String value) {
        return new JAXBElement<String>(_CheckLoginUsername_QNAME, String.class, GetAllOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = GetBalance.class)
    public JAXBElement<String> createGetBalanceUsername(String value) {
        return new JAXBElement<String>(_CheckLoginUsername_QNAME, String.class, GetBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = BuyProduct.class)
    public JAXBElement<String> createBuyProductUsername(String value) {
        return new JAXBElement<String>(_CheckLoginUsername_QNAME, String.class, BuyProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "productName", scope = BuyProduct.class)
    public JAXBElement<String> createBuyProductProductName(String value) {
        return new JAXBElement<String>(_BuyProductProductName_QNAME, String.class, BuyProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = Register.class)
    public JAXBElement<String> createRegisterUsername(String value) {
        return new JAXBElement<String>(_CheckLoginUsername_QNAME, String.class, Register.class, value);
    }

}
