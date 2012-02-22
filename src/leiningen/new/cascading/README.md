# {{name}}

(Add Project details here.)

## Usage

You'll need Leiningen, the build tool for Clojure. These instructions are copied from the Leiningen README:

* [Download this script](https://raw.github.com/technomancy/leiningen/stable/bin/lein) which is named `lein`
* Place it on your path so that you can execute it. (I like to use `~/bin`)
* Set it to be executable. (`chmod 755 ~/bin/lein`)

Next, CD into the project path and run the following to pull all dependencies:

```bash
lein deps
```

And you'll be good to go.

## Deploying to Conjars

(Instructions are copied from the `lein-clojars` [Github page](https://github.com/ato/lein-clojars).)

Add `lein-clojars` as a Leiningen plugin:

```bash
lein plugin install lein-clojars 0.7.0
```

Create a Clojars account and paste your SSH public key into your profile. If you don't have ssh-keygen available -- perhaps you're using Windows -- then you can use:

```bash
lein keygen
```

SSH keys will searched for in ~/.leiningen and ~/.ssh under the names id_rsa, id_dsa and identity.

To push your project to the Conjars repository, simply type:

```bash
lein push repo@conjars.org
```
