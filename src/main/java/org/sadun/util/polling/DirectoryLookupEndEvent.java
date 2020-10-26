package org.sadun.util.polling;

import java.io.File;

/**
 * Copyright (C) 1999, 2000 Cristiano Sadun. This software is released under LGPL. Indicates that the poller has finished looking for files in a controlled directory.
 * @version 1.0
 * @author C. Sadun
 */
public class DirectoryLookupEndEvent extends BaseDirectoryEvent
{
	public DirectoryLookupEndEvent(DirectoryPoller poller, File dir)
	{
		super(poller, dir);
	}
}
