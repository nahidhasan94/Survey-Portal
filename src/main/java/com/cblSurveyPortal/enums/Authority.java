package com.cblSurveyPortal.enums;

public enum Authority {
    ROLE_ADMIN,
    ROLE_GUEST,
    ROLE_OFFICER,
    ANONYMOUS;

    public String getAuthority(){return this.name();}

}
