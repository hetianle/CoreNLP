/* The following code was generated by JFlex 1.5.1 */

package edu.stanford.nlp.trees.international.pennchinese;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * A lexer for the Penn Chinese Treebank.  Supports Chinese characters.
 *
 * @author Roger Levy
 * @author Christopher Manning (fully redid to accept most stuff, add CTB 4-9 XML entities)
 */


class CHTBLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\7\1\2\1\6\1\6\1\5\22\0\1\7\7\0\1\4"+
    "\1\4\5\0\1\24\14\0\1\1\1\0\1\3\2\0\1\21\1\27"+
    "\1\12\1\10\1\16\3\0\1\20\3\0\1\22\1\17\1\11\1\15"+
    "\1\0\1\26\1\25\1\13\4\0\1\14\5\0\1\23\45\0\1\6"+
    "\u1fa2\0\1\6\1\6\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\1\2\2\1\1\1\0\4\1"+
    "\2\3\21\1\1\3\1\0\3\1\3\0\1\1\1\0"+
    "\1\3\1\0\1\1\1\0\4\1\4\0\5\1\5\0"+
    "\4\1\4\0\6\1\6\0\3\1\3\0\1\1\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[92];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\30\0\60\0\110\0\110\0\140\0\170\0\220"+
    "\0\250\0\300\0\330\0\360\0\u0108\0\30\0\110\0\u0120"+
    "\0\u0138\0\u0150\0\u0168\0\u0180\0\u0198\0\u01b0\0\u01c8\0\u01e0"+
    "\0\u01f8\0\u0210\0\u0228\0\u0240\0\u0258\0\u0270\0\u0288\0\u02a0"+
    "\0\u02b8\0\u02d0\0\u02e8\0\u0300\0\u0318\0\u0330\0\u0348\0\u0360"+
    "\0\u0378\0\u0390\0\u03a8\0\u03a8\0\u03c0\0\u03d8\0\u03f0\0\u0408"+
    "\0\u0420\0\u0438\0\u0450\0\u0468\0\u0480\0\u0498\0\u04b0\0\u04c8"+
    "\0\u04e0\0\u04f8\0\u0510\0\u0528\0\u0540\0\u0558\0\u0570\0\u0588"+
    "\0\u05a0\0\u05b8\0\u05d0\0\u05e8\0\u0600\0\u0618\0\u0630\0\u0648"+
    "\0\u0660\0\u0678\0\u0690\0\u06a8\0\u06c0\0\u06d8\0\u06f0\0\u0708"+
    "\0\u0720\0\u0738\0\u0750\0\u0768\0\u0780\0\u0798\0\u07b0\0\u07c8"+
    "\0\u07e0\0\u07f8\0\u0810\0\u0828";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[92];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\4\1\7"+
    "\22\2\1\0\1\2\4\0\20\2\2\10\1\0\1\2"+
    "\1\11\1\0\2\11\1\12\1\10\1\13\3\10\1\14"+
    "\6\10\1\15\2\10\32\0\1\4\34\0\1\7\20\0"+
    "\2\10\1\0\1\16\1\11\1\0\2\11\20\10\2\11"+
    "\1\0\1\17\1\11\1\0\22\11\2\10\1\0\1\16"+
    "\1\11\1\0\2\11\1\10\1\20\7\10\1\21\10\10"+
    "\1\0\1\16\1\11\1\0\2\11\3\10\1\22\16\10"+
    "\1\0\1\16\1\11\1\0\2\11\7\10\1\23\12\10"+
    "\1\0\1\16\1\11\1\0\2\11\16\10\1\24\3\10"+
    "\1\0\1\16\1\11\1\0\2\11\2\10\1\25\17\10"+
    "\1\0\1\16\1\11\1\0\2\11\3\10\1\26\16\10"+
    "\1\0\1\16\1\11\1\0\2\11\17\10\1\27\2\10"+
    "\1\0\1\16\1\11\1\0\2\11\1\30\21\10\1\0"+
    "\1\16\1\11\1\0\2\11\2\10\1\27\17\10\1\0"+
    "\1\16\1\11\1\0\2\11\3\10\1\31\3\10\1\32"+
    "\1\33\11\10\1\0\1\16\1\11\1\0\2\11\6\10"+
    "\1\34\13\10\1\0\1\16\1\11\1\0\2\11\10\10"+
    "\1\33\11\10\1\0\1\16\1\11\1\0\2\11\3\10"+
    "\1\35\7\10\1\36\6\10\1\0\1\16\1\11\1\0"+
    "\2\11\4\10\1\37\15\10\1\0\1\16\1\11\1\0"+
    "\2\11\1\10\1\40\20\10\1\0\1\16\1\11\1\0"+
    "\2\11\1\40\21\10\1\0\1\41\1\11\1\0\1\11"+
    "\1\42\3\10\1\35\7\10\2\36\5\10\1\0\1\16"+
    "\1\11\1\0\2\11\10\10\1\43\11\10\1\0\1\16"+
    "\1\11\1\0\2\11\3\10\1\35\16\10\1\0\1\16"+
    "\1\11\1\0\2\11\5\10\1\44\14\10\1\0\1\41"+
    "\1\11\1\0\1\11\1\42\20\10\1\45\1\2\1\46"+
    "\1\45\4\46\20\45\2\47\1\50\1\17\1\47\1\50"+
    "\22\47\2\10\1\0\1\16\1\11\1\0\2\11\12\10"+
    "\1\44\7\10\1\0\1\16\1\11\1\0\2\11\6\10"+
    "\1\40\11\10\1\45\1\51\1\46\1\45\4\46\20\45"+
    "\1\46\1\52\26\46\2\47\1\50\1\53\1\47\1\50"+
    "\22\47\3\50\1\54\24\50\2\2\1\0\1\2\4\0"+
    "\14\2\1\55\3\2\24\0\1\56\3\0\1\46\1\0"+
    "\26\46\2\2\1\0\1\2\4\0\1\57\1\2\1\60"+
    "\3\2\1\61\6\2\1\62\2\2\10\0\1\63\1\0"+
    "\1\64\3\0\1\65\6\0\1\66\2\0\2\2\1\0"+
    "\1\2\4\0\1\2\1\67\7\2\1\70\10\2\1\0"+
    "\1\2\4\0\3\2\1\71\16\2\1\0\1\2\4\0"+
    "\7\2\1\72\12\2\1\0\1\2\4\0\16\2\1\73"+
    "\1\2\11\0\1\74\7\0\1\75\21\0\1\76\33\0"+
    "\1\77\36\0\1\100\1\0\2\2\1\0\1\2\4\0"+
    "\2\2\1\101\17\2\1\0\1\2\4\0\3\2\1\102"+
    "\16\2\1\0\1\2\4\0\17\2\1\103\2\2\1\0"+
    "\1\2\4\0\1\104\21\2\1\0\1\2\4\0\2\2"+
    "\1\103\15\2\12\0\1\105\30\0\1\106\43\0\1\107"+
    "\10\0\1\110\31\0\1\107\15\0\2\2\1\0\1\2"+
    "\4\0\3\2\1\111\3\2\1\112\1\113\11\2\1\0"+
    "\1\2\4\0\6\2\1\114\13\2\1\0\1\2\4\0"+
    "\10\2\1\113\11\2\1\0\1\2\4\0\3\2\1\115"+
    "\7\2\1\116\4\2\13\0\1\117\3\0\1\120\1\121"+
    "\25\0\1\122\31\0\1\121\22\0\1\123\7\0\1\124"+
    "\4\0\2\2\1\0\1\2\4\0\4\2\1\125\15\2"+
    "\1\0\1\2\4\0\1\2\1\126\20\2\1\0\1\2"+
    "\4\0\1\126\21\2\1\0\1\16\4\0\3\2\1\115"+
    "\7\2\2\116\5\2\1\0\1\2\4\0\10\2\1\127"+
    "\11\2\1\0\1\2\4\0\3\2\1\115\14\2\14\0"+
    "\1\130\24\0\1\131\26\0\1\131\22\0\1\17\7\0"+
    "\1\123\7\0\2\124\23\0\1\132\22\0\1\123\14\0"+
    "\2\2\1\0\1\2\4\0\5\2\1\133\14\2\1\0"+
    "\1\16\4\0\22\2\1\0\1\2\4\0\12\2\1\133"+
    "\5\2\15\0\1\134\15\0\1\17\46\0\1\134\5\0"+
    "\2\2\1\0\1\2\4\0\6\2\1\126\11\2\16\0"+
    "\1\131\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2112];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\1\2\11\3\1\1\0\5\1\1\11\22\1"+
    "\1\0\3\1\3\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\4\1\4\0\5\1\5\0\4\1\4\0\6\1"+
    "\6\0\3\1\3\0\1\1\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[92];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private static final boolean DBG = false;

  public static final int IGNORE = 0;
  public static final int ACCEPT = 1;

  public String match() {
    return yytext();
  }

  private static void reportError(String yytext) {
    try {
      PrintWriter p = new PrintWriter(new OutputStreamWriter(System.err,
                                                "utf-8"), true);
      p.println("chtbl.flex tokenization error: \"" + yytext + "\"");
      if (yytext.length() >= 1) {
        p.println("First character is: " + yytext.charAt(0));
        if (yytext.length() >= 2) {
          p.println("Second character is: " + yytext.charAt(1));
        }
      }
    } catch (UnsupportedEncodingException e) {
      System.err.println("chtbl.flex tokenization and encoding present error");
    }
  }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  CHTBLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  CHTBLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 88) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { if (DBG) System.err.printf("Accepting |%s|%n", yytext());
                          return ACCEPT;
          }
        case 4: break;
        case 2: 
          { return IGNORE;
          }
        case 5: break;
        case 3: 
          { if (DBG) System.err.printf("Ignoring |%s|%n", yytext());
                          return IGNORE;
          }
        case 6: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
