package p201u0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u0.d.b f55191k = new u0.d.b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f55192l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f55193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f55194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f55195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f55196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f55197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p201u0.n f55198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f55199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f55200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f55201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f55202j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f55203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f55204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55206d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f55207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f55208f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f55209g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f55210h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final java.util.ArrayList f55211i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private u0.d.a.C0723a f55212j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f55213k;

        /* JADX INFO: renamed from: u0.d$a$a, reason: collision with other inner class name */
        private static final class C0723a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private java.lang.String f55214a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f55215b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float f55216c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f55217d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f55218e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private float f55219f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private float f55220g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private float f55221h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private java.util.List f55222i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private java.util.List f55223j;

            public C0723a(java.lang.String str, float f6, float f10, float f11, float f12, float f13, float f14, float f15, java.util.List list, java.util.List list2) {
                this.f55214a = str;
                this.f55215b = f6;
                this.f55216c = f10;
                this.f55217d = f11;
                this.f55218e = f12;
                this.f55219f = f13;
                this.f55220g = f14;
                this.f55221h = f15;
                this.f55222i = list;
                this.f55223j = list2;
            }

            public /* synthetic */ C0723a(java.lang.String str, float f6, float f10, float f11, float f12, float f13, float f14, float f15, java.util.List list, java.util.List list2, int i6, p247y7.AbstractC7342k abstractC7342k) {
                this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0.0f : f6, (i6 & 4) != 0 ? 0.0f : f10, (i6 & 8) != 0 ? 0.0f : f11, (i6 & 16) != 0 ? 1.0f : f12, (i6 & 32) == 0 ? f13 : 1.0f, (i6 & 64) != 0 ? 0.0f : f14, (i6 & 128) == 0 ? f15 : 0.0f, (i6 & 256) != 0 ? p201u0.o.e() : list, (i6 & 512) != 0 ? new java.util.ArrayList() : list2);
            }

            public final java.util.List a() {
                return this.f55223j;
            }

            public final java.util.List b() {
                return this.f55222i;
            }

            public final java.lang.String c() {
                return this.f55214a;
            }

            public final float d() {
                return this.f55216c;
            }

            public final float e() {
                return this.f55217d;
            }

            public final float f() {
                return this.f55215b;
            }

            public final float g() {
                return this.f55218e;
            }

            public final float h() {
                return this.f55219f;
            }

            public final float i() {
                return this.f55220g;
            }

            public final float j() {
                return this.f55221h;
            }
        }

        private a(java.lang.String str, float f6, float f10, float f11, float f12, long j6, int i6, boolean z6) {
            this.f55203a = str;
            this.f55204b = f6;
            this.f55205c = f10;
            this.f55206d = f11;
            this.f55207e = f12;
            this.f55208f = j6;
            this.f55209g = i6;
            this.f55210h = z6;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f55211i = arrayList;
            u0.d.a.C0723a c0723a = new u0.d.a.C0723a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.f55212j = c0723a;
            p201u0.e.f(arrayList, c0723a);
        }

        public /* synthetic */ a(java.lang.String str, float f6, float f10, float f11, float f12, long j6, int i6, boolean z6, int i10, p247y7.AbstractC7342k abstractC7342k) {
            this((i10 & 1) != 0 ? "" : str, f6, f10, f11, f12, (i10 & 32) != 0 ? p141o0.C7016y0.f52264b.g() : j6, (i10 & 64) != 0 ? p141o0.AbstractC6960f0.f52197a.z() : i6, (i10 & 128) != 0 ? false : z6, null);
        }

        public /* synthetic */ a(java.lang.String str, float f6, float f10, float f11, float f12, long j6, int i6, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
            this(str, f6, f10, f11, f12, j6, i6, z6);
        }

        private final p201u0.n e(u0.d.a.C0723a c0723a) {
            return new p201u0.n(c0723a.c(), c0723a.f(), c0723a.d(), c0723a.e(), c0723a.g(), c0723a.h(), c0723a.i(), c0723a.j(), c0723a.b(), c0723a.a());
        }

        private final void h() {
            if (!this.f55213k) {
                return;
            }
            C0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }

        private final u0.d.a.C0723a i() {
            return (u0.d.a.C0723a) p201u0.e.d(this.f55211i);
        }

        public final u0.d.a a(java.lang.String str, float f6, float f10, float f11, float f12, float f13, float f14, float f15, java.util.List list) {
            h();
            p201u0.e.f(this.f55211i, new u0.d.a.C0723a(str, f6, f10, f11, f12, f13, f14, f15, list, null, 512, null));
            return this;
        }

        public final u0.d.a c(java.util.List list, int i6, java.lang.String str, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p141o0.AbstractC6984n0 abstractC6984n1, float f10, float f11, int i10, int i11, float f12, float f13, float f14, float f15) {
            h();
            i().a().add(new p201u0.s(str, list, i6, abstractC6984n0, f6, abstractC6984n1, f10, f11, i10, i11, f12, f13, f14, f15, null));
            return this;
        }

        public final p201u0.d f() {
            h();
            while (this.f55211i.size() > 1) {
                g();
            }
            p201u0.d dVar = new p201u0.d(this.f55203a, this.f55204b, this.f55205c, this.f55206d, this.f55207e, e(this.f55212j), this.f55208f, this.f55209g, this.f55210h, 0, 512, null);
            this.f55213k = true;
            return dVar;
        }

        public final u0.d.a g() {
            h();
            i().a().add(e((u0.d.a.C0723a) p201u0.e.e(this.f55211i)));
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            int i6;
            synchronized (this) {
                i6 = p201u0.d.f55192l;
                p201u0.d.f55192l = i6 + 1;
            }
            return i6;
        }
    }

    private d(java.lang.String str, float f6, float f10, float f11, float f12, p201u0.n nVar, long j6, int i6, boolean z6, int i10) {
        this.f55193a = str;
        this.f55194b = f6;
        this.f55195c = f10;
        this.f55196d = f11;
        this.f55197e = f12;
        this.f55198f = nVar;
        this.f55199g = j6;
        this.f55200h = i6;
        this.f55201i = z6;
        this.f55202j = i10;
    }

    public /* synthetic */ d(java.lang.String str, float f6, float f10, float f11, float f12, p201u0.n nVar, long j6, int i6, boolean z6, int i10, int i11, p247y7.AbstractC7342k abstractC7342k) {
        this(str, f6, f10, f11, f12, nVar, j6, i6, z6, (i11 & 512) != 0 ? f55191k.a() : i10, null);
    }

    public /* synthetic */ d(java.lang.String str, float f6, float f10, float f11, float f12, p201u0.n nVar, long j6, int i6, boolean z6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(str, f6, f10, f11, f12, nVar, j6, i6, z6, i10);
    }

    public final boolean c() {
        return this.f55201i;
    }

    public final float d() {
        return this.f55195c;
    }

    public final float e() {
        return this.f55194b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p201u0.d)) {
            return false;
        }
        p201u0.d dVar = (p201u0.d) obj;
        return p247y7.AbstractC7350t.b(this.f55193a, dVar.f55193a) && Y0.i.s(this.f55194b, dVar.f55194b) && Y0.i.s(this.f55195c, dVar.f55195c) && this.f55196d == dVar.f55196d && this.f55197e == dVar.f55197e && p247y7.AbstractC7350t.b(this.f55198f, dVar.f55198f) && p141o0.C7016y0.o(this.f55199g, dVar.f55199g) && p141o0.AbstractC6960f0.E(this.f55200h, dVar.f55200h) && this.f55201i == dVar.f55201i;
    }

    public final int f() {
        return this.f55202j;
    }

    public final java.lang.String g() {
        return this.f55193a;
    }

    public final p201u0.n h() {
        return this.f55198f;
    }

    public int hashCode() {
        return (((((((((((((((this.f55193a.hashCode() * 31) + Y0.i.t(this.f55194b)) * 31) + Y0.i.t(this.f55195c)) * 31) + java.lang.Float.floatToIntBits(this.f55196d)) * 31) + java.lang.Float.floatToIntBits(this.f55197e)) * 31) + this.f55198f.hashCode()) * 31) + p141o0.C7016y0.u(this.f55199g)) * 31) + p141o0.AbstractC6960f0.F(this.f55200h)) * 31) + p190t.h.a(this.f55201i);
    }

    public final int i() {
        return this.f55200h;
    }

    public final long j() {
        return this.f55199g;
    }

    public final float k() {
        return this.f55197e;
    }

    public final float l() {
        return this.f55196d;
    }
}
