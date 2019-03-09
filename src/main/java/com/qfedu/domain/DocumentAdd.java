package com.qfedu.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class DocumentAdd extends Document{
    private Integer kindNumber;
    private String uploadUserName;
}
