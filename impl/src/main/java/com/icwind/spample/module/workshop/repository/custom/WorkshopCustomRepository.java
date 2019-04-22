package com.icwind.spample.module.workshop.repository.custom;

import com.icwind.spample.domain.model.Workshop;
import com.icwind.spample.module.workshop.request.WorkshopSearchRequest;
import org.springframework.data.domain.Page;

public interface WorkshopCustomRepository {

    Page<Workshop> search(WorkshopSearchRequest searchRequest);

}
