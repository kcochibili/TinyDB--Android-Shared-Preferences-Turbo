
package kcochibili.android.adopted.gson;

import kcochibili.android.sharedpref.turbo.gson.api.GsonComponent;

public class GoogleGson implements GsonComponent {

	public GoogleGson () {

	}

	@Override
	public Object toJson (final String json, final Class<?> classOfT) {
		final com.google.gson.Gson gson = new com.google.gson.Gson();
		return gson.toJson(json, classOfT);
	}

	@Override
	public String toJson (final Object obj) {
		final com.google.gson.Gson gson = new com.google.gson.Gson();
		return gson.toJson(obj);
	}

}
