package B1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static final class a extends p097j7.P {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f498C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.util.LongSparseArray f499D;

        a(android.util.LongSparseArray longSparseArray) {
            this.f499D = longSparseArray;
        }

        @Override // p097j7.P
        public long b() {
            android.util.LongSparseArray longSparseArray = this.f499D;
            int i6 = this.f498C;
            this.f498C = i6 + 1;
            return longSparseArray.keyAt(i6);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f498C < this.f499D.size();
        }
    }

    public static final p097j7.P a(android.util.LongSparseArray longSparseArray) {
        return new B1.b.a(longSparseArray);
    }
}
