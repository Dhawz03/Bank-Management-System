# Bank Management System

A comprehensive Bank Management System designed using Java and Java-FX for the front-end, integrated with MySQL for database management. Developed in IntelliJ IDEA and managed with GitHub for version control.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Database Schema](#database-schema)
  

## Introduction

This Bank Management System provides a user-friendly interface for managing bank operations including account management, transactions, and reporting. It ensures secure and efficient handling of customer data and transactions.

## Features

### Authentication

- **Login Page:** Users can sign in using their card number and PIN.
- **Clear Button:** Clears the entered information.
- **Signup Button:** Opens the signup process for new users.

### Signup Process

- **Signup Page 1:** Collects personal details including name, father's name, DOB, gender, email, marital status, address, city, pin code, and state.
- **Signup Page 2:** Collects additional details such as religion, category, income, education, occupation, PAN number, Aadhaar number, senior citizen status, and existing account status.
- **Signup Page 3:** Asks for account type and required services, generates a random 12-digit card number and 4-digit PIN, and prompts for an initial deposit to open the account.

### Main Class Functionalities

After signing in, users have access to the following features:

1. **Deposit Amount:** Allows users to deposit money into their account.
2. **Cash Withdrawal:** Enables users to withdraw money from their account.
3. **Fast Cash Withdrawal:** Provides a quick withdrawal option for common amounts.
4. **Mini Account Statement:** Displays a summary of recent transactions.
5. **PIN Change:** Allows users to change their PIN.
6. **Balance Enquiry:** Shows the current balance of the user's account.
7. **Exit:** Logs the user out of the system.

## Technologies Used

- **Front-end:** Java, Java-FX
- **Back-end:** Java
- **Database:** MySQL
- **Development Environment:** IntelliJ IDEA
- **Version Control:** Git, GitHub

## Installation

### Prerequisites

- Java Development Kit (JDK) 8 or above
- MySQL Server
- IntelliJ IDEA or any preferred Java IDE
- Git

### Steps

1. **Clone the repository:**
    ```bash
    git clone https://github.com/Dhawz03/bank-management-system.git
    ```

2. **Set up the database:**
    - Create a MySQL database named `bankSystem`.
    - Run the SQL scripts provided in the `database` folder to create the necessary tables.

3. **Configure the project:**
    - Open the project in IntelliJ IDEA.
    - Update the database connection settings in the configuration file (`Bank Management System\src\bank\management\system\Con.java`).

4. **Build and run the project:**
    - Use IntelliJ IDEA to build and run the project.

## Usage

1. **Launch the application.**
2. **Login or Signup:**
   - If you have an account, sign in using your card number and PIN.
   - If you don't have an account, sign up by providing the required personal and additional details.
3. **Main Interface:**
   - After logging in, use the provided buttons to manage your bank account operations such as deposits, withdrawals, and balance enquiries.

## Database Schema

The MySQL database consists of the following tables:

1. **login:** Contains fields for form number, card number, and PIN.
2. **signup:** Contains fields for personal details collected in the first signup page.
3. **signuptwo:** Contains fields for additional details collected in the second signup page.
4. **signupthree:** Contains fields for account type, services required, card number, and PIN generated during the third signup page.
5. **bank:** Contains fields for PIN, date, type (deposit/withdrawal), and amount.



