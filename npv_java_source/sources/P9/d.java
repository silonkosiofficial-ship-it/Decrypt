package P9;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P9.d f8527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final P9.c[] f8528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Map f8529c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.util.List f8532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final X9.InterfaceC1838f f8533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public P9.c[] f8534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f8535f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8536g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8537h;

        public a(X9.Z z6, int i6, int i10) {
            p247y7.AbstractC7350t.f(z6, "source");
            this.f8530a = i6;
            this.f8531b = i10;
            this.f8532c = new java.util.ArrayList();
            this.f8533d = X9.K.b(z6);
            P9.c[] cVarArr = new P9.c[8];
            this.f8534e = cVarArr;
            this.f8535f = cVarArr.length - 1;
        }

        public /* synthetic */ a(X9.Z z6, int i6, int i10, int i11, p247y7.AbstractC7342k abstractC7342k) {
            this(z6, i6, (i11 & 4) != 0 ? i6 : i10);
        }

        private final void a() {
            int i6 = this.f8531b;
            int i10 = this.f8537h;
            if (i6 < i10) {
                if (i6 == 0) {
                    b();
                } else {
                    d(i10 - i6);
                }
            }
        }

        private final void b() {
            p097j7.AbstractC6872n.B(this.f8534e, null, 0, 0, 6, null);
            this.f8535f = this.f8534e.length - 1;
            this.f8536g = 0;
            this.f8537h = 0;
        }

        private final int c(int i6) {
            return this.f8535f + 1 + i6;
        }

        private final int d(int i6) {
            int i10;
            int i11 = 0;
            if (i6 > 0) {
                int length = this.f8534e.length;
                while (true) {
                    length--;
                    i10 = this.f8535f;
                    if (length < i10 || i6 <= 0) {
                        break;
                    }
                    P9.c cVar = this.f8534e[length];
                    p247y7.AbstractC7350t.c(cVar);
                    int i12 = cVar.f8526c;
                    i6 -= i12;
                    this.f8537h -= i12;
                    this.f8536g--;
                    i11++;
                }
                P9.c[] cVarArr = this.f8534e;
                java.lang.System.arraycopy(cVarArr, i10 + 1, cVarArr, i10 + 1 + i11, this.f8536g);
                this.f8535f += i11;
            }
            return i11;
        }

        private final X9.C1839g f(int i6) throws java.io.IOException {
            P9.c cVar;
            if (!h(i6)) {
                int iC = c(i6 - P9.d.f8527a.c().length);
                if (iC >= 0) {
                    P9.c[] cVarArr = this.f8534e;
                    if (iC < cVarArr.length) {
                        cVar = cVarArr[iC];
                        p247y7.AbstractC7350t.c(cVar);
                    }
                }
                throw new java.io.IOException("Header index too large " + (i6 + 1));
            }
            cVar = P9.d.f8527a.c()[i6];
            return cVar.f8524a;
        }

        private final void g(int i6, P9.c cVar) {
            this.f8532c.add(cVar);
            int i10 = cVar.f8526c;
            if (i6 != -1) {
                P9.c cVar2 = this.f8534e[c(i6)];
                p247y7.AbstractC7350t.c(cVar2);
                i10 -= cVar2.f8526c;
            }
            int i11 = this.f8531b;
            if (i10 > i11) {
                b();
                return;
            }
            int iD = d((this.f8537h + i10) - i11);
            if (i6 == -1) {
                int i12 = this.f8536g + 1;
                P9.c[] cVarArr = this.f8534e;
                if (i12 > cVarArr.length) {
                    P9.c[] cVarArr2 = new P9.c[cVarArr.length * 2];
                    java.lang.System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f8535f = this.f8534e.length - 1;
                    this.f8534e = cVarArr2;
                }
                int i13 = this.f8535f;
                this.f8535f = i13 - 1;
                this.f8534e[i13] = cVar;
                this.f8536g++;
            } else {
                this.f8534e[i6 + c(i6) + iD] = cVar;
            }
            this.f8537h += i10;
        }

        private final boolean h(int i6) {
            return i6 >= 0 && i6 <= P9.d.f8527a.c().length - 1;
        }

        private final int i() {
            return I9.d.d(this.f8533d.m(), 255);
        }

        private final void l(int i6) throws java.io.IOException {
            if (h(i6)) {
                this.f8532c.add(P9.d.f8527a.c()[i6]);
                return;
            }
            int iC = c(i6 - P9.d.f8527a.c().length);
            if (iC >= 0) {
                P9.c[] cVarArr = this.f8534e;
                if (iC < cVarArr.length) {
                    java.util.List list = this.f8532c;
                    P9.c cVar = cVarArr[iC];
                    p247y7.AbstractC7350t.c(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new java.io.IOException("Header index too large " + (i6 + 1));
        }

        private final void n(int i6) {
            g(-1, new P9.c(f(i6), j()));
        }

        private final void o() {
            g(-1, new P9.c(P9.d.f8527a.a(j()), j()));
        }

        private final void p(int i6) throws java.io.IOException {
            this.f8532c.add(new P9.c(f(i6), j()));
        }

        private final void q() throws java.io.IOException {
            this.f8532c.add(new P9.c(P9.d.f8527a.a(j()), j()));
        }

        public final java.util.List e() {
            java.util.List listT0 = p097j7.AbstractC6879v.T0(this.f8532c);
            this.f8532c.clear();
            return listT0;
        }

        public final X9.C1839g j() {
            int i6 = i();
            boolean z6 = (i6 & 128) == 128;
            long jM = m(i6, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION);
            if (!z6) {
                return this.f8533d.A(jM);
            }
            X9.C1836d c1836d = new X9.C1836d();
            P9.k.f8687a.b(this.f8533d, jM, c1836d);
            return c1836d.P0();
        }

        public final void k() throws java.io.IOException {
            while (!this.f8533d.j()) {
                int iD = I9.d.d(this.f8533d.m(), 255);
                if (iD == 128) {
                    throw new java.io.IOException("index == 0");
                }
                if ((iD & 128) == 128) {
                    l(m(iD, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) - 1);
                } else if (iD == 64) {
                    o();
                } else if ((iD & 64) == 64) {
                    n(m(iD, 63) - 1);
                } else if ((iD & 32) == 32) {
                    int iM = m(iD, 31);
                    this.f8531b = iM;
                    if (iM < 0 || iM > this.f8530a) {
                        throw new java.io.IOException("Invalid dynamic table size update " + this.f8531b);
                    }
                    a();
                } else if (iD == 16 || iD == 0) {
                    q();
                } else {
                    p(m(iD, 15) - 1);
                }
            }
        }

        public final int m(int i6, int i10) {
            int i11 = i6 & i10;
            if (i11 < i10) {
                return i11;
            }
            int i12 = 0;
            while (true) {
                int i13 = i();
                if ((i13 & 128) == 0) {
                    return i10 + (i13 << i12);
                }
                i10 += (i13 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) << i12;
                i12 += 7;
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f8539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final X9.C1836d f8540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f8542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public P9.c[] f8544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f8545h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8546i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f8547j;

        public b(int i6, boolean z6, X9.C1836d c1836d) {
            p247y7.AbstractC7350t.f(c1836d, "out");
            this.f8538a = i6;
            this.f8539b = z6;
            this.f8540c = c1836d;
            this.f8541d = Integer.MAX_VALUE;
            this.f8543f = i6;
            P9.c[] cVarArr = new P9.c[8];
            this.f8544g = cVarArr;
            this.f8545h = cVarArr.length - 1;
        }

        public /* synthetic */ b(int i6, boolean z6, X9.C1836d c1836d, int i10, p247y7.AbstractC7342k abstractC7342k) {
            this((i10 & 1) != 0 ? 4096 : i6, (i10 & 2) != 0 ? true : z6, c1836d);
        }

        private final void a() {
            int i6 = this.f8543f;
            int i10 = this.f8547j;
            if (i6 < i10) {
                if (i6 == 0) {
                    b();
                } else {
                    c(i10 - i6);
                }
            }
        }

        private final void b() {
            p097j7.AbstractC6872n.B(this.f8544g, null, 0, 0, 6, null);
            this.f8545h = this.f8544g.length - 1;
            this.f8546i = 0;
            this.f8547j = 0;
        }

        private final int c(int i6) {
            int i10;
            int i11 = 0;
            if (i6 > 0) {
                int length = this.f8544g.length;
                while (true) {
                    length--;
                    i10 = this.f8545h;
                    if (length < i10 || i6 <= 0) {
                        break;
                    }
                    P9.c cVar = this.f8544g[length];
                    p247y7.AbstractC7350t.c(cVar);
                    i6 -= cVar.f8526c;
                    int i12 = this.f8547j;
                    P9.c cVar2 = this.f8544g[length];
                    p247y7.AbstractC7350t.c(cVar2);
                    this.f8547j = i12 - cVar2.f8526c;
                    this.f8546i--;
                    i11++;
                }
                P9.c[] cVarArr = this.f8544g;
                java.lang.System.arraycopy(cVarArr, i10 + 1, cVarArr, i10 + 1 + i11, this.f8546i);
                P9.c[] cVarArr2 = this.f8544g;
                int i13 = this.f8545h;
                java.util.Arrays.fill(cVarArr2, i13 + 1, i13 + 1 + i11, (java.lang.Object) null);
                this.f8545h += i11;
            }
            return i11;
        }

        private final void d(P9.c cVar) {
            int i6 = cVar.f8526c;
            int i10 = this.f8543f;
            if (i6 > i10) {
                b();
                return;
            }
            c((this.f8547j + i6) - i10);
            int i11 = this.f8546i + 1;
            P9.c[] cVarArr = this.f8544g;
            if (i11 > cVarArr.length) {
                P9.c[] cVarArr2 = new P9.c[cVarArr.length * 2];
                java.lang.System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f8545h = this.f8544g.length - 1;
                this.f8544g = cVarArr2;
            }
            int i12 = this.f8545h;
            this.f8545h = i12 - 1;
            this.f8544g[i12] = cVar;
            this.f8546i++;
            this.f8547j += i6;
        }

        public final void e(int i6) {
            this.f8538a = i6;
            int iMin = java.lang.Math.min(i6, 16384);
            int i10 = this.f8543f;
            if (i10 == iMin) {
                return;
            }
            if (iMin < i10) {
                this.f8541d = java.lang.Math.min(this.f8541d, iMin);
            }
            this.f8542e = true;
            this.f8543f = iMin;
            a();
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0032  */
        public final void f(X9.C1839g c1839g) {
            int I10;
            int i6;
            p247y7.AbstractC7350t.f(c1839g, "data");
            if (this.f8539b) {
                P9.k kVar = P9.k.f8687a;
                if (kVar.d(c1839g) < c1839g.I()) {
                    X9.C1836d c1836d = new X9.C1836d();
                    kVar.c(c1839g, c1836d);
                    c1839g = c1836d.P0();
                    I10 = c1839g.I();
                    i6 = 128;
                } else {
                    I10 = c1839g.I();
                    i6 = 0;
                }
            } else {
                I10 = c1839g.I();
                i6 = 0;
            }
            h(I10, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, i6);
            this.f8540c.h1(c1839g);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0077  */
        public final void g(java.util.List list) {
            int length;
            int length2;
            p247y7.AbstractC7350t.f(list, "headerBlock");
            if (this.f8542e) {
                int i6 = this.f8541d;
                if (i6 < this.f8543f) {
                    h(i6, 31, 32);
                }
                this.f8542e = false;
                this.f8541d = Integer.MAX_VALUE;
                h(this.f8543f, 31, 32);
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                P9.c cVar = (P9.c) list.get(i10);
                X9.C1839g c1839gM = cVar.f8524a.M();
                X9.C1839g c1839g = cVar.f8525b;
                P9.d dVar = P9.d.f8527a;
                java.lang.Integer num = (java.lang.Integer) dVar.b().get(c1839gM);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (p247y7.AbstractC7350t.b(dVar.c()[iIntValue].f8525b, c1839g)) {
                        length = length2;
                    } else if (p247y7.AbstractC7350t.b(dVar.c()[length2].f8525b, c1839g)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.f8544g.length;
                    for (int i11 = this.f8545h + 1; i11 < length3; i11++) {
                        P9.c cVar2 = this.f8544g[i11];
                        p247y7.AbstractC7350t.c(cVar2);
                        if (p247y7.AbstractC7350t.b(cVar2.f8524a, c1839gM)) {
                            P9.c cVar3 = this.f8544g[i11];
                            p247y7.AbstractC7350t.c(cVar3);
                            if (p247y7.AbstractC7350t.b(cVar3.f8525b, c1839g)) {
                                length2 = P9.d.f8527a.c().length + (i11 - this.f8545h);
                                break;
                            } else if (length == -1) {
                                length = (i11 - this.f8545h) + P9.d.f8527a.c().length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    h(length2, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 128);
                } else {
                    if (length == -1) {
                        this.f8540c.U(64);
                        f(c1839gM);
                    } else if (!c1839gM.J(P9.c.f8518e) || p247y7.AbstractC7350t.b(P9.c.f8523j, c1839gM)) {
                        h(length, 63, 64);
                    } else {
                        h(length, 15, 0);
                        f(c1839g);
                    }
                    f(c1839g);
                    d(cVar);
                }
            }
        }

        public final void h(int i6, int i10, int i11) {
            int i12;
            X9.C1836d c1836d;
            if (i6 < i10) {
                c1836d = this.f8540c;
                i12 = i6 | i11;
            } else {
                this.f8540c.U(i11 | i10);
                i12 = i6 - i10;
                while (i12 >= 128) {
                    this.f8540c.U(128 | (i12 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION));
                    i12 >>>= 7;
                }
                c1836d = this.f8540c;
            }
            c1836d.U(i12);
        }
    }

    static {
        P9.d dVar = new P9.d();
        f8527a = dVar;
        P9.c cVar = new P9.c(P9.c.f8523j, "");
        X9.C1839g c1839g = P9.c.f8520g;
        P9.c cVar2 = new P9.c(c1839g, "GET");
        P9.c cVar3 = new P9.c(c1839g, "POST");
        X9.C1839g c1839g2 = P9.c.f8521h;
        P9.c cVar4 = new P9.c(c1839g2, "/");
        P9.c cVar5 = new P9.c(c1839g2, "/index.html");
        X9.C1839g c1839g3 = P9.c.f8522i;
        P9.c cVar6 = new P9.c(c1839g3, "http");
        P9.c cVar7 = new P9.c(c1839g3, "https");
        X9.C1839g c1839g4 = P9.c.f8519f;
        f8528b = new P9.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new P9.c(c1839g4, "200"), new P9.c(c1839g4, "204"), new P9.c(c1839g4, "206"), new P9.c(c1839g4, "304"), new P9.c(c1839g4, "400"), new P9.c(c1839g4, "404"), new P9.c(c1839g4, "500"), new P9.c("accept-charset", ""), new P9.c("accept-encoding", "gzip, deflate"), new P9.c("accept-language", ""), new P9.c("accept-ranges", ""), new P9.c("accept", ""), new P9.c("access-control-allow-origin", ""), new P9.c("age", ""), new P9.c("allow", ""), new P9.c("authorization", ""), new P9.c("cache-control", ""), new P9.c("content-disposition", ""), new P9.c("content-encoding", ""), new P9.c("content-language", ""), new P9.c("content-length", ""), new P9.c("content-location", ""), new P9.c("content-range", ""), new P9.c("content-type", ""), new P9.c("cookie", ""), new P9.c("date", ""), new P9.c("etag", ""), new P9.c("expect", ""), new P9.c("expires", ""), new P9.c("from", ""), new P9.c("host", ""), new P9.c("if-match", ""), new P9.c("if-modified-since", ""), new P9.c("if-none-match", ""), new P9.c("if-range", ""), new P9.c("if-unmodified-since", ""), new P9.c("last-modified", ""), new P9.c("link", ""), new P9.c("location", ""), new P9.c("max-forwards", ""), new P9.c("proxy-authenticate", ""), new P9.c("proxy-authorization", ""), new P9.c("range", ""), new P9.c("referer", ""), new P9.c("refresh", ""), new P9.c("retry-after", ""), new P9.c("server", ""), new P9.c("set-cookie", ""), new P9.c("strict-transport-security", ""), new P9.c("transfer-encoding", ""), new P9.c("user-agent", ""), new P9.c("vary", ""), new P9.c("via", ""), new P9.c("www-authenticate", "")};
        f8529c = dVar.d();
    }

    private d() {
    }

    private final java.util.Map d() {
        P9.c[] cVarArr = f8528b;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            P9.c[] cVarArr2 = f8528b;
            if (!linkedHashMap.containsKey(cVarArr2[i6].f8524a)) {
                linkedHashMap.put(cVarArr2[i6].f8524a, java.lang.Integer.valueOf(i6));
            }
        }
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(linkedHashMap);
        p247y7.AbstractC7350t.e(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final X9.C1839g a(X9.C1839g c1839g) throws java.io.IOException {
        p247y7.AbstractC7350t.f(c1839g, "name");
        int I10 = c1839g.I();
        for (int i6 = 0; i6 < I10; i6++) {
            byte bN = c1839g.n(i6);
            if (65 <= bN && bN < 91) {
                throw new java.io.IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c1839g.O());
            }
        }
        return c1839g;
    }

    public final java.util.Map b() {
        return f8529c;
    }

    public final P9.c[] c() {
        return f8528b;
    }
}
