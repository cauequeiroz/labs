/*
  FizzBuzz
  Write a program that uses console.log to print all the numbers from 1 to 100, with two exceptions.
  For numbers divisible by 3, print "Fizz" instead of the number, and for numbers divisible
  by 5 (and not 3), print "Buzz" instead.

  When you have that working, modify your program to print "FizzBuzz" for numbers that are divisible
  by both 3 and 5 (and still print "Fizz" or "Buzz" for numbers divisible by only one of those).
===================================================================================================== */
for (let number = 1; number <= 100; number++) {
  let divisibleBy3 = number % 3 === 0;
  let divisibleBy5 = number % 5 === 0;
  let divisibleBy3And5 = divisibleBy3 && divisibleBy5;

  if (divisibleBy3And5) {
    console.log("FizzBuzz");
  } else if (divisibleBy3) {
    console.log("Fizz");
  } else if (divisibleBy5) {
    console.log("Buzz");
  } else {
    console.log(number);
  }
}