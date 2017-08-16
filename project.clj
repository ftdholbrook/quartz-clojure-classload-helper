(defproject org.clojars.ftdholbrook/quartz-clojure-classload-helper "0.0.1"
  :description "Helper for quartz to dynamically load Clojure classes."
  :url "https://github.com/ftdholbrook/quartz-clojure-classload-helper"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :java-source-paths ["src/java"]
  :source-paths ["src/clj"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.quartz-scheduler/quartz "2.1.7"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
