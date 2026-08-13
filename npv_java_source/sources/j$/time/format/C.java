package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class C {
    public static final j$.time.format.C LENIENT;
    public static final j$.time.format.C SMART;
    public static final j$.time.format.C STRICT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j$.time.format.C[] f47791a;

    static {
        j$.time.format.C c6 = new j$.time.format.C("STRICT", 0);
        STRICT = c6;
        j$.time.format.C c10 = new j$.time.format.C("SMART", 1);
        SMART = c10;
        j$.time.format.C c11 = new j$.time.format.C("LENIENT", 2);
        LENIENT = c11;
        f47791a = new j$.time.format.C[]{c6, c10, c11};
    }

    public static j$.time.format.C valueOf(java.lang.String str) {
        return (j$.time.format.C) java.lang.Enum.valueOf(j$.time.format.C.class, str);
    }

    public static j$.time.format.C[] values() {
        return (j$.time.format.C[]) f47791a.clone();
    }
}
