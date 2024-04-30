package tr.edu.medipol.java.BirimTestOrnek;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesapTest {

	@Test
	public void topla_ikiPozitifSayi() {

		// GIVEN
		int sayi1 = 2;
		int sayi2 = 2;

		// WHEN

		int sonuc = Hesap.Topla(sayi1, sayi2);

		// THEN

		assertEquals(4, sonuc);

	}

	@Test
	public void topla_ikiNegatifSayi() {

		// GIVEN
		int sayi1 = -2;
		int sayi2 = -2;

		// WHEN

		int sonuc = Hesap.Topla(sayi1, sayi2);

		// THEN

		assertEquals(-4, sonuc);

	}

	@Test
	public void cikart_ikiPozitifSayi() {
		int sayi1 = 30;
		int sayi2 = 6;

		int sonuc = Hesap.Cikart(sayi1, sayi2);

		assertEquals(24, sonuc);
	}

	@Test
	public void cikart_ikiNegatifSayi() {
		int sayi1 = -5;
		int sayi2 = -6;

		int sonuc = Hesap.Cikart(sayi1, sayi2);

		assertEquals(1, sonuc);
	}

	@Test
	public void carp_ikiPozitifSayi() {
		int sayi1 = 5;
		int sayi2 = 6;

		int sonuc = Hesap.Carp(sayi1, sayi2);

		assertEquals(30, sonuc);
	}

	@Test
	public void carp_ikiNegatifSayi() {
		int sayi1 = -5;
		int sayi2 = -6;

		int sonuc = Hesap.Carp(sayi1, sayi2);

		assertEquals(30, sonuc);
	}

	@Test
	public void carp_birSayiSifir() {
		int sayi1 = 30;
		int sayi2 = 0;

		int sonuc = Hesap.Carp(sayi1, sayi2);

		assertEquals(0, sonuc);
	}

	@Test
	public void bol_ikiPozitifSayi() {
		int sayi1 = 30;
		int sayi2 = 6;

		int sonuc = Hesap.Bol(sayi1, sayi2);

		assertEquals(5, sonuc);
	}

	@Test
	public void bol_ikiNegatifSayi() {
		int sayi1 = -30;
		int sayi2 = -6;

		int sonuc = Hesap.Bol(sayi1, sayi2);

		assertEquals(5, sonuc);
	}

	@Test
	public void bol_SifiraBolme() {
		int sayi1 = 30;
		int sayi2 = 0;
		try {
			int sonuc = Hesap.Bol(sayi1, sayi2);
			
		} catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}

	}

}
