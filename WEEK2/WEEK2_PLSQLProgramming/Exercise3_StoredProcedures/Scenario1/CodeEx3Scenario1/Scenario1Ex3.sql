SELECT * FROM Accounts;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + Balance*0.01
    WHERE AccountType = 'Savings';
END;
/

SELECT * FROM Accounts;