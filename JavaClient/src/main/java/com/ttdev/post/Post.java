//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.05.23 a las 11:57:11 AM GMT 
//


package com.ttdev.post;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para result element declaration.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;element name="result">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="vid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="log" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="promote" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="sticky" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="vuuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="nid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="changed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="tnid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="translate" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="revision_timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="revision_uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="body">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="und">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="item">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="safe_summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="field_imagen">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="und">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="item">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="filemime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="filesize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="rdf_mapping" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="alt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="field_tipo">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="und">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="item">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="rdf_mapping">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="rdftype">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="title">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="created">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="changed">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="body">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="uid">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="name">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="comment_count">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="last_activity">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *           &lt;element name="cid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="last_comment_timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="last_comment_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="last_comment_uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="comment_count" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="picture" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vid",
    "uid",
    "title",
    "log",
    "status",
    "comment",
    "promote",
    "sticky",
    "vuuid",
    "nid",
    "type",
    "language",
    "created",
    "changed",
    "tnid",
    "translate",
    "uuid",
    "revisionTimestamp",
    "revisionUid",
    "body",
    "fieldImagen",
    "fieldTipo",
    "rdfMapping",
    "path",
    "cid",
    "lastCommentTimestamp",
    "lastCommentName",
    "lastCommentUid",
    "commentCount",
    "name",
    "picture",
    "data"
})
@XmlRootElement(name = "result")
public class Post {

    protected byte vid;
    protected byte uid;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String log;
    protected byte status;
    protected byte comment;
    protected byte promote;
    protected byte sticky;
    @XmlElement(required = true)
    protected String vuuid;
    protected byte nid;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String language;
    protected int created;
    protected int changed;
    protected byte tnid;
    protected byte translate;
    @XmlElement(required = true)
    protected String uuid;
    @XmlElement(name = "revision_timestamp")
    protected int revisionTimestamp;
    @XmlElement(name = "revision_uid")
    protected byte revisionUid;
    @XmlElement(required = true)
    protected Post.Body body;
    @XmlElement(name = "field_imagen", required = true)
    protected Post.FieldImagen fieldImagen;
    @XmlElement(name = "field_tipo", required = true)
    protected Post.FieldTipo fieldTipo;
    @XmlElement(name = "rdf_mapping", required = true)
    protected Post.RdfMapping rdfMapping;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String path;
    protected byte cid;
    @XmlElement(name = "last_comment_timestamp")
    protected int lastCommentTimestamp;
    @XmlElement(name = "last_comment_name", required = true)
    protected String lastCommentName;
    @XmlElement(name = "last_comment_uid")
    protected byte lastCommentUid;
    @XmlElement(name = "comment_count")
    protected byte commentCount;
    @XmlElement(required = true)
    protected String name;
    protected byte picture;
    @XmlElement(required = true)
    protected String data;

    /**
     * Obtiene el valor de la propiedad vid.
     * 
     */
    public byte getVid() {
        return vid;
    }

    /**
     * Define el valor de la propiedad vid.
     * 
     */
    public void setVid(byte value) {
        this.vid = value;
    }

    /**
     * Obtiene el valor de la propiedad uid.
     * 
     */
    public byte getUid() {
        return uid;
    }

    /**
     * Define el valor de la propiedad uid.
     * 
     */
    public void setUid(byte value) {
        this.uid = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad log.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLog() {
        return log;
    }

    /**
     * Define el valor de la propiedad log.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLog(String value) {
        this.log = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public byte getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(byte value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad comment.
     * 
     */
    public byte getComment() {
        return comment;
    }

    /**
     * Define el valor de la propiedad comment.
     * 
     */
    public void setComment(byte value) {
        this.comment = value;
    }

    /**
     * Obtiene el valor de la propiedad promote.
     * 
     */
    public byte getPromote() {
        return promote;
    }

    /**
     * Define el valor de la propiedad promote.
     * 
     */
    public void setPromote(byte value) {
        this.promote = value;
    }

    /**
     * Obtiene el valor de la propiedad sticky.
     * 
     */
    public byte getSticky() {
        return sticky;
    }

    /**
     * Define el valor de la propiedad sticky.
     * 
     */
    public void setSticky(byte value) {
        this.sticky = value;
    }

    /**
     * Obtiene el valor de la propiedad vuuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVuuid() {
        return vuuid;
    }

    /**
     * Define el valor de la propiedad vuuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVuuid(String value) {
        this.vuuid = value;
    }

    /**
     * Obtiene el valor de la propiedad nid.
     * 
     */
    public byte getNid() {
        return nid;
    }

    /**
     * Define el valor de la propiedad nid.
     * 
     */
    public void setNid(byte value) {
        this.nid = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad created.
     * 
     */
    public int getCreated() {
        return created;
    }

    /**
     * Define el valor de la propiedad created.
     * 
     */
    public void setCreated(int value) {
        this.created = value;
    }

    /**
     * Obtiene el valor de la propiedad changed.
     * 
     */
    public int getChanged() {
        return changed;
    }

    /**
     * Define el valor de la propiedad changed.
     * 
     */
    public void setChanged(int value) {
        this.changed = value;
    }

    /**
     * Obtiene el valor de la propiedad tnid.
     * 
     */
    public byte getTnid() {
        return tnid;
    }

    /**
     * Define el valor de la propiedad tnid.
     * 
     */
    public void setTnid(byte value) {
        this.tnid = value;
    }

    /**
     * Obtiene el valor de la propiedad translate.
     * 
     */
    public byte getTranslate() {
        return translate;
    }

    /**
     * Define el valor de la propiedad translate.
     * 
     */
    public void setTranslate(byte value) {
        this.translate = value;
    }

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Obtiene el valor de la propiedad revisionTimestamp.
     * 
     */
    public int getRevisionTimestamp() {
        return revisionTimestamp;
    }

    /**
     * Define el valor de la propiedad revisionTimestamp.
     * 
     */
    public void setRevisionTimestamp(int value) {
        this.revisionTimestamp = value;
    }

    /**
     * Obtiene el valor de la propiedad revisionUid.
     * 
     */
    public byte getRevisionUid() {
        return revisionUid;
    }

    /**
     * Define el valor de la propiedad revisionUid.
     * 
     */
    public void setRevisionUid(byte value) {
        this.revisionUid = value;
    }

    /**
     * Obtiene el valor de la propiedad body.
     * 
     * @return
     *     possible object is
     *     {@link Post.Body }
     *     
     */
    public Post.Body getBody() {
        return body;
    }

    /**
     * Define el valor de la propiedad body.
     * 
     * @param value
     *     allowed object is
     *     {@link Post.Body }
     *     
     */
    public void setBody(Post.Body value) {
        this.body = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldImagen.
     * 
     * @return
     *     possible object is
     *     {@link Post.FieldImagen }
     *     
     */
    public Post.FieldImagen getFieldImagen() {
        return fieldImagen;
    }

    /**
     * Define el valor de la propiedad fieldImagen.
     * 
     * @param value
     *     allowed object is
     *     {@link Post.FieldImagen }
     *     
     */
    public void setFieldImagen(Post.FieldImagen value) {
        this.fieldImagen = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldTipo.
     * 
     * @return
     *     possible object is
     *     {@link Post.FieldTipo }
     *     
     */
    public Post.FieldTipo getFieldTipo() {
        return fieldTipo;
    }

    /**
     * Define el valor de la propiedad fieldTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link Post.FieldTipo }
     *     
     */
    public void setFieldTipo(Post.FieldTipo value) {
        this.fieldTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad rdfMapping.
     * 
     * @return
     *     possible object is
     *     {@link Post.RdfMapping }
     *     
     */
    public Post.RdfMapping getRdfMapping() {
        return rdfMapping;
    }

    /**
     * Define el valor de la propiedad rdfMapping.
     * 
     * @param value
     *     allowed object is
     *     {@link Post.RdfMapping }
     *     
     */
    public void setRdfMapping(Post.RdfMapping value) {
        this.rdfMapping = value;
    }

    /**
     * Obtiene el valor de la propiedad path.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Define el valor de la propiedad path.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Obtiene el valor de la propiedad cid.
     * 
     */
    public byte getCid() {
        return cid;
    }

    /**
     * Define el valor de la propiedad cid.
     * 
     */
    public void setCid(byte value) {
        this.cid = value;
    }

    /**
     * Obtiene el valor de la propiedad lastCommentTimestamp.
     * 
     */
    public int getLastCommentTimestamp() {
        return lastCommentTimestamp;
    }

    /**
     * Define el valor de la propiedad lastCommentTimestamp.
     * 
     */
    public void setLastCommentTimestamp(int value) {
        this.lastCommentTimestamp = value;
    }

    /**
     * Obtiene el valor de la propiedad lastCommentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCommentName() {
        return lastCommentName;
    }

    /**
     * Define el valor de la propiedad lastCommentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCommentName(String value) {
        this.lastCommentName = value;
    }

    /**
     * Obtiene el valor de la propiedad lastCommentUid.
     * 
     */
    public byte getLastCommentUid() {
        return lastCommentUid;
    }

    /**
     * Define el valor de la propiedad lastCommentUid.
     * 
     */
    public void setLastCommentUid(byte value) {
        this.lastCommentUid = value;
    }

    /**
     * Obtiene el valor de la propiedad commentCount.
     * 
     */
    public byte getCommentCount() {
        return commentCount;
    }

    /**
     * Define el valor de la propiedad commentCount.
     * 
     */
    public void setCommentCount(byte value) {
        this.commentCount = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
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
     * Define el valor de la propiedad name.
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
     * Obtiene el valor de la propiedad picture.
     * 
     */
    public byte getPicture() {
        return picture;
    }

    /**
     * Define el valor de la propiedad picture.
     * 
     */
    public void setPicture(byte value) {
        this.picture = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="und">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="safe_summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "und"
    })
    public static class Body {

        @XmlElement(required = true)
        protected Post.Body.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Post.Body.Und }
         *     
         */
        public Post.Body.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Post.Body.Und }
         *     
         */
        public void setUnd(Post.Body.Und value) {
            this.und = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="safe_summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Und {

            @XmlElement(required = true)
            protected Post.Body.Und.Item item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link Post.Body.Und.Item }
             *     
             */
            public Post.Body.Und.Item getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link Post.Body.Und.Item }
             *     
             */
            public void setItem(Post.Body.Und.Item value) {
                this.item = value;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="safe_summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "value",
                "summary",
                "format",
                "safeValue",
                "safeSummary"
            })
            public static class Item {

                @XmlElement(required = true)
                protected String value;
                @XmlElement(required = true)
                protected String summary;
                @XmlElement(required = true)
                protected String format;
                @XmlElement(name = "safe_value", required = true)
                protected String safeValue;
                @XmlElement(name = "safe_summary", required = true)
                protected String safeSummary;

                /**
                 * Obtiene el valor de la propiedad value.
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
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad summary.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSummary() {
                    return summary;
                }

                /**
                 * Define el valor de la propiedad summary.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSummary(String value) {
                    this.summary = value;
                }

                /**
                 * Obtiene el valor de la propiedad format.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFormat() {
                    return format;
                }

                /**
                 * Define el valor de la propiedad format.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFormat(String value) {
                    this.format = value;
                }

                /**
                 * Obtiene el valor de la propiedad safeValue.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSafeValue() {
                    return safeValue;
                }

                /**
                 * Define el valor de la propiedad safeValue.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSafeValue(String value) {
                    this.safeValue = value;
                }

                /**
                 * Obtiene el valor de la propiedad safeSummary.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSafeSummary() {
                    return safeSummary;
                }

                /**
                 * Define el valor de la propiedad safeSummary.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSafeSummary(String value) {
                    this.safeSummary = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="und">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                             &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                             &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="filemime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="filesize" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                             &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="rdf_mapping" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="alt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                             &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "und"
    })
    public static class FieldImagen {

        @XmlElement(required = true)
        protected Post.FieldImagen.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Post.FieldImagen.Und }
         *     
         */
        public Post.FieldImagen.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Post.FieldImagen.Und }
         *     
         */
        public void setUnd(Post.FieldImagen.Und value) {
            this.und = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                   &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                   &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="filemime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="filesize" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                   &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="rdf_mapping" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="alt" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *                   &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Und {

            @XmlElement(required = true)
            protected Post.FieldImagen.Und.Item item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link Post.FieldImagen.Und.Item }
             *     
             */
            public Post.FieldImagen.Und.Item getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link Post.FieldImagen.Und.Item }
             *     
             */
            public void setItem(Post.FieldImagen.Und.Item value) {
                this.item = value;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="filemime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="filesize" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="rdf_mapping" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="alt" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}short"/>
             *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
                "fid",
                "uid",
                "filename",
                "uri",
                "filemime",
                "filesize",
                "status",
                "timestamp",
                "uuid",
                "rdfMapping",
                "alt",
                "title",
                "width",
                "height"
            })
            public static class Item {

                protected byte fid;
                protected byte uid;
                @XmlElement(required = true)
                protected String filename;
                @XmlElement(required = true)
                protected String uri;
                @XmlElement(required = true)
                protected String filemime;
                protected int filesize;
                protected byte status;
                protected int timestamp;
                @XmlElement(required = true)
                protected String uuid;
                @XmlElement(name = "rdf_mapping", required = true)
                protected String rdfMapping;
                @XmlElement(required = true)
                protected String alt;
                @XmlElement(required = true)
                protected String title;
                protected short width;
                protected short height;

                /**
                 * Obtiene el valor de la propiedad fid.
                 * 
                 */
                public byte getFid() {
                    return fid;
                }

                /**
                 * Define el valor de la propiedad fid.
                 * 
                 */
                public void setFid(byte value) {
                    this.fid = value;
                }

                /**
                 * Obtiene el valor de la propiedad uid.
                 * 
                 */
                public byte getUid() {
                    return uid;
                }

                /**
                 * Define el valor de la propiedad uid.
                 * 
                 */
                public void setUid(byte value) {
                    this.uid = value;
                }

                /**
                 * Obtiene el valor de la propiedad filename.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFilename() {
                    return filename;
                }

                /**
                 * Define el valor de la propiedad filename.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFilename(String value) {
                    this.filename = value;
                }

                /**
                 * Obtiene el valor de la propiedad uri.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUri() {
                    return uri;
                }

                /**
                 * Define el valor de la propiedad uri.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUri(String value) {
                    this.uri = value;
                }

                /**
                 * Obtiene el valor de la propiedad filemime.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFilemime() {
                    return filemime;
                }

                /**
                 * Define el valor de la propiedad filemime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFilemime(String value) {
                    this.filemime = value;
                }

                /**
                 * Obtiene el valor de la propiedad filesize.
                 * 
                 */
                public int getFilesize() {
                    return filesize;
                }

                /**
                 * Define el valor de la propiedad filesize.
                 * 
                 */
                public void setFilesize(int value) {
                    this.filesize = value;
                }

                /**
                 * Obtiene el valor de la propiedad status.
                 * 
                 */
                public byte getStatus() {
                    return status;
                }

                /**
                 * Define el valor de la propiedad status.
                 * 
                 */
                public void setStatus(byte value) {
                    this.status = value;
                }

                /**
                 * Obtiene el valor de la propiedad timestamp.
                 * 
                 */
                public int getTimestamp() {
                    return timestamp;
                }

                /**
                 * Define el valor de la propiedad timestamp.
                 * 
                 */
                public void setTimestamp(int value) {
                    this.timestamp = value;
                }

                /**
                 * Obtiene el valor de la propiedad uuid.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUuid() {
                    return uuid;
                }

                /**
                 * Define el valor de la propiedad uuid.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUuid(String value) {
                    this.uuid = value;
                }

                /**
                 * Obtiene el valor de la propiedad rdfMapping.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRdfMapping() {
                    return rdfMapping;
                }

                /**
                 * Define el valor de la propiedad rdfMapping.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRdfMapping(String value) {
                    this.rdfMapping = value;
                }

                /**
                 * Obtiene el valor de la propiedad alt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAlt() {
                    return alt;
                }

                /**
                 * Define el valor de la propiedad alt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAlt(String value) {
                    this.alt = value;
                }

                /**
                 * Obtiene el valor de la propiedad title.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTitle() {
                    return title;
                }

                /**
                 * Define el valor de la propiedad title.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTitle(String value) {
                    this.title = value;
                }

                /**
                 * Obtiene el valor de la propiedad width.
                 * 
                 */
                public short getWidth() {
                    return width;
                }

                /**
                 * Define el valor de la propiedad width.
                 * 
                 */
                public void setWidth(short value) {
                    this.width = value;
                }

                /**
                 * Obtiene el valor de la propiedad height.
                 * 
                 */
                public short getHeight() {
                    return height;
                }

                /**
                 * Define el valor de la propiedad height.
                 * 
                 */
                public void setHeight(short value) {
                    this.height = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="und">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "und"
    })
    public static class FieldTipo {

        @XmlElement(required = true)
        protected Post.FieldTipo.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Post.FieldTipo.Und }
         *     
         */
        public Post.FieldTipo.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Post.FieldTipo.Und }
         *     
         */
        public void setUnd(Post.FieldTipo.Und value) {
            this.und = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Und {

            @XmlElement(required = true)
            protected Post.FieldTipo.Und.Item item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link Post.FieldTipo.Und.Item }
             *     
             */
            public Post.FieldTipo.Und.Item getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link Post.FieldTipo.Und.Item }
             *     
             */
            public void setItem(Post.FieldTipo.Und.Item value) {
                this.item = value;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
                "tid"
            })
            public static class Item {

                protected byte tid;

                /**
                 * Obtiene el valor de la propiedad tid.
                 * 
                 */
                public byte getTid() {
                    return tid;
                }

                /**
                 * Define el valor de la propiedad tid.
                 * 
                 */
                public void setTid(byte value) {
                    this.tid = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="rdftype">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="title">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="created">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="changed">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="body">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="uid">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="name">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="comment_count">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="last_activity">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "rdftype",
        "title",
        "created",
        "changed",
        "body",
        "uid",
        "name",
        "commentCount",
        "lastActivity"
    })
    public static class RdfMapping {

        @XmlElement(required = true)
        protected Post.RdfMapping.Rdftype rdftype;
        @XmlElement(required = true)
        protected Post.RdfMapping.Title title;
        @XmlElement(required = true)
        protected Post.RdfMapping.Created created;
        @XmlElement(required = true)
        protected Post.RdfMapping.Changed changed;
        @XmlElement(required = true)
        protected Post.RdfMapping.Body body;
        @XmlElement(required = true)
        protected Post.RdfMapping.Uid uid;
        @XmlElement(required = true)
        protected Post.RdfMapping.Name name;
        @XmlElement(name = "comment_count", required = true)
        protected Post.RdfMapping.CommentCount commentCount;
        @XmlElement(name = "last_activity", required = true)
        protected Post.RdfMapping.LastActivity lastActivity;

        /**
         * Obtiene el valor de la propiedad rdftype.
         * 
         * @return
         *     possible object is
         *     {@link Post.RdfMapping.Rdftype }
         *     
         */
        public Post.RdfMapping.Rdftype getRdftype() {
            return rdftype;
        }

        /**
         * Define el valor de la propiedad rdftype.
         * 
         * @param value
         *     allowed object is
         *     {@link Post.RdfMapping.Rdftype }
         *     
         */
        public void setRdftype(Post.RdfMapping.Rdftype value) {
            this.rdftype = value;
        }

        /**
         * Obtiene el valor de la propiedad title.
         * 
         * @return
         *     possible object is
         *     {@link Post.RdfMapping.Title }
         *     
         */
        public Post.RdfMapping.Title getTitle() {
            return title;
        }

        /**
         * Define el valor de la propiedad title.
         * 
         * @param value
         *     allowed object is
         *     {@link Post.RdfMapping.Title }
         *     
         */
        public void setTitle(Post.RdfMapping.Title value) {
            this.title = value;
        }

        /**
         * Obtiene el valor de la propiedad created.
         * 
         * @return
         *     possible object is
         *     {@link Post.RdfMapping.Created }
         *     
         */
        public Post.RdfMapping.Created getCreated() {
            return created;
        }

        /**
         * Define el valor de la propiedad created.
         * 
         * @param value
         *     allowed object is
         *     {@link Post.RdfMapping.Created }
         *     
         */
        public void setCreated(Post.RdfMapping.Created value) {
            this.created = value;
        }

        /**
         * Obtiene el valor de la propiedad changed.
         * 
         * @return
         *     possible object is
         *     {@link Post.RdfMapping.Changed }
         *     
         */
        public Post.RdfMapping.Changed getChanged() {
            return changed;
        }

        /**
         * Define el valor de la propiedad changed.
         * 
         * @param value
         *     allowed object is
         *     {@link Post.RdfMapping.Changed }
         *     
         */
        public void setChanged(Post.RdfMapping.Changed value) {
            this.changed = value;
        }

        /**
         * Obtiene el valor de la propiedad body.
         * 
         * @return
         *     possible object is
         *     {@link Post.RdfMapping.Body }
         *     
         */
        public Post.RdfMapping.Body getBody() {
            return body;
        }

        /**
         * Define el valor de la propiedad body.
         * 
         * @param value
         *     allowed object is
         *     {@link Post.RdfMapping.Body }
         *     
         */
        public void setBody(Post.RdfMapping.Body value) {
            this.body = value;
        }

        /**
         * Obtiene el valor de la propiedad uid.
         * 
         * @return
         *     possible object is
         *     {@link Post.RdfMapping.Uid }
         *     
         */
        public Post.RdfMapping.Uid getUid() {
            return uid;
        }

        /**
         * Define el valor de la propiedad uid.
         * 
         * @param value
         *     allowed object is
         *     {@link Post.RdfMapping.Uid }
         *     
         */
        public void setUid(Post.RdfMapping.Uid value) {
            this.uid = value;
        }

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link Post.RdfMapping.Name }
         *     
         */
        public Post.RdfMapping.Name getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link Post.RdfMapping.Name }
         *     
         */
        public void setName(Post.RdfMapping.Name value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad commentCount.
         * 
         * @return
         *     possible object is
         *     {@link Post.RdfMapping.CommentCount }
         *     
         */
        public Post.RdfMapping.CommentCount getCommentCount() {
            return commentCount;
        }

        /**
         * Define el valor de la propiedad commentCount.
         * 
         * @param value
         *     allowed object is
         *     {@link Post.RdfMapping.CommentCount }
         *     
         */
        public void setCommentCount(Post.RdfMapping.CommentCount value) {
            this.commentCount = value;
        }

        /**
         * Obtiene el valor de la propiedad lastActivity.
         * 
         * @return
         *     possible object is
         *     {@link Post.RdfMapping.LastActivity }
         *     
         */
        public Post.RdfMapping.LastActivity getLastActivity() {
            return lastActivity;
        }

        /**
         * Define el valor de la propiedad lastActivity.
         * 
         * @param value
         *     allowed object is
         *     {@link Post.RdfMapping.LastActivity }
         *     
         */
        public void setLastActivity(Post.RdfMapping.LastActivity value) {
            this.lastActivity = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "predicates"
        })
        public static class Body {

            @XmlElement(required = true)
            protected Post.RdfMapping.Body.Predicates predicates;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Post.RdfMapping.Body.Predicates }
             *     
             */
            public Post.RdfMapping.Body.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Post.RdfMapping.Body.Predicates }
             *     
             */
            public void setPredicates(Post.RdfMapping.Body.Predicates value) {
                this.predicates = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "predicates",
            "datatype",
            "callback"
        })
        public static class Changed {

            @XmlElement(required = true)
            protected Post.RdfMapping.Changed.Predicates predicates;
            @XmlElement(required = true)
            protected String datatype;
            @XmlElement(required = true)
            protected String callback;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Post.RdfMapping.Changed.Predicates }
             *     
             */
            public Post.RdfMapping.Changed.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Post.RdfMapping.Changed.Predicates }
             *     
             */
            public void setPredicates(Post.RdfMapping.Changed.Predicates value) {
                this.predicates = value;
            }

            /**
             * Obtiene el valor de la propiedad datatype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatatype() {
                return datatype;
            }

            /**
             * Define el valor de la propiedad datatype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatatype(String value) {
                this.datatype = value;
            }

            /**
             * Obtiene el valor de la propiedad callback.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCallback() {
                return callback;
            }

            /**
             * Define el valor de la propiedad callback.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCallback(String value) {
                this.callback = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "predicates",
            "datatype"
        })
        public static class CommentCount {

            @XmlElement(required = true)
            protected Post.RdfMapping.CommentCount.Predicates predicates;
            @XmlElement(required = true)
            protected String datatype;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Post.RdfMapping.CommentCount.Predicates }
             *     
             */
            public Post.RdfMapping.CommentCount.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Post.RdfMapping.CommentCount.Predicates }
             *     
             */
            public void setPredicates(Post.RdfMapping.CommentCount.Predicates value) {
                this.predicates = value;
            }

            /**
             * Obtiene el valor de la propiedad datatype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatatype() {
                return datatype;
            }

            /**
             * Define el valor de la propiedad datatype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatatype(String value) {
                this.datatype = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "predicates",
            "datatype",
            "callback"
        })
        public static class Created {

            @XmlElement(required = true)
            protected Post.RdfMapping.Created.Predicates predicates;
            @XmlElement(required = true)
            protected String datatype;
            @XmlElement(required = true)
            protected String callback;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Post.RdfMapping.Created.Predicates }
             *     
             */
            public Post.RdfMapping.Created.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Post.RdfMapping.Created.Predicates }
             *     
             */
            public void setPredicates(Post.RdfMapping.Created.Predicates value) {
                this.predicates = value;
            }

            /**
             * Obtiene el valor de la propiedad datatype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatatype() {
                return datatype;
            }

            /**
             * Define el valor de la propiedad datatype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatatype(String value) {
                this.datatype = value;
            }

            /**
             * Obtiene el valor de la propiedad callback.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCallback() {
                return callback;
            }

            /**
             * Define el valor de la propiedad callback.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCallback(String value) {
                this.callback = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                protected List<String> item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Gets the value of the item property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the item property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getItem().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getItem() {
                    if (item == null) {
                        item = new ArrayList<String>();
                    }
                    return this.item;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "predicates",
            "datatype",
            "callback"
        })
        public static class LastActivity {

            @XmlElement(required = true)
            protected Post.RdfMapping.LastActivity.Predicates predicates;
            @XmlElement(required = true)
            protected String datatype;
            @XmlElement(required = true)
            protected String callback;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Post.RdfMapping.LastActivity.Predicates }
             *     
             */
            public Post.RdfMapping.LastActivity.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Post.RdfMapping.LastActivity.Predicates }
             *     
             */
            public void setPredicates(Post.RdfMapping.LastActivity.Predicates value) {
                this.predicates = value;
            }

            /**
             * Obtiene el valor de la propiedad datatype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatatype() {
                return datatype;
            }

            /**
             * Define el valor de la propiedad datatype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatatype(String value) {
                this.datatype = value;
            }

            /**
             * Obtiene el valor de la propiedad callback.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCallback() {
                return callback;
            }

            /**
             * Define el valor de la propiedad callback.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCallback(String value) {
                this.callback = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "predicates"
        })
        public static class Name {

            @XmlElement(required = true)
            protected Post.RdfMapping.Name.Predicates predicates;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Post.RdfMapping.Name.Predicates }
             *     
             */
            public Post.RdfMapping.Name.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Post.RdfMapping.Name.Predicates }
             *     
             */
            public void setPredicates(Post.RdfMapping.Name.Predicates value) {
                this.predicates = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Rdftype {

            protected List<String> item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getItem() {
                if (item == null) {
                    item = new ArrayList<String>();
                }
                return this.item;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "predicates"
        })
        public static class Title {

            @XmlElement(required = true)
            protected Post.RdfMapping.Title.Predicates predicates;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Post.RdfMapping.Title.Predicates }
             *     
             */
            public Post.RdfMapping.Title.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Post.RdfMapping.Title.Predicates }
             *     
             */
            public void setPredicates(Post.RdfMapping.Title.Predicates value) {
                this.predicates = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "predicates",
            "type"
        })
        public static class Uid {

            @XmlElement(required = true)
            protected Post.RdfMapping.Uid.Predicates predicates;
            @XmlElement(required = true)
            protected String type;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Post.RdfMapping.Uid.Predicates }
             *     
             */
            public Post.RdfMapping.Uid.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Post.RdfMapping.Uid.Predicates }
             *     
             */
            public void setPredicates(Post.RdfMapping.Uid.Predicates value) {
                this.predicates = value;
            }

            /**
             * Obtiene el valor de la propiedad type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }

    }

}
