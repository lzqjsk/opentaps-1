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
import java.sql.Timestamp;

/**
 * Auto generated base entity InvoiceAndType.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectInvoiceAndTypes", query="SELECT INV.INVOICE_ID AS \"invoiceId\",INV.INVOICE_TYPE_ID AS \"invoiceTypeId\",INV.PARTY_ID_FROM AS \"partyIdFrom\",INV.PARTY_ID AS \"partyId\",INV.ROLE_TYPE_ID AS \"roleTypeId\",INV.STATUS_ID AS \"statusId\",INV.BILLING_ACCOUNT_ID AS \"billingAccountId\",INV.CONTACT_MECH_ID AS \"contactMechId\",INV.INVOICE_DATE AS \"invoiceDate\",INV.DUE_DATE AS \"dueDate\",INV.PAID_DATE AS \"paidDate\",INV.INVOICE_MESSAGE AS \"invoiceMessage\",INV.REFERENCE_NUMBER AS \"referenceNumber\",INV.DESCRIPTION AS \"description\",INV.CURRENCY_UOM_ID AS \"currencyUomId\",INV.RECURRENCE_INFO_ID AS \"recurrenceInfoId\",INV.PROCESSING_STATUS_ID AS \"processingStatusId\",IVT.PARENT_TYPE_ID AS \"parentTypeId\",IVT.HAS_TABLE AS \"hasTable\" FROM INVOICE INV INNER JOIN INVOICE_TYPE IVT ON INV.INVOICE_TYPE_ID = IVT.INVOICE_TYPE_ID", resultSetMapping="InvoiceAndTypeMapping")
@SqlResultSetMapping(name="InvoiceAndTypeMapping", entities={
@EntityResult(entityClass=InvoiceAndType.class, fields = {
@FieldResult(name="invoiceId", column="invoiceId")
,@FieldResult(name="invoiceTypeId", column="invoiceTypeId")
,@FieldResult(name="partyIdFrom", column="partyIdFrom")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="billingAccountId", column="billingAccountId")
,@FieldResult(name="contactMechId", column="contactMechId")
,@FieldResult(name="invoiceDate", column="invoiceDate")
,@FieldResult(name="dueDate", column="dueDate")
,@FieldResult(name="paidDate", column="paidDate")
,@FieldResult(name="invoiceMessage", column="invoiceMessage")
,@FieldResult(name="referenceNumber", column="referenceNumber")
,@FieldResult(name="description", column="description")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="recurrenceInfoId", column="recurrenceInfoId")
,@FieldResult(name="processingStatusId", column="processingStatusId")
,@FieldResult(name="parentTypeId", column="parentTypeId")
,@FieldResult(name="hasTable", column="hasTable")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class InvoiceAndType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("invoiceId", "INV.INVOICE_ID");
        fields.put("invoiceTypeId", "INV.INVOICE_TYPE_ID");
        fields.put("partyIdFrom", "INV.PARTY_ID_FROM");
        fields.put("partyId", "INV.PARTY_ID");
        fields.put("roleTypeId", "INV.ROLE_TYPE_ID");
        fields.put("statusId", "INV.STATUS_ID");
        fields.put("billingAccountId", "INV.BILLING_ACCOUNT_ID");
        fields.put("contactMechId", "INV.CONTACT_MECH_ID");
        fields.put("invoiceDate", "INV.INVOICE_DATE");
        fields.put("dueDate", "INV.DUE_DATE");
        fields.put("paidDate", "INV.PAID_DATE");
        fields.put("invoiceMessage", "INV.INVOICE_MESSAGE");
        fields.put("referenceNumber", "INV.REFERENCE_NUMBER");
        fields.put("description", "INV.DESCRIPTION");
        fields.put("currencyUomId", "INV.CURRENCY_UOM_ID");
        fields.put("recurrenceInfoId", "INV.RECURRENCE_INFO_ID");
        fields.put("processingStatusId", "INV.PROCESSING_STATUS_ID");
        fields.put("parentTypeId", "IVT.PARENT_TYPE_ID");
        fields.put("hasTable", "IVT.HAS_TABLE");
fieldMapColumns.put("InvoiceAndType", fields);
}
  public static enum Fields implements EntityFieldInterface<InvoiceAndType> {
    invoiceId("invoiceId"),
    invoiceTypeId("invoiceTypeId"),
    partyIdFrom("partyIdFrom"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    statusId("statusId"),
    billingAccountId("billingAccountId"),
    contactMechId("contactMechId"),
    invoiceDate("invoiceDate"),
    dueDate("dueDate"),
    paidDate("paidDate"),
    invoiceMessage("invoiceMessage"),
    referenceNumber("referenceNumber"),
    description("description"),
    currencyUomId("currencyUomId"),
    recurrenceInfoId("recurrenceInfoId"),
    processingStatusId("processingStatusId"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable");
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
   private String invoiceId;
    
   private String invoiceTypeId;
    
   private String partyIdFrom;
    
   private String partyId;
    
   private String roleTypeId;
    
   private String statusId;
    
   private String billingAccountId;
    
   private String contactMechId;
    
   private Timestamp invoiceDate;
    
   private Timestamp dueDate;
    
   private Timestamp paidDate;
    
   private String invoiceMessage;
    
   private String referenceNumber;
    
   private String description;
    
   private String currencyUomId;
    
   private String recurrenceInfoId;
    
   private String processingStatusId;
    
   private String parentTypeId;
    
   private String hasTable;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="INVOICE_ID")
   
   private transient List<InvoiceItem> invoiceItems = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="INVOICE_ID")
   
   private transient List<PaymentApplication> paymentApplications = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="INVOICE_ID")
   
   private transient List<AcctgTrans> acctgTranses = null;

  /**
   * Default constructor.
   */
  public InvoiceAndType() {
      super();
      this.baseEntityName = "InvoiceAndType";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("invoiceId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("invoiceId");this.allFieldsNames.add("invoiceTypeId");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("billingAccountId");this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("invoiceDate");this.allFieldsNames.add("dueDate");this.allFieldsNames.add("paidDate");this.allFieldsNames.add("invoiceMessage");this.allFieldsNames.add("referenceNumber");this.allFieldsNames.add("description");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("recurrenceInfoId");this.allFieldsNames.add("processingStatusId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public InvoiceAndType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param invoiceId the invoiceId to set
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
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
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param billingAccountId the billingAccountId to set
     */
    public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }
    /**
     * Auto generated value setter.
     * @param contactMechId the contactMechId to set
     */
    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
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
     * @param dueDate the dueDate to set
     */
    public void setDueDate(Timestamp dueDate) {
        this.dueDate = dueDate;
    }
    /**
     * Auto generated value setter.
     * @param paidDate the paidDate to set
     */
    public void setPaidDate(Timestamp paidDate) {
        this.paidDate = paidDate;
    }
    /**
     * Auto generated value setter.
     * @param invoiceMessage the invoiceMessage to set
     */
    public void setInvoiceMessage(String invoiceMessage) {
        this.invoiceMessage = invoiceMessage;
    }
    /**
     * Auto generated value setter.
     * @param referenceNumber the referenceNumber to set
     */
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @param recurrenceInfoId the recurrenceInfoId to set
     */
    public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }
    /**
     * Auto generated value setter.
     * @param processingStatusId the processingStatusId to set
     */
    public void setProcessingStatusId(String processingStatusId) {
        this.processingStatusId = processingStatusId;
    }
    /**
     * Auto generated value setter.
     * @param parentTypeId the parentTypeId to set
     */
    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param hasTable the hasTable to set
     */
    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceId() {
        return this.invoiceId;
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
    public String getRoleTypeId() {
        return this.roleTypeId;
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
     * @return <code>String</code>
     */
    public String getBillingAccountId() {
        return this.billingAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechId() {
        return this.contactMechId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getDueDate() {
        return this.dueDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPaidDate() {
        return this.paidDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceMessage() {
        return this.invoiceMessage;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReferenceNumber() {
        return this.referenceNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
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
    public String getRecurrenceInfoId() {
        return this.recurrenceInfoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProcessingStatusId() {
        return this.processingStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentTypeId() {
        return this.parentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasTable() {
        return this.hasTable;
    }

    /**
     * Auto generated method that gets the related <code>InvoiceItem</code> by the relation named <code>InvoiceItem</code>.
     * @return the list of <code>InvoiceItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InvoiceItem> getInvoiceItems() throws RepositoryException {
        if (this.invoiceItems == null) {
            this.invoiceItems = getRelated(InvoiceItem.class, "InvoiceItem");
        }
        return this.invoiceItems;
    }
    /**
     * Auto generated method that gets the related <code>PaymentApplication</code> by the relation named <code>PaymentApplication</code>.
     * @return the list of <code>PaymentApplication</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PaymentApplication> getPaymentApplications() throws RepositoryException {
        if (this.paymentApplications == null) {
            this.paymentApplications = getRelated(PaymentApplication.class, "PaymentApplication");
        }
        return this.paymentApplications;
    }
    /**
     * Auto generated method that gets the related <code>AcctgTrans</code> by the relation named <code>AcctgTrans</code>.
     * @return the list of <code>AcctgTrans</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AcctgTrans> getAcctgTranses() throws RepositoryException {
        if (this.acctgTranses == null) {
            this.acctgTranses = getRelated(AcctgTrans.class, "AcctgTrans");
        }
        return this.acctgTranses;
    }

    /**
     * Auto generated value setter.
     * @param invoiceItems the invoiceItems to set
    */
    public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
    /**
     * Auto generated value setter.
     * @param paymentApplications the paymentApplications to set
    */
    public void setPaymentApplications(List<PaymentApplication> paymentApplications) {
        this.paymentApplications = paymentApplications;
    }
    /**
     * Auto generated value setter.
     * @param acctgTranses the acctgTranses to set
    */
    public void setAcctgTranses(List<AcctgTrans> acctgTranses) {
        this.acctgTranses = acctgTranses;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setInvoiceId((String) mapValue.get("invoiceId"));
        setInvoiceTypeId((String) mapValue.get("invoiceTypeId"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setStatusId((String) mapValue.get("statusId"));
        setBillingAccountId((String) mapValue.get("billingAccountId"));
        setContactMechId((String) mapValue.get("contactMechId"));
        setInvoiceDate((Timestamp) mapValue.get("invoiceDate"));
        setDueDate((Timestamp) mapValue.get("dueDate"));
        setPaidDate((Timestamp) mapValue.get("paidDate"));
        setInvoiceMessage((String) mapValue.get("invoiceMessage"));
        setReferenceNumber((String) mapValue.get("referenceNumber"));
        setDescription((String) mapValue.get("description"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setRecurrenceInfoId((String) mapValue.get("recurrenceInfoId"));
        setProcessingStatusId((String) mapValue.get("processingStatusId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("invoiceId", getInvoiceId());
        mapValue.put("invoiceTypeId", getInvoiceTypeId());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("billingAccountId", getBillingAccountId());
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("invoiceDate", getInvoiceDate());
        mapValue.put("dueDate", getDueDate());
        mapValue.put("paidDate", getPaidDate());
        mapValue.put("invoiceMessage", getInvoiceMessage());
        mapValue.put("referenceNumber", getReferenceNumber());
        mapValue.put("description", getDescription());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("recurrenceInfoId", getRecurrenceInfoId());
        mapValue.put("processingStatusId", getProcessingStatusId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        return mapValue;
    }


}
