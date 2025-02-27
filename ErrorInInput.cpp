#include <iostream>
#include <string>
#include <sstream>
using namespace std;

/*
If input is given as : 
1 2 3 4 5

means there are no N value or array input given

The input can be given as string also.. like the array can be number but given as String

and gives EOF error in command line when taking input
*/

int main(){
  string line;
  getline(cin, line);

  vector<int> arr;
  stringstream ss(line);
  int num;

  while(ss >> num){
    arr.push_back(num);
  }
  cout << "Array (from string using stringstream) ";
  for(int val : arr){
    cout << val << " ";
  } 
  cout << endl;

}