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
 * Java class for AttachmentMessageDetailsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentMessageDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentMessageIdentifier" type="{}genericStringType15_61"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentMessageDetailsType", propOrder = { "attachmentMessageIdentifier" })
public class AttachmentMessageDetailsType {

	@XmlElement(name = "AttachmentMessageIdentifier", required = true)
	protected String attachmentMessageIdentifier;

	/**
	 * Gets the value of the attachmentMessageIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAttachmentMessageIdentifier() {
		return attachmentMessageIdentifier;
	}

	/**
	 * Sets the value of the attachmentMessageIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAttachmentMessageIdentifier(String value) {
		this.attachmentMessageIdentifier = value;
	}

}
