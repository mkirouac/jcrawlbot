package org.jcrawlbot;

public class FetchFailedException extends Exception
{
	private static final long serialVersionUID = 164361770042868848L;
	private CrawlError error;
	
	public FetchFailedException(CrawlError anError)
	{
		super();
		error = anError;
	}

	public CrawlError getCrawlError()
	{
		return error;
	}
}
