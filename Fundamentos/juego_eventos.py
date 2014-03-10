import pygame
from pygame.locals import *
import sys, os
import random

pygame.init()
ancho=800
alto=600
ventana = pygame.display.set_mode((ancho,alto))
pygame.display.set_caption("juego")
pantalla_base=ventana.copy()
imagen=pygame.image.load('pacman_blinky.gif')

y=300
x=0
#for x in range(0, ancho):
#	ventana.blit(imagen,(x,y))
#	pygame.display.update()


while True:
	ventana.blit(imagen,(x,y))
	pygame.display.update()

	#coloco la imagen en la ventana
	events=pygame.event.get()
	for event in events:
		if event.type==QUIT:
			pygame.quit()
			sys.exit()
		elif event.type==KEYDOWN:
			if event.key == K_RIGHT:
				while x<=ancho-50:
					x=x+1
					ventana.blit(imagen,(x,y))
					pygame.display.update()
			elif event.key== K_LEFT:
				while x>=0:
					x=x-1
					ventana.blit(imagen,(x,y))
					pygame.display.update()
