package I2;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.UUID f4994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Q2.p f4995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.Set f4996c;

    public static abstract class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Q2.p f4999c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        java.lang.Class f5001e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f4997a = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        java.util.Set f5000d = new java.util.HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.util.UUID f4998b = java.util.UUID.randomUUID();

        a(java.lang.Class cls) {
            this.f5001e = cls;
            this.f4999c = new Q2.p(this.f4998b.toString(), cls.getName());
            a(cls.getName());
        }

        public final I2.u.a a(java.lang.String str) {
            this.f5000d.add(str);
            return d();
        }

        public final I2.u b() {
            I2.u uVarC = c();
            I2.b bVar = this.f4999c.f8812j;
            boolean z6 = (android.os.Build.VERSION.SDK_INT >= 24 && bVar.e()) || bVar.f() || bVar.g() || bVar.h();
            if (this.f4999c.f8819q && z6) {
                throw new java.lang.IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f4998b = java.util.UUID.randomUUID();
            Q2.p pVar = new Q2.p(this.f4999c);
            this.f4999c = pVar;
            pVar.f8803a = this.f4998b.toString();
            return uVarC;
        }

        abstract I2.u c();

        abstract I2.u.a d();

        public final I2.u.a e(I2.b bVar) {
            this.f4999c.f8812j = bVar;
            return d();
        }

        public final I2.u.a f(androidx.work.b bVar) {
            this.f4999c.f8807e = bVar;
            return d();
        }
    }

    protected u(java.util.UUID uuid, Q2.p pVar, java.util.Set set) {
        this.f4994a = uuid;
        this.f4995b = pVar;
        this.f4996c = set;
    }

    public java.lang.String a() {
        return this.f4994a.toString();
    }

    public java.util.Set b() {
        return this.f4996c;
    }

    public Q2.p c() {
        return this.f4995b;
    }
}
