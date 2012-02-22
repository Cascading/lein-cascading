# Lein-Cascading

A Leiningen plugin for Cascading 2.0. (Still in development! This plugin only works with Leiningen 1.6.2.)

## Getting Started

You'll need Leiningen, the build tool for Clojure. These instructions are copied from the Leiningen README:

* [Download this script](https://raw.github.com/technomancy/leiningen/stable/bin/lein) which is named `lein`
* Place it on your path so that you can execute it. (I like to use `~/bin`)
* Set it to be executable. (`chmod 755 ~/bin/lein`)

Run the following commands to install `lein-cascading`:

```bash
lein plugin install lein-newnew 0.1.2
lein plugin install lein-cascading 1.0.0-SNAPSHOT
```
    
## Creating a new Cascading Project

With lein-cascading, creating a new Cascading 2.0 project is as simple as:

    lein new cascading <project-name>
    cd <project-name>

Add your customizations to `project.clj`, run `lein deps` and you'll be good to go.

### Customizing your module

Generated modules come with a single class called `Main.java` containing an example log-parsing job.

All new projects will require the following steps:

- add custom dependencies to `project.clj`.
- Customize `README.md`

And that's it!
