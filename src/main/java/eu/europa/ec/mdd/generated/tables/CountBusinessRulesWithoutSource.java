/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables;


import eu.europa.ec.mdd.generated.DefaultSchema;
import eu.europa.ec.mdd.generated.enums.CountBusinessRulesWithoutSourceType;
import eu.europa.ec.mdd.generated.tables.records.CountBusinessRulesWithoutSourceRecord;

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
public class CountBusinessRulesWithoutSource extends TableImpl<CountBusinessRulesWithoutSourceRecord> {

  private static final long serialVersionUID = 1L;

  /**
   * The reference instance of <code>count_business_rules_without_source</code>
   */
  public static final CountBusinessRulesWithoutSource COUNT_BUSINESS_RULES_WITHOUT_SOURCE = new CountBusinessRulesWithoutSource();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<CountBusinessRulesWithoutSourceRecord> getRecordType() {
    return CountBusinessRulesWithoutSourceRecord.class;
  }

  /**
   * The column <code>count_business_rules_without_source.type</code>.
   */
  public final TableField<CountBusinessRulesWithoutSourceRecord, CountBusinessRulesWithoutSourceType> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(18).nullable(false).asEnumDataType(eu.europa.ec.mdd.generated.enums.CountBusinessRulesWithoutSourceType.class), this, "");

  /**
   * The column <code>count_business_rules_without_source.with_source</code>.
   */
  public final TableField<CountBusinessRulesWithoutSourceRecord, Long> WITH_SOURCE = createField(DSL.name("with_source"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

  /**
   * The column <code>count_business_rules_without_source.without_source</code>.
   */
  public final TableField<CountBusinessRulesWithoutSourceRecord, Long> WITHOUT_SOURCE = createField(DSL.name("without_source"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

  /**
   * The column <code>count_business_rules_without_source.total</code>.
   */
  public final TableField<CountBusinessRulesWithoutSourceRecord, Long> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

  private CountBusinessRulesWithoutSource(Name alias, Table<CountBusinessRulesWithoutSourceRecord> aliased) {
    this(alias, aliased, null);
  }

  private CountBusinessRulesWithoutSource(Name alias, Table<CountBusinessRulesWithoutSourceRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `count_business_rules_without_source` as select `TEDEFO_ACC_MDD`.`business_rule`.`type` AS `type`,count((case when `TEDEFO_ACC_MDD`.`business_rule`.`id` in (select `TEDEFO_ACC_MDD`.`business_rule_business_rule_source`.`business_rule_id` from `TEDEFO_ACC_MDD`.`business_rule_business_rule_source`) then 1 else NULL end)) AS `with_source`,count((case when `TEDEFO_ACC_MDD`.`business_rule`.`id` not in (select `TEDEFO_ACC_MDD`.`business_rule_business_rule_source`.`business_rule_id` from `TEDEFO_ACC_MDD`.`business_rule_business_rule_source`) then 1 else NULL end)) AS `without_source`,count(0) AS `total` from `TEDEFO_ACC_MDD`.`business_rule` group by `TEDEFO_ACC_MDD`.`business_rule`.`type`"));
  }

  /**
   * Create an aliased <code>count_business_rules_without_source</code> table reference
   */
  public CountBusinessRulesWithoutSource(String alias) {
    this(DSL.name(alias), COUNT_BUSINESS_RULES_WITHOUT_SOURCE);
  }

  /**
   * Create an aliased <code>count_business_rules_without_source</code> table reference
   */
  public CountBusinessRulesWithoutSource(Name alias) {
    this(alias, COUNT_BUSINESS_RULES_WITHOUT_SOURCE);
  }

  /**
   * Create a <code>count_business_rules_without_source</code> table reference
   */
  public CountBusinessRulesWithoutSource() {
    this(DSL.name("count_business_rules_without_source"), null);
  }

  public <O extends Record> CountBusinessRulesWithoutSource(Table<O> child, ForeignKey<O, CountBusinessRulesWithoutSourceRecord> key) {
    super(child, key, COUNT_BUSINESS_RULES_WITHOUT_SOURCE);
  }

  @Override
  public Schema getSchema() {
    return DefaultSchema.DEFAULT_SCHEMA;
  }

  @Override
  public CountBusinessRulesWithoutSource as(String alias) {
    return new CountBusinessRulesWithoutSource(DSL.name(alias), this);
  }

  @Override
  public CountBusinessRulesWithoutSource as(Name alias) {
    return new CountBusinessRulesWithoutSource(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public CountBusinessRulesWithoutSource rename(String name) {
    return new CountBusinessRulesWithoutSource(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public CountBusinessRulesWithoutSource rename(Name name) {
    return new CountBusinessRulesWithoutSource(name, null);
  }

  // -------------------------------------------------------------------------
  // Row4 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row4<CountBusinessRulesWithoutSourceType, Long, Long, Long> fieldsRow() {
    return (Row4) super.fieldsRow();
  }
}
