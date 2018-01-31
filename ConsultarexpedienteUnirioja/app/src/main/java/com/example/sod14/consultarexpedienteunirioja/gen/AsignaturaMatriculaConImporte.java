
package com.example.sod14.consultarexpedienteunirioja.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para asignaturaMatriculaConImporte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asignaturaMatriculaConImporte">
 *   &lt;complexContent>
 *     &lt;extension base="{http://jws.api.academico.ae.unirioja.es/}asignaturaMatricula">
 *       &lt;sequence>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asignaturaMatriculaConImporte", propOrder = {
    "importe"
})
public class AsignaturaMatriculaConImporte
    extends AsignaturaMatricula
{

    protected float importe;

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     */
    public float getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     */
    public void setImporte(float value) {
        this.importe = value;
    }

}
