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
 * Java class for BuyerPartyDetailsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerPartyDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuyerPartyIdentifier" type="{}genericStringType0_35" minOccurs="0"/>
 *         &lt;element name="BuyerOrganisationName" type="{}genericStringType2_70" maxOccurs="unbounded"/>
 *         &lt;element name="BuyerOrganisationDepartment" type="{}genericStringType0_35" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="BuyerOrganisationTaxCode" type="{}genericStringType0_35" minOccurs="0"/>
 *         &lt;element name="BuyerCode" type="{}PartyIdentifierType" minOccurs="0"/>
 *         &lt;element name="BuyerPostalAddressDetails" type="{}BuyerPostalAddressDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerPartyDetailsType", propOrder = { "buyerPartyIdentifier",
		"buyerOrganisationName", "buyerOrganisationDepartment",
		"buyerOrganisationTaxCode", "buyerCode", "buyerPostalAddressDetails" })
public class BuyerPartyDetailsType {

	@XmlElement(name = "BuyerPartyIdentifier")
	protected String buyerPartyIdentifier;
	@XmlElement(name = "BuyerOrganisationName", required = true)
	protected List<String> buyerOrganisationName;
	@XmlElement(name = "BuyerOrganisationDepartment")
	protected List<String> buyerOrganisationDepartment;
	@XmlElement(name = "BuyerOrganisationTaxCode")
	protected String buyerOrganisationTaxCode;
	@XmlElement(name = "BuyerCode")
	protected PartyIdentifierType buyerCode;
	@XmlElement(name = "BuyerPostalAddressDetails")
	protected BuyerPostalAddressDetailsType buyerPostalAddressDetails;

	/**
	 * Gets the value of the buyerPartyIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBuyerPartyIdentifier() {
		return buyerPartyIdentifier;
	}

	/**
	 * Sets the value of the buyerPartyIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBuyerPartyIdentifier(String value) {
		this.buyerPartyIdentifier = value;
	}

	/**
	 * Gets the value of the buyerOrganisationName property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the buyerOrganisationName property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getBuyerOrganisationName().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getBuyerOrganisationName() {
		if (buyerOrganisationName == null) {
			buyerOrganisationName = new ArrayList<String>();
		}
		return this.buyerOrganisationName;
	}

	/**
	 * Gets the value of the buyerOrganisationDepartment property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the buyerOrganisationDepartment property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getBuyerOrganisationDepartment().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getBuyerOrganisationDepartment() {
		if (buyerOrganisationDepartment == null) {
			buyerOrganisationDepartment = new ArrayList<String>();
		}
		return this.buyerOrganisationDepartment;
	}

	/**
	 * Gets the value of the buyerOrganisationTaxCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBuyerOrganisationTaxCode() {
		return buyerOrganisationTaxCode;
	}

	/**
	 * Sets the value of the buyerOrganisationTaxCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBuyerOrganisationTaxCode(String value) {
		this.buyerOrganisationTaxCode = value;
	}

	/**
	 * Gets the value of the buyerCode property.
	 * 
	 * @return possible object is {@link PartyIdentifierType }
	 * 
	 */
	public PartyIdentifierType getBuyerCode() {
		return buyerCode;
	}

	/**
	 * Sets the value of the buyerCode property.
	 * 
	 * @param value
	 *            allowed object is {@link PartyIdentifierType }
	 * 
	 */
	public void setBuyerCode(PartyIdentifierType value) {
		this.buyerCode = value;
	}

	/**
	 * Gets the value of the buyerPostalAddressDetails property.
	 * 
	 * @return possible object is {@link BuyerPostalAddressDetailsType }
	 * 
	 */
	public BuyerPostalAddressDetailsType getBuyerPostalAddressDetails() {
		return buyerPostalAddressDetails;
	}

	/**
	 * Sets the value of the buyerPostalAddressDetails property.
	 * 
	 * @param value
	 *            allowed object is {@link BuyerPostalAddressDetailsType }
	 * 
	 */
	public void setBuyerPostalAddressDetails(BuyerPostalAddressDetailsType value) {
		this.buyerPostalAddressDetails = value;
	}

}
