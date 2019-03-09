package com.qfedu.mapper;

import com.qfedu.domain.Document;
import com.qfedu.domain.DocumentAdd;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentDao {

    public List<Document> selectAllDocument() throws Exception;

    @Delete("delete from document where id = #{id}")
    public void deleteDocumentById(Integer id) throws Exception;


    @Insert("insert into document(name,kind,uploadUser,uploadDate,key,url,summary) values(#{name},#{kindNumber},#{uploadUserName},#{uploadDate},#{key},#{url},#{summary})")
    public void insertDocument(DocumentAdd documentAdd) throws Exception;
}
