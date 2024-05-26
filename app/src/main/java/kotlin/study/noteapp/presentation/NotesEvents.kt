package kotlin.study.noteapp.presentation

import kotlin.study.noteapp.data.Note

sealed interface NotesEvents {
    object SortNotes : NotesEvents

    data class DeleteNote(val note: Note) : NotesEvents

    data class SaveNote(
        val title: String,
        val description: String,
    ) : NotesEvents
}