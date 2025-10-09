# S1.5-Java-Utils

<!-- TOC -->
* [S1.5-Java-Utils](#s15-java-utils)
* [📄 **Description**](#-description)
  * [**Level 1**](#level-1)
    * [**Exercise 01**](#exercise-01)
    * [**Exercise 02**](#exercise-02)
    * [**Exercise 03**](#exercise-03)
    * [**Exercise 04**](#exercise-04)
    * [**Exercise 05**](#exercise-05)
  * [**Level 02**](#level-02)
    * [**Exercise 01**](#exercise-01-1)
    * [**Level 03**](#level-03)
  * [💻 **Used technologies**](#-used-technologies)
  * [📋 **Requirements**](#-requirements)
  * [🛠️ **Install**](#-install)
<!-- TOC -->

# 📄 **Description**

## **Level 1**

### **Exercise 01**

    Create a class that alphabetically lists the contents of a directory received as a parameter.

💾 **Execution instructions**

1. Open a shell terminal.
2. Go to directory with ```cd S1.5-Java-Utils/src/main/java/Level_01/Exercise01``` command,
re Ex01Main.java is located.
3. Execute the command ```javac -d . Ex01Main.java ListDirEx01.java``` to compile and generate a .class file. This
e will be stored in a new directories made from package.
4. Execute the command ```java Level_01.Exercise01.ListDirEx01```
5. You can modify the directoy wich content is going to be printeb in line 11, after File.separator.

### **Exercise 02**

	Add to the class from the previous exercise the functionality to list a directory tree 
	with the contents of all its levels (recursively), so that they are printed on screen 
	in alphabetical order within each level, additionally indicating whether it's a 
	directory (D) or a file (F), and its last modification date.

💾 **Execution instructions**

1. Open a shell terminal.
2. Go to directory with ```cd S1.5-Java-Utils/src/main/java/Level_01/Exercise02``` command,
where ```Ex02Main.java``` is located.
3. Execute the command ```javac -d . Ex02Main.java ListDirEx02.java``` to compile and generate a .class file. This
file will be stored in a new directories made from package.
4. Execute the command ```java Level_01.Exercise01.Ex02Main```

**Exercise 02 Observations**

```lastModified()``` is a method form java.io.File that returns a long value representing 
the time the file was last modified, measured in milliseconds since the epoch (00:00:00 GMT, January 1, 1970)
I've instanced a ```SimpleDateFormat``` object with the ```"yyyy-MM-dd HH:mm:ss"``` pattern, in order
to call the object.format() method with converts the epoch long miliseconds in a String of pattern format.

### **Exercise 03**

    Modify the previous exercise. Now, instead of displaying the result on screen, 
	save the result in a TXT file.

💾 **Execution instructions**

1. Open a shell terminal.
2. Go to directory with ```cd S1.5-Java-Utils/src/main/java/Level_01/Exercise03``` command,
where Ex03Main.java is located.
3. Execute the command ```javac -d . Ex03Main.java ListDirEx03.java``` to compile and generate a .class file. This
file will be stored in a new directories made from package.
4. Execute the command ```java Level_01.Exercise01.Ex03Main```, this will create or override the file output.txt.
5. Open ```"output.txt"``` to see the result.

### **Exercise 04**

	Add the functionality to read any TXT file and display its content on the console.

💾 **Execution instructions**

1. Open a shell terminal.
2. Go to directory with `cd S1.5-Java-Utils/src/main/java/Level_01/Exercise04` command,
where Ex04Main.java is located.
3. Execute the command ```javac -d . Ex04Main.java ListDirEx04.java``` to compile and generate a .class file. This
file will be stored in a new directories made from package.
4. Execute the command ```java Level_01.Exercise01.Ex04Main```, this will print in console the content of Text.tx

### **Exercise 05**

	Now the program must serialize a Java Object to a .ser file and then deserialize it.

💾 **Execution instructions**

1. Open a shell terminal.
2. Go to directory with ```cd S1.5-Java-Utils/src/main/java/Level_01/Exercise05```command,
where Ex04Main.java is located.
3. Execute the command ```javac -d . Ex05Main.java serialObject.java``` to compile and generate a .class file. This
file will be stored in a new directories made from package.
4. Execute the command ```java Level_01.Exercise01.Ex05Main```, this will generate a ```"object.ser"``` file and also it
will print a few messages in console about the execution.

## **Level 02**

### **Exercise 01**

	Execute exercise 3 from the previous level by parameterizing all methods in a configuration file.
	You can use a Java Properties file, or the Apache Commons Configuration library if you prefer.
	From the previous exercise, parameterize the following:
		Directory to read
		Name and directory of the resulting TXT file

💾 **Execution instructions**

1. Open a shell terminal.
2. Go to directory with ```cd S1.5-Java-Utils/src/main/java/Level_02/Exercise01```command,
where Ex01Main.java is located.
3. Execute the command ```javac -d . Ex05Main.java ListDir.java``` to compile and generate a .class file. This
file will be stored in a new directories made from package.
4. Execute the command ```java Ex01Main```, this will generate a directory "result", inside theres is the
```"directoryList.txt"``` file.
5. Directory tree path can be changed in Configuration.properties File.
The actual path is ```[..] + File.separator + [..] + File.separator```.
Level1Directory is the first ```[..]```, which means go one directory level back.

### **Level 03**

**Exercise 01**

    Create a utility that encrypts and decrypts the resulting files from the previous levels.
	Use the AES algorithm in ECB or CBC mode with PKCS5Padding padding method. 
	You can use javax.crypto or org.apache.commons.crypto

## 💻 **Used technologies**

- Java
- Git

## 📋 **Requirements**

- Oracle OpenJDK 21.0.8

## 🛠️ **Install**

1. Clone this repo: **>  [git clone](https://github.com/mirexan/S1.2-Exceptions.git)**
2. Access to the directories in: S1.3-Java-Collections
3. Follow th execution instructions of each level that figures in the description section.