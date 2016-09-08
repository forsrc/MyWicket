package com.forsrc.wicket;

import java.util.Date;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.Strings;

public class HomePage extends WebPage {

	public HomePage() {
		this(new PageParameters());
	}

	public HomePage(PageParameters pageParameters) {
		super(pageParameters);
		add(new Label("message", "Hello World!  --> " + new Date()));
	}

}
