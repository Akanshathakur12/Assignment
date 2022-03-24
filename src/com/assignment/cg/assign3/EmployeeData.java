package com.assignment.cg.assign3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeData {

	public static void main(String[] args) {
	
		try {
			//connecting to database
			Class.forName("org.postgresql.Driver");
			String url= "jdbc:postgresql://localhost:5432/Testdb";
			String username= "postgres";
			String password= "Akansha@Postgre";
			
			Connection con =DriverManager.getConnection(url, username, password);
			//checking if our connection is successful
			if(con!=null) {
			System.out.println("successfully connected::")	;
			}
			else {
				System.out.println("not successfully connected::")	;
			}
			//creating dynamic query
			PreparedStatement stmt=con.prepareStatement("insert into employeee values(?,?,?,?,?)");  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			  
			do{  
			System.out.println("enter employee no:");  
			String empno=br.readLine();  
			System.out.println("enter employee name:");  
			String empname=br.readLine();  
			System.out.println("enter salary:");  
			int salary=Integer.parseInt(br.readLine());  
			System.out.println("enter DESIGNATION:");  
			String designation=br.readLine();  
			System.out.println("enter DEPARTMENT:");  
			String department=br.readLine(); 
			
			stmt.setString(1,empno);  
			stmt.setString(2,empname);  
			stmt.setInt(3,salary);  
			stmt.setString(4,designation);  
			stmt.setString(5,department); 
			int i=stmt.executeUpdate();  
			System.out.println(i+" records affected");  
			  
			System.out.println("Do you want to continue: y/n");  
			String s=br.readLine();  
			if(s.startsWith("n")){  
				break;  
			}  
			}while(true);  
			PreparedStatement stmt1=con.prepareStatement("select * from employeee1 where designation='trainer' and department='cse'");  
			ResultSet rs=stmt1.executeQuery();  
			while(rs.next()){  
			System.out.println("no:"+rs.getString(1)+"  name "+rs.getString(2)+"salary "+rs.getInt(3)+" desig"+rs.getString(4)+"dep "+rs.getString(5));  
			  
			con.close();  
			
			}  
			
		}
		
		catch(Exception e)	{
			e.printStackTrace();
		}
		
	}
	}


