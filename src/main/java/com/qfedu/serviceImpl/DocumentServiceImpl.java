package com.qfedu.serviceImpl;

import com.qfedu.domain.Document;
import com.qfedu.mapper.DocumentDao;
import com.qfedu.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private DocumentDao documentDao;


    @Override
    public List<Document> getAllDocuments() throws Exception {
        return documentDao.selectAllDocument();
    }

    @Override
    public void removeDocumentsById(Integer id) throws Exception {
        documentDao.deleteDocumentById(id);
    }

    @Override
    public List<Document> getDocumentsByName(String name) throws Exception {
        List<Document> allDocuments = getAllDocuments();

        List<Document> documents = new LinkedList<Document>();

        //筛选合适的结果集
        Iterator<Document> iterator = allDocuments.iterator();

        while (iterator.hasNext()) {
            Document document = iterator.next();

            //判断
            if (name.equals(document.getName())) {
                documents.add(document);
            }
        }

        return documents;
    }
}
