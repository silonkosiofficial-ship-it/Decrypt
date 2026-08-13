package S;

/* JADX INFO: loaded from: classes.dex */
final class W implements S0.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T.k f10553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f10556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final S.W.a f10557f = new S.W.a();

    public static final class a implements S0.L {
        a() {
        }

        @Override // S0.L
        public int a(int i6) {
            if (i6 <= S.W.this.f10554c - 1) {
                return i6;
            }
            if (i6 <= S.W.this.f10555d - 1) {
                return i6 - 1;
            }
            return i6 <= S.W.this.f10556e + 1 ? i6 - 2 : S.W.this.f10556e;
        }

        @Override // S0.L
        public int b(int i6) {
            if (i6 < S.W.this.f10554c) {
                return i6;
            }
            if (i6 < S.W.this.f10555d) {
                return i6 + 1;
            }
            if (i6 > S.W.this.f10556e) {
                i6 = S.W.this.f10556e;
            }
            return i6 + 2;
        }
    }

    public W(T.k kVar) {
        this.f10553b = kVar;
        this.f10554c = S8.r.o0(kVar.b(), kVar.a(), 0, false, 6, null);
        this.f10555d = S8.r.v0(kVar.b(), kVar.a(), 0, false, 6, null);
        this.f10556e = kVar.c().length();
    }

    @Override // S0.g0
    public S0.e0 a(M0.C1332d c1332d) {
        int length = c1332d.i().length();
        int i6 = this.f10556e;
        int i10 = 0;
        java.lang.String strI = c1332d.i();
        if (length > i6) {
            strI = S8.r.e1(strI, E7.j.q(0, this.f10556e));
        }
        java.lang.String str = "";
        int i11 = 0;
        while (i10 < strI.length()) {
            int i12 = i11 + 1;
            java.lang.String str2 = str + strI.charAt(i10);
            if (i12 == this.f10554c || i11 + 2 == this.f10555d) {
                str = str2 + this.f10553b.a();
            } else {
                str = str2;
            }
            i10++;
            i11 = i12;
        }
        return new S0.e0(new M0.C1332d(str, null, null, 6, null), this.f10557f);
    }
}
