![Google-Fonts-Library-Header.jpg](http://imgur.com/FpE1fNN.jpg "Header Image")
# GoogleFontsLibrary-Android
[ ![Download](https://api.bintray.com/packages/vamzi/GoogleFontsLibrary-Android/GoogleFontsLibrary-Android/images/download.svg) ](https://bintray.com/vamzi/GoogleFontsLibrary-Android/GoogleFontsLibrary-Android/_latestVersion)[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)[![](https://jitpack.io/v/vamzi/GoogleFontsLibrary-Android.svg)](https://jitpack.io/#vamzi/GoogleFontsLibrary-Android)

### Stable Release v0.1.2

A android module for google fonts to be included in your app. It's simple and easy to change `TypeFace` of `TextView` by a simple line of code.

# Getting Started

For Gradle build

Step 1. Add the JitPack repository to your build file
Include this in your root `build.gradle` at the end of repositories

```sh
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency

```sh
	dependencies {
	        compile 'com.github.vamzi:GoogleFontsLibrary-Android:0.1.2'
	}
```

For Maven

Step 1. Add the JitPack repository to your build file
```sh
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
Step 2. Add the dependency
```sh
	<dependency>
	    <groupId>com.github.vamzi</groupId>
	    <artifactId>GoogleFontsLibrary-Android</artifactId>
	    <version>0.1.2</version>
	</dependency>
```
### Usage
It is very simple to get used to this library.
```sh
mTextView.setTypeface(GoogleFontsLibrary.NotoSans(this, FontStyle.REGULAR));
```

### Fonts available in this library 
|Font Family|Font Styles|
|-----------|-----------|
|Roboto|`THIN` `LIGHT` `MEDIUM` `REGULAR` `BOLD`|
|Saira Condensed|`THIN` `LIGHT` `MEDIUM` `REGULAR` `BOLD`|
|Noto Sans|`BOLD` `REGULAR`|
|Zilla Slab Highlight|`BOLD` `REGULAR`|

### More Fonts are available in [Wiki Page](https://github.com/vamzi/GoogleFontsLibrary-Android/wiki)

### Feedback

Suggestion and feeback can be submited at this link [Google Form](https://docs.google.com/forms/d/e/1FAIpQLSeg1s_MsDNKvOjI_le9iSzTOeL-H7S1KFQa_7ZIW3XwtjnUTg/viewform?usp=pp_url&entry.1898373068=GoogleFontsLibrary-Android&entry.1429518920)

# License 
```sh
Copyright 2017, Vamsi Krishna Kothapalli

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
