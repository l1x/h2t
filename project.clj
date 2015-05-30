(defproject h2t "0.1.0"

  :description "FIXME: write description"

  :url "http://example.com/FIXME"

  :license {:name "Apache License, Version 2.0" :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :dependencies [ [org.clojure/clojure        "1.6.0"]
                  [org.clojure/tools.logging  "0.2.6"]
                  [org.slf4j/slf4j-log4j12    "1.7.10"  ]
                  [ch.qos.logback/logback-classic "1.1.2"]
                  [org.clojure/clojurescript  "0.0-2760"]
                  [org.omcljs/om              "0.8.8"]
                  [compojure                  "1.3.4"]
                  [hiccup                     "1.0.5"]
                 ]

  :source-paths ["src-clj"]

  :plugins [[lein-cljsbuild "1.0.6"]
            [lein-ring "0.9.4"]]
  :hooks [leiningen.cljsbuild]
  :cljsbuild {
    :builds [

            {:id "dev"
             :source-paths ["src-cljs"]
             :jar true
             :compiler {
              :output-to "resources/public/js/main-debug.js"
              :optimizations :whitespace
              :pretty-print true}}

]}

:ring {:handler h2t.http/app})
