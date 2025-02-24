# import sys
# print(sys.version)

# import random
# print(random.randrange(1, 10))

# # Remove Whitespace
# a = " Hello, World! "
# print(a.strip()) # returns "Hello, World!"

# a = "Hello, World!"
# print(a.replace("H", "J"))
# print(a)

# a = "Hello, World!"
# print(a.split(",")) # returns ['Hello', ' World!']

# thislist = ["apple", "banana", "cherry"]
# print(thislist)
# thislist.clear()
# print(thislist)
# del thislist
# print(thislist)

# thislist = ["apple", "banana", "cherry"]
# [print(x) for x in thislist]

# newlist = [x if x != "banana" else "orange" for x in thislist]
# print(newlist)
# thislist.sort(reverse = True)
# print(thislist)

# Sort the list based on how close the number is to 50:
# def myfunc(n):
#   return abs(n - 50)
#
# thislist = [100, 50, 65, 82, 23]
# thislist.sort(key = myfunc)
# print(thislist)

# thislist = ["banana", "Orange", "Kiwi", "cherry"]
# thislist.sort()
# print(thislist)

# Perform a case-insensitive sort of the list:
# thislist = ["banana", "Orange", "Kiwi", "cherry"]
# thislist.sort(key = str.lower)
# print(thislist)

# You cannot copy a list simply by typing list2 = list1, because: list2 will only be a reference to list1, and
# changes made in list1 will automatically also be made in list2.
# thislist = ["apple", "banana", "cherry"]
# mylist = thislist.copy()
# print(mylist)
# mylist = list(thislist)
# print(mylist)
# mylist = thislist[:]
# print(mylist)

# One item tuple, remember the comma:
# thistuple = ("apple",)
# print(type(thistuple))
#
#NOT a tuple
# thistuple = ("apple")
# print(type(thistuple))

# Add tuple to a tuple. You are allowed to add tuples to tuples, so if you want to add one item, (or many),
# create a new tuple with the item(s), and add it to the existing tuple:
# thistuple = ("apple", "banana", "cherry")
# y = ("orange",)
# thistuple += y
# print(thistuple)

# thistuple = ("apple", "banana", "cherry")
# del thistuple
# print(thistuple) #this will raise an error because the tuple no longer exists

# Packing a tuple:
# fruits = ("apple", "banana", "cherry")
#
# # Unpacking a tuple:
# (green, yellow, red) = fruits
#
# print(green)
# print(yellow)
# print(red)

# fruits = ("apple", "banana", "cherry", "strawberry", "raspberry")
#
# (green, yellow, *red) = fruits
#
# print(green)
# print(yellow)
# print(red)

# True and 1 is considered the same value, False and 0 is considered the same value:
# thisset = {"apple", "banana", "cherry", False, True, 0, 1}
# print(thisset)

# Add elements from tropical into thisset:
# thisset = {"apple", "banana", "cherry"}
# tropical = {"pineapple", "mango", "papaya"}
# thisset.update(tropical)
# print(thisset)
#
# mylist = ["kiwi", "orange"]
# thisset.update(mylist)
# print(thisset)

# thisset = {"apple", "banana", "cherry"}
# thisset.remove("banana")
# print(thisset)
# thisset.discard("banana") #does not raise error if not present
# print(thisset)
# thisset.remove("banana")
# print(thisset)
# thisset.pop()
# print(thisset)

# thisset = {"apple", "banana", "cherry"}
# thisset.clear()
# print(thisset)
#
# del thisset
# print(thisset)

# join two sets
# set1 = {"a", "b", "c"}
# set2 = {1, 2, 3}
# set3 = set1.union(set2)
# print(set3)

#  join two sets
# set1 = {"a", "b", "c"}
# set2 = {1, 2, 3}
# set3 = set1 | set2
# print(set3)

# Join multiple sets with the union() method:
# set1 = {"a", "b", "c"}
# set2 = {1, 2, 3}
# set3 = {"John", "Elena"}
# set4 = {"apple", "bananas", "cherry"}
# myset = set1.union(set2, set3, set4)
# print(myset)

# set1 = {"a", "b", "c"}
# set2 = {1, 2, 3}
# set3 = {"John", "Elena"}
# set4 = {"apple", "bananas", "cherry"}
# myset = set1 | set2 | set3 |set4
# print(myset)

# join set with tuple
# Note: The  | operator only allows you to join sets with sets, and not with other data types like you can
# with the  union() method.
# x = {"a", "b", "c"}
# y = (1, 2, 3)
# z = x.union(y)
# print(z)

# The update() method inserts the items in set2 into set1:
# The update() changes the original set, and does not return a new set.
# set1 = {"a", "b" , "c"}
# set2 = {1, 2, 3}
# set1.update(set2)
# print(set1)

# The intersection() method will return a new set, that only contains the items that are present in both sets.
# set1 = {"apple", "banana", "cherry"}
# set2 = {"google", "microsoft", "apple"}
# set3 = set1.intersection(set2)
# print(set3)

# You can use the & operator instead of the intersection() method, and you will get the same result.
# The & operator only allows you to join sets with sets, and not with other data types like you can with the
# intersection() method.
# set1 = {"apple", "banana", "cherry"}
# set2 = {"google", "microsoft", "apple"}
# set3 = set1 & set2
# print(set3)

# but intersection_update will change the original set instead of returning a new set.
# set1 = {"apple", "banana", "cherry"}
# set2 = {"google", "microsoft", "apple"}
# set1.intersection_update(set2)
# print(set1)

# The difference() method will return a new set that will contain only the items from the first set that are
# not present in the other set.
# set1 = {"apple", "banana", "cherry"}
# set2 = {"google", "microsoft", "apple"}
# set3 = set1.difference(set2)
# print(set3)

# You can use the - operator instead of the difference() method, and you will get the same result.
# The - operator only allows you to join sets with sets, and not with other data types like you can with
# the difference() method.
# set1 = {"apple", "banana", "cherry"}
# set2 = {"google", "microsoft", "apple"}
# set3 = set1 - set2
# print(set3)

# The difference_update() method will also keep the items from the first set that are not in the other set, but
# it will change the original set instead of returning a new set.
# set1 = {"apple", "banana", "cherry"}
# set2 = {"google", "microsoft", "apple"}
# set1.difference_update(set2)
# print(set1)

# Keep the items that are not present in both sets:
# set1 = {"apple", "banana", "cherry"}
# set2 = {"google", "microsoft", "apple"}
# set3 = set1.symmetric_difference(set2)
# print(set3)

# You can use the ^ operator instead of the symmetric_difference() method, and you will get the same result.
# The ^ operator only allows you to join sets with sets, and not with other data types like you can with the
# symmetric_difference() method.
# set1 = {"apple", "banana", "cherry"}
# set2 = {"google", "microsoft", "apple"}
# set3 = set1 ^ set2
# print(set3)

# The symmetric_difference_update() method will also keep all but the duplicates, but it will change the original set instead of returning a new set.
# set1 = {"apple", "banana", "cherry"}
# set2 = {"google", "microsoft", "apple"}
# set1.symmetric_difference_update(set2)
# print(set1)

# thisdict = dict(name = "John", age = 36, country = "Norway", gender = "male")
#
# for x, y in thisdict.items():
#   print(x, y)
#
# mydict = thisdict.copy()
# print(mydict)
#
# mydict = dict(thisdict)
# print(mydict)
#
# print(thisdict)
# print(thisdict.get("name"))
# print(thisdict["name"])
#
# x = thisdict.keys()
# print(x)
#
# y = thisdict.values()
# print(y)

# The items() method will return each item in a dictionary, as tuples in a list.
# z = thisdict.items()
# print(z)
#
# thisdict.update({"year": 2020})
# print(thisdict)
#
# thisdict.pop("year")
# print(thisdict)
#
# del thisdict["gender"]
# print(thisdict)

# popitem remove last inserted item
# thisdict.popitem()
# print(thisdict)
#
# thisdict.clear()
# print(thisdict)
#
# del thisdict
# print(thisdict)

# a = 330
# b = 330
# print("A") if a > b else print("=") if a == b else print("B")

# def my_function(child3, child2, child1):
#   print("The youngest child is " + child3)
#
# my_function(child1 = "Emil", child2 = "Tobias", child3 = "Linus")

# def my_function(**kid):
#   print("His last name is " + kid["lname"])
#
# my_function(fname = "Tobias", lname = "Refsnes")

# To specify that a function can have only positional arguments, add , / after the arguments:
# def my_function(x, /):
#   print(x)
# my_function(3)

# Without the , / you are actually allowed to use keyword arguments even if the function expects positional arguments:
# def my_function(x):
#   print(x)
# my_function(x = 3)

# To specify that a function can have only keyword arguments, add *, before the arguments:
# def my_function(*, x):
#   print(x)
# my_function(x = 3)

# You can combine the two argument types in the same function.
# Any argument before the / , are positional-only, and any argument after the *, are keyword-only.
# def my_function(a, b, /, *, c, d):
#   print(a + b + c + d)
# my_function(5, 6, c = 7, d = 8)

# anonymous function
# x = lambda a, b : a * b
# print(x(5, 6))

# def myfunc(n):
#   return lambda a : a * n
# mydoubler = myfunc(2)
# print(mydoubler(11))

# class
# the __str__() function controls what should be returned when the class object is represented as a string.
# If the __str__() function is not set, the string representation of the object is returned:

# The string representation of an object WITHOUT the __str__() function:
# class Person:
#   def __init__(self, name, age):
#     self.name = name
#     self.age = age
# p1 = Person("John", 36)
# print(p1)

# The string representation of an object WITH the __str__() function:
# class Person:
#   def __init__(self, name, age):
#     self.name = name
#     self.age = age
#
#   def __str__(self):
#     return f"{self.name}({self.age})"
#
# p1 = Person("John", 36)
# print(p1)

# Iterator vs Iterable
# Lists, tuples, dictionaries, and sets are all iterable objects. They are iterable containers which you can get an
# iterator from.
# All these objects have a iter() method which is used to get an iterator:

# Return an iterator from a tuple, and print each value:
# mytuple = ("apple", "banana", "cherry")
# myit = iter(mytuple)
# print(next(myit))
# print(next(myit))
# print(next(myit))

# Strings are also iterable objects, containing a sequence of characters:
# mystr = "banana"
# myit = iter(mystr)
# print(next(myit))
# print(next(myit))
# print(next(myit))
# print(next(myit))
# print(next(myit))
# print(next(myit))

# the for loop actually creates an iterator object and executes the next() method for each loop.

# A variable created in the main body of the Python code is a global variable and belongs to the global scope.
# A variable created outside of a function is global and can be used by anyone:
# x = 300
# def myfunc():
#   print(x)
# myfunc()
# print(x)

# If you operate with the same variable name inside and outside of a function, Python will treat them as two separate
# variables, one available in the global scope (outside the function) and one available in the local scope
# (inside the function):

# The function will print the local x, and then the code will print the global x:
# x = 300
# def myfunc():
#   x = 200
#   print(x)
# myfunc()
# print(x)

# If you use the global keyword, the variable belongs to the global scope:
# def myfunc():
#   global x
#   x = 300
# myfunc()
# print(x)

# The nonlocal keyword is used to work with variables inside nested functions.
# The nonlocal keyword makes the variable belong to the outer function.

# If you use the nonlocal keyword, the variable will belong to the outer function:
# def myfunc1():
#   x = "Jane"
#   def myfunc2():
#     nonlocal x
#     x = "hello"
#   myfunc2()
#   return x
# print(myfunc1())

# import mymodule
# mymodule.greet()
# print(dir(mymodule))
#
# import platform
# x = platform.system()
# print(x)
#
# from mymodule import person1
# print (person1["age"])

# datetime
# import datetime
# x = datetime.datetime.now()
# print(x)
# print(x.year)
# print(x.strftime("%A"))
#
# x = datetime.datetime(2020, 5, 17)
# print(x)
#
# # The datetime object has a method for formatting date objects into readable strings.
# print(x.strftime("%B"))

# x = min(5, 10, 25)
# y = max(5, 10, 25)
# print(x)
# print(y)
#
# x = abs(-7.25)
# print(x)
#
# x = pow(4, 3)
# print(x)
#
# import math
# x = math.sqrt(64)
# print(x)
#
# x = math.ceil(1.4)
# y = math.floor(1.4)
# print(x,y)
#
# x = math.pi
# print(x)

# Convert from JSON to Python:
# import json
# # some JSON:
# x =  '{ "name":"John", "age":30, "city":"New York"}'
# # parse x:
# y = json.loads(x)
# # the result is a Python dictionary:
# print(y["age"])

# Convert from Python to JSON:
# import json
# # a Python object (dict):
# x = {
#   "name": "John",
#   "age": 30,
#   "city": "New York"
# }
# # convert into JSON:
# y = json.dumps(x)
# # the result is a JSON string:
# print(y)
# print(type(y))

# Convert Python objects into JSON strings, and print the values:
# import json
# print(json.dumps({"name": "John", "age": 30}))
# print(json.dumps(["apple", "bananas"]))
# print(json.dumps(("apple", "bananas")))
# print(json.dumps("hello"))
# print(json.dumps(42))
# print(json.dumps(31.76))
# print(json.dumps(True))
# print(json.dumps(False))
# print(json.dumps(None))

# import json
# x = {
#   "name": "John",
#   "age": 30,
#   "married": True,
#   "divorced": False,
#   "children": ("Ann","Billy"),
#   "pets": None,
#   "cars": [
#     {"model": "BMW 230", "mpg": 27.5},
#     {"model": "Ford Edge", "mpg": 24.1}
#   ]
# }
# print(json.dumps(x))
# print(json.dumps(x, indent=4))  #format json string
# print(json.dumps(x, indent=4, separators=(". ", " = "))) #Use the separators parameter to change the default separator:
# print(json.dumps(x, indent=4, sort_keys=True))

# regex
# earch the string to see if it starts with "The" and ends with "Spain":
# import re
# txt = "The rain in Spain"
# x = re.search("^The.*Spain$", txt)
# print(x)
#
# txt = "The rain in Spain"
# x = re.findall("ai", txt)
# print(x)
#
# txt = "The rain in Spain"
# x = re.findall("Portugal", txt)
# print(x)
#
# txt = "The rain in Spain"
# x = re.search("\s", txt)
# print("The first white-space character is located in position:", x.start())
#
# txt = "The rain in Spain"
# x = re.search("Portugal", txt)
# print(x)
#
# txt = "The rain in Spain"
# x = re.split("\s", txt)
# print(x)
#
# txt = "The rain in Spain"
# x = re.split("\s", txt, 1)  #Split the string only at the first occurrence:
# print(x)
#
# txt = "The rain in Spain"
# x = re.sub("\s", "9", txt) #Replace every white-space character with the number 9:
# print(x)
#
# txt = "The rain in Spain"
# x = re.sub("\s", "9", txt, 2) #Replace the first 2 occurrences:
# print(x)
#
# txt = "The rain in Spain"
# x = re.search("ai", txt) #Do a search that will return a Match Object:
# print(x) #this will print an object
#
# # The regular expression looks for any words that starts with an upper case "S":
# txt = "The rain in Spain"
# x = re.search(r"\bS\w+", txt)
# print(x.span())
#
# # Print the string passed into the function:
# txt = "The rain in Spain"
# x = re.search(r"\bS\w+", txt)
# print(x.string)
#
# # Print the part of the string where there was a match.
# txt = "The rain in Spain"
# x = re.search(r"\bS\w+", txt)
# print(x.group())

# A package contains all the files you need for a module.
# Modules are Python code libraries you can include in your project.

# exception handling
# try:
#   print(x)
# except:
#   print("An exception occurred")

# x = -1
# if x < 0:
#   raise Exception("Sorry, no numbers below zero")

# Raise a TypeError if x is not an integer:
# x = "hello"
# if not type(x) is int:
#   raise TypeError("Only integers are allowed")

# decorators
# A decorator is a function that takes another function as an argument, adds some functionality, and returns the
# modified function.
# def my_decorator(func):
#     def wrapper():
#         print("Something before the function runs")
#         func()
#         print("Something after the function runs")
#     return wrapper
#
# @my_decorator  # Applying decorator
# def say_hello():
#     print("Hello!")
# say_hello()
# Here, @my_decorator is syntactic sugar for say_hello = my_decorator(say_hello).

# Decorators with Arguments
# If the function takes arguments, we need to modify the wrapper function to accept *args and **kwargs.
# def my_decorator(func):
#     def wrapper(*args, **kwargs):
#         print("Before function call")
#         result = func(*args, **kwargs)
#         print("After function call")
#         return result
#     return wrapper
#
# @my_decorator
# def add(a, b):
#     return a + b
#
# print(add(5, 3))

 # Multiple Decorators
# You can apply multiple decorators to a single function.
# def uppercase_decorator(func):
#     def wrapper():
#         return func().upper()
#     return wrapper
#
# def exclamation_decorator(func):
#     def wrapper():
#         return func() + "!!!"
#     return wrapper
#
# @uppercase_decorator
# @exclamation_decorator
# def greet():
#     return "hello"
#
# print(greet())

# Class-Based Decorators
# You can also create decorators using classes by defining the __call__ method.
# class MyDecorator:
#     def __init__(self, func):
#         self.func = func
#
#     def __call__(self, *args, **kwargs):
#         print("Before function call")
#         result = self.func(*args, **kwargs)
#         print("After function call")
#         return result
#
# @MyDecorator
# def greet(name):
#     print(f"Hello, {name}")
#
# greet("Sonali")

# inbuilt decorators
# 1. @staticmethod
# Used inside a class to define a method that does not require self or cls.
# class MyClass:
#     @staticmethod
#     def greet():
#         print("Hello from static method!")
# MyClass.greet()  # No need to create an instance

# 2. @classmethod
# Used when a method needs access to the class (cls) but not the instance (self).
# class MyClass:
#     count = 0  # Class variable
#
#     @classmethod
#     def increment_count(cls):
#         cls.count += 1
#         print(f"Count: {cls.count}")
#
# MyClass.increment_count()
# MyClass.increment_count()

# 3. @property
# Used to define a getter for a class attribute, allowing it to be accessed like an attribute instead of a method.
# class Person:
#     def __init__(self, name):
#         self._name = name  # Private variable
#
#     @property
#     def name(self):
#         return self._name  # Acts like an attribute
#
# p = Person("Sonali")
# print(p.name)  # Access without parentheses
#
# # 4. @name.setter
# # Used to create a setter for a property, allowing controlled modification of a private variable.
#
# class Person:
#     def __init__(self, name):
#         self._name = name
#
#     @property
#     def name(self):
#         return self._name
#
#     @name.setter
#     def name(self, new_name):
#         if len(new_name) < 3:
#             print("Name is too short!")
#         else:
#             self._name = new_name
#
# p = Person("Sonali")
# p.name = "Si"   # Too short
# p.name = "Sia"  # Valid
# print(p.name)

