package Q3;

/* JADX INFO: renamed from: Q3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1476o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Q3.L f9001a = new Q3.I();

    /* JADX INFO: renamed from: Q3.o$a */
    public interface a {
        java.lang.Object a(O3.k kVar);
    }

    public static p115l4.AbstractC6931l a(O3.g gVar, Q3.AbstractC1476o.a aVar) {
        Q3.L l6 = f9001a;
        p115l4.C6932m c6932m = new p115l4.C6932m();
        gVar.a(new Q3.J(gVar, c6932m, aVar, l6));
        return c6932m.a();
    }

    public static p115l4.AbstractC6931l b(O3.g gVar) {
        return a(gVar, new Q3.K());
    }
}
