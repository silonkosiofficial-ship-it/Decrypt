package Y2;

/* JADX INFO: loaded from: classes.dex */
public final class k implements p004a3.b {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Y2.k f16326a = new Y2.k();
    }

    public static Y2.k a() {
        return Y2.k.a.f16326a;
    }

    public static java.util.concurrent.Executor b() {
        return (java.util.concurrent.Executor) p004a3.d.d(Y2.j.a());
    }

    @Override // p077h7.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public java.util.concurrent.Executor get() {
        return b();
    }
}
