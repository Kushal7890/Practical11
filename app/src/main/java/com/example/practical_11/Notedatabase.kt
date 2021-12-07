package com.example.practical_11

class Notedatabase
{
    companion object{
        const val TABLE_NAME="notes"
        const val COLM_ID="ID"
        const val COLM_NOTE_TITTLE="Tittle"
        const val COLM_NOTE_SUBBTITLES="SUBTittle"
        const val COLM_NOTE_DESCRIPTION="Description"
        const val COLM_MTIME="ModificationTime"
        const val COLM_ISREMINDER="SetReminder"
        const val COLM_RTIME="ReminderTime"

        const val CREATE_TABLE="create table $TABLE_NAME($COLM_ID INTEGER primary key autoincrement,$COLM_NOTE_TITTLE TEXT,$COLM_NOTE_SUBBTITLES TEXT,$COLM_NOTE_DESCRIPTION TEXT,$COLM_MTIME TEXT,$COLM_ISREMINDER INTEGER,$COLM_RTIME TEXT);"
    }

}