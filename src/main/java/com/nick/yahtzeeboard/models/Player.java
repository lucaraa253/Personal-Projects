package com.nick.yahtzeeboard.models;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int diceOne;

    private int diceTwo;

    private int diceThree;

    private int diceFour;

    private int diceFive;

    private int onesVal;

    private int twosVal;

    private int threesVal;

    private int foursVal;

    private int fivesVal;

    private int sixesVal;

    private int upperTotal;

    private int lowerTotal;

    private int roll;

    private int round;

    private Boolean diceOneStatus;

    private Boolean diceTwoStatus;

    private Boolean diceThreeStatus;

    private Boolean diceFourStatus;

    private Boolean diceFiveStatus;
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    
    public Player() {
    }
//    public Player(int diceOne, int diceTwo, int diceThree, int diceFour, int diceFive, int onesVal, int twosVal, int threesVal, int foursVal, int fivesVal, int sixesVal, int upperTotal, int lowerTotal, int roll, int round, Boolean diceOneStatus, Boolean diceTwoStatus, Boolean diceThreeStatus, Boolean diceFourStatus, Boolean diceFiveStatus) {
//    	this.diceOne = diceOne;
//    	this.diceTwo = diceTwo;
//    	this.diceThree = diceThree;
//    	this.diceFour = diceFour;
//    	this.diceFive = diceFive;
//    	this.onesVal = onesVal;
//    	this.twosVal = twosVal;
//    	this.threesVal = threesVal;
//    	this.foursVal = foursVal;
//    	this.fivesVal = fivesVal;
//    	this.sixesVal = sixesVal;
//    	this.upperTotal = upperTotal;
//    	this.lowerTotal = lowerTotal;
//    	this.roll = roll;
//    	this.round = round;
//    	this.diceOneStatus=diceOneStatus;
//    	this.diceTwoStatus = diceTwoStatus;
//    	this.diceThreeStatus = diceThreeStatus;
//    	this.diceFourStatus = diceFourStatus;
//    	this.diceFiveStatus = diceFiveStatus;
//    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDiceOne() {
		return diceOne;
	}
//New
	public void setDiceOneOne(int diceOne) {
        this.diceOne = diceOne;

	}
	
	public int setDiceOne() {
		if(diceOneStatus == true) {
			return diceOne;
		}else {

			Random random = new Random();
			int x = random.nextInt(6) + 1;
	        this.diceOne = x;
	        return this.diceOne;
		}
	}
	
	public int getDiceTwo() {
		return diceTwo;
	}
//New
	public void setDiceTwoTwo(int diceTwo) {
        this.diceTwo = diceTwo;

	}
	
	public int setDiceTwo() {
		if(diceTwoStatus == true) {
			return diceTwo;
		}else {

			Random random = new Random();
			int x = random.nextInt(6) + 1;
	        this.diceTwo = x;
	        return this.diceTwo;
		}
	}

	public int getDiceThree() {
		return diceThree;
	}
//New
	public void setDiceThreeThree(int diceThree) {
        this.diceThree = diceThree;

	}
	public int setDiceThree() {
		if(diceThreeStatus == true) {
			return diceThree;
		}else {

			Random random = new Random();
			int x = random.nextInt(6) + 1;
	        this.diceThree = x;
	        return this.diceThree;
		}
	}

	public int getDiceFour() {
		return diceFour;
	}
//	New
	public void setDiceFourFour(int diceFour) {
        this.diceFour = diceFour;

	}

	public int setDiceFour() {
		if(diceFourStatus == true) {
			return diceFour;
		}else {

			Random random = new Random();
			int x = random.nextInt(6) + 1;
	        this.diceFour = x;
	        return this.diceFour;
		}
	}

	public int getDiceFive() {
		return diceFive;
	}
//	New
	public void setDiceFiveFive(int diceFive) {
        this.diceFive = diceFive;

	}
	
	public int setDiceFive() {
		if(diceFiveStatus == true) {
			return diceFive;
		}else {

			Random random = new Random();
			int x = random.nextInt(6) + 1;
	        this.diceFive = x;
	        return this.diceFive;
		}
	}

	public int getOnesVal() {
		return onesVal;
	}

	public void setOnesVal(int onesVal) {
		this.onesVal = onesVal;
	}

	public int getTwosVal() {
		return twosVal;
	}

	public void setTwosVal(int twosVal) {
		this.twosVal = twosVal;
	}

	public int getThreesVal() {
		return threesVal;
	}

	public void setThreesVal(int threesVal) {
		this.threesVal = threesVal;
	}

	public int getFoursVal() {
		return foursVal;
	}

	public void setFoursVal(int foursVal) {
		this.foursVal = foursVal;
	}

	public int getFivesVal() {
		return fivesVal;
	}

	public void setFivesVal(int fivesVal) {
		this.fivesVal = fivesVal;
	}

	public int getSixesVal() {
		return sixesVal;
	}

	public void setSixesVal(int sixesVal) {
		this.sixesVal = sixesVal;
	}

	public int getUpperTotal() {
		return upperTotal;
	}

	public void setUpperTotal(int upperTotal) {
		this.upperTotal = upperTotal;
	}

	public int getLowerTotal() {
		return lowerTotal;
	}

	public void setLowerTotal(int lowerTotal) {
		this.lowerTotal = lowerTotal;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public Boolean getDiceOneStatus() {
		return diceOneStatus;
	}

	public void setDiceOneStatus(Boolean diceOneStatus) {
		this.diceOneStatus = diceOneStatus;
	}

	public Boolean getDiceTwoStatus() {
		return diceTwoStatus;
	}

	public void setDiceTwoStatus(Boolean diceTwoStatus) {
		this.diceTwoStatus = diceTwoStatus;
	}

	public Boolean getDiceThreeStatus() {
		return diceThreeStatus;
	}

	public void setDiceThreeStatus(Boolean diceThreeStatus) {
		this.diceThreeStatus = diceThreeStatus;
	}

	public Boolean getDiceFourStatus() {
		return diceFourStatus;
	}

	public void setDiceFourStatus(Boolean diceFourStatus) {
		this.diceFourStatus = diceFourStatus;
	}

	public Boolean getDiceFiveStatus() {
		return diceFiveStatus;
	}

	public void setDiceFiveStatus(Boolean diceFiveStatus) {
		this.diceFiveStatus = diceFiveStatus;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
//package com.nick.yahtzeeboard.models;
//
//import java.util.Date;
//import java.util.Random;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.PrePersist;
//import javax.persistence.PreUpdate;
//import javax.persistence.Table;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;
//
//import org.springframework.format.annotation.DateTimeFormat;
//
//@Entity
//@Table(name="players")
//public class Player {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private int diceOne;
//
//    private int diceTwo;
//
//    private int diceThree;
//
//    private int diceFour;
//
//    private int diceFive;
//
//    private int onesVal;
//
//    private int twosVal;
//
//    private int threesVal;
//
//    private int foursVal;
//
//    private int fivesVal;
//
//    private int sixesVal;
//
//    private int upperTotal;
//
//    private int lowerTotal;
//
//    private int roll;
//
//    private int round;
//
//    private Boolean diceOneStatus;
//
//    private Boolean diceTwoStatus;
//
//    private Boolean diceThreeStatus;
//
//    private Boolean diceFourStatus;
//
//    private Boolean diceFiveStatus;
//    // This will not allow the createdAt column to be updated after creation
//    @Column(updatable=false)
//    @DateTimeFormat(pattern="yyyy-MM-dd")
//    private Date createdAt;
//    @DateTimeFormat(pattern="yyyy-MM-dd")
//    private Date updatedAt;
//    
//    
//    public Player() {
//    }
//    public Player(int diceOne, int diceTwo, int diceThree, int diceFour, int diceFive, int onesVal, int twosVal, int threesVal, int foursVal, int fivesVal, int sixesVal, int upperTotal, int lowerTotal, int roll, int round, Boolean diceOneStatus, Boolean diceTwoStatus, Boolean diceThreeStatus, Boolean diceFourStatus, Boolean diceFiveStatus) {
//    	this.diceOne = diceOne;
//    	this.diceTwo = diceTwo;
//    	this.diceThree = diceThree;
//    	this.diceFour = diceFour;
//    	this.diceFive = diceFive;
//    	this.onesVal = onesVal;
//    	this.twosVal = twosVal;
//    	this.threesVal = threesVal;
//    	this.foursVal = foursVal;
//    	this.fivesVal = fivesVal;
//    	this.sixesVal = sixesVal;
//    	this.upperTotal = upperTotal;
//    	this.lowerTotal = lowerTotal;
//    	this.roll = roll;
//    	this.round = round;
//    	this.diceOneStatus=diceOneStatus;
//    	this.diceTwoStatus = diceTwoStatus;
//    	this.diceThreeStatus = diceThreeStatus;
//    	this.diceFourStatus = diceFourStatus;
//    	this.diceFiveStatus = diceFiveStatus;
//    }
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public int getDiceOne() {
//		return diceOne;
//	}
////New
//	public void setDiceOneOne(int diceOne) {
//        this.diceOne = diceOne;
//
//	}
//	
//	public int setDiceOne() {
//
//			Random random = new Random();
//			int x = random.nextInt(6) + 1;
//	        this.diceOne = x;
//	        return this.diceOne;
//
//				
//	}
//	
//	public int getDiceTwo() {
//		return diceTwo;
//	}
////New
//	public void setDiceTwoTwo(int diceTwo) {
//        this.diceTwo = diceTwo;
//
//	}
//	
//	public int setDiceTwo() {
//		
//			Random random = new Random();
//			int x = random.nextInt(6) + 1;
//	        this.diceTwo = x;
//	        return this.diceTwo;
//
//	}
//
//	public int getDiceThree() {
//		return diceThree;
//	}
////New
//	public void setDiceThreeThree(int diceThree) {
//        this.diceThree = diceThree;
//
//	}
//	public int setDiceThree() {
//
//			Random random = new Random();
//			int x = random.nextInt(6) + 1;
//	        this.diceThree = x;
//	        return this.diceThree;
//
//	}
//
//	public int getDiceFour() {
//		return diceFour;
//	}
////	New
//	public void setDiceFourFour(int diceFour) {
//        this.diceFour = diceFour;
//
//	}
//
//	public int setDiceFour() {
//
//			Random random = new Random();
//			int x = random.nextInt(6) + 1;
//	        this.diceFour = x;
//	        return this.diceFour;
//
//		
//	}
//
//	public int getDiceFive() {
//		return diceFive;
//	}
////	New
//	public void setDiceFiveFive(int diceFive) {
//        this.diceFive = diceFive;
//
//	}
//	
//	public int setDiceFive() {
//
//
//			Random random = new Random();
//			int x = random.nextInt(6) + 1;
//	        this.diceFive = x;
//	        return this.diceFive;
//
//	}
//
//	public int getOnesVal() {
//		return onesVal;
//	}
//
//	public void setOnesVal(int onesVal) {
//		this.onesVal = onesVal;
//	}
//
//	public int getTwosVal() {
//		return twosVal;
//	}
//
//	public void setTwosVal(int twosVal) {
//		this.twosVal = twosVal;
//	}
//
//	public int getThreesVal() {
//		return threesVal;
//	}
//
//	public void setThreesVal(int threesVal) {
//		this.threesVal = threesVal;
//	}
//
//	public int getFoursVal() {
//		return foursVal;
//	}
//
//	public void setFoursVal(int foursVal) {
//		this.foursVal = foursVal;
//	}
//
//	public int getFivesVal() {
//		return fivesVal;
//	}
//
//	public void setFivesVal(int fivesVal) {
//		this.fivesVal = fivesVal;
//	}
//
//	public int getSixesVal() {
//		return sixesVal;
//	}
//
//	public void setSixesVal(int sixesVal) {
//		this.sixesVal = sixesVal;
//	}
//
//	public int getUpperTotal() {
//		return upperTotal;
//	}
//
//	public void setUpperTotal(int upperTotal) {
//		this.upperTotal = upperTotal;
//	}
//
//	public int getLowerTotal() {
//		return lowerTotal;
//	}
//
//	public void setLowerTotal(int lowerTotal) {
//		this.lowerTotal = lowerTotal;
//	}
//
//	public int getRoll() {
//		return roll;
//	}
//
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
//
//	public int getRound() {
//		return round;
//	}
//
//	public void setRound(int round) {
//		this.round = round;
//	}
//
//	public Boolean getDiceOneStatus() {
//		return diceOneStatus;
//	}
//
//	public void setDiceOneStatus(Boolean diceOneStatus) {
//		this.diceOneStatus = diceOneStatus;
//	}
//
//	public Boolean getDiceTwoStatus() {
//		return diceTwoStatus;
//	}
//
//	public void setDiceTwoStatus(Boolean diceTwoStatus) {
//		this.diceTwoStatus = diceTwoStatus;
//	}
//
//	public Boolean getDiceThreeStatus() {
//		return diceThreeStatus;
//	}
//
//	public void setDiceThreeStatus(Boolean diceThreeStatus) {
//		this.diceThreeStatus = diceThreeStatus;
//	}
//
//	public Boolean getDiceFourStatus() {
//		return diceFourStatus;
//	}
//
//	public void setDiceFourStatus(Boolean diceFourStatus) {
//		this.diceFourStatus = diceFourStatus;
//	}
//
//	public Boolean getDiceFiveStatus() {
//		return diceFiveStatus;
//	}
//
//	public void setDiceFiveStatus(Boolean diceFiveStatus) {
//		this.diceFiveStatus = diceFiveStatus;
//	}
//
//	public Date getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(Date createdAt) {
//		this.createdAt = createdAt;
//	}
//
//	public Date getUpdatedAt() {
//		return updatedAt;
//	}
//
//	public void setUpdatedAt(Date updatedAt) {
//		this.updatedAt = updatedAt;
//	}
//	@PrePersist
//    protected void onCreate(){
//        this.createdAt = new Date();
//    }
//    @PreUpdate
//    protected void onUpdate(){
//        this.updatedAt = new Date();
//    }
//}
    
