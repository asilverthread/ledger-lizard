CREATE TABLE [identity].[user] (
    [user_id]  INT           IDENTITY (1, 1) NOT NULL,
    [username] VARCHAR (50)  NULL,
    [password] VARCHAR (500) NULL,
    PRIMARY KEY CLUSTERED ([user_id] ASC)
);

