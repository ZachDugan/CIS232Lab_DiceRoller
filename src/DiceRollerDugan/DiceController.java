package DiceRollerDugan;


import java.util.Random;
import javafx.event.ActionEvent;


import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.image.*;

public class DiceController {
    @FXML
    private TextField NumDice;
    @FXML
    private ImageView d1;
    @FXML
    private ImageView d2;
    @FXML
    private ImageView d3;
    @FXML
    private ImageView d4;
    @FXML
    private ImageView d5;
    @FXML
    private ImageView d6;
    @FXML
    private ImageView d7;
    @FXML
    private ImageView d8;
    @FXML
    private ImageView d9;
    @FXML
    private ImageView d10;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private Label label6;
    @FXML
    private Label label7;
    @FXML
    private Label label8;
    @FXML
    private Label label9;
    @FXML
    private Label label10;
    @FXML 
    private RadioButton rdo6;
    @FXML
    private RadioButton rdo8;
    @FXML
    private RadioButton rdo12;
    @FXML
    private RadioButton rdo20;
    @FXML 
    private Label Sum;

    	//cbxRed.isSelected() && cbxBlue.isSelected() && !cbxBlack.isSelected() && !cbxGreen.isSelected()){
    		//lblOutput.setText("You are correct.");
    @FXML
    void rollDice(ActionEvent event){
    	int sum=0;
    	//set arrays of dice imageviews & labels
    	ImageView[] DiceNums=new ImageView[10];
    	DiceNums[0]=d1; DiceNums[1]=d2; DiceNums[2]=d3; DiceNums[3]=d4; DiceNums[4]=d5; DiceNums[5]=d6; DiceNums[6]=d7;DiceNums[7]=d8;DiceNums[8]=d9;DiceNums[9]=d10;
    	Label[] labels = new Label[10];
    	labels[0]=label1; labels[1]=label2; labels[2]=label3; labels[3]=label4; labels[4]=label5; labels[5]=label6; labels[6]=label7; labels[7]=label8; labels[8]=label9; labels[9]=label10;  
    	
    	//reset all dice & labels to be invisible
    	for(ImageView img :DiceNums){
    		img.setVisible(false);
    	}
    	for(Label lbl : labels){
    		lbl.setVisible(false);
    	}
    	
    	//determine which type of dice to use; and the max value per roll
        boolean d6=false;
        int max=0;
        
    	if(Integer.parseInt(NumDice.getText()) > 0 && Integer.parseInt(NumDice.getText()) < 11){
    		if(rdo6.isSelected()){
    			d6=true;
        		max=6;
        	}else if(rdo8.isSelected()){
        		max=8;
        	}else if(rdo12.isSelected()){
        		max=12;
        	}else if(rdo20.isSelected()){
        		max=20;
        	}		
    		
    		//Determine Number of Dice to roll
    		int NumOfDice=Integer.parseInt(NumDice.getText());
    		int diceCounter=0;
    		Random rand= new Random();
    		int thisDiceNum=0;
    		//Display the correct Dice & label
    		while(diceCounter < NumOfDice)
    		{
    			thisDiceNum=rand.nextInt(max)+1;
    			sum = sum + thisDiceNum;
    			//Image thisDice = new Image(getClass().getResource("1.png").toString());
    			//DiceNums[diceCounter].setImage(thisDice);
    			
    			if(!d6)
    			{
    				labels[diceCounter].setVisible(true);
    				labels[diceCounter].setText(Integer.toString(thisDiceNum));
    				DiceNums[diceCounter].setImage(new Image(getClass().getResource(max + ".png").toString()));
    				DiceNums[diceCounter].setVisible(true);
    			}else{
    				DiceNums[diceCounter].setImage(new Image(getClass().getResource(thisDiceNum + ".png").toString()));
    				DiceNums[diceCounter].setVisible(true);
    			}
    			diceCounter++;
    		}
    	//continue code to sum
    		Sum.setText(Integer.toString(sum));
    		
    	}
    }
    
    
    
    
}
