package H0;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f4269C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f4270D;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4271a;

        static {
            int[] iArr = new int[H0.b.values().length];
            try {
                iArr[H0.b.Copy.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[H0.b.Paste.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[H0.b.Cut.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[H0.b.SelectAll.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f4271a = iArr;
        }
    }

    b(int i6) {
        this.f4269C = i6;
        this.f4270D = i6;
    }

    public final int g() {
        return this.f4269C;
    }

    public final int i() {
        return this.f4270D;
    }

    public final int m() {
        int i6 = H0.b.a.f4271a[ordinal()];
        if (i6 == 1) {
            return android.R.string.copy;
        }
        if (i6 == 2) {
            return android.R.string.paste;
        }
        if (i6 == 3) {
            return android.R.string.cut;
        }
        if (i6 == 4) {
            return android.R.string.selectAll;
        }
        throw new p087i7.s();
    }
}
