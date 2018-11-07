package evan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import evan.beans.TextEditor;

public class TextEditorMain {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
   }
}