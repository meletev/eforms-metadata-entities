/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.records;


import eu.europa.ec.mdd.generated.tables.DocumentType;
import eu.europa.ec.mdd.generated.tables.interfaces.IDocumentType;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DocumentTypeRecord extends UpdatableRecordImpl<DocumentTypeRecord> implements Record4<String, String, String, String>, IDocumentType {

  private static final long serialVersionUID = 1L;

  /**
   * Setter for <code>document_type.id</code>.
   */
  @Override
  public void setId(String value) {
    set(0, value);
  }

  /**
   * Getter for <code>document_type.id</code>.
   */
  @Override
  public String getId() {
    return (String) get(0);
  }

  /**
   * Setter for <code>document_type.namespace</code>.
   */
  @Override
  public void setNamespace(String value) {
    set(1, value);
  }

  /**
   * Getter for <code>document_type.namespace</code>.
   */
  @Override
  public String getNamespace() {
    return (String) get(1);
  }

  /**
   * Setter for <code>document_type.root_element</code>.
   */
  @Override
  public void setRootElement(String value) {
    set(2, value);
  }

  /**
   * Getter for <code>document_type.root_element</code>.
   */
  @Override
  public String getRootElement() {
    return (String) get(2);
  }

  /**
   * Setter for <code>document_type.schema_location</code>. Location of the main xsd file relative to the SDK root folder, no slash at start
   */
  @Override
  public void setSchemaLocation(String value) {
    set(3, value);
  }

  /**
   * Getter for <code>document_type.schema_location</code>. Location of the main xsd file relative to the SDK root folder, no slash at start
   */
  @Override
  public String getSchemaLocation() {
    return (String) get(3);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  @Override
  public Record1<String> key() {
    return (Record1) super.key();
  }

  // -------------------------------------------------------------------------
  // Record4 type implementation
  // -------------------------------------------------------------------------

  @Override
  public Row4<String, String, String, String> fieldsRow() {
    return (Row4) super.fieldsRow();
  }

  @Override
  public Row4<String, String, String, String> valuesRow() {
    return (Row4) super.valuesRow();
  }

  @Override
  public Field<String> field1() {
    return DocumentType.DOCUMENT_TYPE.ID;
  }

  @Override
  public Field<String> field2() {
    return DocumentType.DOCUMENT_TYPE.NAMESPACE;
  }

  @Override
  public Field<String> field3() {
    return DocumentType.DOCUMENT_TYPE.ROOT_ELEMENT;
  }

  @Override
  public Field<String> field4() {
    return DocumentType.DOCUMENT_TYPE.SCHEMA_LOCATION;
  }

  @Override
  public String component1() {
    return getId();
  }

  @Override
  public String component2() {
    return getNamespace();
  }

  @Override
  public String component3() {
    return getRootElement();
  }

  @Override
  public String component4() {
    return getSchemaLocation();
  }

  @Override
  public String value1() {
    return getId();
  }

  @Override
  public String value2() {
    return getNamespace();
  }

  @Override
  public String value3() {
    return getRootElement();
  }

  @Override
  public String value4() {
    return getSchemaLocation();
  }

  @Override
  public DocumentTypeRecord value1(String value) {
    setId(value);
    return this;
  }

  @Override
  public DocumentTypeRecord value2(String value) {
    setNamespace(value);
    return this;
  }

  @Override
  public DocumentTypeRecord value3(String value) {
    setRootElement(value);
    return this;
  }

  @Override
  public DocumentTypeRecord value4(String value) {
    setSchemaLocation(value);
    return this;
  }

  @Override
  public DocumentTypeRecord values(String value1, String value2, String value3, String value4) {
    value1(value1);
    value2(value2);
    value3(value3);
    value4(value4);
    return this;
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(IDocumentType from) {
    setId(from.getId());
    setNamespace(from.getNamespace());
    setRootElement(from.getRootElement());
    setSchemaLocation(from.getSchemaLocation());
  }

  @Override
  public <E extends IDocumentType> E into(E into) {
    into.from(this);
    return into;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached DocumentTypeRecord
   */
  public DocumentTypeRecord() {
    super(DocumentType.DOCUMENT_TYPE);
  }

  /**
   * Create a detached, initialised DocumentTypeRecord
   */
  public DocumentTypeRecord(String id, String namespace, String rootElement, String schemaLocation) {
    super(DocumentType.DOCUMENT_TYPE);

    setId(id);
    setNamespace(namespace);
    setRootElement(rootElement);
    setSchemaLocation(schemaLocation);
  }
}
