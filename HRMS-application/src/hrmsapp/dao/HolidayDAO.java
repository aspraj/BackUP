package hrmsapp.dao;

import java.util.List;

import layeredarchitecture.dto.Holiday;
import layeredarchitecture.exception.HolidayNotAddedException;
import layeredarchitecture.exception.HolidayNotFoundException;

public interface HolidayDAO {
	public List<Holiday> getAllHoliday() throws HolidayNotFoundException;
	public String addHoliday(Holiday holiday) throws HolidayNotAddedException;
}