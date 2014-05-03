TinyDB--Android-Shared-Preferences-Turbo
========================================

This class simplifies calls to SharedPreferences in a line of code. it can also do more like: saving a list of Strings, ints. and Saving images. All in 1 line of code!

example usage:
```
TinyDB tinydb = new TinyDB(context);

tinydb.putInt("clickCount", 2);
tinydb.putFloat("xPoint", 3.6f);
tinydb.putLong("userCount", 39832L);

tinydb.putString("userName", "john");
tinydb.putBoolean("isUserMale", true); 

tinydb.putList("MyUsers", mUsersArray);
tinydb.putImagePNG("DropBox/WorkImages", "MeAtlunch.png", lunchBitmap);

//These plus the corresponding get methods are all included
```


This is just an example of how easy it is to use. there are many more usefull methods included in the class. Enjoy :)
