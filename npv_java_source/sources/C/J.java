package C;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C.C0836j f993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.ArrayList f994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.List f999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.util.List f1000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1001i;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1003b;

        public a(int i6, int i10) {
            this.f1002a = i6;
            this.f1003b = i10;
        }

        public /* synthetic */ a(int i6, int i10, int i11, p247y7.AbstractC7342k abstractC7342k) {
            this(i6, (i11 & 2) != 0 ? 0 : i10);
        }

        public final int a() {
            return this.f1002a;
        }

        public final int b() {
            return this.f1003b;
        }
    }

    private static final class b implements C.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C.J.b f1004a = new C.J.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f1005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f1006c;

        private b() {
        }

        public void a(int i6) {
            f1005b = i6;
        }

        public void b(int i6) {
            f1006c = i6;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.List f1008b;

        public c(int i6, java.util.List list) {
            this.f1007a = i6;
            this.f1008b = list;
        }

        public final int a() {
            return this.f1007a;
        }

        public final java.util.List b() {
            return this.f1008b;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f1009D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i6) {
            super(1);
            this.f1009D = i6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer l(C.J.a aVar) {
            return java.lang.Integer.valueOf(aVar.a() - this.f1009D);
        }
    }

    public J(C.C0836j c0836j) {
        this.f993a = c0836j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i6 = 0;
        arrayList.add(new C.J.a(i6, i6, 2, null));
        this.f994b = arrayList;
        this.f998f = -1;
        this.f999g = new java.util.ArrayList();
        this.f1000h = p097j7.AbstractC6879v.m();
    }

    private final int a() {
        return ((int) java.lang.Math.sqrt((((double) f()) * 1.0d) / ((double) this.f1001i))) + 1;
    }

    private final java.util.List b(int i6) {
        if (i6 == this.f1000h.size()) {
            return this.f1000h;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i6);
        for (int i10 = 0; i10 < i6; i10++) {
            arrayList.add(C.C0829c.a(C.I.a(1)));
        }
        this.f1000h = arrayList;
        return arrayList;
    }

    private final void g() {
        this.f994b.clear();
        int i6 = 0;
        this.f994b.add(new C.J.a(i6, i6, 2, null));
        this.f995c = 0;
        this.f996d = 0;
        this.f997e = 0;
        this.f998f = -1;
        this.f999g.clear();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    public final C.J.c c(int i6) {
        int i10;
        boolean z6;
        int i11;
        int i12;
        if (!this.f993a.i()) {
            int i13 = i6 * this.f1001i;
            return new C.J.c(i13, b(E7.j.d(E7.j.g(this.f1001i, f() - i13), 0)));
        }
        int iMin = java.lang.Math.min(i6 / a(), this.f994b.size() - 1);
        int iA = a() * iMin;
        int iA2 = ((C.J.a) this.f994b.get(iMin)).a();
        int iB = ((C.J.a) this.f994b.get(iMin)).b();
        int i14 = this.f995c;
        if (iA <= i14 && i14 <= i6) {
            iA2 = this.f996d;
            iB = this.f997e;
            iA = i14;
        } else if (iMin == this.f998f && (i10 = i6 - iA) < this.f999g.size()) {
            iA2 = ((java.lang.Number) this.f999g.get(i10)).intValue();
            iA = i6;
            iB = 0;
        }
        if (iA % a() == 0) {
            int i15 = i6 - iA;
            z6 = 2 <= i15 && i15 < a();
        }
        if (z6) {
            this.f998f = iMin;
            this.f999g.clear();
        }
        if (iA > i6) {
            throw new java.lang.IllegalStateException("currentLine > lineIndex".toString());
        }
        while (iA < i6 && iA2 < f()) {
            if (z6) {
                this.f999g.add(java.lang.Integer.valueOf(iA2));
            }
            int i16 = 0;
            while (i16 < this.f1001i && iA2 < f()) {
                if (iB == 0) {
                    i12 = iB;
                    iB = i(iA2, this.f1001i - i16);
                } else {
                    i12 = 0;
                }
                i16 += iB;
                if (i16 > this.f1001i) {
                    break;
                }
                iA2++;
                iB = i12;
            }
            iA++;
            if (iA % a() == 0 && iA2 < f()) {
                if (this.f994b.size() != iA / a()) {
                    throw new java.lang.IllegalStateException("invalid starting point".toString());
                }
                this.f994b.add(new C.J.a(iA2, iB));
            }
        }
        this.f995c = i6;
        this.f996d = iA2;
        this.f997e = iB;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        int i18 = iA2;
        while (i17 < this.f1001i && i18 < f()) {
            if (iB == 0) {
                int i19 = iB;
                iB = i(i18, this.f1001i - i17);
                i11 = i19;
            } else {
                i11 = 0;
            }
            i17 += iB;
            if (i17 > this.f1001i) {
                break;
            }
            i18++;
            arrayList.add(C.C0829c.a(C.I.a(iB)));
            iB = i11;
        }
        return new C.J.c(iA2, arrayList);
    }

    public final int d(int i6) {
        int i10 = 0;
        if (f() <= 0) {
            return 0;
        }
        if (i6 >= f()) {
            throw new java.lang.IllegalArgumentException("ItemIndex > total count".toString());
        }
        if (!this.f993a.i()) {
            return i6 / this.f1001i;
        }
        int iK = p097j7.AbstractC6879v.k(this.f994b, 0, 0, new C.J.d(i6), 3, null);
        int i11 = 2;
        if (iK < 0) {
            iK = (-iK) - 2;
        }
        int iA = a() * iK;
        int iA2 = ((C.J.a) this.f994b.get(iK)).a();
        if (iA2 > i6) {
            throw new java.lang.IllegalArgumentException("currentItemIndex > itemIndex".toString());
        }
        int i12 = 0;
        while (iA2 < i6) {
            int i13 = iA2 + 1;
            int i14 = i(iA2, this.f1001i - i12);
            i12 += i14;
            int i15 = this.f1001i;
            if (i12 >= i15) {
                iA++;
                i12 = i12 == i15 ? 0 : i14;
            }
            if (iA % a() == 0 && iA / a() >= this.f994b.size()) {
                this.f994b.add(new C.J.a(i13 - (i12 > 0 ? 1 : 0), i10, i11, null));
            }
            iA2 = i13;
        }
        return i12 + i(i6, this.f1001i - i12) > this.f1001i ? iA + 1 : iA;
    }

    public final int e() {
        return this.f1001i;
    }

    public final int f() {
        return this.f993a.f().a();
    }

    public final void h(int i6) {
        if (i6 != this.f1001i) {
            this.f1001i = i6;
            g();
        }
    }

    public final int i(int i6, int i10) {
        C.J.b bVar = C.J.b.f1004a;
        bVar.a(i10);
        bVar.b(this.f1001i);
        D.InterfaceC0867d.a aVar = this.f993a.f().get(i6);
        return C.C0829c.d(((C.C0829c) ((C.C0835i) aVar.c()).b().u(bVar, java.lang.Integer.valueOf(i6 - aVar.b()))).g());
    }
}
