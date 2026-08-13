package O7;

/* JADX INFO: loaded from: classes2.dex */
public enum D {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;


    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f8113I = p157p7.b.a(e());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final O7.D.a f8107C = new O7.D.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final O7.D a(boolean z6, boolean z10, boolean z11) {
            if (z6) {
                return O7.D.SEALED;
            }
            if (z10) {
                return O7.D.ABSTRACT;
            }
            return z11 ? O7.D.OPEN : O7.D.FINAL;
        }
    }
}
