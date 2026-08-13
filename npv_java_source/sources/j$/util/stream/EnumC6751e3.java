package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class EnumC6751e3 {
    public static final j$.util.stream.EnumC6751e3 OP;
    public static final j$.util.stream.EnumC6751e3 SPLITERATOR;
    public static final j$.util.stream.EnumC6751e3 STREAM;
    public static final j$.util.stream.EnumC6751e3 TERMINAL_OP;
    public static final j$.util.stream.EnumC6751e3 UPSTREAM_TERMINAL_OP;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j$.util.stream.EnumC6751e3[] f48444a;

    static {
        j$.util.stream.EnumC6751e3 enumC6751e3 = new j$.util.stream.EnumC6751e3("SPLITERATOR", 0);
        SPLITERATOR = enumC6751e3;
        j$.util.stream.EnumC6751e3 enumC6751e4 = new j$.util.stream.EnumC6751e3("STREAM", 1);
        STREAM = enumC6751e4;
        j$.util.stream.EnumC6751e3 enumC6751e5 = new j$.util.stream.EnumC6751e3("OP", 2);
        OP = enumC6751e5;
        j$.util.stream.EnumC6751e3 enumC6751e6 = new j$.util.stream.EnumC6751e3("TERMINAL_OP", 3);
        TERMINAL_OP = enumC6751e6;
        j$.util.stream.EnumC6751e3 enumC6751e7 = new j$.util.stream.EnumC6751e3("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC6751e7;
        f48444a = new j$.util.stream.EnumC6751e3[]{enumC6751e3, enumC6751e4, enumC6751e5, enumC6751e6, enumC6751e7};
    }

    public static j$.util.stream.EnumC6751e3 valueOf(java.lang.String str) {
        return (j$.util.stream.EnumC6751e3) java.lang.Enum.valueOf(j$.util.stream.EnumC6751e3.class, str);
    }

    public static j$.util.stream.EnumC6751e3[] values() {
        return (j$.util.stream.EnumC6751e3[]) f48444a.clone();
    }
}
