package W8;

/* JADX INFO: renamed from: W8.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1822z0 extends m7.i.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final W8.InterfaceC1822z0.b f15544h = W8.InterfaceC1822z0.b.f15545C;

    /* JADX INFO: renamed from: W8.z0$a */
    public static final class a {
        public static /* synthetic */ void a(W8.InterfaceC1822z0 interfaceC1822z0, java.util.concurrent.CancellationException cancellationException, int i6, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i6 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC1822z0.o(cancellationException);
        }

        public static java.lang.Object b(W8.InterfaceC1822z0 interfaceC1822z0, java.lang.Object obj, p237x7.p pVar) {
            return m7.i.b.a.a(interfaceC1822z0, obj, pVar);
        }

        public static m7.i.b c(W8.InterfaceC1822z0 interfaceC1822z0, m7.i.c cVar) {
            return m7.i.b.a.b(interfaceC1822z0, cVar);
        }

        public static /* synthetic */ W8.InterfaceC1783f0 d(W8.InterfaceC1822z0 interfaceC1822z0, boolean z6, boolean z10, p237x7.l lVar, int i6, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i6 & 1) != 0) {
                z6 = false;
            }
            if ((i6 & 2) != 0) {
                z10 = true;
            }
            return interfaceC1822z0.E0(z6, z10, lVar);
        }

        public static p127m7.i e(W8.InterfaceC1822z0 interfaceC1822z0, m7.i.c cVar) {
            return m7.i.b.a.c(interfaceC1822z0, cVar);
        }

        public static p127m7.i f(W8.InterfaceC1822z0 interfaceC1822z0, p127m7.i iVar) {
            return m7.i.b.a.d(interfaceC1822z0, iVar);
        }
    }

    /* JADX INFO: renamed from: W8.z0$b */
    public static final class b implements m7.i.c {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        static final /* synthetic */ W8.InterfaceC1822z0.b f15545C = new W8.InterfaceC1822z0.b();

        private b() {
        }
    }

    W8.InterfaceC1783f0 E0(boolean z6, boolean z10, p237x7.l lVar);

    R8.h N();

    java.util.concurrent.CancellationException e0();

    W8.InterfaceC1783f0 e1(p237x7.l lVar);

    boolean f();

    boolean f1();

    java.lang.Object g0(p127m7.e eVar);

    boolean isCancelled();

    W8.InterfaceC1807s l1(W8.InterfaceC1811u interfaceC1811u);

    void o(java.util.concurrent.CancellationException cancellationException);

    boolean start();
}
