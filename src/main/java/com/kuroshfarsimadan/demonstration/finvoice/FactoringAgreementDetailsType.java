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
 * Java class for FactoringAgreementDetailsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="FactoringAgreementDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FactoringAgreementIdentifier" type="{}genericStringType0_35"/>
 *         &lt;element name="TransmissionListIdentifier" type="{}genericStringType0_35" minOccurs="0"/>
 *         &lt;element name="EndorsementClauseCode" type="{}genericStringType0_35" minOccurs="0"/>
 *         &lt;element name="FactoringTypeCode" type="{}genericStringType0_35" minOccurs="0"/>
 *         &lt;element name="FactoringFreeText" type="{}genericStringType0_70" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FactoringPartyIdentifier" type="{}genericStringType0_35" minOccurs="0"/>
 *         &lt;element name="FactoringPartyName" type="{}genericStringType0_35" minOccurs="0"/>
 *         &lt;element name="FactoringPartyPostalAddressDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FactoringPartyStreetName" type="{}genericStringType2_35" maxOccurs="3"/>
 *                   &lt;element name="FactoringPartyTownName" type="{}genericStringType2_35"/>
 *                   &lt;element name="FactoringPartyPostCodeIdentifier" type="{}genericStringType2_35"/>
 *                   &lt;element name="CountryCode" type="{}CountryCodeType" minOccurs="0"/>
 *                   &lt;element name="CountryName" type="{}genericStringType0_35" minOccurs="0"/>
 *                   &lt;element name="FactoringPartyPostOfficeBoxIdentifier" type="{}genericStringType0_35" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "FactoringAgreementDetailsType", propOrder = {
		"factoringAgreementIdentifier", "transmissionListIdentifier",
		"endorsementClauseCode", "factoringTypeCode", "factoringFreeText",
		"factoringPartyIdentifier", "factoringPartyName",
		"factoringPartyPostalAddressDetails" })
public class FactoringAgreementDetailsType {

	@XmlElement(name = "FactoringAgreementIdentifier", required = true)
	protected String factoringAgreementIdentifier;
	@XmlElement(name = "TransmissionListIdentifier")
	protected String transmissionListIdentifier;
	@XmlElement(name = "EndorsementClauseCode")
	protected String endorsementClauseCode;
	@XmlElement(name = "FactoringTypeCode")
	protected String factoringTypeCode;
	@XmlElement(name = "FactoringFreeText")
	protected List<String> factoringFreeText;
	@XmlElement(name = "FactoringPartyIdentifier")
	protected String factoringPartyIdentifier;
	@XmlElement(name = "FactoringPartyName")
	protected String factoringPartyName;
	@XmlElement(name = "FactoringPartyPostalAddressDetails")
	protected FactoringAgreementDetailsType.FactoringPartyPostalAddressDetails factoringPartyPostalAddressDetails;

	/**
	 * Gets the value of the factoringAgreementIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFactoringAgreementIdentifier() {
		return factoringAgreementIdentifier;
	}

	/**
	 * Sets the value of the factoringAgreementIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFactoringAgreementIdentifier(String value) {
		this.factoringAgreementIdentifier = value;
	}

	/**
	 * Gets the value of the transmissionListIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransmissionListIdentifier() {
		return transmissionListIdentifier;
	}

	/**
	 * Sets the value of the transmissionListIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransmissionListIdentifier(String value) {
		this.transmissionListIdentifier = value;
	}

	/**
	 * Gets the value of the endorsementClauseCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEndorsementClauseCode() {
		return endorsementClauseCode;
	}

	/**
	 * Sets the value of the endorsementClauseCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEndorsementClauseCode(String value) {
		this.endorsementClauseCode = value;
	}

	/**
	 * Gets the value of the factoringTypeCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFactoringTypeCode() {
		return factoringTypeCode;
	}

	/**
	 * Sets the value of the factoringTypeCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFactoringTypeCode(String value) {
		this.factoringTypeCode = value;
	}

	/**
	 * Gets the value of the factoringFreeText property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the factoringFreeText property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFactoringFreeText().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getFactoringFreeText() {
		if (factoringFreeText == null) {
			factoringFreeText = new ArrayList<String>();
		}
		return this.factoringFreeText;
	}

	/**
	 * Gets the value of the factoringPartyIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFactoringPartyIdentifier() {
		return factoringPartyIdentifier;
	}

	/**
	 * Sets the value of the factoringPartyIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFactoringPartyIdentifier(String value) {
		this.factoringPartyIdentifier = value;
	}

	/**
	 * Gets the value of the factoringPartyName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFactoringPartyName() {
		return factoringPartyName;
	}

	/**
	 * Sets the value of the factoringPartyName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFactoringPartyName(String value) {
		this.factoringPartyName = value;
	}

	/**
	 * Gets the value of the factoringPartyPostalAddressDetails property.
	 * 
	 * @return possible object is
	 *         {@link FactoringAgreementDetailsType.FactoringPartyPostalAddressDetails }
	 * 
	 */
	public FactoringAgreementDetailsType.FactoringPartyPostalAddressDetails getFactoringPartyPostalAddressDetails() {
		return factoringPartyPostalAddressDetails;
	}

	/**
	 * Sets the value of the factoringPartyPostalAddressDetails property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link FactoringAgreementDetailsType.FactoringPartyPostalAddressDetails }
	 * 
	 */
	public void setFactoringPartyPostalAddressDetails(
			FactoringAgreementDetailsType.FactoringPartyPostalAddressDetails value) {
		this.factoringPartyPostalAddressDetails = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="FactoringPartyStreetName" type="{}genericStringType2_35" maxOccurs="3"/>
	 *         &lt;element name="FactoringPartyTownName" type="{}genericStringType2_35"/>
	 *         &lt;element name="FactoringPartyPostCodeIdentifier" type="{}genericStringType2_35"/>
	 *         &lt;element name="CountryCode" type="{}CountryCodeType" minOccurs="0"/>
	 *         &lt;element name="CountryName" type="{}genericStringType0_35" minOccurs="0"/>
	 *         &lt;element name="FactoringPartyPostOfficeBoxIdentifier" type="{}genericStringType0_35" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "factoringPartyStreetName",
			"factoringPartyTownName", "factoringPartyPostCodeIdentifier",
			"countryCode", "countryName",
			"factoringPartyPostOfficeBoxIdentifier" })
	public static class FactoringPartyPostalAddressDetails {

		@XmlElement(name = "FactoringPartyStreetName", required = true)
		protected List<String> factoringPartyStreetName;
		@XmlElement(name = "FactoringPartyTownName", required = true)
		protected String factoringPartyTownName;
		@XmlElement(name = "FactoringPartyPostCodeIdentifier", required = true)
		protected String factoringPartyPostCodeIdentifier;
		@XmlElement(name = "CountryCode")
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		protected String countryCode;
		@XmlElement(name = "CountryName")
		protected String countryName;
		@XmlElement(name = "FactoringPartyPostOfficeBoxIdentifier")
		protected String factoringPartyPostOfficeBoxIdentifier;

		/**
		 * Gets the value of the factoringPartyStreetName property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the factoringPartyStreetName property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getFactoringPartyStreetName().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link String }
		 * 
		 * 
		 */
		public List<String> getFactoringPartyStreetName() {
			if (factoringPartyStreetName == null) {
				factoringPartyStreetName = new ArrayList<String>();
			}
			return this.factoringPartyStreetName;
		}

		/**
		 * Gets the value of the factoringPartyTownName property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getFactoringPartyTownName() {
			return factoringPartyTownName;
		}

		/**
		 * Sets the value of the factoringPartyTownName property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setFactoringPartyTownName(String value) {
			this.factoringPartyTownName = value;
		}

		/**
		 * Gets the value of the factoringPartyPostCodeIdentifier property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getFactoringPartyPostCodeIdentifier() {
			return factoringPartyPostCodeIdentifier;
		}

		/**
		 * Sets the value of the factoringPartyPostCodeIdentifier property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setFactoringPartyPostCodeIdentifier(String value) {
			this.factoringPartyPostCodeIdentifier = value;
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
		 * Gets the value of the factoringPartyPostOfficeBoxIdentifier property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getFactoringPartyPostOfficeBoxIdentifier() {
			return factoringPartyPostOfficeBoxIdentifier;
		}

		/**
		 * Sets the value of the factoringPartyPostOfficeBoxIdentifier property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setFactoringPartyPostOfficeBoxIdentifier(String value) {
			this.factoringPartyPostOfficeBoxIdentifier = value;
		}

	}

}
