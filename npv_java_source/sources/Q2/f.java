package Q2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Q2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p143o2.n f8777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p143o2.g f8778b;

    class a extends p143o2.g {
        a(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // p143o2.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(p253z2.h hVar, Q2.d dVar) {
            java.lang.String str = dVar.f8775a;
            if (str == null) {
                hVar.M0(1);
            } else {
                hVar.C(1, str);
            }
            java.lang.Long l6 = dVar.f8776b;
            if (l6 == null) {
                hVar.M0(2);
            } else {
                hVar.l(2, l6.longValue());
            }
        }
    }

    public f(p143o2.n nVar) {
        this.f8777a = nVar;
        this.f8778b = new Q2.f.a(nVar);
    }

    @Override // Q2.e
    public java.lang.Long a(java.lang.String str) {
        p143o2.v vVarG = p143o2.v.g("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            vVarG.M0(1);
        } else {
            vVarG.C(1, str);
        }
        this.f8777a.f();
        java.lang.Long lValueOf = null;
        android.database.Cursor cursorE = p223w2.b.e(this.f8777a, vVarG, false, null);
        try {
            if (cursorE.moveToFirst() && !cursorE.isNull(0)) {
                lValueOf = java.lang.Long.valueOf(cursorE.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorE.close();
            vVarG.r();
        }
    }

    @Override // Q2.e
    public void b(Q2.d dVar) {
        this.f8777a.f();
        this.f8777a.g();
        try {
            this.f8778b.j(dVar);
            this.f8777a.N();
        } finally {
            this.f8777a.n();
        }
    }
}
