package graphql;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import graphql.gitlab.api.WorkitemClientApi;
import graphql.gitlab.model.Group;
import graphql.gitlab.model.Project;
import io.smallrye.graphql.client.typesafe.api.TypesafeGraphQLClientBuilder;

class RunTest {

    private WorkitemClientApi api = createApi();

    private static WorkitemClientApi createApi() {
        return TypesafeGraphQLClientBuilder.newBuilder()
                .endpoint("https://gitlab.com/api/graphql")
                .allowUnexpectedResponseFields(true)
                .build(WorkitemClientApi.class);
    }

    @Test
    void readProject() {
        Project response = api.project("tech-marketing/demos/gitlab-agile-demo/initech/music-store/parent-portal", true, null);
        assertThat(response).isNotNull();
    }

    @Test
    void readGroup() {
        Group response = api.group("tech-marketing/demos/gitlab-agile-demo/initech", true, null);
        assertThat(response).isNotNull();
    }

}