package p019b9;

/* JADX INFO: loaded from: classes2.dex */
public final class y {
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> array;

    public y(int i6) {
        this.array = new java.util.concurrent.atomic.AtomicReferenceArray<>(i6);
    }

    public final int a() {
        return this.array.length();
    }

    public final java.lang.Object b(int i6) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.array;
        if (i6 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i6);
        }
        return null;
    }

    public final void c(int i6, java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i6 < length) {
            atomicReferenceArray.set(i6, obj);
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(E7.j.d(i6 + 1, length * 2));
        for (int i10 = 0; i10 < length; i10++) {
            atomicReferenceArray2.set(i10, atomicReferenceArray.get(i10));
        }
        atomicReferenceArray2.set(i6, obj);
        this.array = atomicReferenceArray2;
    }
}
