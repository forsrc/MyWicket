package com.forsrc.utils;

import java.util.Locale;

import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * 
 * @ClassName: CapitalizedUrlBasedViewResolver
 * @Description:
 * 
 */
public class CapitalizedUrlBasedViewResolver extends UrlBasedViewResolver {
	@Override
	protected boolean canHandle(String viewName, Locale locale) {
		return isCapitalized(viewName);
	}

	/**
	 * 
	 * @Title: isCapitalized
	 * @Description:
	 * @param @param viewName
	 * @return boolean
	 * @throws
	 */
	private boolean isCapitalized(String viewName) {
		String firstCharacter = viewName.substring(0, 1);
		return firstCharacter.equals(firstCharacter.toUpperCase());
	}
}
