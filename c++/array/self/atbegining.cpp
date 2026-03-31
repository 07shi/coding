#include<iostream>
using namespace std;
int main(){
    int arr [5], n , x;
    cout<<"Enter size of an array: ";
    cin>>n;
    cout<<"Enter array element: ";
    for(int i = 0; i<n;i++){
        cin>>arr[i];

    }
    cout<<"Enter the element at the beginning:";
    cin>>x;
    for(int i = n-1;i>=0;i--){
        arr[i+1]=arr[i];

    }
    arr[0]=x;
    n=n+1;
    cout<<"Array elements are";
    for(int i = 0;i<n;i++){
        cout<<arr[i] << endl;

    }
    return 0;
}