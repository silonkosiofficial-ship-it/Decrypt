package W8;

/* JADX INFO: loaded from: classes2.dex */
public final class M extends p127m7.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final W8.M.a f15458E = new W8.M.a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f15459D;

    public static final class a implements m7.i.c {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public M(java.lang.String str) {
        super(f15458E);
        this.f15459D = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W8.M) && p247y7.AbstractC7350t.b(this.f15459D, ((W8.M) obj).f15459D);
    }

    public int hashCode() {
        return this.f15459D.hashCode();
    }

    public final java.lang.String t1() {
        return this.f15459D;
    }

    public java.lang.String toString() {
        return "CoroutineName(" + this.f15459D + ')';
    }
}
