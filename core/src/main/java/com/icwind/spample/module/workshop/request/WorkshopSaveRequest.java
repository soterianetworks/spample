package com.icwind.spample.module.workshop.request;

import com.icwind.spample.domain.request.NamingSaveRequest;

/**
 * The request to save workshop
 */
public interface WorkshopSaveRequest extends NamingSaveRequest {

    String getDepartmentId();

    String getCode();
}
