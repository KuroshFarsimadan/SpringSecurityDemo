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
 * Java class for EpiDetailsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="EpiDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EpiIdentificationDetails" type="{}EpiIdentificationDetailsType"/>
 *         &lt;element name="EpiPartyDetails" type="{}EpiPartyDetailsType"/>
 *         &lt;element name="EpiPaymentInstructionDetails" type="{}EpiPaymentInstructionDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EpiDetailsType", propOrder = { "epiIdentificationDetails",
		"epiPartyDetails", "epiPaymentInstructionDetails" })
public class EpiDetailsType {

	@XmlElement(name = "EpiIdentificationDetails", required = true)
	protected EpiIdentificationDetailsType epiIdentificationDetails;
	@XmlElement(name = "EpiPartyDetails", required = true)
	protected EpiPartyDetailsType epiPartyDetails;
	@XmlElement(name = "EpiPaymentInstructionDetails", required = true)
	protected EpiPaymentInstructionDetailsType epiPaymentInstructionDetails;

	/**
	 * Gets the value of the epiIdentificationDetails property.
	 * 
	 * @return possible object is {@link EpiIdentificationDetailsType }
	 * 
	 */
	public EpiIdentificationDetailsType getEpiIdentificationDetails() {
		return epiIdentificationDetails;
	}

	/**
	 * Sets the value of the epiIdentificationDetails property.
	 * 
	 * @param value
	 *            allowed object is {@link EpiIdentificationDetailsType }
	 * 
	 */
	public void setEpiIdentificationDetails(EpiIdentificationDetailsType value) {
		this.epiIdentificationDetails = value;
	}

	/**
	 * Gets the value of the epiPartyDetails property.
	 * 
	 * @return possible object is {@link EpiPartyDetailsType }
	 * 
	 */
	public EpiPartyDetailsType getEpiPartyDetails() {
		return epiPartyDetails;
	}

	/**
	 * Sets the value of the epiPartyDetails property.
	 * 
	 * @param value
	 *            allowed object is {@link EpiPartyDetailsType }
	 * 
	 */
	public void setEpiPartyDetails(EpiPartyDetailsType value) {
		this.epiPartyDetails = value;
	}

	/**
	 * Gets the value of the epiPaymentInstructionDetails property.
	 * 
	 * @return possible object is {@link EpiPaymentInstructionDetailsType }
	 * 
	 */
	public EpiPaymentInstructionDetailsType getEpiPaymentInstructionDetails() {
		return epiPaymentInstructionDetails;
	}

	/**
	 * Sets the value of the epiPaymentInstructionDetails property.
	 * 
	 * @param value
	 *            allowed object is {@link EpiPaymentInstructionDetailsType }
	 * 
	 */
	public void setEpiPaymentInstructionDetails(
			EpiPaymentInstructionDetailsType value) {
		this.epiPaymentInstructionDetails = value;
	}

}
