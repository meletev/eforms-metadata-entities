/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum FieldType implements EnumType {

  amount("amount"),

  code("code"),

  date("date"),

  email("email"),

  id("id"),

  id_ref("id-ref"),

  indicator("indicator"),

  integer("integer"),

  measure("measure"),

  number("number"),

  phone("phone"),

  text("text"),

  text_multilingual("text-multilingual"),

  time("time"),

  url("url");

  private final String literal;

  private FieldType(String literal) {
    this.literal = literal;
  }

  @Override
  public Catalog getCatalog() {
    return null;
  }

  @Override
  public Schema getSchema() {
    return null;
  }

  @Override
  public String getName() {
    return "field_type";
  }

  @Override
  public String getLiteral() {
    return literal;
  }
}
