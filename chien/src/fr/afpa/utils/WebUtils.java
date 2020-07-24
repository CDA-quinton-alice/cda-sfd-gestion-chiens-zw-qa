package fr.afpa.utils;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class WebUtils {
	public static int parseInt(String strInt, int defaultValue) {
		try {
			return Integer.parseInt(strInt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return defaultValue;
	}

	public static <T> T copyParamToBean(Map value, T bean) {
		try {
			System.out.println("Before" + bean);
			BeanUtils.populate(bean, value);
			System.out.println("After" + bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
}
