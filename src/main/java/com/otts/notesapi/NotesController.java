package com.otts.notesapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NotesController {

    @GetMapping("/notes")
    public List<Note> getNoteList() {
        return null;
    }

    @GetMapping("/notes/{noteId}")
    public Note getNote(@PathVariable long noteId) {
        return null;
    }

    @PostMapping("/notes")
    public ResponseEntity<?> createNote(@RequestBody Note note) {
        // Create new note

        return ResponseEntity.ok().build();
    }

    @PatchMapping("/notes/{noteId}")
    public ResponseEntity<?> editNote(@PathVariable long noteId, @RequestBody Note note) {
        // Only update subject, contents, lastEditedOn

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/notes/{noteId}")
    public ResponseEntity<?> deleteNote(@PathVariable long noteId) {
        // Delete note if it exists

        return ResponseEntity.ok().build();
    }

}
