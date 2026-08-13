package p247y7;

/* JADX INFO: renamed from: y7.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7352v implements p247y7.InterfaceC7346o, java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f57307C;

    public AbstractC7352v(int i6) {
        this.f57307C = i6;
    }

    @Override // p247y7.InterfaceC7346o
    public int c() {
        return this.f57307C;
    }

    public java.lang.String toString() {
        java.lang.String strM = p247y7.P.m(this);
        p247y7.AbstractC7350t.e(strM, "renderLambdaToString(...)");
        return strM;
    }
}
