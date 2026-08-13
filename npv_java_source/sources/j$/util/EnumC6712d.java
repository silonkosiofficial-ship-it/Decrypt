package j$.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class EnumC6712d implements java.util.Comparator, j$.util.Comparator {
    public static final j$.util.EnumC6712d INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j$.util.EnumC6712d[] f48120a;

    static {
        j$.util.EnumC6712d enumC6712d = new j$.util.EnumC6712d("INSTANCE", 0);
        INSTANCE = enumC6712d;
        f48120a = new j$.util.EnumC6712d[]{enumC6712d};
    }

    public static j$.util.EnumC6712d valueOf(java.lang.String str) {
        return (j$.util.EnumC6712d) java.lang.Enum.valueOf(j$.util.EnumC6712d.class, str);
    }

    public static j$.util.EnumC6712d[] values() {
        return (j$.util.EnumC6712d[]) f48120a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Comparable) obj).compareTo((java.lang.Comparable) obj2);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final java.util.Comparator reversed() {
        return java.util.Collections.reverseOrder();
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return j$.util.Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function) {
        return j$.util.Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return j$.util.Q.s(this, j$.util.Comparator.CC.comparing(function, comparator));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return j$.util.Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(java.util.function.ToIntFunction toIntFunction) {
        return j$.util.Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(java.util.function.ToLongFunction toLongFunction) {
        return j$.util.Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }
}
