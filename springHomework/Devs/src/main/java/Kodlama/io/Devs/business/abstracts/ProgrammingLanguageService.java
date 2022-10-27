package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	
	List<ProgrammingLanguage> delete(ProgrammingLanguage programmingLanguage);
	List<ProgrammingLanguage> update(int index,String name);
	List<ProgrammingLanguage> add(ProgrammingLanguage programmingLanguage) throws Exception;

}
