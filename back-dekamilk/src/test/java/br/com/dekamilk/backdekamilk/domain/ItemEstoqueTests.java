package br.com.dekamilk.backdekamilk.domain;

import java.awt.event.ItemEvent;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.dekamilk.dekamilk.domain.ItemEstoque;


@SpringBootTest
public class ItemEstoqueTests {

@Test
public void criar() {
ItemEstoque i = new  ItemEstoque(Short.valueOf("1"), "ivomec", 1.00, null, "vacina");

}
}
