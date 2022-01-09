/*Write a C++ program to access the elements of an Array using pointers.

Your output should look something like this

Enter elements: 1 2 3 5 4 You entered: 1 2 3 5 4
*/
#include<iostream>

int  main(){
    int N;

    //Taking the number of array elemnsts from the user
    std::cout<<"Enter the number of elements for array : ";
    std::cin>>N;
    std::cout<<std::endl;
    
    //accepting the array elements from the user
    std::cout<<"Enter the array elements : ";
    int ar[N];
    for(int i=0;i<N;i++){
        std::cin>>ar[i];
    }
    std::cout<<std::endl;
    std::cout<<std::endl;

    //traversing and printing the array elements using pointers
    std::cout<<"Array traversed!! "<<std::endl;
    int *p=&ar[0];
    std::cout<<"The Array elements are : "<<std::endl;
    for(int i=0;i<N;i++){
        std::cout<<*p<<" ";
        p++;
    }
    return 0;
}
