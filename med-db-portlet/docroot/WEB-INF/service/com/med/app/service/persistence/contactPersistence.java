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

package com.med.app.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.med.app.model.contact;

/**
 * The persistence interface for the contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author guillermo
 * @see contactPersistenceImpl
 * @see contactUtil
 * @generated
 */
public interface contactPersistence extends BasePersistence<contact> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link contactUtil} to access the contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the contact in the entity cache if it is enabled.
	*
	* @param contact the contact
	*/
	public void cacheResult(com.med.app.model.contact contact);

	/**
	* Caches the contacts in the entity cache if it is enabled.
	*
	* @param contacts the contacts
	*/
	public void cacheResult(java.util.List<com.med.app.model.contact> contacts);

	/**
	* Creates a new contact with the primary key. Does not add the contact to the database.
	*
	* @param contactId the primary key for the new contact
	* @return the new contact
	*/
	public com.med.app.model.contact create(long contactId);

	/**
	* Removes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactId the primary key of the contact
	* @return the contact that was removed
	* @throws com.med.app.NoSuchcontactException if a contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.med.app.model.contact remove(long contactId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.med.app.NoSuchcontactException;

	public com.med.app.model.contact updateImpl(
		com.med.app.model.contact contact, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the contact with the primary key or throws a {@link com.med.app.NoSuchcontactException} if it could not be found.
	*
	* @param contactId the primary key of the contact
	* @return the contact
	* @throws com.med.app.NoSuchcontactException if a contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.med.app.model.contact findByPrimaryKey(long contactId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.med.app.NoSuchcontactException;

	/**
	* Returns the contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param contactId the primary key of the contact
	* @return the contact, or <code>null</code> if a contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.med.app.model.contact fetchByPrimaryKey(long contactId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the contacts.
	*
	* @return the contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.med.app.model.contact> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.med.app.model.contact> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.med.app.model.contact> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the contacts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of contacts.
	*
	* @return the number of contacts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}