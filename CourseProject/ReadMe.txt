URLs:
To fetch all courses:[GET] localhost:8080/courses/

To fetch one course:[GET] localhost:8080/courses/100
			here, 100 is the courseid

To add one course:[POST] localhost:8080/courses/
JSON data e.g.:
{
	"id": 300,
	"courseName": "React JS",
	"courseDesc": "React JS helps you build React JS"
}


To update one course:[PUT] localhost:8080/courses/
JSON data e.g.:
{
	"id": 300,
	"courseName": "React Java Script",
	"courseDesc": "React JS helps you build front end"
}


To delete one course:[DELETE] localhost:8080/courses/100
			here, 100 is the courseid