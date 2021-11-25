package app.com.desafio.service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import app.com.desafio.dto.UserDTO;
import app.com.desafio.dto.UserInsertDTO;
import app.com.desafio.model.User;
import app.com.desafio.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
  private static Logger logger = LoggerFactory.getLogger(UserService.class);

  @Autowired
  BCryptPasswordEncoder passwordEncoder;

  @Autowired
  private UserRepository repository;

  @Transactional
  public UserDTO insert(UserInsertDTO dto) {
    User entity = new User();
    copyDtoToEntity(dto, entity);
    entity.setPassword(passwordEncoder.encode(dto.getPassword())); // senha encriptada
    entity = repository.save(entity);
    return new UserDTO(entity);
  }

  @Transactional
  public UserDTO update(Long id, UserInsertDTO dto) {
    try {
      User entity = repository.getOne(id);
      copyDtoToEntity(dto, entity);
      entity.setPassword(passwordEncoder.encode(dto.getPassword())); // senha encriptada
      entity = repository.save(entity);
      return new UserDTO(entity);
    } catch (EntityNotFoundException e) {
      throw new EntityNotFoundException("Id not Found " + id);
    }
  }

  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    User user = repository.findByEmail(email);
    if(user == null) {
      logger.error("User not found: " + email);
      throw new UsernameNotFoundException("Email not found");
    }
    logger.info("User found: " + email);
    return user;
  }

  private void copyDtoToEntity(UserDTO dto, User entity) {
    entity.setEmail(dto.getEmail());
  }
  
}
