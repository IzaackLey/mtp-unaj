#Escriba un programa que lea letras del teclado y arme una palabra 
#con las letras mayusculas. El programa finaliza cuando se ingresa 
#un espacio

#letra=raw_input('ingrese letra: ')
#palabra=''
#while letra!=' ':
#    palabra=palabra+letra.upper()
#    letra=raw_input('ingrese letra: ')
#print palabra

def promedio(lista_numeros):
    suma=0
    for numero in lista_numeros:
        suma+=numero
    return float(suma)/len(lista_numeros)

lista_numero=[]
for i in range(5):
    numero=input('ingrese numero: ')
    lista_numero.append(numero)
print 'el promerio es: '+str(promedio(lista_numero))