## Lambda Expressions:

- Write a lambda expression to multiply two numbers.
- Implement a lambda expression to filter a list of strings and return only those starting with a specific letter.
- Use a lambda expression to sort a list of integers in ascending order.

## Functional Interfaces:

- Create a functional interface called "Calculator" with a method that takes two integers and returns their sum. Implement the interface using a lambda expression.
- Define a functional interface called "Validator" with a method that takes a string and returns a boolean indicating whether the string is valid. Implement the interface using a lambda expression that checks if the string is not empty.

## Streams:

- Given a list of integers, use a stream to find the sum of all the even numbers.
- Use a stream to convert a list of strings to uppercase.
- Given a list of objects, filter the objects based on a specific condition using a stream.

## Date and Time API:

- Create a LocalDate object representing the current date.
- Given a specific date, add 3 months and 5 days to it.
- Calculate the duration between two LocalDateTime objects.

## Optional:

- Use Optional to handle the scenario where a value may or may not be present.
- Write a method that returns an Optional object containing the maximum value from a list of integers.

## Method References:

- Write a method reference to the toUpperCase() method of the String class.
- Use a method reference to sort a list of strings in alphabetical order.
- Implement a method reference to the parseInt() method of the Integer class.
- Convert the following lambda expression into a method reference:
```
  list.forEach(item -> System.out.println(item));
```
- Given a list of strings, sort them using the String class's compareToIgnoreCase method with method references.

## Streams and Collectors:

- Given a list of strings, use a stream to find the number of strings that have a length greater than 5.
- Use a stream to find the average of a list of integers.
- Given a list of Person objects with name and age attributes, group them by age using a stream and a Collectors.groupingBy() operation.
- Given a list of integers, find the maximum value using the max operation.
- Filter a list of strings to include only those with a length greater than 5 using the filter operation.
- Given a list of objects, group them by a specific attribute using the groupingBy collector.

## Functional Programming:

- Write a higher-order function that takes a function as an argument and applies it to a list of integers.
- Implement a recursive function to calculate the factorial of a number.
- Create a custom functional interface and use it in a method that takes a function implementing the interface as a parameter.
- Implement a recursive function to calculate the factorial of a number using a lambda expression.
- Write a method that takes a list of integers and returns a new list with each element squared using the map operation.
- Use the reduce operation to find the product of all the elements in a list of integers.

## Parallel Streams:

- Given a large list of integers, use a parallel stream to find the sum of all the numbers.
- Use a parallel stream to filter a list of strings and return only those that contain a specific substring.
- Given a list of objects, use a parallel stream to process them concurrently and return a new list of transformed objects.

## CompletableFuture:

- Write a CompletableFuture that completes after a certain delay and returns a specific value.
- Implement a chain of CompletableFutures that perform multiple asynchronous tasks and return the final result.
- Use CompletableFuture to handle exceptions and recover from failures in asynchronous operations.

## Default Methods:

- Create an interface called Shape with a default method calculateArea() that prints "Calculating area...".
- Create a class Rectangle that implements the Shape interface and overrides the calculateArea() method to calculate and print the area of the rectangle.

## Date and Time API:

- Find the current time in a specific time zone using the ZonedDateTime class.
- Convert a LocalDate to a Date object.
- Given a specific date, determine the day of the week using the DayOfWeek enumeration.