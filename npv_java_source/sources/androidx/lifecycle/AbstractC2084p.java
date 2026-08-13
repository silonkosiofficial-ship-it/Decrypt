package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2084p {
    public static final androidx.lifecycle.AbstractC2080l a(androidx.lifecycle.AbstractC2079k abstractC2079k) {
        androidx.lifecycle.C2081m c2081m;
        p247y7.AbstractC7350t.f(abstractC2079k, "<this>");
        do {
            androidx.lifecycle.C2081m c2081m2 = (androidx.lifecycle.C2081m) abstractC2079k.c().get();
            if (c2081m2 != null) {
                return c2081m2;
            }
            c2081m = new androidx.lifecycle.C2081m(abstractC2079k, W8.U0.b(null, 1, null).o0(W8.C1779d0.c().z1()));
        } while (!p200u.AbstractC7162c0.a(abstractC2079k.c(), null, c2081m));
        c2081m.b();
        return c2081m;
    }
}
