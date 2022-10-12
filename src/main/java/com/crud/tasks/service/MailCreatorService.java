package com.crud.tasks.service;

import com.crud.tasks.config.AdminConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import com.crud.tasks.config.CompanyConfig;

@Service
public class MailCreatorService {

    @Autowired
    private AdminConfig adminConfig;
    @Autowired
    private CompanyConfig companyConfig;
    @Autowired
    @Qualifier("templateEngine")
    private TemplateEngine templateEngine;

    public String buildTrelloCardEmail(String message) {
        Context context = new Context();
        context.setVariable("tasks_url", "https://dareksurmacz.github.io/");
        context.setVariable("button", "Visit website");
        context.setVariable("admin_name", adminConfig.getAdminName());
        context.setVariable("regards", "Best regards,");
        context.setVariable("companyName", companyConfig.getCompanyName());
        context.setVariable("companyEmail", companyConfig.getCompanyMail());
        context.setVariable("companyPhone", companyConfig.getCompanyPhone());
        return templateEngine.process("mail/created-trello-card-mail", context);
    }
}
