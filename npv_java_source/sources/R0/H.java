package R0;

/* JADX INFO: loaded from: classes.dex */
public interface H extends V.G1 {

    public static final class a implements R0.H {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.lang.Object f9288C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final boolean f9289D;

        public a(java.lang.Object obj, boolean z6) {
            this.f9288C = obj;
            this.f9289D = z6;
        }

        public /* synthetic */ a(java.lang.Object obj, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
            this(obj, (i6 & 2) != 0 ? true : z6);
        }

        @Override // R0.H
        public boolean f() {
            return this.f9289D;
        }

        @Override // V.G1
        public java.lang.Object getValue() {
            return this.f9288C;
        }
    }

    boolean f();
}
