/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.pojos;


import eu.europa.ec.mdd.generated.tables.interfaces.ISpecialPurposeField;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpecialPurposeField implements ISpecialPurposeField {

  private static final long serialVersionUID = 1L;

  private String id;
  private String description;
  private String fieldId;

  public SpecialPurposeField() {}

  public SpecialPurposeField(ISpecialPurposeField value) {
    this.id = value.getId();
    this.description = value.getDescription();
    this.fieldId = value.getFieldId();
  }

  public SpecialPurposeField(
    String id,
    String description,
    String fieldId
  ) {
    this.id = id;
    this.description = description;
    this.fieldId = fieldId;
  }

  /**
   * Getter for <code>special_purpose_field.id</code>.
   */
  @Override
  public String getId() {
    return this.id;
  }

  /**
   * Setter for <code>special_purpose_field.id</code>.
   */
  @Override
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for <code>special_purpose_field.description</code>.
   */
  @Override
  public String getDescription() {
    return this.description;
  }

  /**
   * Setter for <code>special_purpose_field.description</code>.
   */
  @Override
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for <code>special_purpose_field.field_id</code>.
   */
  @Override
  public String getFieldId() {
    return this.fieldId;
  }

  /**
   * Setter for <code>special_purpose_field.field_id</code>.
   */
  @Override
  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SpecialPurposeField (");

    sb.append(id);
    sb.append(", ").append(description);
    sb.append(", ").append(fieldId);

    sb.append(")");
    return sb.toString();
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(ISpecialPurposeField from) {
    setId(from.getId());
    setDescription(from.getDescription());
    setFieldId(from.getFieldId());
  }

  @Override
  public <E extends ISpecialPurposeField> E into(E into) {
    into.from(this);
    return into;
  }
}
