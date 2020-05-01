package org.arrizabalaga.addTwoNumbers;

/**
 * @author <a href="mailto:ivan.arrizabalaga@gmail.com">Ivan Arrizabalaga</a>
 */
public class AddTwoNumbersVanillaTest extends AddTwoNumbersTest{

	@Override
	protected IAddTwoNumbers createSUT() {
		return new AddTwoNumbersVanilla();
	}
}