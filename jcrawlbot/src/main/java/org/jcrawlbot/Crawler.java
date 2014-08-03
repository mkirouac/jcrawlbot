package org.jcrawlbot;


public class Crawler
{
	private Scheduler scheduler;
	private PageFetcher fetcher;
	private EventHandler eventHandler;
	private FlowController controller;
	
	
	public Crawler(EventHandler anEventHandler)
	{
		this(anEventHandler, null, null, null);
	}
	
	public Crawler(EventHandler anEventHandler, Scheduler aScheduler, PageFetcher aFetcher, FlowController aController)
	{
		setScheduler(aScheduler);
		setFetcher(aFetcher);
		setEventHandler(anEventHandler);
		setController(aController);
	}
	
	public void Start()
	{
		throw new RuntimeException("NotImplemented");
	}

	public Scheduler getScheduler()
	{
		return scheduler;
	}

	protected void setScheduler(Scheduler aScheduler)
	{
		if(aScheduler == null)
		{
			scheduler = Factory.createDefaultScheduler();
		}
		else
		{
			scheduler = aScheduler;
		}
	}

	public PageFetcher getFetcher()
	{
		return fetcher;
	}

	protected void setFetcher(PageFetcher aFetcher)
	{
		if(aFetcher == null)
		{
			fetcher = Factory.createDefaultPageFetcher();
		}
		else
		{
			fetcher = aFetcher;
		}
	}

	public EventHandler getEventHandler()
	{
		return eventHandler;
	}

	protected void setEventHandler(EventHandler anEventHandler)
	{
		eventHandler = anEventHandler;
	}

	public FlowController getController()
	{
		return controller;
	}

	protected void setController(FlowController aController)
	{
		if(aController == null)
		{
			controller = Factory.createDefaultFlowController();
		}
		else
		{
			controller = aController;
		}
	}
	
}
