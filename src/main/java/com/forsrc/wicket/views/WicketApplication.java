package com.forsrc.wicket.views;

import java.text.MessageFormat;

import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.markup.html.IPackageResourceGuard;
import org.apache.wicket.markup.html.SecurePackageResourceGuard;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.apache.wicket.util.time.Duration;

public class WicketApplication extends WebApplication {

	@Override
	public Class<? extends WebPage> getHomePage() {
		return HomePage.class;
	}

	@Override
	public void init() {
		super.init();
		//configureAlternateHtmlLocation();
		//enableHotChanges();
		onInitialize();
	}

	protected void onInitialize() {
		super.getComponentInstantiationListeners().add(
				new SpringComponentInjector(this));
	}

	private void configureAlternateHtmlLocation() {
		IPackageResourceGuard packageResourceGuard = getResourceSettings()
				.getPackageResourceGuard();

		if (packageResourceGuard instanceof SecurePackageResourceGuard) {
			SecurePackageResourceGuard guard = (SecurePackageResourceGuard) packageResourceGuard;
			guard.addPattern(MessageFormat.format(
					"+WEB-INF/classes/{0}/*",
					WicketApplication.class.getPackage().getName()
							.replace(".", "/")));
		}

	}

	private void enableHotChanges() {
		RuntimeConfigurationType configurationType = getConfigurationType();
		if (RuntimeConfigurationType.DEVELOPMENT.equals(configurationType)) {
			getResourceSettings().setResourcePollFrequency(Duration.ONE_SECOND);
		}
	}
}
