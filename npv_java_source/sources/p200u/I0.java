package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class I0 implements p200u.H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.InterfaceC7192t f54674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p200u.r f54675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p200u.r f54676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p200u.r f54677d;

    public static final class a implements p200u.InterfaceC7192t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p200u.K f54678a;

        a(p200u.K k6) {
            this.f54678a = k6;
        }

        @Override // p200u.InterfaceC7192t
        public p200u.K get(int i6) {
            return this.f54678a;
        }
    }

    public I0(p200u.K k6) {
        this(new u.I0.a(k6));
    }

    public I0(p200u.InterfaceC7192t interfaceC7192t) {
        this.f54674a = interfaceC7192t;
    }

    @Override // p200u.B0
    public /* synthetic */ boolean a() {
        return p200u.G0.a(this);
    }

    @Override // p200u.B0
    public p200u.r b(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        if (this.f54676c == null) {
            this.f54676c = p200u.AbstractC7191s.g(rVar3);
        }
        p200u.r rVar4 = this.f54676c;
        if (rVar4 == null) {
            p247y7.AbstractC7350t.p("velocityVector");
            rVar4 = null;
        }
        int iB = rVar4.b();
        for (int i6 = 0; i6 < iB; i6++) {
            p200u.r rVar5 = this.f54676c;
            if (rVar5 == null) {
                p247y7.AbstractC7350t.p("velocityVector");
                rVar5 = null;
            }
            rVar5.e(i6, this.f54674a.get(i6).b(j6, rVar.a(i6), rVar2.a(i6), rVar3.a(i6)));
        }
        p200u.r rVar6 = this.f54676c;
        if (rVar6 != null) {
            return rVar6;
        }
        p247y7.AbstractC7350t.p("velocityVector");
        return null;
    }

    @Override // p200u.B0
    public p200u.r c(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        if (this.f54675b == null) {
            this.f54675b = p200u.AbstractC7191s.g(rVar);
        }
        p200u.r rVar4 = this.f54675b;
        if (rVar4 == null) {
            p247y7.AbstractC7350t.p("valueVector");
            rVar4 = null;
        }
        int iB = rVar4.b();
        for (int i6 = 0; i6 < iB; i6++) {
            p200u.r rVar5 = this.f54675b;
            if (rVar5 == null) {
                p247y7.AbstractC7350t.p("valueVector");
                rVar5 = null;
            }
            rVar5.e(i6, this.f54674a.get(i6).e(j6, rVar.a(i6), rVar2.a(i6), rVar3.a(i6)));
        }
        p200u.r rVar6 = this.f54675b;
        if (rVar6 != null) {
            return rVar6;
        }
        p247y7.AbstractC7350t.p("valueVector");
        return null;
    }

    @Override // p200u.B0
    public long e(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        java.util.Iterator it = E7.j.q(0, rVar.b()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iB = ((p097j7.O) it).b();
            jMax = java.lang.Math.max(jMax, this.f54674a.get(iB).c(rVar.a(iB), rVar2.a(iB), rVar3.a(iB)));
        }
        return jMax;
    }

    @Override // p200u.B0
    public p200u.r g(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        if (this.f54677d == null) {
            this.f54677d = p200u.AbstractC7191s.g(rVar3);
        }
        p200u.r rVar4 = this.f54677d;
        if (rVar4 == null) {
            p247y7.AbstractC7350t.p("endVelocityVector");
            rVar4 = null;
        }
        int iB = rVar4.b();
        for (int i6 = 0; i6 < iB; i6++) {
            p200u.r rVar5 = this.f54677d;
            if (rVar5 == null) {
                p247y7.AbstractC7350t.p("endVelocityVector");
                rVar5 = null;
            }
            rVar5.e(i6, this.f54674a.get(i6).d(rVar.a(i6), rVar2.a(i6), rVar3.a(i6)));
        }
        p200u.r rVar6 = this.f54677d;
        if (rVar6 != null) {
            return rVar6;
        }
        p247y7.AbstractC7350t.p("endVelocityVector");
        return null;
    }
}
