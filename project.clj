(defproject h2t "0.1.0"

  :description "FIXME: write description"

  :url "http://example.com/FIXME"

  :license {:name "Apache License, Version 2.0" :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :dependencies [ [org.clojure/clojure            "1.6.0"     ]
                  [org.clojure/tools.logging      "0.2.6"     ]
                  [org.slf4j/slf4j-log4j12        "1.7.10"    ]
                  [ch.qos.logback/logback-classic "1.1.2"     ]
                  [org.clojure/clojurescript      "0.0-2760"  ]
                  [org.omcljs/om                  "0.8.8"     ]
                  [compojure                      "1.3.4"     ]
                  [hiccup                         "1.0.5"     ]
                  [figwheel                       "0.3.3"     ]  ]

  :source-paths ["src-clj"]

  :plugins [  [lein-cljsbuild "1.0.6" ]
              [lein-ring      "0.9.4" ]
              [lein-figwheel  "0.3.3" ] ]

  :cljsbuild {
    :builds [
      {:id "dev"
       :source-paths ["src-cljs"]
       :compiler {
       :output-to "resources/public/js/main.js"
       :optimizations :none
       :cache-analysis true
       :source-map-timestamp true
       :source-map true
       :pretty-print false}}]}
  :figwheel 
    { :css-dirs ["resources/public/css"]
      :open-file-command "emacsclient" }
:ring {:handler h2t.http/app})
  
