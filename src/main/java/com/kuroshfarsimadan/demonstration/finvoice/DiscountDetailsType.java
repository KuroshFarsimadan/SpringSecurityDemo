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
 * Java class for DiscountDetailsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FreeText" type="{}genericStringType1_70" minOccurs="0"/>
 *         &lt;element name="Percent" type="{}percentage" minOccurs="0"/>
 *         &lt;element name="Amount" type="{}amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountDetailsType", propOrder = { "freeText", "percent",
		"amount" })
public class DiscountDetailsType {

	@XmlElement(name = "FreeText")
	protected String freeText;
	@XmlElement(name = "Percent")
	protected String percent;
	@XmlElement(name = "Amount")
	protected Amount amount;

	/**
	 * Gets the value of the freeText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFreeText() {
		return freeText;
	}

	/**
	 * Sets the value of the freeText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFreeText(String value) {
		this.freeText = value;
	}

	/**
	 * Gets the value of the percent property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPercent() {
		return percent;
	}

	/**
	 * Sets the value of the percent property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPercent(String value) {
		this.percent = value;
	}

	/**
	 * Gets the value of the amount property.
	 * 
	 * @return possible object is {@link Amount }
	 * 
	 */
	public Amount getAmount() {
		return amount;
	}

	/**
	 * Sets the value of the amount property.
	 * 
	 * @param value
	 *            allowed object is {@link Amount }
	 * 
	 */
	public void setAmount(Amount value) {
		this.amount = value;
	}

}
