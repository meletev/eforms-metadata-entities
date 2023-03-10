/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.pojos;


import eu.europa.ec.mdd.generated.tables.interfaces.IView;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class View implements IView {

  private static final long serialVersionUID = 1L;

  private String        id;
  private String        name;
  private String        description;
  private Boolean       draft;
  private LocalDateTime created;

  public View() {}

  public View(IView value) {
    this.id = value.getId();
    this.name = value.getName();
    this.description = value.getDescription();
    this.draft = value.getDraft();
    this.created = value.getCreated();
  }

  public View(
    String        id,
    String        name,
    String        description,
    Boolean       draft,
    LocalDateTime created
  ) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.draft = draft;
    this.created = created;
  }

  /**
   * Getter for <code>view.id</code>.
   */
  @Override
  public String getId() {
    return this.id;
  }

  /**
   * Setter for <code>view.id</code>.
   */
  @Override
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for <code>view.name</code>.
   */
  @Override
  public String getName() {
    return this.name;
  }

  /**
   * Setter for <code>view.name</code>.
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for <code>view.description</code>.
   */
  @Override
  public String getDescription() {
    return this.description;
  }

  /**
   * Setter for <code>view.description</code>.
   */
  @Override
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for <code>view.draft</code>. Drafts are excluded from the export
   */
  @Override
  public Boolean getDraft() {
    return this.draft;
  }

  /**
   * Setter for <code>view.draft</code>. Drafts are excluded from the export
   */
  @Override
  public void setDraft(Boolean draft) {
    this.draft = draft;
  }

  /**
   * Getter for <code>view.created</code>.
   */
  @Override
  public LocalDateTime getCreated() {
    return this.created;
  }

  /**
   * Setter for <code>view.created</code>.
   */
  @Override
  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("View (");

    sb.append(id);
    sb.append(", ").append(name);
    sb.append(", ").append(description);
    sb.append(", ").append(draft);
    sb.append(", ").append(created);

    sb.append(")");
    return sb.toString();
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(IView from) {
    setId(from.getId());
    setName(from.getName());
    setDescription(from.getDescription());
    setDraft(from.getDraft());
    setCreated(from.getCreated());
  }

  @Override
  public <E extends IView> E into(E into) {
    into.from(this);
    return into;
  }
}
