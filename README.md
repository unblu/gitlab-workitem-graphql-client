# Smallrye Typesafe GraphQL client for GitLab WorkItems

GraphQL typesafe client (relying on [Smallrye GraphQL](https://smallrye.io/smallrye-graphql/)) to call some [GitLab GraphQL endpoints](https://docs.gitlab.com/ee/api/graphql/reference/), in particular the WorkItem one.

## Usage:

With this library and `io.smallrye:smallrye-graphql-client-implementation-vertx:2.11.0` on the classpath, the client can be instantiated with:

```java
WorkitemClientApi api =  TypesafeGraphQLClientBuilder.newBuilder()
                            .endpoint("https://gitlab.com/api/graphql")
                            // .header("Authorization", "Bearer " + gitlabToken)
                            .build(WorkitemClientApi.class);
```

Check the `RunTest` class in this project for usage example.

This library can be used with Quarkus.

### Example jbang script:

Check the [`run.java`](run.java) script that can be executed with [jbang](https://www.jbang.dev/) using:

```
jbang run.java
```
