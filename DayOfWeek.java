public enum DayOfWeek
{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    public boolean isWeekend()
    {
        return this.ordinal() > 4;
    }
}
