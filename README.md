Main:
textEditor.write("Ishank is a developer")
TextEditor:
content = "Ishank is a developer"
↓
saveState(textEditor)
↓
textEditor.save()
↓
new EditorMemento("Ishank is a developer")
↓
stored in Stack
Top
↓
[ EditorMemento ]
content → "Ishank is a developer"

[ EditorMemento ]
content → "Ishank"