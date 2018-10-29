/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.sql.SQLException;

import model.UserBean;

/**
*
* @author Julen
*/

public interface IData {
	
	public void userSignUp(UserBean user) throws UserLoginExistException, SQLException;

	public void userLogin(UserBean user) throws UserNotExistException, SQLException;

}
