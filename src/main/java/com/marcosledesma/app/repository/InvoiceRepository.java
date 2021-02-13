package com.marcosledesma.app.repository;

import com.marcosledesma.app.domain.Invoice;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Invoice entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    Page<Invoice> findAllByOrderCustomerUserLogin(String login, Pageable pageable);

    Optional<Invoice> findOneByIdAndOrderCustomerUserLogin(Long id, String login);
}
