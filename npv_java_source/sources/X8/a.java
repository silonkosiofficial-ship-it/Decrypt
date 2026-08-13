package X8;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements p019b9.r {
    @Override // p019b9.r
    public java.lang.String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // p019b9.r
    public W8.J0 b(java.util.List list) {
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        if (mainLooper != null) {
            return new X8.e(X8.g.a(mainLooper, true), null, 2, null);
        }
        throw new java.lang.IllegalStateException("The main looper is not available");
    }

    @Override // p019b9.r
    public int c() {
        return 1073741823;
    }
}
