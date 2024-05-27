package com.example.its.domain.issue;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class IssueService {

  private final IssueRepository issueRepository;

  public List<IssueEntity> findAll() { return issueRepository.findAll();
  }

  @Transactional
  public void create(String summary, String description) {
    issueRepository.insert(summary, description);
  }

  public IssueEntity findById(long issueId) {
    return issueRepository.findById(issueId);
  }
}
