package p141o0;

/* JADX INFO: renamed from: o0.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7019z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p141o0.AbstractC7019z0.a f52280b = new p141o0.AbstractC7019z0.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.ColorFilter f52281a;

    /* JADX INFO: renamed from: o0.z0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public static /* synthetic */ p141o0.AbstractC7019z0 b(p141o0.AbstractC7019z0.a aVar, long j6, int i6, int i10, java.lang.Object obj) {
            if ((i10 & 2) != 0) {
                i6 = p141o0.AbstractC6960f0.f52197a.z();
            }
            return aVar.a(j6, i6);
        }

        public final p141o0.AbstractC7019z0 a(long j6, int i6) {
            return new p141o0.C6963g0(j6, i6, (p247y7.AbstractC7342k) null);
        }
    }

    public AbstractC7019z0(android.graphics.ColorFilter colorFilter) {
        this.f52281a = colorFilter;
    }

    public final android.graphics.ColorFilter a() {
        return this.f52281a;
    }
}
