/* Generated By:JavaCC: Do not edit this line. simplejavaTokenManager.java */

/** Token Manager. */
public class simplejavaTokenManager implements simplejavaConstants
{
        public static int comments = 0;
        public static int nestedLvl = 0;
        public static int currentLine = 1;

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x810L) != 0L)
            return 0;
         if ((active0 & 0x1f800c00c0L) != 0L)
         {
            jjmatchedKind = 40;
            return 6;
         }
         return -1;
      case 1:
         if ((active0 & 0x200040000L) != 0L)
            return 6;
         if ((active0 & 0x1d800800c0L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 1;
            return 6;
         }
         return -1;
      case 2:
         if ((active0 & 0x1000000080L) != 0L)
            return 6;
         if ((active0 & 0xd80080040L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 2;
            return 6;
         }
         return -1;
      case 3:
         if ((active0 & 0xd00080000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 3;
            return 6;
         }
         if ((active0 & 0x80000040L) != 0L)
            return 6;
         return -1;
      case 4:
         if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 4;
            return 6;
         }
         if ((active0 & 0x900080000L) != 0L)
            return 6;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 2);
      case 33:
         jjmatchedKind = 30;
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 40:
         return jjStopAtPos(0, 16);
      case 41:
         return jjStopAtPos(0, 17);
      case 42:
         return jjStopAtPos(0, 10);
      case 43:
         return jjStopAtPos(0, 9);
      case 44:
         return jjStopAtPos(0, 38);
      case 45:
         return jjStopAtPos(0, 8);
      case 46:
         return jjStopAtPos(0, 37);
      case 47:
         jjmatchedKind = 11;
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 59:
         return jjStopAtPos(0, 20);
      case 60:
         jjmatchedKind = 26;
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 61:
         jjmatchedKind = 22;
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 62:
         jjmatchedKind = 27;
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 91:
         return jjStopAtPos(0, 14);
      case 93:
         return jjStopAtPos(0, 15);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x100000080L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 123:
         return jjStopAtPos(0, 12);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 125:
         return jjStopAtPos(0, 13);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         break;
      case 42:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(1, 4);
         break;
      case 61:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(1, 25);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(1, 28);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x1400000000L);
      case 102:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(1, 33, 6);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000040L);
      case 111:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(1, 18, 6);
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 124:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(1, 23);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 114:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(2, 7, 6);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 119:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(3, 6, 6);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(3, 31, 6);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x900000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 19, 6);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(4, 32, 6);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
      case 115:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(4, 35, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(5, 34, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 7;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 39)
                        kind = 39;
                     jjCheckNAdd(4);
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 47)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L)
                     kind = 5;
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(4);
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjstateSet[jjnewStateCnt++] = 6;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
               case 6:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAdd(6);
                  break;
               case 1:
                  jjAddStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 7 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 43);
      case 42:
         return jjMoveStringLiteralDfa1_1(0x20000000000L);
      case 47:
         return jjMoveStringLiteralDfa1_1(0x40000000000L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(1, 42);
         break;
      case 47:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   1, 2, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\145\154\163\145", "\146\157\162", "\55", 
"\53", "\52", "\57", "\173", "\175", "\133", "\135", "\50", "\51", "\144\157", 
"\167\150\151\154\145", "\73", "\46\46", "\75", "\174\174", "\75\75", "\41\75", "\74", "\76", 
"\74\75", "\76\75", "\41", "\164\162\165\145", "\146\141\154\163\145", "\151\146", 
"\162\145\164\165\162\156", "\143\154\141\163\163", "\156\145\167", "\56", "\54", null, null, null, null, 
null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x1ffffffffc1L, 
};
static final long[] jjtoSkip = {
   0x1e000000003eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[7];
static private final int[] jjstateSet = new int[14];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public simplejavaTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public simplejavaTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 7; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100000200L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 44)
       {
          jjmatchedKind = 44;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
           SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 2 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                   currentLine++;
         break;
      case 4 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                           nestedLvl++; SwitchTo(IN_COMMENT);
         break;
      case 5 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                     comments++;
         break;
      case 41 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                   nestedLvl--; comments++; if(nestedLvl == 0) SwitchTo(DEFAULT);
         break;
      case 42 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                   nestedLvl++;
         break;
      case 43 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                   currentLine++;
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
