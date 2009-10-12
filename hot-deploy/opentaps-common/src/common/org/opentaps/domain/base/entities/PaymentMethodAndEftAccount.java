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
import java.sql.Timestamp;

/**
 * Auto generated base entity PaymentMethodAndEftAccount.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPaymentMethodAndEftAccounts", query="SELECT PM.PAYMENT_METHOD_ID AS \"paymentMethodId\",PM.PAYMENT_METHOD_TYPE_ID AS \"paymentMethodTypeId\",PM.PARTY_ID AS \"partyId\",PM.GL_ACCOUNT_ID AS \"glAccountId\",PM.FROM_DATE AS \"fromDate\",PM.THRU_DATE AS \"thruDate\",EA.BANK_NAME AS \"bankName\",EA.ROUTING_NUMBER AS \"routingNumber\",EA.ACCOUNT_TYPE AS \"accountType\",EA.ACCOUNT_NUMBER AS \"accountNumber\",EA.NAME_ON_ACCOUNT AS \"nameOnAccount\",EA.COMPANY_NAME_ON_ACCOUNT AS \"companyNameOnAccount\",EA.CONTACT_MECH_ID AS \"contactMechId\",EA.YEARS_AT_BANK AS \"yearsAtBank\" FROM PAYMENT_METHOD PM INNER JOIN EFT_ACCOUNT EA ON PM.PAYMENT_METHOD_ID = EA.PAYMENT_METHOD_ID", resultSetMapping="PaymentMethodAndEftAccountMapping")
@SqlResultSetMapping(name="PaymentMethodAndEftAccountMapping", entities={
@EntityResult(entityClass=PaymentMethodAndEftAccount.class, fields = {
@FieldResult(name="paymentMethodId", column="paymentMethodId")
,@FieldResult(name="paymentMethodTypeId", column="paymentMethodTypeId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="glAccountId", column="glAccountId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="bankName", column="bankName")
,@FieldResult(name="routingNumber", column="routingNumber")
,@FieldResult(name="accountType", column="accountType")
,@FieldResult(name="accountNumber", column="accountNumber")
,@FieldResult(name="nameOnAccount", column="nameOnAccount")
,@FieldResult(name="companyNameOnAccount", column="companyNameOnAccount")
,@FieldResult(name="contactMechId", column="contactMechId")
,@FieldResult(name="yearsAtBank", column="yearsAtBank")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PaymentMethodAndEftAccount extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("paymentMethodId", "PM.PAYMENT_METHOD_ID");
        fields.put("paymentMethodTypeId", "PM.PAYMENT_METHOD_TYPE_ID");
        fields.put("partyId", "PM.PARTY_ID");
        fields.put("glAccountId", "PM.GL_ACCOUNT_ID");
        fields.put("fromDate", "PM.FROM_DATE");
        fields.put("thruDate", "PM.THRU_DATE");
        fields.put("bankName", "EA.BANK_NAME");
        fields.put("routingNumber", "EA.ROUTING_NUMBER");
        fields.put("accountType", "EA.ACCOUNT_TYPE");
        fields.put("accountNumber", "EA.ACCOUNT_NUMBER");
        fields.put("nameOnAccount", "EA.NAME_ON_ACCOUNT");
        fields.put("companyNameOnAccount", "EA.COMPANY_NAME_ON_ACCOUNT");
        fields.put("contactMechId", "EA.CONTACT_MECH_ID");
        fields.put("yearsAtBank", "EA.YEARS_AT_BANK");
fieldMapColumns.put("PaymentMethodAndEftAccount", fields);
}
  public static enum Fields implements EntityFieldInterface<PaymentMethodAndEftAccount> {
    paymentMethodId("paymentMethodId"),
    paymentMethodTypeId("paymentMethodTypeId"),
    partyId("partyId"),
    glAccountId("glAccountId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    bankName("bankName"),
    routingNumber("routingNumber"),
    accountType("accountType"),
    accountNumber("accountNumber"),
    nameOnAccount("nameOnAccount"),
    companyNameOnAccount("companyNameOnAccount"),
    contactMechId("contactMechId"),
    yearsAtBank("yearsAtBank");
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
   private String paymentMethodId;
    
   private String paymentMethodTypeId;
    
   private String partyId;
    
   private String glAccountId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String bankName;
    
   private String routingNumber;
    
   private String accountType;
    
   private String accountNumber;
    
   private String nameOnAccount;
    
   private String companyNameOnAccount;
    
   private String contactMechId;
    
   private Long yearsAtBank;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentMethod paymentMethod = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentMethodType paymentMethodType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private EftAccount eftAccount = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PostalAddress postalAddress = null;

  /**
   * Default constructor.
   */
  public PaymentMethodAndEftAccount() {
      super();
      this.baseEntityName = "PaymentMethodAndEftAccount";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("paymentMethodId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("paymentMethodId");this.allFieldsNames.add("paymentMethodTypeId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("bankName");this.allFieldsNames.add("routingNumber");this.allFieldsNames.add("accountType");this.allFieldsNames.add("accountNumber");this.allFieldsNames.add("nameOnAccount");this.allFieldsNames.add("companyNameOnAccount");this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("yearsAtBank");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PaymentMethodAndEftAccount(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param paymentMethodId the paymentMethodId to set
     */
    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
    /**
     * Auto generated value setter.
     * @param paymentMethodTypeId the paymentMethodTypeId to set
     */
    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
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
     * @param glAccountId the glAccountId to set
     */
    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param bankName the bankName to set
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    /**
     * Auto generated value setter.
     * @param routingNumber the routingNumber to set
     */
    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }
    /**
     * Auto generated value setter.
     * @param accountType the accountType to set
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    /**
     * Auto generated value setter.
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    /**
     * Auto generated value setter.
     * @param nameOnAccount the nameOnAccount to set
     */
    public void setNameOnAccount(String nameOnAccount) {
        this.nameOnAccount = nameOnAccount;
    }
    /**
     * Auto generated value setter.
     * @param companyNameOnAccount the companyNameOnAccount to set
     */
    public void setCompanyNameOnAccount(String companyNameOnAccount) {
        this.companyNameOnAccount = companyNameOnAccount;
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
     * @param yearsAtBank the yearsAtBank to set
     */
    public void setYearsAtBank(Long yearsAtBank) {
        this.yearsAtBank = yearsAtBank;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentMethodTypeId() {
        return this.paymentMethodTypeId;
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
    public String getGlAccountId() {
        return this.glAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBankName() {
        return this.bankName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoutingNumber() {
        return this.routingNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountType() {
        return this.accountType;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNameOnAccount() {
        return this.nameOnAccount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCompanyNameOnAccount() {
        return this.companyNameOnAccount;
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
     * @return <code>Long</code>
     */
    public Long getYearsAtBank() {
        return this.yearsAtBank;
    }

    /**
     * Auto generated method that gets the related <code>PaymentMethod</code> by the relation named <code>PaymentMethod</code>.
     * @return the <code>PaymentMethod</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentMethod getPaymentMethod() throws RepositoryException {
        if (this.paymentMethod == null) {
            this.paymentMethod = getRelatedOne(PaymentMethod.class, "PaymentMethod");
        }
        return this.paymentMethod;
    }
    /**
     * Auto generated method that gets the related <code>PaymentMethodType</code> by the relation named <code>PaymentMethodType</code>.
     * @return the <code>PaymentMethodType</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentMethodType getPaymentMethodType() throws RepositoryException {
        if (this.paymentMethodType == null) {
            this.paymentMethodType = getRelatedOne(PaymentMethodType.class, "PaymentMethodType");
        }
        return this.paymentMethodType;
    }
    /**
     * Auto generated method that gets the related <code>EftAccount</code> by the relation named <code>EftAccount</code>.
     * @return the <code>EftAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public EftAccount getEftAccount() throws RepositoryException {
        if (this.eftAccount == null) {
            this.eftAccount = getRelatedOne(EftAccount.class, "EftAccount");
        }
        return this.eftAccount;
    }
    /**
     * Auto generated method that gets the related <code>PostalAddress</code> by the relation named <code>PostalAddress</code>.
     * @return the <code>PostalAddress</code>
     * @throws RepositoryException if an error occurs
     */
    public PostalAddress getPostalAddress() throws RepositoryException {
        if (this.postalAddress == null) {
            this.postalAddress = getRelatedOne(PostalAddress.class, "PostalAddress");
        }
        return this.postalAddress;
    }

    /**
     * Auto generated value setter.
     * @param paymentMethod the paymentMethod to set
    */
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    /**
     * Auto generated value setter.
     * @param paymentMethodType the paymentMethodType to set
    */
    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }
    /**
     * Auto generated value setter.
     * @param eftAccount the eftAccount to set
    */
    public void setEftAccount(EftAccount eftAccount) {
        this.eftAccount = eftAccount;
    }
    /**
     * Auto generated value setter.
     * @param postalAddress the postalAddress to set
    */
    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPaymentMethodId((String) mapValue.get("paymentMethodId"));
        setPaymentMethodTypeId((String) mapValue.get("paymentMethodTypeId"));
        setPartyId((String) mapValue.get("partyId"));
        setGlAccountId((String) mapValue.get("glAccountId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setBankName((String) mapValue.get("bankName"));
        setRoutingNumber((String) mapValue.get("routingNumber"));
        setAccountType((String) mapValue.get("accountType"));
        setAccountNumber((String) mapValue.get("accountNumber"));
        setNameOnAccount((String) mapValue.get("nameOnAccount"));
        setCompanyNameOnAccount((String) mapValue.get("companyNameOnAccount"));
        setContactMechId((String) mapValue.get("contactMechId"));
        setYearsAtBank((Long) mapValue.get("yearsAtBank"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("paymentMethodId", getPaymentMethodId());
        mapValue.put("paymentMethodTypeId", getPaymentMethodTypeId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("bankName", getBankName());
        mapValue.put("routingNumber", getRoutingNumber());
        mapValue.put("accountType", getAccountType());
        mapValue.put("accountNumber", getAccountNumber());
        mapValue.put("nameOnAccount", getNameOnAccount());
        mapValue.put("companyNameOnAccount", getCompanyNameOnAccount());
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("yearsAtBank", getYearsAtBank());
        return mapValue;
    }


}
