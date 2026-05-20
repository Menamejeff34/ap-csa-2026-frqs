public int moreHistoryThanMathAbsences()
{
    int count = 0;
    for (CourseRecord historyStudent : historyList){
        String id = historyStudent.getStudentID();
        for (CourseRecord mathStudent : mathList){
            if (id.equals(mathStudent.getStudentID()) &&
                historyStudent.getAbsences() > mathStudent.getAbsences()){
                count++;
            }
        }
    }
    return count;
}
