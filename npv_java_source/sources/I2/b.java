package I2;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final I2.b f4941i = new I2.b.a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private I2.k f4942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f4947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f4948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private I2.c f4949h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f4950a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f4951b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        I2.k f4952c = I2.k.NOT_REQUIRED;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f4953d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f4954e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f4955f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f4956g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        I2.c f4957h = new I2.c();

        public I2.b a() {
            return new I2.b(this);
        }

        public I2.b.a b(I2.k kVar) {
            this.f4952c = kVar;
            return this;
        }
    }

    public b() {
        this.f4942a = I2.k.NOT_REQUIRED;
        this.f4947f = -1L;
        this.f4948g = -1L;
        this.f4949h = new I2.c();
    }

    b(I2.b.a aVar) {
        this.f4942a = I2.k.NOT_REQUIRED;
        this.f4947f = -1L;
        this.f4948g = -1L;
        this.f4949h = new I2.c();
        this.f4943b = aVar.f4950a;
        int i6 = android.os.Build.VERSION.SDK_INT;
        this.f4944c = aVar.f4951b;
        this.f4942a = aVar.f4952c;
        this.f4945d = aVar.f4953d;
        this.f4946e = aVar.f4954e;
        if (i6 >= 24) {
            this.f4949h = aVar.f4957h;
            this.f4947f = aVar.f4955f;
            this.f4948g = aVar.f4956g;
        }
    }

    public b(I2.b bVar) {
        this.f4942a = I2.k.NOT_REQUIRED;
        this.f4947f = -1L;
        this.f4948g = -1L;
        this.f4949h = new I2.c();
        this.f4943b = bVar.f4943b;
        this.f4944c = bVar.f4944c;
        this.f4942a = bVar.f4942a;
        this.f4945d = bVar.f4945d;
        this.f4946e = bVar.f4946e;
        this.f4949h = bVar.f4949h;
    }

    public I2.c a() {
        return this.f4949h;
    }

    public I2.k b() {
        return this.f4942a;
    }

    public long c() {
        return this.f4947f;
    }

    public long d() {
        return this.f4948g;
    }

    public boolean e() {
        return this.f4949h.c() > 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I2.b.class != obj.getClass()) {
            return false;
        }
        I2.b bVar = (I2.b) obj;
        if (this.f4943b == bVar.f4943b && this.f4944c == bVar.f4944c && this.f4945d == bVar.f4945d && this.f4946e == bVar.f4946e && this.f4947f == bVar.f4947f && this.f4948g == bVar.f4948g && this.f4942a == bVar.f4942a) {
            return this.f4949h.equals(bVar.f4949h);
        }
        return false;
    }

    public boolean f() {
        return this.f4945d;
    }

    public boolean g() {
        return this.f4943b;
    }

    public boolean h() {
        return this.f4944c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f4942a.hashCode() * 31) + (this.f4943b ? 1 : 0)) * 31) + (this.f4944c ? 1 : 0)) * 31) + (this.f4945d ? 1 : 0)) * 31) + (this.f4946e ? 1 : 0)) * 31;
        long j6 = this.f4947f;
        int i6 = (iHashCode + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j10 = this.f4948g;
        return ((i6 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f4949h.hashCode();
    }

    public boolean i() {
        return this.f4946e;
    }

    public void j(I2.c cVar) {
        this.f4949h = cVar;
    }

    public void k(I2.k kVar) {
        this.f4942a = kVar;
    }

    public void l(boolean z6) {
        this.f4945d = z6;
    }

    public void m(boolean z6) {
        this.f4943b = z6;
    }

    public void n(boolean z6) {
        this.f4944c = z6;
    }

    public void o(boolean z6) {
        this.f4946e = z6;
    }

    public void p(long j6) {
        this.f4947f = j6;
    }

    public void q(long j6) {
        this.f4948g = j6;
    }
}
