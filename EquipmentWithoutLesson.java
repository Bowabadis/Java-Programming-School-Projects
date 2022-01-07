public class EquipmentWithoutLesson extends Equipment {
    public EquipmentWithoutLesson(int i){
        super(i-1);
        i--;
        if(i<5 || i>7){
            super.equipmentType = 7;
        }
        super.fee = super.equipFees[super.equipmentType];
    }
    public String getPolicy(){
        return null;
    }
    public String isLessonRequired(){
        return "Lesson is not available for this activity";
    }
}
