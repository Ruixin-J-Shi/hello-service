aws_region          = "us-east-1"
service_name        = "hello-service"
ecr_repository_name = "hello-service-terraform"  # Different name to avoid conflicts
desired_count       = 1
container_port      = 8080
