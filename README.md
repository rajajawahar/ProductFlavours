# ProductFlavours
Sample for maintaining flavours in Android App in Studio


In this repository, I have added two flavous admin and customer.

Basically,Product flavors is a powerful feature of the gradle plugin in Android Studio. 
Several developers use it to create free/paid or full/demo versions, releasing customized versions of their product.

In your app/build.gradle,add the below code



productFlavors {
    customer {
      applicationIdSuffix ".customer"
      versionNameSuffix "-customer"
      dimension "module"
    }
    admin {
      applicationIdSuffix ".admin"
      versionNameSuffix "-admin"
      dimension "module"
    }
 }
 
 After adding the above code, sync your gradle and build it once.Your 
 
 ![Uploading Screen Shot 2018-01-09 at 1.19.45 PM.png…]()


 You can now create sourceSets folders app/src/customer/ and app/src/admin/ parallel to app/src/main/. 
 The common classes and resources can stay in app/src/main while the flavor dependent code can go in the
 respective folders. 
 
 
  sourceSets {
    main {
      jniLibs.srcDir 'src/main/libs'
    }
    customer {
      manifest.srcFile 'src/customer/AndroidManifest.xml'
      java.srcDirs = ['src/customer/java',]
      resources.srcDirs = ['src/customer/resources',]
     }

    admin {
      manifest.srcFile 'src/admin/AndroidManifest.xml'
      java.srcDirs = ['src/admin/java',]
      resources.srcDirs = ['src/admin/resources',]
    }
   }
    
      
When you create a new build variant, Android Studio doesn't create the source set directories for you,
but it does give you a few options to help you.

For example, to create just the java/ directory for your "customer" build type:

Open the Project pane and select the Project view from the drop-down menu at the top of the pane.
Navigate to MyProject/app/src/.

Right-click the src directory and select New > Folder > Java Folder.
From the drop-down menu next to Target Source Set, select debug.
Click Finish.

When you create a new build variant, Android Studio doesn't create the source set directories for you, but it does give you a few options to help you. For example, to create just the java/ directory for your "debug" build type:

Open the Project pane and select the Project view from the drop-down menu at the top of the pane.
Navigate to MyProject/app/src/.

Right-click the src directory and select New > Folder > Java Folder.
From the drop-down menu next to Target Source Set, select debug.
Click Finish.

This will create Java folder for your customer build,do the same for admin.

If you want to create  XML file for your "customer" build type:

In the same Project pane, right-click the src directory and select New > XML > Values XML File.
Enter the name for the XML file or keep the default name.
From the drop-down menu next to Target Source Set, select customer.
Click Finish.


