package dev.saha.mongocrud.controller;


import dev.saha.mongocrud.service.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class IssueController {
    private final IssueService issueService;

    @GetMapping("/issues")
    public String findAllIssues(Model model){
        issueService.getAllIssues(model);
        return "list-issues";
    }
}
