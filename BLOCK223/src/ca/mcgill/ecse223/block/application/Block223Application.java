package ca.mcgill.ecse223.block.application;

import ca.mcgill.ecse223.block.model.Block223;
import ca.mcgill.ecse223.block.model.Admin;
import ca.mcgill.ecse223.block.model.Ball;
import ca.mcgill.ecse223.block.model.Block;
import ca.mcgill.ecse223.block.model.BlockAssignment;
import ca.mcgill.ecse223.block.model.Game;
import ca.mcgill.ecse223.block.model.Level;
import ca.mcgill.ecse223.block.model.Paddle;
import ca.mcgill.ecse223.block.model.Player;
import ca.mcgill.ecse223.block.model.User;
import ca.mcgill.ecse223.block.model.UserRole;
import ca.mcgill.ecse223.block.controller.InvalidInputException;
import ca.mcgill.ecse223.block.controller.TOGridCell;
import ca.mcgill.ecse223.block.controller.TOBlock;
import ca.mcgill.ecse223.block.controller.TOGame;
import ca.mcgill.ecse223.block.controller.TOUserMode;

public class Block223Application {
	
	private static Block223 block223;
	private static Game currentGame;
	private static UserRole currentUserRole;
	
	public static void main(String[] args) {
		
		// start UI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Block223Page().setVisible(true);
            }
        });
	}

	public static Block223 getBlock223() {
	}
	
	public static Block223 resetBlock223() {
	}
	
	public static UserRole getCurrentUserRole() {
		return currentUserRole;
	}
	
	public static void setCurrentUserRole(UserRole aUserRole) {
		currentUserRole = aUserRole;
	}
	
	public static Game getCurrentGame() {
		return currentGame;
	}
	
	public static void setCurrentGame(Game aGame) {
		currentGame = aGame;
	}
	
}
