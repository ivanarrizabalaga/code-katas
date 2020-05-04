package org.arrizabalaga.LongestSubstringWithoutRepeatingCharacters;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author <a href="mailto:ivan.arrizabalaga@gmail.com">Ivan Arrizabalaga</a>
 */
public abstract class LongestSubtringWithoutRepeatingCharactersTest<T extends ILongestSubtringWithoutRepeatingCharacters> {
	protected T sut;
	protected abstract T createSUT();

	@Before
	public void setup(){
		sut = createSUT();
	}

	@Test
	public void givenEmptyString_thenZero(){
		//expect
		assertThat(sut.lengthOfLongestSubstring(""),is(0));
		assertThat(sut.lengthOfLongestSubstring(null),is(0));
	}

	@Test
	public void givenSeveralInputs_thenReturnsLenghtOk(){
		//expects " " -> 1
		assertThat(sut.lengthOfLongestSubstring(" "),is(1));
		//expect "abc" -> 3
		assertThat(sut.lengthOfLongestSubstring("abcabcbb"),is(3));
		//expect "bbbbb" -> 1
		assertThat(sut.lengthOfLongestSubstring("bbbbb"),is(1));
		//expect "wke" -> 3
		assertThat(sut.lengthOfLongestSubstring("pwwkew"),is(3));
	}

	@Test
	public void givenSubtringInCurrent_thenReturnsLenghtOk(){
		//expect ""dvdf" -> 3
		assertThat(sut.lengthOfLongestSubstring("dvdf"),is(3));
	}

	@Test
	public void givenSortString_thenReturnsLenghtOk(){
		//expect ""dvdf" -> 3
		assertThat(sut.lengthOfLongestSubstring("aab"),is(2));
	}
}
