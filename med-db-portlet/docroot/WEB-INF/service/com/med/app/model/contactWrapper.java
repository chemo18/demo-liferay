/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.med.app.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link contact}.
 * </p>
 *
 * @author    guillermo
 * @see       contact
 * @generated
 */
public class contactWrapper implements contact, ModelWrapper<contact> {
	public contactWrapper(contact contact) {
		_contact = contact;
	}

	public Class<?> getModelClass() {
		return contact.class;
	}

	public String getModelClassName() {
		return contact.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("contactId", getContactId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long contactId = (Long)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this contact.
	*
	* @return the primary key of this contact
	*/
	public long getPrimaryKey() {
		return _contact.getPrimaryKey();
	}

	/**
	* Sets the primary key of this contact.
	*
	* @param primaryKey the primary key of this contact
	*/
	public void setPrimaryKey(long primaryKey) {
		_contact.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the contact ID of this contact.
	*
	* @return the contact ID of this contact
	*/
	public long getContactId() {
		return _contact.getContactId();
	}

	/**
	* Sets the contact ID of this contact.
	*
	* @param contactId the contact ID of this contact
	*/
	public void setContactId(long contactId) {
		_contact.setContactId(contactId);
	}

	/**
	* Returns the group ID of this contact.
	*
	* @return the group ID of this contact
	*/
	public long getGroupId() {
		return _contact.getGroupId();
	}

	/**
	* Sets the group ID of this contact.
	*
	* @param groupId the group ID of this contact
	*/
	public void setGroupId(long groupId) {
		_contact.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this contact.
	*
	* @return the company ID of this contact
	*/
	public long getCompanyId() {
		return _contact.getCompanyId();
	}

	/**
	* Sets the company ID of this contact.
	*
	* @param companyId the company ID of this contact
	*/
	public void setCompanyId(long companyId) {
		_contact.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this contact.
	*
	* @return the user ID of this contact
	*/
	public long getUserId() {
		return _contact.getUserId();
	}

	/**
	* Sets the user ID of this contact.
	*
	* @param userId the user ID of this contact
	*/
	public void setUserId(long userId) {
		_contact.setUserId(userId);
	}

	/**
	* Returns the user uuid of this contact.
	*
	* @return the user uuid of this contact
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contact.getUserUuid();
	}

	/**
	* Sets the user uuid of this contact.
	*
	* @param userUuid the user uuid of this contact
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_contact.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this contact.
	*
	* @return the user name of this contact
	*/
	public java.lang.String getUserName() {
		return _contact.getUserName();
	}

	/**
	* Sets the user name of this contact.
	*
	* @param userName the user name of this contact
	*/
	public void setUserName(java.lang.String userName) {
		_contact.setUserName(userName);
	}

	/**
	* Returns the create date of this contact.
	*
	* @return the create date of this contact
	*/
	public java.util.Date getCreateDate() {
		return _contact.getCreateDate();
	}

	/**
	* Sets the create date of this contact.
	*
	* @param createDate the create date of this contact
	*/
	public void setCreateDate(java.util.Date createDate) {
		_contact.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this contact.
	*
	* @return the modified date of this contact
	*/
	public java.util.Date getModifiedDate() {
		return _contact.getModifiedDate();
	}

	/**
	* Sets the modified date of this contact.
	*
	* @param modifiedDate the modified date of this contact
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_contact.setModifiedDate(modifiedDate);
	}

	public boolean isNew() {
		return _contact.isNew();
	}

	public void setNew(boolean n) {
		_contact.setNew(n);
	}

	public boolean isCachedModel() {
		return _contact.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_contact.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _contact.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _contact.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_contact.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _contact.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_contact.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new contactWrapper((contact)_contact.clone());
	}

	public int compareTo(contact contact) {
		return _contact.compareTo(contact);
	}

	@Override
	public int hashCode() {
		return _contact.hashCode();
	}

	public com.liferay.portal.model.CacheModel<contact> toCacheModel() {
		return _contact.toCacheModel();
	}

	public contact toEscapedModel() {
		return new contactWrapper(_contact.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _contact.toString();
	}

	public java.lang.String toXmlString() {
		return _contact.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_contact.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public contact getWrappedcontact() {
		return _contact;
	}

	public contact getWrappedModel() {
		return _contact;
	}

	public void resetOriginalValues() {
		_contact.resetOriginalValues();
	}

	private contact _contact;
}