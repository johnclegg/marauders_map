package main

type Truck struct {
  FoodTruckId int `db:"id"`
  Name string
  Latitude float64 `db:"lat"`
  Longitude float64 `db:"lng"`
  Url string
  IsOpen bool `db:"is_open"`
}
