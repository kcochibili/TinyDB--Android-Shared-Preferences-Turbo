
package kcochibili.android.sharedpref.turbo.gson.api;

public interface GsonComponent {

	Object toJson(String json, Class<?> classOfT);

	String toJson(Object obj);

}
