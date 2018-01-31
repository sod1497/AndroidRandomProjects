
package com.example.sod14.consultarexpedienteunirioja.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para titulacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="titulacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrePlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "titulacion", propOrder = {
    "codigoPlan",
    "expediente",
    "nombrePlan"
})
public class Titulacion {

    protected String codigoPlan;
    protected String expediente;
    protected String nombrePlan;

    /**
     * Obtiene el valor de la propiedad codigoPlan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPlan() {
        return codigoPlan;
    }

    /**
     * Define el valor de la propiedad codigoPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPlan(String value) {
        this.codigoPlan = value;
    }

    /**
     * Obtiene el valor de la propiedad expediente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpediente() {
        return expediente;
    }

    /**
     * Define el valor de la propiedad expediente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpediente(String value) {
        this.expediente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePlan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePlan() {
        return nombrePlan;
    }

    /**
     * Define el valor de la propiedad nombrePlan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePlan(String value) {
        this.nombrePlan = value;
    }

}
