
package com.example.sod14.consultarexpedienteunirioja.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anyoAcademico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calificacionNumerica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calificacionTexto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoAsignatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="convocatoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAsignatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "calificacion", propOrder = {
    "anyoAcademico",
    "calificacionNumerica",
    "calificacionTexto",
    "codigoAsignatura",
    "codigoPlan",
    "convocatoria",
    "expediente",
    "nombreAsignatura",
    "nombrePlan"
})
public class Calificacion {

    protected String anyoAcademico;
    protected String calificacionNumerica;
    protected String calificacionTexto;
    protected String codigoAsignatura;
    protected String codigoPlan;
    protected String convocatoria;
    protected String expediente;
    protected String nombreAsignatura;
    protected String nombrePlan;

    /**
     * Obtiene el valor de la propiedad anyoAcademico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyoAcademico() {
        return anyoAcademico;
    }

    /**
     * Define el valor de la propiedad anyoAcademico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnyoAcademico(String value) {
        this.anyoAcademico = value;
    }

    /**
     * Obtiene el valor de la propiedad calificacionNumerica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalificacionNumerica() {
        return calificacionNumerica;
    }

    /**
     * Define el valor de la propiedad calificacionNumerica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalificacionNumerica(String value) {
        this.calificacionNumerica = value;
    }

    /**
     * Obtiene el valor de la propiedad calificacionTexto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalificacionTexto() {
        return calificacionTexto;
    }

    /**
     * Define el valor de la propiedad calificacionTexto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalificacionTexto(String value) {
        this.calificacionTexto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAsignatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    /**
     * Define el valor de la propiedad codigoAsignatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAsignatura(String value) {
        this.codigoAsignatura = value;
    }

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
     * Obtiene el valor de la propiedad convocatoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvocatoria() {
        return convocatoria;
    }

    /**
     * Define el valor de la propiedad convocatoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvocatoria(String value) {
        this.convocatoria = value;
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
     * Obtiene el valor de la propiedad nombreAsignatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    /**
     * Define el valor de la propiedad nombreAsignatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAsignatura(String value) {
        this.nombreAsignatura = value;
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
