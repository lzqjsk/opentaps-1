package org.opentaps.domain.base.entities;

/*
* Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
*
* This program is free software; you can redistribute it and/or modify
* it under the terms of the Honest Public License.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* Honest Public License for more details.
*
* You should have received a copy of the Honest Public License
* along with this program; if not, write to Funambol,
* 643 Bair Island Road, Suite 305 - Redwood City, CA 94063, USA
*/

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity TestEntityAndItem.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectTestEntityAndItems", query="SELECT TEI.TEST_ENTITY_ID AS \"testEntityId\",TEI.TEST_ENTITY_ITEM_SEQ_ID AS \"testEntityItemSeqId\",TEI.ITEM_VALUE AS \"itemValue\",TE.TEST_ID AS \"testId\",TE.TEST_STRING_FIELD AS \"testStringField\",TE.TEST_DATE_TIME_FIELD AS \"testDateTimeField\",TE.TEST_NUMERIC_FIELD AS \"testNumericField\",TE.TEST_FLOATING_POINT_FIELD AS \"testFloatingPointField\",TE.TEST_CURRENCY_PRECISE_FIELD AS \"testCurrencyPreciseField\",TE.TEST_CREDIT_CARD_NUMBER_FIELD AS \"testCreditCardNumberField\",TE.TEST_CREDIT_CARD_DATE_FIELD AS \"testCreditCardDateField\",TE.TEST_EMAIL_FIELD AS \"testEmailField\",TE.TEST_URL_FIELD AS \"testUrlField\",TE.TEST_TELPHONE_FIELD AS \"testTelphoneField\",TE.ENUM_ID AS \"enumId\",TE.TEST_ENCRYPT AS \"testEncrypt\" FROM TEST_ENTITY_ITEM TEI LEFT JOIN TEST_ENTITY TE ON TEI.TEST_ENTITY_ID = TE.TEST_ID", resultSetMapping="TestEntityAndItemMapping")
@SqlResultSetMapping(name="TestEntityAndItemMapping", entities={
@EntityResult(entityClass=TestEntityAndItem.class, fields = {
@FieldResult(name="testEntityId", column="testEntityId")
,@FieldResult(name="testEntityItemSeqId", column="testEntityItemSeqId")
,@FieldResult(name="itemValue", column="itemValue")
,@FieldResult(name="testId", column="testId")
,@FieldResult(name="testStringField", column="testStringField")
,@FieldResult(name="testDateTimeField", column="testDateTimeField")
,@FieldResult(name="testNumericField", column="testNumericField")
,@FieldResult(name="testFloatingPointField", column="testFloatingPointField")
,@FieldResult(name="testCurrencyPreciseField", column="testCurrencyPreciseField")
,@FieldResult(name="testCreditCardNumberField", column="testCreditCardNumberField")
,@FieldResult(name="testCreditCardDateField", column="testCreditCardDateField")
,@FieldResult(name="testEmailField", column="testEmailField")
,@FieldResult(name="testUrlField", column="testUrlField")
,@FieldResult(name="testTelphoneField", column="testTelphoneField")
,@FieldResult(name="enumId", column="enumId")
,@FieldResult(name="testEncrypt", column="testEncrypt")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class TestEntityAndItem extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("testEntityId", "TEI.TEST_ENTITY_ID");
        fields.put("testEntityItemSeqId", "TEI.TEST_ENTITY_ITEM_SEQ_ID");
        fields.put("itemValue", "TEI.ITEM_VALUE");
        fields.put("testId", "TE.TEST_ID");
        fields.put("testStringField", "TE.TEST_STRING_FIELD");
        fields.put("testDateTimeField", "TE.TEST_DATE_TIME_FIELD");
        fields.put("testNumericField", "TE.TEST_NUMERIC_FIELD");
        fields.put("testFloatingPointField", "TE.TEST_FLOATING_POINT_FIELD");
        fields.put("testCurrencyPreciseField", "TE.TEST_CURRENCY_PRECISE_FIELD");
        fields.put("testCreditCardNumberField", "TE.TEST_CREDIT_CARD_NUMBER_FIELD");
        fields.put("testCreditCardDateField", "TE.TEST_CREDIT_CARD_DATE_FIELD");
        fields.put("testEmailField", "TE.TEST_EMAIL_FIELD");
        fields.put("testUrlField", "TE.TEST_URL_FIELD");
        fields.put("testTelphoneField", "TE.TEST_TELPHONE_FIELD");
        fields.put("enumId", "TE.ENUM_ID");
        fields.put("testEncrypt", "TE.TEST_ENCRYPT");
fieldMapColumns.put("TestEntityAndItem", fields);
}
  public static enum Fields implements EntityFieldInterface<TestEntityAndItem> {
    testEntityId("testEntityId"),
    testEntityItemSeqId("testEntityItemSeqId"),
    itemValue("itemValue"),
    testId("testId"),
    testStringField("testStringField"),
    testDateTimeField("testDateTimeField"),
    testNumericField("testNumericField"),
    testFloatingPointField("testFloatingPointField"),
    testCurrencyPreciseField("testCurrencyPreciseField"),
    testCreditCardNumberField("testCreditCardNumberField"),
    testCreditCardDateField("testCreditCardDateField"),
    testEmailField("testEmailField"),
    testUrlField("testUrlField"),
    testTelphoneField("testTelphoneField"),
    enumId("enumId"),
    testEncrypt("testEncrypt");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String testEntityId;
    
   private String testEntityItemSeqId;
    
   private String itemValue;
    
   private String testId;
    
   private String testStringField;
    
   private Timestamp testDateTimeField;
    
   private Long testNumericField;
    
   private BigDecimal testFloatingPointField;
    
   private BigDecimal testCurrencyPreciseField;
    
   private String testCreditCardNumberField;
    
   private String testCreditCardDateField;
    
   private String testEmailField;
    
   private String testUrlField;
    
   private String testTelphoneField;
    
   private String enumId;
    
   private String testEncrypt;

  /**
   * Default constructor.
   */
  public TestEntityAndItem() {
      super();
      this.baseEntityName = "TestEntityAndItem";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("testEntityId");this.primaryKeyNames.add("testEntityItemSeqId");this.primaryKeyNames.add("testId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("testEntityId");this.allFieldsNames.add("testEntityItemSeqId");this.allFieldsNames.add("itemValue");this.allFieldsNames.add("testId");this.allFieldsNames.add("testStringField");this.allFieldsNames.add("testDateTimeField");this.allFieldsNames.add("testNumericField");this.allFieldsNames.add("testFloatingPointField");this.allFieldsNames.add("testCurrencyPreciseField");this.allFieldsNames.add("testCreditCardNumberField");this.allFieldsNames.add("testCreditCardDateField");this.allFieldsNames.add("testEmailField");this.allFieldsNames.add("testUrlField");this.allFieldsNames.add("testTelphoneField");this.allFieldsNames.add("enumId");this.allFieldsNames.add("testEncrypt");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TestEntityAndItem(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param testEntityId the testEntityId to set
     */
    public void setTestEntityId(String testEntityId) {
        this.testEntityId = testEntityId;
    }
    /**
     * Auto generated value setter.
     * @param testEntityItemSeqId the testEntityItemSeqId to set
     */
    public void setTestEntityItemSeqId(String testEntityItemSeqId) {
        this.testEntityItemSeqId = testEntityItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param itemValue the itemValue to set
     */
    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }
    /**
     * Auto generated value setter.
     * @param testId the testId to set
     */
    public void setTestId(String testId) {
        this.testId = testId;
    }
    /**
     * Auto generated value setter.
     * @param testStringField the testStringField to set
     */
    public void setTestStringField(String testStringField) {
        this.testStringField = testStringField;
    }
    /**
     * Auto generated value setter.
     * @param testDateTimeField the testDateTimeField to set
     */
    public void setTestDateTimeField(Timestamp testDateTimeField) {
        this.testDateTimeField = testDateTimeField;
    }
    /**
     * Auto generated value setter.
     * @param testNumericField the testNumericField to set
     */
    public void setTestNumericField(Long testNumericField) {
        this.testNumericField = testNumericField;
    }
    /**
     * Auto generated value setter.
     * @param testFloatingPointField the testFloatingPointField to set
     */
    public void setTestFloatingPointField(BigDecimal testFloatingPointField) {
        this.testFloatingPointField = testFloatingPointField;
    }
    /**
     * Auto generated value setter.
     * @param testCurrencyPreciseField the testCurrencyPreciseField to set
     */
    public void setTestCurrencyPreciseField(BigDecimal testCurrencyPreciseField) {
        this.testCurrencyPreciseField = testCurrencyPreciseField;
    }
    /**
     * Auto generated value setter.
     * @param testCreditCardNumberField the testCreditCardNumberField to set
     */
    public void setTestCreditCardNumberField(String testCreditCardNumberField) {
        this.testCreditCardNumberField = testCreditCardNumberField;
    }
    /**
     * Auto generated value setter.
     * @param testCreditCardDateField the testCreditCardDateField to set
     */
    public void setTestCreditCardDateField(String testCreditCardDateField) {
        this.testCreditCardDateField = testCreditCardDateField;
    }
    /**
     * Auto generated value setter.
     * @param testEmailField the testEmailField to set
     */
    public void setTestEmailField(String testEmailField) {
        this.testEmailField = testEmailField;
    }
    /**
     * Auto generated value setter.
     * @param testUrlField the testUrlField to set
     */
    public void setTestUrlField(String testUrlField) {
        this.testUrlField = testUrlField;
    }
    /**
     * Auto generated value setter.
     * @param testTelphoneField the testTelphoneField to set
     */
    public void setTestTelphoneField(String testTelphoneField) {
        this.testTelphoneField = testTelphoneField;
    }
    /**
     * Auto generated value setter.
     * @param enumId the enumId to set
     */
    public void setEnumId(String enumId) {
        this.enumId = enumId;
    }
    /**
     * Auto generated value setter.
     * @param testEncrypt the testEncrypt to set
     */
    public void setTestEncrypt(String testEncrypt) {
        this.testEncrypt = testEncrypt;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestEntityId() {
        return this.testEntityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestEntityItemSeqId() {
        return this.testEntityItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemValue() {
        return this.itemValue;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestId() {
        return this.testId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestStringField() {
        return this.testStringField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getTestDateTimeField() {
        return this.testDateTimeField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getTestNumericField() {
        return this.testNumericField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTestFloatingPointField() {
        return this.testFloatingPointField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTestCurrencyPreciseField() {
        return this.testCurrencyPreciseField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestCreditCardNumberField() {
        return this.testCreditCardNumberField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestCreditCardDateField() {
        return this.testCreditCardDateField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestEmailField() {
        return this.testEmailField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestUrlField() {
        return this.testUrlField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestTelphoneField() {
        return this.testTelphoneField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEnumId() {
        return this.enumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestEncrypt() {
        return this.testEncrypt;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTestEntityId((String) mapValue.get("testEntityId"));
        setTestEntityItemSeqId((String) mapValue.get("testEntityItemSeqId"));
        setItemValue((String) mapValue.get("itemValue"));
        setTestId((String) mapValue.get("testId"));
        setTestStringField((String) mapValue.get("testStringField"));
        setTestDateTimeField((Timestamp) mapValue.get("testDateTimeField"));
        setTestNumericField((Long) mapValue.get("testNumericField"));
        setTestFloatingPointField(convertToBigDecimal(mapValue.get("testFloatingPointField")));
        setTestCurrencyPreciseField(convertToBigDecimal(mapValue.get("testCurrencyPreciseField")));
        setTestCreditCardNumberField((String) mapValue.get("testCreditCardNumberField"));
        setTestCreditCardDateField((String) mapValue.get("testCreditCardDateField"));
        setTestEmailField((String) mapValue.get("testEmailField"));
        setTestUrlField((String) mapValue.get("testUrlField"));
        setTestTelphoneField((String) mapValue.get("testTelphoneField"));
        setEnumId((String) mapValue.get("enumId"));
        setTestEncrypt((String) mapValue.get("testEncrypt"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("testEntityId", getTestEntityId());
        mapValue.put("testEntityItemSeqId", getTestEntityItemSeqId());
        mapValue.put("itemValue", getItemValue());
        mapValue.put("testId", getTestId());
        mapValue.put("testStringField", getTestStringField());
        mapValue.put("testDateTimeField", getTestDateTimeField());
        mapValue.put("testNumericField", getTestNumericField());
        mapValue.put("testFloatingPointField", getTestFloatingPointField());
        mapValue.put("testCurrencyPreciseField", getTestCurrencyPreciseField());
        mapValue.put("testCreditCardNumberField", getTestCreditCardNumberField());
        mapValue.put("testCreditCardDateField", getTestCreditCardDateField());
        mapValue.put("testEmailField", getTestEmailField());
        mapValue.put("testUrlField", getTestUrlField());
        mapValue.put("testTelphoneField", getTestTelphoneField());
        mapValue.put("enumId", getEnumId());
        mapValue.put("testEncrypt", getTestEncrypt());
        return mapValue;
    }


}
