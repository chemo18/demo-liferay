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

package com.med.app.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link contactLocalService}.
 * </p>
 *
 * @author    guillermo
 * @see       contactLocalService
 * @generated
 */
public class contactLocalServiceWrapper implements contactLocalService,
	ServiceWrapper<contactLocalService> {
	public contactLocalServiceWrapper(contactLocalService contactLocalService) {
		_contactLocalService = contactLocalService;
	}

	/**
	* Adds the contact to the database. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.med.app.model.contact addcontact(
		com.med.app.model.contact contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.addcontact(contact);
	}

	/**
	* Creates a new contact with the primary key. Does not add the contact to the database.
	*
	* @param contactId the primary key for the new contact
	* @return the new contact
	*/
	public com.med.app.model.contact createcontact(long contactId) {
		return _contactLocalService.createcontact(contactId);
	}

	/**
	* Deletes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactId the primary key of the contact
	* @return the contact that was removed
	* @throws PortalException if a contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.med.app.model.contact deletecontact(long contactId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.deletecontact(contactId);
	}

	/**
	* Deletes the contact from the database. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.med.app.model.contact deletecontact(
		com.med.app.model.contact contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.deletecontact(contact);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contactLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.med.app.model.contact fetchcontact(long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.fetchcontact(contactId);
	}

	/**
	* Returns the contact with the primary key.
	*
	* @param contactId the primary key of the contact
	* @return the contact
	* @throws PortalException if a contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.med.app.model.contact getcontact(long contactId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.getcontact(contactId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.getPersistedModel(primaryKeyObj);
	}

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
	public java.util.List<com.med.app.model.contact> getcontacts(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.getcontacts(start, end);
	}

	/**
	* Returns the number of contacts.
	*
	* @return the number of contacts
	* @throws SystemException if a system exception occurred
	*/
	public int getcontactsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.getcontactsCount();
	}

	/**
	* Updates the contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.med.app.model.contact updatecontact(
		com.med.app.model.contact contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.updatecontact(contact);
	}

	/**
	* Updates the contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @param merge whether to merge the contact with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the contact that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.med.app.model.contact updatecontact(
		com.med.app.model.contact contact, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.updatecontact(contact, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _contactLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_contactLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _contactLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public contactLocalService getWrappedcontactLocalService() {
		return _contactLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedcontactLocalService(
		contactLocalService contactLocalService) {
		_contactLocalService = contactLocalService;
	}

	public contactLocalService getWrappedService() {
		return _contactLocalService;
	}

	public void setWrappedService(contactLocalService contactLocalService) {
		_contactLocalService = contactLocalService;
	}

	private contactLocalService _contactLocalService;
}