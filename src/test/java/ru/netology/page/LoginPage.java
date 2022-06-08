package ru.netology.page;

import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

//вариант 1 Page Object, рекомендуемый разработчиками Selenide
//метод validLogin вызываем тогда когда ожидаем, что логин будет успешный; если передать некорректный логин, то тест упадет
public class LoginPage {
    public VerificationPage validLogin(DataHelper.AuthInfo info) {
        $("[data-test-id=login] input").setValue(info.getLogin());
        $("[data-test-id=password] input").setValue(info.getPassword());
        $("[data-test-action=login] input").click();
        return new VerificationPage();      //чейнинг - создание цепочки страниц, т.е. ожидаем что откроется другая страница, страница верификации
    }
}
