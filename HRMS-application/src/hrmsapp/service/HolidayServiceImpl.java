package hrmsapp.service;

import java.util.List;

import hrmsapp.dao.HolidayDAO;
import hrmsapp.dao.HolidayDAOImpl;
import layeredarchitecture.dto.Holiday;
import layeredarchitecture.exception.HolidayNotAddedException;
import layeredarchitecture.exception.HolidayNotFoundException;

public class HolidayServiceImpl implements HolidayService {

	private HolidayDAO holidayDAO = new HolidayDAOImpl();
	@Override
	public List<Holiday> getAllHoliday() throws HolidayNotFoundException {

		return holidayDAO.getAllHoliday();
	}
	@Override
	public String addHoliday(Holiday holiday) throws HolidayNotAddedException {
		String message = holidayDAO.addHoliday(holiday);
		return message;
	}

}