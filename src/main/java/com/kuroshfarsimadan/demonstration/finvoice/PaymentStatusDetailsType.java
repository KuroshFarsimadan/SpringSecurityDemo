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
 * Java class for PaymentStatusDetailsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentStatusDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentStatusCode" type="{}PaymentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="PaymentMethodText" type="{}genericStringType0_35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusDetailsType", propOrder = { "paymentStatusCode",
		"paymentMethodText" })
public class PaymentStatusDetailsType {

	@XmlElement(name = "PaymentStatusCode")
	protected PaymentStatusCodeType paymentStatusCode;
	@XmlElement(name = "PaymentMethodText")
	protected String paymentMethodText;

	/**
	 * Gets the value of the paymentStatusCode property.
	 * 
	 * @return possible object is {@link PaymentStatusCodeType }
	 * 
	 */
	public PaymentStatusCodeType getPaymentStatusCode() {
		return paymentStatusCode;
	}

	/**
	 * Sets the value of the paymentStatusCode property.
	 * 
	 * @param value
	 *            allowed object is {@link PaymentStatusCodeType }
	 * 
	 */
	public void setPaymentStatusCode(PaymentStatusCodeType value) {
		this.paymentStatusCode = value;
	}

	/**
	 * Gets the value of the paymentMethodText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPaymentMethodText() {
		return paymentMethodText;
	}

	/**
	 * Sets the value of the paymentMethodText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPaymentMethodText(String value) {
		this.paymentMethodText = value;
	}

}
