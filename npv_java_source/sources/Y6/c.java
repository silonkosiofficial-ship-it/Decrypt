package Y6;

/* JADX INFO: loaded from: classes3.dex */
public enum c {
    JANUARY("Jan"),
    FEBRUARY("Feb"),
    MARCH("Mar"),
    APRIL("Apr"),
    MAY("May"),
    JUNE("Jun"),
    JULY("Jul"),
    AUGUST("Aug"),
    SEPTEMBER("Sep"),
    OCTOBER("Oct"),
    NOVEMBER("Nov"),
    DECEMBER("Dec");


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f16444C;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f16443R = p157p7.b.a(e());

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Y6.c.a f16429D = new Y6.c.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final Y6.c a(int i6) {
            return (Y6.c) Y6.c.g().get(i6);
        }
    }

    c(java.lang.String str) {
        this.f16444C = str;
    }

    public static p157p7.a g() {
        return f16443R;
    }
}
