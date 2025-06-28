BEGIN
    FOR cstm IN (
        SELECT CustomerID, FLOOR(MONTHS_BETWEEN(SYSDATE, DOB)/12) AS age
        FROM Customers
    ) LOOP
        IF cstm.age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cstm.CustomerID;
        END IF;
    END LOOP;
END;
/
SELECT * FROM Customers;
SELECT * FROM Loans;