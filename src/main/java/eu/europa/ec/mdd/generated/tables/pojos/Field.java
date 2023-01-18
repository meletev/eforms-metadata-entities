/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.pojos;


import eu.europa.ec.mdd.generated.enums.FieldPrivacyCode;
import eu.europa.ec.mdd.generated.enums.FieldType;
import eu.europa.ec.mdd.generated.tables.interfaces.IField;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Field implements IField {

  private static final long serialVersionUID = 1L;

  private String           id;
  private String           businessTermId;
  private String           description;
  private String           relativePath;
  private FieldType        type;
  private String           idSchemes;
  private UInteger         maxLength;
  private String           parentNodeId;
  private Boolean          repeatable;
  private Boolean          multilingual;
  private FieldPrivacyCode privacyCode;
  private String           privacyUnpublishedFieldId;
  private String           privacyReasonCodeFieldId;
  private String           privacyReasonDescriptionFieldId;
  private String           privacyPublicationDateFieldId;

  public Field() {}

  public Field(IField value) {
    this.id = value.getId();
    this.businessTermId = value.getBusinessTermId();
    this.description = value.getDescription();
    this.relativePath = value.getRelativePath();
    this.type = value.getType();
    this.idSchemes = value.getIdSchemes();
    this.maxLength = value.getMaxLength();
    this.parentNodeId = value.getParentNodeId();
    this.repeatable = value.getRepeatable();
    this.multilingual = value.getMultilingual();
    this.privacyCode = value.getPrivacyCode();
    this.privacyUnpublishedFieldId = value.getPrivacyUnpublishedFieldId();
    this.privacyReasonCodeFieldId = value.getPrivacyReasonCodeFieldId();
    this.privacyReasonDescriptionFieldId = value.getPrivacyReasonDescriptionFieldId();
    this.privacyPublicationDateFieldId = value.getPrivacyPublicationDateFieldId();
  }

  public Field(
    String           id,
    String           businessTermId,
    String           description,
    String           relativePath,
    FieldType        type,
    String           idSchemes,
    UInteger         maxLength,
    String           parentNodeId,
    Boolean          repeatable,
    Boolean          multilingual,
    FieldPrivacyCode privacyCode,
    String           privacyUnpublishedFieldId,
    String           privacyReasonCodeFieldId,
    String           privacyReasonDescriptionFieldId,
    String           privacyPublicationDateFieldId
  ) {
    this.id = id;
    this.businessTermId = businessTermId;
    this.description = description;
    this.relativePath = relativePath;
    this.type = type;
    this.idSchemes = idSchemes;
    this.maxLength = maxLength;
    this.parentNodeId = parentNodeId;
    this.repeatable = repeatable;
    this.multilingual = multilingual;
    this.privacyCode = privacyCode;
    this.privacyUnpublishedFieldId = privacyUnpublishedFieldId;
    this.privacyReasonCodeFieldId = privacyReasonCodeFieldId;
    this.privacyReasonDescriptionFieldId = privacyReasonDescriptionFieldId;
    this.privacyPublicationDateFieldId = privacyPublicationDateFieldId;
  }

  /**
   * Getter for <code>field.id</code>.
   */
  @Override
  public String getId() {
    return this.id;
  }

  /**
   * Setter for <code>field.id</code>.
   */
  @Override
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for <code>field.business_term_id</code>.
   */
  @Override
  public String getBusinessTermId() {
    return this.businessTermId;
  }

  /**
   * Setter for <code>field.business_term_id</code>.
   */
  @Override
  public void setBusinessTermId(String businessTermId) {
    this.businessTermId = businessTermId;
  }

  /**
   * Getter for <code>field.description</code>.
   */
  @Override
  public String getDescription() {
    return this.description;
  }

  /**
   * Setter for <code>field.description</code>.
   */
  @Override
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for <code>field.relative_path</code>.
   */
  @Override
  public String getRelativePath() {
    return this.relativePath;
  }

  /**
   * Setter for <code>field.relative_path</code>.
   */
  @Override
  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }

  /**
   * Getter for <code>field.type</code>.
   */
  @Override
  public FieldType getType() {
    return this.type;
  }

  /**
   * Setter for <code>field.type</code>.
   */
  @Override
  public void setType(FieldType type) {
    this.type = type;
  }

  /**
   * Getter for <code>field.id_schemes</code>.
   */
  @Override
  public String getIdSchemes() {
    return this.idSchemes;
  }

  /**
   * Setter for <code>field.id_schemes</code>.
   */
  @Override
  public void setIdSchemes(String idSchemes) {
    this.idSchemes = idSchemes;
  }

  /**
   * Getter for <code>field.max_length</code>. Maximum number of characters allowed
   */
  @Override
  public UInteger getMaxLength() {
    return this.maxLength;
  }

  /**
   * Setter for <code>field.max_length</code>. Maximum number of characters allowed
   */
  @Override
  public void setMaxLength(UInteger maxLength) {
    this.maxLength = maxLength;
  }

  /**
   * Getter for <code>field.parent_node_id</code>.
   */
  @Override
  public String getParentNodeId() {
    return this.parentNodeId;
  }

  /**
   * Setter for <code>field.parent_node_id</code>.
   */
  @Override
  public void setParentNodeId(String parentNodeId) {
    this.parentNodeId = parentNodeId;
  }

  /**
   * Getter for <code>field.repeatable</code>. Indicates if the field can appear multiple times under its parent
   */
  @Override
  public Boolean getRepeatable() {
    return this.repeatable;
  }

  /**
   * Setter for <code>field.repeatable</code>. Indicates if the field can appear multiple times under its parent
   */
  @Override
  public void setRepeatable(Boolean repeatable) {
    this.repeatable = repeatable;
  }

  /**
   * Getter for <code>field.multilingual</code>. Indicates if the field contains language-dependent text
   */
  @Override
  public Boolean getMultilingual() {
    return this.multilingual;
  }

  /**
   * Setter for <code>field.multilingual</code>. Indicates if the field contains language-dependent text
   */
  @Override
  public void setMultilingual(Boolean multilingual) {
    this.multilingual = multilingual;
  }

  /**
   * Getter for <code>field.privacy_code</code>.
   */
  @Override
  public FieldPrivacyCode getPrivacyCode() {
    return this.privacyCode;
  }

  /**
   * Setter for <code>field.privacy_code</code>.
   */
  @Override
  public void setPrivacyCode(FieldPrivacyCode privacyCode) {
    this.privacyCode = privacyCode;
  }

  /**
   * Getter for <code>field.privacy_unpublished_field_id</code>.
   */
  @Override
  public String getPrivacyUnpublishedFieldId() {
    return this.privacyUnpublishedFieldId;
  }

  /**
   * Setter for <code>field.privacy_unpublished_field_id</code>.
   */
  @Override
  public void setPrivacyUnpublishedFieldId(String privacyUnpublishedFieldId) {
    this.privacyUnpublishedFieldId = privacyUnpublishedFieldId;
  }

  /**
   * Getter for <code>field.privacy_reason_code_field_id</code>.
   */
  @Override
  public String getPrivacyReasonCodeFieldId() {
    return this.privacyReasonCodeFieldId;
  }

  /**
   * Setter for <code>field.privacy_reason_code_field_id</code>.
   */
  @Override
  public void setPrivacyReasonCodeFieldId(String privacyReasonCodeFieldId) {
    this.privacyReasonCodeFieldId = privacyReasonCodeFieldId;
  }

  /**
   * Getter for <code>field.privacy_reason_description_field_id</code>.
   */
  @Override
  public String getPrivacyReasonDescriptionFieldId() {
    return this.privacyReasonDescriptionFieldId;
  }

  /**
   * Setter for <code>field.privacy_reason_description_field_id</code>.
   */
  @Override
  public void setPrivacyReasonDescriptionFieldId(String privacyReasonDescriptionFieldId) {
    this.privacyReasonDescriptionFieldId = privacyReasonDescriptionFieldId;
  }

  /**
   * Getter for <code>field.privacy_publication_date_field_id</code>.
   */
  @Override
  public String getPrivacyPublicationDateFieldId() {
    return this.privacyPublicationDateFieldId;
  }

  /**
   * Setter for <code>field.privacy_publication_date_field_id</code>.
   */
  @Override
  public void setPrivacyPublicationDateFieldId(String privacyPublicationDateFieldId) {
    this.privacyPublicationDateFieldId = privacyPublicationDateFieldId;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Field (");

    sb.append(id);
    sb.append(", ").append(businessTermId);
    sb.append(", ").append(description);
    sb.append(", ").append(relativePath);
    sb.append(", ").append(type);
    sb.append(", ").append(idSchemes);
    sb.append(", ").append(maxLength);
    sb.append(", ").append(parentNodeId);
    sb.append(", ").append(repeatable);
    sb.append(", ").append(multilingual);
    sb.append(", ").append(privacyCode);
    sb.append(", ").append(privacyUnpublishedFieldId);
    sb.append(", ").append(privacyReasonCodeFieldId);
    sb.append(", ").append(privacyReasonDescriptionFieldId);
    sb.append(", ").append(privacyPublicationDateFieldId);

    sb.append(")");
    return sb.toString();
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(IField from) {
    setId(from.getId());
    setBusinessTermId(from.getBusinessTermId());
    setDescription(from.getDescription());
    setRelativePath(from.getRelativePath());
    setType(from.getType());
    setIdSchemes(from.getIdSchemes());
    setMaxLength(from.getMaxLength());
    setParentNodeId(from.getParentNodeId());
    setRepeatable(from.getRepeatable());
    setMultilingual(from.getMultilingual());
    setPrivacyCode(from.getPrivacyCode());
    setPrivacyUnpublishedFieldId(from.getPrivacyUnpublishedFieldId());
    setPrivacyReasonCodeFieldId(from.getPrivacyReasonCodeFieldId());
    setPrivacyReasonDescriptionFieldId(from.getPrivacyReasonDescriptionFieldId());
    setPrivacyPublicationDateFieldId(from.getPrivacyPublicationDateFieldId());
  }

  @Override
  public <E extends IField> E into(E into) {
    into.from(this);
    return into;
  }
}
