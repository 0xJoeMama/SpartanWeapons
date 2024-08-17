import os

for fp in os.listdir(os.getcwd()):
    if '_' in fp:
        os.rename(fp, fp[fp.find("_") + 1:])
