SELECT * FROM Accounts;

CREATE OR REPLACE PROCEDURE TransferFunds(
    fromAcc IN NUMBER,
    toAcc IN NUMBER,
    val IN NUMBER
) IS
    fromBal NUMBER;
    insufficientBal EXCEPTION;
BEGIN
    SELECT Balance INTO fromBal
    FROM Accounts
    WHERE AccountID = fromAcc;
    IF fromBal < val THEN
        RAISE insufficientBal;
    END IF;

    UPDATE Accounts
    SET Balance = Balance-val
    WHERE AccountID = fromAcc;

    UPDATE Accounts
    SET Balance = Balance+val
    WHERE AccountID = toAcc;

EXCEPTION
    WHEN insufficientBal THEN
        DBMS_OUTPUT.PUT_LINE('Transfer Failed because of Insufficient Balance.');
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Transfer Failed: Invalid Account details.');
END;
/


EXEC TransferFunds(2,1,100);

SELECT * FROM Accounts;