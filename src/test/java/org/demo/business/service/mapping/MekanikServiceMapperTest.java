/*
 * Created on 25 Jul 2021 ( Time 02:07:42 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service.mapping;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import org.demo.bean.Mekanik;
import org.demo.bean.jpa.MekanikEntity;
import org.demo.test.MockValues;

/**
 * Test : Mapping between entity beans and display beans.
 */
public class MekanikServiceMapperTest {

	private MekanikServiceMapper mekanikServiceMapper;

	private static ModelMapper modelMapper = new ModelMapper();

	private MockValues mockValues = new MockValues();
	
	
	@BeforeClass
	public static void setUp() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	
	@Before
	public void before() {
		mekanikServiceMapper = new MekanikServiceMapper();
		mekanikServiceMapper.setModelMapper(modelMapper);
	}
	
	/**
	 * Mapping from 'MekanikEntity' to 'Mekanik'
	 * @param mekanikEntity
	 */
	@Test
	public void testMapMekanikEntityToMekanik() {
		// Given
		MekanikEntity mekanikEntity = new MekanikEntity();
		mekanikEntity.setNamaMekanik(mockValues.nextString(45));
		mekanikEntity.setNoHp(mockValues.nextString(13));
		
		// When
		Mekanik mekanik = mekanikServiceMapper.mapMekanikEntityToMekanik(mekanikEntity);
		
		// Then
		assertEquals(mekanikEntity.getNamaMekanik(), mekanik.getNamaMekanik());
		assertEquals(mekanikEntity.getNoHp(), mekanik.getNoHp());
	}
	
	/**
	 * Test : Mapping from 'Mekanik' to 'MekanikEntity'
	 */
	@Test
	public void testMapMekanikToMekanikEntity() {
		// Given
		Mekanik mekanik = new Mekanik();
		mekanik.setNamaMekanik(mockValues.nextString(45));
		mekanik.setNoHp(mockValues.nextString(13));

		MekanikEntity mekanikEntity = new MekanikEntity();
		
		// When
		mekanikServiceMapper.mapMekanikToMekanikEntity(mekanik, mekanikEntity);
		
		// Then
		assertEquals(mekanik.getNamaMekanik(), mekanikEntity.getNamaMekanik());
		assertEquals(mekanik.getNoHp(), mekanikEntity.getNoHp());
	}

}