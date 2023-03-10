/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ICode extends Serializable {

  /**
   * Setter for <code>code.value</code>.
   */
  public void setValue(String value);

  /**
   * Getter for <code>code.value</code>.
   */
  public String getValue();

  /**
   * Setter for <code>code.code_list_id</code>.
   */
  public void setCodeListId(String value);

  /**
   * Getter for <code>code.code_list_id</code>.
   */
  public String getCodeListId();

  /**
   * Setter for <code>code.description</code>.
   */
  public void setDescription(String value);

  /**
   * Getter for <code>code.description</code>.
   */
  public String getDescription();

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  /**
   * Load data from another generated Record/POJO implementing the common interface ICode
   */
  public void from(ICode from);

  /**
   * Copy data into another generated Record/POJO implementing the common interface ICode
   */
  public <E extends ICode> E into(E into);
}
