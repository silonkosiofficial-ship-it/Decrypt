package N3;

/* JADX INFO: loaded from: classes.dex */
abstract class z extends N3.x {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final java.lang.ref.WeakReference f7683E = new java.lang.ref.WeakReference(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.ref.WeakReference f7684D;

    z(byte[] bArr) {
        super(bArr);
        this.f7684D = f7683E;
    }

    @Override // N3.x
    final byte[] c2() {
        byte[] bArrD2;
        synchronized (this) {
            try {
                bArrD2 = (byte[]) this.f7684D.get();
                if (bArrD2 == null) {
                    bArrD2 = d2();
                    this.f7684D = new java.lang.ref.WeakReference(bArrD2);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return bArrD2;
    }

    protected abstract byte[] d2();
}
