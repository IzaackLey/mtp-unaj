import pygame
from pygame.locals import *
import sys, os
import random

pygame.init()
ventana = pygame.display.set_mode((800,600))
pygame.display.set_caption("juego")
pantalla_base=ventana.copy()
imagen=pygame.image.load('pacman_blinky.gif')

x=0
y=300
while True:
	#coloco la imagen en la ventana
	ventana.blit(imagen,(x,y))
	pygame.display.update()
	#
	ventana.blit(ventana,(0,0))
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
				if x+10 <= 800:
					x=x+10
			elif event.key == K_LEFT:
				if x-10 >= 0:
					x=x-10
			elif event.key == K_UP:
				if y-10 >= 0:
					y=y-10
			elif event.key == K_DOWN:
				if y+10 < 600:
					y=y+10
					
