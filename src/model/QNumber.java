package model;

public class QNumber {
	private int qNumberGeneration = 0;

    public QNumber() 
    {

    }

	public int getqNumberGeneration() {
		return qNumberGeneration;
	}

	public void setqNumberGeneration(int qNumberGeneration) {
		this.qNumberGeneration = qNumberGeneration;
	}

    public void incrementMethod(){
    	setqNumberGeneration(getqNumberGeneration() +1);
    	System.out.println(qNumberGeneration);
    }
    	
    }


