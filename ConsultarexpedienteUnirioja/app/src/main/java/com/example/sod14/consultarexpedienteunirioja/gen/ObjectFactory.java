
package com.example.sod14.consultarexpedienteunirioja.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ej32 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAsignaturasMatriculaConImporte_QNAME = new QName("http://jws.api.academico.ae.unirioja.es/", "getAsignaturasMatriculaConImporte");
    private final static QName _GetCalificacionesResponse_QNAME = new QName("http://jws.api.academico.ae.unirioja.es/", "getCalificacionesResponse");
    private final static QName _GetCalificaciones_QNAME = new QName("http://jws.api.academico.ae.unirioja.es/", "getCalificaciones");
    private final static QName _GetTitulaciones_QNAME = new QName("http://jws.api.academico.ae.unirioja.es/", "getTitulaciones");
    private final static QName _GetAsignaturasMatricula_QNAME = new QName("http://jws.api.academico.ae.unirioja.es/", "getAsignaturasMatricula");
    private final static QName _GetTitulacionesResponse_QNAME = new QName("http://jws.api.academico.ae.unirioja.es/", "getTitulacionesResponse");
    private final static QName _GetAsignaturasMatriculaConImporteResponse_QNAME = new QName("http://jws.api.academico.ae.unirioja.es/", "getAsignaturasMatriculaConImporteResponse");
    private final static QName _GetAsignaturasMatriculaResponse_QNAME = new QName("http://jws.api.academico.ae.unirioja.es/", "getAsignaturasMatriculaResponse");
    private final static QName _Token_QNAME = new QName("http://jws.api.academico.ae.unirioja.es/", "token");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ej32
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAsignaturasMatriculaConImporteResponse }
     * 
     */
    public GetAsignaturasMatriculaConImporteResponse createGetAsignaturasMatriculaConImporteResponse() {
        return new GetAsignaturasMatriculaConImporteResponse();
    }

    /**
     * Create an instance of {@link GetCalificacionesResponse }
     * 
     */
    public GetCalificacionesResponse createGetCalificacionesResponse() {
        return new GetCalificacionesResponse();
    }

    /**
     * Create an instance of {@link GetAsignaturasMatriculaConImporte }
     * 
     */
    public GetAsignaturasMatriculaConImporte createGetAsignaturasMatriculaConImporte() {
        return new GetAsignaturasMatriculaConImporte();
    }

    /**
     * Create an instance of {@link GetAsignaturasMatricula }
     * 
     */
    public GetAsignaturasMatricula createGetAsignaturasMatricula() {
        return new GetAsignaturasMatricula();
    }

    /**
     * Create an instance of {@link GetTitulacionesResponse }
     * 
     */
    public GetTitulacionesResponse createGetTitulacionesResponse() {
        return new GetTitulacionesResponse();
    }

    /**
     * Create an instance of {@link GetCalificaciones }
     * 
     */
    public GetCalificaciones createGetCalificaciones() {
        return new GetCalificaciones();
    }

    /**
     * Create an instance of {@link GetTitulaciones }
     * 
     */
    public GetTitulaciones createGetTitulaciones() {
        return new GetTitulaciones();
    }

    /**
     * Create an instance of {@link GetAsignaturasMatriculaResponse }
     * 
     */
    public GetAsignaturasMatriculaResponse createGetAsignaturasMatriculaResponse() {
        return new GetAsignaturasMatriculaResponse();
    }

    /**
     * Create an instance of {@link SecurityToken }
     * 
     */
    public SecurityToken createSecurityToken() {
        return new SecurityToken();
    }

    /**
     * Create an instance of {@link Calificacion }
     * 
     */
    public Calificacion createCalificacion() {
        return new Calificacion();
    }

    /**
     * Create an instance of {@link AsignaturaMatriculaConImporte }
     * 
     */
    public AsignaturaMatriculaConImporte createAsignaturaMatriculaConImporte() {
        return new AsignaturaMatriculaConImporte();
    }

    /**
     * Create an instance of {@link AsignaturaMatricula }
     * 
     */
    public AsignaturaMatricula createAsignaturaMatricula() {
        return new AsignaturaMatricula();
    }

    /**
     * Create an instance of {@link Titulacion }
     * 
     */
    public Titulacion createTitulacion() {
        return new Titulacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsignaturasMatriculaConImporte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.api.academico.ae.unirioja.es/", name = "getAsignaturasMatriculaConImporte")
    public JAXBElement<GetAsignaturasMatriculaConImporte> createGetAsignaturasMatriculaConImporte(GetAsignaturasMatriculaConImporte value) {
        return new JAXBElement<GetAsignaturasMatriculaConImporte>(_GetAsignaturasMatriculaConImporte_QNAME, GetAsignaturasMatriculaConImporte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalificacionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.api.academico.ae.unirioja.es/", name = "getCalificacionesResponse")
    public JAXBElement<GetCalificacionesResponse> createGetCalificacionesResponse(GetCalificacionesResponse value) {
        return new JAXBElement<GetCalificacionesResponse>(_GetCalificacionesResponse_QNAME, GetCalificacionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalificaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.api.academico.ae.unirioja.es/", name = "getCalificaciones")
    public JAXBElement<GetCalificaciones> createGetCalificaciones(GetCalificaciones value) {
        return new JAXBElement<GetCalificaciones>(_GetCalificaciones_QNAME, GetCalificaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitulaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.api.academico.ae.unirioja.es/", name = "getTitulaciones")
    public JAXBElement<GetTitulaciones> createGetTitulaciones(GetTitulaciones value) {
        return new JAXBElement<GetTitulaciones>(_GetTitulaciones_QNAME, GetTitulaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsignaturasMatricula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.api.academico.ae.unirioja.es/", name = "getAsignaturasMatricula")
    public JAXBElement<GetAsignaturasMatricula> createGetAsignaturasMatricula(GetAsignaturasMatricula value) {
        return new JAXBElement<GetAsignaturasMatricula>(_GetAsignaturasMatricula_QNAME, GetAsignaturasMatricula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitulacionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.api.academico.ae.unirioja.es/", name = "getTitulacionesResponse")
    public JAXBElement<GetTitulacionesResponse> createGetTitulacionesResponse(GetTitulacionesResponse value) {
        return new JAXBElement<GetTitulacionesResponse>(_GetTitulacionesResponse_QNAME, GetTitulacionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsignaturasMatriculaConImporteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.api.academico.ae.unirioja.es/", name = "getAsignaturasMatriculaConImporteResponse")
    public JAXBElement<GetAsignaturasMatriculaConImporteResponse> createGetAsignaturasMatriculaConImporteResponse(GetAsignaturasMatriculaConImporteResponse value) {
        return new JAXBElement<GetAsignaturasMatriculaConImporteResponse>(_GetAsignaturasMatriculaConImporteResponse_QNAME, GetAsignaturasMatriculaConImporteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsignaturasMatriculaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.api.academico.ae.unirioja.es/", name = "getAsignaturasMatriculaResponse")
    public JAXBElement<GetAsignaturasMatriculaResponse> createGetAsignaturasMatriculaResponse(GetAsignaturasMatriculaResponse value) {
        return new JAXBElement<GetAsignaturasMatriculaResponse>(_GetAsignaturasMatriculaResponse_QNAME, GetAsignaturasMatriculaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.api.academico.ae.unirioja.es/", name = "token")
    public JAXBElement<SecurityToken> createToken(SecurityToken value) {
        return new JAXBElement<SecurityToken>(_Token_QNAME, SecurityToken.class, null, value);
    }

}
