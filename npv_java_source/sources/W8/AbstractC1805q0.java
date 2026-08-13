package W8;

/* JADX INFO: renamed from: W8.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1805q0 extends W8.J implements java.io.Closeable, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final W8.AbstractC1805q0.a f15529E = new W8.AbstractC1805q0.a(null);

    /* JADX INFO: renamed from: W8.q0$a */
    public static final class a extends p127m7.b {
        private a() {
            super(W8.J.f15454D, new p237x7.l() { // from class: W8.p0
                @Override // p237x7.l
                public final java.lang.Object l(java.lang.Object obj) {
                    return W8.AbstractC1805q0.a.d((m7.i.b) obj);
                }
            });
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final W8.AbstractC1805q0 d(m7.i.b bVar) {
            if (bVar instanceof W8.AbstractC1805q0) {
                return (W8.AbstractC1805q0) bVar;
            }
            return null;
        }
    }

    public abstract java.util.concurrent.Executor z1();
}
