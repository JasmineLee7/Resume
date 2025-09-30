// copyright Jasmine Lee 2025

#ifndef PROGRAM2FUNCTIONS_H
#define PROGRAM2FUNCTIONS_H
// boolean function to check for a leap year
bool LeapYear(int year);
// returns last day of given month
int LastDayOfMonth(int month, int year = 0);
// checks for a valid date
bool ValidDate(int month, int day, int year);
// updates date to next date
void NextDate(int& month, int& day, int& year);
// updates date to previous date
void PreviousDate(int& month, int& day, int& year);
#endif
