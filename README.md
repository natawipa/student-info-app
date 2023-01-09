# student-info-app
student infomation using Java `Spring Boot`



# API LIST

## Get list of transcript

### Request

`GET /transcript`

    curl --location --request GET 'http://localhost:8090/api/transcript'

### Response
```json
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
```

### Get transcript by id

### Request

`GET /transcript/id`

    curl --location --request GET 'http://localhost:8090/api/transcript/1'

### Response
```json
    {
        "tranId": 1,
        "studentId": 1,
        "year": "2566",
        "gpa": 3.99
    }
```

## Update transcript

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
```json
    {
    "tranId": 1,
    "studentId": 1,
    "year": "2566",
    "gpa": 4.0
    }
```

## Create new transcript

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
```json
    {
        "tranId": 6,
        "studentId": 1,
        "year": "2564",
        "gpa": 4.0
    }
```

## Delete a transcript

### Request

`DELETE /transcript/id`

    curl --location --request DELETE 'http://localhost:8090/api/transcript/5'

### Response
```json
    {
    "tranId": 5,
    "studentId": 1,
    "year": "2565",
    "gpa": 4.0
    }
```