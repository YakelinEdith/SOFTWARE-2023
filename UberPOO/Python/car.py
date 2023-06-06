from account import Account

class Car:
    license= str
    passanger = int
    driver= Account(str,str,str,str)


    def __init__(self, license, driver):
        self.license = license
        self.driver = driver