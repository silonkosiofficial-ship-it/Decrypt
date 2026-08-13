package io.ktor.utils.io;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final boolean a() {
        java.lang.String property = java.lang.System.getProperty("io.ktor.development");
        return property != null && java.lang.Boolean.parseBoolean(property);
    }
}
