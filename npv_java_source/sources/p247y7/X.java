package p247y7;

/* JADX INFO: loaded from: classes3.dex */
public final class X implements F7.p {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final y7.X.a f57260H = new y7.X.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f57261C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f57262D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final F7.r f57263E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final boolean f57264F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private volatile java.util.List f57265G;

    public static final class a {

        /* JADX INFO: renamed from: y7.X$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0757a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f57266a;

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
                f57266a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final java.lang.String a(F7.p pVar) {
            java.lang.String str;
            p247y7.AbstractC7350t.f(pVar, "typeParameter");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i6 = y7.X.a.C0757a.f57266a[pVar.s().ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    str = "in ";
                } else {
                    if (i6 != 3) {
                        throw new p087i7.s();
                    }
                    str = "out ";
                }
                sb.append(str);
            } else {
                p087i7.M m6 = p087i7.M.f46721a;
            }
            sb.append(pVar.getName());
            return sb.toString();
        }
    }

    public X(java.lang.Object obj, java.lang.String str, F7.r rVar, boolean z6) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(rVar, "variance");
        this.f57261C = obj;
        this.f57262D = str;
        this.f57263E = rVar;
        this.f57264F = z6;
    }

    public final void a(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "upperBounds");
        if (this.f57265G == null) {
            this.f57265G = list;
            return;
        }
        throw new java.lang.IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p247y7.X) {
            p247y7.X x6 = (p247y7.X) obj;
            if (p247y7.AbstractC7350t.b(this.f57261C, x6.f57261C) && p247y7.AbstractC7350t.b(getName(), x6.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // F7.p
    public java.lang.String getName() {
        return this.f57262D;
    }

    @Override // F7.p
    public java.util.List getUpperBounds() {
        java.util.List list = this.f57265G;
        if (list != null) {
            return list;
        }
        java.util.List listE = p097j7.AbstractC6879v.e(p247y7.P.h(java.lang.Object.class));
        this.f57265G = listE;
        return listE;
    }

    public int hashCode() {
        java.lang.Object obj = this.f57261C;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @Override // F7.p
    public F7.r s() {
        return this.f57263E;
    }

    public java.lang.String toString() {
        return f57260H.a(this);
    }
}
