package org.opentaps.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
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
 * Auto generated base entity PaymentReceiptsDetailWithApplication.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPaymentReceiptsDetailWithApplications", query="SELECT P.PAYMENT_ID AS \"paymentId\",P.PAYMENT_METHOD_TYPE_ID AS \"paymentMethodTypeId\",P.PAYMENT_REF_NUM AS \"paymentRefNum\",P.PARTY_ID_TO AS \"partyIdTo\",P.PARTY_ID_FROM AS \"partyIdFrom\",P.AMOUNT AS \"amount\",P.CURRENCY_UOM_ID AS \"currencyUomId\",PA.INVOICE_ID AS \"invoiceId\",PA.AMOUNT_APPLIED AS \"amountApplied\",A.ACCTG_TRANS_ID AS \"acctgTransId\",A.TRANSACTION_DATE AS \"transactionDate\",ATE.GL_ACCOUNT_ID AS \"glAccountId\",ATE.DEBIT_CREDIT_FLAG AS \"debitCreditFlag\" FROM PAYMENT P LEFT JOIN PAYMENT_APPLICATION PA ON P.PAYMENT_ID = PA.PAYMENT_ID INNER JOIN ACCTG_TRANS A ON A.PAYMENT_ID = P.PAYMENT_ID INNER JOIN ACCTG_TRANS_ENTRY ATE ON A.ACCTG_TRANS_ID = ATE.ACCTG_TRANS_ID", resultSetMapping="PaymentReceiptsDetailWithApplicationMapping")
@SqlResultSetMapping(name="PaymentReceiptsDetailWithApplicationMapping", entities={
@EntityResult(entityClass=PaymentReceiptsDetailWithApplication.class, fields = {
@FieldResult(name="paymentId", column="paymentId")
,@FieldResult(name="paymentMethodTypeId", column="paymentMethodTypeId")
,@FieldResult(name="paymentRefNum", column="paymentRefNum")
,@FieldResult(name="partyIdTo", column="partyIdTo")
,@FieldResult(name="partyIdFrom", column="partyIdFrom")
,@FieldResult(name="amount", column="amount")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="invoiceId", column="invoiceId")
,@FieldResult(name="amountApplied", column="amountApplied")
,@FieldResult(name="acctgTransId", column="acctgTransId")
,@FieldResult(name="transactionDate", column="transactionDate")
,@FieldResult(name="glAccountId", column="glAccountId")
,@FieldResult(name="debitCreditFlag", column="debitCreditFlag")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PaymentReceiptsDetailWithApplication extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("paymentId", "P.PAYMENT_ID");
        fields.put("paymentMethodTypeId", "P.PAYMENT_METHOD_TYPE_ID");
        fields.put("paymentRefNum", "P.PAYMENT_REF_NUM");
        fields.put("partyIdTo", "P.PARTY_ID_TO");
        fields.put("partyIdFrom", "P.PARTY_ID_FROM");
        fields.put("amount", "P.AMOUNT");
        fields.put("currencyUomId", "P.CURRENCY_UOM_ID");
        fields.put("invoiceId", "PA.INVOICE_ID");
        fields.put("amountApplied", "PA.AMOUNT_APPLIED");
        fields.put("acctgTransId", "A.ACCTG_TRANS_ID");
        fields.put("transactionDate", "A.TRANSACTION_DATE");
        fields.put("glAccountId", "ATE.GL_ACCOUNT_ID");
        fields.put("debitCreditFlag", "ATE.DEBIT_CREDIT_FLAG");
fieldMapColumns.put("PaymentReceiptsDetailWithApplication", fields);
}
  public static enum Fields implements EntityFieldInterface<PaymentReceiptsDetailWithApplication> {
    paymentId("paymentId"),
    paymentMethodTypeId("paymentMethodTypeId"),
    paymentRefNum("paymentRefNum"),
    partyIdTo("partyIdTo"),
    partyIdFrom("partyIdFrom"),
    amount("amount"),
    currencyUomId("currencyUomId"),
    invoiceId("invoiceId"),
    amountApplied("amountApplied"),
    acctgTransId("acctgTransId"),
    transactionDate("transactionDate"),
    glAccountId("glAccountId"),
    debitCreditFlag("debitCreditFlag");
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
   private String paymentId;
    
   private String paymentMethodTypeId;
    
   private String paymentRefNum;
    
   private String partyIdTo;
    
   private String partyIdFrom;
    
   private BigDecimal amount;
    
   private String currencyUomId;
    
   private String invoiceId;
    
   private BigDecimal amountApplied;
    
   private String acctgTransId;
    
   private Timestamp transactionDate;
    
   private String glAccountId;
    
   private String debitCreditFlag;

  /**
   * Default constructor.
   */
  public PaymentReceiptsDetailWithApplication() {
      super();
      this.baseEntityName = "PaymentReceiptsDetailWithApplication";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("paymentId");this.primaryKeyNames.add("acctgTransId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("paymentId");this.allFieldsNames.add("paymentMethodTypeId");this.allFieldsNames.add("paymentRefNum");this.allFieldsNames.add("partyIdTo");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("amount");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("invoiceId");this.allFieldsNames.add("amountApplied");this.allFieldsNames.add("acctgTransId");this.allFieldsNames.add("transactionDate");this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("debitCreditFlag");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PaymentReceiptsDetailWithApplication(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
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
     * @param paymentRefNum the paymentRefNum to set
     */
    public void setPaymentRefNum(String paymentRefNum) {
        this.paymentRefNum = paymentRefNum;
    }
    /**
     * Auto generated value setter.
     * @param partyIdTo the partyIdTo to set
     */
    public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
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
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
     * @param invoiceId the invoiceId to set
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
    /**
     * Auto generated value setter.
     * @param amountApplied the amountApplied to set
     */
    public void setAmountApplied(BigDecimal amountApplied) {
        this.amountApplied = amountApplied;
    }
    /**
     * Auto generated value setter.
     * @param acctgTransId the acctgTransId to set
     */
    public void setAcctgTransId(String acctgTransId) {
        this.acctgTransId = acctgTransId;
    }
    /**
     * Auto generated value setter.
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
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
     * @param debitCreditFlag the debitCreditFlag to set
     */
    public void setDebitCreditFlag(String debitCreditFlag) {
        this.debitCreditFlag = debitCreditFlag;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentId() {
        return this.paymentId;
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
    public String getPaymentRefNum() {
        return this.paymentRefNum;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdTo() {
        return this.partyIdTo;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAmount() {
        return this.amount;
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
    public String getInvoiceId() {
        return this.invoiceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAmountApplied() {
        return this.amountApplied;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTransId() {
        return this.acctgTransId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getTransactionDate() {
        return this.transactionDate;
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
     * @return <code>String</code>
     */
    public String getDebitCreditFlag() {
        return this.debitCreditFlag;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPaymentId((String) mapValue.get("paymentId"));
        setPaymentMethodTypeId((String) mapValue.get("paymentMethodTypeId"));
        setPaymentRefNum((String) mapValue.get("paymentRefNum"));
        setPartyIdTo((String) mapValue.get("partyIdTo"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setAmount(convertToBigDecimal(mapValue.get("amount")));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setInvoiceId((String) mapValue.get("invoiceId"));
        setAmountApplied(convertToBigDecimal(mapValue.get("amountApplied")));
        setAcctgTransId((String) mapValue.get("acctgTransId"));
        setTransactionDate((Timestamp) mapValue.get("transactionDate"));
        setGlAccountId((String) mapValue.get("glAccountId"));
        setDebitCreditFlag((String) mapValue.get("debitCreditFlag"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("paymentId", getPaymentId());
        mapValue.put("paymentMethodTypeId", getPaymentMethodTypeId());
        mapValue.put("paymentRefNum", getPaymentRefNum());
        mapValue.put("partyIdTo", getPartyIdTo());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("amount", getAmount());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("invoiceId", getInvoiceId());
        mapValue.put("amountApplied", getAmountApplied());
        mapValue.put("acctgTransId", getAcctgTransId());
        mapValue.put("transactionDate", getTransactionDate());
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("debitCreditFlag", getDebitCreditFlag());
        return mapValue;
    }


}