# Brady Lange
# Worksheet 2
# 2/17/18
# R Basics

# 1.)
# Calculating 6 + 9 
6 + 9

# 2.)
# Assigning the answer in #1 to myVar
myVar <- 6 + 9 

# 3.)
# Creating a sequence of numbers from 5 to 10
seq(5, 10)

# 4.)
# Creating a sequence of numbers from 3 to -3
seq(-3, 3)

# 5.)
# Creating a sequence of 12 numbers from 0 to 10
seq(0, 10, length = 12)

# 6.)
# Writing one line code of code that takes 6, divides it by 4, adds 3, and multipleis by 3
(6 / 4 +3 ) * 3

# 7.)
# Declaring two variables whose names differs in case (upper vs lowercase)
Upper <- 0
lower <- 0

# 8.)
# Declaring a variable with a name that contains both alphanumeric ([0-9][a-z]) and non-alphanumeric characters
alph3.ag <- 0

# 9.)
# Creating a vector that contains the elements: 1 4 9 12 18
c(1, 4, 9, 12, 18)

# 10.)
# Writing a line of code that divides #9 by 4
c(1, 4, 9, 12, 18) / 4

# 11.)
# Declaring two vectors of length 10, one sequence from 1 to 10, the other from 1 to 100. Multiply the two together.
seq(1, 10, length = 10) * seq(1, 100, length = 10)

# 12.)
# Assigning x the value 1:6. In one line, take the mean of the factorial of x.
x <- 1:6
mean(factorial(x))

# 13.)
# Writing two lines of code, both of which generates the mean of 5 and 4.
z <- mean(c(5, 4))
mean(c(5, 4))

# 14.)
# Simulating the rolling of a 12-sided die in one line of code
sample(1:12, size = 1)

# 15.)
# Modifying my answer to number 14, to ensure only the values 1,4, and 12 will be drawn
sample(1:12, size = 1, prob = c(0.3, 0, 0, 0.4, 0, 0, 0, 0, 0, 0, 0, 0.3))

# 16.)
# Writing a function called square_mean() that takes as input a vector of numbers. The function squares the input vector, then calculates the mean. The function returns the answer.
square_mean <- function(x)
{
 square <- x * x
 result <- mean(square)
 result
}
square_mean(1:6)

# 17.)
# Creating a new function square_mean2() which uses a sequence 1 to 6 if no input arguments is provided
square_mean2 <- function(x = 1:6)
{
  mean(x^2)
}
square_mean2()
square_mean2(1:8)

# 18.)
# Creating a new function square_mean3(), which emulates the behavior of square_mean2(), except it returns no answer
square_mean3 <- function(x = 1:6)
{
  x <- mean(x^2)
}

# 19.)
# Calculating 28 modulus 6
28 %% 6

# 20.)
# Initializing a character vector of length 26
d <- character(26)

# 21.)
# Assigning the character 'a' to the first element in above vector
d[1] <- 'a'

# 22.)
# Creating a vector with some of peoples names
c("Adrian", "Brady", "Kobe")

# 23.)
# Getting the length of the above vector
length(c("Adrian", "Brady", "Kobe"))

# 24.)
# Pick 50 random numbers between 1 to 100, with replacement
sample(1:100, 50, replace = TRUE)
