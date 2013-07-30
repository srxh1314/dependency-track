/*
 * Copyright 2013 Axway
 *
 * This file is part of OWASP Dependency-Track.
 *
 * Dependency-Track is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * Dependency-Track is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Dependency-Track.
 * If not, see http://www.gnu.org/licenses/.
 */

package org.owasp.dependencytrack.service;

import org.owasp.dependencytrack.dao.ApplicationVersionDao;
import org.owasp.dependencytrack.model.ApplicationVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ApplicationVersionService {

    @Autowired
    private ApplicationVersionDao applicationVersionDao;

    @Transactional
    public List<ApplicationVersion> listApplicationVersions() {
        return applicationVersionDao.listApplicationVersions();
    }

    @Transactional
    public ApplicationVersion getApplicationVersion(int id) {
        return applicationVersionDao.getApplicationVersion(id);
    }

    @Transactional
    public void removeApplicationVersion(Integer id) {
        applicationVersionDao.removeApplicationVersion(id);
    }

    @Transactional
    public void updateApplication(int appversionid, int appid, String appname, String appversion) {
        applicationVersionDao.updateApplication(appversionid, appid, appname, appversion);
    }

    @Transactional
    public void addApplicationVersion(int appid, String appversion) {
        applicationVersionDao.addApplicationVersion(appid, appversion);
    }

    @Transactional
    public void cloneApplication(Integer applicationid,String applicationname)
    {
        applicationVersionDao.cloneApplication(applicationid, applicationname);
    }

    @Transactional
    public void cloneApplicationVersion(Integer applicationid,String newversion, String applicationversion)
    {
        applicationVersionDao.cloneApplicationVersion(applicationid, newversion, applicationversion);
    }

    @Transactional
    public void updateApplicationVersion(int id, String appversion)
    {
        applicationVersionDao.updateApplicationVersion(id, appversion);

    }

}