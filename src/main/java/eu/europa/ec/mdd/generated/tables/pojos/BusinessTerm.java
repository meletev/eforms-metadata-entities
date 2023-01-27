/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.pojos;


import eu.europa.ec.mdd.generated.tables.interfaces.IBusinessTerm;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessTerm implements IBusinessTerm {

  private static final long serialVersionUID = 1L;

  private String id;
  private String businessGroupId;
  private String type;
  private String description;

  public BusinessTerm() {}

  public BusinessTerm(IBusinessTerm value) {
    this.id = value.getId();
    this.businessGroupId = value.getBusinessGroupId();
    this.type = value.getType();
    this.description = value.getDescription();
  }

  public BusinessTerm(
    String id,
    String businessGroupId,
    String type,
    String description
  ) {
    this.id = id;
    this.businessGroupId = businessGroupId;
    this.type = type;
    this.description = description;
  }

  /**
   * Getter for <code>business_term.id</code>.
   */
  @Override
  public String getId() {
    return this.id;
  }

  /**
   * Setter for <code>business_term.id</code>.
   */
  @Override
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for <code>business_term.business_group_id</code>.
   */
  @Override
  public String getBusinessGroupId() {
    return this.businessGroupId;
  }

  /**
   * Setter for <code>business_term.business_group_id</code>.
   */
  @Override
  public void setBusinessGroupId(String businessGroupId) {
    this.businessGroupId = businessGroupId;
  }

  /**
   * Getter for <code>business_term.type</code>.
   */
  @Override
  public String getType() {
    return this.type;
  }

  /**
   * Setter for <code>business_term.type</code>.
   */
  @Override
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for <code>business_term.description</code>.
   */
  @Override
  public String getDescription() {
    return this.description;
  }

  /**
   * Setter for <code>business_term.description</code>.
   */
  @Override
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BusinessTerm (");

    sb.append(id);
    sb.append(", ").append(businessGroupId);
    sb.append(", ").append(type);
    sb.append(", ").append(description);

    sb.append(")");
    return sb.toString();
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(IBusinessTerm from) {
    setId(from.getId());
    setBusinessGroupId(from.getBusinessGroupId());
    setType(from.getType());
    setDescription(from.getDescription());
  }

  @Override
  public <E extends IBusinessTerm> E into(E into) {
    into.from(this);
    return into;
  }
}