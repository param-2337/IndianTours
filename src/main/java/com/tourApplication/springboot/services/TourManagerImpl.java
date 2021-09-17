package com.tourApplication.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourApplication.springboot.model.BookingHeaderTable;
import com.tourApplication.springboot.model.CostMaster;
import com.tourApplication.springboot.model.CustomerMaster;
import com.tourApplication.springboot.model.DateMaster;
import com.tourApplication.springboot.model.ItineryMaster;
import com.tourApplication.springboot.model.PassengerTable;
import com.tourApplication.springboot.model.SignupMaster;
import com.tourApplication.springboot.model.TourCategoryMaster;
import com.tourApplication.springboot.repository.BookingRepository;
import com.tourApplication.springboot.repository.CostRepository;
import com.tourApplication.springboot.repository.CustomerRepository;
import com.tourApplication.springboot.repository.DateRepository;
import com.tourApplication.springboot.repository.ItineryRepository;
import com.tourApplication.springboot.repository.PassengerRepository;
import com.tourApplication.springboot.repository.SignUpRepository;
import com.tourApplication.springboot.repository.TourCategoryRepository;

@Service
public class TourManagerImpl implements TourManager {

//----------------TourCategoryMaster Manager----------------------
	@Autowired
	TourCategoryRepository catrepo;

	@Override
	public List<TourCategoryMaster> getRecords() {
		List<TourCategoryMaster> mylist = catrepo.findAll();
		return mylist;
	}

	@Override
	public void addTour(TourCategoryMaster tour) {
		catrepo.save(tour);
	}

	@Override
	public Optional<TourCategoryMaster> getRecordById(Long id) {
		return catrepo.findById(id);
	}

	@Override
	public List<TourCategoryMaster> allCategories(String subcatid) {
		return catrepo.findAll(subcatid);
	}

	@Override
	public void updateRecord(TourCategoryMaster tourcatmas) {
		catrepo.save(tourcatmas);
	}

	@Override
	public void deleteRecord(Long id) {
		catrepo.deleteById(id);
	}

//--------------------SignUpMaster Manager---------------------------
	@Autowired
	private SignUpRepository signrepo;

	@Override
	public void saveNewUser(SignupMaster user) {
		signrepo.save(user);
	}

	@Override
	public List<SignupMaster> getUser(String username) {
		return signrepo.findAll(username);
	}

	@Override
	public void updateUsername(SignupMaster user) {
		signrepo.save(user);
	}

	@Override
	public void deleteUsername(Long id) {
		signrepo.deleteById(id);
	}

//------------------Itinery Repository-------------------------
	@Autowired
	private ItineryRepository itineryrepo;

	@Override
	public List<ItineryMaster> getItinery() {
		return itineryrepo.findAll();
	}

	@Override
	public void addItinery(ItineryMaster itinery) {
		itineryrepo.save(itinery);
	}

	@Override
	public void updateItineryRecord(ItineryMaster itinery) {
		itineryrepo.save(itinery);
	}

	@Override
	public void deleteItinery(Long id) {
		itineryrepo.deleteById(id);
	}

//------------------------Cost Repository-----------------
	@Autowired
	private CostRepository costrepo;

	@Override
	public List<CostMaster> getCost() {
		List<CostMaster> costlist = costrepo.findAll();
		return costlist;
	}

	@Override
	public void addCost(CostMaster cost) {
		costrepo.save(cost);

	}

	@Override
	public Optional<CostMaster> getCostByID(Long id) {
		return costrepo.findById(id);
	}

	@Override
	public void deleteCost(Long id) {
		costrepo.deleteById(id);
	}

	@Override
	public void updateCost(CostMaster cost) {
		costrepo.save(cost);
	}

	/*
	 * @Override public void updateCost(CostMaster cost,Long id) {
	 * System.out.println("inside update method of service layer");
	 * costrepo.update(cost.getCategoryMasterId(), cost.getCost(),
	 * cost.getSinglePersonCost(), cost.getExtraPersonCost(),
	 * cost.getChildWithBedCost(), cost.getChildWithoutBedCost(),
	 * cost.getCostForSharingRoom(), cost.getValidFrom(), cost.getValidTo() ,id);
	 * 
	 * }
	 */

//-----------------Passeneger Repository---------------------------

	@Autowired
	private PassengerRepository passrepo;

	@Override
	public List<PassengerTable> getPass() {
		List<PassengerTable> passlist = passrepo.findAll();
		return passlist;
	}

	@Override
	public void addPass(PassengerTable pass) {
		passrepo.save(pass);

	}

	@Override
	public Optional<PassengerTable> getPassByID(Long id) {
		return passrepo.findById(id);
	}

	@Override
	public void deletePass(Long id) {
		passrepo.deleteById(id);
	}

	@Override
	public void updatePass(PassengerTable pass) {
		passrepo.save(pass);
	}

//-----------------------Booking Header Table----------------------------

	@Autowired
	private BookingRepository bookrepo;

	@Override
	public List<BookingHeaderTable> getRecord() {
		List<BookingHeaderTable> bookinglist = bookrepo.findAll();
		return bookinglist;
	}

	@Override
	public void addBookRecord(BookingHeaderTable rec) {
		bookrepo.save(rec);
	}

	@Override
	public void deleteBookRecord(Long id) {
		// TODO Auto-generated method stub
		bookrepo.deleteById(id);
	}

	@Override
	public void updateBookRecord(BookingHeaderTable rec) {
		// TODO Auto-generated method stub
		bookrepo.save(rec);
	}

//----------------------Customer MAster-----------------------	

	@Autowired
	private CustomerRepository custrepo;

	@Override
	public List<CustomerMaster> getCustomers() {
		List<CustomerMaster> customerlist = custrepo.findAll();
		return customerlist;
	}

	@Override
	public void addCustomer(CustomerMaster cust) {
		custrepo.save(cust);
	}

	@Override
	public void deleteCustomer(Long id) {
		custrepo.deleteById(id);
	}

	@Override
	public void updateCustomer(CustomerMaster cust) {
		custrepo.save(cust);

	}

	@Override
	public Optional<CustomerMaster> getCustomerByID(Long id) {
		return custrepo.findById(id);
	}

//---------------------Date Master--------------------------------------

	@Autowired
	private DateRepository daterepo;

	@Override
	public List<DateMaster> getDates() {
		List<DateMaster> datelist = daterepo.findAll();
		return datelist;
	}

	@Override
	public void addDate(DateMaster date) {
		daterepo.save(date);
	}

	@Override
	public void deleteDate(Long id) {
		daterepo.deleteById(id);
	}

	@Override
	public void updateDate(DateMaster date) {
		daterepo.save(date);
	}

	@Override
	public Optional<DateMaster> getDateByID(Long id) {
		return daterepo.findById(id);
	}

}
