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
 * Java class for PaymentOverDueFineDetailsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentOverDueFineDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentOverDueFineFreeText" type="{}genericStringType0_70" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="PaymentOverDueFinePercent" type="{}percentage" minOccurs="0"/>
 *         &lt;element name="PaymentOverDueFixedAmount" type="{}amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentOverDueFineDetailsType", propOrder = {
		"paymentOverDueFineFreeText", "paymentOverDueFinePercent",
		"paymentOverDueFixedAmount" })
public class PaymentOverDueFineDetailsType {

	@XmlElement(name = "PaymentOverDueFineFreeText")
	protected List<String> paymentOverDueFineFreeText;
	@XmlElement(name = "PaymentOverDueFinePercent")
	protected String paymentOverDueFinePercent;
	@XmlElement(name = "PaymentOverDueFixedAmount")
	protected Amount paymentOverDueFixedAmount;

	/**
	 * Gets the value of the paymentOverDueFineFreeText property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the paymentOverDueFineFreeText property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPaymentOverDueFineFreeText().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getPaymentOverDueFineFreeText() {
		if (paymentOverDueFineFreeText == null) {
			paymentOverDueFineFreeText = new ArrayList<String>();
		}
		return this.paymentOverDueFineFreeText;
	}

	/**
	 * Gets the value of the paymentOverDueFinePercent property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPaymentOverDueFinePercent() {
		return paymentOverDueFinePercent;
	}

	/**
	 * Sets the value of the paymentOverDueFinePercent property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPaymentOverDueFinePercent(String value) {
		this.paymentOverDueFinePercent = value;
	}

	/**
	 * Gets the value of the paymentOverDueFixedAmount property.
	 * 
	 * @return possible object is {@link Amount }
	 * 
	 */
	public Amount getPaymentOverDueFixedAmount() {
		return paymentOverDueFixedAmount;
	}

	/**
	 * Sets the value of the paymentOverDueFixedAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link Amount }
	 * 
	 */
	public void setPaymentOverDueFixedAmount(Amount value) {
		this.paymentOverDueFixedAmount = value;
	}

}
