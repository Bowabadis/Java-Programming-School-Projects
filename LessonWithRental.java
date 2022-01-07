public class LessonWithRental extends Rental{
    Boolean isLessonRequired = false;
    final String[] INSTRUCTORNAMES = {"Kyle", "Luke","Thomas","Avery","Joe","Eddison","Brady","Colin"};
    public LessonWithRental(String num, int min, String contract, int equipNum){
        super(num,min,contract,equipNum);
        if(equipNum == 1 || equipNum == 2){
            isLessonRequired = true;
        }
    }
    public String getInstructor(LessonWithRental rental){
        String hasClass;
        if(rental.isLessonRequired){
            hasClass = " requires the client to take a lesson";
        } else {
            hasClass = " doesn't require the client to take a lesson";
        }
        String instructor = "Event: "+rental.getTypesOfEquipment()+hasClass+
                "  Instructor name: "+INSTRUCTORNAMES[rental.getEquipmentType()];
        return instructor;
    }
}
