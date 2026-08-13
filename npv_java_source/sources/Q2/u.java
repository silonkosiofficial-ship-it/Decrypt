package Q2;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Q2.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p143o2.n f8844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p143o2.g f8845b;

    class a extends p143o2.g {
        a(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p143o2.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(p253z2.h hVar, Q2.s sVar) {
            java.lang.String str = sVar.f8842a;
            if (str == null) {
                hVar.M0(1);
            } else {
                hVar.C(1, str);
            }
            java.lang.String str2 = sVar.f8843b;
            if (str2 == null) {
                hVar.M0(2);
            } else {
                hVar.C(2, str2);
            }
        }
    }

    public u(p143o2.n nVar) {
        this.f8844a = nVar;
        this.f8845b = new Q2.u.a(nVar);
    }

    @Override // Q2.t
    public void a(Q2.s sVar) {
        this.f8844a.f();
        this.f8844a.g();
        try {
            this.f8845b.j(sVar);
            this.f8844a.N();
        } finally {
            this.f8844a.n();
        }
    }

    @Override // Q2.t
    public java.util.List b(java.lang.String str) {
        p143o2.v vVarG = p143o2.v.g("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            vVarG.M0(1);
        } else {
            vVarG.C(1, str);
        }
        this.f8844a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8844a, vVarG, false, null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(cursorE.getCount());
            while (cursorE.moveToNext()) {
                arrayList.add(cursorE.getString(0));
            }
            cursorE.close();
            vVarG.r();
            return arrayList;
        } catch (java.lang.Throwable th) {
            cursorE.close();
            vVarG.r();
            throw th;
        }
    }
}
