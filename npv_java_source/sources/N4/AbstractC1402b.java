package N4;

/* JADX INFO: renamed from: N4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1402b extends N4.S {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private N4.AbstractC1402b.EnumC0186b f7720C = N4.AbstractC1402b.EnumC0186b.NOT_READY;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object f7721D;

    /* JADX INFO: renamed from: N4.b$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7722a;

        static {
            int[] iArr = new int[N4.AbstractC1402b.EnumC0186b.values().length];
            f7722a = iArr;
            try {
                iArr[N4.AbstractC1402b.EnumC0186b.DONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f7722a[N4.AbstractC1402b.EnumC0186b.READY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: N4.b$b, reason: collision with other inner class name */
    private enum EnumC0186b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC1402b() {
    }

    private boolean d() {
        this.f7720C = N4.AbstractC1402b.EnumC0186b.FAILED;
        this.f7721D = b();
        if (this.f7720C == N4.AbstractC1402b.EnumC0186b.DONE) {
            return false;
        }
        this.f7720C = N4.AbstractC1402b.EnumC0186b.READY;
        return true;
    }

    protected abstract java.lang.Object b();

    protected final java.lang.Object c() {
        this.f7720C = N4.AbstractC1402b.EnumC0186b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        M4.h.n(this.f7720C != N4.AbstractC1402b.EnumC0186b.FAILED);
        int i6 = N4.AbstractC1402b.a.f7722a[this.f7720C.ordinal()];
        if (i6 == 1) {
            return false;
        }
        if (i6 != 2) {
            return d();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f7720C = N4.AbstractC1402b.EnumC0186b.NOT_READY;
        java.lang.Object objA = N4.E.a(this.f7721D);
        this.f7721D = null;
        return objA;
    }
}
