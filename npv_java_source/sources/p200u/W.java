package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class W implements p200u.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u.W.b f54772a;

    public static final class a extends p200u.V {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f54773c;

        private a(java.lang.Object obj, p200u.F f6, int i6) {
            super(obj, f6, null);
            this.f54773c = i6;
        }

        public /* synthetic */ a(java.lang.Object obj, p200u.F f6, int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
            this(obj, (i10 & 2) != 0 ? p200u.H.e() : f6, (i10 & 4) != 0 ? p200u.AbstractC7193u.f55068a.a() : i6, null);
        }

        public /* synthetic */ a(java.lang.Object obj, p200u.F f6, int i6, p247y7.AbstractC7342k abstractC7342k) {
            this(obj, f6, i6);
        }

        public final int d() {
            return this.f54773c;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof u.W.a)) {
                return false;
            }
            u.W.a aVar = (u.W.a) obj;
            return p247y7.AbstractC7350t.b(aVar.b(), b()) && p247y7.AbstractC7350t.b(aVar.a(), a()) && p200u.AbstractC7193u.c(aVar.f54773c, this.f54773c);
        }

        public int hashCode() {
            java.lang.Object objB = b();
            return ((((objB != null ? objB.hashCode() : 0) * 31) + p200u.AbstractC7193u.d(this.f54773c)) * 31) + a().hashCode();
        }
    }

    public static final class b extends p200u.X {
        public b() {
            super(null);
        }

        public u.W.a f(java.lang.Object obj, int i6) {
            u.W.a aVar = new u.W.a(obj, null, 0, 6, null);
            c().s(i6, aVar);
            return aVar;
        }
    }

    public W(u.W.b bVar) {
        this.f54772a = bVar;
    }

    @Override // p200u.I, p200u.InterfaceC7175j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p200u.M0 a(p200u.x0 x0Var) {
        long[] jArr;
        int[] iArr;
        int i6;
        p170r.B b6 = new p170r.B(this.f54772a.c().e() + 2);
        p170r.C c6 = new p170r.C(this.f54772a.c().e());
        p170r.C c10 = this.f54772a.c();
        int[] iArr2 = c10.f53394b;
        java.lang.Object[] objArr = c10.f53395c;
        long[] jArr2 = c10.f53393a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j6 = jArr2[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j6) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr2[i14];
                            u.W.a aVar = (u.W.a) objArr[i14];
                            b6.g(i15);
                            c6.s(i15, new p200u.L0((p200u.r) x0Var.a().l(aVar.b()), aVar.a(), aVar.d(), null));
                            i6 = 8;
                        } else {
                            i6 = i11;
                        }
                        j6 >>= i6;
                        i13++;
                        i11 = i6;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        }
        if (!this.f54772a.c().a(0)) {
            b6.f(0, 0);
        }
        if (!this.f54772a.c().a(this.f54772a.b())) {
            b6.g(this.f54772a.b());
        }
        b6.n();
        return new p200u.M0(b6, c6, this.f54772a.b(), this.f54772a.a(), p200u.H.e(), p200u.AbstractC7193u.f55068a.a(), null);
    }
}
