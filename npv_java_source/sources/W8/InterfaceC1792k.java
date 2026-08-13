package W8;

/* JADX INFO: renamed from: W8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1792k extends W8.N0 {

    /* JADX INFO: renamed from: W8.k$a */
    public static final class a implements W8.InterfaceC1792k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p237x7.l f15509a;

        public a(p237x7.l lVar) {
            this.f15509a = lVar;
        }

        @Override // W8.InterfaceC1792k
        public void a(java.lang.Throwable th) {
            this.f15509a.l(th);
        }

        public java.lang.String toString() {
            return "CancelHandler.UserSupplied[" + W8.S.a(this.f15509a) + '@' + W8.S.b(this) + ']';
        }
    }

    void a(java.lang.Throwable th);
}
