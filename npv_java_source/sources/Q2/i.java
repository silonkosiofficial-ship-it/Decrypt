package Q2;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Q2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p143o2.n f8782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p143o2.g f8783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p143o2.w f8784c;

    class a extends p143o2.g {
        a(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // p143o2.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(p253z2.h hVar, Q2.g gVar) {
            java.lang.String str = gVar.f8780a;
            if (str == null) {
                hVar.M0(1);
            } else {
                hVar.C(1, str);
            }
            hVar.l(2, gVar.f8781b);
        }
    }

    class b extends p143o2.w {
        b(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(p143o2.n nVar) {
        this.f8782a = nVar;
        this.f8783b = new Q2.i.a(nVar);
        this.f8784c = new Q2.i.b(nVar);
    }

    @Override // Q2.h
    public java.util.List a() {
        p143o2.v vVarG = p143o2.v.g("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f8782a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8782a, vVarG, false, null);
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

    @Override // Q2.h
    public Q2.g b(java.lang.String str) {
        p143o2.v vVarG = p143o2.v.g("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            vVarG.M0(1);
        } else {
            vVarG.C(1, str);
        }
        this.f8782a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8782a, vVarG, false, null);
        try {
            return cursorE.moveToFirst() ? new Q2.g(cursorE.getString(p223w2.a.e(cursorE, "work_spec_id")), cursorE.getInt(p223w2.a.e(cursorE, "system_id"))) : null;
        } finally {
            cursorE.close();
            vVarG.r();
        }
    }

    @Override // Q2.h
    public void c(Q2.g gVar) {
        this.f8782a.f();
        this.f8782a.g();
        try {
            this.f8783b.j(gVar);
            this.f8782a.N();
        } finally {
            this.f8782a.n();
        }
    }

    @Override // Q2.h
    public void d(java.lang.String str) {
        this.f8782a.f();
        p253z2.h hVarB = this.f8784c.b();
        if (str == null) {
            hVarB.M0(1);
        } else {
            hVarB.C(1, str);
        }
        this.f8782a.g();
        try {
            hVarB.I();
            this.f8782a.N();
        } finally {
            this.f8782a.n();
            this.f8784c.h(hVarB);
        }
    }
}
