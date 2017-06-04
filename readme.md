# Com4j Example
Example for using [com4j](http://com4j.kohsuke.org/), the Java/COM bridge. 

The example uses `%WINDIR%\system32\wshom.ocx`, which contains a type library, and invokes the 
`IFileSystem3.getFileVersion` method to obtain version information on file(s) specified as command line arguments.

## Generate Java Bridge
Use the `com4j:gen` plugin to only generate com4j files:

    mvn -Dfile="C:\windows\system32\wshom.ocx" com4j:gen

## Build
Use maven to build the application:

    mvn compile

(this will also generate the com4j files)

## Run
Use the `exec:java` plugin to run the application from the command line:

    mvn exec:java -Dexec.args="c:\windows\explorer.exe"

