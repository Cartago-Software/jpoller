package org.sadun.util.polling;

import java.io.File;

/**
 * Copyright (C) 1999, 2000 Cristiano Sadun. This software is released under LGPL.
 *
 * Indicates that the poller is starting to look for files in a
 * controlled directory.
 *
 * @version 1.0
 * @author C. Sadun
 */
public class DirectoryLookupStartEvent extends BaseDirectoryEvent {

    public DirectoryLookupStartEvent(DirectoryPoller poller, File dir) {
        super(poller, dir);
    }
}
    