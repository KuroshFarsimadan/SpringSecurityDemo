//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.26 at 10:26:42 ap. EET 
//

package com.kuroshfarsimadan.demonstration.finvoice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for VatSpecificationDetailsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="VatSpecificationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VatBaseAmount" type="{}amount" minOccurs="0"/>
 *         &lt;element name="VatRatePercent" type="{}percentage" minOccurs="0"/>
 *         &lt;element name="VatCode" type="{}genericStringType0_10" minOccurs="0"/>
 *         &lt;element name="VatRateAmount" type="{}amount" minOccurs="0"/>
 *         &lt;element name="VatFreeText" type="{}genericStringType0_70" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VatSpecificationDetailsType", propOrder = { "vatBaseAmount",
		"vatRatePercent", "vatCode", "vatRateAmount", "vatFreeText" })
public class VatSpecificationDetailsType {

	@XmlElement(name = "VatBaseAmount")
	protected Amount vatBaseAmount;
	@XmlElement(name = "VatRatePercent")
	protected String vatRatePercent;
	@XmlElement(name = "VatCode")
	protected String vatCode;
	@XmlElement(name = "VatRateAmount")
	protected Amount vatRateAmount;
	@XmlElement(name = "VatFreeText")
	protected List<String> vatFreeText;

	/**
	 * Gets the value of the vatBaseAmount property.
	 * 
	 * @return possible object is {@link Amount }
	 * 
	 */
	public Amount getVatBaseAmount() {
		return vatBaseAmount;
	}

	/**
	 * Sets the value of the vatBaseAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link Amount }
	 * 
	 */
	public void setVatBaseAmount(Amount value) {
		this.vatBaseAmount = value;
	}

	/**
	 * Gets the value of the vatRatePercent property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVatRatePercent() {
		return vatRatePercent;
	}

	/**
	 * Sets the value of the vatRatePercent property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVatRatePercent(String value) {
		this.vatRatePercent = value;
	}

	/**
	 * Gets the value of the vatCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVatCode() {
		return vatCode;
	}

	/**
	 * Sets the value of the vatCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVatCode(String value) {
		this.vatCode = value;
	}

	/**
	 * Gets the value of the vatRateAmount property.
	 * 
	 * @return possible object is {@link Amount }
	 * 
	 */
	public Amount getVatRateAmount() {
		return vatRateAmount;
	}

	/**
	 * Sets the value of the vatRateAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link Amount }
	 * 
	 */
	public void setVatRateAmount(Amount value) {
		this.vatRateAmount = value;
	}

	/**
	 * Gets the value of the vatFreeText property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the vatFreeText property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getVatFreeText().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getVatFreeText() {
		if (vatFreeText == null) {
			vatFreeText = new ArrayList<String>();
		}
		return this.vatFreeText;
	}

}
