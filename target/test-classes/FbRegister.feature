Feature: To validate the account creation of fb application

Scenario: To create new account
Given  To launch the browser and maximize window
When To launch url of fb application
And To click the create new account button 
And To pass firstname in firstname feild
|mohamed|java|kamal|selenium|
And To pass secondname in secondname feild
And To pass mobileno or emailid in text box
|9893988876|abu@gmail.com|selenium@gmail.com|8837373838|
|mohamed@gmail.com|nini@gmail.com|2343434332|6767463773|
And To create a newpassword in password text box
Then To close the chrome browser


