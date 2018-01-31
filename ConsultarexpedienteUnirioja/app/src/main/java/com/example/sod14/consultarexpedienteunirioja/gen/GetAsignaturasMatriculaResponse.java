
package com.example.sod14.consultarexpedienteunirioja.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAsignaturasMatriculaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAsignaturasMatriculaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AsignaturaMatricula" type="{http://jws.api.academico.ae.unirioja.es/}asignaturaMatricula" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAsignaturasMatriculaResponse", propOrder = {
    "asignaturaMatricula"
})
public class GetAsignaturasMatriculaResponse {

    @XmlElement(name = "AsignaturaMatricula")
    protected List<AsignaturaMatricula> asignaturaMatricula;

    /**
     * Gets the value of the asignaturaMatricula property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asignaturaMatricula property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsignaturaMatricula().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AsignaturaMatricula }
     * 
     * 
     */
    public List<AsignaturaMatricula> getAsignaturaMatricula() {
        if (asignaturaMatricula == null) {
            asignaturaMatricula = new ArrayList<AsignaturaMatricula>();
        }
        return this.asignaturaMatricula;
    }

}
