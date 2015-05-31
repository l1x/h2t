(ns h2t.views
  (:require 
    [hiccup.page :refer [html5 include-js include-css]]))

(defn layout-default 
  [title & content] 
  (html5 {} ;{:ng-app "myApp" :lang "en"}
    [:head
      [:title title]
      (include-css "vendor/bootstrap/3.3.4/css/bootstrap.min.css")]
    [:body
      [:h2 {:class "text-success"} "Hello h2"]
      [:div {:id "my-app"} content ]
      (include-js "js/main.js") ]))

(defn index-page []
  (layout-default
  "Index"                             ;title
  [:div {:id "content"} "content"]))  ;content

