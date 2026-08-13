package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1923b implements androidx.compose.ui.platform.InterfaceC1938g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected java.lang.String f20081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f20082b = new int[2];

    protected final int[] c(int i6, int i10) {
        if (i6 < 0 || i10 < 0 || i6 == i10) {
            return null;
        }
        int[] iArr = this.f20082b;
        iArr[0] = i6;
        iArr[1] = i10;
        return iArr;
    }

    protected final java.lang.String d() {
        java.lang.String str = this.f20081a;
        if (str != null) {
            return str;
        }
        p247y7.AbstractC7350t.p("text");
        return null;
    }

    public void e(java.lang.String str) {
        f(str);
    }

    protected final void f(java.lang.String str) {
        this.f20081a = str;
    }
}
