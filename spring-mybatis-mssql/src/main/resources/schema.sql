IF EXISTS(SELECT *
          FROM sysobjects
          WHERE name = 'Table1'
            AND xtype = 'U')
    BEGIN
        DROP TABLE Table1
    END;

CREATE TABLE Table1
(
    id   INT PRIMARY KEY NOT NULL,
    val1 INT             NOT NULL,
    val2 INT             NOT NULL
);

IF EXISTS(SELECT *
          FROM sysobjects
          WHERE name = 'Table2'
            AND xtype = 'U')
    BEGIN
        DROP TABLE Table2
    END;

CREATE TABLE Table2
(
    id   INT PRIMARY KEY NOT NULL,
    val1 INT             NOT NULL,
    val2 INT             NOT NULL
);
