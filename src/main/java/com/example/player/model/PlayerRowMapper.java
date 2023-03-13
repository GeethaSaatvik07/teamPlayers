package com.example.player.model;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerRowMapper implements RowMapper<Player> {

    @Override
    public Player mapRow(ResultSet rs ,int rowNum) throws SQLException{
        return new Player(
          rs.getInt("id"),
          rs.getString("playerName"),
          rs.getInt("jerseyNumber"),
          rs.getString("role"));
    }
}