package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public final class Z0 extends java.lang.Exception {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f45092C;

    public Z0(int i6, java.lang.String str) {
        super(str);
        this.f45092C = i6;
    }

    public Z0(int i6, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.f45092C = i6;
    }

    public final L4.e a() {
        if (getCause() == null) {
            super.getMessage();
        } else {
            super.getMessage();
            getCause();
        }
        return new L4.e(this.f45092C, super.getMessage());
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return super.getMessage();
    }
}
