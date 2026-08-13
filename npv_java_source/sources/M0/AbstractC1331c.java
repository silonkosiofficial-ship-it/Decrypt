package M0;

/* JADX INFO: renamed from: M0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1331c {
    public static final M0.A a(M0.z zVar, M0.y yVar) {
        return new M0.A(zVar, yVar);
    }

    public static final M0.y b(M0.y yVar, M0.y yVar2, float f6) {
        return yVar.c() == yVar2.c() ? yVar : new M0.y(((M0.C1335g) M0.D.d(M0.C1335g.d(yVar.b()), M0.C1335g.d(yVar2.b()), f6)).j(), ((java.lang.Boolean) M0.D.d(java.lang.Boolean.valueOf(yVar.c()), java.lang.Boolean.valueOf(yVar2.c()), f6)).booleanValue(), null);
    }

    public static final M0.z c(M0.z zVar, M0.z zVar2, float f6) {
        return zVar;
    }
}
