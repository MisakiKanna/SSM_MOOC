package com.qfedu.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
public class Document {
    private Integer id;
    private String name;
    private Classify kind;
    private UserInfo uploadUser;
    private String key;
    private String url;
    private String summary;
    private Date uploadDate;

}
