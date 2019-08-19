--Create department Table
IF NOT EXISTS (SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE = 'BASE TABLE' AND TABLE_NAME = 'tbl_department' )
    BEGIN
        CREATE TABLE [dbo].[tbl_department] (
        department_id [bigint] IDENTITY (1,1) NOT NULL,
        name [VARCHAR] (50) NULL,
        CONSTRAINT [PK_tbl_department] PRIMARY KEY CLUSTERED
        (
            [department_id] ASC
        )
        )
     END
GO


-- Create employee Table
IF NOT EXISTS (SELECT * FROM
                        INFORMATION_SCHEMA.TABLES
                        WHERE TABLE_TYPE = 'BASE TABLE'
                        AND TABLE_NAME = 'tbl_employee' )
    BEGIN
        CREATE TABLE [dbo].[tbl_employee] (
         employee_id [bigint] IDENTITY(1,1) NOT NULL,
         first_name [VARCHAR](50) NULL,
         last_name [VARCHAR](50) NULL,
         staff_id [VARCHAR](50) NULL,
         department_id [bigint] FOREIGN KEY REFERENCES tbl_department(department_id)
         CONSTRAINT [PK_tbl_employee] PRIMARY KEY CLUSTERED
         (
            [employee_id]ASC
         )
        )
    END
GO
