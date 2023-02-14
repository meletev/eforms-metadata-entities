/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IIdentifierScheme extends Serializable {

  /**
   * Setter for <code>identifier_scheme.id</code>.
   */
  public void setId(String value);

  /**
   * Getter for <code>identifier_scheme.id</code>.
   */
  public String getId();

  /**
   * Setter for <code>identifier_scheme.scheme_name</code>.
   */
  public void setSchemeName(String value);

  /**
   * Getter for <code>identifier_scheme.scheme_name</code>.
   */
  public String getSchemeName();

  /**
   * Setter for <code>identifier_scheme.id_prefix</code>.
   */
  public void setIdPrefix(String value);

  /**
   * Getter for <code>identifier_scheme.id_prefix</code>.
   */
  public String getIdPrefix();

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  /**
   * Load data from another generated Record/POJO implementing the common interface IIdentifierScheme
   */
  public void from(IIdentifierScheme from);

  /**
   * Copy data into another generated Record/POJO implementing the common interface IIdentifierScheme
   */
  public <E extends IIdentifierScheme> E into(E into);
}
