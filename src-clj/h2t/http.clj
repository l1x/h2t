(ns h2t.http
  (:use compojure.core
        h2t.views
        [hiccup.middleware :only (wrap-base-url)])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [compojure.response :as response]
            [clojure.tools.logging  :as log   ]
            [ring.middleware.resource :as resource]))

(defroutes main-routes
  (GET "/" [] (do (log/debug "szop") (index-page)))
  (route/resources "/")
  (route/not-found "Page not found"))

(def app
  (-> (handler/site main-routes)
      (resource/wrap-resource "public")
;      (wrap-content-type)
      (wrap-base-url)))
