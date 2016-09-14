package com.forsrc.wicket.base.views;

import org.apache.wicket.markup.html.WebPage;

import org.apache.wicket.request.mapper.parameter.PageParameters;

public abstract class BasePage extends WebPage {

	public BasePage() {
		this(new PageParameters());
	}

	public BasePage(PageParameters pageParameters) {
		super(pageParameters);
	}

}
