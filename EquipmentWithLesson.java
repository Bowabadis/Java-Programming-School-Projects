public class EquipmentWithLesson extends Equipment {
    public EquipmentWithLesson(int i){
        super(i-1);
        i--;
        if(i<0 || i>4){
            super.equipmentType = 7;
        }
        super.fee = super.equipFees[super.equipmentType] + super.LESSON_PRICE;
    }
    public String getPolicy(){
        return null;
    }
    public String isLessonRequired(){
        return "Lesson is required and will cost $" + super.LESSON_PRICE;
    }
}
