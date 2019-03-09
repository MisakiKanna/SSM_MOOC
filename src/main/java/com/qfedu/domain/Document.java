package com.qfedu.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
@Data
@NoArgsConstructor
@Accessors(chain = true)
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
