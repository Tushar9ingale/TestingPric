package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LockedMessagesPage {
    WebDriver driver;

    // Locators
    By newMessageButton = By.id("newMessage");
    By messageContentField = By.id("messageContent");
    By saveMessageButton = By.id("saveMessage");
    By deleteButton = By.cssSelector(".deleteButton");
    
    // Constructor
    public LockedMessagesPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void createNewMessage(String message) {
        driver.findElement(newMessageButton).click();
        driver.findElement(messageContentField).sendKeys(message);
        driver.findElement(saveMessageButton).click();
    }

    public void deleteMessage() {
        driver.findElement(deleteButton).click();
    }
}
