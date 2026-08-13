package p012b1;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f24062a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p082i1.f f24063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f24065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24066e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f24067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p012b1.w f24068b;

        public a(java.lang.Object obj, p012b1.w wVar) {
            p247y7.AbstractC7350t.f(obj, "id");
            p247y7.AbstractC7350t.f(wVar, "reference");
            this.f24067a = obj;
            this.f24068b = wVar;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b1.i.a)) {
                return false;
            }
            b1.i.a aVar = (b1.i.a) obj;
            return p247y7.AbstractC7350t.b(this.f24067a, aVar.f24067a) && p247y7.AbstractC7350t.b(this.f24068b, aVar.f24068b);
        }

        public int hashCode() {
            return (this.f24067a.hashCode() * 31) + this.f24068b.hashCode();
        }

        public java.lang.String toString() {
            return "BaselineAnchor(id=" + this.f24067a + ", reference=" + this.f24068b + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f24069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f24070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p012b1.w f24071c;

        public b(java.lang.Object obj, int i6, p012b1.w wVar) {
            p247y7.AbstractC7350t.f(obj, "id");
            p247y7.AbstractC7350t.f(wVar, "reference");
            this.f24069a = obj;
            this.f24070b = i6;
            this.f24071c = wVar;
        }

        public final java.lang.Object a() {
            return this.f24069a;
        }

        public final int b() {
            return this.f24070b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b1.i.b)) {
                return false;
            }
            b1.i.b bVar = (b1.i.b) obj;
            return p247y7.AbstractC7350t.b(this.f24069a, bVar.f24069a) && this.f24070b == bVar.f24070b && p247y7.AbstractC7350t.b(this.f24071c, bVar.f24071c);
        }

        public int hashCode() {
            return (((this.f24069a.hashCode() * 31) + this.f24070b) * 31) + this.f24071c.hashCode();
        }

        public java.lang.String toString() {
            return "HorizontalAnchor(id=" + this.f24069a + ", index=" + this.f24070b + ", reference=" + this.f24071c + ")";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f24072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f24073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p012b1.w f24074c;

        public c(java.lang.Object obj, int i6, p012b1.w wVar) {
            p247y7.AbstractC7350t.f(obj, "id");
            p247y7.AbstractC7350t.f(wVar, "reference");
            this.f24072a = obj;
            this.f24073b = i6;
            this.f24074c = wVar;
        }

        public final java.lang.Object a() {
            return this.f24072a;
        }

        public final int b() {
            return this.f24073b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b1.i.c)) {
                return false;
            }
            b1.i.c cVar = (b1.i.c) obj;
            return p247y7.AbstractC7350t.b(this.f24072a, cVar.f24072a) && this.f24073b == cVar.f24073b && p247y7.AbstractC7350t.b(this.f24074c, cVar.f24074c);
        }

        public int hashCode() {
            return (((this.f24072a.hashCode() * 31) + this.f24073b) * 31) + this.f24074c.hashCode();
        }

        public java.lang.String toString() {
            return "VerticalAnchor(id=" + this.f24072a + ", index=" + this.f24073b + ", reference=" + this.f24074c + ")";
        }
    }

    public i(p082i1.f fVar) {
        p082i1.f fVarN0;
        this.f24063b = (fVar == null || (fVarN0 = fVar.d()) == null) ? new p082i1.f(new char[0]) : fVarN0;
        this.f24065d = 1000;
        this.f24066e = 1000;
    }

    public final void a(p012b1.z zVar) {
        p247y7.AbstractC7350t.f(zVar, "state");
        p092j1.b.f49130a.v(this.f24063b, zVar, new j1.b.d());
    }

    public final p082i1.f b(p012b1.w wVar) {
        p247y7.AbstractC7350t.f(wVar, "<this>");
        java.lang.String string = wVar.a().toString();
        if (this.f24063b.b0(string) == null) {
            this.f24063b.k0(string, new p082i1.f(new char[0]));
        }
        return this.f24063b.a0(string);
    }

    public final int c() {
        return this.f24064c;
    }

    public void d() {
        this.f24063b.clear();
        this.f24066e = this.f24065d;
        this.f24064c = 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p012b1.i) {
            return p247y7.AbstractC7350t.b(this.f24063b, ((p012b1.i) obj).f24063b);
        }
        return false;
    }

    public int hashCode() {
        return this.f24063b.hashCode();
    }
}
