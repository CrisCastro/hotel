package sv.com.dcc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import sv.com.dcc.models.services.IInvoiceService;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("invoice")
public class InvoiceController {
@Autowired
private IInvoiceService invoiceService;
}
