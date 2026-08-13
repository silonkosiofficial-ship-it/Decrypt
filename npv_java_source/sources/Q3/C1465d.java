package Q3;

/* JADX INFO: renamed from: Q3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1465d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.accounts.Account f8919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Set f8920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f8921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f8922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f8923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.view.View f8924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f8925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f8926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p095j4.a f8927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.lang.Integer f8928j;

    /* JADX INFO: renamed from: Q3.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.accounts.Account f8929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p170r.C7027b f8930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f8931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.String f8932d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final p095j4.a f8933e = p095j4.a.f49263L;

        public Q3.C1465d a() {
            return new Q3.C1465d(this.f8929a, this.f8930b, null, 0, null, this.f8931c, this.f8932d, this.f8933e, false);
        }

        public Q3.C1465d.a b(java.lang.String str) {
            this.f8931c = str;
            return this;
        }

        public final Q3.C1465d.a c(java.util.Collection collection) {
            if (this.f8930b == null) {
                this.f8930b = new p170r.C7027b();
            }
            this.f8930b.addAll(collection);
            return this;
        }

        public final Q3.C1465d.a d(android.accounts.Account account) {
            this.f8929a = account;
            return this;
        }

        public final Q3.C1465d.a e(java.lang.String str) {
            this.f8932d = str;
            return this;
        }
    }

    public C1465d(android.accounts.Account account, java.util.Set set, java.util.Map map, int i6, android.view.View view, java.lang.String str, java.lang.String str2, p095j4.a aVar, boolean z6) {
        this.f8919a = account;
        java.util.Set setEmptySet = set == null ? java.util.Collections.emptySet() : j$.util.DesugarCollections.unmodifiableSet(set);
        this.f8920b = setEmptySet;
        map = map == null ? java.util.Collections.emptyMap() : map;
        this.f8922d = map;
        this.f8924f = view;
        this.f8923e = i6;
        this.f8925g = str;
        this.f8926h = str2;
        this.f8927i = aVar == null ? p095j4.a.f49263L : aVar;
        java.util.HashSet hashSet = new java.util.HashSet(setEmptySet);
        java.util.Iterator it = map.values().iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.D.a(it.next());
            throw null;
        }
        this.f8921c = j$.util.DesugarCollections.unmodifiableSet(hashSet);
    }

    public android.accounts.Account a() {
        return this.f8919a;
    }

    public java.lang.String b() {
        android.accounts.Account account = this.f8919a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public android.accounts.Account c() {
        android.accounts.Account account = this.f8919a;
        return account != null ? account : new android.accounts.Account("<<default account>>", "com.google");
    }

    public java.util.Set d() {
        return this.f8921c;
    }

    public java.util.Set e(O3.a aVar) {
        androidx.appcompat.app.D.a(this.f8922d.get(aVar));
        return this.f8920b;
    }

    public java.lang.String f() {
        return this.f8925g;
    }

    public java.util.Set g() {
        return this.f8920b;
    }

    public final p095j4.a h() {
        return this.f8927i;
    }

    public final java.lang.Integer i() {
        return this.f8928j;
    }

    public final java.lang.String j() {
        return this.f8926h;
    }

    public final void k(java.lang.Integer num) {
        this.f8928j = num;
    }
}
