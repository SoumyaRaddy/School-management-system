package com.example.SchoolManagementSchool.subject.sevice;

import com.example.SchoolManagementSchool.subject.model.Subject;
import com.example.SchoolManagementSchool.subject.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public Subject getSubjectById(Long id) {
        return subjectRepository.findById(id).orElse(null);
    }

    public Subject saveOrUpdateSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public void deleteSubjectById(Long id) {
        subjectRepository.deleteById(id);
    }
}
