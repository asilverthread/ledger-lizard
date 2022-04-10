CREATE TABLE [core].[bill]
(
	[bill_id] INT PRIMARY KEY IDENTITY (1, 1) NOT NULL
	, [description] VARCHAR(100)
	, [amount] NUMERIC (12,2)
	, [dueday] INT
	, [startdate] DATETIME
	, [enddate] DATETIME
	, [autopay] BIT
	, [payfromjointaccount] BIT
)
