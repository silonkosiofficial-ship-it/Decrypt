package C5;

/* JADX INFO: loaded from: classes3.dex */
@com.napsternetlabs.napsternetv.ProtectedMyApplication$VpnPermissionActivity$a
public @interface d {

    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    C5.d.a intEncoding() default C5.d.a.DEFAULT;

    int tag();
}
