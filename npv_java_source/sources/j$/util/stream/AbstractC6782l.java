package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6782l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.util.Set f48502a;

    static {
        j$.util.stream.Collector.Characteristics characteristics = j$.util.stream.Collector.Characteristics.CONCURRENT;
        j$.util.stream.Collector.Characteristics characteristics2 = j$.util.stream.Collector.Characteristics.UNORDERED;
        j$.util.stream.Collector.Characteristics characteristics3 = j$.util.stream.Collector.Characteristics.IDENTITY_FINISH;
        java.util.Collections.unmodifiableSet(java.util.EnumSet.of(characteristics, characteristics2, characteristics3));
        java.util.Collections.unmodifiableSet(java.util.EnumSet.of(characteristics, characteristics2));
        java.util.Collections.unmodifiableSet(java.util.EnumSet.of(characteristics3));
        java.util.Collections.unmodifiableSet(java.util.EnumSet.of(characteristics2, characteristics3));
        f48502a = java.util.Collections.emptySet();
        java.util.Collections.unmodifiableSet(java.util.EnumSet.of(characteristics2));
    }

    static void a(double[] dArr, double d6) {
        double d10 = d6 - dArr[1];
        double d11 = dArr[0];
        double d12 = d11 + d10;
        dArr[1] = (d12 - d11) - d10;
        dArr[0] = d12;
    }
}
