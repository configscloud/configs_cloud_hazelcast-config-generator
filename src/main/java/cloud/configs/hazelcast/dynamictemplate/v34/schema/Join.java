//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.22 at 07:46:10 PM IST 
//


package cloud.configs.hazelcast.dynamictemplate.v34.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for join complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="join">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="multicast" type="{http://www.hazelcast.com/schema/config}multicast" minOccurs="0"/>
 *         &lt;element name="tcp-ip" type="{http://www.hazelcast.com/schema/config}tcp-ip" minOccurs="0"/>
 *         &lt;element name="aws" type="{http://www.hazelcast.com/schema/config}aws" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "join", propOrder = {
    "multicast",
    "tcpIp",
    "aws"
})
public class Join {

    protected Multicast multicast;
    @XmlElement(name = "tcp-ip")
    protected TcpIp tcpIp;
    protected Aws aws;

    /**
     * Gets the value of the multicast property.
     * 
     * @return
     *     possible object is
     *     {@link Multicast }
     *     
     */
    public Multicast getMulticast() {
        return multicast;
    }

    /**
     * Sets the value of the multicast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Multicast }
     *     
     */
    public void setMulticast(Multicast value) {
        this.multicast = value;
    }

    /**
     * Gets the value of the tcpIp property.
     * 
     * @return
     *     possible object is
     *     {@link TcpIp }
     *     
     */
    public TcpIp getTcpIp() {
        return tcpIp;
    }

    /**
     * Sets the value of the tcpIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcpIp }
     *     
     */
    public void setTcpIp(TcpIp value) {
        this.tcpIp = value;
    }

    /**
     * Gets the value of the aws property.
     * 
     * @return
     *     possible object is
     *     {@link Aws }
     *     
     */
    public Aws getAws() {
        return aws;
    }

    /**
     * Sets the value of the aws property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aws }
     *     
     */
    public void setAws(Aws value) {
        this.aws = value;
    }

}
