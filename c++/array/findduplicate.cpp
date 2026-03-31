#include<iostream>
using namespace std;
int main(){
    int ans = 0;
    int arr[4] = {1,2,3,2};

    for(int i = 0; i < 4; i++){
        ans = ans^arr[i];

    }
   for (int i = 2; i < 4; i++){
    ans = ans^i;


    }
    return ans;
}
