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
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity InvoiceItemCategorySummary.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectInvoiceItemCategorySummarys", query="SELECT INV.STATUS_ID AS \"statusId\",INV.INVOICE_DATE AS \"invoiceDate\",INV.INVOICE_TYPE_ID AS \"invoiceTypeId\",INV.PARTY_ID_FROM AS \"partyIdFrom\",INV.PARTY_ID AS \"partyId\",INV.CURRENCY_UOM_ID AS \"currencyUomId\",INITM.INVOICE_ITEM_TYPE_ID AS \"invoiceItemTypeId\",INITM.PRODUCT_ID AS \"productId\",INITM.QUANTITY AS \"quantity\",INITM.AMOUNT AS \"amount\",PCM.PRODUCT_CATEGORY_ID AS \"productCategoryId\" FROM INVOICE INV INNER JOIN INVOICE_ITEM INITM ON INV.INVOICE_ID = INITM.INVOICE_ID INNER JOIN PRODUCT_CATEGORY_MEMBER PCM ON INITM.PRODUCT_ID = PCM.PRODUCT_ID", resultSetMapping="InvoiceItemCategorySummaryMapping")
@SqlResultSetMapping(name="InvoiceItemCategorySummaryMapping", entities={
@EntityResult(entityClass=InvoiceItemCategorySummary.class, fields = {
@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="invoiceDate", column="invoiceDate")
,@FieldResult(name="invoiceTypeId", column="invoiceTypeId")
,@FieldResult(name="partyIdFrom", column="partyIdFrom")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="invoiceItemTypeId", column="invoiceItemTypeId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="quantityTotal", column="quantityTotal")
,@FieldResult(name="amountTotal", column="amountTotal")
,@FieldResult(name="productCategoryId", column="productCategoryId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class InvoiceItemCategorySummary extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("statusId", "INV.STATUS_ID");
        fields.put("invoiceDate", "INV.INVOICE_DATE");
        fields.put("invoiceTypeId", "INV.INVOICE_TYPE_ID");
        fields.put("partyIdFrom", "INV.PARTY_ID_FROM");
        fields.put("partyId", "INV.PARTY_ID");
        fields.put("currencyUomId", "INV.CURRENCY_UOM_ID");
        fields.put("invoiceItemTypeId", "INITM.INVOICE_ITEM_TYPE_ID");
        fields.put("productId", "INITM.PRODUCT_ID");
        fields.put("quantityTotal", "INITM.QUANTITY");
        fields.put("amountTotal", "INITM.AMOUNT");
        fields.put("productCategoryId", "PCM.PRODUCT_CATEGORY_ID");
fieldMapColumns.put("InvoiceItemCategorySummary", fields);
}
  public static enum Fields implements EntityFieldInterface<InvoiceItemCategorySummary> {
    statusId("statusId"),
    invoiceDate("invoiceDate"),
    invoiceTypeId("invoiceTypeId"),
    partyIdFrom("partyIdFrom"),
    partyId("partyId"),
    currencyUomId("currencyUomId"),
    invoiceItemTypeId("invoiceItemTypeId"),
    productId("productId"),
    quantityTotal("quantityTotal"),
    amountTotal("amountTotal"),
    productCategoryId("productCategoryId");
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
   private String statusId;
    
   private Timestamp invoiceDate;
    
   private String invoiceTypeId;
    
   private String partyIdFrom;
    
   private String partyId;
    
   private String currencyUomId;
    
   private String invoiceItemTypeId;
    
   private String productId;
    
   private BigDecimal quantityTotal;
    
   private BigDecimal amountTotal;
    
   private String productCategoryId;

  /**
   * Default constructor.
   */
  public InvoiceItemCategorySummary() {
      super();
      this.baseEntityName = "InvoiceItemCategorySummary";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productCategoryId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("statusId");this.allFieldsNames.add("invoiceDate");this.allFieldsNames.add("invoiceTypeId");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyId");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("invoiceItemTypeId");this.allFieldsNames.add("productId");this.allFieldsNames.add("quantityTotal");this.allFieldsNames.add("amountTotal");this.allFieldsNames.add("productCategoryId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public InvoiceItemCategorySummary(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param invoiceDate the invoiceDate to set
     */
    public void setInvoiceDate(Timestamp invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    /**
     * Auto generated value setter.
     * @param invoiceTypeId the invoiceTypeId to set
     */
    public void setInvoiceTypeId(String invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }
    /**
     * Auto generated value setter.
     * @param partyIdFrom the partyIdFrom to set
     */
    public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param invoiceItemTypeId the invoiceItemTypeId to set
     */
    public void setInvoiceItemTypeId(String invoiceItemTypeId) {
        this.invoiceItemTypeId = invoiceItemTypeId;
    }
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param quantityTotal the quantityTotal to set
     */
    public void setQuantityTotal(BigDecimal quantityTotal) {
        this.quantityTotal = quantityTotal;
    }
    /**
     * Auto generated value setter.
     * @param amountTotal the amountTotal to set
     */
    public void setAmountTotal(BigDecimal amountTotal) {
        this.amountTotal = amountTotal;
    }
    /**
     * Auto generated value setter.
     * @param productCategoryId the productCategoryId to set
     */
    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInvoiceDate() {
        return this.invoiceDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceTypeId() {
        return this.invoiceTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdFrom() {
        return this.partyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyUomId() {
        return this.currencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceItemTypeId() {
        return this.invoiceItemTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductId() {
        return this.productId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityTotal() {
        return this.quantityTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAmountTotal() {
        return this.amountTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductCategoryId() {
        return this.productCategoryId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setStatusId((String) mapValue.get("statusId"));
        setInvoiceDate((Timestamp) mapValue.get("invoiceDate"));
        setInvoiceTypeId((String) mapValue.get("invoiceTypeId"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setPartyId((String) mapValue.get("partyId"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setInvoiceItemTypeId((String) mapValue.get("invoiceItemTypeId"));
        setProductId((String) mapValue.get("productId"));
        setQuantityTotal(convertToBigDecimal(mapValue.get("quantityTotal")));
        setAmountTotal(convertToBigDecimal(mapValue.get("amountTotal")));
        setProductCategoryId((String) mapValue.get("productCategoryId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("statusId", getStatusId());
        mapValue.put("invoiceDate", getInvoiceDate());
        mapValue.put("invoiceTypeId", getInvoiceTypeId());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("partyId", getPartyId());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("invoiceItemTypeId", getInvoiceItemTypeId());
        mapValue.put("productId", getProductId());
        mapValue.put("quantityTotal", getQuantityTotal());
        mapValue.put("amountTotal", getAmountTotal());
        mapValue.put("productCategoryId", getProductCategoryId());
        return mapValue;
    }


}
