package W6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D {
    public static final W6.z c(W6.z zVar, W6.z zVar2) {
        p247y7.AbstractC7350t.f(zVar, "<this>");
        p247y7.AbstractC7350t.f(zVar2, "builder");
        for (java.util.Map.Entry entry : zVar2.a()) {
            zVar.d((java.lang.String) entry.getKey(), (java.util.List) entry.getValue());
        }
        return zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(java.util.Set set, java.util.Set set2) {
        return p247y7.AbstractC7350t.b(set, set2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(java.util.Set set, int i6) {
        return (i6 * 31) + set.hashCode();
    }
}
