/**
*    File       :   UtilityHelper.java
*    Package    :   com.ariel.hmserp.utils
*    Created    :   Jan 27, 2014  4:34:02 PM
*    Project    :   Hospital Management System ERP
*    Author     :   babu
*    Company    :   Ariel Technologies PVT LTD.
**/



package com.chinnasoft.realestate.utils;

import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.icu.math.BigDecimal;
import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.RuleBasedNumberFormat;

public class UtilityHelper {
	
	@Autowired
	static NumToWords numToWords;
	
	//Login User
	public static final Integer Babu_User_Id=2;
	public static final Integer Chitra_User_Id=3;
	
	//Is editable Master constants
	public static final Integer IsEditable = 1;
	public static final Integer IsUnEditable = 2;
	
	
	// Status Related constants
	public static final String Status_Active = "Y";
	public static final Integer Active_Status_Id = 1;
	public static final Integer DeActive_Status_Id = 2;
	public static final Integer Delete_Status_Id = 3;
	
	// Gender Related constants
	public static final Integer Gender_Male_Id = 1;
	public static final Integer Gender_FeMale_Id = 2;
	
	// PreFix Type constants
	public static final Integer Prefix_Type_Employee = 1;
	public static final Integer Prefix_Type_Invoice_Purchage = 2;
	public static final Integer Prefix_Type_Invoice_Billing = 3;
	public static final Integer Prefix_Type_Ipd=4;
	
	
	// OPD Patient  Cyclic constants
	public static final char Opd_Patient_New = 'Y'; // patient is a new entry
	public static final  char Opd_Patient_Room = 'R'; // patient is In Doctor's Room
	public static final  char Opd_Patient_UnPaid = 'U'; // Payment not  done by patient
	public static final  char Opd_Patient_Paid = 'P'; // Payment done by patient
	
	// OPD Patient Payment Status
    public static final char Opd_patient_Payment_No = 'N';
	public static final char Opd_patient_Payment_Yes = 'Y';
	
	// Patient And Employee Martial Status
	public static final Integer martial_single = 1;
	public static final Integer martial_married = 2;
	
	// IPD Bed Availability status
	public static final Integer bed_occupied = 1;
	public static final Integer bed_maintenance = 2;
	public static final Integer bed_reserved = 3;
	public static final Integer bed_closed = 4;
	
	// Patient Discharge Status
	public static final Integer patient_discharged = 1;
	public static final Integer patient_expired = 2;
	public static final Integer patient_escaped = 3;
	
	// Payment Methods
	public static final Integer payment_method_cash = 1; // for cash
	public static final Integer payment_method_dd = 2;   // for Demand Draft
	public static final Integer payment_method_nb = 3;   // for NetBanking
	public static final Integer payment_method_cc = 4;   // for Credit Card
	
	
	// Inventory Status
	public static final String INVENTORY_TYPE_DESC_SALES="Sales";
    public static final String DELETED_STATUS="Deleted";
	public static final String INVENTORY_TYPE_DESC_PURCHASE="Purchase";
	
	// IPD Request Modes
	public static final String IPD_New = "add";
	public static final String IPD_Edit = "edit";
	public static final String IPD_Delete = "delete";
	public static final String IPD_Discharge = "discharge";
	
	// Employee Type
	public static final Integer Emp_Permanent = 1;
	public static final Integer Emp_Temporary = 2;
	public static final Integer Emp_Consultant = 3;
	
	// Emloyee Category
	public static final Integer Emp_Category_Medical = 1;
	public static final Integer Emp_Category_ParaMedical = 2;
	public static final Integer Emp_Category_NonMedical = 3;
	public static final Integer Emp_Category_NonMedicals=4;
	
	//Employee Department
	public static final Integer Emp_Gastroenterology = 2;
	public static final Integer Emp_Gynecology = 15;
	public static final Integer Emp_Deaprtment=3;
	
	
	// Emloyee Category
	public static final Integer Week_Day_Sun = 1;
	public static final Integer Week_Day_Mon = 2;
	public static final Integer Week_Day_Tue = 3;
	public static final Integer Week_Day_Wed = 4;
	public static final Integer Week_Day_Thu = 5;
	public static final Integer Week_Day_Fri = 6;
	public static final Integer Week_Day_Sat = 7;

	//Annual Year Id
	
	public static final Integer Annual_Year_2014=1;
	public static final Integer Annual_Year_2015=2;
	public static final Integer Annual_Year_2016=3;
	
	// Attendance Status Codes
	public static final Integer Attendance_Present = 1;
	public static final Integer Attendance_Leave = 2;
	public static final Integer Attendance_HL = 3;  // Half Day Leave
	public static final Integer Attendance_WL = 1;  // Weekly Leave
	
	// Leave Pay Status Codes
	public static final Integer Leave_Pay_Paid = 1;
	public static final Integer Leave_Pay_UnPaid = 2;
	
	// Leave Status Codes
	public static final Integer Leave_Status_Approved = 1;
	public static final Integer Leave_Status_Rejected = 2;
	public static final Integer Leave_Status_Pending = 3;
	public static final Integer Leave_Status_Canceled = 4;
	
	// Salary Related Primary Heads
	public static final Integer Salary_Primary_Heads_Income = 1;
	public static final Integer Salary_Primary_Heads_Deduction = 2;

	
	// Salary Related  Heads Calculation Types
	public static final Integer Salary_Heads_Cal_Amount = 1;
	public static final Integer Salary_Heads_Cal_percent = 2;
	
	//index Master value
	public static final Integer Index_Common_Receipt_Id = 1;
	public static final Integer Index_Employee_Id = 2;
	public static final Integer Index_Opd_Id = 3;
	public static final Integer Index_Ipd_Id = 4;
	public static final Integer Index_Lab_Id = 5;
	public static final Integer Index_Voucher_Id = 6;
	public static final Integer Index_Refund_Id = 7;
	
	// Test Result Type
	public static final Integer Test_Result_Type_Normal = 1;
	public static final Integer Test_Result_Type_Multiple = 2;
	public static final Integer Test_Result_Type_Image = 3;
	
	
	
	// Payment Type Master Value see payment_type_master Table 
	
	public static final Integer Payment_Type_Voucher_Id = 1;
	public static final Integer Payment_Type_Cheque_Id = 2;
	
	
	//Emp Terminate Status
	
	public static final Integer Emp_teminate_status=1;
	
	// payment Source Variables and values
	public static final Integer Payment_Src_Consultation_Id=1;
	public static final Integer Payment_Src_Doctor_Id=2;
	public static final Integer Payment_Src_Lab_Id=3;
	public static final Integer Payment_Src_Room_Id=4;
	public static final Integer Payment_Src_Miscellaneous_Id=5;
	public static final Integer Payment_Src_Operation_Id=6;
	public static final Integer Payment_Src_Pharmacy_Id=7;
	
	
	
 	// To Check Empty Values 
	
	public static boolean isEmpty(String value)
	{
		boolean result = true;
		if (null != value && !value.trim().isEmpty()) {
			result = false;
		}
		return result;
	}
	
	public static boolean isEmpty(Integer value)
	{
		boolean result = true;
		if (null != value && 0 != value) {
			result = false;
		}
		return result;
	}
	
	public static boolean isEmpty(Double value)
	{
		boolean result = true;
		if (null != value && 0.0d != value) {
			result = false;
		}
		return result;
	}
	
	public static boolean isEmpty(Float value)
	{
		boolean result = true;
		if (null != value && 0.0f != value) {
			result = false;
		}
		return result;
	}
	public static boolean isEmpty(Long value)
	{
		boolean result = true;
		if (null != value && 0L != value) {
			result = false;
		}
		return result;
	}
	
	public static boolean isEmpty(Character value)
	{
		boolean result = true;
		if (null != value && '\u0000' != value) {
			result = false;
		}
		return result;
	}
	
	public static boolean isEmpty(List<?> list)
	{
		boolean result = true;
		if (null != list && !list.isEmpty()) {
			result = false;
		}
		return result;
	}
	
	public static boolean isEmpty(Object object)
	{
		boolean result = true;
		if (object != null) {
			result = false;
		}
		return result;
	}
	
	public static List<String> convertStringToList(String value,String pattern)
	{
		
		List<String> valueList = new ArrayList<String>();
		
		if(!isEmpty(value) && !isEmpty(pattern))
		{
				valueList =  Arrays.asList(value.split(pattern));
		}
		
		return valueList;
	}
	
	// for Indian Currency Formats
	public static String indianCurrencyNumberFormat(Object amount){
		String result = "";
		Format format = com.ibm.icu.text.NumberFormat.getCurrencyInstance(new Locale("en", "in"));
		BigDecimal bd = new BigDecimal(amount.toString());
		result = format.format(bd).substring(2);
		return result;
	}
	
	public static String numberSpellOut(Object amount){
		String result = "";
		NumberFormat formatter =  new RuleBasedNumberFormat(new Locale("en", "in"), RuleBasedNumberFormat.SPELLOUT);
		BigDecimal bd = new BigDecimal(amount.toString());
		result = formatter.format(bd).replace('-', ' ');
		return result;
	}
	
	public static String indianCurrencyNumberSpellOut(Object amount){
		String result = "";
		String number = "";
		NumberFormat formatter =  new RuleBasedNumberFormat(new Locale("en", "in"), RuleBasedNumberFormat.SPELLOUT);
		BigDecimal bd = new BigDecimal(amount.toString());
		//System.out.println("amount "+amount.toString().substring(0, amount.toString().indexOf(".")));
		if(amount.toString().contains("."))
		{
		number = amount.toString().substring(0, amount.toString().indexOf("."));
		}
		else{
			number = amount.toString();
		}
		NumToWords w = new NumToWords(); 
		//NumToWords w = numToWords;
		result = w.convert(Integer.parseInt(number))+" Rupees ";
		number = formatter.format(bd);
		if(number.contains("point"))
		{
		number = number.substring(number.indexOf("point")+5);
		
		result +=" and "+number+" Paisa";
		}
		return result;
	}
	
	public static String toCaptilize(String message)
	{
		message = StringUtils.capitalize(message);
		return message;
	}
	
	/*public static void main(String[] args){
		System.out.println("number format "+indianCurrencyNumberSpellOut(1100034.56));
	}*/

}


