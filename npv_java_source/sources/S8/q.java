package S8;

/* JADX INFO: loaded from: classes2.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S8.q f12688a = new S8.q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S8.o f12689b;

    static {
        java.lang.String str = "[eE][+-]?(\\p{Digit}+)";
        f12689b = new S8.o("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private q() {
    }
}
