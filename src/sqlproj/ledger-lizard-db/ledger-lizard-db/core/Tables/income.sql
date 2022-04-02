CREATE TABLE [core].[income]
(
	[income_id] INT PRIMARY KEY IDENTITY (1, 1) NOT NULL
	, [description] VARCHAR(100)
	, [person] VARCHAR(50) -- will be replaced with user_id eventually
	, [user_id] INT -- not used yet 
	, [amount] NUMERIC (12,2)
	, [payfrequency_id] INT 
	, [startdate] DATETIME
	, [enddate] DATETIME 
    , CONSTRAINT [FK_income_payfrequency] FOREIGN KEY ([payfrequency_id]) REFERENCES [core].[payfrequency]([payfrequency_id])
)
