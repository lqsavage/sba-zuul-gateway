package com.iihtibm.sba.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class Translator {

	private static ResourceBundleMessageSource messageSource;

	@Autowired
	Translator(ResourceBundleMessageSource messageSource) {
		Translator.messageSource = messageSource;
	}

	public static String toLocale(String msg, Object ...placeHolders) {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage(msg, placeHolders, locale);
	}
}

