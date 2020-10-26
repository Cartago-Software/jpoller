package org.sadun.util.polling;

import com.deltax.util.listener.TimeStampedSignal;
/**
 * Copyright (C) 1999, 2000 Cristiano Sadun. This software is released under LGPL.
 *
 * A base class for polling-related events
 *
 * @version 1.0
 * @author C. Sadun
 */
public abstract class BasePollerEvent extends TimeStampedSignal {

    protected BasePollerEvent(DirectoryPoller poller) {
        super(poller);
    }

    public DirectoryPoller getPoller() { return (DirectoryPoller)getSource(); }

}
    