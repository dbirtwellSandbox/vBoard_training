This is the 1st few video's results for

Practical Java Project with Spring 4 Part 1
https://www.udemy.com/practical-java-project-with-spring-4-part-1

This was build using Spring STS with the following defaults:

Spring Web
Thymeleaf
Gradle
Java 8
War File


Added package
package com.livingoncodes.vboard.controller;

and Controller HomeController class


in build.gradle added mavenLocal()

Also:
	// Added webjars for fron-end dependencies
	compile 'org.webjars:bootstrap:3.3.1'

-------------------------------------------------
GitHub
-------------------------------------------------
	
Created GitHub account:
dbirtwellSandbox

1) Create .gitignore file

…or create a new repository on the command line

2)
echo "# vBoard_training" >> README.md
git init
git add README.md
git add .
git commit -m "first commit"
git remote add origin https://github.com/dbirtwellSandbox/vBoard_training.git
git push -u origin master


Bootstrap:

Take from:

http://getbootstrap.com/examples/carousel/


create database:
CREATE DATABASE vboard;

to create a new branch

check branch
> git branch

stash current
> git stash

create new branch
> git checkout -b register_view

get stashed changes
> git stash pop

Add revisions
> git add .

Commit local
> git commit -m "adding register view"

push branch to GitHub Master

git push origin <my_new_branch>
> git push origin register_view
-------------------------------------------------
Add more .gitignore
-------------------------------------------------
bin
build

classes

-------------------------------------------------
NOTE:
To remove the accidentally committed bin folder:
-------------------------------------------------
$ git rm bin
$ git commit -m "Removed bin folder"
$ git push origin master