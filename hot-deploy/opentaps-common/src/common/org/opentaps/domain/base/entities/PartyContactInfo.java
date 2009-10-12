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
 * Auto generated base entity PartyContactInfo.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPartyContactInfos", query="SELECT P.PARTY_ID AS \"partyId\",PG.GROUP_NAME AS \"groupName\",PER.FIRST_NAME AS \"firstName\",PER.LAST_NAME AS \"lastName\",PCM.FROM_DATE AS \"fromDate\",PCM.THRU_DATE AS \"thruDate\",CM.CONTACT_MECH_ID AS \"contactMechId\",CM.INFO_STRING AS \"infoString\",CM.CONTACT_MECH_TYPE_ID AS \"contactMechTypeId\",PC.PARTY_CLASSIFICATION_GROUP_ID AS \"partyClassificationGroupId\",TN.COUNTRY_CODE AS \"countryCode\",TN.AREA_CODE AS \"areaCode\",TN.CONTACT_NUMBER AS \"contactNumber\",TN.ASK_FOR_NAME AS \"askForName\",PA.TO_NAME AS \"toName\",PA.ATTN_NAME AS \"attnName\",PA.ADDRESS1 AS \"address1\",PA.ADDRESS2 AS \"address2\",PA.DIRECTIONS AS \"directions\",PA.CITY AS \"city\",PA.POSTAL_CODE AS \"postalCode\",PA.POSTAL_CODE_EXT AS \"postalCodeExt\",PA.COUNTRY_GEO_ID AS \"countryGeoId\",PA.STATE_PROVINCE_GEO_ID AS \"stateProvinceGeoId\",PA.COUNTY_GEO_ID AS \"countyGeoId\",PA.POSTAL_CODE_GEO_ID AS \"postalCodeGeoId\",PA.GEO_POINT_ID AS \"geoPointId\" FROM PARTY P LEFT JOIN PARTY_GROUP PG ON P.PARTY_ID = PG.PARTY_ID LEFT JOIN PERSON PER ON P.PARTY_ID = PER.PARTY_ID INNER JOIN PARTY_CONTACT_MECH PCM ON P.PARTY_ID = PCM.PARTY_ID INNER JOIN CONTACT_MECH CM ON PCM.CONTACT_MECH_ID = CM.CONTACT_MECH_ID LEFT JOIN TELECOM_NUMBER TN ON PCM.CONTACT_MECH_ID = TN.CONTACT_MECH_ID LEFT JOIN POSTAL_ADDRESS PA ON PCM.CONTACT_MECH_ID = PA.CONTACT_MECH_ID LEFT JOIN PARTY_CLASSIFICATION PC ON P.PARTY_ID = PC.PARTY_ID", resultSetMapping="PartyContactInfoMapping")
@SqlResultSetMapping(name="PartyContactInfoMapping", entities={
@EntityResult(entityClass=PartyContactInfo.class, fields = {
@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="groupName", column="groupName")
,@FieldResult(name="firstName", column="firstName")
,@FieldResult(name="lastName", column="lastName")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="contactMechId", column="contactMechId")
,@FieldResult(name="infoString", column="infoString")
,@FieldResult(name="contactMechTypeId", column="contactMechTypeId")
,@FieldResult(name="partyClassificationGroupId", column="partyClassificationGroupId")
,@FieldResult(name="countryCode", column="countryCode")
,@FieldResult(name="areaCode", column="areaCode")
,@FieldResult(name="contactNumber", column="contactNumber")
,@FieldResult(name="askForName", column="askForName")
,@FieldResult(name="toName", column="toName")
,@FieldResult(name="attnName", column="attnName")
,@FieldResult(name="address1", column="address1")
,@FieldResult(name="address2", column="address2")
,@FieldResult(name="directions", column="directions")
,@FieldResult(name="city", column="city")
,@FieldResult(name="postalCode", column="postalCode")
,@FieldResult(name="postalCodeExt", column="postalCodeExt")
,@FieldResult(name="countryGeoId", column="countryGeoId")
,@FieldResult(name="stateProvinceGeoId", column="stateProvinceGeoId")
,@FieldResult(name="countyGeoId", column="countyGeoId")
,@FieldResult(name="postalCodeGeoId", column="postalCodeGeoId")
,@FieldResult(name="geoPointId", column="geoPointId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PartyContactInfo extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyId", "P.PARTY_ID");
        fields.put("groupName", "PG.GROUP_NAME");
        fields.put("firstName", "PER.FIRST_NAME");
        fields.put("lastName", "PER.LAST_NAME");
        fields.put("fromDate", "PCM.FROM_DATE");
        fields.put("thruDate", "PCM.THRU_DATE");
        fields.put("contactMechId", "CM.CONTACT_MECH_ID");
        fields.put("infoString", "CM.INFO_STRING");
        fields.put("contactMechTypeId", "CM.CONTACT_MECH_TYPE_ID");
        fields.put("partyClassificationGroupId", "PC.PARTY_CLASSIFICATION_GROUP_ID");
        fields.put("countryCode", "TN.COUNTRY_CODE");
        fields.put("areaCode", "TN.AREA_CODE");
        fields.put("contactNumber", "TN.CONTACT_NUMBER");
        fields.put("askForName", "TN.ASK_FOR_NAME");
        fields.put("toName", "PA.TO_NAME");
        fields.put("attnName", "PA.ATTN_NAME");
        fields.put("address1", "PA.ADDRESS1");
        fields.put("address2", "PA.ADDRESS2");
        fields.put("directions", "PA.DIRECTIONS");
        fields.put("city", "PA.CITY");
        fields.put("postalCode", "PA.POSTAL_CODE");
        fields.put("postalCodeExt", "PA.POSTAL_CODE_EXT");
        fields.put("countryGeoId", "PA.COUNTRY_GEO_ID");
        fields.put("stateProvinceGeoId", "PA.STATE_PROVINCE_GEO_ID");
        fields.put("countyGeoId", "PA.COUNTY_GEO_ID");
        fields.put("postalCodeGeoId", "PA.POSTAL_CODE_GEO_ID");
        fields.put("geoPointId", "PA.GEO_POINT_ID");
fieldMapColumns.put("PartyContactInfo", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyContactInfo> {
    partyId("partyId"),
    groupName("groupName"),
    firstName("firstName"),
    lastName("lastName"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    contactMechId("contactMechId"),
    infoString("infoString"),
    contactMechTypeId("contactMechTypeId"),
    partyClassificationGroupId("partyClassificationGroupId"),
    countryCode("countryCode"),
    areaCode("areaCode"),
    contactNumber("contactNumber"),
    askForName("askForName"),
    toName("toName"),
    attnName("attnName"),
    address1("address1"),
    address2("address2"),
    directions("directions"),
    city("city"),
    postalCode("postalCode"),
    postalCodeExt("postalCodeExt"),
    countryGeoId("countryGeoId"),
    stateProvinceGeoId("stateProvinceGeoId"),
    countyGeoId("countyGeoId"),
    postalCodeGeoId("postalCodeGeoId"),
    geoPointId("geoPointId");
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
   private String partyId;
    
   private String groupName;
    
   private String firstName;
    
   private String lastName;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String contactMechId;
    
   private String infoString;
    
   private String contactMechTypeId;
    
   private String partyClassificationGroupId;
    
   private String countryCode;
    
   private String areaCode;
    
   private String contactNumber;
    
   private String askForName;
    
   private String toName;
    
   private String attnName;
    
   private String address1;
    
   private String address2;
    
   private String directions;
    
   private String city;
    
   private String postalCode;
    
   private String postalCodeExt;
    
   private String countryGeoId;
    
   private String stateProvinceGeoId;
    
   private String countyGeoId;
    
   private String postalCodeGeoId;
    
   private String geoPointId;

  /**
   * Default constructor.
   */
  public PartyContactInfo() {
      super();
      this.baseEntityName = "PartyContactInfo";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("fromDate");this.primaryKeyNames.add("contactMechId");this.primaryKeyNames.add("partyClassificationGroupId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyId");this.allFieldsNames.add("groupName");this.allFieldsNames.add("firstName");this.allFieldsNames.add("lastName");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("infoString");this.allFieldsNames.add("contactMechTypeId");this.allFieldsNames.add("partyClassificationGroupId");this.allFieldsNames.add("countryCode");this.allFieldsNames.add("areaCode");this.allFieldsNames.add("contactNumber");this.allFieldsNames.add("askForName");this.allFieldsNames.add("toName");this.allFieldsNames.add("attnName");this.allFieldsNames.add("address1");this.allFieldsNames.add("address2");this.allFieldsNames.add("directions");this.allFieldsNames.add("city");this.allFieldsNames.add("postalCode");this.allFieldsNames.add("postalCodeExt");this.allFieldsNames.add("countryGeoId");this.allFieldsNames.add("stateProvinceGeoId");this.allFieldsNames.add("countyGeoId");this.allFieldsNames.add("postalCodeGeoId");this.allFieldsNames.add("geoPointId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyContactInfo(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    /**
     * Auto generated value setter.
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Auto generated value setter.
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
     * @param contactMechId the contactMechId to set
     */
    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
    /**
     * Auto generated value setter.
     * @param infoString the infoString to set
     */
    public void setInfoString(String infoString) {
        this.infoString = infoString;
    }
    /**
     * Auto generated value setter.
     * @param contactMechTypeId the contactMechTypeId to set
     */
    public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }
    /**
     * Auto generated value setter.
     * @param partyClassificationGroupId the partyClassificationGroupId to set
     */
    public void setPartyClassificationGroupId(String partyClassificationGroupId) {
        this.partyClassificationGroupId = partyClassificationGroupId;
    }
    /**
     * Auto generated value setter.
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    /**
     * Auto generated value setter.
     * @param areaCode the areaCode to set
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    /**
     * Auto generated value setter.
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    /**
     * Auto generated value setter.
     * @param askForName the askForName to set
     */
    public void setAskForName(String askForName) {
        this.askForName = askForName;
    }
    /**
     * Auto generated value setter.
     * @param toName the toName to set
     */
    public void setToName(String toName) {
        this.toName = toName;
    }
    /**
     * Auto generated value setter.
     * @param attnName the attnName to set
     */
    public void setAttnName(String attnName) {
        this.attnName = attnName;
    }
    /**
     * Auto generated value setter.
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    /**
     * Auto generated value setter.
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    /**
     * Auto generated value setter.
     * @param directions the directions to set
     */
    public void setDirections(String directions) {
        this.directions = directions;
    }
    /**
     * Auto generated value setter.
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * Auto generated value setter.
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    /**
     * Auto generated value setter.
     * @param postalCodeExt the postalCodeExt to set
     */
    public void setPostalCodeExt(String postalCodeExt) {
        this.postalCodeExt = postalCodeExt;
    }
    /**
     * Auto generated value setter.
     * @param countryGeoId the countryGeoId to set
     */
    public void setCountryGeoId(String countryGeoId) {
        this.countryGeoId = countryGeoId;
    }
    /**
     * Auto generated value setter.
     * @param stateProvinceGeoId the stateProvinceGeoId to set
     */
    public void setStateProvinceGeoId(String stateProvinceGeoId) {
        this.stateProvinceGeoId = stateProvinceGeoId;
    }
    /**
     * Auto generated value setter.
     * @param countyGeoId the countyGeoId to set
     */
    public void setCountyGeoId(String countyGeoId) {
        this.countyGeoId = countyGeoId;
    }
    /**
     * Auto generated value setter.
     * @param postalCodeGeoId the postalCodeGeoId to set
     */
    public void setPostalCodeGeoId(String postalCodeGeoId) {
        this.postalCodeGeoId = postalCodeGeoId;
    }
    /**
     * Auto generated value setter.
     * @param geoPointId the geoPointId to set
     */
    public void setGeoPointId(String geoPointId) {
        this.geoPointId = geoPointId;
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
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastName() {
        return this.lastName;
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
    public String getContactMechId() {
        return this.contactMechId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInfoString() {
        return this.infoString;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechTypeId() {
        return this.contactMechTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyClassificationGroupId() {
        return this.partyClassificationGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAreaCode() {
        return this.areaCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactNumber() {
        return this.contactNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAskForName() {
        return this.askForName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getToName() {
        return this.toName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAttnName() {
        return this.attnName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAddress1() {
        return this.address1;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAddress2() {
        return this.address2;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDirections() {
        return this.directions;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCity() {
        return this.city;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPostalCodeExt() {
        return this.postalCodeExt;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCountryGeoId() {
        return this.countryGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStateProvinceGeoId() {
        return this.stateProvinceGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCountyGeoId() {
        return this.countyGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPostalCodeGeoId() {
        return this.postalCodeGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoPointId() {
        return this.geoPointId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyId((String) mapValue.get("partyId"));
        setGroupName((String) mapValue.get("groupName"));
        setFirstName((String) mapValue.get("firstName"));
        setLastName((String) mapValue.get("lastName"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setContactMechId((String) mapValue.get("contactMechId"));
        setInfoString((String) mapValue.get("infoString"));
        setContactMechTypeId((String) mapValue.get("contactMechTypeId"));
        setPartyClassificationGroupId((String) mapValue.get("partyClassificationGroupId"));
        setCountryCode((String) mapValue.get("countryCode"));
        setAreaCode((String) mapValue.get("areaCode"));
        setContactNumber((String) mapValue.get("contactNumber"));
        setAskForName((String) mapValue.get("askForName"));
        setToName((String) mapValue.get("toName"));
        setAttnName((String) mapValue.get("attnName"));
        setAddress1((String) mapValue.get("address1"));
        setAddress2((String) mapValue.get("address2"));
        setDirections((String) mapValue.get("directions"));
        setCity((String) mapValue.get("city"));
        setPostalCode((String) mapValue.get("postalCode"));
        setPostalCodeExt((String) mapValue.get("postalCodeExt"));
        setCountryGeoId((String) mapValue.get("countryGeoId"));
        setStateProvinceGeoId((String) mapValue.get("stateProvinceGeoId"));
        setCountyGeoId((String) mapValue.get("countyGeoId"));
        setPostalCodeGeoId((String) mapValue.get("postalCodeGeoId"));
        setGeoPointId((String) mapValue.get("geoPointId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("partyId", getPartyId());
        mapValue.put("groupName", getGroupName());
        mapValue.put("firstName", getFirstName());
        mapValue.put("lastName", getLastName());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("infoString", getInfoString());
        mapValue.put("contactMechTypeId", getContactMechTypeId());
        mapValue.put("partyClassificationGroupId", getPartyClassificationGroupId());
        mapValue.put("countryCode", getCountryCode());
        mapValue.put("areaCode", getAreaCode());
        mapValue.put("contactNumber", getContactNumber());
        mapValue.put("askForName", getAskForName());
        mapValue.put("toName", getToName());
        mapValue.put("attnName", getAttnName());
        mapValue.put("address1", getAddress1());
        mapValue.put("address2", getAddress2());
        mapValue.put("directions", getDirections());
        mapValue.put("city", getCity());
        mapValue.put("postalCode", getPostalCode());
        mapValue.put("postalCodeExt", getPostalCodeExt());
        mapValue.put("countryGeoId", getCountryGeoId());
        mapValue.put("stateProvinceGeoId", getStateProvinceGeoId());
        mapValue.put("countyGeoId", getCountyGeoId());
        mapValue.put("postalCodeGeoId", getPostalCodeGeoId());
        mapValue.put("geoPointId", getGeoPointId());
        return mapValue;
    }


}
