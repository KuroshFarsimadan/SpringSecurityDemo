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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for EpiBeneficiaryPartyDetailsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="EpiBeneficiaryPartyDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EpiNameAddressDetails" type="{}genericTokenType2_35" minOccurs="0"/>
 *         &lt;element name="EpiBei" type="{}genericNMtokenType8_11" minOccurs="0"/>
 *         &lt;element name="EpiAccountID" type="{}EpiAccountIDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EpiBeneficiaryPartyDetailsType", propOrder = {
		"epiNameAddressDetails", "epiBei", "epiAccountID" })
public class EpiBeneficiaryPartyDetailsType {

	@XmlElement(name = "EpiNameAddressDetails")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String epiNameAddressDetails;
	@XmlElement(name = "EpiBei")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String epiBei;
	@XmlElement(name = "EpiAccountID", required = true)
	protected EpiAccountIDType epiAccountID;

	/**
	 * Gets the value of the epiNameAddressDetails property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEpiNameAddressDetails() {
		return epiNameAddressDetails;
	}

	/**
	 * Sets the value of the epiNameAddressDetails property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEpiNameAddressDetails(String value) {
		this.epiNameAddressDetails = value;
	}

	/**
	 * Gets the value of the epiBei property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEpiBei() {
		return epiBei;
	}

	/**
	 * Sets the value of the epiBei property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEpiBei(String value) {
		this.epiBei = value;
	}

	/**
	 * Gets the value of the epiAccountID property.
	 * 
	 * @return possible object is {@link EpiAccountIDType }
	 * 
	 */
	public EpiAccountIDType getEpiAccountID() {
		return epiAccountID;
	}

	/**
	 * Sets the value of the epiAccountID property.
	 * 
	 * @param value
	 *            allowed object is {@link EpiAccountIDType }
	 * 
	 */
	public void setEpiAccountID(EpiAccountIDType value) {
		this.epiAccountID = value;
	}

}