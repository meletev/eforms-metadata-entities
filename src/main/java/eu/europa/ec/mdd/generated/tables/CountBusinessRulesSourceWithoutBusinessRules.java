/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables;


import eu.europa.ec.mdd.generated.DefaultSchema;
import eu.europa.ec.mdd.generated.enums.CountBusinessRulesSourceWithoutBusinessRulesImplementationStatus;
import eu.europa.ec.mdd.generated.tables.records.CountBusinessRulesSourceWithoutBusinessRulesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CountBusinessRulesSourceWithoutBusinessRules extends TableImpl<CountBusinessRulesSourceWithoutBusinessRulesRecord> {

  private static final long serialVersionUID = 1L;

  /**
   * The reference instance of <code>count_business_rules_source_without_business_rules</code>
   */
  public static final CountBusinessRulesSourceWithoutBusinessRules COUNT_BUSINESS_RULES_SOURCE_WITHOUT_BUSINESS_RULES = new CountBusinessRulesSourceWithoutBusinessRules();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<CountBusinessRulesSourceWithoutBusinessRulesRecord> getRecordType() {
    return CountBusinessRulesSourceWithoutBusinessRulesRecord.class;
  }

  /**
   * The column <code>count_business_rules_source_without_business_rules.implementation_status</code>.
   */
  public final TableField<CountBusinessRulesSourceWithoutBusinessRulesRecord, CountBusinessRulesSourceWithoutBusinessRulesImplementationStatus> IMPLEMENTATION_STATUS = createField(DSL.name("implementation_status"), SQLDataType.VARCHAR(18).defaultValue(DSL.inline("unknown", SQLDataType.VARCHAR)).asEnumDataType(eu.europa.ec.mdd.generated.enums.CountBusinessRulesSourceWithoutBusinessRulesImplementationStatus.class), this, "");

  /**
   * The column <code>count_business_rules_source_without_business_rules.not_found</code>.
   */
  public final TableField<CountBusinessRulesSourceWithoutBusinessRulesRecord, Long> NOT_FOUND = createField(DSL.name("not_found"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

  /**
   * The column <code>count_business_rules_source_without_business_rules.found</code>.
   */
  public final TableField<CountBusinessRulesSourceWithoutBusinessRulesRecord, Long> FOUND = createField(DSL.name("found"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

  /**
   * The column <code>count_business_rules_source_without_business_rules.total</code>.
   */
  public final TableField<CountBusinessRulesSourceWithoutBusinessRulesRecord, Long> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

  private CountBusinessRulesSourceWithoutBusinessRules(Name alias, Table<CountBusinessRulesSourceWithoutBusinessRulesRecord> aliased) {
    this(alias, aliased, null);
  }

  private CountBusinessRulesSourceWithoutBusinessRules(Name alias, Table<CountBusinessRulesSourceWithoutBusinessRulesRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `count_business_rules_source_without_business_rules` as select `TEDEFO_DEV_MDD_EM`.`business_rule_source`.`implementation_status` AS `implementation_status`,count((case when `TEDEFO_DEV_MDD_EM`.`business_rule_source`.`id` not in (select `TEDEFO_DEV_MDD_EM`.`business_rule_business_rule_source`.`business_rule_source_id` from `TEDEFO_DEV_MDD_EM`.`business_rule_business_rule_source`) then 1 else NULL end)) AS `not_found`,count((case when `TEDEFO_DEV_MDD_EM`.`business_rule_source`.`id` in (select `TEDEFO_DEV_MDD_EM`.`business_rule_business_rule_source`.`business_rule_source_id` from `TEDEFO_DEV_MDD_EM`.`business_rule_business_rule_source`) then 1 else NULL end)) AS `found`,count(0) AS `total` from `TEDEFO_DEV_MDD_EM`.`business_rule_source` group by `TEDEFO_DEV_MDD_EM`.`business_rule_source`.`implementation_status`"));
  }

  /**
   * Create an aliased <code>count_business_rules_source_without_business_rules</code> table reference
   */
  public CountBusinessRulesSourceWithoutBusinessRules(String alias) {
    this(DSL.name(alias), COUNT_BUSINESS_RULES_SOURCE_WITHOUT_BUSINESS_RULES);
  }

  /**
   * Create an aliased <code>count_business_rules_source_without_business_rules</code> table reference
   */
  public CountBusinessRulesSourceWithoutBusinessRules(Name alias) {
    this(alias, COUNT_BUSINESS_RULES_SOURCE_WITHOUT_BUSINESS_RULES);
  }

  /**
   * Create a <code>count_business_rules_source_without_business_rules</code> table reference
   */
  public CountBusinessRulesSourceWithoutBusinessRules() {
    this(DSL.name("count_business_rules_source_without_business_rules"), null);
  }

  public <O extends Record> CountBusinessRulesSourceWithoutBusinessRules(Table<O> child, ForeignKey<O, CountBusinessRulesSourceWithoutBusinessRulesRecord> key) {
    super(child, key, COUNT_BUSINESS_RULES_SOURCE_WITHOUT_BUSINESS_RULES);
  }

  @Override
  public Schema getSchema() {
    return DefaultSchema.DEFAULT_SCHEMA;
  }

  @Override
  public CountBusinessRulesSourceWithoutBusinessRules as(String alias) {
    return new CountBusinessRulesSourceWithoutBusinessRules(DSL.name(alias), this);
  }

  @Override
  public CountBusinessRulesSourceWithoutBusinessRules as(Name alias) {
    return new CountBusinessRulesSourceWithoutBusinessRules(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public CountBusinessRulesSourceWithoutBusinessRules rename(String name) {
    return new CountBusinessRulesSourceWithoutBusinessRules(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public CountBusinessRulesSourceWithoutBusinessRules rename(Name name) {
    return new CountBusinessRulesSourceWithoutBusinessRules(name, null);
  }

  // -------------------------------------------------------------------------
  // Row4 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row4<CountBusinessRulesSourceWithoutBusinessRulesImplementationStatus, Long, Long, Long> fieldsRow() {
    return (Row4) super.fieldsRow();
  }
}