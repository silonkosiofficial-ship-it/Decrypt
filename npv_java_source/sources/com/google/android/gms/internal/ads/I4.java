package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class I4 implements com.google.android.gms.internal.ads.InterfaceC5088s4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.regex.Pattern f28383g = java.util.regex.Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.H4 f28385b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.Map f28387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f28388e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f28389f = -3.4028235E38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f28386c = new com.google.android.gms.internal.ads.C5128sR();

    public I4(java.util.List list) {
        if (list == null || list.isEmpty()) {
            this.f28384a = false;
            this.f28385b = null;
            return;
        }
        this.f28384a = true;
        java.lang.String strB = com.google.android.gms.internal.ads.EW.b((byte[]) list.get(0));
        com.google.android.gms.internal.ads.LC.d(strB.startsWith("Format:"));
        com.google.android.gms.internal.ads.H4 h4A = com.google.android.gms.internal.ads.H4.a(strB);
        h4A.getClass();
        this.f28385b = h4A;
        e(new com.google.android.gms.internal.ads.C5128sR((byte[]) list.get(1)), java.nio.charset.StandardCharsets.UTF_8);
    }

    private static float b(int i6) {
        if (i6 == 0) {
            return 0.05f;
        }
        if (i6 != 1) {
            return i6 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int c(long j6, java.util.List list, java.util.List list2) {
        int i6;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i6 = 0;
                break;
            }
            if (((java.lang.Long) list.get(size)).longValue() == j6) {
                return size;
            }
            if (((java.lang.Long) list.get(size)).longValue() < j6) {
                i6 = size + 1;
                break;
            }
        }
        list.add(i6, java.lang.Long.valueOf(j6));
        list2.add(i6, i6 == 0 ? new java.util.ArrayList() : new java.util.ArrayList((java.util.Collection) list2.get(i6 - 1)));
        return i6;
    }

    private static long d(java.lang.String str) {
        java.util.regex.Matcher matcher = f28383g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        java.lang.String strGroup = matcher.group(1);
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        long j6 = java.lang.Long.parseLong(strGroup) * 3600000000L;
        long j10 = java.lang.Long.parseLong(matcher.group(2)) * 60000000;
        return j6 + j10 + (java.lang.Long.parseLong(matcher.group(3)) * 1000000) + (java.lang.Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void e(com.google.android.gms.internal.ads.C5128sR c5128sR, java.nio.charset.Charset charset) {
        while (true) {
            java.lang.String strP = c5128sR.P(charset);
            if (strP == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strP)) {
                while (true) {
                    java.lang.String strP2 = c5128sR.P(charset);
                    if (strP2 == null || (c5128sR.r() != 0 && c5128sR.q(charset) == '[')) {
                        break;
                    }
                    java.lang.String[] strArrSplit = strP2.split(":");
                    if (strArrSplit.length == 2) {
                        byte b6 = 0;
                        java.lang.String strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(strArrSplit[0].trim());
                        switch (strA.hashCode()) {
                            case 1879649548:
                                if (!strA.equals("playresx")) {
                                    b6 = -1;
                                }
                                break;
                            case 1879649549:
                                if (!strA.equals("playresy")) {
                                    b6 = -1;
                                } else {
                                    b6 = 1;
                                }
                                break;
                            default:
                                b6 = -1;
                                break;
                        }
                        if (b6 == 0) {
                            this.f28388e = java.lang.Float.parseFloat(strArrSplit[1].trim());
                        } else if (b6 == 1) {
                            try {
                                this.f28389f = java.lang.Float.parseFloat(strArrSplit[1].trim());
                            } catch (java.lang.NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strP)) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                com.google.android.gms.internal.ads.J4 j4A = null;
                while (true) {
                    java.lang.String strP3 = c5128sR.P(charset);
                    if (strP3 != null && (c5128sR.r() == 0 || c5128sR.q(charset) != '[')) {
                        if (strP3.startsWith("Format:")) {
                            j4A = com.google.android.gms.internal.ads.J4.a(strP3);
                        } else if (strP3.startsWith("Style:")) {
                            if (j4A == null) {
                                com.google.android.gms.internal.ads.AbstractC3586eM.f("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strP3));
                            } else {
                                com.google.android.gms.internal.ads.L4 l4B = com.google.android.gms.internal.ads.L4.b(strP3, j4A);
                                if (l4B != null) {
                                    linkedHashMap.put(l4B.f29190a, l4B);
                                }
                            }
                        }
                    }
                }
                this.f28387d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strP)) {
                com.google.android.gms.internal.ads.AbstractC3586eM.e("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strP)) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x029c  */
    /* JADX WARN: Code duplicated, block: B:136:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x018d  */
    /* JADX WARN: Code duplicated, block: B:71:0x019d  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5088s4
    public final void a(byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.C4978r4 c4978r4, com.google.android.gms.internal.ads.InterfaceC5000rF interfaceC5000rF) {
        int i11;
        com.google.android.gms.internal.ads.C5128sR c5128sR;
        int i12;
        android.text.Layout.Alignment alignment;
        int i13;
        int i14;
        float fB;
        int i15;
        int i16;
        android.text.style.StyleSpan styleSpan;
        int length;
        java.lang.Integer num;
        int i17;
        java.lang.String str;
        com.google.android.gms.internal.ads.I4 i18 = this;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        i18.f28386c.j(bArr, i6 + i10);
        i18.f28386c.l(i6);
        java.nio.charset.Charset charsetC = i18.f28386c.c();
        if (charsetC == null) {
            charsetC = java.nio.charset.StandardCharsets.UTF_8;
        }
        if (!i18.f28384a) {
            i18.e(i18.f28386c, charsetC);
        }
        com.google.android.gms.internal.ads.C5128sR c5128sR2 = i18.f28386c;
        com.google.android.gms.internal.ads.H4 h4A = i18.f28384a ? i18.f28385b : null;
        while (true) {
            java.lang.String strP = c5128sR2.P(charsetC);
            if (strP == null) {
                int i19 = 0;
                while (i19 < arrayList.size()) {
                    java.util.List list = (java.util.List) arrayList.get(i19);
                    if (!list.isEmpty()) {
                        if (i19 != arrayList.size() - 1) {
                            throw new java.lang.IllegalStateException();
                        }
                        interfaceC5000rF.b(new com.google.android.gms.internal.ads.C4099j4(list, ((java.lang.Long) arrayList2.get(i19)).longValue(), ((java.lang.Long) arrayList2.get(i19 + 1)).longValue() - ((java.lang.Long) arrayList2.get(i19)).longValue()));
                        i11 = 1;
                    } else if (i19 != 0) {
                        i11 = 1;
                    } else {
                        i19 = 0;
                        if (i19 != arrayList.size() - 1) {
                            throw new java.lang.IllegalStateException();
                        }
                        interfaceC5000rF.b(new com.google.android.gms.internal.ads.C4099j4(list, ((java.lang.Long) arrayList2.get(i19)).longValue(), ((java.lang.Long) arrayList2.get(i19 + 1)).longValue() - ((java.lang.Long) arrayList2.get(i19)).longValue()));
                        i11 = 1;
                    }
                    i19 += i11;
                }
                return;
            }
            if (strP.startsWith("Format:")) {
                h4A = com.google.android.gms.internal.ads.H4.a(strP);
            } else {
                if (strP.startsWith("Dialogue:")) {
                    if (h4A == null) {
                        str = "Skipping dialogue line before complete format: ";
                    } else {
                        com.google.android.gms.internal.ads.LC.d(strP.startsWith("Dialogue:"));
                        java.lang.String[] strArrSplit = strP.substring(9).split(",", h4A.f27960e);
                        if (strArrSplit.length != h4A.f27960e) {
                            str = "Skipping dialogue line with fewer columns than format: ";
                        } else {
                            long jD = d(strArrSplit[h4A.f27956a]);
                            if (jD != -9223372036854775807L) {
                                long jD2 = d(strArrSplit[h4A.f27957b]);
                                if (jD2 != -9223372036854775807L) {
                                    java.util.Map map = i18.f28387d;
                                    com.google.android.gms.internal.ads.L4 l6 = (map == null || (i17 = h4A.f27958c) == -1) ? null : (com.google.android.gms.internal.ads.L4) map.get(strArrSplit[i17].trim());
                                    java.lang.String str2 = strArrSplit[h4A.f27959d];
                                    com.google.android.gms.internal.ads.K4 k4A = com.google.android.gms.internal.ads.K4.a(str2);
                                    java.lang.String strReplace = com.google.android.gms.internal.ads.K4.b(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f6 = i18.f28388e;
                                    float f10 = i18.f28389f;
                                    android.text.SpannableString spannableString = new android.text.SpannableString(strReplace);
                                    com.google.android.gms.internal.ads.C2185Ax c2185Ax = new com.google.android.gms.internal.ads.C2185Ax();
                                    c2185Ax.l(spannableString);
                                    if (l6 != null) {
                                        java.lang.Integer num2 = l6.f29192c;
                                        c5128sR = c5128sR2;
                                        if (num2 != null) {
                                            spannableString.setSpan(new android.text.style.ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (l6.f29199j == 3 && (num = l6.f29193d) != null) {
                                            spannableString.setSpan(new android.text.style.BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f11 = l6.f29194e;
                                        if (f11 != -3.4028235E38f && f10 != -3.4028235E38f) {
                                            c2185Ax.n(f11 / f10, 1);
                                        }
                                        if (l6.f29195f) {
                                            if (l6.f29196g) {
                                                styleSpan = new android.text.style.StyleSpan(3);
                                                length = spannableString.length();
                                                i15 = 0;
                                                i16 = 33;
                                            } else {
                                                i15 = 0;
                                                i16 = 33;
                                                styleSpan = new android.text.style.StyleSpan(1);
                                                length = spannableString.length();
                                            }
                                            spannableString.setSpan(styleSpan, i15, length, i16);
                                        } else {
                                            i15 = 0;
                                            i16 = 33;
                                            if (l6.f29196g) {
                                                i12 = 2;
                                                spannableString.setSpan(new android.text.style.StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                            if (l6.f29197h) {
                                                spannableString.setSpan(new android.text.style.UnderlineSpan(), i15, spannableString.length(), i16);
                                            }
                                            if (l6.f29198i) {
                                                spannableString.setSpan(new android.text.style.StrikethroughSpan(), i15, spannableString.length(), i16);
                                            }
                                        }
                                        i12 = 2;
                                        if (l6.f29197h) {
                                            spannableString.setSpan(new android.text.style.UnderlineSpan(), i15, spannableString.length(), i16);
                                        }
                                        if (l6.f29198i) {
                                            spannableString.setSpan(new android.text.style.StrikethroughSpan(), i15, spannableString.length(), i16);
                                        }
                                    } else {
                                        c5128sR = c5128sR2;
                                        h4A = h4A;
                                        jD2 = jD2;
                                        i12 = 2;
                                    }
                                    int i20 = k4A.f28827a;
                                    if (i20 == -1) {
                                        i20 = l6 != null ? l6.f29191b : -1;
                                    }
                                    switch (i20) {
                                        case 0:
                                        default:
                                            com.google.android.gms.internal.ads.AbstractC3586eM.f("SsaParser", "Unknown alignment: " + i20);
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = android.text.Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    c2185Ax.m(alignment);
                                    int i21 = Integer.MIN_VALUE;
                                    switch (i20) {
                                        case 0:
                                        default:
                                            com.google.android.gms.internal.ads.AbstractC3586eM.f("SsaParser", "Unknown alignment: " + i20);
                                        case -1:
                                            i13 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i13 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i13 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i13 = i12;
                                            break;
                                    }
                                    c2185Ax.i(i13);
                                    switch (i20) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            com.google.android.gms.internal.ads.AbstractC3586eM.f("SsaParser", "Unknown alignment: " + i20);
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i21 = i12;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i21 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i21 = 0;
                                            break;
                                    }
                                    c2185Ax.f(i21);
                                    android.graphics.PointF pointF = k4A.f28828b;
                                    if (pointF == null || f10 == -3.4028235E38f || f6 == -3.4028235E38f) {
                                        i14 = 0;
                                        c2185Ax.h(b(c2185Ax.b()));
                                        fB = b(c2185Ax.a());
                                    } else {
                                        c2185Ax.h(pointF.x / f6);
                                        fB = k4A.f28828b.y / f10;
                                        i14 = 0;
                                    }
                                    c2185Ax.e(fB, i14);
                                    com.google.android.gms.internal.ads.C2297Dy c2297DyP = c2185Ax.p();
                                    int iC = c(jD2, arrayList2, arrayList);
                                    for (int iC2 = c(jD, arrayList2, arrayList); iC2 < iC; iC2++) {
                                        ((java.util.List) arrayList.get(iC2)).add(c2297DyP);
                                    }
                                }
                            }
                            com.google.android.gms.internal.ads.AbstractC3586eM.f("SsaParser", "Skipping invalid timing: ".concat(strP));
                            c5128sR = c5128sR2;
                            h4A = h4A;
                        }
                    }
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("SsaParser", str.concat(strP));
                    c5128sR = c5128sR2;
                    h4A = h4A;
                } else {
                    c5128sR = c5128sR2;
                    h4A = h4A;
                }
                i18 = this;
                charsetC = charsetC;
                c5128sR2 = c5128sR;
                h4A = h4A;
            }
        }
    }
}
