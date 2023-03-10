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
public enum LabelLabelType implements EnumType {

  name("name"),

  description("description"),

  hint("hint"),

  when_true("when-true"),

  when_false("when-false"),

  text("text"),

  template("template");

  private final String literal;

  private LabelLabelType(String literal) {
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
    return "label_label_type";
  }

  @Override
  public String getLiteral() {
    return literal;
  }
}
