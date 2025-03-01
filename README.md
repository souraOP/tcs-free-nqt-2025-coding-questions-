# tcs-free-nqt-2025-coding-questions-

repo consists of most asked tcs nqt coding questions that might come on 2025 free nqt exam. from ninja to digital to prime. pls press star if you like it.

---
## For compiler issue during exam :cry:

### I. Usually happens while taking the input :pencil:

<h3 style="text-align: center; font-family: Times New Roman;"><u>Multiple Situations</u></h3>

- ### 1. Size is given:
  - Input format is given -
    - N = 4
    - arr = [5,4,3,2] or arr = 5,4,3,2

- ### 2. No Size or array input is given to you
  - Example: 5 4 6 2 1

- ### 3. Nothing is known
  - Example: [1,2,3,4,5]

<br>
<h4 style="text-align: center;">When size is given (Best Case)</h4>

#### C++ Code

```cpp
// C++
// Example: 
// 4
// 1 2 3 4
void inputWithSize(){
  int n;
  cin >> n;
  vector<int> arr;

  for(int i = 0; i < n; i++){
    cin >> arr[i];
  }

  cout << "Array with size: ";
  for(int i : arr) {
    cout << i << " ";
  }
  cout << endl;
}
```

#### Java Code

```java
// Example input: 
// 4
// 1 2 3 4

import java.util.Scanner;

public static void inputWithSize(){
  int n = sc.nextInt();
  int[] arr = new int[n];

  for(int i = 0; i < n; i++){
    arr[i] = sc.nextInt();
  }

  System.out.println("Array with given size: ");
  for(int i : arr){
    System.out.print(i + " ");
  }
  System.out.println();
}

```

<br>
<h4 style="text-align: center;">When no size or description is given (input as string)</h4>

#### C++ Code

```cpp
//C++
// Example: 1 2 3 4 5
#include <sstream>  // <- make sure to import 

void inputAsString(){
  string line;
  getline(cin, line);

  vector<int> arr;
  stringstream ss(line);
  int num;

  while(ss >> num) {
    arr.push_back(num);
  }

  cout << "Array from string using stringstream: ";
  for(int val : arr) {
    cout << val << " ";
  }
  cout << endl;
}
```

#### Java Code

```java
// Example: 1 2 3 4 5


import java.util.*;
public static void inputAsString(Scanner sc){
  String line = sc.nextLine();
  String[] tokens = line.split("\\s+");

  List<Integer> arr = new ArrayList<>();
  for(String token : tokens){
    try{
      arr.add(Integer.parseInt(token));
    } catch (NumberFormatException e){
      // ignore inputs that are not numbers
      System.out.println(e);
    }
  }

  System.out.println("Array (with string input): ");
  for(int i : arr){
    System.out.print(i + " ");
  }
  System.out.println();
}

```

<br>
<h4 style="text-align: center;">When datatypes are known</h4>

#### C++ Code
```cpp
//C++
// Example: 1 2 3 4 5
// suppose an array is given and we have to sum up all the elements of the array

// array can be string or integer format

// so if error comes like EOF, then might be in String
// then do another approach
void inputWithoutSize(){
  vector<int> arr;
  int num;

  while(cin >> num) {
    arr.push_back(num);
  }

  cout << "Array (size unknown)";
  for(int i: arr) {
    cout << i << " ";
  }
  cout << endl;
}
```

#### Java Code

```java
// Example: 1 2 3 4 5  -> are in integer order (Best case)
// 1 2 3 4 5

import java.util.*;

public static void inputWithoutSize(Scanner sc) {
  ArrayList<Integer> arr = new ArrayList<>();
  while(sc.hasNextInt()){
    arr.add(sc.nextInt());
  }

  System.out.print("Array with given size: ");
  for(int i : arr){
    System.out.print(i + " ");
  }
  System.out.println();
}

```

<br>
<h4 style="text-align: center;">MOST USED INPUT FORMAT (Worst Case)</h4>

#### C++ Code

```cpp
//C++
// Example: [1,2,3,4,5] or 1,2,3,4,5 or {1,2,3,4,5}

// it might look like the input is provided as space separated but it can be given as comma separated

// Then take input of it as string
#include <iostream>
#include <string>
#include <bits/stdc++.h>
using namespace std;

void mostUsedInputFormat(){
  string line;
  getline(cin, line);

  vector<int> arr;
  string str = "";

  for(char c : line){
    if(isdigit(c)){  
      str += c;
    } else if (!str.empty()) { // encountered a comma, then put the DIGIT into the array and ignore the comma
      arr.push_back(stoi(str)); // convert string to integer
      str = "";
    }
  }

  if(!str.empty()){
    arr.push_back(stoi(str));
  }

  cout << "Array (extracted numbers): ";
  for(int val : arr){
    cout << val << " ";
  }
  cout << endl;
}
```
#### Java Code

```java
import java.util.*;

// Constraint : 1 <= arr[i] <= 9  (Single digit input)
public static void mostUsedInputFormat(Scanner sc){
  String line = sc.nextLine();
  StringBuilder sb = new StringBuilder();
  ArrayList<Integer> arr = new ArrayList<>();

  for(char ch : line.toCharArray()){
    if(Character.isDigit(ch)){
      sb.append(ch);
    } else if (sb.length() > 0) {
      arr.add(Integer.parseInt(sb.toString()));
      sb.setLength(0);
    }
  }

  // remaining
  if(sb.length() >0) {
    arr.add(Integer.parseInt(sb.toString()));
  }
  System.out.print("Array (extracted number): ");
  for(int i : arr){
    System.out.print(i + " ");
  }
  System.out.println();

}

```

<h4 style="text-align: center;">TCS NQT 2024 (3rd Oct) Question (ACCEPTED) &#9989</h4>

```cpp
#include <iostream>
#include <sstream>
#include <bits/stdc++.h>
#include <string>

using namespace std;

int main(){
  string s;
  getline(cin, s);

  if(checkEqualAverage(s)){
    cout << "True" << endl;
  } else {
    cout << "False" << endl;
  }
}

bool checkEqualAverage(string s) {
  vector<int> arr;
  for(char c : s){
    if(isdigit(c)){
      arr.push_back(c);
    }
  }

  int total_sum = accumulate(arr.begin(), arr.end(), 0);
  int cur_sum = 0;

  for(int i = 0; i < arr.size(); i++){
    cur_sum += arr[i];
    int cur_size = i + 1;
    int rem_sum = total_sum - cur_sum;
    int rem_size = arr.size() - i - 1;
    if(rem_size != 0 && (cur_sum / cur_size) == (rem_sum / rem_size)){
      return true;
    }
  }
  return false;
}

```