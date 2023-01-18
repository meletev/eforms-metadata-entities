/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IVersion extends Serializable {

  /**
   * Setter for <code>version.id</code>.
   */
  public void setId(String value);

  /**
   * Getter for <code>version.id</code>.
   */
  public String getId();

  /**
   * Setter for <code>version.updated_on</code>.
   */
  public void setUpdatedOn(LocalDateTime value);

  /**
   * Getter for <code>version.updated_on</code>.
   */
  public LocalDateTime getUpdatedOn();

  /**
   * Setter for <code>version.up_to_date</code>.
   */
  public void setUpToDate(Boolean value);

  /**
   * Getter for <code>version.up_to_date</code>.
   */
  public Boolean getUpToDate();

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  /**
   * Load data from another generated Record/POJO implementing the common interface IVersion
   */
  public void from(IVersion from);

  /**
   * Copy data into another generated Record/POJO implementing the common interface IVersion
   */
  public <E extends IVersion> E into(E into);
}
