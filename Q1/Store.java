package Homework6;

import Homework6.Products.*;
import Homework6.ProductsType.*;
import Homework6.Service.Constants;

public class Store {
    private Shoe[][] shoes;
    private TV[][] tvs;
    private GameConsole[][] gameConsoles;
    private Book[][] books;
    private Magazine[] magazines;

    public Store() {
        this.shoes = shoesList();
        this.books = bookList();
        this.tvs = tVList();
        this.gameConsoles = gameConsulList();
    }

    public Shoe[][] getShoes() {
        return shoes;
    }

    public TV[][] getTvs() {
        return tvs;
    }

    public GameConsole[][] getGameConsoles() {
        return gameConsoles;
    }

    public Book[][] getBooks() {
        return books;
    }

    public Shoe[][] shoesList() {

        Shoe shoe1 = new Shoe(ShoeBrand.NIKE, ShoeSex.MALE, ShoeType.SPORT, ShoeColor.BLACK, 41, 3100000);
        Shoe shoe2 = new Shoe(ShoeBrand.NIKE, ShoeSex.FEMALE, ShoeType.SPORT, ShoeColor.GRAY, 38, 991100);
        Shoe shoe3 = new Shoe(ShoeBrand.ADIDAS, ShoeSex.FEMALE, ShoeType.SPORT, ShoeColor.WHITE, 40, 179830);
        Shoe shoe4 = new Shoe(ShoeBrand.MOHAJER, ShoeSex.MALE, ShoeType.CLASSIC, ShoeColor.BLACK, 42, 115000);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < Constants.MAX_NUMBER_OF_AVAILABLE_SHOES; j++) {
                if (i == 0 && shoes[i][j] == null)
                    shoes[i][j] = shoe1;
                else if (i == 1 && shoes[i][j] == null)
                    shoes[i][j] = shoe2;
                else if (i == 2 && shoes[i][j] == null)
                    shoes[i][j] = shoe3;
                else
                    shoes[i][j] = shoe4;
            }
        }
        return shoes;
    }

    public TV[][] tVList() {

        TV tv1 = new TV(6750000, 32, "SAMSUNG", "UN32N5300AFXZA");
        TV tv2 = new TV(9150000, 43, "SAMSUNG", "43N5980");
        TV tv3 = new TV(14200000, 55, "SAMSUNG", "55TU700");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < Constants.MAX_NUMBER_OF_AVAILABLE_TV; j++) {
                if (i == 0 && tvs[i][j] == null)
                    tvs[i][j] = tv1;
                else if (i == 1 && tvs[i][j] == null)
                    tvs[i][j] = tv1;
                else
                    tvs[i][j] = tv1;
            }
        }
        return tvs;
    }

    public GameConsole[][] gameConsulList() {
        GameConsole gameConsole1 = new GameConsole(GameConsoleBrand.SONY, "PS5(StandardEdition)",
                "1TB", 20150000);
        GameConsole gameConsole2 = new GameConsole(GameConsoleBrand.SONY, "PS4(Slim)",
                "1TB", 11800000);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < Constants.MAX_NUMBER_OF_AVAILABLE_GAMECONSULE; j++) {
                if (i == 0 && gameConsoles[i][j] == null)
                    gameConsoles[i][j] = gameConsole1;
                else
                    gameConsoles[i][j] = gameConsole2;

            }
        }
        return gameConsoles;
    }

    public Book[][] bookList() {
        Book book1 = new Book("Sound of Wild", BooKType.NOVEL, 70000);
        Book book2 = new Book("handmaid's Tale", BooKType.NOVEL, 60000);
        Book book3 = new Book("Power and Liberty: Constitutionalism in the American Revolution",
                BooKType.HISTORY, 120000);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < Constants.MAX_NUMBER_OF_AVAILABLE_BOOKS; j++) {
                if (i == 0 && books[i][j] == null)
                    books[i][j] = book1;
                else if (i == 1 && books[i][j] == null)
                    books[i][j] = book2;
                else
                    books[i][j] = book3;
            }
        }
        return books;
    }


}


