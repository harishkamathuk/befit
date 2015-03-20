package com.harishkamath.befit.models;
/*
 * ‘pending’, ‘accepted’, ‘blocked’ or ‘null’ 
 * the authenticated athlete’s following status of this athlete
 */
public enum StravaLinkStatus
{
        PENDING("pending"), ACCEPTED("accepted"), BLOCKED("blocked"), NONE(null);
        
        private String status;

        private StravaLinkStatus(String status) {
                this.status = status;
        }
   	
};
