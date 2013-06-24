import pygame
from pygame.locals import *
import sys, os
import random

pygame.init()
pantalla = pygame.display.set_mode((800,600))
pygame.display.set_caption("100 circulos")

repeticion=0
while repeticion < 100:
	color = (random.randrange(0,255),random.randrange(0,255),random.randrange(0,255))
	posicion = (random.randrange(0,800),random.randrange(0,600))
	pygame.draw.circle(pantalla, color, posicion, 30)
	pygame.display.update()
		
	repeticion=repeticion+1


while True:
	events=pygame.event.get()
	for event in events:
		if event.type==QUIT:
			pygame.quit()
			sys.exit()
