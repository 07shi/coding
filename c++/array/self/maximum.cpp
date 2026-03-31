#include<iostream>
using namespace std;
int main(){
    
    int n;
    cout<<"Enter the size of array"<<endl;
    cin>>n;

    int arr[n];
    for(int i = 0 ; i < n; i++){
        cin>>arr[i];

    }
    int maxElement = arr[0];
    for(int i = 1; i<n;i++){
        if(arr[i]>maxElement){
            maxElement = arr[i];
        }

    }
    
    cout<<"Maximum Element in the array is"<<" "<<maxElement<<endl;
    return 0;



}
