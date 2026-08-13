package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
final class q implements j$.time.format.f {
    public static final j$.time.format.q INSENSITIVE;
    public static final j$.time.format.q LENIENT;
    public static final j$.time.format.q SENSITIVE;
    public static final j$.time.format.q STRICT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j$.time.format.q[] f47865a;

    static {
        j$.time.format.q qVar = new j$.time.format.q("SENSITIVE", 0);
        SENSITIVE = qVar;
        j$.time.format.q qVar2 = new j$.time.format.q("INSENSITIVE", 1);
        INSENSITIVE = qVar2;
        j$.time.format.q qVar3 = new j$.time.format.q("STRICT", 2);
        STRICT = qVar3;
        j$.time.format.q qVar4 = new j$.time.format.q("LENIENT", 3);
        LENIENT = qVar4;
        f47865a = new j$.time.format.q[]{qVar, qVar2, qVar3, qVar4};
    }

    public static j$.time.format.q valueOf(java.lang.String str) {
        return (j$.time.format.q) java.lang.Enum.valueOf(j$.time.format.q.class, str);
    }

    public static j$.time.format.q[] values() {
        return (j$.time.format.q[]) f47865a.clone();
    }

    @Override // j$.time.format.f
    public final boolean n(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        return true;
    }

    @Override // j$.time.format.f
    public final int p(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i6) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            vVar.m(true);
        } else if (iOrdinal == 1) {
            vVar.m(false);
        } else if (iOrdinal == 2) {
            vVar.q(true);
        } else if (iOrdinal == 3) {
            vVar.q(false);
        }
        return i6;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new java.lang.IllegalStateException("Unreachable");
    }
}
