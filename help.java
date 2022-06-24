// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   editor.java

import java.io.*;

class help
{

    help()
    {
        ore = "";
        charcount = 0;
        repl = "";
        asa = "";
        cuts = "";
        fstr = "";
        toom = "";
        wordcount = 0;
        strin = "";
        len = 0;
        fl = 0;
        tlen = 0;
        temp = "";
        word = 0;
        vowel = 0;
        line = 0;
        no = 0;
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    void wel()
        throws IOException
    {
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("      EDITOR        ");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println(" 1. FILE");
        System.out.println(" 2. EDIT");
        System.out.println(" 3. SEARCH");
        System.out.println(" 4. COUNT");
        System.out.println(" 5. EXIT");
        System.out.println("");
        System.out.println("ENTER! 1.....5");
        int a = Integer.parseInt(br.readLine());
        switch(a)
        {
        case 1: // '\001'
            bok();
            break;

        case 2: // '\002'
            if(ore == "")
            {
                System.out.println("no access now");
                control();
            } else
            {
                edi();
            }
            break;

        case 3: // '\003'
            sear();
            break;

        case 4: // '\004'
            if(ore == "")
            {
                System.out.println("no access now");
                control();
            } else
            {
                count();
            }
            break;

        case 5: // '\005'
            System.out.println("THANKS!!!!!!!!!!");
            break;

        default:
            System.out.println("RE DHAKKAN ANDHA HAI KYA !!!");
            control();
            break;
        }
    }

    void bok()
        throws IOException
    {
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("        FILE");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("1. NEW");
        System.out.println("2. OPEN");
        System.out.println("3. EXIT");
        System.out.println("");
        System.out.println("ENTER ! 1,2,3");
        System.out.println("");
        int b = Integer.parseInt(br.readLine());
        switch(b)
        {
        case 1: // '\001'
            new_file();
            break;

        case 2: // '\002'
            if(ore == "")
            {
                System.out.println("no access now");
                control();
            } else
            {
                open_file();
            }
            break;

        case 3: // '\003'
            control();
            break;

        default:
            System.out.println("ABE DHAKKAN DIKHTA NAHI KYA");
            bok();
            break;
        }
    }

    void edi()
        throws IOException
    {
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("        EDIT");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("1. CUT");
        System.out.println("2. COPY");
        System.out.println("3. PASTE");
        System.out.println("4. EXIT");
        System.out.println("");
        System.out.println("ENTER! 1..........4");
        int c = Integer.parseInt(br.readLine());
        switch(c)
        {
        case 1: // '\001'
            edit_cut();
            break;

        case 2: // '\002'
            edit_copy();
            break;

        case 3: // '\003'
            edit_paste();
            break;

        case 4: // '\004'
            control();
            break;

        default:
            System.out.println("RE DHAKKAN DIKHTA NAHI KYA");
            break;
        }
    }

    void sear()
        throws IOException
    {
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("     SEARCH");
        System.out.println("");
        System.out.println("1. FIND STRING");
        System.out.println("2. FIND WORD");
        System.out.println("3. REPLACE WORD");
        System.out.println("4. EXIT");
        System.out.println("");
        System.out.println("ENTER ! 1......5");
        System.out.println("");
        int d = Integer.parseInt(br.readLine());
        switch(d)
        {
        case 1: // '\001'
            search_word();
            control();
            break;

        case 2: // '\002'
            search_word();
            control();
            break;

        case 3: // '\003'
            rep_word();
            control();
            break;

        case 4: // '\004'
            control();
            break;

        default:
            sear();
            break;
        }
    }

    void count()
        throws IOException
    {
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("    COUNT");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("1. CHAR");
        System.out.println("2. WORD");
        System.out.println("3. VOWELS");
        System.out.println("4. BLANK");
        System.out.println("5. LINE");
        System.out.println("6. EXIT");
        System.out.println("");
        System.out.println("ENTER! 1.........6");
        System.out.println("");
        int e = Integer.parseInt(br.readLine());
        switch(e)
        {
        case 1: // '\001'
            count_char();
            break;

        case 2: // '\002'
            count_word();
            break;

        case 3: // '\003'
            count_vowel();
            break;

        case 4: // '\004'
            count_word();
            break;

        case 5: // '\005'
            count_line();
            break;

        case 6: // '\006'
            control();
            break;

        default:
            count();
            break;
        }
    }

    void new_file()
        throws IOException
    {
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("  NEW FILE");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        System.out.println("ENTER YOUR STRING");
        System.out.println("");
        ore = br.readLine();
        System.out.println("YOUR FILE NUMBER Is saVED NOW");
        control();
    }

    void open_file()
        throws IOException
    {
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("     OPEN FILE");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        if(ore == "")
        {
            System.out.println("INVALID FILE");
            control();
        } else
        {
            System.out.println(ore);
            control();
        }
    }

    void edit_cut()
        throws IOException
    {
        int h;
        int i;
        int u;
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("  EDIT    CUT");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        if(ore == "")
        {
            System.out.println("INVALID Function");
            control();
            break MISSING_BLOCK_LABEL_385;
        }
        System.out.println(" EDIT CUT");
        System.out.println("");
        System.out.println(ore);
        System.out.println("ENTER BEGINNING POINT IN INTEGERS   [from CharAt=  ]");
        h = Integer.parseInt(br.readLine());
        System.out.println("ENTER END POINT IN INTEGERS [to charAt=] ");
        i = Integer.parseInt(br.readLine());
        u = ore.length();
        if(i < h || i > u)
        {
            System.out.println("WRONG INPUTS");
            control();
            break MISSING_BLOCK_LABEL_385;
        }
        new StringBuilder();
        this;
        JVM INSTR dup_x1 ;
        ore;
        append();
        "                            ";
        append();
        toString();
        ore;
        int j = h;
_L2:
        char k;
        if(j > i)
            break; /* Loop/switch isn't completed */
        k = ore.charAt(j);
        new StringBuilder();
        this;
        JVM INSTR dup_x1 ;
        cuts;
        append();
        k;
        append();
        toString();
        cuts;
        j++;
        if(true) goto _L2; else goto _L1
_L1:
        int v = 0;
_L4:
        char qw;
        if(v >= h)
            break; /* Loop/switch isn't completed */
        qw = ore.charAt(v);
        new StringBuilder();
        this;
        JVM INSTR dup_x1 ;
        toom;
        append();
        qw;
        append();
        toString();
        toom;
        v++;
        if(true) goto _L4; else goto _L3
_L3:
        int w = i + 1;
_L6:
        char qa;
        if(w > u)
            break; /* Loop/switch isn't completed */
        qa = ore.charAt(w);
        new StringBuilder();
        this;
        JVM INSTR dup_x1 ;
        toom;
        append();
        qa;
        append();
        toString();
        toom;
        w++;
        if(true) goto _L6; else goto _L5
_L5:
        System.out.println((new StringBuilder()).append("THE TEXTS THAT WERE CUT ").append(cuts).toString());
        ore = toom;
        control();
    }

    void edit_copy()
        throws IOException
    {
        int i;
        int j;
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("  EDIT    COPY");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        if(ore == "")
        {
            System.out.println("INVALID FILE");
            control();
            break MISSING_BLOCK_LABEL_235;
        }
        System.out.println(" EDIT COPY");
        System.out.println("");
        System.out.println("ENTER BEGINNING POINT IN INTEGERS   [from CharAt=  ]");
        int h = Integer.parseInt(br.readLine());
        System.out.println("ENTER END POINT IN INTEGERS [to charAt=] ");
        i = Integer.parseInt(br.readLine());
        int y = ore.length();
        if(i < h || i > y)
        {
            System.out.println("WRONG INPUTS");
            control();
            break MISSING_BLOCK_LABEL_235;
        }
        j = h;
_L2:
        char k;
        if(j > i)
            break; /* Loop/switch isn't completed */
        k = ore.charAt(j);
        new StringBuilder();
        this;
        JVM INSTR dup_x1 ;
        cuts;
        append();
        k;
        append();
        toString();
        cuts;
        j++;
        if(true) goto _L2; else goto _L1
_L1:
        System.out.println((new StringBuilder()).append("THE TEXTS THAT WERE COPIED ").append(cuts).toString());
        control();
    }

    void edit_paste()
        throws IOException
    {
        if(cuts == "")
            break MISSING_BLOCK_LABEL_95;
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("  PASTE");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002");
        new StringBuilder();
        this;
        JVM INSTR dup_x1 ;
        ore;
        append();
        " ";
        append();
        cuts;
        append();
        toString();
        ore;
        System.out.println("YOUR TEXT IS PASTED");
        cuts = "";
        control();
        break MISSING_BLOCK_LABEL_107;
        System.out.println("NO TEXT SELECTED");
        control();
    }

    void count_char()
        throws IOException
    {
        System.out.println("");
        if(ore == "")
        {
            System.out.println("INVALID FILE");
            control();
        } else
        {
            System.out.println(" count char");
            System.out.println("");
            System.out.println("ENTER BEGINNING POINT IN INTEGERS   [from CharAt=  ]");
            int n = Integer.parseInt(br.readLine());
            System.out.println("ENTER END POINT IN INTEGERS [to charAt=] ");
            int o = Integer.parseInt(br.readLine());
            int m = ore.length();
            if(o < n || m < o)
            {
                System.out.println("WRONG INPUTS");
                control();
            } else
            {
                for(int p = n; p <= o; p++)
                    charcount++;

                System.out.println((new StringBuilder()).append("THE LENGTH OF TEXTS SPECIFIED=  ").append(charcount).toString());
                control();
            }
        }
    }

    void count_word()
        throws IOException
    {
        System.out.println("");
        if(ore == "")
        {
            System.out.println("INVALID FILE");
            control();
        } else
        {
            System.out.println(" count char");
            System.out.println("");
            System.out.println(ore);
            System.out.println("ENTER BEGINNING POINT IN INTEGERS   [from CharAt=  ]");
            n = Integer.parseInt(br.readLine());
            System.out.println("ENTER END POINT IN INTEGERS [to charAt=] ");
            o = Integer.parseInt(br.readLine());
            if(o < n || o > ore.length())
            {
                System.out.println("WRONG INPUTS");
                control();
            } else
            {
                for(p = m; p <= o; p++)
                {
                    q = ore.charAt(p);
                    if(q == ' ')
                        word++;
                }

                System.out.println((new StringBuilder()).append("THE NUMBER OF WORDS/blanks IN TEXTS SPECIFIED=  ").append(word).toString());
                control();
            }
        }
    }

    void count_vowel()
        throws IOException
    {
        System.out.println("");
        if(ore == "")
        {
            System.out.println("INVALID FILE");
            control();
        } else
        {
            System.out.println(" count vowel");
            System.out.println("");
            System.out.println(ore);
            System.out.println("ENTER BEGINNING POINT IN INTEGERS   [from CharAt=  ]");
            n = Integer.parseInt(br.readLine());
            System.out.println("ENTER END POINT IN INTEGERS [to charAt=] ");
            o = Integer.parseInt(br.readLine());
            if(o < n || o > ore.length())
            {
                System.out.println("WRONG INPUTS");
                control();
            } else
            {
                for(p = m; p <= o; p++)
                {
                    q = ore.charAt(p);
                    if(q == 'a' || q == 'A' || q == 'e' || q == 'E' || q == 'i' || q == 'I' || q == 'o' || q == 'O' || q == 'u' || q == 'U')
                        vowel++;
                }

                System.out.println((new StringBuilder()).append("THE NUMBER OF VOWELS IN TEXTS SPECIFIED=  ").append(vowel).toString());
                control();
            }
        }
    }

    void count_line()
        throws IOException
    {
        System.out.println("");
        if(ore == "")
        {
            System.out.println("INVALID FILE");
            control();
        } else
        {
            System.out.println(" count line");
            System.out.println("");
            System.out.println(ore);
            System.out.println("ENTER BEGINNING POINT IN INTEGERS   [from CharAt=  ]");
            n = Integer.parseInt(br.readLine());
            System.out.println("ENTER END POINT IN INTEGERS [to charAt=] ");
            o = Integer.parseInt(br.readLine());
            if(o < n || o > ore.length())
            {
                System.out.println("WRONG INPUTS");
                control();
            } else
            {
                for(p = m; p <= o; p++)
                {
                    q = ore.charAt(p);
                    if(q == '.')
                        line++;
                }

                System.out.println((new StringBuilder()).append("THE NUMBER OF LINES IN area SPECIFIED=  ").append(line).toString());
                control();
            }
        }
    }

    void search_word()
        throws IOException
    {
        int b1;
        String c1;
        int d1;
        String wer;
        System.out.println("  SEARCH STRING");
        System.out.println("");
        b1 = ore.length();
        System.out.println("ENTER YOUR STRING TO BE SEARCHED");
        c1 = br.readLine();
        d1 = c1.length();
        wer = ore;
        new StringBuilder();
        this;
        JVM INSTR dup_x1 ;
        ore;
        append();
        "                                 ";
        append();
        toString();
        ore;
        int x1 = 0;
_L5:
        int y1;
        if(x1 >= b1)
            break; /* Loop/switch isn't completed */
        strin = "";
        y1 = 0;
_L3:
        if(y1 >= d1) goto _L2; else goto _L1
_L1:
        char abc;
        int f1 = x1 + y1;
        abc = ore.charAt(f1);
        new StringBuilder();
        this;
        JVM INSTR dup_x1 ;
        strin;
        append();
        abc;
        append();
        toString();
        strin;
        if(strin.equals(c1))
            wordcount++;
        y1++;
          goto _L3
_L2:
        x1++;
        if(true) goto _L5; else goto _L4
_L4:
        ore = wer;
        System.out.println((new StringBuilder()).append("words found").append(wordcount).append(" times").toString());
        return;
    }

    void rep_word()
        throws IOException
    {
        System.out.println(ore);
        System.out.println("ENTER THE STRING TO REPLACE ");
        String find = br.readLine();
        System.out.println("enter replace string");
        String replace = br.readLine();
        int lenore = ore.length();
        char ch = '\0';
        int count = 0;
        String get = "";
        String tem = "";
        for(int ii = 0; ii < lenore; ii++)
        {
            get = "";
            do
            {
                if(ii >= lenore)
                    break;
                ch = ore.charAt(ii);
                if(ch == ' ')
                    break;
                get = (new StringBuilder()).append(get).append(ch).toString();
                System.out.println(get);
                ii++;
            } while(true);
            if(!get.equals(find))
            {
                tem = (new StringBuilder()).append(tem).append(' ').toString();
                tem = (new StringBuilder()).append(tem).append(get).toString();
            } else
            {
                tem = (new StringBuilder()).append(tem).append(' ').toString();
                tem = (new StringBuilder()).append(tem).append(replace).toString();
            }
            count++;
        }

        System.out.println("AFTER REPLACING");
        ore = tem;
        System.out.println(ore);
    }

    void control()
        throws IOException
    {
        wel();
    }

    String ore;
    int charcount;
    String repl;
    String asa;
    String cuts;
    String fstr;
    String toom;
    int wordcount;
    String strin;
    int len;
    int fl;
    int tlen;
    String temp;
    int word;
    int vowel;
    int line;
    char q;
    int no;
    int m;
    int n;
    int o;
    int p;
    int r;
    BufferedReader br;
}
