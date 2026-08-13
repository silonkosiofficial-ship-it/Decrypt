package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC6761g3 {
    public static final j$.util.stream.EnumC6761g3 DOUBLE_VALUE;
    public static final j$.util.stream.EnumC6761g3 INT_VALUE;
    public static final j$.util.stream.EnumC6761g3 LONG_VALUE;
    public static final j$.util.stream.EnumC6761g3 REFERENCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j$.util.stream.EnumC6761g3[] f48476a;

    static {
        j$.util.stream.EnumC6761g3 enumC6761g3 = new j$.util.stream.EnumC6761g3("REFERENCE", 0);
        REFERENCE = enumC6761g3;
        j$.util.stream.EnumC6761g3 enumC6761g4 = new j$.util.stream.EnumC6761g3("INT_VALUE", 1);
        INT_VALUE = enumC6761g4;
        j$.util.stream.EnumC6761g3 enumC6761g5 = new j$.util.stream.EnumC6761g3("LONG_VALUE", 2);
        LONG_VALUE = enumC6761g5;
        j$.util.stream.EnumC6761g3 enumC6761g6 = new j$.util.stream.EnumC6761g3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC6761g6;
        f48476a = new j$.util.stream.EnumC6761g3[]{enumC6761g3, enumC6761g4, enumC6761g5, enumC6761g6};
    }

    public static j$.util.stream.EnumC6761g3 valueOf(java.lang.String str) {
        return (j$.util.stream.EnumC6761g3) java.lang.Enum.valueOf(j$.util.stream.EnumC6761g3.class, str);
    }

    public static j$.util.stream.EnumC6761g3[] values() {
        return (j$.util.stream.EnumC6761g3[]) f48476a.clone();
    }
}
