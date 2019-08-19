GO
IF EXISTS (

    SELECT type_desc, type
            FROM sys.procedures WITH(NOLOCK)
            WHERE NAME = 'proc_find_all_departments'
			and type = 'p'

        )
        DROP PROCEDURE proc_find_all_departments
GO

create procedure proc_find_all_departments
as
    begin
        select * from [dbo].[tbl_department]
    end