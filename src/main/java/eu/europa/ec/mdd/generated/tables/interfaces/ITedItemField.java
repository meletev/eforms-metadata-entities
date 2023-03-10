/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITedItemField extends Serializable {

  /**
   * Setter for <code>ted_item_field.ted_item_id</code>.
   */
  public void setTedItemId(Integer value);

  /**
   * Getter for <code>ted_item_field.ted_item_id</code>.
   */
  public Integer getTedItemId();

  /**
   * Setter for <code>ted_item_field.field_id</code>.
   */
  public void setFieldId(String value);

  /**
   * Getter for <code>ted_item_field.field_id</code>.
   */
  public String getFieldId();

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  /**
   * Load data from another generated Record/POJO implementing the common interface ITedItemField
   */
  public void from(ITedItemField from);

  /**
   * Copy data into another generated Record/POJO implementing the common interface ITedItemField
   */
  public <E extends ITedItemField> E into(E into);
}
