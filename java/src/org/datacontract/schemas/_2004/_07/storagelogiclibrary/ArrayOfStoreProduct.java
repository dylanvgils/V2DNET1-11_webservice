
package org.datacontract.schemas._2004._07.storagelogiclibrary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStoreProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStoreProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StoreProduct" type="{http://schemas.datacontract.org/2004/07/StorageLogicLibrary}StoreProduct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStoreProduct", propOrder = {
    "storeProduct"
})
public class ArrayOfStoreProduct {

    @XmlElement(name = "StoreProduct", nillable = true)
    protected List<StoreProduct> storeProduct;

    /**
     * Gets the value of the storeProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreProduct }
     * 
     * 
     */
    public List<StoreProduct> getStoreProduct() {
        if (storeProduct == null) {
            storeProduct = new ArrayList<StoreProduct>();
        }
        return this.storeProduct;
    }

}
