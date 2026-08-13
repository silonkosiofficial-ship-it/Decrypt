package p073h2;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    public static final boolean a(p073h2.C6635l c6635l, p073h2.C6635l c6635l2, p073h2.EnumC6642t enumC6642t) {
        p247y7.AbstractC7350t.f(c6635l, "<this>");
        p247y7.AbstractC7350t.f(c6635l2, "previous");
        p247y7.AbstractC7350t.f(enumC6642t, "loadType");
        if (c6635l.a() > c6635l2.a()) {
            return true;
        }
        if (c6635l.a() < c6635l2.a()) {
            return false;
        }
        return p073h2.AbstractC6637n.a(c6635l.b(), c6635l2.b(), enumC6642t);
    }
}
