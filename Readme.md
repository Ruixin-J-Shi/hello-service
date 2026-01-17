# Hello Service

A Spring Boot REST service containerized with Docker and deployed to AWS ECS.
Infrastructure is provisioned using Terraform.

## Endpoints

- `GET /api/hello`
- `GET /api/hello/{name}`

Example:
```bash
curl http://<PUBLIC_IP>:8080/api/hello/Ruixin
```

# build & run locally

./mvnw clean package
docker build -t hello-service .
docker run -p 8080:8080 hello-service

# repo-structure

.
├── src/                # Spring Boot source code
├── Dockerfile
├── pom.xml
├── terraform-ecs/      # Terraform ECS/ECR infrastructure
└── README.md


# Note
Terraform state files and build artifacts are intentionally excluded from version control.

This project was completed as part of a Northeastern University cs6650.
