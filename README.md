# FinalCIP
POST http://localhost:8080/students

BODY: 
{
  "id": "1",
  "name": "Alice"
} 
OUTPUT: Student added.

GET: http://localhost:8080/students

OUTPUT: 
{
    "id": "1",
    "name": "Alice"
}
