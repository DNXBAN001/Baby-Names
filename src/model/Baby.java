package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Baby 
{
	//instance variables and constants
		// Property allows these instances Observables thus eligible to event handling
		private final StringProperty babyName;
		private final StringProperty babyGender;
		private final IntegerProperty babyCount;
		private final IntegerProperty babyYear;

		/**
		 * Immutable constructor
		 * @param name: baby's name
		 * @param gender: baby's gender
		 * @param count: baby's count per year
		 * @param year: baby's birth year
		 */
		public Baby(final String name, final String gender, final int count,final short year)
		{
			this.babyCount = new SimpleIntegerProperty(count);
			this.babyGender = new SimpleStringProperty(gender);
			this.babyName = new SimpleStringProperty(name);
			this.babyYear = new SimpleIntegerProperty(year);
		}

		/**
		 * This method will get the baby's name from the StringProperty (Observable)
		 * @return the babyName
		 */
		public String getBabyName() 
		{
			return babyName.get();
		}

		/**
		 * This method will get the baby's gender from the StringProperty (Observable)
		 * @return the babyGender
		 */
		public String getBabyGender() 
		{
			return babyGender.get();
		}

		/**
		 * This method will get the baby's count from the IntegerProperty (Observable)
		 * @return the babyCount
		 */
		public int getBabyCount() 
		{
			return babyCount.get();
		}
		
		/**
		 * This method will get the baby's birth year from the IntegerProperty (Observable)
		 * @return the babyYear
		 */
		public short getBabyYear() 
		{
			return (short)babyYear.get();
		}

}
