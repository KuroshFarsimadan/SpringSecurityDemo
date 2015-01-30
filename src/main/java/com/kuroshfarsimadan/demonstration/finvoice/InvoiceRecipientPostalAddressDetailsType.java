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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for InvoiceRecipientPostalAddressDetailsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceRecipientPostalAddressDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceRecipientStreetName" type="{}genericStringType2_35" maxOccurs="3"/>
 *         &lt;element name="InvoiceRecipientTownName" type="{}genericStringType2_35"/>
 *         &lt;element name="InvoiceRecipientPostCodeIdentifier" type="{}genericStringType2_35"/>
 *         &lt;element name="CountryCode" type="{}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{}genericStringType0_35" minOccurs="0"/>
 *         &lt;element name="InvoiceRecipientPostOfficeBoxIdentifier" type="{}genericStringType0_35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceRecipientPostalAddressDetailsType", propOrder = {
		"invoiceRecipientStreetName", "invoiceRecipientTownName",
		"invoiceRecipientPostCodeIdentifier", "countryCode", "countryName",
		"invoiceRecipientPostOfficeBoxIdentifier" })
public class InvoiceRecipientPostalAddressDetailsType {

	@XmlElement(name = "InvoiceRecipientStreetName", required = true)
	protected List<String> invoiceRecipientStreetName;
	@XmlElement(name = "InvoiceRecipientTownName", required = true)
	protected String invoiceRecipientTownName;
	@XmlElement(name = "InvoiceRecipientPostCodeIdentifier", required = true)
	protected String invoiceRecipientPostCodeIdentifier;
	@XmlElement(name = "CountryCode")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String countryCode;
	@XmlElement(name = "CountryName")
	protected String countryName;
	@XmlElement(name = "InvoiceRecipientPostOfficeBoxIdentifier")
	protected String invoiceRecipientPostOfficeBoxIdentifier;

	/**
	 * Gets the value of the invoiceRecipientStreetName property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the invoiceRecipientStreetName property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getInvoiceRecipientStreetName().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getInvoiceRecipientStreetName() {
		if (invoiceRecipientStreetName == null) {
			invoiceRecipientStreetName = new ArrayList<String>();
		}
		return this.invoiceRecipientStreetName;
	}

	/**
	 * Gets the value of the invoiceRecipientTownName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceRecipientTownName() {
		return invoiceRecipientTownName;
	}

	/**
	 * Sets the value of the invoiceRecipientTownName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInvoiceRecipientTownName(String value) {
		this.invoiceRecipientTownName = value;
	}

	/**
	 * Gets the value of the invoiceRecipientPostCodeIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceRecipientPostCodeIdentifier() {
		return invoiceRecipientPostCodeIdentifier;
	}

	/**
	 * Sets the value of the invoiceRecipientPostCodeIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInvoiceRecipientPostCodeIdentifier(String value) {
		this.invoiceRecipientPostCodeIdentifier = value;
	}

	/**
	 * Gets the value of the countryCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the value of the countryCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	/**
	 * Gets the value of the countryName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * Sets the value of the countryName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountryName(String value) {
		this.countryName = value;
	}

	/**
	 * Gets the value of the invoiceRecipientPostOfficeBoxIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceRecipientPostOfficeBoxIdentifier() {
		return invoiceRecipientPostOfficeBoxIdentifier;
	}

	/**
	 * Sets the value of the invoiceRecipientPostOfficeBoxIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInvoiceRecipientPostOfficeBoxIdentifier(String value) {
		this.invoiceRecipientPostOfficeBoxIdentifier = value;
	}

}
