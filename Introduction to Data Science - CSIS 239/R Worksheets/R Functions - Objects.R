# Brady Lange
# Worksheet 3
# 2/17/18
# R Functions - Objects

# 1.)
# Creating the vector my_names
my_names <- c('l','a','n','g','e','b','r','a','d','y')

# 2.)
# Determining if the variable my_names is vector
is.vector(my_names)

# 3.)
# Determining the type of my_names variable
typeof(my_names)

# 4
# Declaring x with the value of 5
x <- 5L
x

# 5.)
# Checking the type of 5
typeof(x)

# 6.)
# Creating a vector containing the values 4, "4", and 5.9234
new_vector <- c(4, "4", 5.9234)

# 7.)
# Checking the values stored in the vector
typeof(new_vector)
new_vector <- as.double(new_vector)
typeof(new_vector)

# 8.)
# Declaring a 1x5 vector
my_logic <- c(FALSE, FALSE, FALSE, FALSE, FALSE)
my_logic

# 9.)
# Setting the third and fifth element to TRUE
my_logic[3] <- TRUE
my_logic[5] <- TRUE
my_logic

# 10.)
# Giving sequential string names to elements in my_logic
names(my_logic) <- c("One", "Two", "Three", "Four", "Five")
my_logic

# 11.)
# Find which elements of my_logic are equal to zero
zero <- my_logic == 0
my_logic[zero]

# 12.)
# Declaring a vector work_days containing 5 days of the week
work_days <- c("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")

# 13.)
# Declaring a vector class_days which lists the number of classes I have a per day. Printing the days where I have more than two classes.
class_days <- c(4, 2, 4, 2, 4)
morethantwo <- class_days >= 2
work_days[morethantwo]

# 14.)
# Declaring a vector my_letters containing all letters of the alphabet
my_letters <- letters
my_letters

# 15.)
# Declaring a sequence of integers my_nums of length 16, from 1 to 16
my_nums <- seq(1L, 16L, length = 16)
my_nums

# 16). 
# Assigning my_nums element names from my_letters
names(my_nums) <- my_letters[1:length(my_nums)]
my_nums

# 17.)
# Reshaping my_nums into a 2x8 matrix
my_nums <- matrix(my_nums, 2, 8)
my_nums

# 18.)
# Transposing the vector into an 8x2 matrix 
my_nums <- t(my_nums)
my_nums

# 19.)
# Creating a 4x3 matrix of numbers my_mat 
my_mat <- matrix(1:12, 4, 3, byrow = TRUE)
my_mat

# 20.)
# Selecting all elements from the second column of my_mat
my_mat[ , 2]

# 21.)
# Declaring a 4x4 set of numbers, my_set, a sequence from 1 to 16, in one line of code
my_set <- matrix(1:16, 4, 4)
my_set

# 22.)
# Identifying elements in my_set greater than 6 and saving their indices into variable idx
idx <- my_set > 6
my_set[idx]

# 23.)
# Using idx, add 100 to the values in my_set
my_set[idx] <- my_set[idx] + 100
idx

# 24.)
# Setting the dimension names in my_set such that columns have names a,b,c,d, and row names are 1,2,3,4.
dimnames(my_set) <- list(c(letters[1:4]), seq(1, 4))
my_set

# 25.)
# Creating a function that accepts a vector as input. Divide the elements in the vector by the length of the input vector.
divisionFunc <- function(x) 
{
  result <- x / length(x)
  result
}
divisionFunc(1:5)

# 26.)
# Creating a sequence of numbers from 1 to 12 in increments of 5
incre_five <- seq(1, 12, by = 5)
incre_five

# 27.)
# Creating a sequence of number from 1 to 12  in increments of 0.5
incre_point_five <- seq(1, 12, by = 0.5)
incre_point_five

# 28.)
# Creating a new function that takes a 1x6 vector. If the input vector contains integers, divide the elements by 3, and round to 2 decimal places. If the input is a chracter vector, print the matrix. If the input contains doubles, round the input vector.
cond_vector <- function(x = 1:6)
{
  if(is.integer(x))
  {
    result <- round(x / 3, digits = 2)
    result
  }
  
  else
    if(is.character(x))
    {
      dim(x) <- c(1, 6)
      x
    }
  
  else
    if(is.double(x))
    {
      round(x)
    }
}
cond_vector(c(letters[1:6]))
cond_vector(1:6)
cond_vector(seq(1.5, 4, by = 0.5))

# 29.)
# Writing a function that takes as input a matrix of numbers. If the input is not a matrix, the method prints "not a matrix". Otherwise, the function prints out the dimensions of the matrix.
mat_function <- function(x)
{
  if(!is.matrix(x))
  {
    x <- "Not a matrix."
    x
  }
  
  else
  {
    dim(x)
  }
}
mat_function(matrix(1:16, 4, 4))
mat_function(16)

# 30.)
# Creating two matrices, storing values 1 through 6, and 7 through 12, using by-column filling. In one line, combine them to create the matrix.
matrix_1 <- matrix(1:6, 3, 2, byrow = F)
matrix_2 <- matrix(7:12, 3, 2, byrow = F)
comb_matrix <- rbind(matrix_1, matrix_2)
comb_matrix

# 31.)
# Combining the two matrices from #30 to combine them by columns
matrix_1 <- matrix(1:6, 3, 2)
matrix_2 <- matrix(7:12, 3, 2)
comb_matrix <- cbind(matrix_1, matrix_2)
comb_matrix

