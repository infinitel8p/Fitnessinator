import os
import json

# clear terminal
os.system("cls")

# print headline
print("Wilkommen zum Fitnessinator\n")


def menu():
    # show menu
    menu = input("""Menü:

1 = Mein Trainingsplan
2 = Neuer Eintrag
3 = Eintrag löschen
4 = Beenden

Bitte wähle eine Zahl
""")

    if menu == "1":
        mein_trainingsplan()
    elif menu == "2":
        neuer_eintrag()
    elif menu == "3":
        eintrag_löschen()
    elif menu == "4":
        exit()
    else:
        print("Eingabe nicht erkannt! Bitte wähle eine Zahl die im Menu vertreten ist.")
        menu()


def mein_trainingsplan():
    os.system("cls")
    cwd = os.getcwd()  # Get the current working directory (cwd)
    with open(f'{cwd}/tests/plan.json', 'r') as plan:
        data = json.load(plan)
        for i in data:
            print(f"{i}:")
            for j in data[i]:
                print(f"{j['Name']}, {j['Gewicht']}, {j['Reps']}")
            print("\n")


def neuer_eintrag():
    pass


def eintrag_löschen():
    pass


if __name__ == "__main__":
    menu()
