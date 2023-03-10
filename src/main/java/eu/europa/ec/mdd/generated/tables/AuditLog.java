/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables;


import eu.europa.ec.mdd.generated.DefaultSchema;
import eu.europa.ec.mdd.generated.Keys;
import eu.europa.ec.mdd.generated.tables.records.AuditLogRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class AuditLog extends TableImpl<AuditLogRecord> {

  private static final long serialVersionUID = 1L;

  /**
   * The reference instance of <code>audit_log</code>
   */
  public static final AuditLog AUDIT_LOG = new AuditLog();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<AuditLogRecord> getRecordType() {
    return AuditLogRecord.class;
  }

  /**
   * The column <code>audit_log.id</code>.
   */
  public final TableField<AuditLogRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

  /**
   * The column <code>audit_log.message</code>.
   */
  public final TableField<AuditLogRecord, String> MESSAGE = createField(DSL.name("message"), SQLDataType.VARCHAR(10000), this, "");

  /**
   * The column <code>audit_log.user</code>.
   */
  public final TableField<AuditLogRecord, String> USER = createField(DSL.name("user"), SQLDataType.VARCHAR(255).nullable(false), this, "");

  /**
   * The column <code>audit_log.created_on</code>.
   */
  public final TableField<AuditLogRecord, LocalDateTime> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

  /**
   * The column <code>audit_log.host</code>.
   */
  public final TableField<AuditLogRecord, String> HOST = createField(DSL.name("host"), SQLDataType.VARCHAR(255), this, "");

  private AuditLog(Name alias, Table<AuditLogRecord> aliased) {
    this(alias, aliased, null);
  }

  private AuditLog(Name alias, Table<AuditLogRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  /**
   * Create an aliased <code>audit_log</code> table reference
   */
  public AuditLog(String alias) {
    this(DSL.name(alias), AUDIT_LOG);
  }

  /**
   * Create an aliased <code>audit_log</code> table reference
   */
  public AuditLog(Name alias) {
    this(alias, AUDIT_LOG);
  }

  /**
   * Create a <code>audit_log</code> table reference
   */
  public AuditLog() {
    this(DSL.name("audit_log"), null);
  }

  public <O extends Record> AuditLog(Table<O> child, ForeignKey<O, AuditLogRecord> key) {
    super(child, key, AUDIT_LOG);
  }

  @Override
  public Schema getSchema() {
    return DefaultSchema.DEFAULT_SCHEMA;
  }

  @Override
  public Identity<AuditLogRecord, Integer> getIdentity() {
    return (Identity<AuditLogRecord, Integer>) super.getIdentity();
  }

  @Override
  public UniqueKey<AuditLogRecord> getPrimaryKey() {
    return Keys.KEY_AUDIT_LOG_PRIMARY;
  }

  @Override
  public List<UniqueKey<AuditLogRecord>> getKeys() {
    return Arrays.<UniqueKey<AuditLogRecord>>asList(Keys.KEY_AUDIT_LOG_PRIMARY);
  }

  @Override
  public AuditLog as(String alias) {
    return new AuditLog(DSL.name(alias), this);
  }

  @Override
  public AuditLog as(Name alias) {
    return new AuditLog(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public AuditLog rename(String name) {
    return new AuditLog(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public AuditLog rename(Name name) {
    return new AuditLog(name, null);
  }

  // -------------------------------------------------------------------------
  // Row5 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row5<Integer, String, String, LocalDateTime, String> fieldsRow() {
    return (Row5) super.fieldsRow();
  }
}
