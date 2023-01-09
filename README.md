# student-info-app
student infomation using Java `Spring Boot`

## Get list of Things

### Request

`GET /transcript`

curl --location --request GET 'http://localhost:8090/api/transcript'

### Response

    [
        {
            "tranId": 1,
            "studentId": 1,
            "year": "2566",
            "gpa": 4.0
        },
        {
            "tranId": 2,
            "studentId": 1,
            "year": "2561",
            "gpa": 3.6
        },
        {
            "tranId": 3,
            "studentId": 1,
            "year": "2562",
            "gpa": 3.99
        },
        {
            "tranId": 4,
            "studentId": 1,
            "year": "2563",
            "gpa": 3.99
        },
        {
            "tranId": 5,
            "studentId": 1,
            "year": "2565",
            "gpa": 4.0
        }
    ]
### Get a specific Thing

### Request

`GET /transcript/id`

    curl --location --request GET 'http://localhost:8090/api/transcript/1'

### Response

    {"tranId":1,"studentId":1,"year":"2566","gpa":3.99}

## Change a Thing's state

### Request

`PUT /transcript/id`

    curl --location --request PUT 'http://localhost:8090/api/transcript/1' \
    --header 'Content-Type: application/json' \
    --data-raw '{
        "studentId": 1,
        "year": 1,
        "gpa": 4.0
    }'

### Response

    {
    "tranId": 1,
    "studentId": 1,
    "year": "2566",
    "gpa": 4.0
    }

## Change a Thing using the _method hack

### Request

`POST /transcript`

    curl --location --request POST 'http://localhost:8090/api/transcript' \
    --header 'Content-Type: application/json' \
    --data-raw '{
        "studentId": 1,
        "year": "2564",
        "gpa": 4.00
    }'

### Response

    {
        "tranId": 6,
        "studentId": 1,
        "year": "2564",
        "gpa": 4.0
    }

## Delete a Thing

### Request

`DELETE /transcript/id`

    curl --location --request DELETE 'http://localhost:8090/api/transcript/6'