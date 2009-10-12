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

/**
 * Auto generated base entity MaxRevisionItemView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectMaxRevisionItemViews", query="SELECT CRI.CONTENT_ID AS \"contentId\",CRI.ITEM_CONTENT_ID AS \"itemContentId\",CRI.CONTENT_REVISION_SEQ_ID AS \"contentRevisionSeqId\",CRI.CONTENT_REVISION_SEQ_ID AS \"contentRevisionSeqId\" FROM CONTENT_REVISION_ITEM CRI", resultSetMapping="MaxRevisionItemViewMapping")
@SqlResultSetMapping(name="MaxRevisionItemViewMapping", entities={
@EntityResult(entityClass=MaxRevisionItemView.class, fields = {
@FieldResult(name="rootRevisionContentId", column="rootRevisionContentId")
,@FieldResult(name="itemContentId", column="itemContentId")
,@FieldResult(name="contentRevisionSeqId", column="contentRevisionSeqId")
,@FieldResult(name="maxRevisionSeqId", column="maxRevisionSeqId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class MaxRevisionItemView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("rootRevisionContentId", "CRI.CONTENT_ID");
        fields.put("itemContentId", "CRI.ITEM_CONTENT_ID");
        fields.put("contentRevisionSeqId", "CRI.CONTENT_REVISION_SEQ_ID");
        fields.put("maxRevisionSeqId", "CRI.CONTENT_REVISION_SEQ_ID");
fieldMapColumns.put("MaxRevisionItemView", fields);
}
  public static enum Fields implements EntityFieldInterface<MaxRevisionItemView> {
    rootRevisionContentId("rootRevisionContentId"),
    itemContentId("itemContentId"),
    contentRevisionSeqId("contentRevisionSeqId"),
    maxRevisionSeqId("maxRevisionSeqId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String rootRevisionContentId;
    
   private String itemContentId;
    @Id
   private String contentRevisionSeqId;
    
   private String maxRevisionSeqId;

  /**
   * Default constructor.
   */
  public MaxRevisionItemView() {
      super();
      this.baseEntityName = "MaxRevisionItemView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("rootRevisionContentId");this.primaryKeyNames.add("itemContentId");this.primaryKeyNames.add("contentRevisionSeqId");this.primaryKeyNames.add("maxRevisionSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("rootRevisionContentId");this.allFieldsNames.add("itemContentId");this.allFieldsNames.add("contentRevisionSeqId");this.allFieldsNames.add("maxRevisionSeqId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public MaxRevisionItemView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param rootRevisionContentId the rootRevisionContentId to set
     */
    public void setRootRevisionContentId(String rootRevisionContentId) {
        this.rootRevisionContentId = rootRevisionContentId;
    }
    /**
     * Auto generated value setter.
     * @param itemContentId the itemContentId to set
     */
    public void setItemContentId(String itemContentId) {
        this.itemContentId = itemContentId;
    }
    /**
     * Auto generated value setter.
     * @param contentRevisionSeqId the contentRevisionSeqId to set
     */
    public void setContentRevisionSeqId(String contentRevisionSeqId) {
        this.contentRevisionSeqId = contentRevisionSeqId;
    }
    /**
     * Auto generated value setter.
     * @param maxRevisionSeqId the maxRevisionSeqId to set
     */
    public void setMaxRevisionSeqId(String maxRevisionSeqId) {
        this.maxRevisionSeqId = maxRevisionSeqId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRootRevisionContentId() {
        return this.rootRevisionContentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemContentId() {
        return this.itemContentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentRevisionSeqId() {
        return this.contentRevisionSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMaxRevisionSeqId() {
        return this.maxRevisionSeqId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setRootRevisionContentId((String) mapValue.get("rootRevisionContentId"));
        setItemContentId((String) mapValue.get("itemContentId"));
        setContentRevisionSeqId((String) mapValue.get("contentRevisionSeqId"));
        setMaxRevisionSeqId((String) mapValue.get("maxRevisionSeqId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("rootRevisionContentId", getRootRevisionContentId());
        mapValue.put("itemContentId", getItemContentId());
        mapValue.put("contentRevisionSeqId", getContentRevisionSeqId());
        mapValue.put("maxRevisionSeqId", getMaxRevisionSeqId());
        return mapValue;
    }


}
