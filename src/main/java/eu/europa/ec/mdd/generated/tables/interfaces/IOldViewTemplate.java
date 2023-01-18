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
public interface IOldViewTemplate extends Serializable {

  /**
   * Setter for <code>old_view_template.id</code>. Zero is root (can have a prefix)
   */
  public void setId(String value);

  /**
   * Getter for <code>old_view_template.id</code>. Zero is root (can have a prefix)
   */
  public String getId();

  /**
   * Setter for <code>old_view_template.parent_id</code>.
   */
  public void setParentId(String value);

  /**
   * Getter for <code>old_view_template.parent_id</code>.
   */
  public String getParentId();

  /**
   * Setter for <code>old_view_template.view_id</code>.
   */
  public void setViewId(String value);

  /**
   * Getter for <code>old_view_template.view_id</code>.
   */
  public String getViewId();

  /**
   * Setter for <code>old_view_template.sort_order</code>.
   */
  public void setSortOrder(Integer value);

  /**
   * Getter for <code>old_view_template.sort_order</code>.
   */
  public Integer getSortOrder();

  /**
   * Setter for <code>old_view_template.number</code>.
   */
  public void setNumber(String value);

  /**
   * Getter for <code>old_view_template.number</code>.
   */
  public String getNumber();

  /**
   * Setter for <code>old_view_template.template</code>.
   */
  public void setTemplate(String value);

  /**
   * Getter for <code>old_view_template.template</code>.
   */
  public String getTemplate();

  /**
   * Setter for <code>old_view_template.created</code>.
   */
  public void setCreated(LocalDateTime value);

  /**
   * Getter for <code>old_view_template.created</code>.
   */
  public LocalDateTime getCreated();

  /**
   * Setter for <code>old_view_template.imported</code>. Set by import code
   */
  public void setImported(LocalDateTime value);

  /**
   * Getter for <code>old_view_template.imported</code>. Set by import code
   */
  public LocalDateTime getImported();

  /**
   * Setter for <code>old_view_template.repeats_with_node</code>.
   */
  public void setRepeatsWithNode(String value);

  /**
   * Getter for <code>old_view_template.repeats_with_node</code>.
   */
  public String getRepeatsWithNode();

  /**
   * Setter for <code>old_view_template.repeats_with_field</code>.
   */
  public void setRepeatsWithField(String value);

  /**
   * Getter for <code>old_view_template.repeats_with_field</code>.
   */
  public String getRepeatsWithField();

  /**
   * Setter for <code>old_view_template.context</code>.
   */
  public void setContext(String value);

  /**
   * Getter for <code>old_view_template.context</code>.
   */
  public String getContext();

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  /**
   * Load data from another generated Record/POJO implementing the common interface IOldViewTemplate
   */
  public void from(IOldViewTemplate from);

  /**
   * Copy data into another generated Record/POJO implementing the common interface IOldViewTemplate
   */
  public <E extends IOldViewTemplate> E into(E into);
}
