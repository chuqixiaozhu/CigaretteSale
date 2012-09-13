package com.etc.geeks.util;

import java.text.SimpleDateFormat;
import java.util.Date;



public class SheetId {
	private static String prefix = "Info";
	private static Date date = new Date();
	
	public static String getSheetId() {
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String id = prefix + sdFormat.format(date);
		return id;
	}
	public static String getSheetId(String type) {
		prefix = type;
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMdd");
		String id = prefix + sdFormat.format(date);
		return id;
	}
	/**
	 * @return the prefix
	 */
	public static String getPrefix() {
		return prefix;
	}
	/**
	 * @param prefix the prefix to set
	 */
	public static void setPrefix(String prefix) {
		SheetId.prefix = prefix;
	}
	/**
	 * @return the date
	 */
	public static Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public static void setDate(Date date) {
		SheetId.date = date;
	}
			
}


