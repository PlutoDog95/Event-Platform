package com.vini.tickets.services;

import com.vini.tickets.domain.entities.QrCode;
import com.vini.tickets.domain.entities.Ticket;

public interface QrCodeService {

    QrCode generateQrCode(Ticket ticket);
}
