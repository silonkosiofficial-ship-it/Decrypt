package M7;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M7.g.a f7070c = new M7.g.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final M7.g f7071d = new M7.g(p097j7.AbstractC6879v.p(M7.f.a.f7066e, M7.f.d.f7069e, M7.f.b.f7067e, M7.f.c.f7068e));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f7072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f7073b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final M7.g a() {
            return M7.g.f7071d;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final M7.f f7074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7075b;

        public b(M7.f fVar, int i6) {
            p247y7.AbstractC7350t.f(fVar, "kind");
            this.f7074a = fVar;
            this.f7075b = i6;
        }

        public final M7.f a() {
            return this.f7074a;
        }

        public final int b() {
            return this.f7075b;
        }

        public final M7.f c() {
            return this.f7074a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof M7.g.b)) {
                return false;
            }
            M7.g.b bVar = (M7.g.b) obj;
            return p247y7.AbstractC7350t.b(this.f7074a, bVar.f7074a) && this.f7075b == bVar.f7075b;
        }

        public int hashCode() {
            return (this.f7074a.hashCode() * 31) + this.f7075b;
        }

        public java.lang.String toString() {
            return "KindWithArity(kind=" + this.f7074a + ", arity=" + this.f7075b + ')';
        }
    }

    public g(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "kinds");
        this.f7072a = list;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : list) {
            p138n8.c cVarB = ((M7.f) obj).b();
            java.lang.Object arrayList = linkedHashMap.get(cVarB);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(cVarB, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        this.f7073b = linkedHashMap;
    }

    private final java.lang.Integer d(java.lang.String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i6 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int iCharAt = str.charAt(i10) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i6 = (i6 * 10) + iCharAt;
        }
        return java.lang.Integer.valueOf(i6);
    }

    public final M7.f b(p138n8.c cVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(cVar, "packageFqName");
        p247y7.AbstractC7350t.f(str, "className");
        M7.g.b bVarC = c(cVar, str);
        if (bVarC != null) {
            return bVarC.c();
        }
        return null;
    }

    public final M7.g.b c(p138n8.c cVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(cVar, "packageFqName");
        p247y7.AbstractC7350t.f(str, "className");
        java.util.List<M7.f> list = (java.util.List) this.f7073b.get(cVar);
        if (list == null) {
            return null;
        }
        for (M7.f fVar : list) {
            if (S8.r.V(str, fVar.a(), false, 2, null)) {
                java.lang.String strSubstring = str.substring(fVar.a().length());
                p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
                java.lang.Integer numD = d(strSubstring);
                if (numD != null) {
                    return new M7.g.b(fVar, numD.intValue());
                }
            }
        }
        return null;
    }
}
