package main

type Truck struct {
  FoodTruckId int `db:"id"`
  Name string
  Latitude float64 `db:"lat"`
  Longitude float64 `db:"lng"`
<<<<<<< HEAD
  Url string
  IsOpen bool `db:"is_open"`
=======
>>>>>>> 23d792e7480161b721d0600a261d8c3dba84d9cb
}
