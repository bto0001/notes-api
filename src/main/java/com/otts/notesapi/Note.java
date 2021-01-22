package com.otts.notesapi;

import lombok.Data;

import java.util.Date;

@Data
public class Note {
    private long noteId;
    private String subject;
    private String contents;
    private Date createdOn;
    private Date lastEditedOn;
}
