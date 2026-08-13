package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1985x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.os.Parcel f20416a = android.os.Parcel.obtain();

    public final void a(byte b6) {
        this.f20416a.writeByte(b6);
    }

    public final void b(float f6) {
        this.f20416a.writeFloat(f6);
    }

    public final void c(int i6) {
        this.f20416a.writeInt(i6);
    }

    public final void d(M0.C c6) {
        long jG = c6.g();
        p141o0.C7016y0.a aVar = p141o0.C7016y0.f52264b;
        if (!p141o0.C7016y0.o(jG, aVar.g())) {
            a((byte) 1);
            m(c6.g());
        }
        long jK = c6.k();
        Y0.x.a aVar2 = Y0.x.f16237b;
        if (!Y0.x.e(jK, aVar2.a())) {
            a((byte) 2);
            j(c6.k());
        }
        R0.q qVarN = c6.n();
        if (qVarN != null) {
            a((byte) 3);
            e(qVarN);
        }
        R0.o oVarL = c6.l();
        if (oVarL != null) {
            int i6 = oVarL.i();
            a((byte) 4);
            o(i6);
        }
        R0.p pVarM = c6.m();
        if (pVarM != null) {
            int iK = pVarM.k();
            a((byte) 5);
            l(iK);
        }
        java.lang.String strJ = c6.j();
        if (strJ != null) {
            a((byte) 6);
            h(strJ);
        }
        if (!Y0.x.e(c6.o(), aVar2.a())) {
            a((byte) 7);
            j(c6.o());
        }
        X0.a aVarE = c6.e();
        if (aVarE != null) {
            float fH = aVarE.h();
            a((byte) 8);
            k(fH);
        }
        X0.p pVarU = c6.u();
        if (pVarU != null) {
            a((byte) 9);
            g(pVarU);
        }
        if (!p141o0.C7016y0.o(c6.d(), aVar.g())) {
            a((byte) 10);
            m(c6.d());
        }
        X0.k kVarS = c6.s();
        if (kVarS != null) {
            a((byte) 11);
            f(kVarS);
        }
        p141o0.c2 c2VarR = c6.r();
        if (c2VarR != null) {
            a((byte) 12);
            i(c2VarR);
        }
    }

    public final void e(R0.q qVar) {
        c(qVar.q());
    }

    public final void f(X0.k kVar) {
        c(kVar.e());
    }

    public final void g(X0.p pVar) {
        b(pVar.b());
        b(pVar.c());
    }

    public final void h(java.lang.String str) {
        this.f20416a.writeString(str);
    }

    public final void i(p141o0.c2 c2Var) {
        m(c2Var.c());
        b(p131n0.g.m(c2Var.d()));
        b(p131n0.g.n(c2Var.d()));
        b(c2Var.b());
    }

    public final void j(long j6) {
        long jG = Y0.x.g(j6);
        Y0.z.a aVar = Y0.z.f16241b;
        byte b6 = 0;
        if (!Y0.z.g(jG, aVar.c())) {
            if (Y0.z.g(jG, aVar.b())) {
                b6 = 1;
            } else if (Y0.z.g(jG, aVar.a())) {
                b6 = 2;
            }
        }
        a(b6);
        if (Y0.z.g(Y0.x.g(j6), aVar.c())) {
            return;
        }
        b(Y0.x.h(j6));
    }

    public final void k(float f6) {
        b(f6);
    }

    public final void l(int i6) {
        R0.p.a aVar = R0.p.f9325b;
        byte b6 = 0;
        if (!R0.p.h(i6, aVar.b())) {
            if (R0.p.h(i6, aVar.a())) {
                b6 = 1;
            } else if (R0.p.h(i6, aVar.d())) {
                b6 = 2;
            } else if (R0.p.h(i6, aVar.c())) {
                b6 = 3;
            }
        }
        a(b6);
    }

    public final void m(long j6) {
        n(j6);
    }

    public final void n(long j6) {
        this.f20416a.writeLong(j6);
    }

    public final void o(int i6) {
        R0.o.a aVar = R0.o.f9321b;
        byte b6 = 0;
        if (!R0.o.f(i6, aVar.b()) && R0.o.f(i6, aVar.a())) {
            b6 = 1;
        }
        a(b6);
    }

    public final java.lang.String p() {
        return android.util.Base64.encodeToString(this.f20416a.marshall(), 0);
    }

    public final void q() {
        this.f20416a.recycle();
        this.f20416a = android.os.Parcel.obtain();
    }
}
