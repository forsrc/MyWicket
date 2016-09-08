package com.forsrc.wicket.demo.helloworld;

import java.util.Date;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.http.WebRequest;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.Strings;

public class HelloWorld extends WebPage {

	private String message = "[type your message to the world here]";

	public HelloWorld() {
		this(new PageParameters());
	}

	public HelloWorld(PageParameters pageParameters) {
		super(pageParameters);

		PropertyModel<String> messageModel = new PropertyModel<>(this,
				"message");

		add(new Label("message", "Hello World!  --> " + new Date()));

		final TextField textField = new TextField<String>("input-1",
				messageModel);

		add(textField);

		add(new Link<Void>("link-1") {
			@Override
			public void onClick() {
				WebRequest request = (WebRequest) getRequest();
				System.out.println(request.getUrl());
				message = System.currentTimeMillis() + "";
			}
		});

	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
