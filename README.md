# TinyDB -- Android-Shared-Preferences-Turbo

This class simplifies calls to SharedPreferences in a line of code. It can also do more like: saving a list of strings, integers and saving images. All in 1 line of code!

**Example usage:**
```
TinyDB tinydb = new TinyDB(context);

//Put data in database
tinydb.putInt("clickCount", 2);
tinydb.putFloat("xPoint", 3.6f);
tinydb.putLong("userCount", 39832L);

tinydb.putString("userName", "john");
tinydb.putBoolean("isUserMale", true); 

tinydb.putList("MyUsers", mUsersArray);
tinydb.putImagePNG("DropBox/WorkImages", "MeAtlunch.png", lunchBitmap);

//Get data from database
int dataint = tinyDB.getInt("clickCount");
String datastring = tinyDB.getString("userName");
//These plus the corresponding get methods are all included
```


This is just an example of how easy it is to use. There are many more useful methods included in the class. Enjoy :)



If you'd like to also save Objects, use the methods: 
```
tinydb.putObject(key, object);
tinydb.putListObject(key, objectsArray);
```
**Example of saving Objects:**
```
Person person = new Person("john", 24);
tinydb.putObject("user1", person); //saves the object
tinydb.getObject("user1", Person.class); // retrieves the object from storage

ArrayList<Person> usersWhoWon = new ArrayList<Person>();
ArrayList<Object> winnersObjects = new ArrayList<Object>();

for(Person p : usersWhoWon){
    winnersObjects.add((Object)p); // casting to raw objects
}

tinydb.putListObject("allWinners", winnersObjects);
```
**Kotlin usage sample:**
```
// instantiate
var tinyDB : TinyDB = TinyDB(applicationContext)


// put / save
tinyDB.putString("nameKey", "John")

var winnerPerson : Person = Person()
tinyDB.putObject("winnerKey", winnerPerson);

// get
var personName : String  = tinyDB.getString("nameKey")
var winnerPerson : Person = tinyDB.getObject("winnerKey", Person::class.java)
```

Before you can use the save objects methods, you must first: 

1. Download [**Gson.jar**][1]

2. Place the Gson.jar file  into your projects "libs" folder (create one if you dont already have the folder)

3. Uncomment the save objects methods in your copy of TinyDB.java, starting at: [**Line31**][2], [**Line333-355**][3], [**Line489-503**][4]

[1]:  http://search.maven.org/#artifactdetails%7Ccom.google.code.gson%7Cgson%7C2.4%7Cjar
[2]:  https://github.com/kcochibili/TinyDB--Android-Shared-Preferences-Turbo/blob/master/TinyDB.java#L31
[3]:  https://github.com/kcochibili/TinyDB--Android-Shared-Preferences-Turbo/blob/master/TinyDB.java#L333-L355
[4]:  https://github.com/kcochibili/TinyDB--Android-Shared-Preferences-Turbo/blob/master/TinyDB.java#L489-L503


**Installation:**
Just add the TinyDB.java file as a Java Class and you can now use it according to the examples shown above.
