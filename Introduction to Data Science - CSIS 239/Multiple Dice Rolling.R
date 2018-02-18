# Brady Lange
# CSIS 239
# R Script 1
# 2/18/19
# This R script has the function multi_roll() that simulates rolling 2 dice three times each and outputs them into a single vector. If no values of the size of the die are entered by the user default values are given.

# This function simulates the rolling of a die three times each selected by a user or using default values of 1 to 20 and 1 to 9
multi_roll <- function(die1 = 1:20, die2 = 1:9)
{
  # Rolling die one three times
  die1_rolls <- sample(die1, size = 3, replace = TRUE)
  # Rolling die two three times
  die2_rolls <- sample(die2, size = 3, replace = TRUE)
  # Combining die one and die twos results into a vector
  die_comb <- c(die1_rolls, die2_rolls)
  # Printing out the new vector
  die_comb
}

# Testing the default values of the function (no values passed by a user)
multi_roll()
# Testing user values passed to the function
multi_roll(1:6, 1:2)

