package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5596wj0 implements java.io.FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.regex.Pattern f39663a;

    public C5596wj0(java.util.regex.Pattern pattern) {
        pattern.getClass();
        this.f39663a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        return this.f39663a.matcher(str).matches();
    }
}
