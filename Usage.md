## Add the library ##

#### With Maven ####
Use [gwt-maven-plugin](http://mojo.codehaus.org/gwt-maven-plugin/)

Define the repository in the repositories section
```
		<repository>
			<id>gwetoloc-repository</id>
			<name>gwetoloc</name>
			<url>http://gwetoloc.googlecode.com/svn/repository</url>
		</repository>
```
Define the dependency in the dependencies section
```
		<dependency>
			<groupId>com.googlecode.gwetoloc</groupId>
			<artifactId>gwetoloc</artifactId>
			<version>0.0.1-beta</version>
		</dependency>
```
#### Without Maven ####
  * gwetoloc-0.0.1-beta.jar

## Add the module in your .gwt.xm ##
```
<inherits name='com.googlecode.gwetoloc.GWeToloc' />

```