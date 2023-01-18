/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.pojos;


import eu.europa.ec.mdd.generated.tables.interfaces.IViewRelationships;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewRelationships implements IViewRelationships {

  private static final long serialVersionUID = 1L;

  private String        viewId;
  private String        viewTemplateId;
  private String        viewStructureId;
  private String        context;
  private LocalDateTime dbCreated;
  private LocalDateTime dbImported;

  public ViewRelationships() {}

  public ViewRelationships(IViewRelationships value) {
    this.viewId = value.getViewId();
    this.viewTemplateId = value.getViewTemplateId();
    this.viewStructureId = value.getViewStructureId();
    this.context = value.getContext();
    this.dbCreated = value.getDbCreated();
    this.dbImported = value.getDbImported();
  }

  public ViewRelationships(
    String        viewId,
    String        viewTemplateId,
    String        viewStructureId,
    String        context,
    LocalDateTime dbCreated,
    LocalDateTime dbImported
  ) {
    this.viewId = viewId;
    this.viewTemplateId = viewTemplateId;
    this.viewStructureId = viewStructureId;
    this.context = context;
    this.dbCreated = dbCreated;
    this.dbImported = dbImported;
  }

  /**
   * Getter for <code>view_relationships.view_id</code>.
   */
  @Override
  public String getViewId() {
    return this.viewId;
  }

  /**
   * Setter for <code>view_relationships.view_id</code>.
   */
  @Override
  public void setViewId(String viewId) {
    this.viewId = viewId;
  }

  /**
   * Getter for <code>view_relationships.view_template_id</code>.
   */
  @Override
  public String getViewTemplateId() {
    return this.viewTemplateId;
  }

  /**
   * Setter for <code>view_relationships.view_template_id</code>.
   */
  @Override
  public void setViewTemplateId(String viewTemplateId) {
    this.viewTemplateId = viewTemplateId;
  }

  /**
   * Getter for <code>view_relationships.view_structure_id</code>.
   */
  @Override
  public String getViewStructureId() {
    return this.viewStructureId;
  }

  /**
   * Setter for <code>view_relationships.view_structure_id</code>.
   */
  @Override
  public void setViewStructureId(String viewStructureId) {
    this.viewStructureId = viewStructureId;
  }

  /**
   * Getter for <code>view_relationships.context</code>.
   */
  @Override
  public String getContext() {
    return this.context;
  }

  /**
   * Setter for <code>view_relationships.context</code>.
   */
  @Override
  public void setContext(String context) {
    this.context = context;
  }

  /**
   * Getter for <code>view_relationships.db_created</code>.
   */
  @Override
  public LocalDateTime getDbCreated() {
    return this.dbCreated;
  }

  /**
   * Setter for <code>view_relationships.db_created</code>.
   */
  @Override
  public void setDbCreated(LocalDateTime dbCreated) {
    this.dbCreated = dbCreated;
  }

  /**
   * Getter for <code>view_relationships.db_imported</code>.
   */
  @Override
  public LocalDateTime getDbImported() {
    return this.dbImported;
  }

  /**
   * Setter for <code>view_relationships.db_imported</code>.
   */
  @Override
  public void setDbImported(LocalDateTime dbImported) {
    this.dbImported = dbImported;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ViewRelationships (");

    sb.append(viewId);
    sb.append(", ").append(viewTemplateId);
    sb.append(", ").append(viewStructureId);
    sb.append(", ").append(context);
    sb.append(", ").append(dbCreated);
    sb.append(", ").append(dbImported);

    sb.append(")");
    return sb.toString();
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(IViewRelationships from) {
    setViewId(from.getViewId());
    setViewTemplateId(from.getViewTemplateId());
    setViewStructureId(from.getViewStructureId());
    setContext(from.getContext());
    setDbCreated(from.getDbCreated());
    setDbImported(from.getDbImported());
  }

  @Override
  public <E extends IViewRelationships> E into(E into) {
    into.from(this);
    return into;
  }
}
