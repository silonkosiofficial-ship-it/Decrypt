package aa;

/* JADX INFO: renamed from: aa.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1889c implements aa.k {
    LDPI(120),
    MDPI(160),
    HDPI(240),
    XHDPI(320),
    XXHDPI(480),
    XXXHDPI(640);


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f17268C;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f17267L = p157p7.b.a(e());

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final aa.EnumC1889c.a f17259D = new aa.EnumC1889c.a(null);

    /* JADX INFO: renamed from: aa.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final aa.EnumC1889c a(float f6) {
            double d6 = f6;
            if (d6 <= 0.75d) {
                return aa.EnumC1889c.LDPI;
            }
            if (d6 <= 1.0d) {
                return aa.EnumC1889c.MDPI;
            }
            if (d6 <= 1.5d) {
                return aa.EnumC1889c.HDPI;
            }
            if (d6 <= 2.0d) {
                return aa.EnumC1889c.XHDPI;
            }
            return d6 <= 3.0d ? aa.EnumC1889c.XXHDPI : aa.EnumC1889c.XXXHDPI;
        }

        public final aa.EnumC1889c b(int i6) {
            aa.EnumC1889c enumC1889c = aa.EnumC1889c.LDPI;
            if (i6 <= enumC1889c.g()) {
                return enumC1889c;
            }
            aa.EnumC1889c enumC1889c2 = aa.EnumC1889c.MDPI;
            if (i6 <= enumC1889c2.g()) {
                return enumC1889c2;
            }
            aa.EnumC1889c enumC1889c3 = aa.EnumC1889c.HDPI;
            if (i6 <= enumC1889c3.g()) {
                return enumC1889c3;
            }
            aa.EnumC1889c enumC1889c4 = aa.EnumC1889c.XHDPI;
            if (i6 <= enumC1889c4.g()) {
                return enumC1889c4;
            }
            aa.EnumC1889c enumC1889c5 = aa.EnumC1889c.XXHDPI;
            return i6 <= enumC1889c5.g() ? enumC1889c5 : aa.EnumC1889c.XXXHDPI;
        }
    }

    EnumC1889c(int i6) {
        this.f17268C = i6;
    }

    public static p157p7.a i() {
        return f17267L;
    }

    public final int g() {
        return this.f17268C;
    }
}
