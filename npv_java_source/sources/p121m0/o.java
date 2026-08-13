package p121m0;

/* JADX INFO: loaded from: classes.dex */
public enum o implements p121m0.n {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50221a;

        static {
            int[] iArr = new int[p121m0.o.values().length];
            try {
                iArr[p121m0.o.Captured.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p121m0.o.Active.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p121m0.o.ActiveParent.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[p121m0.o.Inactive.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f50221a = iArr;
        }
    }

    @Override // p121m0.n
    public boolean e() {
        int i6 = m0.o.a.f50221a[ordinal()];
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            return true;
        }
        if (i6 == 4) {
            return false;
        }
        throw new p087i7.s();
    }

    @Override // p121m0.n
    public boolean g() {
        int i6 = m0.o.a.f50221a[ordinal()];
        if (i6 == 1 || i6 == 2) {
            return true;
        }
        if (i6 == 3 || i6 == 4) {
            return false;
        }
        throw new p087i7.s();
    }
}
