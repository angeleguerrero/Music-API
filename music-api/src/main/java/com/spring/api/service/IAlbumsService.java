package com.spring.api.service;

import java.util.List;

import com.spring.api.entity.Album;

public interface IAlbumsService {

	List<Album>buscarTodos();
	void guardar(Album album);
	void eliminar (Integer idAlbum);
}
