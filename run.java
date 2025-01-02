///usr/bin/env jbang "$0" "$@" ; exit $?

//DEPS https://github.com/unblu/gitlab-workitem-graphql-client/commit/0dde568aa43f45079cc646b23fed8c807fe7fa1a
//DEPS io.smallrye:smallrye-graphql-client-implementation-vertx:2.11.0
//JAVA 11

import static java.lang.System.*;

import graphql.gitlab.api.WorkitemClientApi;
import graphql.gitlab.model.Group;
import graphql.gitlab.model.Project;
import io.smallrye.graphql.client.typesafe.api.TypesafeGraphQLClientBuilder;

public class run {

    public static void main(String... args) {
        out.println("Start");
        var api = createApi();
        Project response = api.project("tech-marketing/demos/gitlab-agile-demo/initech/music-store/parent-portal", true, null);
        out.println(response);
        System.exit(0);
    }	

    private static WorkitemClientApi createApi() {
        return TypesafeGraphQLClientBuilder.newBuilder()
                .endpoint("https://gitlab.com/api/graphql")
                // .header("Authorization", "Bearer " + gitlabToken)
                .build(WorkitemClientApi.class);
    }
}
