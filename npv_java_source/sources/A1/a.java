package A1;

/* JADX INFO: loaded from: classes.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final A1.a.C0006a[] f194a = {new A1.a.C0006a(99, 99, -1, -1), new A1.a.C0006a(35, 36, -1, -1), new A1.a.C0006a(71, 72, -1, -1), new A1.a.C0006a(96, 96, -1, -1), new A1.a.C0006a(85, 86, -1, -1), new A1.a.C0006a(90, 96, -1, -1), new A1.a.C0006a(80, 81, -1, -1), new A1.a.C0006a(6, 6, -1, -1), new A1.a.C0006a(20, 20, -1, -1), new A1.a.C0006a(19, 19, -1, -1), new A1.a.C0006a(32, 34, -1, -1), new A1.a.C0006a(96, 96, -1, -1), new A1.a.C0006a(30, 31, -1, -1), new A1.a.C0006a(96, 96, -1, -1), new A1.a.C0006a(96, 96, -1, -1), new A1.a.C0006a(50, 52, -1, -1), new A1.a.C0006a(83, 83, -1, -1), new A1.a.C0006a(60, 62, -1, -1), new A1.a.C0006a(46, 47, -1, -1), new A1.a.C0006a(66, 67, 73, -1), new A1.a.C0006a(40, 42, -1, -1), new A1.a.C0006a(70, 71, -1, -1), new A1.a.C0006a(1, 2, -1, -1), new A1.a.C0006a(20, 21, -1, -1), new A1.a.C0006a(3, 4, -1, -1), new A1.a.C0006a(96, 96, -1, -1), new A1.a.C0006a(48, 49, -1, -1), new A1.a.C0006a(55, 56, -1, -1), new A1.a.C0006a(63, 65, -1, -1), new A1.a.C0006a(96, 96, -1, -1), new A1.a.C0006a(38, 39, -1, -1), new A1.a.C0006a(55, 56, -1, -1), new A1.a.C0006a(27, 28, -1, -1), new A1.a.C0006a(58, 58, -1, -1), new A1.a.C0006a(68, 69, -1, -1), new A1.a.C0006a(3, 4, -1, -1), new A1.a.C0006a(7, 8, -1, -1), new A1.a.C0006a(87, 88, 86, -1), new A1.a.C0006a(88, 89, 96, -1), new A1.a.C0006a(10, 14, 0, 6), new A1.a.C0006a(43, 45, -1, -1), new A1.a.C0006a(73, 74, -1, -1), new A1.a.C0006a(97, 97, -1, -1), new A1.a.C0006a(15, 19, -1, -1), new A1.a.C0006a(6, 6, 0, 9), new A1.a.C0006a(96, 96, -1, -1), new A1.a.C0006a(2, 2, -1, -1), new A1.a.C0006a(29, 29, -1, -1), new A1.a.C0006a(57, 57, -1, -1), new A1.a.C0006a(37, 38, -1, -1), new A1.a.C0006a(75, 79, 87, 88), new A1.a.C0006a(84, 84, -1, -1), new A1.a.C0006a(22, 24, 20, -1), new A1.a.C0006a(6, 9, -1, -1), new A1.a.C0006a(5, 5, -1, -1), new A1.a.C0006a(98, 99, -1, -1), new A1.a.C0006a(53, 54, -1, -1), new A1.a.C0006a(24, 26, -1, -1), new A1.a.C0006a(82, 83, -1, -1)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.regex.Pattern f195b = java.util.regex.Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.regex.Pattern f196c = java.util.regex.Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.regex.Pattern f197d = java.util.regex.Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.regex.Pattern f198e = java.util.regex.Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.regex.Pattern f199f = java.util.regex.Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.regex.Pattern f200g = java.util.regex.Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: A1.a$a, reason: collision with other inner class name */
    private static class C0006a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f204d;

        C0006a(int i6, int i10, int i11, int i12) {
            this.f201a = i6;
            this.f202b = i10;
            this.f203c = i11;
            this.f204d = i12;
        }

        boolean a(java.lang.String str) {
            int i6 = java.lang.Integer.parseInt(str.substring(0, 2));
            return (this.f201a <= i6 && i6 <= this.f202b) || i6 == this.f203c || i6 == this.f204d;
        }
    }

    private static int a(java.lang.String str, java.util.regex.MatchResult matchResult) {
        int length;
        java.util.regex.MatchResult matchResultG;
        int iEnd = matchResult.end();
        java.util.regex.Matcher matcher = f195b.matcher(str);
        java.lang.String strGroup = "";
        int i6 = -1;
        int iEnd2 = -1;
        int i10 = 1;
        int i11 = 1;
        boolean z6 = true;
        boolean z10 = false;
        while (iEnd < str.length()) {
            if (!matcher.find(iEnd)) {
                length = str.length();
            } else if (matcher.end() - matcher.start() <= 25) {
                while (iEnd < matcher.start()) {
                    int i12 = iEnd + 1;
                    if ("\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(iEnd)) != -1) {
                        i10++;
                    }
                    iEnd = i12;
                }
                if (i10 > 5 || (i11 = i11 + 1) > 14) {
                    break;
                }
                if (f(str, iEnd) == null) {
                    if (!d(matcher.group(0))) {
                        if (i11 == 5 && !z10) {
                            iEnd = matcher.end();
                            break;
                        }
                        if (z10 && i11 > 4 && (matchResultG = g(str, iEnd)) != null) {
                            if (strGroup.equals("et") && matchResultG.group(0).equals("al")) {
                                iEnd = matchResultG.end();
                                break;
                            }
                            java.util.regex.Matcher matcher2 = f195b.matcher(str);
                            if (!matcher2.find(matchResultG.end())) {
                                iEnd2 = matchResultG.end();
                            } else if (e(matcher2.group(0), matchResultG)) {
                                return matcher2.end();
                            }
                        }
                    } else {
                        z10 = true;
                    }
                    z6 = false;
                } else {
                    if (z6 && i10 > 1) {
                        return -iEnd;
                    }
                    if (i6 == -1) {
                        i6 = iEnd;
                    }
                }
                strGroup = matcher.group(0);
                iEnd = matcher.end();
            } else {
                length = matcher.end();
            }
            return -length;
        }
        if (iEnd2 > 0) {
            return iEnd2;
        }
        if (i6 <= 0) {
            i6 = iEnd;
        }
        return -i6;
    }

    private static boolean b(java.lang.String str) {
        int i6 = 0;
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (java.lang.Character.isDigit(str.charAt(i10))) {
                i6++;
            }
        }
        if (i6 > 5) {
            return false;
        }
        java.util.regex.Matcher matcher = f199f.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int i11 = java.lang.Integer.parseInt(matcher.group(1));
        if (i11 == 0) {
            return false;
        }
        java.lang.String lowerCase = matcher.group(2).toLowerCase(java.util.Locale.getDefault());
        int i12 = i11 % 10;
        if (i12 == 1) {
            return lowerCase.equals(i11 % 100 != 11 ? "st" : "th");
        }
        if (i12 == 2) {
            return lowerCase.equals(i11 % 100 != 12 ? "nd" : "th");
        }
        if (i12 != 3) {
            return lowerCase.equals("th");
        }
        return lowerCase.equals(i11 % 100 != 13 ? "rd" : "th");
    }

    static java.lang.String c(java.lang.String str) {
        java.util.regex.Matcher matcher = f196c.matcher(str);
        int iEnd = 0;
        while (matcher.find(iEnd)) {
            if (b(matcher.group(0))) {
                int iStart = matcher.start();
                int iA = a(str, matcher);
                if (iA > 0) {
                    return str.substring(iStart, iA);
                }
                iEnd = -iA;
            } else {
                iEnd = matcher.end();
            }
        }
        return null;
    }

    public static boolean d(java.lang.String str) {
        return f198e.matcher(str).matches();
    }

    private static boolean e(java.lang.String str, java.util.regex.MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int iGroupCount = matchResult.groupCount();
        while (iGroupCount > 0) {
            int i6 = iGroupCount - 1;
            if (matchResult.group(iGroupCount) != null) {
                iGroupCount = i6;
                break;
            }
            iGroupCount = i6;
        }
        return f200g.matcher(str).matches() && f194a[iGroupCount].a(str);
    }

    public static java.util.regex.MatchResult f(java.lang.String str, int i6) {
        if (i6 > 0 && ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(i6 - 1)) == -1) {
            return null;
        }
        java.util.regex.Matcher matcherRegion = f196c.matcher(str).region(i6, str.length());
        if (matcherRegion.lookingAt()) {
            java.util.regex.MatchResult matchResult = matcherRegion.toMatchResult();
            if (b(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }

    public static java.util.regex.MatchResult g(java.lang.String str, int i6) {
        if (i6 > 0 && ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(i6 - 1)) == -1) {
            return null;
        }
        java.util.regex.Matcher matcherRegion = f197d.matcher(str).region(i6, str.length());
        if (matcherRegion.lookingAt()) {
            return matcherRegion.toMatchResult();
        }
        return null;
    }
}
