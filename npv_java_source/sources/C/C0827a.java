package C;

/* JADX INFO: renamed from: C.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0827a implements C.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1059b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X.b f1060c = new X.b(new androidx.compose.foundation.lazy.layout.d.b[16], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1061d;

    public C0827a(int i6) {
        this.f1058a = i6;
    }

    @Override // C.B
    public void a(D.K k6, int i6) {
        int i10 = this.f1058a;
        for (int i11 = 0; i11 < i10; i11++) {
            k6.a(i6 + i11);
        }
    }

    @Override // C.B
    public /* synthetic */ D.P b() {
        return C.A.a(this);
    }

    @Override // C.B
    public void c(C.z zVar, float f6, C.s sVar) {
        int iC;
        int index;
        X.b bVar;
        int iT;
        X.b bVar2;
        int iT2;
        X.b bVar3;
        int iT3;
        if (!sVar.j().isEmpty()) {
            int i6 = 0;
            boolean z6 = f6 < 0.0f;
            java.util.List listJ = sVar.j();
            if (z6) {
                C.InterfaceC0837k interfaceC0837k = (C.InterfaceC0837k) p097j7.AbstractC6879v.t0(listJ);
                iC = (sVar.e() == p230x.s.Vertical ? interfaceC0837k.c() : interfaceC0837k.m()) + 1;
                index = ((C.InterfaceC0837k) p097j7.AbstractC6879v.t0(sVar.j())).getIndex() + 1;
            } else {
                C.InterfaceC0837k interfaceC0837k2 = (C.InterfaceC0837k) p097j7.AbstractC6879v.i0(listJ);
                iC = (sVar.e() == p230x.s.Vertical ? interfaceC0837k2.c() : interfaceC0837k2.m()) - 1;
                index = ((C.InterfaceC0837k) p097j7.AbstractC6879v.i0(sVar.j())).getIndex() - 1;
            }
            if (index < 0 || index >= sVar.d()) {
                return;
            }
            if (iC != this.f1059b && iC >= 0) {
                if (this.f1061d != z6 && (iT3 = (bVar3 = this.f1060c).t()) > 0) {
                    java.lang.Object[] objArrS = bVar3.s();
                    int i10 = 0;
                    do {
                        ((androidx.compose.foundation.lazy.layout.d.b) objArrS[i10]).cancel();
                        i10++;
                    } while (i10 < iT3);
                }
                this.f1061d = z6;
                this.f1059b = iC;
                this.f1060c.j();
                X.b bVar4 = this.f1060c;
                bVar4.g(bVar4.t(), zVar.a(iC));
            }
            java.util.List listJ2 = sVar.j();
            if (!z6) {
                if (sVar.i() - p240y.e.a((C.InterfaceC0837k) p097j7.AbstractC6879v.i0(listJ2), sVar.e()) >= f6 || (iT = (bVar = this.f1060c).t()) <= 0) {
                    return;
                }
                java.lang.Object[] objArrS2 = bVar.s();
                do {
                    ((androidx.compose.foundation.lazy.layout.d.b) objArrS2[i6]).a();
                    i6++;
                } while (i6 < iT);
                return;
            }
            C.InterfaceC0837k interfaceC0837k3 = (C.InterfaceC0837k) p097j7.AbstractC6879v.t0(listJ2);
            if (((p240y.e.a(interfaceC0837k3, sVar.e()) + p240y.e.b(interfaceC0837k3, sVar.e())) + sVar.h()) - sVar.c() >= (-f6) || (iT2 = (bVar2 = this.f1060c).t()) <= 0) {
                return;
            }
            java.lang.Object[] objArrS3 = bVar2.s();
            do {
                ((androidx.compose.foundation.lazy.layout.d.b) objArrS3[i6]).a();
                i6++;
            } while (i6 < iT2);
        }
    }

    @Override // C.B
    public void d(C.z zVar, C.s sVar) {
        int iC;
        if (this.f1059b == -1 || !(!sVar.j().isEmpty())) {
            return;
        }
        if (this.f1061d) {
            C.InterfaceC0837k interfaceC0837k = (C.InterfaceC0837k) p097j7.AbstractC6879v.t0(sVar.j());
            iC = (sVar.e() == p230x.s.Vertical ? interfaceC0837k.c() : interfaceC0837k.m()) + 1;
        } else {
            C.InterfaceC0837k interfaceC0837k2 = (C.InterfaceC0837k) p097j7.AbstractC6879v.i0(sVar.j());
            iC = (sVar.e() == p230x.s.Vertical ? interfaceC0837k2.c() : interfaceC0837k2.m()) - 1;
        }
        if (this.f1059b != iC) {
            this.f1059b = -1;
            X.b bVar = this.f1060c;
            int iT = bVar.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVar.s();
                int i6 = 0;
                do {
                    ((androidx.compose.foundation.lazy.layout.d.b) objArrS[i6]).cancel();
                    i6++;
                } while (i6 < iT);
            }
            this.f1060c.j();
        }
    }
}
