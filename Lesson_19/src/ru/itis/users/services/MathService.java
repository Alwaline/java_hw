package ru.itis.users.services;

import ru.itis.users.exceptions.ZeroException;

public class MathService {

    public int division (int a, int b) {
        if (b == 0) {
            throw new ZeroException("Деление на ноль в нашей математике запрещено!");
        } else {
            return a / b;
        }
    }
}
