
package org.tempuri;

import org.datacontract.schemas._2004._07.storagelogiclibrary.ArrayOfCustomerProduct;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetAllOrdersResult" type="{http://schemas.datacontract.org/2004/07/StorageLogicLibrary}ArrayOfCustomerProduct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAllOrdersResult"
})
@XmlRootElement(name = "GetAllOrdersResponse")
public class GetAllOrdersResponse {

    @XmlElementRef(name = "GetAllOrdersResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomerProduct> getAllOrdersResult;

    /**
     * Gets the value of the getAllOrdersResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerProduct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomerProduct> getGetAllOrdersResult() {
        return getAllOrdersResult;
    }

    /**
     * Sets the value of the getAllOrdersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerProduct }{@code >}
     *     
     */
    public void setGetAllOrdersResult(JAXBElement<ArrayOfCustomerProduct> value) {
        this.getAllOrdersResult = value;
    }

}
