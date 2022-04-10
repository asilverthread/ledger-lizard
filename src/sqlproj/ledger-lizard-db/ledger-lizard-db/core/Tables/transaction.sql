CREATE TABLE [core].[transaction]
(
	[transaction_id] INT PRIMARY KEY IDENTITY (1, 1) NOT NULL
	, [transactiondate] DATETIME
	, [amount] numeric (12,2)
	, [user_id] INT -- Not used yet
	, [person] VARCHAR(100) -- Will be replaced later with user_id
)
