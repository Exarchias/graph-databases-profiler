public class Orientdbcrud {

    //CREATE operation on OrientDB. It returns to indicate that is has complete its cycle.
    static boolean create(){
        if(Dataholder.databases_allowed){
            if(Dataholder.orientdb_script_test){
                //run the database
                System.out.println("(DB) Creating a node on OrientDB");
                return true;
            } else {
                //print a statement
                System.out.println("Creating a node on OrientDB");
                return true;
            }
        } else {
            //print a statement
            System.out.println("Creating a node on OrientDB");
            return true;
        }
    }

    //UPDATE operation on OrientDB. It returns to indicate that is has complete its cycle.
    static boolean update(){
        if(Dataholder.databases_allowed){
            if(Dataholder.orientdb_script_test){
                //run the database
                System.out.println("(DB) Updating a node on OrientDB");
                return true;
            } else {
                //print a statement
                System.out.println("Updating a node on OrientDB");
                return true;
            }
        } else {
            //print a statement
            System.out.println("Updating a node on OrientDB");
            return true;
        }
    }

    //DELETE operation on OrientDB. It returns to indicate that is has complete its cycle.
    static boolean delete(){
        if(Dataholder.databases_allowed){
            if(Dataholder.orientdb_script_test){
                //run the database
                System.out.println("(DB) Deleting a node on OrientDB");
                return true;
            } else {
                //print a statement
                System.out.println("Deleting a node on OrientDB");
                return true;
            }
        } else {
            //print a statement
            System.out.println("Deleting a node on OrientDB");
            return true;
        }
    }
}
