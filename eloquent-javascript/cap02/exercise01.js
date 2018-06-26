/*
  Looping a triangle
  Write a loop that makes seven calls to console.log to output the following triangle:

  #
  ##
  ###
  ####
  #####
  ######
  #######
===================================================================================================== */

let triangle = "";

for (let line = 1; line <= 7; line++) {
  for (let column = 1; column <= line; column++) {
    triangle += "#";
  }

  triangle += "\n";
}

console.log(triangle);