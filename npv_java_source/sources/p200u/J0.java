package p200u;

/* JADX INFO: loaded from: classes.dex */
final class J0 implements p200u.D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.L f54679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p200u.r f54680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p200u.r f54681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p200u.r f54682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f54683e;

    public J0(p200u.L l6) {
        this.f54679a = l6;
        this.f54683e = l6.a();
    }

    @Override // p200u.D0
    public float a() {
        return this.f54683e;
    }

    @Override // p200u.D0
    public p200u.r b(p200u.r rVar, p200u.r rVar2) {
        if (this.f54682d == null) {
            this.f54682d = p200u.AbstractC7191s.g(rVar);
        }
        p200u.r rVar3 = this.f54682d;
        if (rVar3 == null) {
            p247y7.AbstractC7350t.p("targetVector");
            rVar3 = null;
        }
        int iB = rVar3.b();
        for (int i6 = 0; i6 < iB; i6++) {
            p200u.r rVar4 = this.f54682d;
            if (rVar4 == null) {
                p247y7.AbstractC7350t.p("targetVector");
                rVar4 = null;
            }
            rVar4.e(i6, this.f54679a.d(rVar.a(i6), rVar2.a(i6)));
        }
        p200u.r rVar5 = this.f54682d;
        if (rVar5 != null) {
            return rVar5;
        }
        p247y7.AbstractC7350t.p("targetVector");
        return null;
    }

    @Override // p200u.D0
    public p200u.r c(long j6, p200u.r rVar, p200u.r rVar2) {
        if (this.f54680b == null) {
            this.f54680b = p200u.AbstractC7191s.g(rVar);
        }
        p200u.r rVar3 = this.f54680b;
        if (rVar3 == null) {
            p247y7.AbstractC7350t.p("valueVector");
            rVar3 = null;
        }
        int iB = rVar3.b();
        for (int i6 = 0; i6 < iB; i6++) {
            p200u.r rVar4 = this.f54680b;
            if (rVar4 == null) {
                p247y7.AbstractC7350t.p("valueVector");
                rVar4 = null;
            }
            rVar4.e(i6, this.f54679a.e(j6, rVar.a(i6), rVar2.a(i6)));
        }
        p200u.r rVar5 = this.f54680b;
        if (rVar5 != null) {
            return rVar5;
        }
        p247y7.AbstractC7350t.p("valueVector");
        return null;
    }

    @Override // p200u.D0
    public long d(p200u.r rVar, p200u.r rVar2) {
        if (this.f54681c == null) {
            this.f54681c = p200u.AbstractC7191s.g(rVar);
        }
        p200u.r rVar3 = this.f54681c;
        if (rVar3 == null) {
            p247y7.AbstractC7350t.p("velocityVector");
            rVar3 = null;
        }
        int iB = rVar3.b();
        long jMax = 0;
        for (int i6 = 0; i6 < iB; i6++) {
            jMax = java.lang.Math.max(jMax, this.f54679a.c(rVar.a(i6), rVar2.a(i6)));
        }
        return jMax;
    }

    @Override // p200u.D0
    public p200u.r e(long j6, p200u.r rVar, p200u.r rVar2) {
        if (this.f54681c == null) {
            this.f54681c = p200u.AbstractC7191s.g(rVar);
        }
        p200u.r rVar3 = this.f54681c;
        if (rVar3 == null) {
            p247y7.AbstractC7350t.p("velocityVector");
            rVar3 = null;
        }
        int iB = rVar3.b();
        for (int i6 = 0; i6 < iB; i6++) {
            p200u.r rVar4 = this.f54681c;
            if (rVar4 == null) {
                p247y7.AbstractC7350t.p("velocityVector");
                rVar4 = null;
            }
            rVar4.e(i6, this.f54679a.b(j6, rVar.a(i6), rVar2.a(i6)));
        }
        p200u.r rVar5 = this.f54681c;
        if (rVar5 != null) {
            return rVar5;
        }
        p247y7.AbstractC7350t.p("velocityVector");
        return null;
    }
}
