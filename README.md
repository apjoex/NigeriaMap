# NigeriaMap
[ ![Download](https://api.bintray.com/packages/apjoex/NigeriaMap/com.apjoex.nigeriamap/images/download.svg) ](https://bintray.com/apjoex/NigeriaMap/com.apjoex.nigeriamap/_latestVersion)

![Map of Nigeria](https://i.imgur.com/8DfrG3I.png)

## Installation
Add this to your app's build.gradle file
```groovy
implementation 'com.apjoex:nigeriamap:1.0.6'
```

Or add NigeriaMap as a new dependency inside your pom.xml
```xml
<dependency>
  <groupId>com.apjoex</groupId>
  <artifactId>nigeriamap</artifactId>
  <version>1.0.6</version>
  <type>pom</type>
</dependency>
```

## Usage
```xml
 <com.apjoex.nigeriamap.NigeriaMap
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:id="@+id/nigeriamap"
        app:title="Map of Nigeria"
        app:showLegend="true"
        app:showTitle="true"/>
```

## Customization
• States and geo-political zones can be customized as shown below
```java

import com.apjoex.nigeriamap.States
import com.apjoex.nigeriamap.Zones

...

States.LAGOS.setBackgroundColor(Color.RED)
Zones.NORTH_WEST.setBackgroundColor(Color.BLUE)
```

• The map can be rendered in greyscale
```java
NigeriaMap map;
map = findViewById(R.id.nigeriaMap);
map.goGreyScale();

//or in colour
 map.goColoured();

```

• When changes have been made to states or zones alike, the legend can be force updated as shown below
```java
map.updateLegend();
```

## Libraries used
VectorMaster https://github.com/harjot-oberai/VectorMaster  
FlexBox for Android https://github.com/google/flexbox-layout

## Developed by
```
Akinde-peters Joseph
```
Twitter (http://twitter.com/apjoex)  
Skype (apjoex)  
Medium (https://medium.com/@apjoex)  
LinkedIn (http://linkedin.com/in/apjoex/)  

## License
```
Copyright 2018 Akinde-peters Joseph

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
