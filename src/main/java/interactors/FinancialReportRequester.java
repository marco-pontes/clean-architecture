package interactors;

public interface FinancialReportRequester {
    FinancialReportResponse getFinancialReport(FinancialReportRequest financialReportRequest);
}
