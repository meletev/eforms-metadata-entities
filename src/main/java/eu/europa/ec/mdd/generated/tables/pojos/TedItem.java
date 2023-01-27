/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.pojos;


import eu.europa.ec.mdd.generated.tables.interfaces.ITedItem;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TedItem implements ITedItem {

  private static final long serialVersionUID = 1L;

  private Integer id;
  private String  heading;
  private String  name;
  private Integer parentId;
  private String  formId;
  private String  xpath;

  public TedItem() {}

  public TedItem(ITedItem value) {
    this.id = value.getId();
    this.heading = value.getHeading();
    this.name = value.getName();
    this.parentId = value.getParentId();
    this.formId = value.getFormId();
    this.xpath = value.getXpath();
  }

  public TedItem(
    Integer id,
    String  heading,
    String  name,
    Integer parentId,
    String  formId,
    String  xpath
  ) {
    this.id = id;
    this.heading = heading;
    this.name = name;
    this.parentId = parentId;
    this.formId = formId;
    this.xpath = xpath;
  }

  /**
   * Getter for <code>ted_item.id</code>.
   */
  @Override
  public Integer getId() {
    return this.id;
  }

  /**
   * Setter for <code>ted_item.id</code>.
   */
  @Override
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Getter for <code>ted_item.heading</code>.
   */
  @Override
  public String getHeading() {
    return this.heading;
  }

  /**
   * Setter for <code>ted_item.heading</code>.
   */
  @Override
  public void setHeading(String heading) {
    this.heading = heading;
  }

  /**
   * Getter for <code>ted_item.name</code>.
   */
  @Override
  public String getName() {
    return this.name;
  }

  /**
   * Setter for <code>ted_item.name</code>.
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for <code>ted_item.parent_id</code>.
   */
  @Override
  public Integer getParentId() {
    return this.parentId;
  }

  /**
   * Setter for <code>ted_item.parent_id</code>.
   */
  @Override
  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  /**
   * Getter for <code>ted_item.form_id</code>.
   */
  @Override
  public String getFormId() {
    return this.formId;
  }

  /**
   * Setter for <code>ted_item.form_id</code>.
   */
  @Override
  public void setFormId(String formId) {
    this.formId = formId;
  }

  /**
   * Getter for <code>ted_item.xpath</code>.
   */
  @Override
  public String getXpath() {
    return this.xpath;
  }

  /**
   * Setter for <code>ted_item.xpath</code>.
   */
  @Override
  public void setXpath(String xpath) {
    this.xpath = xpath;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TedItem (");

    sb.append(id);
    sb.append(", ").append(heading);
    sb.append(", ").append(name);
    sb.append(", ").append(parentId);
    sb.append(", ").append(formId);
    sb.append(", ").append(xpath);

    sb.append(")");
    return sb.toString();
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(ITedItem from) {
    setId(from.getId());
    setHeading(from.getHeading());
    setName(from.getName());
    setParentId(from.getParentId());
    setFormId(from.getFormId());
    setXpath(from.getXpath());
  }

  @Override
  public <E extends ITedItem> E into(E into) {
    into.from(this);
    return into;
  }
}