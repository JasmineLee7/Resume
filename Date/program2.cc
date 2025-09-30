// Copyright 2025 Jasmine Lee

#include <iostream>
using std::cout;
using std::endl;
using std::cin;

#include "program2functions.h"

  int main() {
  // first date variables
    int m1, d1, y1;
    int m2, d2, y2;
    char slash;
    bool invalid = false;
// Input date format
  cin >> m1 >> slash >> d1 >> slash >> y1;
  cin >> m2 >> slash >> d2 >> slash >> y2;
// checks for first valid date
  if (!ValidDate(m1, d1, y1)) {
    cout << m1 << "/" << d1 << "/" << y1 << " is not a valid date" << endl;
    invalid = true;
  }
// checks for second valid date
  if (!ValidDate(m2, d2, y2)) {
    cout << m2 << "/" << d2 << "/" << y2 << " is not a valid date" << endl;
    invalid = true;
  }
  if ( invalid ) return 0;
// copies of first date
  int cm1 = m1, cd1 = d1, cy1 = y1;
  int count = 0;
// Sorts to find which date comes first
  if (cy1 < y2 || (cy1 == y2 && (m1 < m2 || (m1 == m2 && d1 < d2)))) {
    while (cm1 != m2 || cd1 != d2 || cy1 != y2) {
      NextDate(cm1, cd1, cy1);
      ++count;
    }
    cout << m1 << "/" << d1 << "/" << y1 << " is " << count
         << " days before " << m2 << "/" << d2 << "/" << y2 << endl;
  } else if (cy1 > y2 || (cy1 == y2 && (m1 > m2 || (m1 == m2 && d1 > d2)))) {
    while (cm1 != m2 || cd1 != d2 || cy1 != y2) {
      PreviousDate(cm1, cd1, cy1);
      ++count;
    }
    cout << m1 << "/" << d1 << "/" << y1 << " is " << count
         << " days after " << m2 << "/" << d2 << "/" << y2 << endl;
  } else {
    cout << m1 << "/" << d1 << "/" << y1 << " is 0 days before "
         << m2 << "/" << d2 << "/" << y2 << endl;
  }
  return 0;
}
