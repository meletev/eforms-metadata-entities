/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IPattern extends Serializable {

  /**
   * Setter for <code>pattern.id</code>.
   */
  public void setId(String value);

  /**
   * Getter for <code>pattern.id</code>.
   */
  public String getId();

  /**
   * Setter for <code>pattern.value</code>.
   */
  public void setValue(String value);

  /**
   * Getter for <code>pattern.value</code>.
   */
  public String getValue();

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  /**
   * Load data from another generated Record/POJO implementing the common interface IPattern
   */
  public void from(IPattern from);

  /**
   * Copy data into another generated Record/POJO implementing the common interface IPattern
   */
  public <E extends IPattern> E into(E into);
}