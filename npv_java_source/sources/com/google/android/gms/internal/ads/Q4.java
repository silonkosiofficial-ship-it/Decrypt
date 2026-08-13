package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f30874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f30875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f30877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f30878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.W4 f30879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String[] f30880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f30881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f30882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.Q4 f30883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.HashMap f30884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.util.HashMap f30885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private java.util.List f30886m;

    private Q4(java.lang.String str, java.lang.String str2, long j6, long j10, com.google.android.gms.internal.ads.W4 w6, java.lang.String[] strArr, java.lang.String str3, java.lang.String str4, com.google.android.gms.internal.ads.Q4 q6) {
        this.f30874a = str;
        this.f30875b = str2;
        this.f30882i = str4;
        this.f30879f = w6;
        this.f30880g = strArr;
        this.f30876c = str2 != null;
        this.f30877d = j6;
        this.f30878e = j10;
        str3.getClass();
        this.f30881h = str3;
        this.f30883j = q6;
        this.f30884k = new java.util.HashMap();
        this.f30885l = new java.util.HashMap();
    }

    public static com.google.android.gms.internal.ads.Q4 b(java.lang.String str, long j6, long j10, com.google.android.gms.internal.ads.W4 w6, java.lang.String[] strArr, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.Q4 q6) {
        return new com.google.android.gms.internal.ads.Q4(str, null, j6, j10, w6, strArr, str2, str3, q6);
    }

    public static com.google.android.gms.internal.ads.Q4 c(java.lang.String str) {
        return new com.google.android.gms.internal.ads.Q4(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static android.text.SpannableStringBuilder i(java.lang.String str, java.util.Map map) {
        if (!map.containsKey(str)) {
            com.google.android.gms.internal.ads.C2185Ax c2185Ax = new com.google.android.gms.internal.ads.C2185Ax();
            c2185Ax.l(new android.text.SpannableStringBuilder());
            map.put(str, c2185Ax);
        }
        java.lang.CharSequence charSequenceQ = ((com.google.android.gms.internal.ads.C2185Ax) map.get(str)).q();
        charSequenceQ.getClass();
        return (android.text.SpannableStringBuilder) charSequenceQ;
    }

    private final void j(java.util.TreeSet treeSet, boolean z6) {
        java.lang.String str = this.f30874a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z6 || zEquals || (zEquals2 && this.f30882i != null)) {
            long j6 = this.f30877d;
            if (j6 != -9223372036854775807L) {
                treeSet.add(java.lang.Long.valueOf(j6));
            }
            long j10 = this.f30878e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(java.lang.Long.valueOf(j10));
            }
        }
        if (this.f30886m != null) {
            for (int i6 = 0; i6 < this.f30886m.size(); i6++) {
                com.google.android.gms.internal.ads.Q4 q6 = (com.google.android.gms.internal.ads.Q4) this.f30886m.get(i6);
                boolean z10 = true;
                if (!z6 && !zEquals) {
                    z10 = false;
                }
                q6.j(treeSet, z10);
            }
        }
    }

    private final void k(long j6, java.lang.String str, java.util.List list) {
        java.lang.String str2;
        if (!"".equals(this.f30881h)) {
            str = this.f30881h;
        }
        if (g(j6) && "div".equals(this.f30874a) && (str2 = this.f30882i) != null) {
            list.add(new android.util.Pair(str, str2));
            return;
        }
        for (int i6 = 0; i6 < a(); i6++) {
            d(i6).k(j6, str, list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:107:0x0202  */
    /* JADX WARN: Code duplicated, block: B:110:0x0206  */
    /* JADX WARN: Code duplicated, block: B:111:0x0211  */
    /* JADX WARN: Code duplicated, block: B:113:0x0220  */
    /* JADX WARN: Code duplicated, block: B:116:0x0238  */
    /* JADX WARN: Code duplicated, block: B:118:0x0243  */
    /* JADX WARN: Code duplicated, block: B:121:0x0254  */
    /* JADX WARN: Code duplicated, block: B:124:0x0261  */
    private final void l(long j6, java.util.Map map, java.util.Map map2, java.lang.String str, java.util.Map map3) {
        com.google.android.gms.internal.ads.Q4 q6;
        int i6;
        com.google.android.gms.internal.ads.W4 w4A;
        int iO;
        int i10;
        java.lang.Object absoluteSizeSpan;
        int i11;
        int i12 = -1;
        if (g(j6)) {
            java.lang.String str2 = !"".equals(this.f30881h) ? this.f30881h : str;
            java.util.Iterator it = this.f30885l.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.String str3 = (java.lang.String) entry.getKey();
                int iIntValue = this.f30884k.containsKey(str3) ? ((java.lang.Integer) this.f30884k.get(str3)).intValue() : 0;
                int iIntValue2 = ((java.lang.Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    com.google.android.gms.internal.ads.C2185Ax c2185Ax = (com.google.android.gms.internal.ads.C2185Ax) map3.get(str3);
                    c2185Ax.getClass();
                    com.google.android.gms.internal.ads.U4 u6 = (com.google.android.gms.internal.ads.U4) map2.get(str2);
                    u6.getClass();
                    int i13 = u6.f32107j;
                    com.google.android.gms.internal.ads.W4 w4A2 = com.google.android.gms.internal.ads.V4.a(this.f30879f, this.f30880g, map);
                    android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) c2185Ax.q();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new android.text.SpannableStringBuilder();
                        c2185Ax.l(spannableStringBuilder);
                    }
                    if (w4A2 != null) {
                        com.google.android.gms.internal.ads.Q4 q10 = this.f30883j;
                        if (w4A2.r() != i12) {
                            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(w4A2.r()), iIntValue, iIntValue2, 33);
                        }
                        if (w4A2.i()) {
                            spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (w4A2.j()) {
                            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (w4A2.h()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.ForegroundColorSpan(w4A2.n()), iIntValue, iIntValue2, 33);
                        }
                        if (w4A2.g()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.BackgroundColorSpan(w4A2.m()), iIntValue, iIntValue2, 33);
                        }
                        if (w4A2.d() != null) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new android.text.style.TypefaceSpan(w4A2.d()), iIntValue, iIntValue2, 33);
                        }
                        if (w4A2.u() != null) {
                            com.google.android.gms.internal.ads.P4 p4U = w4A2.u();
                            p4U.getClass();
                            int i14 = p4U.f30643a;
                            if (i14 == -1) {
                                i14 = (i13 == 2 || i13 == 1) ? 3 : 1;
                                i11 = 1;
                            } else {
                                i11 = p4U.f30644b;
                            }
                            int i15 = p4U.f30645c;
                            if (i15 == -2) {
                                i15 = 1;
                            }
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new com.google.android.gms.internal.ads.JB(i14, i11, i15), iIntValue, iIntValue2, 33);
                        }
                        int iQ = w4A2.q();
                        if (iQ == 2) {
                            while (true) {
                                if (q10 == null) {
                                    q10 = null;
                                    break;
                                }
                                com.google.android.gms.internal.ads.W4 w4A3 = com.google.android.gms.internal.ads.V4.a(q10.f30879f, q10.f30880g, map);
                                if (w4A3 != null && w4A3.q() == 1) {
                                    break;
                                } else {
                                    q10 = q10.f30883j;
                                }
                            }
                            if (q10 != null) {
                                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                                arrayDeque.push(q10);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        q6 = null;
                                        break;
                                    }
                                    com.google.android.gms.internal.ads.Q4 q11 = (com.google.android.gms.internal.ads.Q4) arrayDeque.pop();
                                    com.google.android.gms.internal.ads.W4 w4A4 = com.google.android.gms.internal.ads.V4.a(q11.f30879f, q11.f30880g, map);
                                    if (w4A4 != null && w4A4.q() == 3) {
                                        q6 = q11;
                                        break;
                                    }
                                    for (int iA = q11.a() - 1; iA >= 0; iA--) {
                                        arrayDeque.push(q11.d(iA));
                                    }
                                }
                                if (q6 != null) {
                                    if (q6.a() != 1 || q6.d(0).f30875b == null) {
                                        i6 = -1;
                                        com.google.android.gms.internal.ads.AbstractC3586eM.e("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        java.lang.String str4 = q6.d(0).f30875b;
                                        int i16 = com.google.android.gms.internal.ads.EW.f27061a;
                                        com.google.android.gms.internal.ads.W4 w4A5 = com.google.android.gms.internal.ads.V4.a(q6.f30879f, q6.f30880g, map);
                                        int iP = w4A5 != null ? w4A5.p() : -1;
                                        i6 = -1;
                                        if (iP == -1 && (w4A = com.google.android.gms.internal.ads.V4.a(q10.f30879f, q10.f30880g, map)) != null) {
                                            iP = w4A.p();
                                        }
                                        spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.HA(str4, iP), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                            if (w4A2.f()) {
                                com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new com.google.android.gms.internal.ads.C3783gA(), iIntValue, iIntValue2, 33);
                            }
                            iO = w4A2.o();
                            if (iO != 1) {
                                if (iO != 2) {
                                    i10 = 33;
                                    absoluteSizeSpan = new android.text.style.RelativeSizeSpan(w4A2.k());
                                } else if (iO == 3) {
                                    com.google.android.gms.internal.ads.AbstractC4005iB.a(spannableStringBuilder, w4A2.k() / 100.0f, iIntValue, iIntValue2, 33);
                                }
                                if ("p".equals(this.f30874a)) {
                                    if (w4A2.l() != Float.MAX_VALUE) {
                                        c2185Ax.j((w4A2.l() * (-90.0f)) / 100.0f);
                                    }
                                    if (w4A2.t() != null) {
                                        c2185Ax.m(w4A2.t());
                                    }
                                    if (w4A2.s() != null) {
                                        c2185Ax.g(w4A2.s());
                                    }
                                }
                                i12 = i6;
                                it = it;
                            } else {
                                i10 = 33;
                                absoluteSizeSpan = new android.text.style.AbsoluteSizeSpan((int) w4A2.k(), true);
                            }
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, absoluteSizeSpan, iIntValue, iIntValue2, i10);
                            if ("p".equals(this.f30874a)) {
                                if (w4A2.l() != Float.MAX_VALUE) {
                                    c2185Ax.j((w4A2.l() * (-90.0f)) / 100.0f);
                                }
                                if (w4A2.t() != null) {
                                    c2185Ax.m(w4A2.t());
                                }
                                if (w4A2.s() != null) {
                                    c2185Ax.g(w4A2.s());
                                }
                            }
                            i12 = i6;
                            it = it;
                        } else if (iQ == 3 || iQ == 4) {
                            spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.O4(), iIntValue, iIntValue2, 33);
                        }
                        i6 = -1;
                        if (w4A2.f()) {
                            com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, new com.google.android.gms.internal.ads.C3783gA(), iIntValue, iIntValue2, 33);
                        }
                        iO = w4A2.o();
                        if (iO != 1) {
                            if (iO != 2) {
                                i10 = 33;
                                absoluteSizeSpan = new android.text.style.RelativeSizeSpan(w4A2.k());
                            } else if (iO == 3) {
                                com.google.android.gms.internal.ads.AbstractC4005iB.a(spannableStringBuilder, w4A2.k() / 100.0f, iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.f30874a)) {
                                if (w4A2.l() != Float.MAX_VALUE) {
                                    c2185Ax.j((w4A2.l() * (-90.0f)) / 100.0f);
                                }
                                if (w4A2.t() != null) {
                                    c2185Ax.m(w4A2.t());
                                }
                                if (w4A2.s() != null) {
                                    c2185Ax.g(w4A2.s());
                                }
                            }
                            i12 = i6;
                            it = it;
                        } else {
                            i10 = 33;
                            absoluteSizeSpan = new android.text.style.AbsoluteSizeSpan((int) w4A2.k(), true);
                        }
                        com.google.android.gms.internal.ads.AbstractC4005iB.b(spannableStringBuilder, absoluteSizeSpan, iIntValue, iIntValue2, i10);
                        if ("p".equals(this.f30874a)) {
                            if (w4A2.l() != Float.MAX_VALUE) {
                                c2185Ax.j((w4A2.l() * (-90.0f)) / 100.0f);
                            }
                            if (w4A2.t() != null) {
                                c2185Ax.m(w4A2.t());
                            }
                            if (w4A2.s() != null) {
                                c2185Ax.g(w4A2.s());
                            }
                        }
                        i12 = i6;
                        it = it;
                    }
                }
            }
            for (int i17 = 0; i17 < a(); i17++) {
                d(i17).l(j6, map, map2, str2, map3);
            }
        }
    }

    private final void m(long j6, boolean z6, java.lang.String str, java.util.Map map) {
        this.f30884k.clear();
        this.f30885l.clear();
        if ("metadata".equals(this.f30874a)) {
            return;
        }
        if (!"".equals(this.f30881h)) {
            str = this.f30881h;
        }
        if (this.f30876c && z6) {
            android.text.SpannableStringBuilder spannableStringBuilderI = i(str, map);
            java.lang.String str2 = this.f30875b;
            str2.getClass();
            spannableStringBuilderI.append((java.lang.CharSequence) str2);
            return;
        }
        if ("br".equals(this.f30874a) && z6) {
            i(str, map).append('\n');
            return;
        }
        if (g(j6)) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.util.HashMap map2 = this.f30884k;
                java.lang.String str3 = (java.lang.String) entry.getKey();
                java.lang.CharSequence charSequenceQ = ((com.google.android.gms.internal.ads.C2185Ax) entry.getValue()).q();
                charSequenceQ.getClass();
                map2.put(str3, java.lang.Integer.valueOf(charSequenceQ.length()));
            }
            boolean zEquals = "p".equals(this.f30874a);
            for (int i6 = 0; i6 < a(); i6++) {
                d(i6).m(j6, z6 || zEquals, str, map);
            }
            if (zEquals) {
                android.text.SpannableStringBuilder spannableStringBuilderI2 = i(str, map);
                int length = spannableStringBuilderI2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderI2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderI2.charAt(length) != '\n') {
                    spannableStringBuilderI2.append('\n');
                }
            }
            for (java.util.Map.Entry entry2 : map.entrySet()) {
                java.util.HashMap map3 = this.f30885l;
                java.lang.String str4 = (java.lang.String) entry2.getKey();
                java.lang.CharSequence charSequenceQ2 = ((com.google.android.gms.internal.ads.C2185Ax) entry2.getValue()).q();
                charSequenceQ2.getClass();
                map3.put(str4, java.lang.Integer.valueOf(charSequenceQ2.length()));
            }
        }
    }

    public final int a() {
        java.util.List list = this.f30886m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final com.google.android.gms.internal.ads.Q4 d(int i6) {
        java.util.List list = this.f30886m;
        if (list != null) {
            return (com.google.android.gms.internal.ads.Q4) list.get(i6);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public final java.util.List e(long j6, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        java.util.List arrayList = new java.util.ArrayList();
        k(j6, this.f30881h, arrayList);
        java.util.TreeMap treeMap = new java.util.TreeMap();
        m(j6, false, this.f30881h, treeMap);
        l(j6, map, map2, this.f30881h, treeMap);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            android.util.Pair pair = (android.util.Pair) arrayList.get(i6);
            java.lang.String str = (java.lang.String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = android.util.Base64.decode(str, 0);
                android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                com.google.android.gms.internal.ads.U4 u6 = (com.google.android.gms.internal.ads.U4) map2.get(pair.first);
                u6.getClass();
                com.google.android.gms.internal.ads.C2185Ax c2185Ax = new com.google.android.gms.internal.ads.C2185Ax();
                c2185Ax.c(bitmapDecodeByteArray);
                c2185Ax.h(u6.f32099b);
                c2185Ax.i(0);
                c2185Ax.e(u6.f32100c, 0);
                c2185Ax.f(u6.f32102e);
                c2185Ax.k(u6.f32103f);
                c2185Ax.d(u6.f32104g);
                c2185Ax.o(u6.f32107j);
                arrayList2.add(c2185Ax.p());
            }
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            com.google.android.gms.internal.ads.U4 u10 = (com.google.android.gms.internal.ads.U4) map2.get(entry.getKey());
            u10.getClass();
            com.google.android.gms.internal.ads.C2185Ax c2185Ax2 = (com.google.android.gms.internal.ads.C2185Ax) entry.getValue();
            java.lang.CharSequence charSequenceQ = c2185Ax2.q();
            charSequenceQ.getClass();
            android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) charSequenceQ;
            for (com.google.android.gms.internal.ads.O4 o6 : (com.google.android.gms.internal.ads.O4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), com.google.android.gms.internal.ads.O4.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(o6), spannableStringBuilder.getSpanEnd(o6), (java.lang.CharSequence) "");
            }
            int i10 = 0;
            while (i10 < spannableStringBuilder.length()) {
                int i11 = i10 + 1;
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
                i10 = i11;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i14 = 0;
            while (i14 < spannableStringBuilder.length() - 1) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i14) == '\n' && spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
                i14 = i15;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i16 = 0;
            while (i16 < spannableStringBuilder.length() - 1) {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i16) == ' ' && spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
                i16 = i17;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c2185Ax2.e(u10.f32100c, u10.f32101d);
            c2185Ax2.f(u10.f32102e);
            c2185Ax2.h(u10.f32099b);
            c2185Ax2.k(u10.f32103f);
            c2185Ax2.n(u10.f32106i, u10.f32105h);
            c2185Ax2.o(u10.f32107j);
            arrayList2.add(c2185Ax2.p());
        }
        return arrayList2;
    }

    public final void f(com.google.android.gms.internal.ads.Q4 q6) {
        if (this.f30886m == null) {
            this.f30886m = new java.util.ArrayList();
        }
        this.f30886m.add(q6);
    }

    public final boolean g(long j6) {
        long j10 = this.f30877d;
        if (j10 == -9223372036854775807L) {
            if (this.f30878e == -9223372036854775807L) {
                return true;
            }
            j10 = -9223372036854775807L;
        }
        if (j10 <= j6 && this.f30878e == -9223372036854775807L) {
            return true;
        }
        if (j10 != -9223372036854775807L || j6 >= this.f30878e) {
            return j10 <= j6 && j6 < this.f30878e;
        }
        return true;
    }

    public final long[] h() {
        java.util.TreeSet treeSet = new java.util.TreeSet();
        int i6 = 0;
        j(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i6] = ((java.lang.Long) it.next()).longValue();
            i6++;
        }
        return jArr;
    }
}
