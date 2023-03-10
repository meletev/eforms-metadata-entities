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
public interface IAuditLog extends Serializable {

  /**
   * Setter for <code>audit_log.id</code>.
   */
  public void setId(Integer value);

  /**
   * Getter for <code>audit_log.id</code>.
   */
  public Integer getId();

  /**
   * Setter for <code>audit_log.message</code>.
   */
  public void setMessage(String value);

  /**
   * Getter for <code>audit_log.message</code>.
   */
  public String getMessage();

  /**
   * Setter for <code>audit_log.user</code>.
   */
  public void setUser(String value);

  /**
   * Getter for <code>audit_log.user</code>.
   */
  public String getUser();

  /**
   * Setter for <code>audit_log.created_on</code>.
   */
  public void setCreatedOn(LocalDateTime value);

  /**
   * Getter for <code>audit_log.created_on</code>.
   */
  public LocalDateTime getCreatedOn();

  /**
   * Setter for <code>audit_log.host</code>.
   */
  public void setHost(String value);

  /**
   * Getter for <code>audit_log.host</code>.
   */
  public String getHost();

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  /**
   * Load data from another generated Record/POJO implementing the common interface IAuditLog
   */
  public void from(IAuditLog from);

  /**
   * Copy data into another generated Record/POJO implementing the common interface IAuditLog
   */
  public <E extends IAuditLog> E into(E into);
}
