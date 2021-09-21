FROM postgres:13-alpine
EXPOSE 5432
ENV POSTGRES_PASSWORD="postgres" POSTGRES_USER="postgres" POSTGRES_DB="postgres"