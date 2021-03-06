/*
 * Houghton Associates Framework
 * http://www.houghtonassociates.com
 * 
 * Copyright 2014 Houghton Associates, Inc.
 */
package com.houghtonassociates.bamboo.plugins.dao;

import com.sonymobile.tools.gerrit.gerritevents.dto.GerritEvent;

/**
 * @author jhuntley
 *
 */
public interface GerritProcessListener {

    public void processGerritEvent(GerritEvent e);
}
