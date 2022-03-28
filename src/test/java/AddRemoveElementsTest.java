import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void addRemoveElements() {

        // driver.findElement(By.linkText("Add/Remove Elements")).click();
        // принадлежит HomePage, не забываем добавить элемент переходной страницы в BaseTest
        addRemovePage = homePage.goToAddRemovePage();

        // driver.findElement(By.cssSelector("button")).click();
        // принадлежит AddRemovePage, т.е. мы ищем элемент и кликаем на него
        addRemovePage.addElt();

        // {List<WebElement> elements = driver.findElements(By.cssSelector(".added-manually")); assert (elements.size() > 0);}
        // принадлежит AddRemovePage, т.е. мы ищем новый элемент и проверяем есть ли он
        // assertTrue(addRemovePage.isDeleteBtnDisplayed()); // не нужен
        assert (addRemovePage.getDeleteBtn().size() == 1); // так мы подтверждаем наличие кнопки

        // driver.findElement(By.cssSelector(".added-manually")).click();
        addRemovePage.removeElt();

        // {List<WebElement> elements = driver.findElements(By.cssSelector(".added-manually")); assert (elements.size() == 0);}
        // нужна переменная size, которая считает количество элементов на странице
        // int elementSize = addRemovePage.isDeleteBtnNotDisplayed(); // чтоб убрать лишние строки кода, нужна не тут, а выше
        assert (addRemovePage.getDeleteBtn().size() == 0); // проверяем удаление элемента
    }
}