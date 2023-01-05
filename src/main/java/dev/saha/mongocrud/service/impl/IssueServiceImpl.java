package dev.saha.mongocrud.service.impl;

import dev.saha.mongocrud.IssueRepository;
import dev.saha.mongocrud.service.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
@RequiredArgsConstructor
public class IssueServiceImpl implements IssueService {
    private final IssueRepository issueRepository;

    @Override
    public void getAllIssues(Model model) {
        var allIssues = issueRepository.findAll();
        model.addAttribute("issues",allIssues);
    }
}
