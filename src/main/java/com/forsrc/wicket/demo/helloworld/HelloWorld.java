package com.forsrc.wicket.demo.helloworld;

import java.util.Date;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.Strings;

public class HelloWorld extends WebPage {

	public HelloWorld() {
		this(new PageParameters());
	}

	public HelloWorld(PageParameters pageParameters) {
		super(pageParameters);
		add(new Label("message", "Hello World!  --> " + new Date()));
	}

}
