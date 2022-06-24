// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   account.java

import java.io.*;
import java.util.Calendar;

class ac
{

    ac()
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        mainway = "";
        ac_no = new int[999];
        name = new String[999];
        d_o_b = new String[999];
        add = new String[999];
        ph_no = new String[999];
        city = new String[999];
        startrang = 0;
        endrang = 0;
        spname = new String[999];
        notes = new String[999];
        clsac = new boolean[999];
        closac = 0;
        bal = new double[999];
        firstbal = new double[999];
        i = 0;
        no = 0;
        temp = 0.0D;
        calend = Calendar.getInstance();
    }

    void calen()
    {
        System.out.print("DATE :: ");
        System.out.print(months[calend.get(2)]);
        System.out.print(" ");
        System.out.print(calend.get(5));
        System.out.print((new StringBuilder()).append(" , ").append(calend.get(1)).toString());
        System.out.print((new StringBuilder()).append("     TIME:").append(calend.get(10)).append(":").toString());
        System.out.print((new StringBuilder()).append(calend.get(12)).append(":").toString());
        System.out.println(calend.get(13));
    }

    void cls()
    {
        for(int clears = 0; clears < 5; clears++)
            System.out.println("");

    }

    void start()
    {
        cls();
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t\002\002        WELCOME       \002\002");
        System.out.println("\t\t\002\002           TO         \002\002");
        System.out.println("\t\t\002\002   MAIN MENU BANKING  \002\002");
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t\002\002  1-CREATE CUSTOMER AC              \002\002");
        System.out.println("\t\t\002\002  2-TRANSACTIONS OF AN ACCOUNT      \002\002");
        System.out.println("\t\t\002\002  3-SEARCH RECORD                   \002\002");
        System.out.println("\t\t\002\002  4-DELETE RECORD                   \002\002");
        System.out.println("\t\t\002\002  5-SHORT RECORD                    \002\002");
        System.out.println("\t\t\002\002  6-RECYCLE BIN                     \002\002");
        System.out.println("\t\t\002\002  7-HELP                            \002\002");
        System.out.println("\t\t\002\002  8-EXIT                            \002\002");
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        calend = Calendar.getInstance();
        calen();
    }

    void rbin()
        throws IOException
    {
        if(closac != 0) goto _L2; else goto _L1
_L1:
        cls();
        calend = Calendar.getInstance();
        calen();
        System.out.println("\t NO ACCESS TO THIS FUNCTION NOW ");
        System.out.println("\t");
        System.out.println("\t AS NO RECORDS ARE DELETED      ");
        control();
          goto _L3
_L2:
        int get;
        cls();
        calend = Calendar.getInstance();
        calen();
        System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\002\002\002\002\002       RECYCLE BIN       \002\002\002\002\002");
        System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\002\002 1- SHOW DELETED RECORDS       \002\002");
        System.out.println("\t\002\002 2- RESTORE                    \002\002");
        System.out.println("\t\002\002 3- HELP                       \002\002");
        System.out.println("\t\002\002 4- BACK TO MAIN               \002\002");
        System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        get = Integer.parseInt(br.readLine());
        get;
        JVM INSTR tableswitch 1 3: default 645
    //                   1 180
    //                   2 288
    //                   3 638;
           goto _L4 _L5 _L6 _L7
_L5:
        cls();
        System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\002\002  SHOWING DELETED RECORDS  \002\002");
        System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        for(int dlr = 0; dlr < i; dlr++)
        {
            if(!clsac[dlr])
                continue;
            bin_show(dlr);
            System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\002\002 enter 1 to continue and 0 to main menu \002\002");
            System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            int chb = Integer.parseInt(br.readLine());
            if(chb == 0)
                control();
        }

        rbin();
        break; /* Loop/switch isn't completed */
_L6:
        int gac;
        int fine;
        cls();
        System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\002\002 ENTER a/c no. TO BE RESTORED \002\002");
        System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        gac = Integer.parseInt(br.readLine());
        if(gac > no || !clsac[gac])
        {
            cls();
            System.out.println("\t");
            System.out.println("\t  INVALID ACCOUNT or");
            System.out.println("\t");
            System.out.println("\t MIGHT BE ALREADY OPEN ");
            System.out.println("\t");
            rbin();
            break; /* Loop/switch isn't completed */
        }
        cls();
        System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\002\002  ENTER A SERVICE FINE OF RS. 1001 \002\002");
        System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        fine = Integer.parseInt(br.readLine());
        if(fine < 1001) goto _L9; else goto _L8
_L8:
        clsac[gac] = false;
        bal[gac] = fine;
        cls();
        System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println((new StringBuilder()).append("\t\002\002 ACCOUNT OF ").append(name[gac]).append(" reopened ").toString());
        System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        calend = Calendar.getInstance();
        calen();
        new StringBuilder();
        notes;
        gac;
        JVM INSTR dup2_x1 ;
        JVM INSTR aaload ;
        append();
        "\nACCOUNT RE-OPENED\n\ndate of re-open::";
        append();
        calend.get(5);
        append();
        " ";
        append();
        months[calend.get(2)];
        append();
        " ";
        append();
        calend.get(1);
        append();
        toString();
        JVM INSTR aastore ;
        control();
        break; /* Loop/switch isn't completed */
_L9:
        cls();
        System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\002\002 WRONG INPUT NOT PERFORMED THE DESIRED OPERATION \002\002");
        System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        rbin();
        break; /* Loop/switch isn't completed */
_L7:
        helpbin();
        break; /* Loop/switch isn't completed */
_L4:
        rbin();
_L3:
    }

    void sort()
        throws IOException
    {
        if(i == 0)
        {
            System.out.println("no access to this function now");
            control();
        } else
        {
            cls();
            calend = Calendar.getInstance();
            calen();
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\002\002\002\002   SORTING      \002\002\002\002");
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\002\002 1. AC NO WISE      \002\002");
            System.out.println("\002\002 2. NAME WISE       \002\002");
            System.out.println("\002\002 3. BALANCE WISE    \002\002");
            System.out.println("\002\002 4. HELP            \002\002");
            System.out.println("\002\002 5. BACK TO MAIN    \002\002");
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println(" INPUT 1......5");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            int chsort = Integer.parseInt(br.readLine());
            switch(chsort)
            {
            case 1: // '\001'
                ac_sort();
                break;

            case 2: // '\002'
                name_sort();
                break;

            case 3: // '\003'
                balance_sort();
                break;

            case 4: // '\004'
                help_sort();
                break;

            case 5: // '\005'
                control();
                break;

            default:
                sort();
                break;
            }
        }
    }

    void balance_sort()
        throws IOException
    {
        calend = Calendar.getInstance();
        calen();
        cls();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002     SORT BY BALANCE    \002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        double bala[] = new double[999];
        System.arraycopy(bal, 0, bala, 0, bal.length);
        for(int bj = 0; bj <= no; bj++)
        {
            for(int bi = 0; bi <= no; bi++)
                if(bal[bi] > bal[bj] && bi != bj)
                {
                    double bt = bala[bj];
                    bala[bj] = bala[bi];
                    bala[bi] = bt;
                }

            bal_show(bala[bj]);
            System.out.println("PRESS ENTER TO CONTINUE");
            br.readLine();
        }

        sort();
    }

    void bal_show(double balpr)
        throws IOException
    {
        for(int po = 0; po <= no; po++)
            if(balpr == bal[po])
                bin_show(po);

    }

    void help_sort()
        throws IOException
    {
        cls();
        calend = Calendar.getInstance();
        calen();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002\002       HELP         \002\002\002 ");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println(" 1ST OPTION WILL HELP YOU GET");
        System.out.println("");
        System.out.println("THE RECORDS SORTED IN AC WISE");
        System.out.println("");
        System.out.println(" BY 2ND OPTION YOU SORT BY NAME WISE.");
        System.out.println("");
        System.out.println("BY 3RD OPTION SORTING IS DONE ON BALANCE WISE");
        System.out.println("");
        System.out.println("IN DECENDING ORDER");
        System.out.println("");
        System.out.println("WITH 4TH OPTION HELP IS PROVIDED");
        System.out.println("");
        System.out.println("5TH OPTION TAKES YOU BACK TO MAIN MENU.");
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("PRESS ENTER TO CONTINUE");
        br.readLine();
        sort();
    }

    void name_sort()
        throws IOException
    {
        cls();
        calend = Calendar.getInstance();
        calen();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002     SORT BY NAME       \002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        String namea[] = new String[999];
        System.arraycopy(name, 0, namea, 0, name.length);
        for(int nj = 0; nj < no; nj++)
        {
            for(int ni = 0; ni < no; ni++)
                if(name[ni].compareToIgnoreCase(name[nj]) < 0)
                {
                    String nt = namea[nj];
                    namea[nj] = namea[ni];
                    namea[ni] = nt;
                }

            showname(namea[nj]);
            System.out.println("PRESS ENTER TO CONTINUE");
            br.readLine();
        }

        sort();
    }

    void ac_sort()
        throws IOException
    {
        cls();
        calend = Calendar.getInstance();
        calen();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002     SORT BY ACCOUNT    \002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        int acsort = 0;
        for(int acst = 0; acst < no; acst++)
            if(acsort == 0)
            {
                bin_show(acst);
                System.out.println("INPUT ZERO 0 TO CONTINUE");
                br.readLine();
            }

        sort();
    }

    void helpbin()
        throws IOException
    {
        cls();
        calend = Calendar.getInstance();
        calen();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002   HELP   \002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002 FIRST OPTION WILL SHOW DELETED RECORD PAGE WISE   \002\002");
        System.out.println("");
        System.out.println("\002\002 SECOND OPTION WILL RESTORE THE DELETED RECORDS    \002\002");
        System.out.println("");
        System.out.println("\002\002 ACCOUNT WISE                                      \002\002");
        System.out.println("");
        System.out.println("\002\002 3RD OPTION PROVIDES HELP AND LAST IS FOR BACK TO MAIN");
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        System.out.println("ENTER ANY KEY TO GO BACK");
        mainway = br.readLine();
        rbin();
    }

    void updac()
        throws IOException
    {
        cls();
        calend = Calendar.getInstance();
        calen();
        if(i == 0)
        {
            System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\002\002 THERE IS NO ACCESS TO THIS FUNCTION NOW \002\002");
            System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\002\002 I THINK THERE IS NO ANY AC CREATED      \002\002");
            System.out.println("\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            control();
        } else
        {
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\002\002  UPDATE SECTION     \002\002\002");
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\002\002 1. DEPOSIT BALANCE    \002");
            System.out.println("\002\002 2. WITHDRAW BALANCE   \002");
            System.out.println("\002\002 3. UPDATE TRANSACTIONS\002");
            System.out.println("\002\002 4. HELP               \002");
            System.out.println("\002\002 5. BACK TO MAIN       \002");
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("ENTER 1,2......5");
            int chupd = Integer.parseInt(br.readLine());
            if(chupd == 1)
                depoam();
            else
            if(chupd == 2)
                witham();
            else
            if(chupd == 3)
            {
                System.out.println("");
                cls();
                System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                System.out.println("\t\t\002\002       UPDATE SECTION        \002\002");
                System.out.println("\t\t\002\002                             \002\002");
                System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                System.out.println("\t\t\002\002 ENTER YOUR AC NUMBER        \002\002");
                System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                t = Integer.parseInt(br.readLine());
                if(t >= i || clsac[t])
                {
                    cls();
                    System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                    System.out.println("\t\t\002\002        INVALID ACCOUNT        \002\002");
                    System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                    updac();
                } else
                {
                    cls();
                    System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                    System.out.println((new StringBuilder()).append("\t\t\002\002 NAME---: ").append(name[t]).append("        ").toString());
                    System.out.println("\t\t\002\002                           ");
                    System.out.println((new StringBuilder()).append("\t\t\002\002 ADDRESS---: ").append(add[t]).append("   ").toString());
                    System.out.println((new StringBuilder()).append("\t\t\002\002 A/C no.  -  ").append(ac_no[t]).append(" ").toString());
                    System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                    System.out.println("");
                    System.out.println("press any key to continue");
                    System.out.println("");
                    br.readLine();
                    cls();
                    System.out.println((new StringBuilder()).append("ACCOUNT OPENED BY\n").append(notes[t]).toString());
                    System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                    System.out.println("\n NOW YOUR BALACE IS    ");
                    System.out.println("");
                    System.out.println((new StringBuilder()).append("Rs. ").append(bal[t]).append("  ONLY").toString());
                    try
                    {
                        FileWriter fw = new FileWriter((new StringBuilder()).append("account").append(t).append(".txt").toString());
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter outFile = new PrintWriter(bw);
                        outFile.println((new StringBuilder()).append("account of::").append(name[t]).append("\n").append("account no->").append(ac_no[t]).append("\nDATE OF BIRTH::").append(d_o_b[t]).append("\nADDRESS:: ").append(add[t]).append("\nPHONE:: ").append(ph_no[t]).append("\ncity::  ").append(city[t]).append("\nSPOUSE NAME::").append(spname[t]).append("\n-----------------------------\nFIRST BALANCE::  ").append(firstbal[t]).append("\n").append(notes[t]).append("\n\n\n\n            FOCUT BANK OF IMRAN ").toString());
                        outFile.close();
                    }
                    catch(IOException e)
                    {
                        System.err.println(e);
                    }
                    updac();
                }
            } else
            if(chupd == 4)
                helpupd();
            else
            if(chupd == 5)
                control();
            else
                updac();
        }
    }

    void helpupd()
        throws IOException
    {
        cls();
        calend = Calendar.getInstance();
        calen();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        System.out.println("1st OPTION WILL HELP YOU DEPOSIT AN AMOUNT IN");
        System.out.println("");
        System.out.println(" YOUR ACCOUNT.2ND WILL HELP YOU WITHDRAW AN AMOUNT");
        System.out.println("");
        System.out.println(" UNTIL YOUR BALANCE REACHES Rs. 999. 3RD OPTION WILL");
        System.out.println("");
        System.out.println("MAKE YOU SEE DETAILED INFORMATION OF YOUR TRANSACTIONS");
        System.out.println("");
        System.out.println("4TH OPTION WIIL GIVE YOU HELP AND LAST OPTION WILL TAKE");
        System.out.println("");
        System.out.println("YOU BACK TO THE MAIN MENU");
        System.out.println("");
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("input any key to exit");
        mainway = br.readLine();
        updac();
    }

    void cr_ac()
        throws IOException
    {
        cls();
        calend = Calendar.getInstance();
        calen();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002\002\002    CREATE CUSTOMER AC        \002\002\002 ");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002\002\002 1. CREATE AC                 \002\002\002");
        System.out.println("\002\002\002\002 2. UPDATE ACCOUNT INFO.      \002\002\002");
        System.out.println("\002\002\002\002 3. HELP                      \002\002\002");
        System.out.println("\002\002\002\002 4. BACK TO MAIN              \002\002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        System.out.println("ENTER 1,2.....4");
        int chcr = Integer.parseInt(br.readLine());
        if(chcr == 1)
        {
            cls();
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\t\002\002\002     CREATE A/c WIZARD       \002\002\002");
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("");
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println((new StringBuilder()).append("\t\t    YOUR AC NO WILL BE ::::-->  ").append(no).toString());
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("");
            cls();
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\tENTER NAME # RECOMMEDED IN BLOCK LETTERS #");
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("");
            name[i] = br.readLine();
            System.out.println("");
            cls();
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\t\002\002\002\002\002     ENTER DATE OF BIRTH  \002\002\002\002");
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            d_o_b[i] = br.readLine();
            System.out.println("");
            cls();
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\t\002\002 IF MARRIED ENTER SPOUSE NAME  \002\002");
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            spname[i] = br.readLine();
            System.out.println("");
            cls();
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\t\002\002  ENTER FULL POSTAL ADDRESS    \002\002");
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("");
            add[i] = br.readLine();
            System.out.println("");
            cls();
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\t\002\002    ENTER PHONE NUMBER         \002\002");
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            ph_no[i] = br.readLine();
            cls();
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\t\002\002     ENTER NAME OF CITY        \002\002");
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            city[i] = br.readLine();
            cls();
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\tNAME OF ARTICLE USED FOR ACCOUNT OPENING");
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("");
            notes[i] = (new StringBuilder()).append("\nACCOUNT OPENED BY ::->  ").append(br.readLine()).append("\n\nOPENED ON::").append(calend.get(5)).append(" ").append(months[calend.get(2)]).append(" ").append(calend.get(1)).toString();
            System.out.println("");
            cls();
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\tENTER BALANCE TO BE DEPOSITED ## Not LESS THAN Rs.999");
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("");
            System.out.println("");
            bal[i] = Double.parseDouble(br.readLine());
            System.out.println("");
            cls();
            for(; bal[i] < 999D; firstbal[i] = bal[i])
            {
                cls();
                System.out.println("\t\t");
                System.out.println("\t\t SORRY! FOR INCONVEIENCE");
                System.out.println("\t\t");
                System.out.println("\t\t");
                System.out.println("\t\t YOU MUST INPUT REQUIRED VALUES ");
                System.out.println("\t\t");
                System.out.println("\t\t");
                System.out.println("\t\t TRY AGAIN!!!!!!!!!!!!!!!!!!!!");
                System.out.println("\t\t");
                System.out.println("\t\t");
                cls();
                System.out.println("\nAND INPUT YOUR BALANCE");
                bal[i] = Double.parseDouble(br.readLine());
            }

            if(bal[i] > 998D)
            {
                System.out.println("\t\t  THANKS FOR USING OUR SERVICES!!!");
                System.out.println("\t\t");
                System.out.println("\t\t  NOW YOU ARE ONE OF OUR MEMBERS");
                System.out.println("\t\t");
                System.out.println((new StringBuilder()).append("\t\t  YOUR ACCOUNT NUMBER A/C is  ::::-> ").append(no).toString());
                System.out.println("\t\t");
                calend = Calendar.getInstance();
                calen();
                ac_no[i] = no;
                clsac[no] = false;
                i++;
                no++;
                System.out.println("");
                System.out.println("");
                control();
            }
        } else
        if(chcr == 2)
            updateinf();
        else
        if(chcr == 3)
            helpcrac();
        else
        if(chcr == 4)
            control();
        else
            cr_ac();
    }

    void closac()
        throws IOException
    {
        int chals;
        int AC;
        cls();
        calend = Calendar.getInstance();
        calen();
        if(i == 0)
        {
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\tTHERE IS NO ACCESS TO THIS FUNCTION NOW");
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\tI THINK THERE IS NO ANY AC CREATED");
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            control();
            break MISSING_BLOCK_LABEL_1169;
        }
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002\002\002      DELETE RECORD       \002\002\002\002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002\002\002 1. AC NO WISE            \002\002\002\002\002");
        System.out.println("\002\002\002\002 2. RANGE OF RECORDS WISE \002\002\002\002\002");
        System.out.println("\002\002\002\002 3. HELP                  \002\002\002\002\002");
        System.out.println("\002\002\002\002 4. BACK TO MAIN          \002\002\002\002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        System.out.println("ENTER 1,2.....4");
        chals = Integer.parseInt(br.readLine());
        cls();
        if(chals != 1)
            break MISSING_BLOCK_LABEL_780;
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t\002\002    ACCOUNT CLOSING WIZARD     \002\002");
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t\002\002 ENTER AC no                   \002\002");
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        AC = Integer.parseInt(br.readLine());
        System.out.println((new StringBuilder()).append("\t\t").append(name[AC]).toString());
        cls();
        System.out.println("IF YOU ARE SURE THEN INPUT 1 ");
        System.out.println("");
        int sure = Integer.parseInt(br.readLine());
        cls();
        if(AC >= no || clsac[AC] || sure != 1)
        {
            System.out.println("either the account is invalid\n\norclosed already");
            closac();
            break MISSING_BLOCK_LABEL_1169;
        }
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t\002\002        DATE OF CLOSING       \002\002\002");
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        calend = Calendar.getInstance();
        calen();
        new StringBuilder();
        notes;
        AC;
        JVM INSTR dup2_x1 ;
        JVM INSTR aaload ;
        append();
        "\nDATE OF CLOSING -";
        append();
        calend.get(5);
        append();
        " ";
        append();
        months[calend.get(2)];
        append();
        " ";
        append();
        calend.get(1);
        append();
        toString();
        JVM INSTR aastore ;
        cls();
        System.out.println("");
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t\002\002\002  ENTER REASON OF CLOSING     \002\002\002");
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        new StringBuilder();
        notes;
        AC;
        JVM INSTR dup2_x1 ;
        JVM INSTR aaload ;
        append();
        "\nREASON OF CLOSING ";
        append();
        br.readLine();
        append();
        toString();
        JVM INSTR aastore ;
        System.out.println("");
        cls();
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t");
        System.out.println("\t\tTHANKS FOR YOU WERE A MEMBER OF OURS");
        System.out.println("\t\t");
        System.out.println("\t\tGIVE US FOR SERVING AGAIN!!!!!!!!");
        System.out.println("\t\t");
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        cls();
        System.out.println("\t\tREALLY WANT TO CLOSE A/C  INPUT ! 1 for yes");
        System.out.println("\t\t");
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        int chec = Integer.parseInt(br.readLine());
        clsac[AC] = chec == 1;
        if(!clsac[AC])
            break MISSING_BLOCK_LABEL_773;
        new StringBuilder();
        notes;
        AC;
        JVM INSTR dup2_x1 ;
        JVM INSTR aaload ;
        append();
        "\n\nyour account is closed now";
        append();
        toString();
        JVM INSTR aastore ;
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t");
        System.out.println(" \t\tYOUR A/C IS CLOSED NOW");
        System.out.println("\t\t");
        System.out.println("\t\t TOTAL MONEY FROM ACCOUNT WITHDRAWN");
        System.out.println("\t\t");
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        bal[AC] = 0.0D;
        closac++;
        control();
        break MISSING_BLOCK_LABEL_1169;
        control();
        break MISSING_BLOCK_LABEL_1169;
        String tempnote;
        int cli;
        if(chals != 2)
            break MISSING_BLOCK_LABEL_1141;
        cls();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("DELETE RECORS RANGE WISE");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002     ENTER STARTING RANGE      \002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        startrang = Integer.parseInt(br.readLine());
        System.out.println("");
        cls();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002        ENTER END RANGE        \002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        endrang = Integer.parseInt(br.readLine());
        cls();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("ENTER THE REASON FOR MASS CLOSING");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        tempnote = br.readLine();
        cls();
        cli = startrang;
_L2:
        if(cli > endrang)
            break; /* Loop/switch isn't completed */
        clsac[cli] = true;
        bal[cli] = 0.0D;
        new StringBuilder();
        notes;
        cli;
        JVM INSTR dup2_x1 ;
        JVM INSTR aaload ;
        append();
        "\nREASON OF CLOSING :: closed on";
        append();
        calend.get(5);
        append();
        " ";
        append();
        months[calend.get(2)];
        append();
        " ";
        append();
        calend.get(1);
        append();
        tempnote;
        append();
        toString();
        JVM INSTR aastore ;
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t");
        System.out.println((new StringBuilder()).append("account of Mr. / Mrs.  ").append(name[cli]).append("   closed").toString());
        System.out.println("\t\t");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        cli++;
        if(true) goto _L2; else goto _L1
_L1:
        control();
        break MISSING_BLOCK_LABEL_1169;
        if(chals == 3)
            helpclsac();
        else
        if(chals == 4)
            control();
        else
            closac();
    }

    void searchac()
        throws IOException
    {
        if(i == 0)
        {
            System.out.println("NO ACCESS NOW");
            control();
        } else
        {
            cls();
            calend = Calendar.getInstance();
            calen();
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\002\002\002\002\002\002   SEARCH RECORD  \002\002\002\002");
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\002\002\002\0021 AC NO. WISE       \002\002\002\002");
            System.out.println("\002\002\002\0022 NAME WISE         \002\002\002\002");
            System.out.println("\002\002\002\0023 HELP              \002\002\002\002");
            System.out.println("\002\002\002\0024 BACK TO MAIN      \002\002\002\002");
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("ENTER 1,2.......6");
            int chser = Integer.parseInt(br.readLine());
            cls();
            switch(chser)
            {
            case 1: // '\001'
                System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                System.out.println("ENTER <ACCOUNT NO> TO SEARCH");
                System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                int chsac = Integer.parseInt(br.readLine());
                bin_show(chsac);
                br.readLine();
                control();
                break;

            case 2: // '\002'
                System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                System.out.println("ENTER <name> TO SEARCH");
                System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                String hsac = br.readLine();
                showname(hsac);
                control();
                break;

            case 3: // '\003'
                helpsearch();
                break;

            case 4: // '\004'
                control();
                break;

            default:
                searchac();
                break;
            }
        }
    }

    void bin_show(int acnumber)
        throws IOException
    {
        cls();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t");
        System.out.println((new StringBuilder()).append("\016\016  a/c NO-> ").append(acnumber).toString());
        System.out.println("\t\t");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t");
        System.out.println((new StringBuilder()).append("\016\016  NAME -> ").append(name[acnumber]).toString());
        System.out.println("\t\t");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t");
        System.out.println((new StringBuilder()).append("\016\016  ADD  ->").append(add[acnumber]).toString());
        System.out.println("\t\t");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        br.readLine();
        System.out.println("\t\t");
        System.out.println((new StringBuilder()).append("\016\016  NOTES->").append(notes[acnumber]).toString());
        System.out.println("\t\t");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t");
        System.out.println((new StringBuilder()).append("\016\016  BAL  ->").append(bal[acnumber]).toString());
        System.out.println("\t\t");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
    }

    void showname(String aname)
        throws IOException
    {
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t");
        System.out.println("\016\016\016    SHOWING NAME   \016\016\016");
        System.out.println("\t\t");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        for(int anm = 0; anm < no; anm++)
            if(name[anm].equalsIgnoreCase(aname))
                bin_show(anm);

        System.out.println("");
    }

    void helpsearch()
        throws IOException
    {
        cls();
        calend = Calendar.getInstance();
        calen();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002              HELP                   \002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("1ST OPTION FOR SEARCHING A RECORD BY AC NO");
        System.out.println("\t\t");
        System.out.println("2ND OPTION FOR SEARCHING A RECORD BY NAME");
        System.out.println("\t\t");
        System.out.println("3RD OPTION FOR HELP");
        System.out.println("\t\t");
        System.out.println("4TH FOR BACK TO MAIN");
        System.out.println("\t\t");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("PRESS ANY KEY TO BACK");
        mainway = br.readLine();
        searchac();
    }

    void depoam()
        throws IOException
    {
        cls();
        calend = Calendar.getInstance();
        calen();
        if(i == 0)
        {
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\tTHERE IS NO ACCESS TO THIS FUNCTION NOW");
            System.out.println("\t\tI THINK THERE IS NO ANY AC CREATED");
            System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            control();
            break MISSING_BLOCK_LABEL_625;
        }
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002 AMOUNT DEPOSITING WIZARD \002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println(" \002\002  ENTER YOUR AC NO.   \002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        t = Integer.parseInt(br.readLine());
        cls();
        if(clsac[t] || t >= i)
        {
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\002\002       INVALID ACCOUNT  \002\002");
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            control();
            break MISSING_BLOCK_LABEL_625;
        }
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t");
        System.out.println((new StringBuilder()).append("NAME- ").append(name[t]).toString());
        System.out.println("\t\t");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t");
        System.out.println((new StringBuilder()).append("NOW YOUR BALANCE IS ").append(bal[t]).toString());
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("ENTER SUM OF AMOUNT TO DEPOSIT");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        temp = Double.parseDouble(br.readLine());
        System.out.println("");
        bal[t] += temp;
        cls();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("ENTER DATE NOTES AND OTHERS");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        calend = Calendar.getInstance();
        calen();
        new StringBuilder();
        notes;
        t;
        JVM INSTR dup2_x1 ;
        JVM INSTR aaload ;
        append();
        "\n";
        append();
        calend.get(5);
        append();
        " ";
        append();
        months[calend.get(2)];
        append();
        " ";
        append();
        calend.get(1);
        append();
        " ";
        append();
        " DEPOSITED Rs.";
        append();
        temp;
        append();
        "  bal:: Rs. ";
        append();
        bal[t];
        append();
        toString();
        JVM INSTR aastore ;
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        cls();
        System.out.println((new StringBuilder()).append("NOW YOUR BALANCE IS ").append(bal[t]).toString());
        System.out.println("\t\t");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        control();
    }

    void witham()
        throws IOException
    {
        cls();
        calend = Calendar.getInstance();
        calen();
        if(i == 0)
        {
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\t");
            System.out.println("THERE IS NO ACCESS TO THIS FUNCTION NOW");
            System.out.println("\t\t");
            System.out.println("I THINK THERE IS NO ANY AC CREATED");
            System.out.println("\t\t");
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            control();
            break MISSING_BLOCK_LABEL_745;
        }
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("AMOUNT WITHDRAWING WIZARD");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("     ENTER YOUR AC NO.");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        t = Integer.parseInt(br.readLine());
        cls();
        if(clsac[t] || t >= i)
        {
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("      INVALID ACCOUNT");
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            control();
            break MISSING_BLOCK_LABEL_745;
        }
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t");
        System.out.println((new StringBuilder()).append("NAME- ").append(name[t]).toString());
        System.out.println("\t\t");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\t");
        System.out.println((new StringBuilder()).append("NOW YOUR BALANCE IS ").append(bal[t]).toString());
        System.out.println("\t\t");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        if(bal[t] < 999D)
        {
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println("\t\t");
            System.out.println("YOUR DEPOSIT IS SO LESS THAT YOU CAN'T WITHDRAW");
            System.out.println("\t\t");
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            control();
            break MISSING_BLOCK_LABEL_745;
        }
        cls();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("ENTER SUM OF AMOUNT TO WITHDRAW");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        temp = Double.parseDouble(br.readLine());
        double d = bal[t] - temp;
        if(d < 999D)
        {
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            System.out.println(" YOUR AMOUNT EXCEEDS THE MAX VALUE     ");
            System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
            control();
            break MISSING_BLOCK_LABEL_745;
        }
        bal[t] -= temp;
        System.out.println("");
        cls();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("   DATE NOTES AND OTHERS");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        calend = Calendar.getInstance();
        calen();
        new StringBuilder();
        notes;
        t;
        JVM INSTR dup2_x1 ;
        JVM INSTR aaload ;
        append();
        "\n";
        append();
        calend.get(5);
        append();
        " ";
        append();
        months[calend.get(2)];
        append();
        " ";
        append();
        calend.get(1);
        append();
        " ";
        append();
        " WITHDRAWN Rs ";
        append();
        temp;
        append();
        "  bal:: Rs. ";
        append();
        bal[t];
        append();
        toString();
        JVM INSTR aastore ;
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        cls();
        System.out.println((new StringBuilder()).append("NOW YOUR BALANCE IS ").append(bal[t]).toString());
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        control();
    }

    void updateinf()
        throws IOException
    {
        cls();
        calend = Calendar.getInstance();
        calen();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("UPDATE INFORMATION SECTION");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("ENTER ACCOUNT NUMBER TO BE UPDATED IN INFORMATION");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        int ninf = Integer.parseInt(br.readLine());
        cls();
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\tENTER  (new) NAME # RECOMMEDED IN BLOCK LETTERS #");
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        name[ninf] = br.readLine();
        System.out.println("");
        cls();
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\tENTER (new) DATE OF BIRTH");
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        d_o_b[ninf] = br.readLine();
        System.out.println("");
        cls();
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\tIF MARRIED ENTER SPOUSE NAME");
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        System.out.println("");
        spname[ninf] = br.readLine();
        System.out.println("");
        System.out.println("");
        cls();
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\t\tENTER (new) FULL POSTAL ADDRESS");
        System.out.println("\t\t\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        add[ninf] = br.readLine();
        System.out.println("");
        cls();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println(" ENTER(new)  PHONE NUMBER");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        ph_no[ninf] = br.readLine();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("ENTER (new) NAME OF CITY");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        city[ninf] = br.readLine();
        System.out.println("");
        cls();
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        System.out.println("THANKS FOR UPDATING YOUR INFORMATION");
        System.out.println("");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        control();
    }

    void helpa()
        throws IOException
    {
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002                   HELP                    \002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("THE MAIN MENU IS DEVIDED INTO SUB MENUS.IF YOU WANT TO CREATE A");
        System.out.println("");
        System.out.println("NEW ACCOUNT IN THIS PROGRAM THEN CHOOSE 1 AND PRESSENTER AND INPUT");
        System.out.println("");
        System.out.println("THE DESIRED VALUSES.IF YOU COMMIT A MISTAKE THEN YOU CAN UPGRADE IT");
        System.out.println("");
        System.out.println("BY MAKING USE OF UFDATE INFORMATION OPTION.");
        System.out.println("");
        System.out.println("IN 2ND OPTION YOU CAN UPDATE THE TRANSACTIONS DONE IN YOUR ACCOUNT.");
        System.out.println("");
        System.out.println("AN EXTRA FEATURE OF UPDATE IS THAT IT CREATES A TEXT DOCUMENT FOR");
        System.out.println("");
        System.out.println("YOUR ACCOUNT NAMING ACCOUNT+[AC NUMBER].TXT WHERE AC NO IS YOUR ACNO");
        System.out.println("");
        System.out.println("THERE YOU CAN SEE THE PROCEEDINGS OF YOUR ACCOUNT");
        System.out.println("");
        System.out.println("THE TEXT  FILE WIIL BE SITUATED IN THE FOLDER WHERE YOUR PROGRAM'S CODING");
        System.out.println("");
        System.out.println("IS SITUATED");
        System.out.println("");
        System.out.println("3RD OPTION WILL SEARCH FOR EXISTANCE OF AN ACCOUNT");
        System.out.println("");
        System.out.println("4TH OPTION WILL DELETE AN ACCOUNT FROM EXISTANCE TO THE RECYCLE BIN.");
        System.out.println("");
        System.out.println("AT A LATER DATE YOU CAN RESTORE A DELETED ACCOUNT BY GIVING A SERVICE FINE");
        System.out.println("");
        System.out.println("5TH OPTION SHORTS THE RECORDS IN A PRIPER WAY ACCORDING TO TO THE CRITERIA");
        System.out.println("");
        System.out.println("CHOSEN BY THE USER");
        System.out.println("");
        System.out.println("THE 7TH OPTION LETS YOU COME IN THE HELP FILE");
        System.out.println("");
        System.out.println("AND LAST OPTION EXITS THE PROGRAM");
        System.out.println("");
        System.out.println("A WRONG CHOICE REPATS THE MAIN MENU.");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println(" NOW PRESS ANY KEY TO GO TO MAIN MENU");
        mainway = br.readLine();
        control();
    }

    void helpcrac()
        throws IOException
    {
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("                 help");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("THE CREATE CUSTOMER ac MENU HELPS YOU CREATE ");
        System.out.println("");
        System.out.println("AN AC . IF YOU SELECT 1 THEN NEW AC IS CREATED");
        System.out.println("");
        System.out.println("AFTER SOME PROCEDURES AND 2ND OPTION UPDATES ");
        System.out.println("");
        System.out.println("INFORMATIN IN A EXISTING ACCOUNT.");
        System.out.println("");
        System.out.println("3RD OPTION PROVIDES HELP AND  LAST OPTION");
        System.out.println("");
        System.out.println("TAKES YOU TO MAIN MENU.");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("PRESS ANY KEY TO EXIT TO MAIN MENU");
        mainway = br.readLine();
        cr_ac();
    }

    void helpclsac()
        throws IOException
    {
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("             HELP                  ");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("1st option DELETES A SINGLE ACCOUNT ");
        System.out.println("");
        System.out.println("WHOSE NUMBER IS GIVEN BY THE USER.");
        System.out.println("");
        System.out.println("SECOND OPTION DELETES A RANGE OF ACCOUNTS");
        System.out.println("");
        System.out.println("WHOSE RANGE ARE GIVEN BY THE USER");
        System.out.println("");
        System.out.println("3RD OPTION IS FOR HELP AND 4TH FOR");
        System.out.println("");
        System.out.println("BACK TO MAIN.");
        System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
        System.out.println("");
        System.out.println("PRESS ANY KEY TO BACK TO MAIN");
        mainway = br.readLine();
        closac();
    }

    void control()
        throws IOException
    {
        int q = 0;
        start();
        System.out.println("      ");
        System.out.println("ENTER ! 1,2.........8      ");
        System.out.println("      ");
        try
        {
            q = Integer.parseInt(br.readLine());
            switch(q)
            {
            case 1: // '\001'
                cr_ac();
                break;

            case 2: // '\002'
                updac();
                break;

            case 3: // '\003'
                searchac();
                break;

            case 4: // '\004'
                closac();
                break;

            case 5: // '\005'
                sort();
                break;

            case 6: // '\006'
                rbin();
                break;

            case 7: // '\007'
                helpa();
                break;

            case 8: // '\b'
                cls();
                System.out.println("\002\002\002\002\002\002\002\002   \002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                System.out.println("\002\002\002\002\002\002\002\002   \002\002     \002\002\002     \002\002  \002\002\002\002\002  \002\002\002\002      \002\002\002 ");
                System.out.println("   \002\002  \002\002  \002\002  \002\002  \002\002\002    \002\002  \002\002\002   \002\002\002        \002\002\002");
                System.out.println("   \002\002  \002\002  \002\002  \002\002  \002\002\002\002   \002\002  \002   \002\002\002\002\002  \002\002\002\002\002\002\002\002\002");
                System.out.println("   \002\002  \002\002  \002\002  \002\002  \002\002 \002\002  \002\002    \002\002\002\002\002\002\002  \002\002\002\002\002\002\002\002\002");
                System.out.println("   \002\002  \002\002\002\002\002\002      \002\002  \002\002 \002\002   \002\002\002\002\002\002\002\002\002        \002\002");
                System.out.println("   \002\002  \002\002  \002\002  \002\002  \002\002   \002\002\002\002  \002  \002\002\002\002\002\002\002\002\002\002\002\002\002   \002");
                System.out.println("   \002\002  \002\002  \002\002  \002\002  \002\002    \002\002\002  \002\002   \002\002\002\002\002\002\002\002\002\002\002   \002");
                System.out.println("   \002\002  \002\002  \002\002  \002\002  \002\002     \002\002  \002\002\002   \002\002\002        \002\002\002 ");
                System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                System.out.println("\002\002\002\002     DESIGNING   CONCEPT OF IMRAN       \002\002\002\002\002\002");
                System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                System.out.println("CONSTRUCTIVE CRITICISM AND SUGGESTIONS ARE WELCOME");
                System.out.println("\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002");
                cls();
                break;

            default:
                System.out.println("WRONG CHOICE !!!!!!");
                control();
                break;
            }
        }
        catch(NumberFormatException e)
        {
            control();
        }
    }

    BufferedReader br;
    String mainway;
    int ac_no[];
    String name[];
    String d_o_b[];
    String add[];
    String ph_no[];
    String city[];
    int startrang;
    int endrang;
    String spname[];
    String notes[];
    boolean clsac[];
    int closac;
    double bal[];
    double firstbal[];
    int i;
    int no;
    int t;
    double temp;
    String months[] = {
        "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", 
        "Nov", "Dec"
    };
    Calendar calend;
}
