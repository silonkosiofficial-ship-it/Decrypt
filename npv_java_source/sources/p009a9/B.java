package p009a9;

/* JADX INFO: loaded from: classes2.dex */
final class B extends Z8.D implements Z8.N {
    public B(int i6) {
        super(1, Integer.MAX_VALUE, Y8.EnumC1863d.DROP_OLDEST);
        n(java.lang.Integer.valueOf(i6));
    }

    @Override // Z8.N
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer getValue() {
        java.lang.Integer numValueOf;
        synchronized (this) {
            numValueOf = java.lang.Integer.valueOf(((java.lang.Number) O()).intValue());
        }
        return numValueOf;
    }

    public final boolean c0(int i6) {
        boolean zN;
        synchronized (this) {
            zN = n(java.lang.Integer.valueOf(((java.lang.Number) O()).intValue() + i6));
        }
        return zN;
    }
}
