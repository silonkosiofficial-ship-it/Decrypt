package androidx.compose.foundation.gestures;

/* JADX INFO: loaded from: classes.dex */
final class e implements p241y0.b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p230x.C f19102C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f19103D;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        long f19104F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f19105G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f19107I;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f19105G = obj;
            this.f19107I |= Integer.MIN_VALUE;
            return androidx.compose.foundation.gestures.e.this.J(0L, 0L, this);
        }
    }

    public e(p230x.C c6, boolean z6) {
        this.f19102C = c6;
        this.f19103D = z6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p241y0.b
    public java.lang.Object J(long j6, long j10, p127m7.e eVar) {
        androidx.compose.foundation.gestures.e.a aVar;
        long jA;
        if (eVar instanceof androidx.compose.foundation.gestures.e.a) {
            aVar = (androidx.compose.foundation.gestures.e.a) eVar;
            int i6 = aVar.f19107I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f19107I = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new androidx.compose.foundation.gestures.e.a(eVar);
            }
        } else {
            aVar = new androidx.compose.foundation.gestures.e.a(eVar);
        }
        java.lang.Object objN = aVar.f19105G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f19107I;
        if (i10 == 0) {
            p087i7.x.b(objN);
            if (this.f19103D) {
                p230x.C c6 = this.f19102C;
                aVar.f19104F = j10;
                aVar.f19107I = 1;
                objN = c6.n(j10, aVar);
                if (objN == objG) {
                    return objG;
                }
            } else {
                jA = Y0.A.f16198b.a();
            }
            return Y0.A.b(jA);
        }
        if (i10 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j10 = aVar.f19104F;
        p087i7.x.b(objN);
        jA = Y0.A.k(j10, ((Y0.A) objN).o());
        return Y0.A.b(jA);
    }

    public final void a(boolean z6) {
        this.f19103D = z6;
    }

    @Override // p241y0.b
    public long e1(long j6, long j10, int i6) {
        return this.f19103D ? this.f19102C.r(j10) : p131n0.g.f51312b.c();
    }

    @Override // p241y0.b
    public /* synthetic */ java.lang.Object h1(long j6, p127m7.e eVar) {
        return p241y0.a.c(this, j6, eVar);
    }

    @Override // p241y0.b
    public /* synthetic */ long u0(long j6, int i6) {
        return p241y0.a.d(this, j6, i6);
    }
}
