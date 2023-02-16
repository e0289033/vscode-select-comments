const vscode = require('vscode');

function activate(context) {
  const selectParagraph = vscode.commands.registerCommand('select-paragraph.selectParagraph', function () {
    const editor = vscode.window.activeTextEditor;
    let startLine = editor.selection.start.line;
    let endLine = editor.selection.end.line;

    // function isComment(text){
    //   let iscomment;
    //   if(text.search("//") == -1  || text.search("/**") == -1 || text.search("*") == -1 || text.search("*/") == -1)
    //     iscomment = false;
    //   else
    //     iscomment = true;
      
    //   return iscomment;
    // }

    // Function to check if the given
// string is a comment or not
function isComment( line)
{
 
 
    // If two continuous slashes
    // precedes the comment
    let regex = new RegExp("//.*", );
    let rex = regex.test(line);

    let regexMul = new RegExp("/\\*.*?\\*/", );
    let rexmul = regexMul.test(line);

    let isCom;
    if(rex){
      isCom = true;
    }else if (rexmul)
    {
      isCom = true;
    }else
      isCom = false;

    return isCom;
}

    while (startLine > 0 && !editor.document.lineAt(startLine - 1).isEmptyOrWhitespace && isComment(editor.document.lineAt(startLine - 1).text)) {
      startLine -= 1;
    }

    while (endLine < editor.document.lineCount + 1 && !editor.document.lineAt(endLine + 1).isEmptyOrWhitespace && isComment(editor.document.lineAt(startLine + 1).text)) {
      endLine += 1;
    }


    // const startCharacter = editor.document.lineAt(startLine).firstNonWhitespaceCharacterIndex;
    const startCharacter = 0;
    const endCharacter = editor.document.lineAt(endLine).text.length;

    editor.selection = new vscode.Selection(startLine, startCharacter, endLine, endCharacter);
  });

  context.subscriptions.push(selectParagraph);
}
exports.activate = activate;

function deactivate() {
}
exports.deactivate = deactivate;
