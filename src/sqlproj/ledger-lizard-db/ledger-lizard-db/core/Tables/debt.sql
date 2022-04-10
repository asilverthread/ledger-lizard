CREATE TABLE [core].[debt]
(
	[debt_id] INT PRIMARY KEY IDENTITY (1, 1) NOT NULL
	, [description] VARCHAR(100)
	, [user_id] INT -- currently will be largely unused
	, [person] VARCHAR (50) -- will be replaced with user_id once multi-user is set up
	, [amount] NUMERIC (12,2)
	, [startdate] DATETIME
	, [enddate] DATETIME
)
