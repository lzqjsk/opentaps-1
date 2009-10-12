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
 * Auto generated base entity UspsContactListCountZip5.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectUspsContactListCountZip5s", query="SELECT UCLS.CONTACT_LIST_ID AS \"contactListId\",UCLS.CONTACT_MECH_ID AS \"contactMechId\",UCLS.ZIP5 AS \"zip5\",UCLS.PROCESSED_TIMESTAMP AS \"processedTimestamp\" FROM USPS_CONTACT_LIST_SORT UCLS", resultSetMapping="UspsContactListCountZip5Mapping")
@SqlResultSetMapping(name="UspsContactListCountZip5Mapping", entities={
@EntityResult(entityClass=UspsContactListCountZip5.class, fields = {
@FieldResult(name="contactListId", column="contactListId")
,@FieldResult(name="contactMechId", column="contactMechId")
,@FieldResult(name="zip5", column="zip5")
,@FieldResult(name="processedTimestamp", column="processedTimestamp")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class UspsContactListCountZip5 extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("contactListId", "UCLS.CONTACT_LIST_ID");
        fields.put("contactMechId", "UCLS.CONTACT_MECH_ID");
        fields.put("zip5", "UCLS.ZIP5");
        fields.put("processedTimestamp", "UCLS.PROCESSED_TIMESTAMP");
fieldMapColumns.put("UspsContactListCountZip5", fields);
}
  public static enum Fields implements EntityFieldInterface<UspsContactListCountZip5> {
    contactListId("contactListId"),
    contactMechId("contactMechId"),
    zip5("zip5"),
    processedTimestamp("processedTimestamp");
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
    
   private Long contactMechId;
    
   private String zip5;
    
   private Timestamp processedTimestamp;

  /**
   * Default constructor.
   */
  public UspsContactListCountZip5() {
      super();
      this.baseEntityName = "UspsContactListCountZip5";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("contactListId");this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("zip5");this.allFieldsNames.add("processedTimestamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public UspsContactListCountZip5(RepositoryInterface repository) {
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
     * @param contactMechId the contactMechId to set
     */
    public void setContactMechId(Long contactMechId) {
        this.contactMechId = contactMechId;
    }
    /**
     * Auto generated value setter.
     * @param zip5 the zip5 to set
     */
    public void setZip5(String zip5) {
        this.zip5 = zip5;
    }
    /**
     * Auto generated value setter.
     * @param processedTimestamp the processedTimestamp to set
     */
    public void setProcessedTimestamp(Timestamp processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
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
     * @return <code>Long</code>
     */
    public Long getContactMechId() {
        return this.contactMechId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getZip5() {
        return this.zip5;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getProcessedTimestamp() {
        return this.processedTimestamp;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setContactListId((String) mapValue.get("contactListId"));
        setContactMechId((Long) mapValue.get("contactMechId"));
        setZip5((String) mapValue.get("zip5"));
        setProcessedTimestamp((Timestamp) mapValue.get("processedTimestamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("contactListId", getContactListId());
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("zip5", getZip5());
        mapValue.put("processedTimestamp", getProcessedTimestamp());
        return mapValue;
    }


}
