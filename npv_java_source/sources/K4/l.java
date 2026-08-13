package K4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static void a(java.lang.Object obj, java.lang.Class cls) {
        if (obj == null) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
