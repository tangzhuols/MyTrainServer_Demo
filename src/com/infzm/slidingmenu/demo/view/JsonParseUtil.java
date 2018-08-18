package com.infzm.slidingmenu.demo.view;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonParseUtil {

	public static boolean parseJSonBoolean(JSONObject obj, String key) throws JSONException {
		if (obj == null)
			throw new JSONException("JSonObject is null.");
		if (!obj.has(key))
			throw new JSONException("JSonObject does not contains such key." + key);

		return obj.getBoolean(key);
	}

	public static double parseJSonDouble(JSONObject obj, String key) throws JSONException {
		if (obj == null)
			throw new JSONException("JSonObject is null.");
		if (!obj.has(key))
			throw new JSONException("JSonObject does not contains such key." + key);

		return obj.getDouble(key);
	}

	public static int parseJSonInt(JSONObject obj, String key) throws JSONException{
		if (obj == null)
			throw new JSONException("JSonObject is null.");
		if (!obj.has(key))
			throw new JSONException("JSonObject does not contains such key." + key);

		return obj.getInt(key);
	}
	
	public static JSONObject parseJSonObject(JSONObject obj, String key) throws JSONException {
		if (obj == null)
			throw new JSONException("JSonObject is null.");
		if (!obj.has(key))
			throw new JSONException("JSonObject does not contains such key." + key);

		return obj.getJSONObject(key);
	}
	
	public static JSONArray parseJSonArray(JSONObject obj, String key) throws JSONException {
		if (obj == null)
			throw new JSONException("JSonObject is null.");
		if (!obj.has(key))
			throw new JSONException("JSonObject does not contains such key." + key);

		return obj.getJSONArray(key);
	}

	public static long parseJSonLong(JSONObject obj, String key) throws JSONException {
		if (obj == null)
			throw new JSONException("JSonObject is null.");
		if (!obj.has(key))
			throw new JSONException("JSonObject does not contains such key." + key);

		return obj.getLong(key);
	}

	public static String parseJSonString(JSONObject obj, String key) throws JSONException {
		if (obj == null)
			throw new JSONException("JSonObject is null.");
		if (!obj.has(key))
			throw new JSONException("JSonObject does not contains such key." + key);
		
		String value = obj.getString(key);
		if (value == null)
			value = "";
		if (value == "null")
			value = "";
		
		return value;
	}

	public static JSONObject parseJSonObjectOffset(JSONArray array, int offset) throws JSONException {
		if (array == null)
			throw new JSONException("JSonArray is null.");
		if (array.length() <= offset)
			throw new JSONException("JSonArray's length smaller than offset.");
		
		return array.getJSONObject(offset);
	}
}
