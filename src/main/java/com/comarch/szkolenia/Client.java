package com.comarch.szkolenia;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
public class Client {
    private final String name;
    private String surname;
    private String pesel;
}
