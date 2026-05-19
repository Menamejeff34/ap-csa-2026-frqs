public Account(String requestedName)
{
    if (isAvailable(requestedName))
    {
        username = requestedName;
    }
    else
    {
        int num = 1;
        String possible = requestedName + num;

        while (!isAvailable(possible))
        {
            num++;
            possible = requestedName + num;
        }

        username = possible;
    }
}
