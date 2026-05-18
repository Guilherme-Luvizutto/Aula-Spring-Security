package com.gpl.security.models;

import com.gpl.security.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
