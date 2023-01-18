/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.interfaces;


import eu.europa.ec.mdd.generated.enums.AllFieldsFullXpathsType;

import java.io.Serializable;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IAllFieldsFullXpaths extends Serializable {

  /**
   * Setter for <code>all_fields_full_xpaths.id</code>.
   */
  public void setId(String value);

  /**
   * Getter for <code>all_fields_full_xpaths.id</code>.
   */
  public String getId();

  /**
   * Setter for <code>all_fields_full_xpaths.business_term_id</code>.
   */
  public void setBusinessTermId(String value);

  /**
   * Getter for <code>all_fields_full_xpaths.business_term_id</code>.
   */
  public String getBusinessTermId();

  /**
   * Setter for <code>all_fields_full_xpaths.description</code>.
   */
  public void setDescription(String value);

  /**
   * Getter for <code>all_fields_full_xpaths.description</code>.
   */
  public String getDescription();

  /**
   * Setter for <code>all_fields_full_xpaths.relative_path</code>.
   */
  public void setRelativePath(String value);

  /**
   * Getter for <code>all_fields_full_xpaths.relative_path</code>.
   */
  public String getRelativePath();

  /**
   * Setter for <code>all_fields_full_xpaths.type</code>.
   */
  public void setType(AllFieldsFullXpathsType value);

  /**
   * Getter for <code>all_fields_full_xpaths.type</code>.
   */
  public AllFieldsFullXpathsType getType();

  /**
   * Setter for <code>all_fields_full_xpaths.absolute_path</code>.
   */
  public void setAbsolutePath(String value);

  /**
   * Getter for <code>all_fields_full_xpaths.absolute_path</code>.
   */
  public String getAbsolutePath();

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  /**
   * Load data from another generated Record/POJO implementing the common interface IAllFieldsFullXpaths
   */
  public void from(IAllFieldsFullXpaths from);

  /**
   * Copy data into another generated Record/POJO implementing the common interface IAllFieldsFullXpaths
   */
  public <E extends IAllFieldsFullXpaths> E into(E into);
}
