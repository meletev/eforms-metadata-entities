/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.pojos;


import eu.europa.ec.mdd.generated.tables.interfaces.IDisplayGroup;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DisplayGroup implements IDisplayGroup {

  private static final long serialVersionUID = 1L;

  private String  id;
  private String  parentId;
  private String  noticeId;
  private String  name;
  private Integer sortOrder;
  private Boolean readonly;
  private Boolean hidden;
  private Boolean section;
  private Boolean collapsed;
  private String  nodeId;
  private String  fieldId;
  private String  displayType;
  private String  valueSource;
  private Boolean _Repeatable;
  private String  _InstanceList;
  private String  _InstanceIdField;
  private String  _ValueList;

  public DisplayGroup() {}

  public DisplayGroup(IDisplayGroup value) {
    this.id = value.getId();
    this.parentId = value.getParentId();
    this.noticeId = value.getNoticeId();
    this.name = value.getName();
    this.sortOrder = value.getSortOrder();
    this.readonly = value.getReadonly();
    this.hidden = value.getHidden();
    this.section = value.getSection();
    this.collapsed = value.getCollapsed();
    this.nodeId = value.getNodeId();
    this.fieldId = value.getFieldId();
    this.displayType = value.getDisplayType();
    this.valueSource = value.getValueSource();
    this._Repeatable = value.get_Repeatable();
    this._InstanceList = value.get_InstanceList();
    this._InstanceIdField = value.get_InstanceIdField();
    this._ValueList = value.get_ValueList();
  }

  public DisplayGroup(
    String  id,
    String  parentId,
    String  noticeId,
    String  name,
    Integer sortOrder,
    Boolean readonly,
    Boolean hidden,
    Boolean section,
    Boolean collapsed,
    String  nodeId,
    String  fieldId,
    String  displayType,
    String  valueSource,
    Boolean _Repeatable,
    String  _InstanceList,
    String  _InstanceIdField,
    String  _ValueList
  ) {
    this.id = id;
    this.parentId = parentId;
    this.noticeId = noticeId;
    this.name = name;
    this.sortOrder = sortOrder;
    this.readonly = readonly;
    this.hidden = hidden;
    this.section = section;
    this.collapsed = collapsed;
    this.nodeId = nodeId;
    this.fieldId = fieldId;
    this.displayType = displayType;
    this.valueSource = valueSource;
    this._Repeatable = _Repeatable;
    this._InstanceList = _InstanceList;
    this._InstanceIdField = _InstanceIdField;
    this._ValueList = _ValueList;
  }

  /**
   * Getter for <code>display_group.id</code>.
   */
  @Override
  public String getId() {
    return this.id;
  }

  /**
   * Setter for <code>display_group.id</code>.
   */
  @Override
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for <code>display_group.parent_id</code>.
   */
  @Override
  public String getParentId() {
    return this.parentId;
  }

  /**
   * Setter for <code>display_group.parent_id</code>.
   */
  @Override
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * Getter for <code>display_group.notice_id</code>.
   */
  @Override
  public String getNoticeId() {
    return this.noticeId;
  }

  /**
   * Setter for <code>display_group.notice_id</code>.
   */
  @Override
  public void setNoticeId(String noticeId) {
    this.noticeId = noticeId;
  }

  /**
   * Getter for <code>display_group.name</code>.
   */
  @Override
  public String getName() {
    return this.name;
  }

  /**
   * Setter for <code>display_group.name</code>.
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for <code>display_group.sort_order</code>.
   */
  @Override
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  /**
   * Setter for <code>display_group.sort_order</code>.
   */
  @Override
  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  /**
   * Getter for <code>display_group.readonly</code>.
   */
  @Override
  public Boolean getReadonly() {
    return this.readonly;
  }

  /**
   * Setter for <code>display_group.readonly</code>.
   */
  @Override
  public void setReadonly(Boolean readonly) {
    this.readonly = readonly;
  }

  /**
   * Getter for <code>display_group.hidden</code>.
   */
  @Override
  public Boolean getHidden() {
    return this.hidden;
  }

  /**
   * Setter for <code>display_group.hidden</code>.
   */
  @Override
  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  /**
   * Getter for <code>display_group.section</code>.
   */
  @Override
  public Boolean getSection() {
    return this.section;
  }

  /**
   * Setter for <code>display_group.section</code>.
   */
  @Override
  public void setSection(Boolean section) {
    this.section = section;
  }

  /**
   * Getter for <code>display_group.collapsed</code>.
   */
  @Override
  public Boolean getCollapsed() {
    return this.collapsed;
  }

  /**
   * Setter for <code>display_group.collapsed</code>.
   */
  @Override
  public void setCollapsed(Boolean collapsed) {
    this.collapsed = collapsed;
  }

  /**
   * Getter for <code>display_group.node_id</code>.
   */
  @Override
  public String getNodeId() {
    return this.nodeId;
  }

  /**
   * Setter for <code>display_group.node_id</code>.
   */
  @Override
  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  /**
   * Getter for <code>display_group.field_id</code>.
   */
  @Override
  public String getFieldId() {
    return this.fieldId;
  }

  /**
   * Setter for <code>display_group.field_id</code>.
   */
  @Override
  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  /**
   * Getter for <code>display_group.display_type</code>.
   */
  @Override
  public String getDisplayType() {
    return this.displayType;
  }

  /**
   * Setter for <code>display_group.display_type</code>.
   */
  @Override
  public void setDisplayType(String displayType) {
    this.displayType = displayType;
  }

  /**
   * Getter for <code>display_group.value_source</code>.
   */
  @Override
  public String getValueSource() {
    return this.valueSource;
  }

  /**
   * Setter for <code>display_group.value_source</code>.
   */
  @Override
  public void setValueSource(String valueSource) {
    this.valueSource = valueSource;
  }

  /**
   * Getter for <code>display_group._repeatable</code>.
   */
  @Override
  public Boolean get_Repeatable() {
    return this._Repeatable;
  }

  /**
   * Setter for <code>display_group._repeatable</code>.
   */
  @Override
  public void set_Repeatable(Boolean _Repeatable) {
    this._Repeatable = _Repeatable;
  }

  /**
   * Getter for <code>display_group._instance_list</code>.
   */
  @Override
  public String get_InstanceList() {
    return this._InstanceList;
  }

  /**
   * Setter for <code>display_group._instance_list</code>.
   */
  @Override
  public void set_InstanceList(String _InstanceList) {
    this._InstanceList = _InstanceList;
  }

  /**
   * Getter for <code>display_group._instance_id_field</code>.
   */
  @Override
  public String get_InstanceIdField() {
    return this._InstanceIdField;
  }

  /**
   * Setter for <code>display_group._instance_id_field</code>.
   */
  @Override
  public void set_InstanceIdField(String _InstanceIdField) {
    this._InstanceIdField = _InstanceIdField;
  }

  /**
   * Getter for <code>display_group._value_list</code>. valueList as CSV
   */
  @Override
  public String get_ValueList() {
    return this._ValueList;
  }

  /**
   * Setter for <code>display_group._value_list</code>. valueList as CSV
   */
  @Override
  public void set_ValueList(String _ValueList) {
    this._ValueList = _ValueList;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DisplayGroup (");

    sb.append(id);
    sb.append(", ").append(parentId);
    sb.append(", ").append(noticeId);
    sb.append(", ").append(name);
    sb.append(", ").append(sortOrder);
    sb.append(", ").append(readonly);
    sb.append(", ").append(hidden);
    sb.append(", ").append(section);
    sb.append(", ").append(collapsed);
    sb.append(", ").append(nodeId);
    sb.append(", ").append(fieldId);
    sb.append(", ").append(displayType);
    sb.append(", ").append(valueSource);
    sb.append(", ").append(_Repeatable);
    sb.append(", ").append(_InstanceList);
    sb.append(", ").append(_InstanceIdField);
    sb.append(", ").append(_ValueList);

    sb.append(")");
    return sb.toString();
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(IDisplayGroup from) {
    setId(from.getId());
    setParentId(from.getParentId());
    setNoticeId(from.getNoticeId());
    setName(from.getName());
    setSortOrder(from.getSortOrder());
    setReadonly(from.getReadonly());
    setHidden(from.getHidden());
    setSection(from.getSection());
    setCollapsed(from.getCollapsed());
    setNodeId(from.getNodeId());
    setFieldId(from.getFieldId());
    setDisplayType(from.getDisplayType());
    setValueSource(from.getValueSource());
    set_Repeatable(from.get_Repeatable());
    set_InstanceList(from.get_InstanceList());
    set_InstanceIdField(from.get_InstanceIdField());
    set_ValueList(from.get_ValueList());
  }

  @Override
  public <E extends IDisplayGroup> E into(E into) {
    into.from(this);
    return into;
  }
}
