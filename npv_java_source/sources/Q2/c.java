package Q2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Q2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p143o2.n f8772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p143o2.g f8773b;

    class a extends p143o2.g {
        a(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p143o2.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(p253z2.h hVar, Q2.a aVar) {
            java.lang.String str = aVar.f8770a;
            if (str == null) {
                hVar.M0(1);
            } else {
                hVar.C(1, str);
            }
            java.lang.String str2 = aVar.f8771b;
            if (str2 == null) {
                hVar.M0(2);
            } else {
                hVar.C(2, str2);
            }
        }
    }

    public c(p143o2.n nVar) {
        this.f8772a = nVar;
        this.f8773b = new Q2.c.a(nVar);
    }

    @Override // Q2.b
    public java.util.List a(java.lang.String str) {
        p143o2.v vVarG = p143o2.v.g("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            vVarG.M0(1);
        } else {
            vVarG.C(1, str);
        }
        this.f8772a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8772a, vVarG, false, null);
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

    @Override // Q2.b
    public void b(Q2.a aVar) {
        this.f8772a.f();
        this.f8772a.g();
        try {
            this.f8773b.j(aVar);
            this.f8772a.N();
        } finally {
            this.f8772a.n();
        }
    }

    @Override // Q2.b
    public boolean c(java.lang.String str) {
        p143o2.v vVarG = p143o2.v.g("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            vVarG.M0(1);
        } else {
            vVarG.C(1, str);
        }
        this.f8772a.f();
        boolean z6 = false;
        android.database.Cursor cursorE = p223w2.b.e(this.f8772a, vVarG, false, null);
        try {
            if (cursorE.moveToFirst()) {
                z6 = cursorE.getInt(0) != 0;
            }
            return z6;
        } finally {
            cursorE.close();
            vVarG.r();
        }
    }

    @Override // Q2.b
    public boolean d(java.lang.String str) {
        p143o2.v vVarG = p143o2.v.g("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            vVarG.M0(1);
        } else {
            vVarG.C(1, str);
        }
        this.f8772a.f();
        boolean z6 = false;
        android.database.Cursor cursorE = p223w2.b.e(this.f8772a, vVarG, false, null);
        try {
            if (cursorE.moveToFirst()) {
                z6 = cursorE.getInt(0) != 0;
            }
            return z6;
        } finally {
            cursorE.close();
            vVarG.r();
        }
    }
}
