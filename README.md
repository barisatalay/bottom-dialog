[![](https://jitpack.io/v/barisatalay/bottom-dialog.svg)](https://jitpack.io/#barisatalay/bottom-dialog)

# Bottom-Dialog
Bottom Dynamic Dialog for Android Projects

## Screen Shots
It will be uploaded

## Usage

### Step 1
```groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

### Step 2

Add dependencies in build.gradle.
```groovy
    dependencies {
       implementation 'com.github.barisatalay:bottom-dialog:1.0'
    }
```

### Step 3 (Use of library)

```java
   val view = LayoutInflater.from(applicationContext).inflate(R.layout.item_test, null)
   
   BottomDialog(this)
     .setView(view as ViewGroup)
     .setCancelable(true)//if you set 'false', then you can access background views. Try it :)
     .show()
``` 


## Contact me
 If you have a better idea or way on this project, please let me know, thanks :)

[Email](mailto:b.atalay07@hotmail.com)

[My Blog](http://brsatalay.blogspot.com.tr)

[My Linkedin](http://linkedin.com/in/barisatalay07/)
