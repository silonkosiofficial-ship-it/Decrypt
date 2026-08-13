package R0;

/* JADX INFO: renamed from: R0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1490d {
    public static final R0.q a(R0.q.a aVar) {
        return aVar.e();
    }

    public static final int b(boolean z6, boolean z10) {
        if (z10 && z6) {
            return 3;
        }
        if (z6) {
            return 1;
        }
        return z10 ? 2 : 0;
    }

    public static final int c(R0.q qVar, int i6) {
        return b(qVar.compareTo(a(R0.q.f9331D)) >= 0, R0.o.f(i6, R0.o.f9321b.a()));
    }
}
