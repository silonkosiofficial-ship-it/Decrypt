package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
final class G3 {
    public static final j$.util.stream.G3 MAYBE_MORE;
    public static final j$.util.stream.G3 NO_MORE;
    public static final j$.util.stream.G3 UNLIMITED;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j$.util.stream.G3[] f48242a;

    static {
        j$.util.stream.G3 g6 = new j$.util.stream.G3("NO_MORE", 0);
        NO_MORE = g6;
        j$.util.stream.G3 g10 = new j$.util.stream.G3("MAYBE_MORE", 1);
        MAYBE_MORE = g10;
        j$.util.stream.G3 g11 = new j$.util.stream.G3("UNLIMITED", 2);
        UNLIMITED = g11;
        f48242a = new j$.util.stream.G3[]{g6, g10, g11};
    }

    public static j$.util.stream.G3 valueOf(java.lang.String str) {
        return (j$.util.stream.G3) java.lang.Enum.valueOf(j$.util.stream.G3.class, str);
    }

    public static j$.util.stream.G3[] values() {
        return (j$.util.stream.G3[]) f48242a.clone();
    }
}
