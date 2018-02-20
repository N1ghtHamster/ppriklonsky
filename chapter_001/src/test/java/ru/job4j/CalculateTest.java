package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Test.
*
*@author Pavel Priklonsky (votymu@yandex.ru)
*@version $Id$
*@since 20.02.18
*/

public class CalculateTest {

/**
*Test echo.
*/
	@Test
	public  void whenTakeNameTreeEchoPlusName() {
	String input = "Pavel Priklonsky";
	String expect = "Echo, echo, echo : Pavel Priklonsky";
	Calculate calc = new Calculate();
	String result = calc.echo(input);
	assertThat(result, is(expect));
	}
}