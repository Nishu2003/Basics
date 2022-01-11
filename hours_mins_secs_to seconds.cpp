/* Write a C++ program to read time in HH:MM:SS format and convert into total seconds using class.

Your output should look something like this

Enter time: Hours? 1 Minutes? 1 Seconds? 6 The time is = 01:01:06 Time in total seconds: 3666
*/


#include<iostream>

// a class convert to convert hours:minutes:seconds to seconds
class convert{
    //public access sprcifier -- so all the methods and variables can be easily ascessible outside teh class
    public:
    int hours,minutes,seconds;  // for storing the value of hour minutes and seconds

    // a function input() for taking the user input for hours, minutes and seocnds
    void input(){
        std::cout<<"Enter hours minutes and seconds :"<<std::endl;
        std::cin>>hours>>minutes>>seconds;
    }

    // a function print() for calculating the result and printing the result
    void print(){
        std::cout<<std::endl;
        std::cout<<"Entered time is = "<<hours<<":"<<minutes<<":"<<seconds<<std::endl;
        std::cout<<std::endl;
        int sum=0;   // for storing result
        hours*=3600;
        minutes*=60;
        sum=hours+minutes+seconds;
        std::cout<<"After conversion :->"<<std::endl;
        std::cout<<"Time in seconds is : "<<sum<<" seconds "<<std::endl;
    }

};
int main(){
    convert a;  // class object
    a.input();  // calling input() function using class object
    a.print();  // calling print() function using class object
    return 0;
}
