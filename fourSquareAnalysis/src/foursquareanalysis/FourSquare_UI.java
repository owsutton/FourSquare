/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foursquareanalysis;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author owsutton
 */
public class FourSquare_UI extends Application implements EventHandler{
Label incomeLabel,rentalIncomeLabel,laundryLabel,storageLabel,miscIncomeLabel,tIncomeLabel;// Income Box Labels
Label expensesLabel,taxLabel,insuranceLabel,utilityLabel,hoaLabel,lawnLabel,snowLabel,vacancyLabel,repairsLablel,capExLabel,propertyManageLabel,mortgageLabel,tExpensesLabel;// Expenses Box Labels
Label cashFlowLabel,cFIncomeLabel, cFExpensesLabel,MonthlyCashFlowLabel;//Cash Flow Box Labels
Label downPaymentLabel,closingCostLabel,rehabBudgetLabel,miscROILabel,tInvestmentLabel,aCashFlowLabel,CCROILabel;//CCROI Box Labels

    @Override
    public void start(Stage stage) throws Exception {
       GridPane pane = new GridPane();
       
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void handle(Event t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
