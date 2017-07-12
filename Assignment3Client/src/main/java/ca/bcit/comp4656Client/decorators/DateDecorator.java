/**
 * @author Yashar Rahvar
 * Date: 10/Jan/2017
 * Project: EJB Project 
 * Class: DateDecorator
 * This class is responsible for decorating date. usage is in displayTag table. 
 **/
package ca.bcit.comp4656Client.decorators;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.displaytag.decorator.TableDecorator;

import ca.bcit.comp4656.jpa.entity.EmployeeObj;

public class DateDecorator extends TableDecorator {
	public static final DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

	/**
	 * 
	 * @return This returns formated date.
	 */
	public String getDob() {
		Date dob = ((EmployeeObj) (this.getCurrentRowObject())).getDob();
		if (dob == null || "".equals(dob)) {
			return "";
		}

		return formatter.format(dob);
	}

}
