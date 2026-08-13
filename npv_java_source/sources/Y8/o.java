package Y8;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class o {
    public static /* synthetic */ boolean a(java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray, int i6, java.lang.Object obj, java.lang.Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i6, obj, obj2)) {
            if (atomicReferenceArray.get(i6) != obj) {
                return false;
            }
        }
        return true;
    }
}
