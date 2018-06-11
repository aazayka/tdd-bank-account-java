# Bank account kata
 - originated from Sandro Mancuso and the LSCC

----
## Overview
This session will be fun.  Thats the prinmary objective, have fund a code ... thats it!  In this session we will talk for a little bit about why XP practices are important and then we can write some code practicing two of the most fundamental ones.  The code will be super easy, this is not about writing complicated code ... quite the opposite.  We will get pairs of you to build really simply test driven code to make you rethink about how you write code from now on.  For those of you after more of a challenge we have included some optional Object Oriented rules to apply.

Come in pairs or make new friends on the day.  Please all bring your own laptop (we dont have any to share) with your favourite IDE installed (we will have prepared using IntelliJ and trust that Eclipse will work).  You can use whatever language you like, we have prepared Scala and Java modules here.  

----
##  Requirements to drive the kata
 - I can Deposit and Withdrawal money from accounts
 - I can Transfer amounts between accounts (if i have the funds)
 - I can print out an Account balance (date, amount, balance)  
 - I can print a statement of account activity (statement)  
 - I can apply Statement filters (just deposits, withdrawal, date)

----
## Importing into your IDE

1. Clone this repo from github to your local machine
1. From the command line type `gradlew.bat` or `./gradlew` to download dependencies and check the build is OK
1. From intellij "open" the project using the `build.gradle` file
1. Select to use the gradle wrapper and auto create folder etc
1. Once opened start with a test

----
## What is this kata trying to teach us
Two key things to learn / practice in this Kata:
1. Test Driven Development
1. Pair programming

### Test Driven Development
Test driven development is based on the principles of test-first development (where you write the test first) but goes an extra step.  The basic cycle follows the `Red -> Green -> Refactor` model:
 - __Red__: write a failing test.  Write a test that describes (think documentation) what the function you are writing actually does.  Likely this will not even compile (this is fine, not compiling IS a failing test).
 - __Green__: now write enough of an implementation to make the test pass.  You should write the simplest code possible to make teh code pass and resist the urge to write more than is actually needed.  Consider the [YAGNI](https://martinfowler.com/bliki/Yagni.html) principle.
 - __Refactor__: now we re-read the code and make sure that this is good enough to push to the _world at large_.  You should 

As a walkthrough consider applying TDD as a two stage process, the first phase writes the API in the test as it should be.  In this case the compiler is teh failing test, you rewrite it until you are happy and then to make it go green you use teh IDE to create the classes and methods as per the test.  The next phase of the cycle implements the methods to get the unit tests passing, followed by the refactoring to complete the RGR cycle described above.  The key message here is that you should consider the compiler failing as a failing test to allow you to get it green (alt+enter).

### Pair programming
There are many different ways to do pair programming, the most common model is the Driver-Navigator model.  For this kata, try and follow as below for simplicity.  There are two roles in this model (you should switch often to keep it interesting):
 - __The Driver__ is the person wiring the code (test driven) and implementing.  The Driver should be explaining what they are doing in a running monologue so the Navigator understands the direction taken and can assess it.
 - __The Navigator__ is the person observing and thinking about the big picture.  The best Navigators are those that ask `why?` often to check why.  For this kata, the Navigator is checking that they are really test driving (using the IDE) .  When applying object calisthenics the Navigator should be checking that the Nine rules are not being broken.  Correction and learning is the key here.   

----
## Going the extra mile

### Using object calisthenics
1. One level of indentation per method
1. Don’t use the ELSE keyword
1. Wrap all primitives and Strings
1. First class collections
1. One dot per line
1. Don’t abbreviate
1. Keep all entities small (50 lines)
1. No classes with more than two instance variables
1. No getters/setters/properties

### For more information:
-  [Object Calisthenics pdf](http://www.cs.helsinki.fi/u/luontola/tdd-2009/ext/ObjectCalisthenics.pdf)
-  Object Calisthenics (full book), Jeff Bay in: The ThoughtWorks Anthology.
Pragmatic Bookshelf 2008
-  Original idea for the kata: [How Object-Oriented Are You Feeling Today?](https://www.slideshare.net/KrzysztofJelski/how-object-oriented-are-you-feeling-today) - Krzysztof Jelski (Session on the Software Craftsmanship UK 2011 conference)

----