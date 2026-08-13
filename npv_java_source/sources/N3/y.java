package N3;

/* JADX INFO: loaded from: classes.dex */
final class y extends N3.x {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final byte[] f7682D;

    y(byte[] bArr) {
        super(java.util.Arrays.copyOfRange(bArr, 0, 25));
        this.f7682D = bArr;
    }

    @Override // N3.x
    final byte[] c2() {
        return this.f7682D;
    }
}
