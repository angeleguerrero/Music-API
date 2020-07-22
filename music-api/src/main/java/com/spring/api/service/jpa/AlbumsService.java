package com.spring.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.api.entity.Album;
import com.spring.api.repository.AlbumRepository;
import com.spring.api.service.IAlbumsService;
@Service
public class AlbumsService implements IAlbumsService {

	@Autowired
	private AlbumRepository repoAlbums;
	
	
	@Override
	public List<Album> buscarTodos() {
		
		return repoAlbums.findAll();
	}

}
