package com.mvpvaadin.view;

import com.mvpvaadin.event.EventHandler;

/**
 * A {@link NavigateableView} is a {@link View} that can be used in combination with an {@link LiteNavigationController}
 * @author Hannes Dorfmann
 *
 */
public interface NavigateableView extends View{
	
	/**
	 * The piece after the # (hash) in the url
	 * @return
	 */
	public String getUriFragment();
	
	
	public String getBreadcrumbTitle();
	
	
	/**
	 * This method is called by the {@link LiteNavigationController} to get the Event, that is needed to re
	 * @return
	 */
	public com.mvpvaadin.event.Event<? extends EventHandler> getEventToShowThisView();
	
	
}
