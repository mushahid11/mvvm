package com.gtappdevelopers.noteapplication.data.repo

import androidx.lifecycle.LiveData
import com.gtappdevelopers.noteapplication.data.constant.Note
import com.gtappdevelopers.noteapplication.data.local.NotesDao

class NoteRepository(private val notesDao: NotesDao) {


    val allNotes: LiveData<List<Note>> = notesDao.getAllNotes()

    suspend fun insert(note: Note) {
        notesDao.insert(note)
    }
    suspend fun delete(note: Note){
        notesDao.delete(note)
    }

    suspend fun update(note: Note){
        notesDao.update(note)
    }
}