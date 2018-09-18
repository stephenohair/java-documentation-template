[![Build Status](https://travis-ci.org/SuperEvenSteven/java-documentation-template.svg?branch=master)](https://travis-ci.org/SuperEvenSteven/java-documentation-template) [![MIT Licence](https://badges.frapsoft.com/os/mit/mit.svg?v=103)](https://opensource.org/licenses/mit-license.php) [![Documentation](https://img.shields.io/badge/code-documented-brightgreen.svg)](https://superevensteven.github.io/java-documentation-template/index.html)

# java-documentation-template
Simple template for generated project documentation using maven site, markdown and plantuml.

See this template in action [here](https://superevensteven.github.io/java-documentation-template/index.html)

## Where is the technical documentation?
All technical documentation can be found in the `src/main/docs` directory. 

It's written in markdown format and includes UML diagrams written using PlantUML syntax. 

See the [PlantUML language reference guide](files/PlantUML_Language_Reference_Guide.pdf) for more info.

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
                  └── technical-documentation.md (the main technical document)
```

**Note 1:** All referenced, files, diagrams, images and html files are copied into the `target/site` directory when the documentation is generated.

**Note 2:** The project `README` file is automatically copied from the `${project.basedir}/README` to `${project.basedir}/src/site/markdown/index.md` when the documentation is generated (as detailed below). This is done so that the README will appear on the landing page (index.html) of the generated site. 
## How do I generate documentation?
From a terminal run: `mvn clean site`

This will generate a local website under the `target/site/index.html` containing the following documentation and reporting metrics:

- README
- technical documentation
- linkable UML diagrams
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