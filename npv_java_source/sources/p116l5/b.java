package p116l5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.concurrent.Executor f50054a = new p123m2.m();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p115l4.AbstractC6931l b(p115l4.C6932m c6932m, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, p115l4.C6921b c6921b, p115l4.AbstractC6931l abstractC6931l) {
        if (abstractC6931l.o()) {
            c6932m.e(abstractC6931l.l());
        } else if (abstractC6931l.k() != null) {
            c6932m.d(abstractC6931l.k());
        } else if (atomicBoolean.getAndSet(true)) {
            c6921b.a();
        }
        return p115l4.AbstractC6934o.e(null);
    }

    public static p115l4.AbstractC6931l c(p115l4.AbstractC6931l abstractC6931l, p115l4.AbstractC6931l abstractC6931l2) {
        final p115l4.C6921b c6921b = new p115l4.C6921b();
        final p115l4.C6932m c6932m = new p115l4.C6932m(c6921b.b());
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        p115l4.InterfaceC6922c interfaceC6922c = new p115l4.InterfaceC6922c() { // from class: l5.a
            @Override // p115l4.InterfaceC6922c
            public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l3) {
                return p116l5.b.b(c6932m, atomicBoolean, c6921b, abstractC6931l3);
            }
        };
        java.util.concurrent.Executor executor = f50054a;
        abstractC6931l.i(executor, interfaceC6922c);
        abstractC6931l2.i(executor, interfaceC6922c);
        return c6932m.a();
    }
}
