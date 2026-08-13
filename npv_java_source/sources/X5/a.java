package X5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends W5.e {
    @Override // W5.e
    public int a(java.lang.String str, int i6, java.lang.StringBuilder sb) {
        p247y7.AbstractC7350t.f(str, "input");
        p247y7.AbstractC7350t.f(sb, "stringBuilder");
        return d(str.charAt(i6), sb) ? 1 : 0;
    }

    public abstract boolean d(int i6, java.lang.StringBuilder sb);
}
