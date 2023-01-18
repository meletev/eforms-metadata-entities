/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.records;


import eu.europa.ec.mdd.generated.enums.LabelAssetType;
import eu.europa.ec.mdd.generated.enums.LabelLabelType;
import eu.europa.ec.mdd.generated.tables.Label;
import eu.europa.ec.mdd.generated.tables.interfaces.ILabel;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LabelRecord extends UpdatableRecordImpl<LabelRecord> implements ILabel {

  private static final long serialVersionUID = 1L;

  /**
   * Setter for <code>label.id</code>.
   */
  @Override
  public void setId(String value) {
    set(0, value);
  }

  /**
   * Getter for <code>label.id</code>.
   */
  @Override
  public String getId() {
    return (String) get(0);
  }

  /**
   * Setter for <code>label.asset_type</code>.
   */
  @Override
  public void setAssetType(LabelAssetType value) {
    set(1, value);
  }

  /**
   * Getter for <code>label.asset_type</code>.
   */
  @Override
  public LabelAssetType getAssetType() {
    return (LabelAssetType) get(1);
  }

  /**
   * Setter for <code>label.label_type</code>.
   */
  @Override
  public void setLabelType(LabelLabelType value) {
    set(2, value);
  }

  /**
   * Getter for <code>label.label_type</code>.
   */
  @Override
  public LabelLabelType getLabelType() {
    return (LabelLabelType) get(2);
  }

  /**
   * Setter for <code>label.asset_id</code>.
   */
  @Override
  public void setAssetId(String value) {
    set(3, value);
  }

  /**
   * Getter for <code>label.asset_id</code>.
   */
  @Override
  public String getAssetId() {
    return (String) get(3);
  }

  /**
   * Setter for <code>label.old_id</code>.
   */
  @Override
  public void setOldId(String value) {
    set(4, value);
  }

  /**
   * Getter for <code>label.old_id</code>.
   */
  @Override
  public String getOldId() {
    return (String) get(4);
  }

  /**
   * Setter for <code>label.comment</code>.
   */
  @Override
  public void setComment(String value) {
    set(5, value);
  }

  /**
   * Getter for <code>label.comment</code>.
   */
  @Override
  public String getComment() {
    return (String) get(5);
  }

  /**
   * Setter for <code>label.generated</code>.
   */
  @Override
  public void setGenerated(Boolean value) {
    set(6, value);
  }

  /**
   * Getter for <code>label.generated</code>.
   */
  @Override
  public Boolean getGenerated() {
    return (Boolean) get(6);
  }

  /**
   * Setter for <code>label.en</code>.
   */
  @Override
  public void setEn(String value) {
    set(7, value);
  }

  /**
   * Getter for <code>label.en</code>.
   */
  @Override
  public String getEn() {
    return (String) get(7);
  }

  /**
   * Setter for <code>label.fr</code>.
   */
  @Override
  public void setFr(String value) {
    set(8, value);
  }

  /**
   * Getter for <code>label.fr</code>.
   */
  @Override
  public String getFr() {
    return (String) get(8);
  }

  /**
   * Setter for <code>label.de</code>.
   */
  @Override
  public void setDe(String value) {
    set(9, value);
  }

  /**
   * Getter for <code>label.de</code>.
   */
  @Override
  public String getDe() {
    return (String) get(9);
  }

  /**
   * Setter for <code>label.bg</code>.
   */
  @Override
  public void setBg(String value) {
    set(10, value);
  }

  /**
   * Getter for <code>label.bg</code>.
   */
  @Override
  public String getBg() {
    return (String) get(10);
  }

  /**
   * Setter for <code>label.cs</code>.
   */
  @Override
  public void setCs(String value) {
    set(11, value);
  }

  /**
   * Getter for <code>label.cs</code>.
   */
  @Override
  public String getCs() {
    return (String) get(11);
  }

  /**
   * Setter for <code>label.da</code>.
   */
  @Override
  public void setDa(String value) {
    set(12, value);
  }

  /**
   * Getter for <code>label.da</code>.
   */
  @Override
  public String getDa() {
    return (String) get(12);
  }

  /**
   * Setter for <code>label.el</code>.
   */
  @Override
  public void setEl(String value) {
    set(13, value);
  }

  /**
   * Getter for <code>label.el</code>.
   */
  @Override
  public String getEl() {
    return (String) get(13);
  }

  /**
   * Setter for <code>label.es</code>.
   */
  @Override
  public void setEs(String value) {
    set(14, value);
  }

  /**
   * Getter for <code>label.es</code>.
   */
  @Override
  public String getEs() {
    return (String) get(14);
  }

  /**
   * Setter for <code>label.et</code>.
   */
  @Override
  public void setEt(String value) {
    set(15, value);
  }

  /**
   * Getter for <code>label.et</code>.
   */
  @Override
  public String getEt() {
    return (String) get(15);
  }

  /**
   * Setter for <code>label.fi</code>.
   */
  @Override
  public void setFi(String value) {
    set(16, value);
  }

  /**
   * Getter for <code>label.fi</code>.
   */
  @Override
  public String getFi() {
    return (String) get(16);
  }

  /**
   * Setter for <code>label.ga</code>.
   */
  @Override
  public void setGa(String value) {
    set(17, value);
  }

  /**
   * Getter for <code>label.ga</code>.
   */
  @Override
  public String getGa() {
    return (String) get(17);
  }

  /**
   * Setter for <code>label.hr</code>.
   */
  @Override
  public void setHr(String value) {
    set(18, value);
  }

  /**
   * Getter for <code>label.hr</code>.
   */
  @Override
  public String getHr() {
    return (String) get(18);
  }

  /**
   * Setter for <code>label.hu</code>.
   */
  @Override
  public void setHu(String value) {
    set(19, value);
  }

  /**
   * Getter for <code>label.hu</code>.
   */
  @Override
  public String getHu() {
    return (String) get(19);
  }

  /**
   * Setter for <code>label.it</code>.
   */
  @Override
  public void setIt(String value) {
    set(20, value);
  }

  /**
   * Getter for <code>label.it</code>.
   */
  @Override
  public String getIt() {
    return (String) get(20);
  }

  /**
   * Setter for <code>label.lt</code>.
   */
  @Override
  public void setLt(String value) {
    set(21, value);
  }

  /**
   * Getter for <code>label.lt</code>.
   */
  @Override
  public String getLt() {
    return (String) get(21);
  }

  /**
   * Setter for <code>label.lv</code>.
   */
  @Override
  public void setLv(String value) {
    set(22, value);
  }

  /**
   * Getter for <code>label.lv</code>.
   */
  @Override
  public String getLv() {
    return (String) get(22);
  }

  /**
   * Setter for <code>label.mt</code>.
   */
  @Override
  public void setMt(String value) {
    set(23, value);
  }

  /**
   * Getter for <code>label.mt</code>.
   */
  @Override
  public String getMt() {
    return (String) get(23);
  }

  /**
   * Setter for <code>label.nl</code>.
   */
  @Override
  public void setNl(String value) {
    set(24, value);
  }

  /**
   * Getter for <code>label.nl</code>.
   */
  @Override
  public String getNl() {
    return (String) get(24);
  }

  /**
   * Setter for <code>label.pl</code>.
   */
  @Override
  public void setPl(String value) {
    set(25, value);
  }

  /**
   * Getter for <code>label.pl</code>.
   */
  @Override
  public String getPl() {
    return (String) get(25);
  }

  /**
   * Setter for <code>label.pt</code>.
   */
  @Override
  public void setPt(String value) {
    set(26, value);
  }

  /**
   * Getter for <code>label.pt</code>.
   */
  @Override
  public String getPt() {
    return (String) get(26);
  }

  /**
   * Setter for <code>label.ro</code>.
   */
  @Override
  public void setRo(String value) {
    set(27, value);
  }

  /**
   * Getter for <code>label.ro</code>.
   */
  @Override
  public String getRo() {
    return (String) get(27);
  }

  /**
   * Setter for <code>label.sk</code>.
   */
  @Override
  public void setSk(String value) {
    set(28, value);
  }

  /**
   * Getter for <code>label.sk</code>.
   */
  @Override
  public String getSk() {
    return (String) get(28);
  }

  /**
   * Setter for <code>label.sl</code>.
   */
  @Override
  public void setSl(String value) {
    set(29, value);
  }

  /**
   * Getter for <code>label.sl</code>.
   */
  @Override
  public String getSl() {
    return (String) get(29);
  }

  /**
   * Setter for <code>label.sv</code>.
   */
  @Override
  public void setSv(String value) {
    set(30, value);
  }

  /**
   * Getter for <code>label.sv</code>.
   */
  @Override
  public String getSv() {
    return (String) get(30);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  @Override
  public Record1<String> key() {
    return (Record1) super.key();
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(ILabel from) {
    setId(from.getId());
    setAssetType(from.getAssetType());
    setLabelType(from.getLabelType());
    setAssetId(from.getAssetId());
    setOldId(from.getOldId());
    setComment(from.getComment());
    setGenerated(from.getGenerated());
    setEn(from.getEn());
    setFr(from.getFr());
    setDe(from.getDe());
    setBg(from.getBg());
    setCs(from.getCs());
    setDa(from.getDa());
    setEl(from.getEl());
    setEs(from.getEs());
    setEt(from.getEt());
    setFi(from.getFi());
    setGa(from.getGa());
    setHr(from.getHr());
    setHu(from.getHu());
    setIt(from.getIt());
    setLt(from.getLt());
    setLv(from.getLv());
    setMt(from.getMt());
    setNl(from.getNl());
    setPl(from.getPl());
    setPt(from.getPt());
    setRo(from.getRo());
    setSk(from.getSk());
    setSl(from.getSl());
    setSv(from.getSv());
  }

  @Override
  public <E extends ILabel> E into(E into) {
    into.from(this);
    return into;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached LabelRecord
   */
  public LabelRecord() {
    super(Label.LABEL);
  }

  /**
   * Create a detached, initialised LabelRecord
   */
  public LabelRecord(String id, LabelAssetType assetType, LabelLabelType labelType, String assetId, String oldId, String comment, Boolean generated, String en, String fr, String de, String bg, String cs, String da, String el, String es, String et, String fi, String ga, String hr, String hu, String it, String lt, String lv, String mt, String nl, String pl, String pt, String ro, String sk, String sl, String sv) {
    super(Label.LABEL);

    setId(id);
    setAssetType(assetType);
    setLabelType(labelType);
    setAssetId(assetId);
    setOldId(oldId);
    setComment(comment);
    setGenerated(generated);
    setEn(en);
    setFr(fr);
    setDe(de);
    setBg(bg);
    setCs(cs);
    setDa(da);
    setEl(el);
    setEs(es);
    setEt(et);
    setFi(fi);
    setGa(ga);
    setHr(hr);
    setHu(hu);
    setIt(it);
    setLt(lt);
    setLv(lv);
    setMt(mt);
    setNl(nl);
    setPl(pl);
    setPt(pt);
    setRo(ro);
    setSk(sk);
    setSl(sl);
    setSv(sv);
  }
}
