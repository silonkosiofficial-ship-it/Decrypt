package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4101j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f36557a = java.util.regex.Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.regex.Pattern f36558b = java.util.regex.Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Map f36559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.Map f36560d;

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put("white", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 255)));
        map.put("lime", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 0)));
        map.put("cyan", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 255)));
        map.put("red", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 0)));
        map.put("yellow", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 0)));
        map.put("magenta", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 255)));
        map.put("blue", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 255)));
        map.put("black", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 0)));
        f36559c = j$.util.DesugarCollections.unmodifiableMap(map);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("bg_white", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 255)));
        map2.put("bg_lime", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 255)));
        map2.put("bg_red", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 255)));
        map2.put("bg_blue", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 255)));
        map2.put("bg_black", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 0)));
        f36560d = j$.util.DesugarCollections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0125  */
    static android.text.SpannedString a(java.lang.String str, java.lang.String str2, java.util.List list) {
        int i6;
        byte b6;
        int i10 = -1;
        int i11 = 1;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (i13 < str2.length()) {
            int i14 = i13 + 1;
            char cCharAt = str2.charAt(i13);
            int i15 = 2;
            if (cCharAt != '&') {
                if (cCharAt != '<') {
                    spannableStringBuilder.append(cCharAt);
                } else {
                    if (i14 < str2.length()) {
                        char cCharAt2 = str2.charAt(i14);
                        int iIndexOf = str2.indexOf(62, i14);
                        int length = iIndexOf == i10 ? str2.length() : iIndexOf + i11;
                        int i16 = length - 2;
                        int i17 = str2.charAt(i16) == '/' ? i11 : i12;
                        int i18 = i13 + (cCharAt2 == '/' ? 2 : i11);
                        if (i17 == 0) {
                            i16 = length - 1;
                        }
                        java.lang.String strSubstring = str2.substring(i18, i16);
                        if (!strSubstring.trim().isEmpty()) {
                            java.lang.String strTrim = strSubstring.trim();
                            com.google.android.gms.internal.ads.LC.d(!strTrim.isEmpty());
                            int i19 = com.google.android.gms.internal.ads.EW.f27061a;
                            java.lang.String str3 = strTrim.split("[ \\.]", 2)[i12];
                            int iHashCode = str3.hashCode();
                            if (iHashCode != 98) {
                                if (iHashCode != 99) {
                                    if (iHashCode != 105) {
                                        if (iHashCode != 3650) {
                                            if (iHashCode != 3314158) {
                                                if (iHashCode != 3511770) {
                                                    if (iHashCode != 117) {
                                                        if (iHashCode == 118 && str3.equals("v")) {
                                                            i15 = 7;
                                                        } else {
                                                            i15 = i10;
                                                        }
                                                    } else if (str3.equals("u")) {
                                                        i15 = 6;
                                                    } else {
                                                        i15 = i10;
                                                    }
                                                } else if (str3.equals("ruby")) {
                                                    i15 = 4;
                                                } else {
                                                    i15 = i10;
                                                }
                                            } else if (str3.equals("lang")) {
                                                i15 = 3;
                                            } else {
                                                i15 = i10;
                                            }
                                        } else if (str3.equals("rt")) {
                                            i15 = 5;
                                        } else {
                                            i15 = i10;
                                        }
                                    } else if (!str3.equals("i")) {
                                        i15 = i10;
                                    }
                                } else if (str3.equals("c")) {
                                    i15 = 1;
                                } else {
                                    i15 = i10;
                                }
                            } else if (str3.equals("b")) {
                                i15 = 0;
                            } else {
                                i15 = i10;
                            }
                            switch (i15) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (cCharAt2 == '/') {
                                        while (!arrayDeque.isEmpty()) {
                                            com.google.android.gms.internal.ads.C3663f5 c3663f5 = (com.google.android.gms.internal.ads.C3663f5) arrayDeque.pop();
                                            g(str, c3663f5, arrayList, spannableStringBuilder, list);
                                            if (arrayDeque.isEmpty()) {
                                                arrayList.clear();
                                            } else {
                                                arrayList.add(new com.google.android.gms.internal.ads.C3553e5(c3663f5, spannableStringBuilder.length(), null));
                                            }
                                            if (c3663f5.f35272a.equals(str3)) {
                                                break;
                                            }
                                        }
                                    } else if (i17 == 0) {
                                        arrayDeque.push(com.google.android.gms.internal.ads.C3663f5.a(strSubstring, spannableStringBuilder.length()));
                                    }
                                    break;
                            }
                        }
                        i13 = length;
                        i11 = 1;
                    }
                    i12 = 0;
                }
                i6 = i11;
            } else {
                int iIndexOf2 = str2.indexOf(59, i14);
                int iIndexOf3 = str2.indexOf(32, i14);
                if (iIndexOf2 == i10) {
                    iIndexOf2 = iIndexOf3;
                } else if (iIndexOf3 != i10) {
                    iIndexOf2 = java.lang.Math.min(iIndexOf2, iIndexOf3);
                }
                if (iIndexOf2 != i10) {
                    java.lang.String strSubstring2 = str2.substring(i14, iIndexOf2);
                    int iHashCode2 = strSubstring2.hashCode();
                    if (iHashCode2 != 3309) {
                        if (iHashCode2 != 3464) {
                            if (iHashCode2 != 96708) {
                                if (iHashCode2 == 3374865 && strSubstring2.equals("nbsp")) {
                                    b6 = 2;
                                } else {
                                    b6 = -1;
                                }
                            } else if (strSubstring2.equals("amp")) {
                                b6 = 3;
                            } else {
                                b6 = -1;
                            }
                        } else if (strSubstring2.equals("lt")) {
                            b6 = 0;
                        } else {
                            b6 = -1;
                        }
                    } else if (strSubstring2.equals("gt")) {
                        b6 = 1;
                    } else {
                        b6 = -1;
                    }
                    if (b6 == 0) {
                        spannableStringBuilder.append('<');
                    } else if (b6 == 1) {
                        spannableStringBuilder.append('>');
                    } else if (b6 == 2) {
                        spannableStringBuilder.append(' ');
                    } else if (b6 != 3) {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring2 + ";'");
                    } else {
                        spannableStringBuilder.append('&');
                    }
                    if (iIndexOf2 == iIndexOf3) {
                        spannableStringBuilder.append((java.lang.CharSequence) " ");
                    }
                    i13 = iIndexOf2 + 1;
                    i11 = 1;
                } else {
                    i6 = 1;
                    spannableStringBuilder.append(cCharAt);
                }
                i10 = -1;
                i12 = 0;
            }
            i11 = i6;
            i13 = i14;
            i10 = -1;
            i12 = 0;
        }
        while (!arrayDeque.isEmpty()) {
            g(str, (com.google.android.gms.internal.ads.C3663f5) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        g(str, com.google.android.gms.internal.ads.C3663f5.b(), java.util.Collections.emptyList(), spannableStringBuilder, list);
        return android.text.SpannedString.valueOf(spannableStringBuilder);
    }

    static com.google.android.gms.internal.ads.C2185Ax b(java.lang.String str) {
        com.google.android.gms.internal.ads.C3883h5 c3883h5 = new com.google.android.gms.internal.ads.C3883h5();
        h(str, c3883h5);
        return c3883h5.a();
    }

    public static com.google.android.gms.internal.ads.C3334c5 c(com.google.android.gms.internal.ads.C5128sR c5128sR, java.util.List list) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        java.lang.String strP = c5128sR.P(charset);
        if (strP != null) {
            java.util.regex.Pattern pattern = f36557a;
            java.util.regex.Matcher matcher = pattern.matcher(strP);
            if (matcher.matches()) {
                return e(null, matcher, c5128sR, list);
            }
            java.lang.String strP2 = c5128sR.P(charset);
            if (strP2 != null) {
                java.util.regex.Matcher matcher2 = pattern.matcher(strP2);
                if (matcher2.matches()) {
                    return e(strP.trim(), matcher2, c5128sR, list);
                }
            }
        }
        return null;
    }

    private static int d(java.util.List list, java.lang.String str, com.google.android.gms.internal.ads.C3663f5 c3663f5) {
        java.util.List listF = f(list, str, c3663f5);
        for (int i6 = 0; i6 < listF.size(); i6++) {
            com.google.android.gms.internal.ads.C3225b5 c3225b5 = ((com.google.android.gms.internal.ads.C3773g5) listF.get(i6)).f35541D;
            if (c3225b5.f() != -1) {
                return c3225b5.f();
            }
        }
        return -1;
    }

    private static com.google.android.gms.internal.ads.C3334c5 e(java.lang.String str, java.util.regex.Matcher matcher, com.google.android.gms.internal.ads.C5128sR c5128sR, java.util.List list) {
        com.google.android.gms.internal.ads.C3883h5 c3883h5 = new com.google.android.gms.internal.ads.C3883h5();
        try {
            java.lang.String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            c3883h5.f35988a = com.google.android.gms.internal.ads.AbstractC4321l5.b(strGroup);
            java.lang.String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            c3883h5.f35989b = com.google.android.gms.internal.ads.AbstractC4321l5.b(strGroup2);
            java.lang.String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            h(strGroup3, c3883h5);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            while (true) {
                java.lang.String strP = c5128sR.P(java.nio.charset.StandardCharsets.UTF_8);
                if (android.text.TextUtils.isEmpty(strP)) {
                    c3883h5.f35990c = a(str, sb.toString(), list);
                    return new com.google.android.gms.internal.ads.C3334c5(c3883h5.a().p(), c3883h5.f35988a, c3883h5.f35989b);
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strP.trim());
            }
        } catch (java.lang.NumberFormatException unused) {
            com.google.android.gms.internal.ads.AbstractC3586eM.f("WebvttCueParser", "Skipping cue with bad header: ".concat(java.lang.String.valueOf(matcher.group())));
            return null;
        }
    }

    private static java.util.List f(java.util.List list, java.lang.String str, com.google.android.gms.internal.ads.C3663f5 c3663f5) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            com.google.android.gms.internal.ads.C3225b5 c3225b5 = (com.google.android.gms.internal.ads.C3225b5) list.get(i6);
            int iG = c3225b5.g(str, c3663f5.f35272a, c3663f5.f35275d, c3663f5.f35274c);
            if (iG > 0) {
                arrayList.add(new com.google.android.gms.internal.ads.C3773g5(iG, c3225b5));
            }
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:104:0x0202  */
    /* JADX WARN: Code duplicated, block: B:105:0x020c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:123:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:78:0x017e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    /* JADX WARN: Code duplicated, block: B:81:0x018d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0194  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01eb  */
    private static void g(java.lang.String str, com.google.android.gms.internal.ads.C3663f5 c3663f5, java.util.List list, android.text.SpannableStringBuilder spannableStringBuilder, java.util.List list2) {
        byte b6;
        java.util.List listF;
        int i6;
        com.google.android.gms.internal.ads.C3225b5 c3225b5;
        int iE;
        android.text.style.RelativeSizeSpan relativeSizeSpan;
        java.lang.Object styleSpan;
        java.lang.Object foregroundColorSpan;
        int i10 = c3663f5.f35273b;
        int length = spannableStringBuilder.length();
        java.lang.String str2 = c3663f5.f35272a;
        int iHashCode = str2.hashCode();
        int i11 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals("v")) {
                                        b6 = 5;
                                    } else {
                                        b6 = -1;
                                    }
                                } else if (str2.equals("u")) {
                                    b6 = 3;
                                } else {
                                    b6 = -1;
                                }
                            } else if (str2.equals("c")) {
                                b6 = 4;
                            } else {
                                b6 = -1;
                            }
                        } else if (str2.equals("b")) {
                            b6 = 0;
                        } else {
                            b6 = -1;
                        }
                    } else if (str2.equals("ruby")) {
                        b6 = 2;
                    } else {
                        b6 = -1;
                    }
                } else if (str2.equals("lang")) {
                    b6 = 6;
                } else {
                    b6 = -1;
                }
            } else if (str2.equals("i")) {
                b6 = 1;
            } else {
                b6 = -1;
            }
        } else if (str2.equals("")) {
            b6 = 7;
        } else {
            b6 = -1;
        }
        switch (b6) {
            case 0:
                styleSpan = new android.text.style.StyleSpan(1);
                spannableStringBuilder.setSpan(styleSpan, i10, length, 33);
                listF = f(list2, str, c3663f5);
                for (i6 = 0; i6 < listF.size(); i6++) {
                    c3225b5 = ((com.google.android.gms.internal.ads.C3773g5) listF.get(i6)).f35541D;
                    if (c3225b5 != null) {
                        if (c3225b5.h() != -1) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.StyleSpan(c3225b5.h()), i10, length, 33);
                        }
                        if (c3225b5.A()) {
                            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i10, length, 33);
                        }
                        if (c3225b5.z()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.ForegroundColorSpan(c3225b5.d()), i10, length, 33);
                        }
                        if (c3225b5.y()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.BackgroundColorSpan(c3225b5.c()), i10, length, 33);
                        }
                        if (c3225b5.s() != null) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.TypefaceSpan(c3225b5.s()), i10, length, 33);
                        }
                        iE = c3225b5.e();
                        if (iE != 1) {
                            if (iE == 2) {
                                relativeSizeSpan = new android.text.style.RelativeSizeSpan(c3225b5.b());
                            } else if (iE == 3) {
                                relativeSizeSpan = new android.text.style.RelativeSizeSpan(c3225b5.b() / 100.0f);
                            }
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, relativeSizeSpan, i10, length, 33);
                        } else {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) c3225b5.b(), true), i10, length, 33);
                        }
                        if (c3225b5.x()) {
                            spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.C3783gA(), i10, length, 33);
                        }
                    }
                }
                break;
            case 1:
                styleSpan = new android.text.style.StyleSpan(2);
                spannableStringBuilder.setSpan(styleSpan, i10, length, 33);
                listF = f(list2, str, c3663f5);
                while (i6 < listF.size()) {
                    c3225b5 = ((com.google.android.gms.internal.ads.C3773g5) listF.get(i6)).f35541D;
                    if (c3225b5 != null) {
                        if (c3225b5.h() != -1) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.StyleSpan(c3225b5.h()), i10, length, 33);
                        }
                        if (c3225b5.A()) {
                            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i10, length, 33);
                        }
                        if (c3225b5.z()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.ForegroundColorSpan(c3225b5.d()), i10, length, 33);
                        }
                        if (c3225b5.y()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.BackgroundColorSpan(c3225b5.c()), i10, length, 33);
                        }
                        if (c3225b5.s() != null) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.TypefaceSpan(c3225b5.s()), i10, length, 33);
                        }
                        iE = c3225b5.e();
                        if (iE != 1) {
                            if (iE == 2) {
                                relativeSizeSpan = new android.text.style.RelativeSizeSpan(c3225b5.b());
                            } else if (iE == 3) {
                                relativeSizeSpan = new android.text.style.RelativeSizeSpan(c3225b5.b() / 100.0f);
                            }
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, relativeSizeSpan, i10, length, 33);
                        } else {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) c3225b5.b(), true), i10, length, 33);
                        }
                        if (c3225b5.x()) {
                            spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.C3783gA(), i10, length, 33);
                        }
                    }
                }
                break;
            case 2:
                int iD = d(list2, str, c3663f5);
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                arrayList.addAll(list);
                java.util.Collections.sort(arrayList, com.google.android.gms.internal.ads.C3553e5.f34879c);
                int i12 = c3663f5.f35273b;
                int i13 = 0;
                int length2 = 0;
                while (i13 < arrayList.size()) {
                    if ("rt".equals(((com.google.android.gms.internal.ads.C3553e5) arrayList.get(i13)).f34880a.f35272a)) {
                        com.google.android.gms.internal.ads.C3553e5 c3553e5 = (com.google.android.gms.internal.ads.C3553e5) arrayList.get(i13);
                        int iD2 = d(list2, str, c3553e5.f34880a);
                        if (iD2 == i11) {
                            iD2 = iD != i11 ? iD : 1;
                        }
                        int i14 = c3553e5.f34880a.f35273b - length2;
                        int i15 = c3553e5.f34881b - length2;
                        java.lang.CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i14, i15);
                        spannableStringBuilder.delete(i14, i15);
                        spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.HA(charSequenceSubSequence.toString(), iD2), i12, i14, 33);
                        length2 += charSequenceSubSequence.length();
                        i12 = i14;
                    }
                    i13++;
                    i11 = -1;
                }
                listF = f(list2, str, c3663f5);
                while (i6 < listF.size()) {
                    c3225b5 = ((com.google.android.gms.internal.ads.C3773g5) listF.get(i6)).f35541D;
                    if (c3225b5 != null) {
                        if (c3225b5.h() != -1) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.StyleSpan(c3225b5.h()), i10, length, 33);
                        }
                        if (c3225b5.A()) {
                            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i10, length, 33);
                        }
                        if (c3225b5.z()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.ForegroundColorSpan(c3225b5.d()), i10, length, 33);
                        }
                        if (c3225b5.y()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.BackgroundColorSpan(c3225b5.c()), i10, length, 33);
                        }
                        if (c3225b5.s() != null) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.TypefaceSpan(c3225b5.s()), i10, length, 33);
                        }
                        iE = c3225b5.e();
                        if (iE != 1) {
                            if (iE == 2) {
                                relativeSizeSpan = new android.text.style.RelativeSizeSpan(c3225b5.b());
                            } else if (iE == 3) {
                                relativeSizeSpan = new android.text.style.RelativeSizeSpan(c3225b5.b() / 100.0f);
                            }
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, relativeSizeSpan, i10, length, 33);
                        } else {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) c3225b5.b(), true), i10, length, 33);
                        }
                        if (c3225b5.x()) {
                            spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.C3783gA(), i10, length, 33);
                        }
                    }
                }
                break;
            case 3:
                styleSpan = new android.text.style.UnderlineSpan();
                spannableStringBuilder.setSpan(styleSpan, i10, length, 33);
                listF = f(list2, str, c3663f5);
                while (i6 < listF.size()) {
                    c3225b5 = ((com.google.android.gms.internal.ads.C3773g5) listF.get(i6)).f35541D;
                    if (c3225b5 != null) {
                        if (c3225b5.h() != -1) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.StyleSpan(c3225b5.h()), i10, length, 33);
                        }
                        if (c3225b5.A()) {
                            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i10, length, 33);
                        }
                        if (c3225b5.z()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.ForegroundColorSpan(c3225b5.d()), i10, length, 33);
                        }
                        if (c3225b5.y()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.BackgroundColorSpan(c3225b5.c()), i10, length, 33);
                        }
                        if (c3225b5.s() != null) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.TypefaceSpan(c3225b5.s()), i10, length, 33);
                        }
                        iE = c3225b5.e();
                        if (iE != 1) {
                            if (iE == 2) {
                                relativeSizeSpan = new android.text.style.RelativeSizeSpan(c3225b5.b());
                            } else if (iE == 3) {
                                relativeSizeSpan = new android.text.style.RelativeSizeSpan(c3225b5.b() / 100.0f);
                            }
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, relativeSizeSpan, i10, length, 33);
                        } else {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) c3225b5.b(), true), i10, length, 33);
                        }
                        if (c3225b5.x()) {
                            spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.C3783gA(), i10, length, 33);
                        }
                    }
                }
                break;
            case 4:
                for (java.lang.String str3 : c3663f5.f35275d) {
                    java.util.Map map = f36559c;
                    if (map.containsKey(str3)) {
                        foregroundColorSpan = new android.text.style.ForegroundColorSpan(((java.lang.Integer) map.get(str3)).intValue());
                    } else {
                        java.util.Map map2 = f36560d;
                        if (map2.containsKey(str3)) {
                            foregroundColorSpan = new android.text.style.BackgroundColorSpan(((java.lang.Integer) map2.get(str3)).intValue());
                        }
                    }
                    spannableStringBuilder.setSpan(foregroundColorSpan, i10, length, 33);
                }
                listF = f(list2, str, c3663f5);
                while (i6 < listF.size()) {
                    c3225b5 = ((com.google.android.gms.internal.ads.C3773g5) listF.get(i6)).f35541D;
                    if (c3225b5 != null) {
                        if (c3225b5.h() != -1) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.StyleSpan(c3225b5.h()), i10, length, 33);
                        }
                        if (c3225b5.A()) {
                            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i10, length, 33);
                        }
                        if (c3225b5.z()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.ForegroundColorSpan(c3225b5.d()), i10, length, 33);
                        }
                        if (c3225b5.y()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.BackgroundColorSpan(c3225b5.c()), i10, length, 33);
                        }
                        if (c3225b5.s() != null) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.TypefaceSpan(c3225b5.s()), i10, length, 33);
                        }
                        iE = c3225b5.e();
                        if (iE != 1) {
                            if (iE == 2) {
                                relativeSizeSpan = new android.text.style.RelativeSizeSpan(c3225b5.b());
                            } else if (iE == 3) {
                                relativeSizeSpan = new android.text.style.RelativeSizeSpan(c3225b5.b() / 100.0f);
                            }
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, relativeSizeSpan, i10, length, 33);
                        } else {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) c3225b5.b(), true), i10, length, 33);
                        }
                        if (c3225b5.x()) {
                            spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.C3783gA(), i10, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.C4225kC(c3663f5.f35274c), i10, length, 33);
                listF = f(list2, str, c3663f5);
                while (i6 < listF.size()) {
                    c3225b5 = ((com.google.android.gms.internal.ads.C3773g5) listF.get(i6)).f35541D;
                    if (c3225b5 != null) {
                        if (c3225b5.h() != -1) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.StyleSpan(c3225b5.h()), i10, length, 33);
                        }
                        if (c3225b5.A()) {
                            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i10, length, 33);
                        }
                        if (c3225b5.z()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.ForegroundColorSpan(c3225b5.d()), i10, length, 33);
                        }
                        if (c3225b5.y()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.BackgroundColorSpan(c3225b5.c()), i10, length, 33);
                        }
                        if (c3225b5.s() != null) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.TypefaceSpan(c3225b5.s()), i10, length, 33);
                        }
                        iE = c3225b5.e();
                        if (iE != 1) {
                            if (iE == 2) {
                                relativeSizeSpan = new android.text.style.RelativeSizeSpan(c3225b5.b());
                            } else if (iE == 3) {
                                relativeSizeSpan = new android.text.style.RelativeSizeSpan(c3225b5.b() / 100.0f);
                            }
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, relativeSizeSpan, i10, length, 33);
                        } else {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) c3225b5.b(), true), i10, length, 33);
                        }
                        if (c3225b5.x()) {
                            spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.C3783gA(), i10, length, 33);
                        }
                    }
                }
                break;
            case 6:
            case 7:
                listF = f(list2, str, c3663f5);
                while (i6 < listF.size()) {
                    c3225b5 = ((com.google.android.gms.internal.ads.C3773g5) listF.get(i6)).f35541D;
                    if (c3225b5 != null) {
                        if (c3225b5.h() != -1) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.StyleSpan(c3225b5.h()), i10, length, 33);
                        }
                        if (c3225b5.A()) {
                            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i10, length, 33);
                        }
                        if (c3225b5.z()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.ForegroundColorSpan(c3225b5.d()), i10, length, 33);
                        }
                        if (c3225b5.y()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.BackgroundColorSpan(c3225b5.c()), i10, length, 33);
                        }
                        if (c3225b5.s() != null) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.TypefaceSpan(c3225b5.s()), i10, length, 33);
                        }
                        iE = c3225b5.e();
                        if (iE != 1) {
                            if (iE == 2) {
                                relativeSizeSpan = new android.text.style.RelativeSizeSpan(c3225b5.b());
                            } else if (iE == 3) {
                                relativeSizeSpan = new android.text.style.RelativeSizeSpan(c3225b5.b() / 100.0f);
                            }
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, relativeSizeSpan, i10, length, 33);
                        } else {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) c3225b5.b(), true), i10, length, 33);
                        }
                        if (c3225b5.x()) {
                            spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.C3783gA(), i10, length, 33);
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void h(java.lang.String str, com.google.android.gms.internal.ads.C3883h5 c3883h5) {
        java.util.regex.Matcher matcher = f36558b.matcher(str);
        while (matcher.find()) {
            int i6 = 1;
            java.lang.String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = 2;
            java.lang.String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                byte b6 = -1;
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        java.lang.String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                    b6 = 1;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    b6 = 2;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                    b6 = 3;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    b6 = 0;
                                }
                                break;
                        }
                        if (b6 == 0) {
                            i10 = 0;
                        } else if (b6 == 1 || b6 == 2) {
                            i10 = 1;
                        } else if (b6 != 3) {
                            com.google.android.gms.internal.ads.AbstractC3586eM.f("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                            i10 = Integer.MIN_VALUE;
                        }
                        c3883h5.f35994g = i10;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        c3883h5.f35992e = com.google.android.gms.internal.ads.AbstractC4321l5.a(strGroup2);
                        i6 = 0;
                    } else {
                        c3883h5.f35992e = java.lang.Integer.parseInt(strGroup2);
                    }
                    c3883h5.f35993f = i6;
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2.hashCode()) {
                        case -1364013995:
                            if (strGroup2.equals("center")) {
                                b6 = 2;
                            }
                            break;
                        case -1074341483:
                            if (strGroup2.equals("middle")) {
                                b6 = 3;
                            }
                            break;
                        case 100571:
                            if (strGroup2.equals("end")) {
                                b6 = 4;
                            }
                            break;
                        case 3317767:
                            if (strGroup2.equals("left")) {
                                b6 = 1;
                            }
                            break;
                        case 108511772:
                            if (strGroup2.equals("right")) {
                                b6 = 5;
                            }
                            break;
                        case 109757538:
                            if (strGroup2.equals("start")) {
                                b6 = 0;
                            }
                            break;
                    }
                    if (b6 != 0) {
                        if (b6 == 1) {
                            i6 = 4;
                        } else if (b6 == 2 || b6 == 3) {
                            i6 = 2;
                        } else if (b6 == 4) {
                            i6 = 3;
                        } else if (b6 != 5) {
                            com.google.android.gms.internal.ads.AbstractC3586eM.f("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i6 = 2;
                        } else {
                            i6 = 5;
                        }
                    }
                    c3883h5.f35991d = i6;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        java.lang.String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2.hashCode()) {
                            case -1842484672:
                                if (strSubstring2.equals("line-left")) {
                                    b6 = 0;
                                }
                                break;
                            case -1364013995:
                                if (strSubstring2.equals("center")) {
                                    b6 = 2;
                                }
                                break;
                            case -1276788989:
                                if (strSubstring2.equals("line-right")) {
                                    b6 = 4;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring2.equals("middle")) {
                                    b6 = 3;
                                }
                                break;
                            case 100571:
                                if (strSubstring2.equals("end")) {
                                    b6 = 5;
                                }
                                break;
                            case 109757538:
                                if (strSubstring2.equals("start")) {
                                    b6 = 1;
                                }
                                break;
                        }
                        if (b6 == 0 || b6 == 1) {
                            i6 = 0;
                        } else if (b6 != 2 && b6 != 3) {
                            if (b6 == 4 || b6 == 5) {
                                i6 = 2;
                            } else {
                                com.google.android.gms.internal.ads.AbstractC3586eM.f("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i6 = Integer.MIN_VALUE;
                            }
                        }
                        c3883h5.f35996i = i6;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    c3883h5.f35995h = com.google.android.gms.internal.ads.AbstractC4321l5.a(strGroup2);
                } else if ("size".equals(strGroup)) {
                    c3883h5.f35997j = com.google.android.gms.internal.ads.AbstractC4321l5.a(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            b6 = 0;
                        }
                    } else if (strGroup2.equals("lr")) {
                        b6 = 1;
                    }
                    if (b6 != 0) {
                        if (b6 != 1) {
                            com.google.android.gms.internal.ads.AbstractC3586eM.f("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i6 = Integer.MIN_VALUE;
                        } else {
                            i6 = 2;
                        }
                    }
                    c3883h5.f35998k = i6;
                } else {
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (java.lang.NumberFormatException unused) {
                com.google.android.gms.internal.ads.AbstractC3586eM.f("WebvttCueParser", "Skipping bad cue setting: ".concat(java.lang.String.valueOf(matcher.group())));
            }
        }
    }
}
