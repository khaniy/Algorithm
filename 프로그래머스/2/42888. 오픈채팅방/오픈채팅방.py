class Entrance:
    idx: str
    method: str
    
    def __init__(self,idx,method):
        self.idx = idx
        self.method = method


def solution(record):
    change_log = {}
    entrance_log = []
    for r in record:
        a = r.split(" ")
        method = a[0]
        idx = a[1]
        
        if method != "Leave":
            name = a[2]
            change_log[idx] = name
            
    
        entrance_log.append(Entrance(idx, method))
            
    answer = []
    
    for entrance in entrance_log:
        
        if entrance.method == "Leave":
            name = change_log.get(entrance.idx)
            answer.append(f"{name}님이 나갔습니다.")
        if entrance.method == "Enter":
            name = change_log.get(entrance.idx)
            answer.append(f"{name}님이 들어왔습니다.")
    return answer