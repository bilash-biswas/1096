package main

import (
	"fmt"
)

func main() {
	var i, j int
	for i = 1; i <= 9; i = i + 2 {
		for j = 7; j >= 5; j-- {
			fmt.Printf("I=%d J=%d\n", i, j)
		}
	}
}
