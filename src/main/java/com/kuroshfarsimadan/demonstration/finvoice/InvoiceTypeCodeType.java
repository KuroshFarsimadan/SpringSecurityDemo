//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.26 at 10:26:42 ap. EET 
//

package com.kuroshfarsimadan.demonstration.finvoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for InvoiceTypeCodeType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceTypeCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>InvoiceTypeCodePattern">
 *       &lt;attribute name="CodeListAgencyIdentifier">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="SPY"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceTypeCodeType", propOrder = { "value" })
public class InvoiceTypeCodeType {

	@XmlValue
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String value;
	@XmlAttribute(name = "CodeListAgencyIdentifier")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String codeListAgencyIdentifier;

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the codeListAgencyIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodeListAgencyIdentifier() {
		return codeListAgencyIdentifier;
	}

	/**
	 * Sets the value of the codeListAgencyIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodeListAgencyIdentifier(String value) {
		this.codeListAgencyIdentifier = value;
	}

}