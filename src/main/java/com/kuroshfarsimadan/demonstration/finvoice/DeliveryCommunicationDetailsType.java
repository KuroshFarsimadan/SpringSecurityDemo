//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.26 at 10:26:42 ap. EET 
//

package com.kuroshfarsimadan.demonstration.finvoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DeliveryCommunicationDetailsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryCommunicationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryPhoneNumberIdentifier" type="{}genericStringType0_35" minOccurs="0"/>
 *         &lt;element name="DeliveryEmailaddressIdentifier" type="{}genericStringType0_70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryCommunicationDetailsType", propOrder = {
		"deliveryPhoneNumberIdentifier", "deliveryEmailaddressIdentifier" })
public class DeliveryCommunicationDetailsType {

	@XmlElement(name = "DeliveryPhoneNumberIdentifier")
	protected String deliveryPhoneNumberIdentifier;
	@XmlElement(name = "DeliveryEmailaddressIdentifier")
	protected String deliveryEmailaddressIdentifier;

	/**
	 * Gets the value of the deliveryPhoneNumberIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeliveryPhoneNumberIdentifier() {
		return deliveryPhoneNumberIdentifier;
	}

	/**
	 * Sets the value of the deliveryPhoneNumberIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDeliveryPhoneNumberIdentifier(String value) {
		this.deliveryPhoneNumberIdentifier = value;
	}

	/**
	 * Gets the value of the deliveryEmailaddressIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeliveryEmailaddressIdentifier() {
		return deliveryEmailaddressIdentifier;
	}

	/**
	 * Sets the value of the deliveryEmailaddressIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDeliveryEmailaddressIdentifier(String value) {
		this.deliveryEmailaddressIdentifier = value;
	}

}