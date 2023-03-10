/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.pojos;


import eu.europa.ec.mdd.generated.tables.interfaces.IVersion;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Version implements IVersion {

  private static final long serialVersionUID = 1L;

  private String        id;
  private LocalDateTime updatedOn;
  private Boolean       upToDate;

  public Version() {}

  public Version(IVersion value) {
    this.id = value.getId();
    this.updatedOn = value.getUpdatedOn();
    this.upToDate = value.getUpToDate();
  }

  public Version(
    String        id,
    LocalDateTime updatedOn,
    Boolean       upToDate
  ) {
    this.id = id;
    this.updatedOn = updatedOn;
    this.upToDate = upToDate;
  }

  /**
   * Getter for <code>version.id</code>.
   */
  @Override
  public String getId() {
    return this.id;
  }

  /**
   * Setter for <code>version.id</code>.
   */
  @Override
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for <code>version.updated_on</code>.
   */
  @Override
  public LocalDateTime getUpdatedOn() {
    return this.updatedOn;
  }

  /**
   * Setter for <code>version.updated_on</code>.
   */
  @Override
  public void setUpdatedOn(LocalDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

  /**
   * Getter for <code>version.up_to_date</code>.
   */
  @Override
  public Boolean getUpToDate() {
    return this.upToDate;
  }

  /**
   * Setter for <code>version.up_to_date</code>.
   */
  @Override
  public void setUpToDate(Boolean upToDate) {
    this.upToDate = upToDate;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Version (");

    sb.append(id);
    sb.append(", ").append(updatedOn);
    sb.append(", ").append(upToDate);

    sb.append(")");
    return sb.toString();
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(IVersion from) {
    setId(from.getId());
    setUpdatedOn(from.getUpdatedOn());
    setUpToDate(from.getUpToDate());
  }

  @Override
  public <E extends IVersion> E into(E into) {
    into.from(this);
    return into;
  }
}
