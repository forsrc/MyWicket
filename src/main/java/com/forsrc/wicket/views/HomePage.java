package com.forsrc.wicket.views;

import java.util.Date;


import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.forsrc.wicket.base.views.BasePage;

public class HomePage extends BasePage {

	public HomePage() {
		this(new PageParameters());
	}

	public HomePage(PageParameters pageParameters) {
		super(pageParameters);
		add(new Label("message", "Hello World!  --> " + new Date()));
	}

}
