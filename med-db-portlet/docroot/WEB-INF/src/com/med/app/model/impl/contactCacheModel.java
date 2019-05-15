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

package com.med.app.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.med.app.model.contact;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing contact in entity cache.
 *
 * @author guillermo
 * @see contact
 * @generated
 */
public class contactCacheModel implements CacheModel<contact>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{contactId=");
		sb.append(contactId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	public contact toEntityModel() {
		contactImpl contactImpl = new contactImpl();

		contactImpl.setContactId(contactId);
		contactImpl.setGroupId(groupId);
		contactImpl.setCompanyId(companyId);
		contactImpl.setUserId(userId);

		if (userName == null) {
			contactImpl.setUserName(StringPool.BLANK);
		}
		else {
			contactImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			contactImpl.setCreateDate(null);
		}
		else {
			contactImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			contactImpl.setModifiedDate(null);
		}
		else {
			contactImpl.setModifiedDate(new Date(modifiedDate));
		}

		contactImpl.resetOriginalValues();

		return contactImpl;
	}

	public long contactId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
}