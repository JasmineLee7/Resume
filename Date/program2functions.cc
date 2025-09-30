// Copyright Jasmine Lee 2025

#include "program2functions.h"
// boolean function to check for a leap year
bool LeapYear(int year) {
  if (year % 400 == 0)
    return true;
  else if (year % 100 == 0)
    return false;
  else if (year % 4 == 0)
    return true;
  else
    return false;
}
// returns last day of given month
int LastDayOfMonth(int month, int year) {
  if (month <1 || month > 12)
    return 0;

  switch (month) {
    case 2:
      return LeapYear(year) ? 29 : 28;
    case 4: case 6: case 9: case 11:
      return 30;
    default:
      return 31;
  }
  return 0;
}
// checks for a valid date
bool ValidDate(int month, int day, int year) {
  if (month < 1 || month > 12 || year < 1)
    return false;

  int last_day = LastDayOfMonth(month, year);
    return(day >= 1 && day <= last_day);
}
// updates date to next date
void NextDate(int& month, int& day, int& year) {
  if (!ValidDate(month, day, year))
    return;

  int last_day = LastDayOfMonth(month, year);
  if (day < last_day) {
    ++day;
  } else {
    day = 1;
  if (month < 12) {
    ++month;
  } else {
    month = 1;
    ++year;
  }
}
}
// updates date to previous date
void PreviousDate(int& month, int& day, int& year) {
  if (!ValidDate(month, day, year))
    return;

  if (day > 1) {
    --day;
  } else {
    if (month == 1) {
      month = 12;
      --year;
    } else {
      --month;
    }
    day = LastDayOfMonth(month, year);
  }
}


