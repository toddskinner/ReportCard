/**
 * Displays grades for a specific student in each subject. 
 */
public class ReportCard {
 
    private String mStudentName;
    private int mCalculusGrade;
    private int mFrenchGrade;        
    private int mHistoryGrade;
    private int mChemistryGrade;
    private int mEnglishLitGrade;
 
    /**
     * Constructs a new ReportCard with initial values from the Student object.
     */
    public ReportCard(Student studentName) {
      mStudentName = studentName;
      mCalculusGrade = 0;
      mFrenchGrade = 0;        
      mHistoryGrade  = 0;
      mChemistryGrade = 0;
      mEnglishLitGrade = 0;     
    }
 
    /**
     * Sets the grade for the student in each of the below subjects.
     *
     * @param grade is the updated int to be stored as the grade for that subject.
     */
    public void setCalculusGrade(int grade) {
        mCalculusGrade = grade;
    }
 
    public void setFrenchGrade(int grade) {
        mFrenchGrade = grade;
    }

    public void setHistoryGrade(int grade) {
        mHistoryGrade = grade;
    }

    public void setChemistryGrade(int grade) {
        mChemistryGrade = grade;
    }

    public void setEnglishLitGrade(int grade) {
        mChemistryGrade = grade;
    }
 
    /**
     * Gets the grade value for each of the below specific subjects.
     *
     * @return the grade for that subject.
     */
    
    public int getCalculusGrade() {
        return mCalculusGrade;
    }
 
    public int getFrenchGrade() {
        return mFrenchGrade;
    }

    public int getHistoryGrade() {
        return mHistoryGrade;
    }

    public int getChemistryGrade() {
        return mChemistryGrade;
    }

    public int getEnglishLitGrade() {
        return mEnglishLitGrade;
    }
 
    @Override
    public String toString() {
        return mStudentName + " received the following grades:\n" + 
        "Calculus: " + mCalculusGrade +"%\n" + 
        "French: " + mFrenchGrade +"%\n" +
        "History: " + mHistoryGrade +"%\n" +
        "Chemistry: " + mChemistryGrade +"%\n" +
        "English Lit: " + mEnglishLitGrade +"%\n";
    }

}