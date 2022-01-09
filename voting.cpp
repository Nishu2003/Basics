/* Program that will ask the user to enter their age
and
it checks 
whether the person is eligible to vote or not*/
#include<iostream>

//MAIN FUNCTION
int main(){
    int age;
    // asking the user to enter their age
    std::cout<<"Enter your age : ";
    std::cin>>age;
    std::cout<<std::endl;

     /* checking the age of user
     if age is greater than or equal to 18 ---->person eligible for voting
     and if age less than 18 ----> not eligible */
     
     if(age>=18){
         std::cout<<"You are eligible for voting !! "<<std::endl;
         std::cout<<"You can vote this year....."<<std::endl;
     }
     else{
          std::cout<<"Sorry !! You are not eligible for voting this year......"<<std::endl;

          //for printing the year at which the voter can vote
          int vote_year=18-age;
          int year=2022+vote_year;
          std::cout<<"You can vote after "<<vote_year<<" years i.e, on  "<<year<<"....."<<std::endl;
     }
    return 0;
}
