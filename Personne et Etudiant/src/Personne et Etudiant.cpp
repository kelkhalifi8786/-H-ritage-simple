#include <iostream>
#include <string>
using namespace std;

class Personne {
protected:
    string nom;
    int age;

public:
    Personne(const string& n, int a) : nom(n), age(a) {}

    void afficher() const {
        cout << "Nom : " << nom << ", Âge : " << age << endl;
    }
};

class Etudiant : public Personne {
private:
    string niveau;

public:
    Etudiant(const string& n, int a, const string& niv) : Personne(n, a), niveau(niv) {}

    void afficher() const {
        Personne::afficher();
        cout << "Niveau : " << niveau << endl;
    }
};

int main() {
    Etudiant e("Sara", 20, "Licence 2");
    e.afficher();
}
