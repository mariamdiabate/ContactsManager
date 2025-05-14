
    class Contact {
        String name;
        String phoneNumber;

        // Constructeur pour créer un contact
        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

    class ContactsManager {
        // Liste des contacts
        Contact[] myContacts;
        int contactCount;

        // Constructeur par défaut
        public ContactsManager() {
            myContacts = new Contact[50]; // Capacité maximale : 50 contacts
            contactCount = 0;            // Aucun contact au départ
        }

        // Méthode pour ajouter un contact
        public void addContact(Contact contact) {
            if (contactCount < myContacts.length) {
                myContacts[contactCount] = contact;
                contactCount++;
                System.out.println("Contact ajouté : " + contact.name);
            } else {
                System.out.println("Gestionnaire de contacts plein !");
            }
        }

        // Méthode pour rechercher un contact par son nom
        public String searchContact(String name) {
            for (int i = 0; i < contactCount; i++) {
                if (myContacts[i].name.equalsIgnoreCase(name)) {
                    return myContacts[i].phoneNumber; // Retourne le numéro si trouvé
                }
            }
            return null; // Si le contact n'est pas trouvé
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Création du gestionnaire de contacts
            ContactsManager myContactsManager = new ContactsManager();

            // Création et ajout de contacts
            Contact friend1 = new Contact("Ami", "077-689-5564");
            myContactsManager.addContact(friend1);

            Contact friend2 = new Contact("Brou", "077-689-5568");
            myContactsManager.addContact(friend2);

            Contact friend3 = new Contact("Clarisse", "077-689-5565");
            myContactsManager.addContact(friend3);

            Contact friend4 = new Contact("Danie", "077-689-5562");
            myContactsManager.addContact(friend4);

            Contact friend5 = new Contact("Grace", "077-689-5561");
            myContactsManager.addContact(friend5);

            // Recherche d'un contact
            String searchName = "Clarisse";
            String phoneNumber = myContactsManager.searchContact(searchName);

            // Affichage du résultat de la recherche
            if (phoneNumber != null) {
                System.out.println("Numéro de téléphone de " + searchName + " : " + phoneNumber);
            } else {
                System.out.println("Contact " + searchName + " introuvable !");
            }
        }
    }


