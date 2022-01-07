public abstract class Equipment {
    final int LESSON_PRICE = 27;
    int equipmentType;
    String equipmentName;
    int fee;
    final String[] equipNames = {"personal watercraft", "pontoon boat", "rowboat", "canoe", "kayak", "beach chair", "umbrella","other"};
    final int[] equipFees = {50,40,15,12,10,2,1,0};
    public Equipment(int type){
        if(type>=0 && type<=7) {
            equipmentType = type;
        }else {
            equipmentType = 7;
        }
        equipmentName = equipNames[equipmentType];
        fee = equipFees[equipmentType];
    }
    public int getEquipmentType(){
        return equipmentType;
    }
    public String getEquipmentName(){
        return equipmentName;
    }
    public abstract String getPolicy();
    public abstract String isLessonRequired();
    public int getFee(){
        return fee = equipFees[equipmentType];
    }
}
