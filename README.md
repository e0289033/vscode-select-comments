# Select Comments

Expand the current selection until it hits a whitespace boundary (port of `expand_selection_to_paragraph` from Sublime Text). If you have this text:

```
    line 1

    //line 2
    //line 3| <= cursor here
    //line 4

    line 5
```

After running Select Comments, the selection will hold lines 2 through 4.

## Extension Settings

This extension contributes the command `select-comments.selectComments` and the keybinding `Ctrl+Alt+P`.

