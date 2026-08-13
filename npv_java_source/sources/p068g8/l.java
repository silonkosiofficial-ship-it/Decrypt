package p068g8;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements B8.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p068g8.l f45679a = new p068g8.l();

    private l() {
    }

    @Override // B8.s
    public F8.E a(p088i8.q qVar, java.lang.String str, F8.M m6, F8.M m10) {
        p247y7.AbstractC7350t.f(qVar, "proto");
        p247y7.AbstractC7350t.f(str, "flexibleId");
        p247y7.AbstractC7350t.f(m6, "lowerBound");
        p247y7.AbstractC7350t.f(m10, "upperBound");
        if (p247y7.AbstractC7350t.b(str, "kotlin.jvm.PlatformType")) {
            return qVar.x(p118l8.a.f50078g) ? new p028c8.h(m6, m10) : F8.F.d(m6, m10);
        }
        return H8.k.d(H8.j.f4510l0, str, m6.toString(), m10.toString());
    }
}
