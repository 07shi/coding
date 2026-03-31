#include<iostream>
using namespace std;


// create an array of count of characters
 char getMaxOccCharacter(string s){
    int arr[26] = {0};
    for(int i = 0; i<s.length(); i++){
        char ch = s[i];
        //lower case
        int number = 0;
        if(ch >= 'a' && ch <= 'z'){
            int n = ch -'a';
                number = ch - 'a';
        }
        else{// upper case}
            number = ch -'A';
        }
        arr[number]++;

    }
 }