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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.med.app.NoSuchcontactException;
import com.med.app.model.contact;
import com.med.app.model.impl.contactImpl;
import com.med.app.model.impl.contactModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author guillermo
 * @see contactPersistence
 * @see contactUtil
 * @generated
 */
public class contactPersistenceImpl extends BasePersistenceImpl<contact>
	implements contactPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link contactUtil} to access the contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = contactImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(contactModelImpl.ENTITY_CACHE_ENABLED,
			contactModelImpl.FINDER_CACHE_ENABLED, contactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(contactModelImpl.ENTITY_CACHE_ENABLED,
			contactModelImpl.FINDER_CACHE_ENABLED, contactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(contactModelImpl.ENTITY_CACHE_ENABLED,
			contactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the contact in the entity cache if it is enabled.
	 *
	 * @param contact the contact
	 */
	public void cacheResult(contact contact) {
		EntityCacheUtil.putResult(contactModelImpl.ENTITY_CACHE_ENABLED,
			contactImpl.class, contact.getPrimaryKey(), contact);

		contact.resetOriginalValues();
	}

	/**
	 * Caches the contacts in the entity cache if it is enabled.
	 *
	 * @param contacts the contacts
	 */
	public void cacheResult(List<contact> contacts) {
		for (contact contact : contacts) {
			if (EntityCacheUtil.getResult(
						contactModelImpl.ENTITY_CACHE_ENABLED,
						contactImpl.class, contact.getPrimaryKey()) == null) {
				cacheResult(contact);
			}
			else {
				contact.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all contacts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(contactImpl.class.getName());
		}

		EntityCacheUtil.clearCache(contactImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the contact.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(contact contact) {
		EntityCacheUtil.removeResult(contactModelImpl.ENTITY_CACHE_ENABLED,
			contactImpl.class, contact.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<contact> contacts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (contact contact : contacts) {
			EntityCacheUtil.removeResult(contactModelImpl.ENTITY_CACHE_ENABLED,
				contactImpl.class, contact.getPrimaryKey());
		}
	}

	/**
	 * Creates a new contact with the primary key. Does not add the contact to the database.
	 *
	 * @param contactId the primary key for the new contact
	 * @return the new contact
	 */
	public contact create(long contactId) {
		contact contact = new contactImpl();

		contact.setNew(true);
		contact.setPrimaryKey(contactId);

		return contact;
	}

	/**
	 * Removes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contactId the primary key of the contact
	 * @return the contact that was removed
	 * @throws com.med.app.NoSuchcontactException if a contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public contact remove(long contactId)
		throws NoSuchcontactException, SystemException {
		return remove(Long.valueOf(contactId));
	}

	/**
	 * Removes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the contact
	 * @return the contact that was removed
	 * @throws com.med.app.NoSuchcontactException if a contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public contact remove(Serializable primaryKey)
		throws NoSuchcontactException, SystemException {
		Session session = null;

		try {
			session = openSession();

			contact contact = (contact)session.get(contactImpl.class, primaryKey);

			if (contact == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcontactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(contact);
		}
		catch (NoSuchcontactException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected contact removeImpl(contact contact) throws SystemException {
		contact = toUnwrappedModel(contact);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, contact);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(contact);

		return contact;
	}

	@Override
	public contact updateImpl(com.med.app.model.contact contact, boolean merge)
		throws SystemException {
		contact = toUnwrappedModel(contact);

		boolean isNew = contact.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, contact, merge);

			contact.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(contactModelImpl.ENTITY_CACHE_ENABLED,
			contactImpl.class, contact.getPrimaryKey(), contact);

		return contact;
	}

	protected contact toUnwrappedModel(contact contact) {
		if (contact instanceof contactImpl) {
			return contact;
		}

		contactImpl contactImpl = new contactImpl();

		contactImpl.setNew(contact.isNew());
		contactImpl.setPrimaryKey(contact.getPrimaryKey());

		contactImpl.setContactId(contact.getContactId());
		contactImpl.setGroupId(contact.getGroupId());
		contactImpl.setCompanyId(contact.getCompanyId());
		contactImpl.setUserId(contact.getUserId());
		contactImpl.setUserName(contact.getUserName());
		contactImpl.setCreateDate(contact.getCreateDate());
		contactImpl.setModifiedDate(contact.getModifiedDate());

		return contactImpl;
	}

	/**
	 * Returns the contact with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the contact
	 * @return the contact
	 * @throws com.liferay.portal.NoSuchModelException if a contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public contact findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the contact with the primary key or throws a {@link com.med.app.NoSuchcontactException} if it could not be found.
	 *
	 * @param contactId the primary key of the contact
	 * @return the contact
	 * @throws com.med.app.NoSuchcontactException if a contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public contact findByPrimaryKey(long contactId)
		throws NoSuchcontactException, SystemException {
		contact contact = fetchByPrimaryKey(contactId);

		if (contact == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + contactId);
			}

			throw new NoSuchcontactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				contactId);
		}

		return contact;
	}

	/**
	 * Returns the contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the contact
	 * @return the contact, or <code>null</code> if a contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public contact fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contactId the primary key of the contact
	 * @return the contact, or <code>null</code> if a contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public contact fetchByPrimaryKey(long contactId) throws SystemException {
		contact contact = (contact)EntityCacheUtil.getResult(contactModelImpl.ENTITY_CACHE_ENABLED,
				contactImpl.class, contactId);

		if (contact == _nullcontact) {
			return null;
		}

		if (contact == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				contact = (contact)session.get(contactImpl.class,
						Long.valueOf(contactId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (contact != null) {
					cacheResult(contact);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(contactModelImpl.ENTITY_CACHE_ENABLED,
						contactImpl.class, contactId, _nullcontact);
				}

				closeSession(session);
			}
		}

		return contact;
	}

	/**
	 * Returns all the contacts.
	 *
	 * @return the contacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<contact> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<contact> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

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
	public List<contact> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<contact> list = (List<contact>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONTACT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONTACT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<contact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<contact>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the contacts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (contact contact : findAll()) {
			remove(contact);
		}
	}

	/**
	 * Returns the number of contacts.
	 *
	 * @return the number of contacts
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CONTACT);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the contact persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.med.app.model.contact")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<contact>> listenersList = new ArrayList<ModelListener<contact>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<contact>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(contactImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = contactPersistence.class)
	protected contactPersistence contactPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_CONTACT = "SELECT contact FROM contact contact";
	private static final String _SQL_COUNT_CONTACT = "SELECT COUNT(contact) FROM contact contact";
	private static final String _ORDER_BY_ENTITY_ALIAS = "contact.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No contact exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(contactPersistenceImpl.class);
	private static contact _nullcontact = new contactImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<contact> toCacheModel() {
				return _nullcontactCacheModel;
			}
		};

	private static CacheModel<contact> _nullcontactCacheModel = new CacheModel<contact>() {
			public contact toEntityModel() {
				return _nullcontact;
			}
		};
}