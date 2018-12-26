# TaskProject

#Backend services test with Postman #To find alltask - GET call http://localhost:8080/task

#To find task details - GET call http://localhost:8080/find?taskName=Test App

#to create task - POST call http://localhost:8080/task 

#sample data : 

{ "taskStatus": "in progress", "taskDescription": "test 2", "taskNote": "Use Java tech", "taskFeedback": "good job", "timeInput": null, "taskName": "Test App1", "user": { "username": "testUser", "password": "testPWD", "fullName": "Test User", "emailAddress": "test.user@testuser.com" } }

#to users http://localhost:8080/user

#To get User tasks http://localhost:8080/usertask

#To create user - POST http://localhost:8080/user 

#sameple data : 

{ "username": "testUser 3", "password": "testPWD", "fullName": "Test User 3", "emailAddress": "test.user3@testuser.com" }
