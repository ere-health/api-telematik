//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 11:29:34 AM CEST 
//


package de.gematik.ws.fa.vsdm.vsd.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Wohnsitzlaendercode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandType", propOrder = {
    "wohnsitzlaendercode"
})
public class LandType {

    @XmlElement(name = "Wohnsitzlaendercode", required = true)
    protected String wohnsitzlaendercode;

    /**
     * Gets the value of the wohnsitzlaendercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWohnsitzlaendercode() {
        return wohnsitzlaendercode;
    }

    /**
     * Sets the value of the wohnsitzlaendercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnsitzlaendercode(String value) {
        this.wohnsitzlaendercode = value;
    }

}
