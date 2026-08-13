package T;

/* JADX INFO: loaded from: classes.dex */
public final class m implements androidx.compose.ui.window.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f12831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y0.e f12832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.p f12834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final T.u.a f12835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final T.u.a f12836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final T.u.a f12837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final T.u.a f12838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final T.u.b f12839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final T.u.b f12840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final T.u.b f12841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final T.u.b f12842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final T.u.b f12843m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final T.m.a f12844D = new T.m.a();

        a() {
            super(2);
        }

        public final void a(Y0.r rVar, Y0.r rVar2) {
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((Y0.r) obj, (Y0.r) obj2);
            return p087i7.M.f46721a;
        }
    }

    private m(long j6, Y0.e eVar, int i6, p237x7.p pVar) {
        this.f12831a = j6;
        this.f12832b = eVar;
        this.f12833c = i6;
        this.f12834d = pVar;
        int iS0 = eVar.S0(Y0.k.e(j6));
        T.u uVar = T.u.f12876a;
        this.f12835e = uVar.g(iS0);
        this.f12836f = uVar.d(iS0);
        this.f12837g = uVar.e(0);
        this.f12838h = uVar.f(0);
        int iS1 = eVar.S0(Y0.k.f(j6));
        this.f12839i = uVar.h(iS1);
        this.f12840j = uVar.a(iS1);
        this.f12841k = uVar.c(iS1);
        this.f12842l = uVar.i(i6);
        this.f12843m = uVar.b(i6);
    }

    public /* synthetic */ m(long j6, Y0.e eVar, int i6, p237x7.p pVar, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, eVar, (i10 & 4) != 0 ? eVar.S0(S.AbstractC1578s0.j()) : i6, (i10 & 8) != 0 ? T.m.a.f12844D : pVar, null);
    }

    public /* synthetic */ m(long j6, Y0.e eVar, int i6, p237x7.p pVar, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, eVar, i6, pVar);
    }

    @Override // androidx.compose.ui.window.r
    public long a(Y0.r rVar, long j6, Y0.v vVar, long j10) {
        int iA;
        int i6 = 0;
        java.util.List listP = p097j7.AbstractC6879v.p(this.f12835e, this.f12836f, Y0.p.h(rVar.e()) < Y0.t.g(j6) / 2 ? this.f12837g : this.f12838h);
        int size = listP.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                iA = 0;
                break;
            }
            iA = ((T.u.a) listP.get(i10)).a(rVar, j6, Y0.t.g(j10), vVar);
            if (i10 == p097j7.AbstractC6879v.o(listP) || (iA >= 0 && Y0.t.g(j10) + iA <= Y0.t.g(j6))) {
                break;
            }
            i10++;
        }
        java.util.List listP2 = p097j7.AbstractC6879v.p(this.f12839i, this.f12840j, this.f12841k, Y0.p.i(rVar.e()) < Y0.t.f(j6) / 2 ? this.f12842l : this.f12843m);
        int size2 = listP2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            int iA2 = ((T.u.b) listP2.get(i11)).a(rVar, j6, Y0.t.f(j10));
            if (i11 == p097j7.AbstractC6879v.o(listP2) || (iA2 >= this.f12833c && Y0.t.f(j10) + iA2 <= Y0.t.f(j6) - this.f12833c)) {
                i6 = iA2;
                break;
            }
        }
        long jA = Y0.q.a(iA, i6);
        this.f12834d.u(rVar, Y0.s.a(jA, j10));
        return jA;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T.m)) {
            return false;
        }
        T.m mVar = (T.m) obj;
        return Y0.k.d(this.f12831a, mVar.f12831a) && p247y7.AbstractC7350t.b(this.f12832b, mVar.f12832b) && this.f12833c == mVar.f12833c && p247y7.AbstractC7350t.b(this.f12834d, mVar.f12834d);
    }

    public int hashCode() {
        return (((((Y0.k.g(this.f12831a) * 31) + this.f12832b.hashCode()) * 31) + this.f12833c) * 31) + this.f12834d.hashCode();
    }

    public java.lang.String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((java.lang.Object) Y0.k.h(this.f12831a)) + ", density=" + this.f12832b + ", verticalMargin=" + this.f12833c + ", onPositionCalculated=" + this.f12834d + ')';
    }
}
