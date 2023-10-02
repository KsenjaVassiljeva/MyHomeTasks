/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import tasks.creatbooksarray.Author;
import tasks.creatbooksarray.Book;

/**
 *
 * @author admin
 */
public class CreatBookArray  {

    public void doCreatrArrau() {
        Book book = new Book();
        Author levTolstoy = new Author("Tolstoy","Lew");
        Author[] authorVoinaIMir=new Author [1];
        authorVoinaIMir[0] = levTolstoy;
        
        Author IvanTurgenev = new Author("Turgenev","Ivan");
        Author[] authorOtsiIDeti=new Author [1];
        authorOtsiIDeti[0] = IvanTurgenev;
        
        Author FedorDostayevskiy = new Author("Dostayevskiy","Fedor");
        Author[] authorPristupleniyeIInakazania=new Author [1];
        authorPristupleniyeIInakazania[0] = FedorDostayevskiy;
        
        Author EvgeniyPetrov = new Author("Petor","Evgeniy");
        Author[] author12stulyev=new Author [1];
        author12Stulye1[0] = EvgeniyPetrov;
        
        Author IvanArnold = new Author("Arnold","Ivan");
        Author[] author12Stulyev=new Author [1];
        author12Stulyev[0] = EvgeniyPetrov;
        
        Book[] books = new Book[5];
        books[0]=new Book("Voina i mir",2020,authorVoinaIMir);
        books[1]=new Book("Otsi i deti",2021,authorOtsiIDeti);
        books[2]=new Book("Pristupleni i nakazania",2022,authorPristupleniyeIInakazania);
        books[3]=new Book("12 stulyev",2022,author12Stulyev1,author12Stulyev);
        books[4]=new Book("Voina i mir",2020,authorVoinaIMir);
    }
    
}
