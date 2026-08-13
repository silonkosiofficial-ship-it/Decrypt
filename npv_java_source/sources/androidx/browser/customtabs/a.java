package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f18594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f18595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f18596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f18597d;

    /* JADX INFO: renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0343a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.Integer f18598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.Integer f18599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.Integer f18600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.Integer f18601d;

        public androidx.browser.customtabs.a a() {
            return new androidx.browser.customtabs.a(this.f18598a, this.f18599b, this.f18600c, this.f18601d);
        }
    }

    a(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
        this.f18594a = num;
        this.f18595b = num2;
        this.f18596c = num3;
        this.f18597d = num4;
    }

    android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.Integer num = this.f18594a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        java.lang.Integer num2 = this.f18595b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        java.lang.Integer num3 = this.f18596c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        java.lang.Integer num4 = this.f18597d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
