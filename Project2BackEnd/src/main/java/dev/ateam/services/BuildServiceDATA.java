package dev.ateam.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.ateam.entities.AppUser;
import dev.ateam.entities.Build;
import dev.ateam.repositories.BuildRepository;

@Component
@Service("BuildServiceDATA")
public class BuildServiceDATA implements BuildService {

	@Autowired
	BuildRepository br;
	
	@Override
	public Build createBuild(Build build) {
		br.save(build);
		return build;
	}

	@Override
	public boolean deleteBuild(Build build) {
		br.delete(build);
		return true;
	}

	@Override
	public Build updateBuild(Build build) {
		br.save(build);
		return build;
	}

	//Ask Adam what this is all about
	@Override
	public List<Build> getAllBuilds() {
		Iterable<Build> build = br.findAll();
		List<Build> buildSet = new ArrayList<Build>((Collection<? extends Build>) build);
		
		return buildSet;
	}
	
	public Build getBuildById(int b_id) {
		Build build = br.findById(b_id).get();
		return build;
	}

}
