package K0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicInteger f6003a = new java.util.concurrent.atomic.AtomicInteger(0);

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p237x7.l lVar) {
        return dVar.b(new androidx.compose.ui.semantics.ClearAndSetSemanticsElement(lVar));
    }

    public static final int b() {
        return f6003a.addAndGet(1);
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, boolean z6, p237x7.l lVar) {
        return dVar.b(new androidx.compose.ui.semantics.AppendedSemanticsElement(z6, lVar));
    }

    public static /* synthetic */ androidx.compose.ui.d d(androidx.compose.ui.d dVar, boolean z6, p237x7.l lVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        return c(dVar, z6, lVar);
    }
}
