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
public interface IViewTemplate extends Serializable {

  /**
   * Setter for <code>view_template.id</code>.
   */
  public void setId(String value);

  /**
   * Getter for <code>view_template.id</code>.
   */
  public String getId();

  /**
   * Setter for <code>view_template.template</code>. Contains EFX, starting with the context
   */
  public void setTemplate(String value);

  /**
   * Getter for <code>view_template.template</code>. Contains EFX, starting with the context
   */
  public String getTemplate();

  /**
   * Setter for <code>view_template.draft</code>.
   */
  public void setDraft(Boolean value);

  /**
   * Getter for <code>view_template.draft</code>.
   */
  public Boolean getDraft();

  /**
   * Setter for <code>view_template.draft_reason</code>.
   */
  public void setDraftReason(String value);

  /**
   * Getter for <code>view_template.draft_reason</code>.
   */
  public String getDraftReason();

  /**
   * Setter for <code>view_template.db_modified</code>.
   */
  public void setDbModified(LocalDateTime value);

  /**
   * Getter for <code>view_template.db_modified</code>.
   */
  public LocalDateTime getDbModified();

  /**
   * Setter for <code>view_template.db_modified_by</code>.
   */
  public void setDbModifiedBy(String value);

  /**
   * Getter for <code>view_template.db_modified_by</code>.
   */
  public String getDbModifiedBy();

  /**
   * Setter for <code>view_template.db_created</code>. Set during import
   */
  public void setDbCreated(LocalDateTime value);

  /**
   * Getter for <code>view_template.db_created</code>. Set during import
   */
  public LocalDateTime getDbCreated();

  /**
   * Setter for <code>view_template.db_imported</code>. Set during import
   */
  public void setDbImported(LocalDateTime value);

  /**
   * Getter for <code>view_template.db_imported</code>. Set during import
   */
  public LocalDateTime getDbImported();

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  /**
   * Load data from another generated Record/POJO implementing the common interface IViewTemplate
   */
  public void from(IViewTemplate from);

  /**
   * Copy data into another generated Record/POJO implementing the common interface IViewTemplate
   */
  public <E extends IViewTemplate> E into(E into);
}