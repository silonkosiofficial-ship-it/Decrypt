package L3;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6194a = 1;

    public L3.b a(java.lang.Object obj) {
        this.f6194a = (this.f6194a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f6194a;
    }

    public final L3.b c(boolean z6) {
        this.f6194a = (this.f6194a * 31) + (z6 ? 1 : 0);
        return this;
    }
}
