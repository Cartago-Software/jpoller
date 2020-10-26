package org.sadun.util.polling;

/**
 * Copyright (C) 1999, 2000 Cristiano Sadun. This software is released under LGPL. Indicates that the poller has awakened.
 * @version 1.0
 * @author C. Sadun
 */
public class CycleEndEvent extends BasePollerEvent
{
	
	long[] newBaseTimes;
	
	CycleEndEvent(DirectoryPoller poller, long[] newBaseTimes)
	{
		super(poller);
		this.newBaseTimes = newBaseTimes;
	}
	
	public long[] getNewBaseTime()
	{
		return newBaseTimes;
	}
}
