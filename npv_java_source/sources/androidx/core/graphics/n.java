package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class n extends androidx.core.graphics.o {
    private android.graphics.fonts.Font h(android.graphics.fonts.FontFamily fontFamily, int i6) {
        android.graphics.fonts.FontStyle fontStyle = new android.graphics.fonts.FontStyle((i6 & 1) != 0 ? 700 : 400, (i6 & 2) != 0 ? 1 : 0);
        android.graphics.fonts.Font font = fontFamily.getFont(0);
        int i10 = i(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            android.graphics.fonts.Font font2 = fontFamily.getFont(i11);
            int i12 = i(fontStyle, font2.getStyle());
            if (i12 < i10) {
                font = font2;
                i10 = i12;
            }
        }
        return font;
    }

    private static int i(android.graphics.fonts.FontStyle fontStyle, android.graphics.fonts.FontStyle fontStyle2) {
        return (java.lang.Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.core.graphics.o
    public android.graphics.Typeface a(android.content.Context context, androidx.core.content.res.e.c cVar, android.content.res.Resources resources, int i6) {
        try {
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (androidx.core.content.res.e.d dVar : cVar.a()) {
                try {
                    android.graphics.fonts.Font fontBuild = new android.graphics.fonts.Font.Builder(resources, dVar.b()).setWeight(dVar.e()).setSlant(dVar.f() ? 1 : 0).setTtcIndex(dVar.c()).setFontVariationSettings(dVar.d()).build();
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (java.io.IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily fontFamilyBuild = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(h(fontFamilyBuild, i6).getStyle()).build();
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.o
    public android.graphics.Typeface b(android.content.Context context, android.os.CancellationSignal cancellationSignal, y1.h.b[] bVarArr, int i6) {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (y1.h.b bVar : bVarArr) {
                try {
                    android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), "r", cancellationSignal);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                    } else {
                        try {
                            android.graphics.fonts.Font fontBuild = new android.graphics.fonts.Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(bVar.e()).setSlant(bVar.f() ? 1 : 0).setTtcIndex(bVar.c()).build();
                            if (builder == null) {
                                builder = new android.graphics.fonts.FontFamily.Builder(fontBuild);
                            } else {
                                builder.addFont(fontBuild);
                            }
                        } catch (java.lang.Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (java.io.IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily fontFamilyBuild = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(h(fontFamilyBuild, i6).getStyle()).build();
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.o
    public android.graphics.Typeface d(android.content.Context context, android.content.res.Resources resources, int i6, java.lang.String str, int i10) {
        try {
            android.graphics.fonts.Font fontBuild = new android.graphics.fonts.Font.Builder(resources, i6).build();
            return new android.graphics.Typeface.CustomFallbackBuilder(new android.graphics.fonts.FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.o
    protected y1.h.b g(y1.h.b[] bVarArr, int i6) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }
}
