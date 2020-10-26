package org.sadun.util.polling;

import java.io.File;

/**
 * Copyright (C) 1999, 2000 Cristiano Sadun. This software is released under LGPL. Indicates that the poller has found a set of files matching the polling criteria.
 * @version 1.0
 * @author C. Sadun
 */
public class FileSetFoundEvent extends BaseDirectoryEvent
{
	
	private File[] files;
	
	FileSetFoundEvent(DirectoryPoller poller, File dir, String[] paths)
	{
		super(poller, dir);
		this.files = new File[paths.length];
		for (int i = 0; i < paths.length; i++)
			files[i] = new File(dir, paths[i]);
	}
	
	public File[] getFiles()
	{
		return files;
	}
}
