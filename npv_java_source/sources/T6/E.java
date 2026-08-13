package T6;

/* JADX INFO: loaded from: classes3.dex */
public final class E extends java.lang.IllegalArgumentException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f13052C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f13053D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(java.lang.String str, int i6) {
        super("Header name '" + str + "' contains illegal character '" + str.charAt(i6) + "' (code " + (str.charAt(i6) & 255) + ')');
        p247y7.AbstractC7350t.f(str, "headerName");
        this.f13052C = str;
        this.f13053D = i6;
    }
}
