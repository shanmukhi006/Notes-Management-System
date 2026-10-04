package com.notesmanagementcrud.notesmanagementapi.Controller;

import com.notesmanagementcrud.notesmanagementapi.model.Note;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/Note")
public class NotesController {

    private Map<Long, Note> noteStore = new HashMap<>();

    public NotesController() {
        noteStore.put(1L, new Note(1L, "Meeting Notes", "Discuss quarterly goals"));
    }

    @GetMapping("{id}")
    public Note getNoteDetails(@PathVariable Long id) {
        return noteStore.get(id);
    }

    @PostMapping
    public String createNoteDetails(@RequestBody Note note) {
        noteStore.put(note.getId(), note);
        return "Note created with title: " + note.getTitle();
    }

    @PutMapping("{id}")
    public String updateNoteDetails(@PathVariable Long id, @RequestBody Note note) {
        if (!noteStore.containsKey(id)) {
            return "Note with ID " + id + " not found.";
        }
        note.setId(id);
        noteStore.put(id, note);
        return "Note with ID " + id + " updated to title: " + note.getTitle();
    }

    // 🆕 DELETE endpoint
    @DeleteMapping("{id}")
    public String deleteNoteDetails(@PathVariable Long id) {
        if (noteStore.containsKey(id)) {
            noteStore.remove(id);
            return "Note with ID " + id + " deleted successfully.";
        } else {
            return "Note with ID " + id + " not found.";
        }
    }
}

