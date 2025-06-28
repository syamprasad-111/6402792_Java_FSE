BEGIN
    FOR loan_each IN (
        SELECT l.LoanID, l.CustomerID, l.EndDate, cst.Name
        FROM Loans l
        JOIN Customers cst ON l.CustomerID = cst.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder : Loan ID ' || loan_each.LoanID || ' for customer ' || loan_each.Name || ' is due on ' || TO_CHAR(loan_each.EndDate,'DD-MON-YYYY'));
    END LOOP;
END;
/

SELECT * FROM Loans WHERE EndDate BETWEEN SYSDATE AND SYSDATE+30;