# Bank Account Application

## Description

This is a simple Java-based Bank Account Application that allows users to create and manage their bank accounts. Users can log in, view account details, check their balance, deposit and withdraw funds, and change their account PIN. The application is designed to demonstrate fundamental concepts in Java programming, including object-oriented programming, data management, and user input handling.

## Features

- User login with mobile number and PIN.
- Create a new bank account.
- View account details.
- Check account balance.
- Deposit and withdraw funds.
- Change account PIN.
- Delete an account.
- Simple console-based user interface.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher.
- A text editor or an Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse.

### Installation

1. Clone the repository or download the ZIP file.
2. Open the project in your preferred IDE.
3. Compile the Java files and run the `ds_individual` class.

### Usage

1. When you start the application, you will see a menu with options to log in, create a new account, or exit.
2. Follow the prompts to log in or create a new account.
3. Once logged in, you can access various account management options.

## Code Structure

- `ds_individual.java`: The main application class that handles user interactions.
- `list.java`: The class that manages the list of accounts and various operations.
- `Account.java`: The class that represents a bank account and its details.

## Sample Output
* * * * * * * * * * * * * * * * * * * * * * * * * * *
*         Welcome Bank Account Application          *
* * * * * * * * * * * * * * * * * * * * * * * * * * *

* * * * * * * * * * * * * * * * * * * * * * * * * * *
* Please Select Your Choice                         *
* * * * * * * * * * * * * * * * * * * * * * * * * * *
*                                                   *
*  1] login                                         *
*  2] open digital Saving Account                   *
*  3] Exit                                          *
* * * * * * * * * * * * * * * * * * * * * * * * * * *

* Enter your choice: 2
Enter account holder name: John Doe
Enter account holder Email: johndoe@example.com
Enter Account Holder Age: 30
Enter Amount you want to Deposite in your Account: 5000
Enter Account Pin: 1234

* * * * * * * * * * * * * * * * * * * * * * * * * * *
* Please Select Your Choice                         *
* * * * * * * * * * * * * * * * * * * * * * * * * * *
*                                                   *
*  1] login                                         *
*  2] open digital Saving Account                   *
*  3] Exit                                          *
* * * * * * * * * * * * * * * * * * * * * * * * * * *

* Enter your choice: 1
Enter your mobile number: 1234567890
Enter your app login pin: 1234

* * * * * * * * * * * * * * * * * * * * * * * * * * *
* Please Select Your Choice                         *
* * * * * * * * * * * * * * * * * * * * * * * * * * *
*                                                   *
*  1] Show All Account Details                      *
*  2] See Your Account Details                      *
*  3] Check balance                                 *
*  4] Withdraw Amount                               *
*  5] Deposit Amount                                *
*  6] Change PIN                                    *
*  7] Delete Account                                *
*  8] Exit                                          *
* * * * * * * * * * * * * * * * * * * * * * * * * * *

* Enter your choice: 3
Enter Your Pin: 1234
Your current balance is: 5000.0

* Enter your choice: 8
Thank you for using our banking services



# Parking Slot Management System

## Project Overview
The Parking Slot Management System is a simple Java application designed to manage parking slots in a parking facility. It allows users to check available parking slots, reserve a slot, and generate a parking receipt upon entering the facility. This application demonstrates basic object-oriented programming principles and user interaction through the console.

## Features
- View available parking slots
- Reserve a parking slot
- Input customer details (name, mobile number, car number)
- Generate parking receipts with timestamps
- Calculate total payment based on parking duration

## Sample Output
Here's an example of how the application interacts with the user:

```plaintext
Welcome to the Parking Slot Management System

Enter customer Name: John Doe
Enter Car No: GJ12CD0823
Enter Mobile No: 9876543210

Available Parking Slots:
1. Slot A1
2. Slot A2
3. Slot A3

Choose a parking slot from the available options (Enter slot number): 2

Parking Receipt:
-------------------------------------
Customer Name: John Doe
Car Number: GJ12CD0823
Mobile Number: 9876543210
Slot Reserved: Slot A2
Entry Time: 2024-10-13 14:30:00
Total Amount: $10.00
-------------------------------------

Thank you for using our service!
