package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class GJ0 extends com.google.android.gms.internal.ads.LJ0 implements com.google.android.gms.internal.ads.CB0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC2648Ni0 f27782j = com.google.android.gms.internal.ads.AbstractC2648Ni0.b(new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.YI0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Integer num = (java.lang.Integer) obj;
            java.lang.Integer num2 = (java.lang.Integer) obj2;
            int i6 = com.google.android.gms.internal.ads.GJ0.f27783k;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f27783k = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f27784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.content.Context f27785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f27786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4570nJ0 f27787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5779yJ0 f27788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5459vS f27789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.UI0 f27790i;

    public GJ0(android.content.Context context) {
        com.google.android.gms.internal.ads.UI0 ui0 = new com.google.android.gms.internal.ads.UI0();
        com.google.android.gms.internal.ads.C4570nJ0 c4570nJ0D = com.google.android.gms.internal.ads.C4570nJ0.d(context);
        this.f27784c = new java.lang.Object();
        this.f27785d = context != null ? context.getApplicationContext() : null;
        this.f27790i = ui0;
        this.f27787f = c4570nJ0D;
        this.f27789h = com.google.android.gms.internal.ads.C5459vS.f39390b;
        boolean z6 = false;
        if (context != null && com.google.android.gms.internal.ads.EW.m(context)) {
            z6 = true;
        }
        this.f27786e = z6;
        if (!z6 && context != null && com.google.android.gms.internal.ads.EW.f27061a >= 32) {
            this.f27788g = com.google.android.gms.internal.ads.C5779yJ0.a(context);
        }
        if (this.f27787f.f37576N && context == null) {
            com.google.android.gms.internal.ads.AbstractC3586eM.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    static /* bridge */ /* synthetic */ int l(int i6, int i10) {
        if (i6 == 0 || i6 != i10) {
            return java.lang.Integer.bitCount(i6 & i10);
        }
        return Integer.MAX_VALUE;
    }

    protected static int m(com.google.android.gms.internal.ads.D d6, java.lang.String str, boolean z6) {
        if (!android.text.TextUtils.isEmpty(str) && str.equals(d6.f26563d)) {
            return 4;
        }
        java.lang.String strP = p(str);
        java.lang.String strP2 = p(d6.f26563d);
        if (strP2 == null || strP == null) {
            return (z6 && strP2 == null) ? 1 : 0;
        }
        if (strP2.startsWith(strP) || strP.startsWith(strP2)) {
            return 3;
        }
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        return strP2.split("-", 2)[0].equals(strP.split("-", 2)[0]) ? 2 : 0;
    }

    protected static java.lang.String p(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static /* synthetic */ boolean s(com.google.android.gms.internal.ads.GJ0 gj0, com.google.android.gms.internal.ads.D d6) {
        boolean z6;
        com.google.android.gms.internal.ads.C5779yJ0 c5779yJ0;
        com.google.android.gms.internal.ads.C5779yJ0 c5779yJ1;
        synchronized (gj0.f27784c) {
            try {
                z6 = true;
                if (gj0.f27787f.f37576N && !gj0.f27786e) {
                    int i6 = d6.f26551D;
                    byte b6 = -1;
                    if (i6 != -1 && i6 > 2) {
                        java.lang.String str = d6.f26574o;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2123537834:
                                    if (str.equals("audio/eac3-joc")) {
                                        b6 = 2;
                                    }
                                    break;
                                case 187078296:
                                    if (str.equals("audio/ac3")) {
                                        b6 = 0;
                                    }
                                    break;
                                case 187078297:
                                    if (str.equals("audio/ac4")) {
                                        b6 = 3;
                                    }
                                    break;
                                case 1504578661:
                                    if (str.equals("audio/eac3")) {
                                        b6 = 1;
                                    }
                                    break;
                            }
                            if ((b6 != 0 && b6 != 1 && b6 != 2 && b6 != 3) || (com.google.android.gms.internal.ads.EW.f27061a >= 32 && (c5779yJ0 = gj0.f27788g) != null && c5779yJ0.g())) {
                            }
                        }
                        if (com.google.android.gms.internal.ads.EW.f27061a < 32 || (c5779yJ1 = gj0.f27788g) == null || !c5779yJ1.g() || !c5779yJ1.e() || !gj0.f27788g.f() || !gj0.f27788g.d(gj0.f27789h, d6)) {
                            z6 = false;
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    private static void t(com.google.android.gms.internal.ads.PI0 pi0, com.google.android.gms.internal.ads.C3740fp c3740fp, java.util.Map map) {
        for (int i6 = 0; i6 < pi0.f30686a; i6++) {
            androidx.appcompat.app.D.a(c3740fp.f35433B.get(pi0.b(i6)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        boolean z6;
        com.google.android.gms.internal.ads.C5779yJ0 c5779yJ0;
        synchronized (this.f27784c) {
            try {
                z6 = false;
                if (this.f27787f.f37576N && !this.f27786e && com.google.android.gms.internal.ads.EW.f27061a >= 32 && (c5779yJ0 = this.f27788g) != null && c5779yJ0.g()) {
                    z6 = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (z6) {
            j();
        }
    }

    private static final android.util.Pair v(int i6, com.google.android.gms.internal.ads.KJ0 kj0, int[][][] iArr, com.google.android.gms.internal.ads.AJ0 aj0, java.util.Comparator comparator) {
        java.util.RandomAccess randomAccessP;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i10 = 0; i10 < 2; i10++) {
            if (i6 == kj0.c(i10)) {
                com.google.android.gms.internal.ads.PI0 pi0D = kj0.d(i10);
                for (int i11 = 0; i11 < pi0D.f30686a; i11++) {
                    com.google.android.gms.internal.ads.C2728Pm c2728PmB = pi0D.b(i11);
                    java.util.List listA = aj0.a(i10, c2728PmB, iArr[i10][i11]);
                    boolean[] zArr = new boolean[c2728PmB.f30777a];
                    int i12 = 0;
                    while (i12 < c2728PmB.f30777a) {
                        int i13 = i12 + 1;
                        com.google.android.gms.internal.ads.BJ0 bj0 = (com.google.android.gms.internal.ads.BJ0) listA.get(i12);
                        int iE = bj0.e();
                        if (!zArr[i12] && iE != 0) {
                            if (iE == 1) {
                                randomAccessP = com.google.android.gms.internal.ads.AbstractC3398ci0.P(bj0);
                            } else {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                arrayList2.add(bj0);
                                for (int i14 = i13; i14 < c2728PmB.f30777a; i14++) {
                                    com.google.android.gms.internal.ads.BJ0 bj1 = (com.google.android.gms.internal.ads.BJ0) listA.get(i14);
                                    if (bj1.e() == 2 && bj0.g(bj1)) {
                                        arrayList2.add(bj1);
                                        zArr[i14] = true;
                                    }
                                }
                                randomAccessP = arrayList2;
                            }
                            arrayList.add(randomAccessP);
                        }
                        i12 = i13;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        java.util.List list = (java.util.List) java.util.Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i15 = 0; i15 < list.size(); i15++) {
            iArr2[i15] = ((com.google.android.gms.internal.ads.BJ0) list.get(i15)).f25940E;
        }
        com.google.android.gms.internal.ads.BJ0 bj2 = (com.google.android.gms.internal.ads.BJ0) list.get(0);
        return android.util.Pair.create(new com.google.android.gms.internal.ads.HJ0(bj2.f25939D, iArr2, 0), java.lang.Integer.valueOf(bj2.f25938C));
    }

    @Override // com.google.android.gms.internal.ads.CB0
    public final void a(com.google.android.gms.internal.ads.AB0 ab0) {
        synchronized (this.f27784c) {
            boolean z6 = this.f27787f.f37580R;
        }
    }

    @Override // com.google.android.gms.internal.ads.PJ0
    public final com.google.android.gms.internal.ads.CB0 b() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.PJ0
    public final void c() {
        com.google.android.gms.internal.ads.C5779yJ0 c5779yJ0;
        synchronized (this.f27784c) {
            try {
                if (com.google.android.gms.internal.ads.EW.f27061a >= 32 && (c5779yJ0 = this.f27788g) != null) {
                    c5779yJ0.c();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        super.c();
    }

    @Override // com.google.android.gms.internal.ads.PJ0
    public final void d(com.google.android.gms.internal.ads.C5459vS c5459vS) {
        boolean z6;
        synchronized (this.f27784c) {
            z6 = !this.f27789h.equals(c5459vS);
            this.f27789h = c5459vS;
        }
        if (z6) {
            u();
        }
    }

    @Override // com.google.android.gms.internal.ads.PJ0
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.LJ0
    protected final android.util.Pair k(com.google.android.gms.internal.ads.KJ0 kj0, int[][][] iArr, final int[] iArr2, com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        final com.google.android.gms.internal.ads.C4570nJ0 c4570nJ0;
        int i6;
        final boolean z6;
        final java.lang.String str;
        int[] iArr3;
        int length;
        com.google.android.gms.internal.ads.C5779yJ0 c5779yJ0;
        synchronized (this.f27784c) {
            try {
                c4570nJ0 = this.f27787f;
                if (c4570nJ0.f37576N && com.google.android.gms.internal.ads.EW.f27061a >= 32 && (c5779yJ0 = this.f27788g) != null) {
                    android.os.Looper looperMyLooper = android.os.Looper.myLooper();
                    com.google.android.gms.internal.ads.LC.b(looperMyLooper);
                    c5779yJ0.b(this, looperMyLooper);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        int i10 = 2;
        com.google.android.gms.internal.ads.HJ0[] hj0Arr = new com.google.android.gms.internal.ads.HJ0[2];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i6 = 1;
            if (i12 >= 2) {
                z6 = false;
                break;
            }
            if (kj0.c(i12) == 2 && kj0.d(i12).f30686a > 0) {
                z6 = true;
                break;
            }
            i12++;
        }
        android.util.Pair pairV = v(1, kj0, iArr, new com.google.android.gms.internal.ads.AJ0() { // from class: com.google.android.gms.internal.ads.dJ0
            @Override // com.google.android.gms.internal.ads.AJ0
            public final java.util.List a(int i13, com.google.android.gms.internal.ads.C2728Pm c2728Pm, int[] iArr4) {
                final com.google.android.gms.internal.ads.GJ0 gj0 = this.f34693a;
                com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0 = new com.google.android.gms.internal.ads.InterfaceC2201Bg0() { // from class: com.google.android.gms.internal.ads.gJ0
                    @Override // com.google.android.gms.internal.ads.InterfaceC2201Bg0
                    public final boolean b(java.lang.Object obj) {
                        return com.google.android.gms.internal.ads.GJ0.s(gj0, (com.google.android.gms.internal.ads.D) obj);
                    }
                };
                int i14 = iArr2[i13];
                com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
                for (int i15 = 0; i15 < c2728Pm.f30777a; i15++) {
                    c3083Zh0.g(new com.google.android.gms.internal.ads.C4130jJ0(i13, c2728Pm, i15, c4570nJ0, iArr4[i15], z6, interfaceC2201Bg0, i14));
                }
                return c3083Zh0.j();
            }
        }, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.eJ0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.android.gms.internal.ads.C4130jJ0) java.util.Collections.max((java.util.List) obj)).i((com.google.android.gms.internal.ads.C4130jJ0) java.util.Collections.max((java.util.List) obj2));
            }
        });
        if (pairV != null) {
            hj0Arr[((java.lang.Integer) pairV.second).intValue()] = (com.google.android.gms.internal.ads.HJ0) pairV.first;
        }
        if (pairV == null) {
            str = null;
        } else {
            java.lang.Object obj = pairV.first;
            str = ((com.google.android.gms.internal.ads.HJ0) obj).f28009a.b(((com.google.android.gms.internal.ads.HJ0) obj).f28010b[0]).f26563d;
        }
        android.util.Pair pairV2 = v(2, kj0, iArr, new com.google.android.gms.internal.ads.AJ0() { // from class: com.google.android.gms.internal.ads.bJ0
            /* JADX WARN: Code duplicated, block: B:22:0x003f  */
            @Override // com.google.android.gms.internal.ads.AJ0
            public final java.util.List a(int i13, com.google.android.gms.internal.ads.C2728Pm c2728Pm, int[] iArr4) {
                int i14;
                int i15;
                int i16;
                int i17;
                android.graphics.Point point;
                com.google.android.gms.internal.ads.C3254bJ0 c3254bJ0 = this;
                int i18 = com.google.android.gms.internal.ads.GJ0.f27783k;
                com.google.android.gms.internal.ads.C4570nJ0 c4570nJ1 = c4570nJ0;
                int i19 = iArr2[i13];
                int i20 = c4570nJ1.f35443i;
                int i21 = c4570nJ1.f35444j;
                boolean z10 = c4570nJ1.f35445k;
                if (i20 == Integer.MAX_VALUE) {
                    i14 = Integer.MAX_VALUE;
                } else if (i21 == Integer.MAX_VALUE) {
                    i14 = Integer.MAX_VALUE;
                } else {
                    int i22 = Integer.MAX_VALUE;
                    for (int i23 = 0; i23 < c2728Pm.f30777a; i23++) {
                        com.google.android.gms.internal.ads.D dB = c2728Pm.b(i23);
                        int i24 = dB.f26581v;
                        if (i24 > 0 && (i15 = dB.f26582w) > 0) {
                            if (!z10) {
                                i16 = i20;
                                i17 = i21;
                            } else if ((i24 > i15) != (i20 > i21)) {
                                i17 = i20;
                                i16 = i21;
                            } else {
                                i16 = i20;
                                i17 = i21;
                            }
                            int i25 = i24 * i17;
                            int i26 = i15 * i16;
                            if (i25 >= i26) {
                                int i27 = com.google.android.gms.internal.ads.EW.f27061a;
                                point = new android.graphics.Point(i16, ((i26 + i24) - 1) / i24);
                            } else {
                                int i28 = com.google.android.gms.internal.ads.EW.f27061a;
                                point = new android.graphics.Point(((i25 + i15) - 1) / i15, i17);
                            }
                            int i29 = dB.f26581v;
                            int i30 = dB.f26582w;
                            int i31 = i29 * i30;
                            if (i29 >= ((int) (point.x * 0.98f)) && i30 >= ((int) (point.y * 0.98f)) && i31 < i22) {
                                i22 = i31;
                            }
                        }
                    }
                    i14 = i22;
                }
                com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
                int i32 = 0;
                while (i32 < c2728Pm.f30777a) {
                    int iA = c2728Pm.b(i32).a();
                    c3083Zh0.g(new com.google.android.gms.internal.ads.EJ0(i13, c2728Pm, i32, c4570nJ1, iArr4[i32], str, i19, i14 == Integer.MAX_VALUE || (iA != -1 && iA <= i14)));
                    i32++;
                    c3254bJ0 = this;
                }
                return c3083Zh0.j();
            }
        }, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.cJ0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                java.util.List list = (java.util.List) obj2;
                java.util.List list2 = (java.util.List) obj3;
                return com.google.android.gms.internal.ads.AbstractC2794Rh0.i().c((com.google.android.gms.internal.ads.EJ0) java.util.Collections.max(list, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.CJ0
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.google.android.gms.internal.ads.EJ0.m((com.google.android.gms.internal.ads.EJ0) obj4, (com.google.android.gms.internal.ads.EJ0) obj5);
                    }
                }), (com.google.android.gms.internal.ads.EJ0) java.util.Collections.max(list2, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.CJ0
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.google.android.gms.internal.ads.EJ0.m((com.google.android.gms.internal.ads.EJ0) obj4, (com.google.android.gms.internal.ads.EJ0) obj5);
                    }
                }), new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.CJ0
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.google.android.gms.internal.ads.EJ0.m((com.google.android.gms.internal.ads.EJ0) obj4, (com.google.android.gms.internal.ads.EJ0) obj5);
                    }
                }).b(list.size(), list2.size()).c((com.google.android.gms.internal.ads.EJ0) java.util.Collections.max(list, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.DJ0
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.google.android.gms.internal.ads.EJ0.i((com.google.android.gms.internal.ads.EJ0) obj4, (com.google.android.gms.internal.ads.EJ0) obj5);
                    }
                }), (com.google.android.gms.internal.ads.EJ0) java.util.Collections.max(list2, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.DJ0
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.google.android.gms.internal.ads.EJ0.i((com.google.android.gms.internal.ads.EJ0) obj4, (com.google.android.gms.internal.ads.EJ0) obj5);
                    }
                }), new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.DJ0
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.google.android.gms.internal.ads.EJ0.i((com.google.android.gms.internal.ads.EJ0) obj4, (com.google.android.gms.internal.ads.EJ0) obj5);
                    }
                }).a();
            }
        });
        int i13 = 4;
        android.util.Pair pairV3 = pairV2 == null ? v(4, kj0, iArr, new com.google.android.gms.internal.ads.AJ0() { // from class: com.google.android.gms.internal.ads.ZI0
            @Override // com.google.android.gms.internal.ads.AJ0
            public final java.util.List a(int i14, com.google.android.gms.internal.ads.C2728Pm c2728Pm, int[] iArr4) {
                int i15 = com.google.android.gms.internal.ads.GJ0.f27783k;
                com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
                for (int i16 = 0; i16 < c2728Pm.f30777a; i16++) {
                    c3083Zh0.g(new com.google.android.gms.internal.ads.C4240kJ0(i14, c2728Pm, i16, c4570nJ0, iArr4[i16]));
                }
                return c3083Zh0.j();
            }
        }, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.aJ0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                return ((com.google.android.gms.internal.ads.C4240kJ0) ((java.util.List) obj2).get(0)).compareTo((com.google.android.gms.internal.ads.C4240kJ0) ((java.util.List) obj3).get(0));
            }
        }) : null;
        if (pairV3 != null) {
            hj0Arr[((java.lang.Integer) pairV3.second).intValue()] = (com.google.android.gms.internal.ads.HJ0) pairV3.first;
        } else if (pairV2 != null) {
            hj0Arr[((java.lang.Integer) pairV2.second).intValue()] = (com.google.android.gms.internal.ads.HJ0) pairV2.first;
        }
        int i14 = 3;
        android.util.Pair pairV4 = v(3, kj0, iArr, new com.google.android.gms.internal.ads.AJ0() { // from class: com.google.android.gms.internal.ads.hJ0
            @Override // com.google.android.gms.internal.ads.AJ0
            public final java.util.List a(int i15, com.google.android.gms.internal.ads.C2728Pm c2728Pm, int[] iArr4) {
                int i16 = com.google.android.gms.internal.ads.GJ0.f27783k;
                com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
                for (int i17 = 0; i17 < c2728Pm.f30777a; i17++) {
                    int i18 = i17;
                    c3083Zh0.g(new com.google.android.gms.internal.ads.C5889zJ0(i15, c2728Pm, i18, c4570nJ0, iArr4[i17], str));
                }
                return c3083Zh0.j();
            }
        }, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.iJ0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                return ((com.google.android.gms.internal.ads.C5889zJ0) ((java.util.List) obj2).get(0)).i((com.google.android.gms.internal.ads.C5889zJ0) ((java.util.List) obj3).get(0));
            }
        });
        if (pairV4 != null) {
            hj0Arr[((java.lang.Integer) pairV4.second).intValue()] = (com.google.android.gms.internal.ads.HJ0) pairV4.first;
        }
        int i15 = 0;
        while (i15 < i10) {
            int iC = kj0.c(i15);
            if (iC != i10 && iC != i6 && iC != i14 && iC != i13) {
                com.google.android.gms.internal.ads.PI0 pi0D = kj0.d(i15);
                int[][] iArr4 = iArr[i15];
                int i16 = i11;
                int i17 = i16;
                com.google.android.gms.internal.ads.C2728Pm c2728Pm = null;
                com.google.android.gms.internal.ads.C4350lJ0 c4350lJ0 = null;
                while (i16 < pi0D.f30686a) {
                    com.google.android.gms.internal.ads.C2728Pm c2728PmB = pi0D.b(i16);
                    int[] iArr5 = iArr4[i16];
                    com.google.android.gms.internal.ads.C4350lJ0 c4350lJ1 = c4350lJ0;
                    for (int i18 = i11; i18 < c2728PmB.f30777a; i18++) {
                        if (com.google.android.gms.internal.ads.BB0.a(iArr5[i18], c4570nJ0.f37577O)) {
                            com.google.android.gms.internal.ads.C4350lJ0 c4350lJ2 = new com.google.android.gms.internal.ads.C4350lJ0(c2728PmB.b(i18), iArr5[i18]);
                            if (c4350lJ1 == null || c4350lJ2.compareTo(c4350lJ1) > 0) {
                                i17 = i18;
                                c4350lJ1 = c4350lJ2;
                                c2728Pm = c2728PmB;
                            }
                        }
                    }
                    i16++;
                    c4350lJ0 = c4350lJ1;
                    i11 = 0;
                }
                hj0Arr[i15] = c2728Pm == null ? null : new com.google.android.gms.internal.ads.HJ0(c2728Pm, new int[]{i17}, 0);
            }
            i15++;
            i10 = 2;
            i11 = 0;
            i6 = 1;
            i13 = 4;
            i14 = 3;
        }
        java.util.HashMap map = new java.util.HashMap();
        int i19 = 2;
        for (int i20 = 0; i20 < 2; i20++) {
            t(kj0.d(i20), c4570nJ0, map);
        }
        t(kj0.e(), c4570nJ0, map);
        for (int i21 = 0; i21 < 2; i21++) {
            androidx.appcompat.app.D.a(map.get(java.lang.Integer.valueOf(kj0.c(i21))));
        }
        int i22 = 0;
        while (i22 < i19) {
            com.google.android.gms.internal.ads.PI0 pi0D2 = kj0.d(i22);
            if (c4570nJ0.g(i22, pi0D2)) {
                c4570nJ0.e(i22, pi0D2);
                hj0Arr[i22] = null;
            }
            i22++;
            i19 = 2;
        }
        int i23 = 0;
        for (int i24 = i19; i23 < i24; i24 = 2) {
            int iC2 = kj0.c(i23);
            if (c4570nJ0.f(i23) || c4570nJ0.f35434C.contains(java.lang.Integer.valueOf(iC2))) {
                hj0Arr[i23] = null;
            }
            i23++;
        }
        com.google.android.gms.internal.ads.UI0 ui0 = this.f27790i;
        com.google.android.gms.internal.ads.XJ0 xj0H = h();
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0A = com.google.android.gms.internal.ads.VI0.a(hj0Arr);
        int i25 = 2;
        com.google.android.gms.internal.ads.IJ0[] ij0Arr = new com.google.android.gms.internal.ads.IJ0[2];
        int i26 = 0;
        while (i26 < i25) {
            com.google.android.gms.internal.ads.HJ0 hj0 = hj0Arr[i26];
            if (hj0 == null || (length = (iArr3 = hj0.f28010b).length) == 0) {
                i26 = i26;
            } else {
                ij0Arr[i26] = length == 1 ? new com.google.android.gms.internal.ads.JJ0(hj0.f28009a, iArr3[0], 0, 0, null) : ui0.a(hj0.f28009a, iArr3, 0, xj0H, (com.google.android.gms.internal.ads.AbstractC3398ci0) abstractC3398ci0A.get(i26));
            }
            i26++;
            i25 = 2;
        }
        com.google.android.gms.internal.ads.EB0[] eb0Arr = new com.google.android.gms.internal.ads.EB0[i25];
        for (int i27 = 0; i27 < i25; i27++) {
            eb0Arr[i27] = (c4570nJ0.f(i27) || c4570nJ0.f35434C.contains(java.lang.Integer.valueOf(kj0.c(i27))) || (kj0.c(i27) != -2 && ij0Arr[i27] == null)) ? null : com.google.android.gms.internal.ads.EB0.f26921b;
        }
        return android.util.Pair.create(eb0Arr, ij0Arr);
    }

    public final com.google.android.gms.internal.ads.C4570nJ0 n() {
        com.google.android.gms.internal.ads.C4570nJ0 c4570nJ0;
        synchronized (this.f27784c) {
            c4570nJ0 = this.f27787f;
        }
        return c4570nJ0;
    }

    public final void r(com.google.android.gms.internal.ads.C4460mJ0 c4460mJ0) {
        boolean z6;
        com.google.android.gms.internal.ads.C4570nJ0 c4570nJ0 = new com.google.android.gms.internal.ads.C4570nJ0(c4460mJ0);
        synchronized (this.f27784c) {
            z6 = !this.f27787f.equals(c4570nJ0);
            this.f27787f = c4570nJ0;
        }
        if (z6) {
            if (c4570nJ0.f37576N && this.f27785d == null) {
                com.google.android.gms.internal.ads.AbstractC3586eM.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            j();
        }
    }
}
