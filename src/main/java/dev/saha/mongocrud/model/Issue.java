package dev.saha.mongocrud.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "issues")
@Getter
@Setter
public class Issue {
    @Id
    private String id;
    private String description;

    private int severity;

    private String assignee;

    public Issue(String description, int severity, String assignee) {
        this.description = description;
        this.severity = severity;
        this.assignee = assignee;
    }
}
