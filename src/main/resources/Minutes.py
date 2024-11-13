import os
from moviepy.editor import VideoFileClip
directory = "D:\programming\BackEnd\Spring"
size_in_sec = 0

if os.path.isdir(directory):
    contents = os.listdir(directory)
    string_orders = []
    index = 0
    orders_with_indecies = {}
    for content in contents:
        x = content[0:2].replace(".","")
        if str.isdigit(x):
            x = int(x)
            orders_with_indecies[x] = index
        index = index + 1  
    sorted_list = dict(sorted(orders_with_indecies.items()))
    new_contents = []
    for index in sorted_list.values():
        new_contents.append(contents[index])
    for content in new_contents[:10]:
        path = directory + os.path.sep + content
        print(path)
        if (os.path.isdir(path)):
            files = os.listdir(path)
            for file in files:
                file_path = path+os.path.sep+file
                if (os.path.isfile(file_path) and file[-3:] == "mp4"):
                    size = float(VideoFileClip(file_path).duration)
                    size_in_sec += size
                    print(str(size)+"\n")
    print("duration of the contents in seconds : "+ str(size_in_sec))
    print("duration of the contents in MINUTS : " + str(round(float(size_in_sec /float(60.0)),2)))
    print("duration of the contents in hours : " + str(round(float(size_in_sec / float(3600.0)),2)))
