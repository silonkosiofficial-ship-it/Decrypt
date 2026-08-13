package W8;

/* JADX INFO: loaded from: classes2.dex */
public enum P {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;


    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f15466H = p157p7.b.a(e());

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15467a;

        static {
            int[] iArr = new int[W8.P.values().length];
            try {
                iArr[W8.P.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[W8.P.ATOMIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[W8.P.UNDISPATCHED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[W8.P.LAZY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f15467a = iArr;
        }
    }

    public final void g(p237x7.p pVar, java.lang.Object obj, p127m7.e eVar) {
        int i6 = W8.P.a.f15467a[ordinal()];
        if (i6 == 1) {
            p029c9.a.d(pVar, obj, eVar);
            return;
        }
        if (i6 == 2) {
            p127m7.g.b(pVar, obj, eVar);
        } else if (i6 == 3) {
            p029c9.b.a(pVar, obj, eVar);
        } else if (i6 != 4) {
            throw new p087i7.s();
        }
    }

    public final boolean i() {
        return this == LAZY;
    }
}
