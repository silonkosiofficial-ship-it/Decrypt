package Y6;

/* JADX INFO: loaded from: classes3.dex */
public enum d {
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fri"),
    SATURDAY("Sat"),
    SUNDAY("Sun");


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f16455C;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f16454M = p157p7.b.a(e());

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Y6.d.a f16445D = new Y6.d.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final Y6.d a(int i6) {
            return (Y6.d) Y6.d.g().get(i6);
        }
    }

    d(java.lang.String str) {
        this.f16455C = str;
    }

    public static p157p7.a g() {
        return f16454M;
    }
}
