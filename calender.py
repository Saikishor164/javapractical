import calendar
year = 2023
month = 12

# print(calendar.year(yy,mm))


def text():
    year_str = year.get()
    month_str = month.get()
    year_int = int(year_str)
    month_int = int (month_str)
    cal = calendar.month(year_int, month_int)
    textfield.delete(0.0, END)
    textfield.insert(INSERT, cal)