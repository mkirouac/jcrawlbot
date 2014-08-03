package org.jcrawlbot;

import java.net.URL;

public interface Scheduler
{
	void schedule(URL url);
	void shcedule(URL url, URL referer);
}
