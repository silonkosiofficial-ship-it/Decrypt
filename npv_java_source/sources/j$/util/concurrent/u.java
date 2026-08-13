package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class u {
    public static void a(java.util.concurrent.ConcurrentMap concurrentMap, java.util.function.BiConsumer biConsumer) {
        j$.util.Objects.requireNonNull(biConsumer);
        for (java.util.Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (java.lang.IllegalStateException unused) {
            }
        }
    }

    static java.lang.String b(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new java.lang.String(cArr);
    }
}
