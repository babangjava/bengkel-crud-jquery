/*
 * Created on 25 Jul 2021 ( Time 02:07:42 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.demo.bean.Mekanik;
import org.demo.bean.jpa.MekanikEntity;
import org.demo.business.service.MekanikService;
import org.demo.business.service.mapping.MekanikServiceMapper;
import org.demo.data.repository.jpa.MekanikJpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementation of MekanikService
 */
@Component
@Transactional
public class MekanikServiceImpl implements MekanikService {

	@Resource
	private MekanikJpaRepository mekanikJpaRepository;

	@Resource
	private MekanikServiceMapper mekanikServiceMapper;
	
	@Override
	public Mekanik findById(String idMekanik) {
		MekanikEntity mekanikEntity = mekanikJpaRepository.findOne(idMekanik);
		return mekanikServiceMapper.mapMekanikEntityToMekanik(mekanikEntity);
	}

	@Override
	public List<Mekanik> findAll() {
		Iterable<MekanikEntity> entities = mekanikJpaRepository.findAll();
		List<Mekanik> beans = new ArrayList<Mekanik>();
		for(MekanikEntity mekanikEntity : entities) {
			beans.add(mekanikServiceMapper.mapMekanikEntityToMekanik(mekanikEntity));
		}
		return beans;
	}

	@Override
	public Mekanik save(Mekanik mekanik) {
		return update(mekanik) ;
	}

	@Override
	public Mekanik create(Mekanik mekanik) {
		MekanikEntity mekanikEntity = mekanikJpaRepository.findOne(mekanik.getIdMekanik());
		if( mekanikEntity != null ) {
			throw new IllegalStateException("already.exists");
		}
		mekanikEntity = new MekanikEntity();
		mekanikServiceMapper.mapMekanikToMekanikEntity(mekanik, mekanikEntity);
		MekanikEntity mekanikEntitySaved = mekanikJpaRepository.save(mekanikEntity);
		return mekanikServiceMapper.mapMekanikEntityToMekanik(mekanikEntitySaved);
	}

	@Override
	public Mekanik update(Mekanik mekanik) {
		MekanikEntity mekanikEntity = mekanikJpaRepository.findOne(mekanik.getIdMekanik());
		mekanikServiceMapper.mapMekanikToMekanikEntity(mekanik, mekanikEntity);
		MekanikEntity mekanikEntitySaved = mekanikJpaRepository.save(mekanikEntity);
		return mekanikServiceMapper.mapMekanikEntityToMekanik(mekanikEntitySaved);
	}

	@Override
	public void delete(String idMekanik) {
		mekanikJpaRepository.delete(idMekanik);
	}

	public MekanikJpaRepository getMekanikJpaRepository() {
		return mekanikJpaRepository;
	}

	public void setMekanikJpaRepository(MekanikJpaRepository mekanikJpaRepository) {
		this.mekanikJpaRepository = mekanikJpaRepository;
	}

	public MekanikServiceMapper getMekanikServiceMapper() {
		return mekanikServiceMapper;
	}

	public void setMekanikServiceMapper(MekanikServiceMapper mekanikServiceMapper) {
		this.mekanikServiceMapper = mekanikServiceMapper;
	}

}
