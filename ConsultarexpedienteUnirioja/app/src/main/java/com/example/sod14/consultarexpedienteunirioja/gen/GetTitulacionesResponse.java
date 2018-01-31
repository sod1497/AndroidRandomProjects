
package com.example.sod14.consultarexpedienteunirioja.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getTitulacionesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getTitulacionesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Titulacion" type="{http://jws.api.academico.ae.unirioja.es/}titulacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTitulacionesResponse", propOrder = {
    "titulacion"
})
public class GetTitulacionesResponse {

    @XmlElement(name = "Titulacion")
    protected List<Titulacion> titulacion;

    /**
     * Gets the value of the titulacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titulacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitulacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Titulacion }
     * 
     * 
     */
    public List<Titulacion> getTitulacion() {
        if (titulacion == null) {
            titulacion = new ArrayList<Titulacion>();
        }
        return this.titulacion;
    }

}
