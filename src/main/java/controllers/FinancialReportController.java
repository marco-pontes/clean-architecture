package controllers;


import interactors.FinancialReportRequest;
import interactors.FinancialReportRequester;
import interactors.FinancialReportResponse;

public class FinancialReportController {

    public void present(FinancialReportPresenter financialReportPresenter, FinancialReportRequester financialReportRequester){
        FinancialReportRequest financialReportRequest = new FinancialReportRequest();
        FinancialReportResponse financialReportResponse = financialReportRequester.getFinancialReport(financialReportRequest);
        financialReportPresenter.present(financialReportResponse);
    }

}
