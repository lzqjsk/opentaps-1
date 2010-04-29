package org.opentaps.base.services;

/*
 * Copyright (c) 2009 - 2009 Open Source Strategies, Inc.
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

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE SERVICE MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import org.opentaps.foundation.service.ServiceWrapper;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javolution.util.FastMap;
import javolution.util.FastSet;
import org.ofbiz.entity.GenericValue;
import org.opentaps.foundation.infrastructure.User;

/**
 * Create a Product Store Email Setting.
 * Auto generated base service entity createProductStoreEmailSetting.
 *
 * Engine: simple
 * Location: component://product/script/org/ofbiz/product/store/ProductStoreServices.xml
 * Invoke: createProductStoreEmail
 * Defined in: applications/product/servicedef/services_store.xml
 */
public class CreateProductStoreEmailSettingService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createProductStoreEmailSetting";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        bccAddress("bccAddress"),
        bodyScreenLocation("bodyScreenLocation"),
        ccAddress("ccAddress"),
        contentType("contentType"),
        emailType("emailType"),
        fromAddress("fromAddress"),
        locale("locale"),
        productStoreId("productStoreId"),
        subject("subject"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        withAttachment("withAttachment"),
        xslfoAttachScreenLocation("xslfoAttachScreenLocation");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>CreateProductStoreEmailSettingService</code> instance.
     */
    public CreateProductStoreEmailSettingService() {
        super();
    }

    /**
     * Creates a new <code>CreateProductStoreEmailSettingService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateProductStoreEmailSettingService(User user) {
        super(user);
    }

    private String inBccAddress;
    private String inBodyScreenLocation;
    private String inCcAddress;
    private String inContentType;
    private String inEmailType;
    private String inFromAddress;
    private Locale inLocale;
    private String inProductStoreId;
    private String inSubject;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inWithAttachment;
    private String inXslfoAttachScreenLocation;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBccAddress() {
        return this.inBccAddress;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInBodyScreenLocation() {
        return this.inBodyScreenLocation;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCcAddress() {
        return this.inCcAddress;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContentType() {
        return this.inContentType;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInEmailType() {
        return this.inEmailType;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInFromAddress() {
        return this.inFromAddress;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getInLocale() {
        return this.inLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInProductStoreId() {
        return this.inProductStoreId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInSubject() {
        return this.inSubject;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getInTimeZone() {
        return this.inTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInUserLogin() {
        return this.inUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInWithAttachment() {
        return this.inWithAttachment;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInXslfoAttachScreenLocation() {
        return this.inXslfoAttachScreenLocation;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutErrorMessage() {
        return this.outErrorMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutErrorMessageList() {
        return this.outErrorMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getOutLocale() {
        return this.outLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutResponseMessage() {
        return this.outResponseMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutSuccessMessage() {
        return this.outSuccessMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutSuccessMessageList() {
        return this.outSuccessMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getOutTimeZone() {
        return this.outTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutUserLogin() {
        return this.outUserLogin;
    }

    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBccAddress the inBccAddress to set
    */
    public void setInBccAddress(String inBccAddress) {
        this.inParameters.add("bccAddress");
        this.inBccAddress = inBccAddress;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inBodyScreenLocation the inBodyScreenLocation to set
    */
    public void setInBodyScreenLocation(String inBodyScreenLocation) {
        this.inParameters.add("bodyScreenLocation");
        this.inBodyScreenLocation = inBodyScreenLocation;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCcAddress the inCcAddress to set
    */
    public void setInCcAddress(String inCcAddress) {
        this.inParameters.add("ccAddress");
        this.inCcAddress = inCcAddress;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContentType the inContentType to set
    */
    public void setInContentType(String inContentType) {
        this.inParameters.add("contentType");
        this.inContentType = inContentType;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inEmailType the inEmailType to set
    */
    public void setInEmailType(String inEmailType) {
        this.inParameters.add("emailType");
        this.inEmailType = inEmailType;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inFromAddress the inFromAddress to set
    */
    public void setInFromAddress(String inFromAddress) {
        this.inParameters.add("fromAddress");
        this.inFromAddress = inFromAddress;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inProductStoreId the inProductStoreId to set
    */
    public void setInProductStoreId(String inProductStoreId) {
        this.inParameters.add("productStoreId");
        this.inProductStoreId = inProductStoreId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inSubject the inSubject to set
    */
    public void setInSubject(String inSubject) {
        this.inParameters.add("subject");
        this.inSubject = inSubject;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTimeZone the inTimeZone to set
    */
    public void setInTimeZone(TimeZone inTimeZone) {
        this.inParameters.add("timeZone");
        this.inTimeZone = inTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUserLogin the inUserLogin to set
    */
    public void setInUserLogin(GenericValue inUserLogin) {
        this.inParameters.add("userLogin");
        this.inUserLogin = inUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inWithAttachment the inWithAttachment to set
    */
    public void setInWithAttachment(String inWithAttachment) {
        this.inParameters.add("withAttachment");
        this.inWithAttachment = inWithAttachment;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inXslfoAttachScreenLocation the inXslfoAttachScreenLocation to set
    */
    public void setInXslfoAttachScreenLocation(String inXslfoAttachScreenLocation) {
        this.inParameters.add("xslfoAttachScreenLocation");
        this.inXslfoAttachScreenLocation = inXslfoAttachScreenLocation;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessage the outErrorMessage to set
    */
    public void setOutErrorMessage(String outErrorMessage) {
        this.outParameters.add("errorMessage");
        this.outErrorMessage = outErrorMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessageList the outErrorMessageList to set
    */
    public void setOutErrorMessageList(List outErrorMessageList) {
        this.outParameters.add("errorMessageList");
        this.outErrorMessageList = outErrorMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outLocale the outLocale to set
    */
    public void setOutLocale(Locale outLocale) {
        this.outParameters.add("locale");
        this.outLocale = outLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outResponseMessage the outResponseMessage to set
    */
    public void setOutResponseMessage(String outResponseMessage) {
        this.outParameters.add("responseMessage");
        this.outResponseMessage = outResponseMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessage the outSuccessMessage to set
    */
    public void setOutSuccessMessage(String outSuccessMessage) {
        this.outParameters.add("successMessage");
        this.outSuccessMessage = outSuccessMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessageList the outSuccessMessageList to set
    */
    public void setOutSuccessMessageList(List outSuccessMessageList) {
        this.outParameters.add("successMessageList");
        this.outSuccessMessageList = outSuccessMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outTimeZone the outTimeZone to set
    */
    public void setOutTimeZone(TimeZone outTimeZone) {
        this.outParameters.add("timeZone");
        this.outTimeZone = outTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outUserLogin the outUserLogin to set
    */
    public void setOutUserLogin(GenericValue outUserLogin) {
        this.outParameters.add("userLogin");
        this.outUserLogin = outUserLogin;
    }

    /** {@inheritDoc} */
    public String name() {
        return NAME;
    }

    /** {@inheritDoc} */
    public Boolean requiresAuthentication() {
        return REQUIRES_AUTHENTICATION;
    }

    /** {@inheritDoc} */
    public Boolean requiresNewTransaction() {
        return REQUIRES_NEW_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Boolean usesTransaction() {
        return USES_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Map<String, Object> inputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (inParameters.contains("bccAddress")) mapValue.put("bccAddress", getInBccAddress());
        if (inParameters.contains("bodyScreenLocation")) mapValue.put("bodyScreenLocation", getInBodyScreenLocation());
        if (inParameters.contains("ccAddress")) mapValue.put("ccAddress", getInCcAddress());
        if (inParameters.contains("contentType")) mapValue.put("contentType", getInContentType());
        if (inParameters.contains("emailType")) mapValue.put("emailType", getInEmailType());
        if (inParameters.contains("fromAddress")) mapValue.put("fromAddress", getInFromAddress());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("subject")) mapValue.put("subject", getInSubject());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("withAttachment")) mapValue.put("withAttachment", getInWithAttachment());
        if (inParameters.contains("xslfoAttachScreenLocation")) mapValue.put("xslfoAttachScreenLocation", getInXslfoAttachScreenLocation());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("bccAddress")) setInBccAddress((String) mapValue.get("bccAddress"));
        if (mapValue.containsKey("bodyScreenLocation")) setInBodyScreenLocation((String) mapValue.get("bodyScreenLocation"));
        if (mapValue.containsKey("ccAddress")) setInCcAddress((String) mapValue.get("ccAddress"));
        if (mapValue.containsKey("contentType")) setInContentType((String) mapValue.get("contentType"));
        if (mapValue.containsKey("emailType")) setInEmailType((String) mapValue.get("emailType"));
        if (mapValue.containsKey("fromAddress")) setInFromAddress((String) mapValue.get("fromAddress"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("subject")) setInSubject((String) mapValue.get("subject"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("withAttachment")) setInWithAttachment((String) mapValue.get("withAttachment"));
        if (mapValue.containsKey("xslfoAttachScreenLocation")) setInXslfoAttachScreenLocation((String) mapValue.get("xslfoAttachScreenLocation"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CreateProductStoreEmailSettingService</code> from the input values of the given <code>CreateProductStoreEmailSettingService</code>.
     * @param input a <code>CreateProductStoreEmailSettingService</code>
     */
    public static CreateProductStoreEmailSettingService fromInput(CreateProductStoreEmailSettingService input) {
        CreateProductStoreEmailSettingService service = new CreateProductStoreEmailSettingService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateProductStoreEmailSettingService</code> from the output values of the given <code>CreateProductStoreEmailSettingService</code>.
     * @param output a <code>CreateProductStoreEmailSettingService</code>
     */
    public static CreateProductStoreEmailSettingService fromOutput(CreateProductStoreEmailSettingService output) {
        CreateProductStoreEmailSettingService service = new CreateProductStoreEmailSettingService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateProductStoreEmailSettingService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateProductStoreEmailSettingService fromInput(Map<String, Object> mapValue) {
        CreateProductStoreEmailSettingService service = new CreateProductStoreEmailSettingService();
        service.putAllInput(mapValue);
        if (mapValue.containsKey("userLogin")) {
            GenericValue userGv = (GenericValue) mapValue.get("userLogin");
            if (userGv != null) {
                service.setUser(new User(userGv, userGv.getDelegator()));
            }
        }
        return service;
    }

    /**
     * Construct a <code>CreateProductStoreEmailSettingService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateProductStoreEmailSettingService fromOutput(Map<String, Object> mapValue) {
        CreateProductStoreEmailSettingService service = new CreateProductStoreEmailSettingService();
        service.putAllOutput(mapValue);
        return service;
    }
}
