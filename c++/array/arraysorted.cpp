#include<iostream>
using namespace std;

bool sorted( int arr[], int n){
    for( int i = 1; i < n; i++){
        if(arr[i]>arr[i-1]){

        

        }
       else {
            return false;
       }
    }
    return true;
    
}





int main()
{
    int size;
    cin>>size;
    int arr[25];
    for(int i = 0; i < size; i++){
        cin>>arr[i];
    }
    cout<<sorted(arr, size)<<endl;
    cout<<"Array is sorted";
}