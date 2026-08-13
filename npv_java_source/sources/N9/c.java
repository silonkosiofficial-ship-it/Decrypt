package N9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final N9.c.a f7912a = new N9.c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String[] f7913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.text.DateFormat[] f7914c;

    public static final class a extends java.lang.ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.text.DateFormat initialValue() {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", java.util.Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(I9.d.f5552f);
            return simpleDateFormat;
        }
    }

    static {
        java.lang.String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f7913b = strArr;
        f7914c = new java.text.DateFormat[strArr.length];
    }

    public static final java.util.Date a(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
        java.util.Date date = ((java.text.DateFormat) f7912a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        java.lang.String[] strArr = f7913b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    java.text.DateFormat[] dateFormatArr = f7914c;
                    java.text.DateFormat simpleDateFormat = dateFormatArr[i6];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new java.text.SimpleDateFormat(f7913b[i6], java.util.Locale.US);
                        simpleDateFormat.setTimeZone(I9.d.f5552f);
                        dateFormatArr[i6] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    java.util.Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                p087i7.M m6 = p087i7.M.f46721a;
                return null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static final java.lang.String b(java.util.Date date) {
        p247y7.AbstractC7350t.f(date, "<this>");
        java.lang.String str = ((java.text.DateFormat) f7912a.get()).format(date);
        p247y7.AbstractC7350t.e(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
