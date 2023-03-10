/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables;


import eu.europa.ec.mdd.generated.DefaultSchema;
import eu.europa.ec.mdd.generated.Indexes;
import eu.europa.ec.mdd.generated.Keys;
import eu.europa.ec.mdd.generated.enums.BusinessRuleContext;
import eu.europa.ec.mdd.generated.enums.BusinessRuleSeverity;
import eu.europa.ec.mdd.generated.enums.BusinessRuleTarget;
import eu.europa.ec.mdd.generated.enums.BusinessRuleType;
import eu.europa.ec.mdd.generated.tables.records.BusinessRuleRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row21;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessRule extends TableImpl<BusinessRuleRecord> {

  private static final long serialVersionUID = 1L;

  /**
   * The reference instance of <code>business_rule</code>
   */
  public static final BusinessRule BUSINESS_RULE = new BusinessRule();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<BusinessRuleRecord> getRecordType() {
    return BusinessRuleRecord.class;
  }

  /**
   * The column <code>business_rule.id</code>.
   */
  public final TableField<BusinessRuleRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

  /**
   * The column <code>business_rule.type</code>.
   */
  public final TableField<BusinessRuleRecord, BusinessRuleType> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(18).nullable(false).asEnumDataType(eu.europa.ec.mdd.generated.enums.BusinessRuleType.class), this, "");

  /**
   * The column <code>business_rule.field_id</code>.
   */
  public final TableField<BusinessRuleRecord, String> FIELD_ID = createField(DSL.name("field_id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

  /**
   * The column <code>business_rule.pattern_id</code>.
   */
  public final TableField<BusinessRuleRecord, String> PATTERN_ID = createField(DSL.name("pattern_id"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>business_rule.interval_id</code>.
   */
  public final TableField<BusinessRuleRecord, String> INTERVAL_ID = createField(DSL.name("interval_id"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>business_rule.notice_id</code>. null means all notices
   */
  public final TableField<BusinessRuleRecord, String> NOTICE_ID = createField(DSL.name("notice_id"), SQLDataType.VARCHAR(255), this, "null means all notices");

  /**
   * The column <code>business_rule.condition_id</code>.
   */
  public final TableField<BusinessRuleRecord, Integer> CONDITION_ID = createField(DSL.name("condition_id"), SQLDataType.INTEGER, this, "");

  /**
   * The column <code>business_rule.expression_id</code>.
   */
  public final TableField<BusinessRuleRecord, Integer> EXPRESSION_ID = createField(DSL.name("expression_id"), SQLDataType.INTEGER, this, "");

  /**
   * The column <code>business_rule.code_list_id</code>.
   */
  public final TableField<BusinessRuleRecord, String> CODE_LIST_ID = createField(DSL.name("code_list_id"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>business_rule.code_list_parent</code>.
   */
  public final TableField<BusinessRuleRecord, String> CODE_LIST_PARENT = createField(DSL.name("code_list_parent"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>business_rule.can_modify</code>. null means applies to first repeatable parent (expects one)
   */
  public final TableField<BusinessRuleRecord, Boolean> CAN_MODIFY = createField(DSL.name("can_modify"), SQLDataType.BOOLEAN, this, "null means applies to first repeatable parent (expects one)");

  /**
   * The column <code>business_rule.can_add</code>. Change notice related
   */
  public final TableField<BusinessRuleRecord, Boolean> CAN_ADD = createField(DSL.name("can_add"), SQLDataType.BOOLEAN, this, "Change notice related");

  /**
   * The column <code>business_rule.can_remove</code>. Change notice related
   */
  public final TableField<BusinessRuleRecord, Boolean> CAN_REMOVE = createField(DSL.name("can_remove"), SQLDataType.BOOLEAN, this, "Change notice related");

  /**
   * The column <code>business_rule.context</code>.
   */
  public final TableField<BusinessRuleRecord, BusinessRuleContext> CONTEXT = createField(DSL.name("context"), SQLDataType.VARCHAR(6).nullable(false).asEnumDataType(eu.europa.ec.mdd.generated.enums.BusinessRuleContext.class), this, "");

  /**
   * The column <code>business_rule.context_node</code>.
   */
  public final TableField<BusinessRuleRecord, String> CONTEXT_NODE = createField(DSL.name("context_node"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>business_rule.description</code>.
   */
  public final TableField<BusinessRuleRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(512).nullable(false), this, "");

  /**
   * The column <code>business_rule.severity</code>.
   */
  public final TableField<BusinessRuleRecord, BusinessRuleSeverity> SEVERITY = createField(DSL.name("severity"), SQLDataType.VARCHAR(7).nullable(false).asEnumDataType(eu.europa.ec.mdd.generated.enums.BusinessRuleSeverity.class), this, "");

  /**
   * The column <code>business_rule.stage</code>.
   */
  public final TableField<BusinessRuleRecord, Integer> STAGE = createField(DSL.name("stage"), SQLDataType.INTEGER, this, "");

  /**
   * The column <code>business_rule.target</code>. The situation in which the rule should be applied
   */
  public final TableField<BusinessRuleRecord, BusinessRuleTarget> TARGET = createField(DSL.name("target"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("all", SQLDataType.VARCHAR)).asEnumDataType(eu.europa.ec.mdd.generated.enums.BusinessRuleTarget.class), this, "The situation in which the rule should be applied");

  /**
   * The column <code>business_rule.draft</code>. Drafts are excluded from the export
   */
  public final TableField<BusinessRuleRecord, Boolean> DRAFT = createField(DSL.name("draft"), SQLDataType.BOOLEAN.nullable(false), this, "Drafts are excluded from the export");

  /**
   * The column <code>business_rule.draft_reason</code>.
   */
  public final TableField<BusinessRuleRecord, String> DRAFT_REASON = createField(DSL.name("draft_reason"), SQLDataType.VARCHAR(255), this, "");

  private BusinessRule(Name alias, Table<BusinessRuleRecord> aliased) {
    this(alias, aliased, null);
  }

  private BusinessRule(Name alias, Table<BusinessRuleRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  /**
   * Create an aliased <code>business_rule</code> table reference
   */
  public BusinessRule(String alias) {
    this(DSL.name(alias), BUSINESS_RULE);
  }

  /**
   * Create an aliased <code>business_rule</code> table reference
   */
  public BusinessRule(Name alias) {
    this(alias, BUSINESS_RULE);
  }

  /**
   * Create a <code>business_rule</code> table reference
   */
  public BusinessRule() {
    this(DSL.name("business_rule"), null);
  }

  public <O extends Record> BusinessRule(Table<O> child, ForeignKey<O, BusinessRuleRecord> key) {
    super(child, key, BUSINESS_RULE);
  }

  @Override
  public Schema getSchema() {
    return DefaultSchema.DEFAULT_SCHEMA;
  }

  @Override
  public List<Index> getIndexes() {
    return Arrays.<Index>asList(Indexes.BUSINESS_RULE_CODE_LIST_ID, Indexes.BUSINESS_RULE_CODE_LIST_PARENT, Indexes.BUSINESS_RULE_CONDITION_ID, Indexes.BUSINESS_RULE_CONTEXT_NODE, Indexes.BUSINESS_RULE_INTERVAL_ID, Indexes.BUSINESS_RULE_NOTICE_ID, Indexes.BUSINESS_RULE_PATTERN_ID);
  }

  @Override
  public UniqueKey<BusinessRuleRecord> getPrimaryKey() {
    return Keys.KEY_BUSINESS_RULE_PRIMARY;
  }

  @Override
  public List<UniqueKey<BusinessRuleRecord>> getKeys() {
    return Arrays.<UniqueKey<BusinessRuleRecord>>asList(Keys.KEY_BUSINESS_RULE_PRIMARY, Keys.KEY_BUSINESS_RULE_UNIQUE_CONTEXT);
  }

  @Override
  public List<ForeignKey<BusinessRuleRecord, ?>> getReferences() {
    return Arrays.<ForeignKey<BusinessRuleRecord, ?>>asList(Keys.BUSINESS_RULE_IBFK_1, Keys.BUSINESS_RULE_IBFK_5, Keys.BUSINESS_RULE_IBFK_7, Keys.BUSINESS_RULE_IBFK_3, Keys.BUSINESS_RULE_IBFK_4, Keys.BUSINESS_RULE_IBFK_8, Keys.BUSINESS_RULE_IBFK_2, Keys.BUSINESS_RULE_IBFK_10, Keys.BUSINESS_RULE_IBFK_9);
  }

  private transient eu.europa.ec.mdd.generated.tables.Field _field;
  private transient Pattern _pattern;
  private transient Interval _interval;
  private transient Notice _notice;
  private transient Condition _businessRuleIbfk_4;
  private transient Condition _businessRuleIbfk_8;
  private transient CodeList _businessRuleIbfk_2;
  private transient CodeList _businessRuleIbfk_10;
  private transient Node _node;

  public eu.europa.ec.mdd.generated.tables.Field field() {
    if (_field == null)
      _field = new eu.europa.ec.mdd.generated.tables.Field(this, Keys.BUSINESS_RULE_IBFK_1);

    return _field;
  }

  public Pattern pattern() {
    if (_pattern == null)
      _pattern = new Pattern(this, Keys.BUSINESS_RULE_IBFK_5);

    return _pattern;
  }

  public Interval interval() {
    if (_interval == null)
      _interval = new Interval(this, Keys.BUSINESS_RULE_IBFK_7);

    return _interval;
  }

  public Notice notice() {
    if (_notice == null)
      _notice = new Notice(this, Keys.BUSINESS_RULE_IBFK_3);

    return _notice;
  }

  public Condition businessRuleIbfk_4() {
    if (_businessRuleIbfk_4 == null)
      _businessRuleIbfk_4 = new Condition(this, Keys.BUSINESS_RULE_IBFK_4);

    return _businessRuleIbfk_4;
  }

  public Condition businessRuleIbfk_8() {
    if (_businessRuleIbfk_8 == null)
      _businessRuleIbfk_8 = new Condition(this, Keys.BUSINESS_RULE_IBFK_8);

    return _businessRuleIbfk_8;
  }

  public CodeList businessRuleIbfk_2() {
    if (_businessRuleIbfk_2 == null)
      _businessRuleIbfk_2 = new CodeList(this, Keys.BUSINESS_RULE_IBFK_2);

    return _businessRuleIbfk_2;
  }

  public CodeList businessRuleIbfk_10() {
    if (_businessRuleIbfk_10 == null)
      _businessRuleIbfk_10 = new CodeList(this, Keys.BUSINESS_RULE_IBFK_10);

    return _businessRuleIbfk_10;
  }

  public Node node() {
    if (_node == null)
      _node = new Node(this, Keys.BUSINESS_RULE_IBFK_9);

    return _node;
  }

  @Override
  public BusinessRule as(String alias) {
    return new BusinessRule(DSL.name(alias), this);
  }

  @Override
  public BusinessRule as(Name alias) {
    return new BusinessRule(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public BusinessRule rename(String name) {
    return new BusinessRule(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public BusinessRule rename(Name name) {
    return new BusinessRule(name, null);
  }

  // -------------------------------------------------------------------------
  // Row21 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row21<String, BusinessRuleType, String, String, String, String, Integer, Integer, String, String, Boolean, Boolean, Boolean, BusinessRuleContext, String, String, BusinessRuleSeverity, Integer, BusinessRuleTarget, Boolean, String> fieldsRow() {
    return (Row21) super.fieldsRow();
  }
}
