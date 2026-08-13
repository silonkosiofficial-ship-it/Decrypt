package Q2;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final java.lang.String f8801s = I2.j.f("WorkSpec");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p150p.a f8802t = new Q2.p.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f8803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I2.s f8804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f8805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.String f8806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.work.b f8807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.work.b f8808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f8811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public I2.b f8812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public I2.a f8814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f8815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f8816n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f8817o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f8818p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8819q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public I2.n f8820r;

    class a implements p150p.a {
        a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f8821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public I2.s f8822b;

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Q2.p.b)) {
                return false;
            }
            Q2.p.b bVar = (Q2.p.b) obj;
            if (this.f8822b != bVar.f8822b) {
                return false;
            }
            return this.f8821a.equals(bVar.f8821a);
        }

        public int hashCode() {
            return (this.f8821a.hashCode() * 31) + this.f8822b.hashCode();
        }
    }

    public p(Q2.p pVar) {
        this.f8804b = I2.s.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f23846c;
        this.f8807e = bVar;
        this.f8808f = bVar;
        this.f8812j = I2.b.f4941i;
        this.f8814l = I2.a.EXPONENTIAL;
        this.f8815m = 30000L;
        this.f8818p = -1L;
        this.f8820r = I2.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f8803a = pVar.f8803a;
        this.f8805c = pVar.f8805c;
        this.f8804b = pVar.f8804b;
        this.f8806d = pVar.f8806d;
        this.f8807e = new androidx.work.b(pVar.f8807e);
        this.f8808f = new androidx.work.b(pVar.f8808f);
        this.f8809g = pVar.f8809g;
        this.f8810h = pVar.f8810h;
        this.f8811i = pVar.f8811i;
        this.f8812j = new I2.b(pVar.f8812j);
        this.f8813k = pVar.f8813k;
        this.f8814l = pVar.f8814l;
        this.f8815m = pVar.f8815m;
        this.f8816n = pVar.f8816n;
        this.f8817o = pVar.f8817o;
        this.f8818p = pVar.f8818p;
        this.f8819q = pVar.f8819q;
        this.f8820r = pVar.f8820r;
    }

    public p(java.lang.String str, java.lang.String str2) {
        this.f8804b = I2.s.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f23846c;
        this.f8807e = bVar;
        this.f8808f = bVar;
        this.f8812j = I2.b.f4941i;
        this.f8814l = I2.a.EXPONENTIAL;
        this.f8815m = 30000L;
        this.f8818p = -1L;
        this.f8820r = I2.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f8803a = str;
        this.f8805c = str2;
    }

    public long a() {
        if (c()) {
            return this.f8816n + java.lang.Math.min(18000000L, this.f8814l == I2.a.LINEAR ? this.f8815m * ((long) this.f8813k) : (long) java.lang.Math.scalb(this.f8815m, this.f8813k - 1));
        }
        if (!d()) {
            long jCurrentTimeMillis = this.f8816n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f8809g;
        }
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        long j6 = this.f8816n;
        long j10 = j6 == 0 ? jCurrentTimeMillis2 + this.f8809g : j6;
        long j11 = this.f8811i;
        long j12 = this.f8810h;
        if (j11 != j12) {
            return j10 + j12 + (j6 == 0 ? j11 * (-1) : 0L);
        }
        return j10 + (j6 != 0 ? j12 : 0L);
    }

    public boolean b() {
        return !I2.b.f4941i.equals(this.f8812j);
    }

    public boolean c() {
        return this.f8804b == I2.s.ENQUEUED && this.f8813k > 0;
    }

    public boolean d() {
        return this.f8810h != 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q2.p.class != obj.getClass()) {
            return false;
        }
        Q2.p pVar = (Q2.p) obj;
        if (this.f8809g != pVar.f8809g || this.f8810h != pVar.f8810h || this.f8811i != pVar.f8811i || this.f8813k != pVar.f8813k || this.f8815m != pVar.f8815m || this.f8816n != pVar.f8816n || this.f8817o != pVar.f8817o || this.f8818p != pVar.f8818p || this.f8819q != pVar.f8819q || !this.f8803a.equals(pVar.f8803a) || this.f8804b != pVar.f8804b || !this.f8805c.equals(pVar.f8805c)) {
            return false;
        }
        java.lang.String str = this.f8806d;
        if (str == null ? pVar.f8806d == null : str.equals(pVar.f8806d)) {
            return this.f8807e.equals(pVar.f8807e) && this.f8808f.equals(pVar.f8808f) && this.f8812j.equals(pVar.f8812j) && this.f8814l == pVar.f8814l && this.f8820r == pVar.f8820r;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.f8803a.hashCode() * 31) + this.f8804b.hashCode()) * 31) + this.f8805c.hashCode()) * 31;
        java.lang.String str = this.f8806d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f8807e.hashCode()) * 31) + this.f8808f.hashCode()) * 31;
        long j6 = this.f8809g;
        int i6 = (iHashCode2 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j10 = this.f8810h;
        int i10 = (i6 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f8811i;
        int iHashCode3 = (((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f8812j.hashCode()) * 31) + this.f8813k) * 31) + this.f8814l.hashCode()) * 31;
        long j12 = this.f8815m;
        int i11 = (iHashCode3 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f8816n;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f8817o;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f8818p;
        return ((((i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + (this.f8819q ? 1 : 0)) * 31) + this.f8820r.hashCode();
    }

    public java.lang.String toString() {
        return "{WorkSpec: " + this.f8803a + "}";
    }
}
