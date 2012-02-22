(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "TODO: Project Description."
  :java-source-path "src/jvm"
  :jvm-opts ["-Xmx768m" "-server"]
  :repositories {"conjars" "http://conjars.org/repo/"}
  :dev-resources-path "dev"
  :dependencies [[cascading/cascading-hadoop {{version}}
                  :exclusions [org.codehaus.janino/janino
                               org.apache.hadoop/hadoop-core]]]
  :dev-dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]])
