.class public abstract LT/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ILV/n;I)Ljava/lang/String;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)"

    const v2, -0x361a1013

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/T;->f()LV/O0;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    invoke-static {}, Landroidx/compose/ui/platform/T;->g()LV/O0;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p0
.end method

.method public static final b(I[Ljava/lang/Object;LV/n;I)Ljava/lang/String;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)"

    const v2, -0x55126400

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 p3, p3, 0xe

    invoke-static {p0, p2, p3}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Landroidx/compose/ui/platform/T;->f()LV/O0;

    move-result-object p3

    invoke-interface {p2, p3}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/res/Configuration;

    invoke-static {p2}, Landroidx/core/os/f;->a(Landroid/content/res/Configuration;)Landroidx/core/os/i;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroidx/core/os/i;->d(I)Ljava/util/Locale;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    :cond_1
    sget-object p3, Ly7/V;->a:Ly7/V;

    array-length p3, p1

    invoke-static {p1, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    array-length p3, p1

    invoke-static {p1, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "format(locale, format, *args)"

    invoke-static {p0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    return-object p0
.end method
