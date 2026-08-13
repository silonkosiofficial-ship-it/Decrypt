package p162q1;

/* JADX INFO: loaded from: classes.dex */
public class b implements q1.d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q1.b.a f52952e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    p162q1.i f52948a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f52949b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f52950c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    java.util.ArrayList f52951d = new java.util.ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f52953f = false;

    public interface a {
        int a();

        p162q1.i b(int i6);

        void c();

        void clear();

        float d(int i6);

        void e(float f6);

        boolean f(p162q1.i iVar);

        float g(p162q1.i iVar);

        void h(p162q1.i iVar, float f6, boolean z6);

        float i(p162q1.i iVar, boolean z6);

        void j(p162q1.i iVar, float f6);

        float k(p162q1.b bVar, boolean z6);
    }

    public b() {
    }

    public b(p162q1.c cVar) {
        this.f52952e = new p162q1.a(this, cVar);
    }

    private boolean v(p162q1.i iVar, p162q1.d dVar) {
        return iVar.f53004m <= 1;
    }

    private p162q1.i x(boolean[] zArr, p162q1.i iVar) {
        q1.i.a aVar;
        int iA = this.f52952e.a();
        p162q1.i iVar2 = null;
        float f6 = 0.0f;
        for (int i6 = 0; i6 < iA; i6++) {
            float fD = this.f52952e.d(i6);
            if (fD < 0.0f) {
                p162q1.i iVarB = this.f52952e.b(i6);
                if ((zArr == null || !zArr[iVarB.f52994c]) && iVarB != iVar && (((aVar = iVarB.f53001j) == q1.i.a.SLACK || aVar == q1.i.a.ERROR) && fD < f6)) {
                    f6 = fD;
                    iVar2 = iVarB;
                }
            }
        }
        return iVar2;
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    java.lang.String A() {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p162q1.b.A():java.lang.String");
    }

    public void B(p162q1.d dVar, p162q1.i iVar, boolean z6) {
        if (iVar.f52998g) {
            this.f52949b += iVar.f52997f * this.f52952e.g(iVar);
            this.f52952e.i(iVar, z6);
            if (z6) {
                iVar.c(this);
            }
        }
    }

    public void C(p162q1.b bVar, boolean z6) {
        this.f52949b += bVar.f52949b * this.f52952e.k(bVar, z6);
        if (z6) {
            bVar.f52948a.c(this);
        }
    }

    public void D(p162q1.d dVar) {
        if (dVar.f52967f.length == 0) {
            return;
        }
        boolean z6 = false;
        while (!z6) {
            int iA = this.f52952e.a();
            for (int i6 = 0; i6 < iA; i6++) {
                p162q1.i iVarB = this.f52952e.b(i6);
                if (iVarB.f52995d != -1 || iVarB.f52998g) {
                    this.f52951d.add(iVarB);
                }
            }
            if (this.f52951d.size() > 0) {
                for (p162q1.i iVar : this.f52951d) {
                    if (iVar.f52998g) {
                        B(dVar, iVar, true);
                    } else {
                        C(dVar.f52967f[iVar.f52995d], true);
                    }
                }
                this.f52951d.clear();
            } else {
                z6 = true;
            }
        }
    }

    @Override // q1.d.a
    public void a(p162q1.i iVar) {
        int i6 = iVar.f52996e;
        float f6 = 1.0f;
        if (i6 != 1) {
            if (i6 == 2) {
                f6 = 1000.0f;
            } else if (i6 == 3) {
                f6 = 1000000.0f;
            } else if (i6 == 4) {
                f6 = 1.0E9f;
            } else if (i6 == 5) {
                f6 = 1.0E12f;
            }
        }
        this.f52952e.j(iVar, f6);
    }

    @Override // q1.d.a
    public p162q1.i b(p162q1.d dVar, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // q1.d.a
    public void c(q1.d.a aVar) {
        if (aVar instanceof p162q1.b) {
            p162q1.b bVar = (p162q1.b) aVar;
            this.f52948a = null;
            this.f52952e.clear();
            for (int i6 = 0; i6 < bVar.f52952e.a(); i6++) {
                this.f52952e.h(bVar.f52952e.b(i6), bVar.f52952e.d(i6), true);
            }
        }
    }

    @Override // q1.d.a
    public void clear() {
        this.f52952e.clear();
        this.f52948a = null;
        this.f52949b = 0.0f;
    }

    public p162q1.b d(p162q1.d dVar, int i6) {
        this.f52952e.j(dVar.o(i6, "ep"), 1.0f);
        this.f52952e.j(dVar.o(i6, "em"), -1.0f);
        return this;
    }

    p162q1.b e(p162q1.i iVar, int i6) {
        this.f52952e.j(iVar, i6);
        return this;
    }

    boolean f(p162q1.d dVar) {
        boolean z6;
        p162q1.i iVarG = g(dVar);
        if (iVarG == null) {
            z6 = true;
        } else {
            y(iVarG);
            z6 = false;
        }
        if (this.f52952e.a() == 0) {
            this.f52953f = true;
        }
        return z6;
    }

    p162q1.i g(p162q1.d dVar) {
        int iA = this.f52952e.a();
        p162q1.i iVar = null;
        float f6 = 0.0f;
        float f10 = 0.0f;
        boolean zV = false;
        boolean zV2 = false;
        p162q1.i iVar2 = null;
        for (int i6 = 0; i6 < iA; i6++) {
            float fD = this.f52952e.d(i6);
            p162q1.i iVarB = this.f52952e.b(i6);
            if (iVarB.f53001j == q1.i.a.UNRESTRICTED) {
                if (iVar == null || f6 > fD) {
                    zV = v(iVarB, dVar);
                    f6 = fD;
                    iVar = iVarB;
                } else if (!zV && v(iVarB, dVar)) {
                    f6 = fD;
                    iVar = iVarB;
                    zV = true;
                }
            } else if (iVar == null && fD < 0.0f) {
                if (iVar2 == null || f10 > fD) {
                    zV2 = v(iVarB, dVar);
                    f10 = fD;
                    iVar2 = iVarB;
                } else if (!zV2 && v(iVarB, dVar)) {
                    f10 = fD;
                    iVar2 = iVarB;
                    zV2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // q1.d.a
    public p162q1.i getKey() {
        return this.f52948a;
    }

    p162q1.b h(p162q1.i iVar, p162q1.i iVar2, int i6, float f6, p162q1.i iVar3, p162q1.i iVar4, int i10) {
        float f10;
        int i11;
        if (iVar2 == iVar3) {
            this.f52952e.j(iVar, 1.0f);
            this.f52952e.j(iVar4, 1.0f);
            this.f52952e.j(iVar2, -2.0f);
            return this;
        }
        if (f6 == 0.5f) {
            this.f52952e.j(iVar, 1.0f);
            this.f52952e.j(iVar2, -1.0f);
            this.f52952e.j(iVar3, -1.0f);
            this.f52952e.j(iVar4, 1.0f);
            if (i6 > 0 || i10 > 0) {
                i11 = (-i6) + i10;
                f10 = i11;
                this.f52949b = f10;
            }
        } else {
            if (f6 <= 0.0f) {
                this.f52952e.j(iVar, -1.0f);
                this.f52952e.j(iVar2, 1.0f);
                f10 = i6;
            } else if (f6 >= 1.0f) {
                this.f52952e.j(iVar4, -1.0f);
                this.f52952e.j(iVar3, 1.0f);
                i11 = -i10;
                f10 = i11;
            } else {
                float f11 = 1.0f - f6;
                this.f52952e.j(iVar, f11 * 1.0f);
                this.f52952e.j(iVar2, f11 * (-1.0f));
                this.f52952e.j(iVar3, (-1.0f) * f6);
                this.f52952e.j(iVar4, 1.0f * f6);
                if (i6 > 0 || i10 > 0) {
                    f10 = ((-i6) * f11) + (i10 * f6);
                }
            }
            this.f52949b = f10;
        }
        return this;
    }

    p162q1.b i(p162q1.i iVar, int i6) {
        this.f52948a = iVar;
        float f6 = i6;
        iVar.f52997f = f6;
        this.f52949b = f6;
        this.f52953f = true;
        return this;
    }

    p162q1.b j(p162q1.i iVar, p162q1.i iVar2, float f6) {
        this.f52952e.j(iVar, -1.0f);
        this.f52952e.j(iVar2, f6);
        return this;
    }

    public p162q1.b k(p162q1.i iVar, p162q1.i iVar2, p162q1.i iVar3, p162q1.i iVar4, float f6) {
        this.f52952e.j(iVar, -1.0f);
        this.f52952e.j(iVar2, 1.0f);
        this.f52952e.j(iVar3, f6);
        this.f52952e.j(iVar4, -f6);
        return this;
    }

    public p162q1.b l(float f6, float f10, float f11, p162q1.i iVar, p162q1.i iVar2, p162q1.i iVar3, p162q1.i iVar4) {
        this.f52949b = 0.0f;
        if (f10 == 0.0f || f6 == f11) {
            this.f52952e.j(iVar, 1.0f);
            this.f52952e.j(iVar2, -1.0f);
            this.f52952e.j(iVar4, 1.0f);
            this.f52952e.j(iVar3, -1.0f);
        } else if (f6 == 0.0f) {
            this.f52952e.j(iVar, 1.0f);
            this.f52952e.j(iVar2, -1.0f);
        } else if (f11 == 0.0f) {
            this.f52952e.j(iVar3, 1.0f);
            this.f52952e.j(iVar4, -1.0f);
        } else {
            float f12 = (f6 / f10) / (f11 / f10);
            this.f52952e.j(iVar, 1.0f);
            this.f52952e.j(iVar2, -1.0f);
            this.f52952e.j(iVar4, f12);
            this.f52952e.j(iVar3, -f12);
        }
        return this;
    }

    public p162q1.b m(p162q1.i iVar, int i6) {
        q1.b.a aVar;
        float f6;
        if (i6 < 0) {
            this.f52949b = i6 * (-1);
            aVar = this.f52952e;
            f6 = 1.0f;
        } else {
            this.f52949b = i6;
            aVar = this.f52952e;
            f6 = -1.0f;
        }
        aVar.j(iVar, f6);
        return this;
    }

    public p162q1.b n(p162q1.i iVar, p162q1.i iVar2, int i6) {
        boolean z6 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z6 = true;
            }
            this.f52949b = i6;
        }
        if (z6) {
            this.f52952e.j(iVar, 1.0f);
            this.f52952e.j(iVar2, -1.0f);
        } else {
            this.f52952e.j(iVar, -1.0f);
            this.f52952e.j(iVar2, 1.0f);
        }
        return this;
    }

    public p162q1.b o(p162q1.i iVar, p162q1.i iVar2, p162q1.i iVar3, int i6) {
        boolean z6 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z6 = true;
            }
            this.f52949b = i6;
        }
        if (z6) {
            this.f52952e.j(iVar, 1.0f);
            this.f52952e.j(iVar2, -1.0f);
            this.f52952e.j(iVar3, -1.0f);
        } else {
            this.f52952e.j(iVar, -1.0f);
            this.f52952e.j(iVar2, 1.0f);
            this.f52952e.j(iVar3, 1.0f);
        }
        return this;
    }

    public p162q1.b p(p162q1.i iVar, p162q1.i iVar2, p162q1.i iVar3, int i6) {
        boolean z6 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z6 = true;
            }
            this.f52949b = i6;
        }
        if (z6) {
            this.f52952e.j(iVar, 1.0f);
            this.f52952e.j(iVar2, -1.0f);
            this.f52952e.j(iVar3, 1.0f);
        } else {
            this.f52952e.j(iVar, -1.0f);
            this.f52952e.j(iVar2, 1.0f);
            this.f52952e.j(iVar3, -1.0f);
        }
        return this;
    }

    public p162q1.b q(p162q1.i iVar, p162q1.i iVar2, p162q1.i iVar3, p162q1.i iVar4, float f6) {
        this.f52952e.j(iVar3, 0.5f);
        this.f52952e.j(iVar4, 0.5f);
        this.f52952e.j(iVar, -0.5f);
        this.f52952e.j(iVar2, -0.5f);
        this.f52949b = -f6;
        return this;
    }

    void r() {
        float f6 = this.f52949b;
        if (f6 < 0.0f) {
            this.f52949b = f6 * (-1.0f);
            this.f52952e.c();
        }
    }

    boolean s() {
        p162q1.i iVar = this.f52948a;
        return iVar != null && (iVar.f53001j == q1.i.a.UNRESTRICTED || this.f52949b >= 0.0f);
    }

    boolean t(p162q1.i iVar) {
        return this.f52952e.f(iVar);
    }

    public java.lang.String toString() {
        return A();
    }

    public boolean u() {
        return this.f52948a == null && this.f52949b == 0.0f && this.f52952e.a() == 0;
    }

    public p162q1.i w(p162q1.i iVar) {
        return x(null, iVar);
    }

    void y(p162q1.i iVar) {
        p162q1.i iVar2 = this.f52948a;
        if (iVar2 != null) {
            this.f52952e.j(iVar2, -1.0f);
            this.f52948a = null;
        }
        float fI = this.f52952e.i(iVar, true) * (-1.0f);
        this.f52948a = iVar;
        if (fI == 1.0f) {
            return;
        }
        this.f52949b /= fI;
        this.f52952e.e(fI);
    }

    public void z() {
        this.f52948a = null;
        this.f52952e.clear();
        this.f52949b = 0.0f;
        this.f52953f = false;
    }
}
