package Lexer;
import Errors.LexerException;
import Parser.sym;


public class Yylex implements java_cup.runtime.Scanner {
	private final int YY_BUFFER_SIZE = 512;
	private final int YY_F = -1;
	private final int YY_NO_STATE = -1;
	private final int YY_NOT_ACCEPT = 0;
	private final int YY_START = 1;
	private final int YY_END = 2;
	private final int YY_NO_ANCHOR = 4;
	private final int YY_BOL = 128;
	private final int YY_EOF = 129;

private java_cup.runtime.Symbol tok(int k, Object value) {
//  System.out.println("Token: " + k);
  return new java_cup.runtime.Symbol(k, yyline, 0, value);
}
	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private int yyline;
	private boolean yy_at_bol;
	private int yy_lexical_state;

	public Yylex (java.io.Reader reader) {
		this ();
		if (null == reader) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(reader);
	}

	public Yylex (java.io.InputStream instream) {
		this ();
		if (null == instream) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));
	}

	private Yylex () {
		yy_buffer = new char[YY_BUFFER_SIZE];
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yyline = 0;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;
	}

	private boolean yy_eof_done = false;
	private final int YYINITIAL = 0;
	private final int yy_state_dtrans[] = {
		0
	};
	private void yybegin (int state) {
		yy_lexical_state = state;
	}
	private int yy_advance ()
		throws java.io.IOException {
		int next_read;
		int i;
		int j;

		if (yy_buffer_index < yy_buffer_read) {
			return yy_buffer[yy_buffer_index++];
		}

		if (0 != yy_buffer_start) {
			i = yy_buffer_start;
			j = 0;
			while (i < yy_buffer_read) {
				yy_buffer[j] = yy_buffer[i];
				++i;
				++j;
			}
			yy_buffer_end = yy_buffer_end - yy_buffer_start;
			yy_buffer_start = 0;
			yy_buffer_read = j;
			yy_buffer_index = j;
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}

		while (yy_buffer_index >= yy_buffer_read) {
			if (yy_buffer_index >= yy_buffer.length) {
				yy_buffer = yy_double(yy_buffer);
			}
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}
		return yy_buffer[yy_buffer_index++];
	}
	private void yy_move_end () {
		if (yy_buffer_end > yy_buffer_start &&
		    '\n' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
		if (yy_buffer_end > yy_buffer_start &&
		    '\r' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
	}
	private boolean yy_last_was_cr=false;
	private void yy_mark_start () {
		int i;
		for (i = yy_buffer_start; i < yy_buffer_index; ++i) {
			if ('\n' == yy_buffer[i] && !yy_last_was_cr) {
				++yyline;
			}
			if ('\r' == yy_buffer[i]) {
				++yyline;
				yy_last_was_cr=true;
			} else yy_last_was_cr=false;
		}
		yy_buffer_start = yy_buffer_index;
	}
	private void yy_mark_end () {
		yy_buffer_end = yy_buffer_index;
	}
	private void yy_to_mark () {
		yy_buffer_index = yy_buffer_end;
		yy_at_bol = (yy_buffer_end > yy_buffer_start) &&
		            ('\r' == yy_buffer[yy_buffer_end-1] ||
		             '\n' == yy_buffer[yy_buffer_end-1] ||
		             2028/*LS*/ == yy_buffer[yy_buffer_end-1] ||
		             2029/*PS*/ == yy_buffer[yy_buffer_end-1]);
	}
	private java.lang.String yytext () {
		return (new java.lang.String(yy_buffer,
			yy_buffer_start,
			yy_buffer_end - yy_buffer_start));
	}
	private int yylength () {
		return yy_buffer_end - yy_buffer_start;
	}
	private char[] yy_double (char buf[]) {
		int i;
		char newbuf[];
		newbuf = new char[2*buf.length];
		for (i = 0; i < buf.length; ++i) {
			newbuf[i] = buf[i];
		}
		return newbuf;
	}
	private final int YY_E_INTERNAL = 0;
	private final int YY_E_MATCH = 1;
	private java.lang.String yy_error_string[] = {
		"Error: Internal error.\n",
		"Error: Unmatched input.\n"
	};
	private void yy_error (int code,boolean fatal) {
		java.lang.System.out.print(yy_error_string[code]);
		java.lang.System.out.flush();
		if (fatal) {
			throw new Error("Fatal Error.\n");
		}
	}
	private int[][] unpackFromString(int size1, int size2, String st) {
		int colonIndex = -1;
		String lengthString;
		int sequenceLength = 0;
		int sequenceInteger = 0;

		int commaIndex;
		String workString;

		int res[][] = new int[size1][size2];
		for (int i= 0; i < size1; i++) {
			for (int j= 0; j < size2; j++) {
				if (sequenceLength != 0) {
					res[i][j] = sequenceInteger;
					sequenceLength--;
					continue;
				}
				commaIndex = st.indexOf(',');
				workString = (commaIndex==-1) ? st :
					st.substring(0, commaIndex);
				st = st.substring(commaIndex+1);
				colonIndex = workString.indexOf(':');
				if (colonIndex == -1) {
					res[i][j]=Integer.parseInt(workString);
					continue;
				}
				lengthString =
					workString.substring(colonIndex+1);
				sequenceLength=Integer.parseInt(lengthString);
				workString=workString.substring(0,colonIndex);
				sequenceInteger=Integer.parseInt(workString);
				res[i][j] = sequenceInteger;
				sequenceLength--;
			}
		}
		return res;
	}
	private int yy_acpt[] = {
		/* 0 */ YY_NOT_ACCEPT,
		/* 1 */ YY_NO_ANCHOR,
		/* 2 */ YY_NO_ANCHOR,
		/* 3 */ YY_NO_ANCHOR,
		/* 4 */ YY_NO_ANCHOR,
		/* 5 */ YY_NO_ANCHOR,
		/* 6 */ YY_NO_ANCHOR,
		/* 7 */ YY_NO_ANCHOR,
		/* 8 */ YY_NO_ANCHOR,
		/* 9 */ YY_NO_ANCHOR,
		/* 10 */ YY_NO_ANCHOR,
		/* 11 */ YY_NO_ANCHOR,
		/* 12 */ YY_NO_ANCHOR,
		/* 13 */ YY_NO_ANCHOR,
		/* 14 */ YY_NO_ANCHOR,
		/* 15 */ YY_NO_ANCHOR,
		/* 16 */ YY_NO_ANCHOR,
		/* 17 */ YY_NO_ANCHOR,
		/* 18 */ YY_NO_ANCHOR,
		/* 19 */ YY_NO_ANCHOR,
		/* 20 */ YY_NO_ANCHOR,
		/* 21 */ YY_NO_ANCHOR,
		/* 22 */ YY_NO_ANCHOR,
		/* 23 */ YY_NO_ANCHOR,
		/* 24 */ YY_NO_ANCHOR,
		/* 25 */ YY_NO_ANCHOR,
		/* 26 */ YY_NO_ANCHOR,
		/* 27 */ YY_NO_ANCHOR,
		/* 28 */ YY_NO_ANCHOR,
		/* 29 */ YY_NO_ANCHOR,
		/* 30 */ YY_NO_ANCHOR,
		/* 31 */ YY_NO_ANCHOR,
		/* 32 */ YY_NOT_ACCEPT,
		/* 33 */ YY_NO_ANCHOR,
		/* 34 */ YY_NO_ANCHOR,
		/* 35 */ YY_NOT_ACCEPT,
		/* 36 */ YY_NO_ANCHOR,
		/* 37 */ YY_NO_ANCHOR,
		/* 38 */ YY_NO_ANCHOR,
		/* 39 */ YY_NO_ANCHOR,
		/* 40 */ YY_NO_ANCHOR,
		/* 41 */ YY_NO_ANCHOR,
		/* 42 */ YY_NO_ANCHOR,
		/* 43 */ YY_NO_ANCHOR,
		/* 44 */ YY_NO_ANCHOR,
		/* 45 */ YY_NO_ANCHOR,
		/* 46 */ YY_NO_ANCHOR,
		/* 47 */ YY_NO_ANCHOR,
		/* 48 */ YY_NO_ANCHOR,
		/* 49 */ YY_NO_ANCHOR,
		/* 50 */ YY_NO_ANCHOR,
		/* 51 */ YY_NO_ANCHOR,
		/* 52 */ YY_NO_ANCHOR,
		/* 53 */ YY_NO_ANCHOR,
		/* 54 */ YY_NO_ANCHOR,
		/* 55 */ YY_NO_ANCHOR,
		/* 56 */ YY_NO_ANCHOR,
		/* 57 */ YY_NO_ANCHOR,
		/* 58 */ YY_NO_ANCHOR,
		/* 59 */ YY_NO_ANCHOR,
		/* 60 */ YY_NO_ANCHOR,
		/* 61 */ YY_NO_ANCHOR,
		/* 62 */ YY_NO_ANCHOR,
		/* 63 */ YY_NO_ANCHOR,
		/* 64 */ YY_NO_ANCHOR,
		/* 65 */ YY_NO_ANCHOR,
		/* 66 */ YY_NO_ANCHOR,
		/* 67 */ YY_NO_ANCHOR,
		/* 68 */ YY_NO_ANCHOR,
		/* 69 */ YY_NO_ANCHOR,
		/* 70 */ YY_NO_ANCHOR,
		/* 71 */ YY_NO_ANCHOR,
		/* 72 */ YY_NO_ANCHOR,
		/* 73 */ YY_NO_ANCHOR,
		/* 74 */ YY_NO_ANCHOR,
		/* 75 */ YY_NO_ANCHOR,
		/* 76 */ YY_NO_ANCHOR,
		/* 77 */ YY_NO_ANCHOR,
		/* 78 */ YY_NO_ANCHOR,
		/* 79 */ YY_NO_ANCHOR,
		/* 80 */ YY_NO_ANCHOR,
		/* 81 */ YY_NO_ANCHOR,
		/* 82 */ YY_NO_ANCHOR,
		/* 83 */ YY_NO_ANCHOR,
		/* 84 */ YY_NO_ANCHOR,
		/* 85 */ YY_NO_ANCHOR,
		/* 86 */ YY_NO_ANCHOR,
		/* 87 */ YY_NO_ANCHOR,
		/* 88 */ YY_NO_ANCHOR,
		/* 89 */ YY_NO_ANCHOR,
		/* 90 */ YY_NO_ANCHOR,
		/* 91 */ YY_NO_ANCHOR,
		/* 92 */ YY_NO_ANCHOR,
		/* 93 */ YY_NO_ANCHOR,
		/* 94 */ YY_NO_ANCHOR,
		/* 95 */ YY_NO_ANCHOR,
		/* 96 */ YY_NO_ANCHOR,
		/* 97 */ YY_NO_ANCHOR,
		/* 98 */ YY_NO_ANCHOR,
		/* 99 */ YY_NO_ANCHOR,
		/* 100 */ YY_NO_ANCHOR,
		/* 101 */ YY_NO_ANCHOR,
		/* 102 */ YY_NO_ANCHOR,
		/* 103 */ YY_NO_ANCHOR,
		/* 104 */ YY_NO_ANCHOR,
		/* 105 */ YY_NO_ANCHOR,
		/* 106 */ YY_NO_ANCHOR,
		/* 107 */ YY_NO_ANCHOR,
		/* 108 */ YY_NO_ANCHOR,
		/* 109 */ YY_NO_ANCHOR
	};
	private int yy_cmap[] = unpackFromString(1,130,
"34:9,33:2,34:2,33,34:18,33,34:6,28,25,26,34:2,27,34:3,30,29,32:8,23,22,34,2" +
"4,34:3,31:26,34:4,12,34,1,4,14,3,5,16,6,15,7,31:2,17,13,2,8,18,31,9,11,10,1" +
"9,20,21,31:3,34:5,0:2")[0];

	private int yy_rmap[] = unpackFromString(1,110,
"0,1,2,1:5,3,4:2,1,4:2,5,1:2,4:15,6,7,8,9,10,11,12,4,13,14,15,16,17,18,19,20" +
",21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45" +
",46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70" +
",4,71,72,73,74,75,76,77,78,79,80,81")[0];

	private int yy_nxt[][] = unpackFromString(82,35,
"1,2,89,98,101,102,98,33,36,98,103,104,3,98,105,98,106,107,98:3,108,4,34,3,5" +
",6,7,37,3:2,98,3,8,3,-1:36,98,38,98:9,39,98:9,-1:7,39:2,98,39,-1:35,8,-1:2," +
"98:11,39,98:9,-1:7,39:2,98,39,-1:3,98:6,61,98:4,39,98:9,-1:7,39:2,98,39,-1:" +
"30,15,-1:7,98,43,98:9,39,98:3,9,98:5,-1:7,39:2,98,39,-1:26,11,-1:38,16,-1:7" +
",98:8,10,98:2,39,98:6,44,98:2,-1:7,39:2,98,39,-1:31,32,35,-1:5,98:2,12,98:8" +
",39,98:9,-1:7,39:2,98,39,-1:3,98:9,13,98,39,98:9,-1:7,39:2,98,39,-1:3,98:5," +
"50,98:5,39,98:2,91,98:6,-1:7,39:2,98,39,-1:3,98:2,14,98:8,39,98:9,-1:7,39:2" +
",98,39,-1:3,98:11,39,98:5,51,98:3,-1:7,39:2,98,39,-1:3,98:9,52,98,39,98:9,-" +
"1:7,39:2,98,39,-1:3,99,98:10,39,98:9,-1:7,39:2,98,39,-1:3,98:4,53,98:6,39,9" +
"8:9,-1:7,39:2,98,39,-1:3,54,98:6,55,98:3,39,98:9,-1:7,39:2,98,39,-1:3,98,56" +
",98:9,39,98:9,-1:7,39:2,98,39,-1:3,98:11,39,98,93,98:7,-1:7,39:2,98,39,-1:3" +
",98:6,59,98:4,39,98:9,-1:7,39:2,98,39,-1:3,98:11,39,98:6,62,98:2,-1:7,39:2," +
"98,39,-1:3,98:11,39,98:5,63,98:3,-1:7,39:2,98,39,-1:3,98,17,98:9,39,98:9,-1" +
":7,39:2,98,39,-1:3,98:8,94,65,98,39,98:9,-1:7,39:2,98,39,-1:3,98:11,39,98:5" +
",18,98:3,-1:7,39:2,98,39,-1:3,98:2,66,98:8,39,98:9,-1:7,39:2,98,39,-1:3,67," +
"98:10,39,98:9,-1:7,39:2,98,39,-1:3,98:11,39,98:2,19,98:6,-1:7,39:2,98,39,-1" +
":3,98,20,98:9,39,98:9,-1:7,39:2,98,39,-1:3,98:11,39,98:7,95,98,-1:7,39:2,98" +
",39,-1:3,98:11,39,98:3,21,98:5,-1:7,39:2,98,39,-1:3,98:9,69,98,39,98:9,-1:7" +
",39:2,98,39,-1:3,98:11,39,98:6,70,98:2,-1:7,39:2,98,39,-1:3,98:10,100,39,98" +
":9,-1:7,39:2,98,39,-1:3,98:4,72,98:6,39,98:9,-1:7,39:2,98,39,-1:3,98:6,96,9" +
"8:4,39,98:9,-1:7,39:2,98,39,-1:3,98:11,39,98:4,22,98:4,-1:7,39:2,98,39,-1:3" +
",98:11,39,98:4,23,98:4,-1:7,39:2,98,39,-1:3,98:10,24,39,98:9,-1:7,39:2,98,3" +
"9,-1:3,98:9,74,98,39,98:9,-1:7,39:2,98,39,-1:3,98:10,25,39,98:9,-1:7,39:2,9" +
"8,39,-1:3,98:10,26,76,98:9,-1:7,39:2,98,39,-1:3,98:7,78,98:3,39,98:9,-1:7,3" +
"9:2,98,39,-1:3,98:10,27,39,98:9,-1:7,39:2,98,39,-1:3,98:9,109,98,39,98:9,-1" +
":7,39:2,98,39,-1:3,98:11,39,79,98:8,-1:7,39:2,98,39,-1:3,98:6,80,98:4,39,98" +
":9,-1:7,39:2,98,39,-1:3,98:11,39,98:6,81,98:2,-1:7,39:2,98,39,-1:3,82,98:10" +
",39,98:9,-1:7,39:2,98,39,-1:3,98:7,83,98:3,39,98:9,-1:7,39:2,98,39,-1:3,98:" +
"8,28,98:2,39,98:9,-1:7,39:2,98,39,-1:3,98:11,39,98,85,98:7,-1:7,39:2,98,39," +
"-1:3,98,29,98:9,39,98:9,-1:7,39:2,98,39,-1:3,98,30,98:9,39,98:9,-1:7,39:2,9" +
"8,39,-1:3,98:11,39,98:2,86,98:6,-1:7,39:2,98,39,-1:3,98:6,87,98:4,39,98:9,-" +
"1:7,39:2,98,39,-1:3,98,88,98:9,39,98:9,-1:7,39:2,98,39,-1:3,98:4,31,98:6,39" +
",98:9,-1:7,39:2,98,39,-1:3,98:7,40,98:3,39,98:9,-1:7,39:2,98,39,-1:3,98:9,5" +
"8,98,39,98:9,-1:7,39:2,98,39,-1:3,60,98:10,39,98:9,-1:7,39:2,98,39,-1:3,98," +
"57,98:9,39,98:9,-1:7,39:2,98,39,-1:3,68,98:10,39,98:9,-1:7,39:2,98,39,-1:3," +
"98:9,71,98,39,98:9,-1:7,39:2,98,39,-1:3,98:6,73,98:4,39,98:9,-1:7,39:2,98,3" +
"9,-1:3,98:9,77,98,39,98:9,-1:7,39:2,98,39,-1:3,98:7,84,98:3,39,98:9,-1:7,39" +
":2,98,39,-1:3,98,64,98:9,39,98:9,-1:7,39:2,98,39,-1:3,98:6,75,98:4,39,98:9," +
"-1:7,39:2,98,39,-1:3,98:4,41,98:6,39,98:9,-1:7,39:2,98,39,-1:3,98,42,98:9,3" +
"9,98:9,-1:7,39:2,98,39,-1:3,98:8,45,98:2,39,98:2,46,98:6,-1:7,39:2,98,39,-1" +
":3,98:9,47,98,39,98:9,-1:7,39:2,98,39,-1:3,98:7,48,98:3,39,98:9,-1:7,39:2,9" +
"8,39,-1:3,98:6,92,98:4,39,98:9,-1:7,39:2,98,39,-1:3,98:7,49,98:3,39,98:9,-1" +
":7,39:2,98,39,-1:3,98:6,90,98:4,39,98:9,-1:7,39:2,98,39,-1:3,98:6,97,98:4,3" +
"9,98:9,-1:7,39:2,98,39,-1:2");

	public java_cup.runtime.Symbol next_token ()
		throws java.io.IOException, 
LexerException

		{
		int yy_lookahead;
		int yy_anchor = YY_NO_ANCHOR;
		int yy_state = yy_state_dtrans[yy_lexical_state];
		int yy_next_state = YY_NO_STATE;
		int yy_last_accept_state = YY_NO_STATE;
		boolean yy_initial = true;
		int yy_this_accept;

		yy_mark_start();
		yy_this_accept = yy_acpt[yy_state];
		if (YY_NOT_ACCEPT != yy_this_accept) {
			yy_last_accept_state = yy_state;
			yy_mark_end();
		}
		while (true) {
			if (yy_initial && yy_at_bol) yy_lookahead = YY_BOL;
			else yy_lookahead = yy_advance();
			yy_next_state = YY_F;
			yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];
			if (YY_EOF == yy_lookahead && true == yy_initial) {

{return tok(sym.EOF, null); }
			}
			if (YY_F != yy_next_state) {
				yy_state = yy_next_state;
				yy_initial = false;
				yy_this_accept = yy_acpt[yy_state];
				if (YY_NOT_ACCEPT != yy_this_accept) {
					yy_last_accept_state = yy_state;
					yy_mark_end();
				}
			}
			else {
				if (YY_NO_STATE == yy_last_accept_state) {
					throw (new Error("Lexical Error: Unmatched Input."));
				}
				else {
					yy_anchor = yy_acpt[yy_last_accept_state];
					if (0 != (YY_END & yy_anchor)) {
						yy_move_end();
					}
					yy_to_mark();
					switch (yy_last_accept_state) {
					case 1:
						
					case -2:
						break;
					case 2:
						{return tok(sym.IDENT, yytext());}
					case -3:
						break;
					case 3:
						{throw new LexerException("Caracter Ilegal en linea "+yyline); }
					case -4:
						break;
					case 4:
						{return tok(sym.PC, null); }
					case -5:
						break;
					case 5:
						{return tok(sym.PAREN, null); }
					case -6:
						break;
					case 6:
						{return tok(sym.TESIS, null); }
					case -7:
						break;
					case 7:
						{return tok(sym.COMA, null); }
					case -8:
						break;
					case 8:
						{ }
					case -9:
						break;
					case 9:
						{return tok(sym.IF, null); }
					case -10:
						break;
					case 10:
						{return tok(sym.OR, null); }
					case -11:
						break;
					case 11:
						{return tok(sym.ASIG, null); }
					case -12:
						break;
					case 12:
						{return tok(sym.AND, null); }
					case -13:
						break;
					case 13:
						{return tok(sym.NOT, null); }
					case -14:
						break;
					case 14:
						{return tok(sym.END, null); }
					case -15:
						break;
					case 15:
						{return tok(sym.CLOG, new Boolean(true)); }
					case -16:
						break;
					case 16:
						{return tok(sym.CLOG, new Boolean(false)); }
					case -17:
						break;
					case 17:
						{return tok(sym.THEN, null); }
					case -18:
						break;
					case 18:
						{return tok(sym.STOP, null); }
					case -19:
						break;
					case 19:
						{return tok(sym.WITH, null); }
					case -20:
						break;
					case 20:
						{return tok(sym.BEGIN, null); }
					case -21:
						break;
					case 21:
						{return tok(sym.ENDIF, null); }
					case -22:
						break;
					case 22:
						{return tok(sym.FINAL, null); }
					case -23:
						break;
					case 23:
						{return tok(sym.LOCAL, null); }
					case -24:
						break;
					case 24:
						{return tok(sym.INPUTS, null); }
					case -25:
						break;
					case 25:
						{return tok(sym.START, null); }
					case -26:
						break;
					case 26:
						{return tok(sym.STATES, null); }
					case -27:
						break;
					case 27:
						{return tok(sym.OUTPUTS, null); }
					case -28:
						break;
					case 28:
						{return tok(sym.BEHAVIOUR, null); }
					case -29:
						break;
					case 29:
						{return tok(sym.CONDITION, null); }
					case -30:
						break;
					case 30:
						{return tok(sym.TRANSITION, null); }
					case -31:
						break;
					case 31:
						{return tok(sym.STATE_MACHINE, null); }
					case -32:
						break;
					case 33:
						{return tok(sym.IDENT, yytext());}
					case -33:
						break;
					case 34:
						{throw new LexerException("Caracter Ilegal en linea "+yyline); }
					case -34:
						break;
					case 36:
						{return tok(sym.IDENT, yytext());}
					case -35:
						break;
					case 37:
						{throw new LexerException("Caracter Ilegal en linea "+yyline); }
					case -36:
						break;
					case 38:
						{return tok(sym.IDENT, yytext());}
					case -37:
						break;
					case 39:
						{return tok(sym.IDENT, yytext());}
					case -38:
						break;
					case 40:
						{return tok(sym.IDENT, yytext());}
					case -39:
						break;
					case 41:
						{return tok(sym.IDENT, yytext());}
					case -40:
						break;
					case 42:
						{return tok(sym.IDENT, yytext());}
					case -41:
						break;
					case 43:
						{return tok(sym.IDENT, yytext());}
					case -42:
						break;
					case 44:
						{return tok(sym.IDENT, yytext());}
					case -43:
						break;
					case 45:
						{return tok(sym.IDENT, yytext());}
					case -44:
						break;
					case 46:
						{return tok(sym.IDENT, yytext());}
					case -45:
						break;
					case 47:
						{return tok(sym.IDENT, yytext());}
					case -46:
						break;
					case 48:
						{return tok(sym.IDENT, yytext());}
					case -47:
						break;
					case 49:
						{return tok(sym.IDENT, yytext());}
					case -48:
						break;
					case 50:
						{return tok(sym.IDENT, yytext());}
					case -49:
						break;
					case 51:
						{return tok(sym.IDENT, yytext());}
					case -50:
						break;
					case 52:
						{return tok(sym.IDENT, yytext());}
					case -51:
						break;
					case 53:
						{return tok(sym.IDENT, yytext());}
					case -52:
						break;
					case 54:
						{return tok(sym.IDENT, yytext());}
					case -53:
						break;
					case 55:
						{return tok(sym.IDENT, yytext());}
					case -54:
						break;
					case 56:
						{return tok(sym.IDENT, yytext());}
					case -55:
						break;
					case 57:
						{return tok(sym.IDENT, yytext());}
					case -56:
						break;
					case 58:
						{return tok(sym.IDENT, yytext());}
					case -57:
						break;
					case 59:
						{return tok(sym.IDENT, yytext());}
					case -58:
						break;
					case 60:
						{return tok(sym.IDENT, yytext());}
					case -59:
						break;
					case 61:
						{return tok(sym.IDENT, yytext());}
					case -60:
						break;
					case 62:
						{return tok(sym.IDENT, yytext());}
					case -61:
						break;
					case 63:
						{return tok(sym.IDENT, yytext());}
					case -62:
						break;
					case 64:
						{return tok(sym.IDENT, yytext());}
					case -63:
						break;
					case 65:
						{return tok(sym.IDENT, yytext());}
					case -64:
						break;
					case 66:
						{return tok(sym.IDENT, yytext());}
					case -65:
						break;
					case 67:
						{return tok(sym.IDENT, yytext());}
					case -66:
						break;
					case 68:
						{return tok(sym.IDENT, yytext());}
					case -67:
						break;
					case 69:
						{return tok(sym.IDENT, yytext());}
					case -68:
						break;
					case 70:
						{return tok(sym.IDENT, yytext());}
					case -69:
						break;
					case 71:
						{return tok(sym.IDENT, yytext());}
					case -70:
						break;
					case 72:
						{return tok(sym.IDENT, yytext());}
					case -71:
						break;
					case 73:
						{return tok(sym.IDENT, yytext());}
					case -72:
						break;
					case 74:
						{return tok(sym.IDENT, yytext());}
					case -73:
						break;
					case 75:
						{return tok(sym.IDENT, yytext());}
					case -74:
						break;
					case 76:
						{return tok(sym.IDENT, yytext());}
					case -75:
						break;
					case 77:
						{return tok(sym.IDENT, yytext());}
					case -76:
						break;
					case 78:
						{return tok(sym.IDENT, yytext());}
					case -77:
						break;
					case 79:
						{return tok(sym.IDENT, yytext());}
					case -78:
						break;
					case 80:
						{return tok(sym.IDENT, yytext());}
					case -79:
						break;
					case 81:
						{return tok(sym.IDENT, yytext());}
					case -80:
						break;
					case 82:
						{return tok(sym.IDENT, yytext());}
					case -81:
						break;
					case 83:
						{return tok(sym.IDENT, yytext());}
					case -82:
						break;
					case 84:
						{return tok(sym.IDENT, yytext());}
					case -83:
						break;
					case 85:
						{return tok(sym.IDENT, yytext());}
					case -84:
						break;
					case 86:
						{return tok(sym.IDENT, yytext());}
					case -85:
						break;
					case 87:
						{return tok(sym.IDENT, yytext());}
					case -86:
						break;
					case 88:
						{return tok(sym.IDENT, yytext());}
					case -87:
						break;
					case 89:
						{return tok(sym.IDENT, yytext());}
					case -88:
						break;
					case 90:
						{return tok(sym.IDENT, yytext());}
					case -89:
						break;
					case 91:
						{return tok(sym.IDENT, yytext());}
					case -90:
						break;
					case 92:
						{return tok(sym.IDENT, yytext());}
					case -91:
						break;
					case 93:
						{return tok(sym.IDENT, yytext());}
					case -92:
						break;
					case 94:
						{return tok(sym.IDENT, yytext());}
					case -93:
						break;
					case 95:
						{return tok(sym.IDENT, yytext());}
					case -94:
						break;
					case 96:
						{return tok(sym.IDENT, yytext());}
					case -95:
						break;
					case 97:
						{return tok(sym.IDENT, yytext());}
					case -96:
						break;
					case 98:
						{return tok(sym.IDENT, yytext());}
					case -97:
						break;
					case 99:
						{return tok(sym.IDENT, yytext());}
					case -98:
						break;
					case 100:
						{return tok(sym.IDENT, yytext());}
					case -99:
						break;
					case 101:
						{return tok(sym.IDENT, yytext());}
					case -100:
						break;
					case 102:
						{return tok(sym.IDENT, yytext());}
					case -101:
						break;
					case 103:
						{return tok(sym.IDENT, yytext());}
					case -102:
						break;
					case 104:
						{return tok(sym.IDENT, yytext());}
					case -103:
						break;
					case 105:
						{return tok(sym.IDENT, yytext());}
					case -104:
						break;
					case 106:
						{return tok(sym.IDENT, yytext());}
					case -105:
						break;
					case 107:
						{return tok(sym.IDENT, yytext());}
					case -106:
						break;
					case 108:
						{return tok(sym.IDENT, yytext());}
					case -107:
						break;
					case 109:
						{return tok(sym.IDENT, yytext());}
					case -108:
						break;
					default:
						yy_error(YY_E_INTERNAL,false);
					case -1:
					}
					yy_initial = true;
					yy_state = yy_state_dtrans[yy_lexical_state];
					yy_next_state = YY_NO_STATE;
					yy_last_accept_state = YY_NO_STATE;
					yy_mark_start();
					yy_this_accept = yy_acpt[yy_state];
					if (YY_NOT_ACCEPT != yy_this_accept) {
						yy_last_accept_state = yy_state;
						yy_mark_end();
					}
				}
			}
		}
	}
}
