SELECT * FROM Employees;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept IN VARCHAR2,
    bonus_per IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary*bonus_per/100)
    WHERE Department = dept;
END;
/

BEGIN
    UpdateEmployeeBonus('HR',2);
END;
/

SELECT * FROM Employees;