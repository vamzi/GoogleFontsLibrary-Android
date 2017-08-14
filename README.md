![Google-Fonts-Library-Header.jpg](http://imgur.com/FpE1fNN.jpg "Header Image")
# GoogleFontsLibrary-Android
[![](https://jitpack.io/v/vamzi/GoogleFontsLibrary-Android.svg)](https://jitpack.io/#vamzi/GoogleFontsLibrary-Android)


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
MIT License

Copyright (c) 2017 VAMSI KRISHNA KOTHAPALLI

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
