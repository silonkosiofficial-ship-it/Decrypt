package p149o9;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o9.k.a f52579h = new o9.k.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f52580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p149o9.l f52583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f52584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p149o9.k f52585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p149o9.k f52586g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final /* synthetic */ p149o9.k a() {
            return new p149o9.k(null);
        }

        public final /* synthetic */ p149o9.k b(byte[] bArr, int i6, int i10, p149o9.l lVar, boolean z6) {
            p247y7.AbstractC7350t.f(bArr, "data");
            return new p149o9.k(bArr, i6, i10, lVar, z6, null);
        }
    }

    private k() {
        this.f52580a = new byte[8192];
        this.f52584e = true;
        this.f52583d = null;
    }

    public /* synthetic */ k(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    private k(byte[] bArr, int i6, int i10, p149o9.l lVar, boolean z6) {
        this.f52580a = bArr;
        this.f52581b = i6;
        this.f52582c = i10;
        this.f52583d = lVar;
        this.f52584e = z6;
    }

    public /* synthetic */ k(byte[] bArr, int i6, int i10, p149o9.l lVar, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
        this(bArr, i6, i10, lVar, z6);
    }

    public final void A(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "src");
        p097j7.AbstractC6872n.g(bArr, this.f52580a, this.f52582c, i6, i10);
        this.f52582c += i10 - i6;
    }

    public final /* synthetic */ void B(byte[] bArr, int i6) {
        p247y7.AbstractC7350t.f(bArr, "data");
    }

    public final void C(byte b6) {
        byte[] bArr = this.f52580a;
        int i6 = this.f52582c;
        this.f52582c = i6 + 1;
        bArr[i6] = b6;
    }

    public final void D(short s6) {
        byte[] bArr = this.f52580a;
        int i6 = this.f52582c;
        bArr[i6] = (byte) ((s6 >>> 8) & 255);
        bArr[i6 + 1] = (byte) (s6 & 255);
        this.f52582c = i6 + 2;
    }

    public final void E(p149o9.k kVar, int i6) {
        p247y7.AbstractC7350t.f(kVar, "sink");
        if (!kVar.f52584e) {
            throw new java.lang.IllegalStateException("only owner can write".toString());
        }
        if (kVar.f52582c + i6 > 8192) {
            if (kVar.i()) {
                throw new java.lang.IllegalArgumentException();
            }
            int i10 = kVar.f52582c;
            int i11 = kVar.f52581b;
            if ((i10 + i6) - i11 > 8192) {
                throw new java.lang.IllegalArgumentException();
            }
            byte[] bArr = kVar.f52580a;
            p097j7.AbstractC6872n.m(bArr, bArr, 0, i11, i10, 2, null);
            kVar.f52582c -= kVar.f52581b;
            kVar.f52581b = 0;
        }
        byte[] bArr2 = this.f52580a;
        byte[] bArr3 = kVar.f52580a;
        int i12 = kVar.f52582c;
        int i13 = this.f52581b;
        p097j7.AbstractC6872n.g(bArr2, bArr3, i12, i13, i13 + i6);
        kVar.f52582c += i6;
        this.f52581b += i6;
    }

    public final p149o9.k a() {
        int i6;
        p149o9.k kVar = this.f52586g;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("cannot compact".toString());
        }
        p247y7.AbstractC7350t.c(kVar);
        if (!kVar.f52584e) {
            return this;
        }
        int i10 = this.f52582c - this.f52581b;
        p149o9.k kVar2 = this.f52586g;
        p247y7.AbstractC7350t.c(kVar2);
        int i11 = 8192 - kVar2.f52582c;
        p149o9.k kVar3 = this.f52586g;
        p247y7.AbstractC7350t.c(kVar3);
        if (kVar3.i()) {
            i6 = 0;
        } else {
            p149o9.k kVar4 = this.f52586g;
            p247y7.AbstractC7350t.c(kVar4);
            i6 = kVar4.f52581b;
        }
        if (i10 > i11 + i6) {
            return this;
        }
        p149o9.k kVar5 = this.f52586g;
        p247y7.AbstractC7350t.c(kVar5);
        E(kVar5, i10);
        if (l() != null) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p149o9.n.d(this);
        return kVar5;
    }

    public final /* synthetic */ byte[] b(boolean z6) {
        return this.f52580a;
    }

    public final p149o9.l c() {
        return this.f52583d;
    }

    public final /* synthetic */ int d() {
        return this.f52582c;
    }

    public final /* synthetic */ p149o9.k e() {
        return this.f52585f;
    }

    public final /* synthetic */ int f() {
        return this.f52581b;
    }

    public final /* synthetic */ p149o9.k g() {
        return this.f52586g;
    }

    public final /* synthetic */ int h() {
        return this.f52580a.length - this.f52582c;
    }

    public final boolean i() {
        p149o9.l lVar = this.f52583d;
        if (lVar != null) {
            return lVar.b();
        }
        return false;
    }

    public final /* synthetic */ int j() {
        return this.f52582c - this.f52581b;
    }

    public final byte k(int i6) {
        return this.f52580a[this.f52581b + i6];
    }

    public final p149o9.k l() {
        p149o9.k kVar = this.f52585f;
        p149o9.k kVar2 = this.f52586g;
        if (kVar2 != null) {
            p247y7.AbstractC7350t.c(kVar2);
            kVar2.f52585f = this.f52585f;
        }
        p149o9.k kVar3 = this.f52585f;
        if (kVar3 != null) {
            p247y7.AbstractC7350t.c(kVar3);
            kVar3.f52586g = this.f52586g;
        }
        this.f52585f = null;
        this.f52586g = null;
        return kVar;
    }

    public final p149o9.k m(p149o9.k kVar) {
        p247y7.AbstractC7350t.f(kVar, "segment");
        kVar.f52586g = this;
        kVar.f52585f = this.f52585f;
        p149o9.k kVar2 = this.f52585f;
        if (kVar2 != null) {
            p247y7.AbstractC7350t.c(kVar2);
            kVar2.f52586g = kVar;
        }
        this.f52585f = kVar;
        return kVar;
    }

    public final byte n() {
        byte[] bArr = this.f52580a;
        int i6 = this.f52581b;
        this.f52581b = i6 + 1;
        return bArr[i6];
    }

    public final short o() {
        byte[] bArr = this.f52580a;
        int i6 = this.f52581b;
        int i10 = (bArr[i6] & 255) << 8;
        short s6 = (short) ((bArr[i6 + 1] & 255) | i10);
        this.f52581b = i6 + 2;
        return s6;
    }

    public final void p(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "dst");
        int i11 = i10 - i6;
        byte[] bArr2 = this.f52580a;
        int i12 = this.f52581b;
        p097j7.AbstractC6872n.g(bArr2, bArr, i6, i12, i12 + i11);
        this.f52581b += i11;
    }

    public final /* synthetic */ void q(int i6) {
        this.f52582c = i6;
    }

    public final /* synthetic */ void r(p149o9.k kVar) {
        this.f52585f = kVar;
    }

    public final /* synthetic */ void s(int i6) {
        this.f52581b = i6;
    }

    public final /* synthetic */ void t(p149o9.k kVar) {
        this.f52586g = kVar;
    }

    public final void u(int i6, byte b6) {
        this.f52580a[this.f52582c + i6] = b6;
    }

    public final void v(int i6, byte b6, byte b10) {
        byte[] bArr = this.f52580a;
        int i10 = this.f52582c + i6;
        bArr[i10] = b6;
        bArr[i10 + 1] = b10;
    }

    public final void w(int i6, byte b6, byte b10, byte b11) {
        byte[] bArr = this.f52580a;
        int i10 = this.f52582c + i6;
        bArr[i10] = b6;
        bArr[i10 + 1] = b10;
        bArr[i10 + 2] = b11;
    }

    public final void x(int i6, byte b6, byte b10, byte b11, byte b12) {
        byte[] bArr = this.f52580a;
        int i10 = this.f52582c + i6;
        bArr[i10] = b6;
        bArr[i10 + 1] = b10;
        bArr[i10 + 2] = b11;
        bArr[i10 + 3] = b12;
    }

    public final p149o9.k y() {
        p149o9.l lVarH = this.f52583d;
        if (lVarH == null) {
            lVarH = p149o9.n.h();
            this.f52583d = lVarH;
        }
        p149o9.l lVar = lVarH;
        byte[] bArr = this.f52580a;
        int i6 = this.f52581b;
        int i10 = this.f52582c;
        lVar.a();
        p087i7.M m6 = p087i7.M.f46721a;
        return new p149o9.k(bArr, i6, i10, lVar, false);
    }

    public final p149o9.k z(int i6) {
        p149o9.k kVarF;
        if (i6 <= 0 || i6 > this.f52582c - this.f52581b) {
            throw new java.lang.IllegalArgumentException("byteCount out of range".toString());
        }
        if (i6 >= 1024) {
            kVarF = y();
        } else {
            kVarF = p149o9.n.f();
            byte[] bArr = this.f52580a;
            byte[] bArr2 = kVarF.f52580a;
            int i10 = this.f52581b;
            p097j7.AbstractC6872n.m(bArr, bArr2, 0, i10, i10 + i6, 2, null);
        }
        kVarF.f52582c = kVarF.f52581b + i6;
        this.f52581b += i6;
        p149o9.k kVar = this.f52586g;
        if (kVar != null) {
            p247y7.AbstractC7350t.c(kVar);
            kVar.m(kVarF);
        } else {
            kVarF.f52585f = this;
            this.f52586g = kVarF;
        }
        return kVarF;
    }
}
