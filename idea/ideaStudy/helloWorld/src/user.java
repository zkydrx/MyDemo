/**
 * Created by ZKY on 2017-03-17 19:23.
 */
class User
{
    private  String name;
    private String password;

    public User(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "" + name ;
    }
}
