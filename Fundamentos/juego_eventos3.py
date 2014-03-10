import pygame
from pygame.locals import *
import sys, os
import random

pygame.init()
ancho=800
alto=600
ventana = pygame.display.set_mode((ancho,alto))
pygame.display.set_caption("juego")

mario=pygame.image.load('mario-bros-8bit.png')
mario_chico=pygame.transform.scale(mario, (50,50))

pacman=pygame.image.load('pacman_blinky.gif')
pacman_chico=pygame.transform.scale(pacman, (50,50))
lista=[pacman_chico, mario_chico]

ventana.blit(pacman_chico,(ancho/2,alto-50))
pantalla_base=ventana.copy()

font = pygame.font.SysFont('Arial', 70)
mensaje = font.render("", True, pygame.Color("white"),(255,0,0));

pygame.display.update()

x=0
y=0
while True:
	#coloco la imagen en la ventana
	ventana.blit(mario_chico,(x,y))
	ventana.blit(mensaje,(ancho/2,alto/2))
	pygame.display.update()
	ventana.blit(pantalla_base,(0,0))
	#analizo los eventos
	events=pygame.event.get()
	for event in events:
		#me fijo si es cierre de ventana
		if event.type==QUIT:
			pygame.quit()
			sys.exit()

		#analizo si es tecla	
		elif event.type==KEYDOWN:
			#me fijo si la tecla es derecha
			if event.key == K_RIGHT:
				if x+10 <= ancho:
					x=x+10
			elif event.key == K_LEFT:
				if x-10 >= 0:
					x=x-10
					#mario_chico.get_rect().move(x-10,y)
			elif event.key == K_DOWN:
				for y in range(y,501,10):
					ventana.blit(mario_chico,(x,y))
					pygame.display.update()
					ventana.blit(pantalla_base,(0,0))
				if x>=390 and x<=410:
					mensaje = font.render("ganaste", True, pygame.Color("white"),(255,0,0));
				else:
					mensaje = font.render("perdiste", True, pygame.Color("white"),(255,0,0));
				

