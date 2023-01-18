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
public interface IView extends Serializable {

  /**
   * Setter for <code>view.id</code>.
   */
  public void setId(String value);

  /**
   * Getter for <code>view.id</code>.
   */
  public String getId();

  /**
   * Setter for <code>view.name</code>.
   */
  public void setName(String value);

  /**
   * Getter for <code>view.name</code>.
   */
  public String getName();

  /**
   * Setter for <code>view.description</code>.
   */
  public void setDescription(String value);

  /**
   * Getter for <code>view.description</code>.
   */
  public String getDescription();

  /**
   * Setter for <code>view.draft</code>. Drafts are excluded from the export
   */
  public void setDraft(Boolean value);

  /**
   * Getter for <code>view.draft</code>. Drafts are excluded from the export
   */
  public Boolean getDraft();

  /**
   * Setter for <code>view.created</code>.
   */
  public void setCreated(LocalDateTime value);

  /**
   * Getter for <code>view.created</code>.
   */
  public LocalDateTime getCreated();

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  /**
   * Load data from another generated Record/POJO implementing the common interface IView
   */
  public void from(IView from);

  /**
   * Copy data into another generated Record/POJO implementing the common interface IView
   */
  public <E extends IView> E into(E into);
}
