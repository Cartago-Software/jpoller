package org.sadun.util.polling;

import java.io.File;
/**
 * Copyright (C) 1999, 2000 Cristiano Sadun. This software is released under LGPL.
 *
 * @author Cristiano Sadun
 * 
 */
abstract class BaseDirectoryEvent extends BasePollerEvent {

    protected File directory;

    public BaseDirectoryEvent(DirectoryPoller poller, File directory) {
        super(poller);
        this.directory=directory;
    }

    public File getDirectory() { return directory; }
}
    