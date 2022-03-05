package hrmsapp.service;

import java.util.List;

import layeredarchitecture.dto.Holiday;
import layeredarchitecture.exception.HolidayNotAddedException;
import layeredarchitecture.exception.HolidayNotFoundException;

public interface HolidayService {
	public List<Holiday> getAllHoliday() throws HolidayNotFoundException;
	public String addHoliday(Holiday holiday) throws HolidayNotAddedException;
}