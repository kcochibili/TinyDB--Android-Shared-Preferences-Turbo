package kcochibili.android.sharedpref.turbo.gson.api;

public class Err {

	public static void reportError(String string) {
		throw new Error(string);
	}

}
