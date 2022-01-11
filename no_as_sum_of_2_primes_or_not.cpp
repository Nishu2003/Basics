/*
Write a C++ program to Check Whether a Number can be Express as Sum of Two Prime Numbers.

Your output need to look something like this

Enter a positive integer: 34 34 = 3 + 31 34 = 5 + 29 34 = 11 + 23 34 = 17 + 17
*/


#include <iostream>

//declaring function
bool checkPrime(int n);

//main function
int main() {
    int n, i;
    bool flag = false;

    std::cout << "Enter a positive  integer: ";
    std::cin >> n;

    for(i = 2; i <= n/2; ++i) {
        if (checkPrime(i)) {
            if (checkPrime(n - i)) {
                std::cout << n << " = " << i << " + " << n-i <<std::endl;
                flag = true;
            }
        }
    }

    if (!flag)
      std::cout << n << " can't be expressed as sum of two prime numbers.";

    return 0;
}

// Check prime number
bool checkPrime(int n) {
    int i;
    bool isPrime = true;

    // 0 and 1 are not prime numbers
    if (n == 0 || n == 1) {
        isPrime = false;
    }
    else {
        for(i = 2; i <= n/2; ++i) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    return isPrime;
}
