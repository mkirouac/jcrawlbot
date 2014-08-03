package org.jcrawlbot;

public interface Page
{
	byte[] getContent();
	String getTextContent();
	CrawlUrl getCrawledUrl();
}
