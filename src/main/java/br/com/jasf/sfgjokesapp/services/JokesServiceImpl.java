package br.com.jasf.sfgjokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceImpl implements JokesService {

	private ChuckNorrisQuotes chuckNorrisQuotes;

	public JokesServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getRandomQuote() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
