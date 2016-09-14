package com.forsrc.wicket.views;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.wicket.request.http.WebRequest;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.protocol.http.servlet.ServletWebRequest;

import com.forsrc.utils.WicketUtils;

public class HelloPage extends WebPage {

	protected Map getModel() {
		// HttpServletRequest request = ((ServletWebRequest)
		// getRequest()).getHttpServletRequest();
		// HttpSession session = ((ServletWebRequest)
		// getRequest()).getHttpServletRequest().getSession();

		HttpServletRequest request = WicketUtils.getHttpServletRequest();

		Map model = new HashMap();
		Enumeration<String> e = request.getAttributeNames();
		while (e.hasMoreElements()) {
			String attrName = e.nextElement();
			model.put(attrName, request.getAttribute(attrName));
		}
		return model;
	}

	public HelloPage(final PageParameters parameters) {
		Map model = getModel();
		add(new Label("message", (model.get("message") == null ? ""
				: String.valueOf(model.get("message")))));
	}
}
