(deftask cider
  "CIDER profile"
  []
  (require 'boot.repl)
  (swap! @(resolve 'boot.repl/*default-dependencies*)
    concat '[[org.clojure/tools.nrepl "0.2.13"]
             [cider/cider-nrepl "0.15.0-SNAPSHOT"]])
  (swap! @(resolve 'boot.repl/*default-middleware*)
    concat '[cider.nrepl/cider-middleware])
  identity)
