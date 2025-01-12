public enum UserRole
{
    ADMIN,
    USER,
    GUEST;
    public boolean isAuthorized()
    {
        return this.ordinal() < 2;
    }
}
