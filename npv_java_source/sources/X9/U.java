package X9;

/* JADX INFO: loaded from: classes2.dex */
public final class U {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final X9.U.a f16094h = new X9.U.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f16095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public X9.U f16100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public X9.U f16101g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public U() {
        this.f16095a = new byte[8192];
        this.f16099e = true;
        this.f16098d = false;
    }

    public U(byte[] bArr, int i6, int i10, boolean z6, boolean z10) {
        p247y7.AbstractC7350t.f(bArr, "data");
        this.f16095a = bArr;
        this.f16096b = i6;
        this.f16097c = i10;
        this.f16098d = z6;
        this.f16099e = z10;
    }

    public final void a() {
        int i6;
        X9.U u6 = this.f16101g;
        if (u6 == this) {
            throw new java.lang.IllegalStateException("cannot compact".toString());
        }
        p247y7.AbstractC7350t.c(u6);
        if (u6.f16099e) {
            int i10 = this.f16097c - this.f16096b;
            X9.U u10 = this.f16101g;
            p247y7.AbstractC7350t.c(u10);
            int i11 = 8192 - u10.f16097c;
            X9.U u11 = this.f16101g;
            p247y7.AbstractC7350t.c(u11);
            if (u11.f16098d) {
                i6 = 0;
            } else {
                X9.U u12 = this.f16101g;
                p247y7.AbstractC7350t.c(u12);
                i6 = u12.f16096b;
            }
            if (i10 > i11 + i6) {
                return;
            }
            X9.U u13 = this.f16101g;
            p247y7.AbstractC7350t.c(u13);
            g(u13, i10);
            b();
            X9.V.b(this);
        }
    }

    public final X9.U b() {
        X9.U u6 = this.f16100f;
        if (u6 == this) {
            u6 = null;
        }
        X9.U u10 = this.f16101g;
        p247y7.AbstractC7350t.c(u10);
        u10.f16100f = this.f16100f;
        X9.U u11 = this.f16100f;
        p247y7.AbstractC7350t.c(u11);
        u11.f16101g = this.f16101g;
        this.f16100f = null;
        this.f16101g = null;
        return u6;
    }

    public final X9.U c(X9.U u6) {
        p247y7.AbstractC7350t.f(u6, "segment");
        u6.f16101g = this;
        u6.f16100f = this.f16100f;
        X9.U u10 = this.f16100f;
        p247y7.AbstractC7350t.c(u10);
        u10.f16101g = u6;
        this.f16100f = u6;
        return u6;
    }

    public final X9.U d() {
        this.f16098d = true;
        return new X9.U(this.f16095a, this.f16096b, this.f16097c, true, false);
    }

    public final X9.U e(int i6) {
        X9.U uC;
        if (i6 <= 0 || i6 > this.f16097c - this.f16096b) {
            throw new java.lang.IllegalArgumentException("byteCount out of range".toString());
        }
        if (i6 >= 1024) {
            uC = d();
        } else {
            uC = X9.V.c();
            byte[] bArr = this.f16095a;
            byte[] bArr2 = uC.f16095a;
            int i10 = this.f16096b;
            p097j7.AbstractC6872n.m(bArr, bArr2, 0, i10, i10 + i6, 2, null);
        }
        uC.f16097c = uC.f16096b + i6;
        this.f16096b += i6;
        X9.U u6 = this.f16101g;
        p247y7.AbstractC7350t.c(u6);
        u6.c(uC);
        return uC;
    }

    public final X9.U f() {
        byte[] bArr = this.f16095a;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        p247y7.AbstractC7350t.e(bArrCopyOf, "copyOf(...)");
        return new X9.U(bArrCopyOf, this.f16096b, this.f16097c, false, true);
    }

    public final void g(X9.U u6, int i6) {
        p247y7.AbstractC7350t.f(u6, "sink");
        if (!u6.f16099e) {
            throw new java.lang.IllegalStateException("only owner can write".toString());
        }
        int i10 = u6.f16097c;
        if (i10 + i6 > 8192) {
            if (u6.f16098d) {
                throw new java.lang.IllegalArgumentException();
            }
            int i11 = u6.f16096b;
            if ((i10 + i6) - i11 > 8192) {
                throw new java.lang.IllegalArgumentException();
            }
            byte[] bArr = u6.f16095a;
            p097j7.AbstractC6872n.m(bArr, bArr, 0, i11, i10, 2, null);
            u6.f16097c -= u6.f16096b;
            u6.f16096b = 0;
        }
        byte[] bArr2 = this.f16095a;
        byte[] bArr3 = u6.f16095a;
        int i12 = u6.f16097c;
        int i13 = this.f16096b;
        p097j7.AbstractC6872n.g(bArr2, bArr3, i12, i13, i13 + i6);
        u6.f16097c += i6;
        this.f16096b += i6;
    }
}
