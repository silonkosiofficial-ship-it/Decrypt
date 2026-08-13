package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
abstract class h {

    private static class a {
        static java.util.Set<int[]> a() {
            return androidx.emoji2.text.h.b.a();
        }
    }

    private static class b {
        static java.util.Set a() {
            try {
                java.lang.Object objInvoke = java.lang.Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (objInvoke == null) {
                    return java.util.Collections.emptySet();
                }
                java.util.Set set = (java.util.Set) objInvoke;
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return java.util.Collections.emptySet();
                    }
                }
                return set;
            } catch (java.lang.Throwable unused) {
                return java.util.Collections.emptySet();
            }
        }
    }

    static java.util.Set a() {
        return android.os.Build.VERSION.SDK_INT >= 34 ? androidx.emoji2.text.h.a.a() : androidx.emoji2.text.h.b.a();
    }
}
