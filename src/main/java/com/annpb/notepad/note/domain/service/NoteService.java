package com.annpb.notepad.note.domain.service;

import java.util.List;

import com.annpb.notepad.note.domain.model.Note;

public interface NoteService {

	Note create(Note note);
	void delete(Note note);
	List<Note> findAll();
}
