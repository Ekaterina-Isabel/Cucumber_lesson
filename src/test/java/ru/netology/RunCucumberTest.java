package ru.netology;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        features = {"src/test/resources/features"},     // откуда мы хотим брать сценарии
        glue = {"ru.netology.steps"})       //в каком пакете лежит связывающий код

// запуск Cucumber-сценария
public class RunCucumberTest {
}
