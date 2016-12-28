package kcochibili.android.adopted.gson;

import kcochibili.android.sharedpref.turbo.gson.api.GsonComponent;

public class GoogleGson implements GsonComponent {
	com.google.gson.Gson gson;

	public GoogleGson() {
		gson = new com.google.gson.Gson();
	}

	@Override
	public Object toJson(String json, Class<?> classOfT) {
		return gson.toJson(json,classOfT);
	}

	@Override
	public String toJson(Object obj) {
		return gson.toJson(obj);
	}

}
