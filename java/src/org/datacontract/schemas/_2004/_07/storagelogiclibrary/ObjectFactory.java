
package org.datacontract.schemas._2004._07.storagelogiclibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.storagelogiclibrary package. 
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

    private final static QName _StoreProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/StorageLogicLibrary", "StoreProduct");
    private final static QName _CustomerProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/StorageLogicLibrary", "CustomerProduct");
    private final static QName _ArrayOfCustomerProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/StorageLogicLibrary", "ArrayOfCustomerProduct");
    private final static QName _ArrayOfStoreProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/StorageLogicLibrary", "ArrayOfStoreProduct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.storagelogiclibrary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfStoreProduct }
     * 
     */
    public ArrayOfStoreProduct createArrayOfStoreProduct() {
        return new ArrayOfStoreProduct();
    }

    /**
     * Create an instance of {@link ArrayOfCustomerProduct }
     * 
     */
    public ArrayOfCustomerProduct createArrayOfCustomerProduct() {
        return new ArrayOfCustomerProduct();
    }

    /**
     * Create an instance of {@link StoreProduct }
     * 
     */
    public StoreProduct createStoreProduct() {
        return new StoreProduct();
    }

    /**
     * Create an instance of {@link CustomerProduct }
     * 
     */
    public CustomerProduct createCustomerProduct() {
        return new CustomerProduct();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StorageLogicLibrary", name = "StoreProduct")
    public JAXBElement<StoreProduct> createStoreProduct(StoreProduct value) {
        return new JAXBElement<StoreProduct>(_StoreProduct_QNAME, StoreProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StorageLogicLibrary", name = "CustomerProduct")
    public JAXBElement<CustomerProduct> createCustomerProduct(CustomerProduct value) {
        return new JAXBElement<CustomerProduct>(_CustomerProduct_QNAME, CustomerProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StorageLogicLibrary", name = "ArrayOfCustomerProduct")
    public JAXBElement<ArrayOfCustomerProduct> createArrayOfCustomerProduct(ArrayOfCustomerProduct value) {
        return new JAXBElement<ArrayOfCustomerProduct>(_ArrayOfCustomerProduct_QNAME, ArrayOfCustomerProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStoreProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StorageLogicLibrary", name = "ArrayOfStoreProduct")
    public JAXBElement<ArrayOfStoreProduct> createArrayOfStoreProduct(ArrayOfStoreProduct value) {
        return new JAXBElement<ArrayOfStoreProduct>(_ArrayOfStoreProduct_QNAME, ArrayOfStoreProduct.class, null, value);
    }

}
