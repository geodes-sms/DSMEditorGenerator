import Tkinter as tk
import AToMPMPacMan01 as target
import threading
import time

import os
import psutil
import sys
import glob
import errno
import subprocess

from sccd.runtime.libs.ui import ui
from sccd.runtime.statecharts_core import Event
from sccd.runtime.tkinter_eventloop import *

process = psutil.Process(os.getpid())

if __name__ == '__main__':
	ui.window = tk.Tk()

controller = target.Controller(TkEventLoop(ui.window))

def run():
	controller.start()
thread = threading.Thread(target=run)
thread.daemon = True
thread.start()


def raw_inputter():
	path = '../AToMPM2/*.txt'   
	files = glob.glob(path)
	for name in files: # 'file' is a builtin type, 'name' is a less-ambiguous variable name.
		start = time.time()
		debut = process.memory_info().rss
		try:
			with open(name) as f: # No need to specify 'r': this is the default.
				for line in f:
					controller.addInput(Event(line.rstrip(), "ui", []))
					sleep(0.1)
		except IOError as exc:
			if exc.errno != errno.EISDIR: # Do not fail if a directory is found, just ignore it.
				raise # Propagate other kinds of IOError.
		fin = process.memory_info().rss
		end = time.time()
		measures = open("../Results/AToMPMPacMan01test.txt","w+")
		measures.write("          AToMPMPacMan01 \n")
		measures.write("time elapsed : %d\n" %(end-start))
		measures.write("memory used : %d\n" %(fin-debut))
		measures.close()
threadTest = threading.Thread(target=raw_inputter)
threadTest.daemon = True
threadTest.start()
ui.window.mainloop()