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
 * Auto generated base entity ContactListPartyAndStatus.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectContactListPartyAndStatuss", query="SELECT CLPS.CONTACT_LIST_ID AS \"contactListId\",CLPS.PARTY_ID AS \"partyId\",CLPS.FROM_DATE AS \"fromDate\",CLPS.STATUS_DATE AS \"statusDate\",CLPS.STATUS_ID AS \"statusId\",CLPS.SET_BY_USER_LOGIN_ID AS \"setByUserLoginId\",CLPS.OPT_IN_VERIFY_CODE AS \"optInVerifyCode\",SI.STATUS_TYPE_ID AS \"statusTypeId\",SI.STATUS_CODE AS \"statusCode\",SI.SEQUENCE_ID AS \"sequenceId\",SI.DESCRIPTION AS \"description\" FROM CONTACT_LIST_PARTY_STATUS CLPS INNER JOIN STATUS_ITEM SI ON CLPS.STATUS_ID = SI.STATUS_ID", resultSetMapping="ContactListPartyAndStatusMapping")
@SqlResultSetMapping(name="ContactListPartyAndStatusMapping", entities={
@EntityResult(entityClass=ContactListPartyAndStatus.class, fields = {
@FieldResult(name="contactListId", column="contactListId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="statusDate", column="statusDate")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="setByUserLoginId", column="setByUserLoginId")
,@FieldResult(name="optInVerifyCode", column="optInVerifyCode")
,@FieldResult(name="statusTypeId", column="statusTypeId")
,@FieldResult(name="statusCode", column="statusCode")
,@FieldResult(name="sequenceId", column="sequenceId")
,@FieldResult(name="description", column="description")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ContactListPartyAndStatus extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("contactListId", "CLPS.CONTACT_LIST_ID");
        fields.put("partyId", "CLPS.PARTY_ID");
        fields.put("fromDate", "CLPS.FROM_DATE");
        fields.put("statusDate", "CLPS.STATUS_DATE");
        fields.put("statusId", "CLPS.STATUS_ID");
        fields.put("setByUserLoginId", "CLPS.SET_BY_USER_LOGIN_ID");
        fields.put("optInVerifyCode", "CLPS.OPT_IN_VERIFY_CODE");
        fields.put("statusTypeId", "SI.STATUS_TYPE_ID");
        fields.put("statusCode", "SI.STATUS_CODE");
        fields.put("sequenceId", "SI.SEQUENCE_ID");
        fields.put("description", "SI.DESCRIPTION");
fieldMapColumns.put("ContactListPartyAndStatus", fields);
}
  public static enum Fields implements EntityFieldInterface<ContactListPartyAndStatus> {
    contactListId("contactListId"),
    partyId("partyId"),
    fromDate("fromDate"),
    statusDate("statusDate"),
    statusId("statusId"),
    setByUserLoginId("setByUserLoginId"),
    optInVerifyCode("optInVerifyCode"),
    statusTypeId("statusTypeId"),
    statusCode("statusCode"),
    sequenceId("sequenceId"),
    description("description");
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
   private String contactListId;
    
   private String partyId;
    
   private Timestamp fromDate;
    
   private Timestamp statusDate;
    
   private String statusId;
    
   private String setByUserLoginId;
    
   private String optInVerifyCode;
    
   private String statusTypeId;
    
   private String statusCode;
    
   private String sequenceId;
    
   private String description;

  /**
   * Default constructor.
   */
  public ContactListPartyAndStatus() {
      super();
      this.baseEntityName = "ContactListPartyAndStatus";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("contactListId");this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("fromDate");this.primaryKeyNames.add("statusDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("contactListId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("statusDate");this.allFieldsNames.add("statusId");this.allFieldsNames.add("setByUserLoginId");this.allFieldsNames.add("optInVerifyCode");this.allFieldsNames.add("statusTypeId");this.allFieldsNames.add("statusCode");this.allFieldsNames.add("sequenceId");this.allFieldsNames.add("description");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ContactListPartyAndStatus(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param contactListId the contactListId to set
     */
    public void setContactListId(String contactListId) {
        this.contactListId = contactListId;
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
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param statusDate the statusDate to set
     */
    public void setStatusDate(Timestamp statusDate) {
        this.statusDate = statusDate;
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
     * @param setByUserLoginId the setByUserLoginId to set
     */
    public void setSetByUserLoginId(String setByUserLoginId) {
        this.setByUserLoginId = setByUserLoginId;
    }
    /**
     * Auto generated value setter.
     * @param optInVerifyCode the optInVerifyCode to set
     */
    public void setOptInVerifyCode(String optInVerifyCode) {
        this.optInVerifyCode = optInVerifyCode;
    }
    /**
     * Auto generated value setter.
     * @param statusTypeId the statusTypeId to set
     */
    public void setStatusTypeId(String statusTypeId) {
        this.statusTypeId = statusTypeId;
    }
    /**
     * Auto generated value setter.
     * @param statusCode the statusCode to set
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    /**
     * Auto generated value setter.
     * @param sequenceId the sequenceId to set
     */
    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactListId() {
        return this.contactListId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getStatusDate() {
        return this.statusDate;
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
    public String getSetByUserLoginId() {
        return this.setByUserLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOptInVerifyCode() {
        return this.optInVerifyCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusTypeId() {
        return this.statusTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusCode() {
        return this.statusCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSequenceId() {
        return this.sequenceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setContactListId((String) mapValue.get("contactListId"));
        setPartyId((String) mapValue.get("partyId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setStatusDate((Timestamp) mapValue.get("statusDate"));
        setStatusId((String) mapValue.get("statusId"));
        setSetByUserLoginId((String) mapValue.get("setByUserLoginId"));
        setOptInVerifyCode((String) mapValue.get("optInVerifyCode"));
        setStatusTypeId((String) mapValue.get("statusTypeId"));
        setStatusCode((String) mapValue.get("statusCode"));
        setSequenceId((String) mapValue.get("sequenceId"));
        setDescription((String) mapValue.get("description"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("contactListId", getContactListId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("statusDate", getStatusDate());
        mapValue.put("statusId", getStatusId());
        mapValue.put("setByUserLoginId", getSetByUserLoginId());
        mapValue.put("optInVerifyCode", getOptInVerifyCode());
        mapValue.put("statusTypeId", getStatusTypeId());
        mapValue.put("statusCode", getStatusCode());
        mapValue.put("sequenceId", getSequenceId());
        mapValue.put("description", getDescription());
        return mapValue;
    }


}
