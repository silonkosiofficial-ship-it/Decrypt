package K7;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K7.a f6152a = new K7.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Set f6153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p138n8.b f6154c;

    /* JADX INFO: renamed from: K7.a$a, reason: collision with other inner class name */
    public static final class C0148a implements g8.t.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p247y7.K f6155a;

        C0148a(p247y7.K k6) {
            this.f6155a = k6;
        }

        @Override // g8.t.c
        public void a() {
        }

        @Override // g8.t.c
        public g8.t.a c(p138n8.b bVar, O7.a0 a0Var) {
            p247y7.AbstractC7350t.f(bVar, "classId");
            p247y7.AbstractC7350t.f(a0Var, "source");
            if (!p247y7.AbstractC7350t.b(bVar, X7.A.f15891a.a())) {
                return null;
            }
            this.f6155a.f57250C = true;
            return null;
        }
    }

    static {
        java.util.List listP = p097j7.AbstractC6879v.p(X7.B.f15896a, X7.B.f15907l, X7.B.f15908m, X7.B.f15899d, X7.B.f15901f, X7.B.f15904i);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = listP.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(p138n8.b.m((p138n8.c) it.next()));
        }
        f6153b = linkedHashSet;
        p138n8.b bVarM = p138n8.b.m(X7.B.f15905j);
        p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
        f6154c = bVarM;
    }

    private a() {
    }

    public final p138n8.b a() {
        return f6154c;
    }

    public final java.util.Set b() {
        return f6153b;
    }

    public final boolean c(p068g8.t tVar) {
        p247y7.AbstractC7350t.f(tVar, "klass");
        p247y7.K k6 = new p247y7.K();
        tVar.d(new K7.a.C0148a(k6), null);
        return k6.f57250C;
    }
}
