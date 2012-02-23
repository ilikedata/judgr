(ns clj-thatfinger.db.base)

(defprotocol FeatureDB
  "Protocol for reading/writing feature information from/to a database."
  (add-item! [db item class] "Stores an item indicating its class.")
  (add-feature! [db item feature class] "Stores an item's feature indicating its class.")
  (count-features [db] "Returns the total number of features.")
  (get-feature [db feature] "Returns information about a feature."))