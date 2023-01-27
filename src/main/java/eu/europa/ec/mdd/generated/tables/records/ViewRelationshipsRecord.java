/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.records;


import eu.europa.ec.mdd.generated.tables.ViewRelationships;
import eu.europa.ec.mdd.generated.tables.interfaces.IViewRelationships;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewRelationshipsRecord extends TableRecordImpl<ViewRelationshipsRecord> implements Record6<String, String, String, String, LocalDateTime, LocalDateTime>, IViewRelationships {

  private static final long serialVersionUID = 1L;

  /**
   * Setter for <code>view_relationships.view_id</code>.
   */
  @Override
  public void setViewId(String value) {
    set(0, value);
  }

  /**
   * Getter for <code>view_relationships.view_id</code>.
   */
  @Override
  public String getViewId() {
    return (String) get(0);
  }

  /**
   * Setter for <code>view_relationships.view_template_id</code>.
   */
  @Override
  public void setViewTemplateId(String value) {
    set(1, value);
  }

  /**
   * Getter for <code>view_relationships.view_template_id</code>.
   */
  @Override
  public String getViewTemplateId() {
    return (String) get(1);
  }

  /**
   * Setter for <code>view_relationships.view_structure_id</code>.
   */
  @Override
  public void setViewStructureId(String value) {
    set(2, value);
  }

  /**
   * Getter for <code>view_relationships.view_structure_id</code>.
   */
  @Override
  public String getViewStructureId() {
    return (String) get(2);
  }

  /**
   * Setter for <code>view_relationships.context</code>.
   */
  @Override
  public void setContext(String value) {
    set(3, value);
  }

  /**
   * Getter for <code>view_relationships.context</code>.
   */
  @Override
  public String getContext() {
    return (String) get(3);
  }

  /**
   * Setter for <code>view_relationships.db_created</code>.
   */
  @Override
  public void setDbCreated(LocalDateTime value) {
    set(4, value);
  }

  /**
   * Getter for <code>view_relationships.db_created</code>.
   */
  @Override
  public LocalDateTime getDbCreated() {
    return (LocalDateTime) get(4);
  }

  /**
   * Setter for <code>view_relationships.db_imported</code>.
   */
  @Override
  public void setDbImported(LocalDateTime value) {
    set(5, value);
  }

  /**
   * Getter for <code>view_relationships.db_imported</code>.
   */
  @Override
  public LocalDateTime getDbImported() {
    return (LocalDateTime) get(5);
  }

  // -------------------------------------------------------------------------
  // Record6 type implementation
  // -------------------------------------------------------------------------

  @Override
  public Row6<String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
    return (Row6) super.fieldsRow();
  }

  @Override
  public Row6<String, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
    return (Row6) super.valuesRow();
  }

  @Override
  public Field<String> field1() {
    return ViewRelationships.VIEW_RELATIONSHIPS.VIEW_ID;
  }

  @Override
  public Field<String> field2() {
    return ViewRelationships.VIEW_RELATIONSHIPS.VIEW_TEMPLATE_ID;
  }

  @Override
  public Field<String> field3() {
    return ViewRelationships.VIEW_RELATIONSHIPS.VIEW_STRUCTURE_ID;
  }

  @Override
  public Field<String> field4() {
    return ViewRelationships.VIEW_RELATIONSHIPS.CONTEXT;
  }

  @Override
  public Field<LocalDateTime> field5() {
    return ViewRelationships.VIEW_RELATIONSHIPS.DB_CREATED;
  }

  @Override
  public Field<LocalDateTime> field6() {
    return ViewRelationships.VIEW_RELATIONSHIPS.DB_IMPORTED;
  }

  @Override
  public String component1() {
    return getViewId();
  }

  @Override
  public String component2() {
    return getViewTemplateId();
  }

  @Override
  public String component3() {
    return getViewStructureId();
  }

  @Override
  public String component4() {
    return getContext();
  }

  @Override
  public LocalDateTime component5() {
    return getDbCreated();
  }

  @Override
  public LocalDateTime component6() {
    return getDbImported();
  }

  @Override
  public String value1() {
    return getViewId();
  }

  @Override
  public String value2() {
    return getViewTemplateId();
  }

  @Override
  public String value3() {
    return getViewStructureId();
  }

  @Override
  public String value4() {
    return getContext();
  }

  @Override
  public LocalDateTime value5() {
    return getDbCreated();
  }

  @Override
  public LocalDateTime value6() {
    return getDbImported();
  }

  @Override
  public ViewRelationshipsRecord value1(String value) {
    setViewId(value);
    return this;
  }

  @Override
  public ViewRelationshipsRecord value2(String value) {
    setViewTemplateId(value);
    return this;
  }

  @Override
  public ViewRelationshipsRecord value3(String value) {
    setViewStructureId(value);
    return this;
  }

  @Override
  public ViewRelationshipsRecord value4(String value) {
    setContext(value);
    return this;
  }

  @Override
  public ViewRelationshipsRecord value5(LocalDateTime value) {
    setDbCreated(value);
    return this;
  }

  @Override
  public ViewRelationshipsRecord value6(LocalDateTime value) {
    setDbImported(value);
    return this;
  }

  @Override
  public ViewRelationshipsRecord values(String value1, String value2, String value3, String value4, LocalDateTime value5, LocalDateTime value6) {
    value1(value1);
    value2(value2);
    value3(value3);
    value4(value4);
    value5(value5);
    value6(value6);
    return this;
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

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached ViewRelationshipsRecord
   */
  public ViewRelationshipsRecord() {
    super(ViewRelationships.VIEW_RELATIONSHIPS);
  }

  /**
   * Create a detached, initialised ViewRelationshipsRecord
   */
  public ViewRelationshipsRecord(String viewId, String viewTemplateId, String viewStructureId, String context, LocalDateTime dbCreated, LocalDateTime dbImported) {
    super(ViewRelationships.VIEW_RELATIONSHIPS);

    setViewId(viewId);
    setViewTemplateId(viewTemplateId);
    setViewStructureId(viewStructureId);
    setContext(context);
    setDbCreated(dbCreated);
    setDbImported(dbImported);
  }
}