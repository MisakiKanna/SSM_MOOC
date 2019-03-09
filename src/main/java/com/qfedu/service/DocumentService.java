package com.qfedu.service;

import com.qfedu.domain.Document;
import com.qfedu.domain.DocumentAdd;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface DocumentService {

    public List<Document> getAllDocuments() throws Exception;

    public void removeDocumentsById(Integer id) throws Exception;

    public List<Document> getDocumentsByName(String name) throws Exception;


    public void addDocument(DocumentAdd documentAdd, MultipartFile file) throws Exception;
}
