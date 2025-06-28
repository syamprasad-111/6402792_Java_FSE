ALTER TABLE Customers ADD IsVIP VARCHAR2(5);

BEGIN
    FOR cstm IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF cstm.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cstm.CustomerID;
        ELSE
            UPDATE Customers
            SET IsVIP = 'FALSE'
            WHERE CustomerID = cstm.CustomerID;
        END IF;
    END LOOP;
END;
/

SELECT * FROM Customers;
