# Ternary Search

A simple single class implementation of ternary search in Java. The user will be prompted to input the number of elements in a list which they want to enter. It is similar to binary search where we divide the array into two parts but in this algorithm. In this, we divide the given array into three parts and determine which has the key (searched element). We can divide the array into three parts by taking middle1 and middle2 which can be calculated as shown below. Initially, left and right will be equal to 0 and length-1 respectively, where length is the length of the array. The user then will choose a element to be searched in the list. The ternary search algorithm will be performed, and the index at which the element was found will be returned or the code will notify that it could not find the element.

##How to use it.
* Open a command prompt window and go to the directory where you saved the java program (TernarySearch.java).
* Type 'javac TernarySearch.java' and press enter to compile your code. If there are no errors in your code, the command prompt will take you to the next line.
* Now, type 'java TernarySearch' to run your program.
* You will be able to see a output line and asking input to enter number of elements you want to enter.
* Next you will enter number of element it can be space separated or in new line.
* After completion of entering elements in list, program will be asking for element which you want to search.
* And finally you see the result in which index given element is available in list. in case of unavailable of element error message will be printed on the screen.