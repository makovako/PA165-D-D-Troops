package cz.muni.fi.pa165.w2018.dndtroops.api.dto;

import cz.muni.fi.pa165.w2018.dndtroops.api.enums.UserType;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * User Data Transfer Object
 *
 * @author Marek Valko
 */
public class UserDTO {

    @NotNull
    private Long id;

    @NotNull
    private String login;

    @NotNull
    private UserType type;

    private HeroDTO hero;

    public UserDTO() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public HeroDTO getHero() {
        return hero;
    }

    public void setHero(HeroDTO hero) {
        this.hero = hero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDTO)) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(getLogin(), userDTO.getLogin()) &&
                getType() == userDTO.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getType());
    }

    @Override
    public String toString() {
        String name = hero == null ? "NULL" : hero.getName();
        return "UserDTO{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", type=" + type +
                ", hero='"+ name +'\'' +
                '}';
    }

}
