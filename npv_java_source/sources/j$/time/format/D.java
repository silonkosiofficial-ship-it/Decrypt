package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class D {
    public static final j$.time.format.D ALWAYS;
    public static final j$.time.format.D EXCEEDS_PAD;
    public static final j$.time.format.D NEVER;
    public static final j$.time.format.D NORMAL;
    public static final j$.time.format.D NOT_NEGATIVE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j$.time.format.D[] f47792a;

    static {
        j$.time.format.D d6 = new j$.time.format.D("NORMAL", 0);
        NORMAL = d6;
        j$.time.format.D d10 = new j$.time.format.D("ALWAYS", 1);
        ALWAYS = d10;
        j$.time.format.D d11 = new j$.time.format.D("NEVER", 2);
        NEVER = d11;
        j$.time.format.D d12 = new j$.time.format.D("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = d12;
        j$.time.format.D d13 = new j$.time.format.D("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = d13;
        f47792a = new j$.time.format.D[]{d6, d10, d11, d12, d13};
    }

    public static j$.time.format.D valueOf(java.lang.String str) {
        return (j$.time.format.D) java.lang.Enum.valueOf(j$.time.format.D.class, str);
    }

    public static j$.time.format.D[] values() {
        return (j$.time.format.D[]) f47792a.clone();
    }

    final boolean n(boolean z6, boolean z10, boolean z11) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return (z6 && z10) ? false : true;
        }
        if (iOrdinal == 1 || iOrdinal == 4) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }
}
