package org.jcrawlbot;

public interface EventHandler
{
	void onCrawlPageBegin(CrawlUrl url, CrawlContext context);
	void onCrawlPageFailed(CrawlUrl url, CrawlContext context, CrawlError error);
	void onCrawlPageSuscess(CrawlUrl url, CrawlContext context, Page page);
}
