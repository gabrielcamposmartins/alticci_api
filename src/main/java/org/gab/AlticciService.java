package org.gab;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlticciService {
    public Integer Calc(Integer number){
        return number <= 1 ? number : number == 2 ? 1 : Calc(number - 3) + Calc(number - 2);
    }
}
