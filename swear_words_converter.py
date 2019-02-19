bad_words = ['bobo', 'tanga', 'gago', 'putanginamo', 'pakyuka', 'kinginamoka', 'hayupka', 'ulol', 'tarantado', 'bobomo', 'shit', 'motherfuckers', ' pistingyawa', 'tangina', 'pakyu',]

sentence = input('Enter your sentence: ')


new = [x for x in sentence.lower().split()]

text = ''
for word in new:
    if word in bad_words:

        a = len(word)

        text += '*' * a + ' '

    else:
        text += word + ' '

print(text)
