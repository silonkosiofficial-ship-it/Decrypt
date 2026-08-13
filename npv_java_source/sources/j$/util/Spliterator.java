package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public interface Spliterator<T> {

    public final /* synthetic */ class Wrapper implements java.util.Spliterator {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.Spliterator convert(j$.util.Spliterator spliterator) {
            if (spliterator == null) {
                return null;
            }
            if (spliterator instanceof j$.util.e0) {
                return ((j$.util.e0) spliterator).f48121a;
            }
            return spliterator instanceof j$.util.d0 ? j$.util.c0.a((j$.util.d0) spliterator) : new j$.util.Spliterator.Wrapper();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ int characteristics() {
            return j$.util.Spliterator.this.characteristics();
        }

        public final /* synthetic */ boolean equals(java.lang.Object obj) {
            j$.util.Spliterator spliterator = j$.util.Spliterator.this;
            if (obj instanceof j$.util.Spliterator.Wrapper) {
                obj = j$.util.Spliterator.this;
            }
            return spliterator.equals(obj);
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ long estimateSize() {
            return j$.util.Spliterator.this.estimateSize();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            j$.util.Spliterator.this.forEachRemaining(consumer);
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ java.util.Comparator getComparator() {
            return j$.util.Spliterator.this.getComparator();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ long getExactSizeIfKnown() {
            return j$.util.Spliterator.this.getExactSizeIfKnown();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ boolean hasCharacteristics(int i6) {
            return j$.util.Spliterator.this.hasCharacteristics(i6);
        }

        public final /* synthetic */ int hashCode() {
            return j$.util.Spliterator.this.hashCode();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
            return j$.util.Spliterator.this.tryAdvance(consumer);
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ java.util.Spliterator trySplit() {
            return convert(j$.util.Spliterator.this.trySplit());
        }
    }

    int characteristics();

    long estimateSize();

    void forEachRemaining(java.util.function.Consumer consumer);

    java.util.Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i6);

    boolean tryAdvance(java.util.function.Consumer consumer);

    j$.util.Spliterator trySplit();
}
