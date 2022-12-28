
# IsRun Application

The code blocks that you can check if the application is running are as follows.


## IsRunApplicationHelper

```kotlin
fun isRunForegroundThisApplication(context: Context): Boolean {
        val manager = context.getSystemService(ACTIVITY_SERVICE) as ActivityManager
        val runningApplicationTaskInformation = manager.getRunningTasks(1)
        val componentInformation = runningApplicationTaskInformation[0].topActivity
        componentInformation?.let { info ->
            if (info.packageName == context.packageName) {
                return true
            }
        }
        return false
    }
```

## MainActivity.kt

```kotlin
   //Checking if the application is open
        if (IsRunApplicationHelper.isRunForegroundThisApplication(this)){
            // What to do if the app is open
            Log.e(this@MainActivity.javaClass.name, "Application is open" )
        }else{
            // What to do if the app is close
            Log.e(this@MainActivity.javaClass.name, "Application is not open" )
        }
```


## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/muhammed-furkan-kucuk-40897111a/)
[![google](https://img.shields.io/badge/google-0A66C2?style=for-the-badge&logo=google&logoColor=orange)](https://g.dev/mfurkankck)
