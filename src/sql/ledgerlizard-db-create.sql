IF (NOT EXISTS (SELECT * FROM sys.databases WHERE name = 'ledgerlizard'))
BEGIN
	CREATE DATABASE [ledgerlizard];
END

USE [ledgerlizard];

IF (NOT EXISTS (SELECT * FROM sys.schemas WHERE name = 'identity')) 
BEGIN
	EXEC ('CREATE SCHEMA [identity];')
END

IF (NOT EXISTS (SELECT * FROM sys.tables WHERE name = 'user')) 
BEGIN
	CREATE TABLE [ledgerlizard].[identity].[user] (
		[user_id] INT IDENTITY (1,1) PRIMARY KEY
		, [username] VARCHAR(50)
		, [password] VARCHAR(500) -- We will salt and encrypt this eventually, for now do not store any valuable password here
	)
END

IF (NOT EXISTS (SELECT * FROM [ledgerlizard].[identity].[user] WHERE [username] = 'dummy-test-user'))
BEGIN
    INSERT INTO [ledgerlizard].[identity].[user] (
        [username]
        , [password]
    )
    VALUES (
        'dummy-test-user'
        , 'dummy'
    )
END