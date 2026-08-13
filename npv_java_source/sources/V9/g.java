package V9;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements java.io.Closeable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f15207C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final X9.InterfaceC1838f f15208D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final V9.g.a f15209E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final boolean f15210F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f15211G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f15212H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f15213I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f15214J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f15215K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f15216L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f15217M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final X9.C1836d f15218N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final X9.C1836d f15219O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private V9.c f15220P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final byte[] f15221Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final X9.C1836d.a f15222R;

    public interface a {
        void a(X9.C1839g c1839g);

        void d(X9.C1839g c1839g);

        void e(java.lang.String str);

        void g(X9.C1839g c1839g);

        void h(int i6, java.lang.String str);
    }

    public g(boolean z6, X9.InterfaceC1838f interfaceC1838f, V9.g.a aVar, boolean z10, boolean z11) {
        p247y7.AbstractC7350t.f(interfaceC1838f, "source");
        p247y7.AbstractC7350t.f(aVar, "frameCallback");
        this.f15207C = z6;
        this.f15208D = interfaceC1838f;
        this.f15209E = aVar;
        this.f15210F = z10;
        this.f15211G = z11;
        this.f15218N = new X9.C1836d();
        this.f15219O = new X9.C1836d();
        this.f15221Q = z6 ? null : new byte[4];
        this.f15222R = z6 ? null : new X9.C1836d.a();
    }

    private final void f() throws java.net.ProtocolException, java.io.EOFException {
        short sP;
        java.lang.String strY0;
        long j6 = this.f15214J;
        if (j6 > 0) {
            this.f15208D.Q0(this.f15218N, j6);
            if (!this.f15207C) {
                X9.C1836d c1836d = this.f15218N;
                X9.C1836d.a aVar = this.f15222R;
                p247y7.AbstractC7350t.c(aVar);
                c1836d.E0(aVar);
                this.f15222R.i(0L);
                V9.f fVar = V9.f.f15206a;
                X9.C1836d.a aVar2 = this.f15222R;
                byte[] bArr = this.f15221Q;
                p247y7.AbstractC7350t.c(bArr);
                fVar.b(aVar2, bArr);
                this.f15222R.close();
            }
        }
        switch (this.f15213I) {
            case 8:
                long jD1 = this.f15218N.d1();
                if (jD1 == 1) {
                    throw new java.net.ProtocolException("Malformed close payload length of 1.");
                }
                if (jD1 != 0) {
                    sP = this.f15218N.p();
                    strY0 = this.f15218N.Y0();
                    java.lang.String strA = V9.f.f15206a.a(sP);
                    if (strA != null) {
                        throw new java.net.ProtocolException(strA);
                    }
                } else {
                    sP = 1005;
                    strY0 = "";
                }
                this.f15209E.h(sP, strY0);
                this.f15212H = true;
                return;
            case 9:
                this.f15209E.d(this.f15218N.P0());
                return;
            case 10:
                this.f15209E.g(this.f15218N.P0());
                return;
            default:
                throw new java.net.ProtocolException("Unknown control opcode: " + I9.d.P(this.f15213I));
        }
    }

    private final void g() throws java.io.IOException {
        boolean z6;
        if (this.f15212H) {
            throw new java.io.IOException("closed");
        }
        long jH = this.f15208D.k().h();
        this.f15208D.k().b();
        try {
            int iD = I9.d.d(this.f15208D.m(), 255);
            this.f15208D.k().g(jH, java.util.concurrent.TimeUnit.NANOSECONDS);
            int i6 = iD & 15;
            this.f15213I = i6;
            boolean z10 = (iD & 128) != 0;
            this.f15215K = z10;
            boolean z11 = (iD & 8) != 0;
            this.f15216L = z11;
            if (z11 && !z10) {
                throw new java.net.ProtocolException("Control frames must be final.");
            }
            boolean z12 = (iD & 64) != 0;
            if (i6 == 1 || i6 == 2) {
                if (!z12) {
                    z6 = false;
                } else {
                    if (!this.f15210F) {
                        throw new java.net.ProtocolException("Unexpected rsv1 flag");
                    }
                    z6 = true;
                }
                this.f15217M = z6;
            } else if (z12) {
                throw new java.net.ProtocolException("Unexpected rsv1 flag");
            }
            if ((iD & 32) != 0) {
                throw new java.net.ProtocolException("Unexpected rsv2 flag");
            }
            if ((iD & 16) != 0) {
                throw new java.net.ProtocolException("Unexpected rsv3 flag");
            }
            int iD2 = I9.d.d(this.f15208D.m(), 255);
            boolean z13 = (iD2 & 128) != 0;
            if (z13 == this.f15207C) {
                throw new java.net.ProtocolException(this.f15207C ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j6 = iD2 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
            this.f15214J = j6;
            if (j6 == 126) {
                this.f15214J = I9.d.e(this.f15208D.p(), 65535);
            } else if (j6 == 127) {
                long jO = this.f15208D.O();
                this.f15214J = jO;
                if (jO < 0) {
                    throw new java.net.ProtocolException("Frame length 0x" + I9.d.Q(this.f15214J) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f15216L && this.f15214J > 125) {
                throw new java.net.ProtocolException("Control frame must be less than 125B.");
            }
            if (z13) {
                X9.InterfaceC1838f interfaceC1838f = this.f15208D;
                byte[] bArr = this.f15221Q;
                p247y7.AbstractC7350t.c(bArr);
                interfaceC1838f.C0(bArr);
            }
        } catch (java.lang.Throwable th) {
            this.f15208D.k().g(jH, java.util.concurrent.TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void i() throws java.io.IOException {
        while (!this.f15212H) {
            long j6 = this.f15214J;
            if (j6 > 0) {
                this.f15208D.Q0(this.f15219O, j6);
                if (!this.f15207C) {
                    X9.C1836d c1836d = this.f15219O;
                    X9.C1836d.a aVar = this.f15222R;
                    p247y7.AbstractC7350t.c(aVar);
                    c1836d.E0(aVar);
                    this.f15222R.i(this.f15219O.d1() - this.f15214J);
                    V9.f fVar = V9.f.f15206a;
                    X9.C1836d.a aVar2 = this.f15222R;
                    byte[] bArr = this.f15221Q;
                    p247y7.AbstractC7350t.c(bArr);
                    fVar.b(aVar2, bArr);
                    this.f15222R.close();
                }
            }
            if (this.f15215K) {
                return;
            }
            r();
            if (this.f15213I != 0) {
                throw new java.net.ProtocolException("Expected continuation opcode. Got: " + I9.d.P(this.f15213I));
            }
        }
        throw new java.io.IOException("closed");
    }

    private final void o() throws java.io.IOException {
        int i6 = this.f15213I;
        if (i6 != 1 && i6 != 2) {
            throw new java.net.ProtocolException("Unknown opcode: " + I9.d.P(i6));
        }
        i();
        if (this.f15217M) {
            V9.c cVar = this.f15220P;
            if (cVar == null) {
                cVar = new V9.c(this.f15211G);
                this.f15220P = cVar;
            }
            cVar.a(this.f15219O);
        }
        if (i6 == 1) {
            this.f15209E.e(this.f15219O.Y0());
        } else {
            this.f15209E.a(this.f15219O.P0());
        }
    }

    private final void r() throws java.io.IOException {
        while (!this.f15212H) {
            g();
            if (!this.f15216L) {
                return;
            } else {
                f();
            }
        }
    }

    public final void a() {
        g();
        if (this.f15216L) {
            f();
        } else {
            o();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        V9.c cVar = this.f15220P;
        if (cVar != null) {
            cVar.close();
        }
    }
}
