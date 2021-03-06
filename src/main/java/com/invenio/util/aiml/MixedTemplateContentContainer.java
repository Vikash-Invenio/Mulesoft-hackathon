//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.12 at 01:41:15 PM IST 
//


package com.invenio.util.aiml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for MixedTemplateContentContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MixedTemplateContentContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://alicebot.org/2001/AIML-1.0.1}atomicElements"/>
 *         &lt;group ref="{http://alicebot.org/2001/AIML-1.0.1}textFormattingElements"/>
 *         &lt;group ref="{http://alicebot.org/2001/AIML-1.0.1}conditionalElements"/>
 *         &lt;group ref="{http://alicebot.org/2001/AIML-1.0.1}captureElements"/>
 *         &lt;group ref="{http://alicebot.org/2001/AIML-1.0.1}symbolicReductionElements"/>
 *         &lt;group ref="{http://alicebot.org/2001/AIML-1.0.1}transformationalElements"/>
 *         &lt;group ref="{http://alicebot.org/2001/AIML-1.0.1}covertElements"/>
 *         &lt;group ref="{http://alicebot.org/2001/AIML-1.0.1}externalProcessorElements"/>
 *         &lt;any processContents='lax' namespace='##other'/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MixedTemplateContentContainer", propOrder = {
    "content"
})
@XmlSeeAlso({
    MixedTemplateContentContainer.Set.class
})
public class MixedTemplateContentContainer {

    @XmlElementRefs({
        @XmlElementRef(name = "uppercase", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sentence", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "person", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "topicstar", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "size", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lowercase", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "star", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "condition", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "learn", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "that", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "javascript", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "input", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "date", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "version", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gossip", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "set", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "system", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "think", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "person2", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "random", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bot", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sr", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "thatstar", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "srai", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gender", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "id", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "get", namespace = "http://alicebot.org/2001/AIML-1.0.1", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    @XmlAnyElement(lax = true)
    protected List<Object> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer }{@code >}
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer }{@code >}
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer }{@code >}
     * {@link JAXBElement }{@code <}{@link IndexedElement }{@code >}
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer }{@code >}
     * {@link JAXBElement }{@code <}{@link IndexedElement }{@code >}
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer.Condition }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link OneOrTwoDIndexedElement }{@code >}
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer }{@code >}
     * {@link JAXBElement }{@code <}{@link OneOrTwoDIndexedElement }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer }{@code >}
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer.Set }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer }{@code >}
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer }{@code >}
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer }{@code >}
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer.Random }{@code >}
     * {@link JAXBElement }{@code <}{@link BotPredicate }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link IndexedElement }{@code >}
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer }{@code >}
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer }{@code >}
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link MixedTemplateContentContainer.Get }{@code >}
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;any processContents='lax'/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://alicebot.org/2001/AIML-1.0.1}PredicateName" />
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Condition {

        @XmlMixed
        @XmlAnyElement(lax = true)
        protected List<Object> content;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "value")
        protected String value;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link Object }
         * {@link Element }
         * 
         * 
         */
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<Object>();
            }
            return this.content;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" type="{http://alicebot.org/2001/AIML-1.0.1}PredicateName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Get {

        @XmlAttribute(name = "name")
        protected String name;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="li" type="{http://alicebot.org/2001/AIML-1.0.1}MixedTemplateContentContainer" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "li"
    })
    public static class Random {

        @XmlElement(required = true)
        protected List<MixedTemplateContentContainer> li;

        /**
         * Gets the value of the li property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the li property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLi().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MixedTemplateContentContainer }
         * 
         * 
         */
        public List<MixedTemplateContentContainer> getLi() {
            if (li == null) {
                li = new ArrayList<MixedTemplateContentContainer>();
            }
            return this.li;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://alicebot.org/2001/AIML-1.0.1}MixedTemplateContentContainer">
     *       &lt;attribute name="name" type="{http://alicebot.org/2001/AIML-1.0.1}PredicateName" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Set
        extends MixedTemplateContentContainer
    {

        @XmlAttribute(name = "name")
        protected String name;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
