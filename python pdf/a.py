keys = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
xored = "7ecc19e1a0be36ba2c6f05d06b5d3058"


def decrypt(key):
    ans = ""
    for i in xored.decode("hex"):
        tmp = ord(i) ^ ord(key)
        ans += chr(tmp)
    print "Using key [ %s ] : %s"%(key,ans)

fbyte = xored.decode("hex")[0]

for key in keys:
    tmp = ord(fbyte) ^ ord(key)
    if chr(tmp) == "F":
        decrypt(key)