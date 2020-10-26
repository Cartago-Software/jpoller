package org.sadun.util.polling;

/**
 * Copyright (C) 1999, 2000 Cristiano Sadun. This software is released under LGPL. Indicates that the poller is going to sleep.
 * @version 1.0
 * @author C. Sadun
 */
public class CycleStartEvent extends BasePollerEvent
{
	
	CycleStartEvent(DirectoryPoller poller)
	{
		super(poller);
	}
}
