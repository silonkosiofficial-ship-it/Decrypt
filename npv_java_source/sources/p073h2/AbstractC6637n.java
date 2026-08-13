package p073h2;

/* JADX INFO: renamed from: h2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6637n {
    public static final boolean a(p073h2.Z z6, p073h2.Z z10, p073h2.EnumC6642t enumC6642t) {
        p247y7.AbstractC7350t.f(z6, "<this>");
        p247y7.AbstractC7350t.f(enumC6642t, "loadType");
        if (z10 == null) {
            return true;
        }
        if ((z10 instanceof h2.Z.b) && (z6 instanceof h2.Z.a)) {
            return true;
        }
        return (((z6 instanceof h2.Z.b) && (z10 instanceof h2.Z.a)) || (z6.a() == z10.a() && z6.b() == z10.b() && z10.e(enumC6642t) <= z6.e(enumC6642t))) ? false : true;
    }
}
