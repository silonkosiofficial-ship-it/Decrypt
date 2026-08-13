package F7;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F7.q.a f2794c = new F7.q.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F7.q f2795d = new F7.q(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F7.r f2796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F7.o f2797b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final F7.q a(F7.o oVar) {
            p247y7.AbstractC7350t.f(oVar, "type");
            return new F7.q(F7.r.IN, oVar);
        }

        public final F7.q b(F7.o oVar) {
            p247y7.AbstractC7350t.f(oVar, "type");
            return new F7.q(F7.r.OUT, oVar);
        }

        public final F7.q c() {
            return F7.q.f2795d;
        }

        public final F7.q d(F7.o oVar) {
            p247y7.AbstractC7350t.f(oVar, "type");
            return new F7.q(F7.r.INVARIANT, oVar);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2798a;

        static {
            int[] iArr = new int[F7.r.values().length];
            try {
                iArr[F7.r.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[F7.r.IN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[F7.r.OUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f2798a = iArr;
        }
    }

    public q(F7.r rVar, F7.o oVar) {
        java.lang.String str;
        this.f2796a = rVar;
        this.f2797b = oVar;
        if ((rVar == null) == (oVar == null)) {
            return;
        }
        if (rVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + rVar + " requires type to be specified.";
        }
        throw new java.lang.IllegalArgumentException(str.toString());
    }

    public final F7.r a() {
        return this.f2796a;
    }

    public final F7.o b() {
        return this.f2797b;
    }

    public final F7.o c() {
        return this.f2797b;
    }

    public final F7.r d() {
        return this.f2796a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F7.q)) {
            return false;
        }
        F7.q qVar = (F7.q) obj;
        return this.f2796a == qVar.f2796a && p247y7.AbstractC7350t.b(this.f2797b, qVar.f2797b);
    }

    public int hashCode() {
        F7.r rVar = this.f2796a;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        F7.o oVar = this.f2797b;
        return iHashCode + (oVar != null ? oVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.lang.String str;
        F7.r rVar = this.f2796a;
        int i6 = rVar == null ? -1 : F7.q.b.f2798a[rVar.ordinal()];
        if (i6 == -1) {
            return "*";
        }
        if (i6 == 1) {
            return java.lang.String.valueOf(this.f2797b);
        }
        if (i6 == 2) {
            sb = new java.lang.StringBuilder();
            str = "in ";
        } else {
            if (i6 != 3) {
                throw new p087i7.s();
            }
            sb = new java.lang.StringBuilder();
            str = "out ";
        }
        sb.append(str);
        sb.append(this.f2797b);
        return sb.toString();
    }
}
