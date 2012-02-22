(ns leiningen.new.cascading
  (:use leiningen.new.templates))

(def render (renderer "cascading"))

(def default-version "2.0.0-wip-226")

(defn cascading
  "Leiningen template generator for new Cascading projects."
  [name & [version]]
  (let [data {:name name
              :sanitized (sanitize name)
              :version (or version default-version)}]
    (println (format "Generating a Cascading %s project called %s.")
             (:version data) name)
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["README.md" (render "README.md" data)]
             [".gitignore" (render "gitignore" data)]
             ["dev/apache.200.txt" (render "apache.200.txt" data)]
             ["src/java/{{sanitized}}/Main.java" (render "Main.java" data)])))
