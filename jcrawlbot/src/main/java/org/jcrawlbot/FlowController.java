package org.jcrawlbot;

public interface FlowController
{
	boolean shouldCrawl(CrawlUrl url);
	boolean shouldParseLinks(Page page);
}
