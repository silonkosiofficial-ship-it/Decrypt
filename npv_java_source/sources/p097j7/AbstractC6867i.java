package p097j7;

/* JADX INFO: renamed from: j7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6867i extends java.util.AbstractMap implements java.util.Map, p256z7.e {
    protected AbstractC6867i() {
    }

    public abstract java.util.Set a();

    public abstract /* bridge */ java.util.Set b();

    public abstract /* bridge */ int c();

    public abstract /* bridge */ java.util.Collection d();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Collection values() {
        return d();
    }
}
