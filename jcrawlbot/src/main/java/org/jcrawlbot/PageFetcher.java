package org.jcrawlbot;

import java.net.URL;

public interface PageFetcher
{
	Page fetch(URL url);
}
