//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.12 at 01:41:15 PM IST 
//


package com.invenio.util.aiml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A category is a top-level (or second-level, if contained within a
 * 				topic) element that contains exactly one pattern and exactly one template. A
 * 				category does not have any attributes. All category elements that do not occur as
 * 				children of an explicit topic element must be assumed by the AIML interpreter to
 * 				occur as children of an "implied" topic whose name attribute has the value * (single
 * 				asterisk wildcard).
 * 
 * <p>Java class for Category complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Category">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pattern" type="{http://alicebot.org/2001/AIML-1.0.1}MixedPatternExpression"/>
 *         &lt;element name="that" type="{http://alicebot.org/2001/AIML-1.0.1}MixedPatternExpression" minOccurs="0"/>
 *         &lt;element name="template" type="{http://alicebot.org/2001/AIML-1.0.1}MixedTemplateContentContainer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", propOrder = {
    "pattern",
    "that",
    "template"
})
public class Category {

    @XmlElement(required = true)
    protected MixedPatternExpression pattern;
    protected MixedPatternExpression that;
    @XmlElement(required = true)
    protected MixedTemplateContentContainer template;

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link MixedPatternExpression }
     *     
     */
    public MixedPatternExpression getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link MixedPatternExpression }
     *     
     */
    public void setPattern(MixedPatternExpression value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the that property.
     * 
     * @return
     *     possible object is
     *     {@link MixedPatternExpression }
     *     
     */
    public MixedPatternExpression getThat() {
        return that;
    }

    /**
     * Sets the value of the that property.
     * 
     * @param value
     *     allowed object is
     *     {@link MixedPatternExpression }
     *     
     */
    public void setThat(MixedPatternExpression value) {
        this.that = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link MixedTemplateContentContainer }
     *     
     */
    public MixedTemplateContentContainer getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link MixedTemplateContentContainer }
     *     
     */
    public void setTemplate(MixedTemplateContentContainer value) {
        this.template = value;
    }

}
