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
 * Java class for CustomsInfoType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CNCode" type="{}genericStringType1_8" minOccurs="0"/>
 *         &lt;element name="CNName" type="{}genericStringType1_35" minOccurs="0"/>
 *         &lt;element name="CNOriginCountryCode" type="{}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="CNOriginCountryName" type="{}genericStringType1_35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsInfoType", propOrder = { "cnCode", "cnName",
		"cnOriginCountryCode", "cnOriginCountryName" })
public class CustomsInfoType {

	@XmlElement(name = "CNCode")
	protected String cnCode;
	@XmlElement(name = "CNName")
	protected String cnName;
	@XmlElement(name = "CNOriginCountryCode")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String cnOriginCountryCode;
	@XmlElement(name = "CNOriginCountryName")
	protected String cnOriginCountryName;

	/**
	 * Gets the value of the cnCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCNCode() {
		return cnCode;
	}

	/**
	 * Sets the value of the cnCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCNCode(String value) {
		this.cnCode = value;
	}

	/**
	 * Gets the value of the cnName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCNName() {
		return cnName;
	}

	/**
	 * Sets the value of the cnName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCNName(String value) {
		this.cnName = value;
	}

	/**
	 * Gets the value of the cnOriginCountryCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCNOriginCountryCode() {
		return cnOriginCountryCode;
	}

	/**
	 * Sets the value of the cnOriginCountryCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCNOriginCountryCode(String value) {
		this.cnOriginCountryCode = value;
	}

	/**
	 * Gets the value of the cnOriginCountryName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCNOriginCountryName() {
		return cnOriginCountryName;
	}

	/**
	 * Sets the value of the cnOriginCountryName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCNOriginCountryName(String value) {
		this.cnOriginCountryName = value;
	}

}
