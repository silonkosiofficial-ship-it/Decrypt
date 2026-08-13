package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3115a5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.regex.Pattern f34000c = java.util.regex.Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.regex.Pattern f34001d = java.util.regex.Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f34002a = new com.google.android.gms.internal.ads.C5128sR();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.StringBuilder f34003b = new java.lang.StringBuilder();

    static java.lang.String a(com.google.android.gms.internal.ads.C5128sR c5128sR, java.lang.StringBuilder sb) {
        c(c5128sR);
        if (c5128sR.r() == 0) {
            return null;
        }
        java.lang.String strD = d(c5128sR, sb);
        if (!"".equals(strD)) {
            return strD;
        }
        char C10 = (char) c5128sR.C();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(C10);
        return sb2.toString();
    }

    static void c(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        while (true) {
            for (boolean z6 = true; c5128sR.r() > 0 && z6; z6 = false) {
                char c6 = (char) c5128sR.n()[c5128sR.t()];
                if (c6 == '\t' || c6 == '\n' || c6 == '\f' || c6 == '\r' || c6 == ' ') {
                    c5128sR.m(1);
                } else {
                    int iT = c5128sR.t();
                    int iU = c5128sR.u();
                    byte[] bArrN = c5128sR.n();
                    if (iT + 2 <= iU) {
                        int i6 = iT + 1;
                        if (bArrN[iT] == 47) {
                            int i10 = iT + 2;
                            if (bArrN[i6] == 42) {
                                while (true) {
                                    int i11 = i10 + 1;
                                    if (i11 >= iU) {
                                        break;
                                    }
                                    if (((char) bArrN[i10]) == '*' && ((char) bArrN[i11]) == '/') {
                                        iU = i10 + 2;
                                        i10 = iU;
                                    } else {
                                        i10 = i11;
                                    }
                                }
                                c5128sR.m(iU - c5128sR.t());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static java.lang.String d(com.google.android.gms.internal.ads.C5128sR c5128sR, java.lang.StringBuilder sb) {
        char c6;
        sb.setLength(0);
        int iT = c5128sR.t();
        int iU = c5128sR.u();
        loop0: while (true) {
            boolean z6 = false;
            while (true) {
                if (iT < iU && !z6) {
                    c6 = (char) c5128sR.n()[iT];
                    if ((c6 >= 'A' && c6 <= 'Z') || ((c6 >= 'a' && c6 <= 'z') || ((c6 >= '0' && c6 <= '9') || c6 == '#' || c6 == '-' || c6 == '.' || c6 == '_'))) {
                        break;
                    }
                    z6 = true;
                } else {
                    break loop0;
                }
            }
            sb.append(c6);
            iT++;
        }
        c5128sR.m(iT - c5128sR.t());
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x0204  */
    /* JADX WARN: Code duplicated, block: B:107:0x0209  */
    /* JADX WARN: Code duplicated, block: B:109:0x0211  */
    /* JADX WARN: Code duplicated, block: B:113:0x0221  */
    /* JADX WARN: Code duplicated, block: B:116:0x0229  */
    /* JADX WARN: Code duplicated, block: B:118:0x0231  */
    /* JADX WARN: Code duplicated, block: B:120:0x0239  */
    /* JADX WARN: Code duplicated, block: B:121:0x023e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0246  */
    /* JADX WARN: Code duplicated, block: B:124:0x024b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0253  */
    /* JADX WARN: Code duplicated, block: B:128:0x025b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0260  */
    /* JADX WARN: Code duplicated, block: B:131:0x0268  */
    /* JADX WARN: Code duplicated, block: B:133:0x0270  */
    /* JADX WARN: Code duplicated, block: B:134:0x0275  */
    /* JADX WARN: Code duplicated, block: B:136:0x027d  */
    /* JADX WARN: Code duplicated, block: B:138:0x028d  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:143:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:149:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:154:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:155:0x02df  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x02e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:175:0x02eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0045  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e6  */
    /* JADX WARN: Instruction removed from duplicated block: B:138:0x028d, please report this as an issue */
    public final java.util.List b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        java.lang.String strTrim;
        java.lang.String string;
        java.util.regex.Matcher matcher;
        java.lang.String strGroup;
        int iHashCode;
        byte b6;
        boolean z6;
        int i6 = -1;
        int i10 = 0;
        this.f34003b.setLength(0);
        int iT = c5128sR.t();
        while (!android.text.TextUtils.isEmpty(c5128sR.P(java.nio.charset.StandardCharsets.UTF_8))) {
        }
        this.f34002a.j(c5128sR.n(), c5128sR.t());
        this.f34002a.l(iT);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f34002a;
            java.lang.StringBuilder sb = this.f34003b;
            c(c5128sR2);
            if (c5128sR2.r() >= 5 && "::cue".equals(c5128sR2.b(5, java.nio.charset.StandardCharsets.UTF_8))) {
                int iT2 = c5128sR2.t();
                java.lang.String strA = a(c5128sR2, sb);
                if (strA == null) {
                    strTrim = null;
                } else if ("{".equals(strA)) {
                    c5128sR2.l(iT2);
                    strTrim = "";
                } else {
                    if ("(".equals(strA)) {
                        int iT3 = c5128sR2.t();
                        int iU = c5128sR2.u();
                        int i11 = i10;
                        while (iT3 < iU && i11 == 0) {
                            int i12 = iT3 + 1;
                            i11 = ((char) c5128sR2.n()[iT3]) == ')' ? 1 : i10;
                            iT3 = i12;
                        }
                        strTrim = c5128sR2.b((iT3 + i6) - c5128sR2.t(), java.nio.charset.StandardCharsets.UTF_8).trim();
                    } else {
                        strTrim = null;
                    }
                    if (!")".equals(a(c5128sR2, sb))) {
                        strTrim = null;
                    }
                }
            } else {
                strTrim = null;
            }
            if (strTrim == null || !"{".equals(a(this.f34002a, this.f34003b))) {
                break;
            }
            com.google.android.gms.internal.ads.C3225b5 c3225b5 = new com.google.android.gms.internal.ads.C3225b5();
            if (!"".equals(strTrim)) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != i6) {
                    java.util.regex.Matcher matcher2 = f34000c.matcher(strTrim.substring(iIndexOf));
                    if (matcher2.matches()) {
                        java.lang.String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        c3225b5.w(strGroup2);
                    }
                    strTrim = strTrim.substring(i10, iIndexOf);
                }
                int i13 = com.google.android.gms.internal.ads.EW.f27061a;
                java.lang.String[] strArrSplit = strTrim.split("\\.", i6);
                java.lang.String str = strArrSplit[i10];
                int iIndexOf2 = str.indexOf(35);
                if (iIndexOf2 != i6) {
                    c3225b5.v(str.substring(i10, iIndexOf2));
                    c3225b5.u(str.substring(iIndexOf2 + 1));
                } else {
                    c3225b5.v(str);
                }
                int length = strArrSplit.length;
                if (length > 1) {
                    c3225b5.t((java.lang.String[]) java.util.Arrays.copyOfRange(strArrSplit, 1, length));
                }
            }
            int i14 = i10;
            java.lang.String strA2 = null;
            while (i14 == 0) {
                com.google.android.gms.internal.ads.C5128sR c5128sR3 = this.f34002a;
                java.lang.StringBuilder sb2 = this.f34003b;
                int iT4 = c5128sR3.t();
                strA2 = a(c5128sR3, sb2);
                i14 = (strA2 == null || "}".equals(strA2)) ? 1 : i10;
                if (i14 == 0) {
                    this.f34002a.l(iT4);
                    com.google.android.gms.internal.ads.C5128sR c5128sR4 = this.f34002a;
                    java.lang.StringBuilder sb3 = this.f34003b;
                    c(c5128sR4);
                    java.lang.String strD = d(c5128sR4, sb3);
                    if (!"".equals(strD) && ":".equals(a(c5128sR4, sb3))) {
                        c(c5128sR4);
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        int i15 = i10;
                        while (true) {
                            if (i15 != 0) {
                                string = sb4.toString();
                                break;
                            }
                            int iT5 = c5128sR4.t();
                            java.lang.String strA3 = a(c5128sR4, sb3);
                            if (strA3 == null) {
                                string = null;
                                break;
                            }
                            if ("}".equals(strA3) || ";".equals(strA3)) {
                                c5128sR4.l(iT5);
                                i15 = 1;
                            } else {
                                sb4.append(strA3);
                            }
                        }
                        if (string != null && !"".equals(string)) {
                            int iT6 = c5128sR4.t();
                            java.lang.String strA4 = a(c5128sR4, sb3);
                            if (";".equals(strA4)) {
                                if ("color".equals(strD)) {
                                    c3225b5.l(com.google.android.gms.internal.ads.AbstractC4669oE.a(string));
                                } else if ("background-color".equals(strD)) {
                                    c3225b5.i(com.google.android.gms.internal.ads.AbstractC4669oE.a(string));
                                } else if ("ruby-position".equals(strD)) {
                                    if ("over".equals(string)) {
                                        c3225b5.q(1);
                                    } else if ("under".equals(string)) {
                                        c3225b5.q(2);
                                    }
                                } else if ("text-combine-upright".equals(strD)) {
                                    if ("all".equals(string)) {
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                    c3225b5.k(z6);
                                } else if ("text-decoration".equals(strD)) {
                                    if ("underline".equals(string)) {
                                        c3225b5.r(true);
                                    }
                                } else if ("font-family".equals(strD)) {
                                    c3225b5.m(string);
                                } else if ("font-weight".equals(strD)) {
                                    if ("bold".equals(string)) {
                                        c3225b5.j(true);
                                    }
                                } else if ("font-style".equals(strD)) {
                                    if ("italic".equals(string)) {
                                        c3225b5.p(true);
                                    }
                                } else if ("font-size".equals(strD)) {
                                    matcher = f34001d.matcher(com.google.android.gms.internal.ads.AbstractC3723fg0.a(string));
                                    if (matcher.matches()) {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592) {
                                                    b6 = -1;
                                                } else {
                                                    b6 = 0;
                                                }
                                            } else if (strGroup.equals("em")) {
                                                b6 = 1;
                                            } else {
                                                b6 = -1;
                                            }
                                        } else if (strGroup.equals("%")) {
                                            b6 = 2;
                                        } else {
                                            b6 = -1;
                                        }
                                        if (b6 != 0) {
                                            c3225b5.o(1);
                                        } else if (b6 != 1) {
                                            c3225b5.o(2);
                                        } else {
                                            if (b6 == 2) {
                                                throw new java.lang.IllegalStateException();
                                            }
                                            c3225b5.o(3);
                                        }
                                        java.lang.String strGroup3 = matcher.group(1);
                                        strGroup3.getClass();
                                        c3225b5.n(java.lang.Float.parseFloat(strGroup3));
                                    } else {
                                        com.google.android.gms.internal.ads.AbstractC3586eM.f("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    }
                                } else {
                                    continue;
                                }
                            } else if ("}".equals(strA4)) {
                                c5128sR4.l(iT6);
                                if ("color".equals(strD)) {
                                    c3225b5.l(com.google.android.gms.internal.ads.AbstractC4669oE.a(string));
                                } else if ("background-color".equals(strD)) {
                                    c3225b5.i(com.google.android.gms.internal.ads.AbstractC4669oE.a(string));
                                } else if ("ruby-position".equals(strD)) {
                                    if ("over".equals(string)) {
                                        c3225b5.q(1);
                                    } else if ("under".equals(string)) {
                                        c3225b5.q(2);
                                    }
                                } else if ("text-combine-upright".equals(strD)) {
                                    if ("all".equals(string) || string.startsWith("digits")) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    c3225b5.k(z6);
                                } else if ("text-decoration".equals(strD)) {
                                    if ("underline".equals(string)) {
                                        c3225b5.r(true);
                                    }
                                } else if ("font-family".equals(strD)) {
                                    c3225b5.m(string);
                                } else if ("font-weight".equals(strD)) {
                                    if ("bold".equals(string)) {
                                        c3225b5.j(true);
                                    }
                                } else if ("font-style".equals(strD)) {
                                    if ("italic".equals(string)) {
                                        c3225b5.p(true);
                                    }
                                } else if ("font-size".equals(strD)) {
                                    matcher = f34001d.matcher(com.google.android.gms.internal.ads.AbstractC3723fg0.a(string));
                                    if (matcher.matches()) {
                                        com.google.android.gms.internal.ads.AbstractC3586eM.f("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    } else {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592 && strGroup.equals("px")) {
                                                    b6 = 0;
                                                } else {
                                                    b6 = -1;
                                                }
                                            } else if (strGroup.equals("em")) {
                                                b6 = 1;
                                            } else {
                                                b6 = -1;
                                            }
                                        } else if (strGroup.equals("%")) {
                                            b6 = 2;
                                        } else {
                                            b6 = -1;
                                        }
                                        if (b6 != 0) {
                                            c3225b5.o(1);
                                        } else if (b6 != 1) {
                                            c3225b5.o(2);
                                        } else {
                                            if (b6 == 2) {
                                                throw new java.lang.IllegalStateException();
                                            }
                                            c3225b5.o(3);
                                        }
                                        java.lang.String strGroup4 = matcher.group(1);
                                        strGroup4.getClass();
                                        c3225b5.n(java.lang.Float.parseFloat(strGroup4));
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i10 = 0;
            }
            if ("}".equals(strA2)) {
                arrayList.add(c3225b5);
            }
            i6 = -1;
            i10 = 0;
        }
        return arrayList;
    }
}
