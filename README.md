[![Build Status](https://travis-ci.org/SuperEvenSteven/java-documentation-template.svg?branch=master)](https://travis-ci.org/SuperEvenSteven/java-documentation-template) [![MIT Licence](https://badges.frapsoft.com/os/mit/mit.svg?v=103)](https://opensource.org/licenses/mit-license.php) [![Documentation](https://img.shields.io/badge/code-documented-brightgreen.svg)](https://superevensteven.github.io/java-documentation-template/index.html) [![OpenJDK8](https://img.shields.io/badge/OpenJDK-8-brightgreen.svg)](https://openjdk.java.net/)

# java-documentation-template
Simple template for generated project documentation using maven site, markdown and plantuml.

See this template in action [here](https://superevensteven.github.io/java-documentation-template/index.html)

## Optional Pre-requisite
In order to generate PlantUML diagrams you must have GraphViz installed on your system path, be it linux/mac/windows. The site will still generate without it but will have missing diagrams.

On linux this is as simple as running this from a terminal: `sudo apt-get install graphviz`

## Where is the documentation?
All documentation can be found in the `src/main/docs` directory. 

It's written in markdown format and includes UML diagrams written using PlantUML syntax. 

See the [PlantUML language reference guide](http://plantuml.com/PlantUML_Language_Reference_Guide.pdf) for more info.

See the following for additional extensions that can be used to enhance your markdown:

https://github.com/vsch/flexmark-java/blob/master/flexmark-profile-pegdown/src/main/java/com/vladsch/flexmark/profiles/pegdown/Extensions.java

The documentation structure is as follows:

```
${project.basedir}
         |
         ├── pom.xml
         ├── README.md (this document!)
         └── src
            ├── site (used for maven site generation)
            ├── test (java testing code)
            └── main 
               └──docs
                  ├── diagrams(PlantUml formatted text files for referenced UML diagrams)
                  ├── files (referenced files eg. pdf,doc)
                  ├── html (simple stylesheet used during doco generation)
                  ├── images (referenced images, eg. png/svg)
                  ├── support-documentation.md (the support document)
                  ├── test-plan-documentation.md (the test-plan document)
                  └── technical-documentation.md (the main technical document)
```

**Note 1:** All referenced, files, diagrams, images and html files are copied into the `target/site` directory when the documentation is generated.

**Note 2:** The project `README` file is automatically copied from the `${project.basedir}/README` to `${project.basedir}/src/site/markdown/index.md` when the documentation is generated (as detailed below). This is done so that the README will appear on the landing page (index.html) of the generated site. 
## How do I generate documentation?
From a terminal run: `mvn clean site`

This will generate a local website under the `target/site/index.html` containing the following documentation and reporting metrics:

- README
- technical documentation
- test-plan documentation
- support documentation
- linkable UML scalable diagrams (SVG)
- java code documentation
- code coverage (line & branch)
- coding style checks
- bug checks 
- duplicate code
- complexity
- java coding standards
- generated class diagrams based on code
- vulnerability checks on project code including dependent code
- flattened list of all dependencies used

## Extra
There's a CI .travis.yml build script for this project that can be used as an example of how you publish your generated site documentation straight to your personal github page on each commit pushed to master. 
**Note:** you'll need to generate a personal github token for use in travis and in your travis build of the project add a GITHUB environment variable using that token.
