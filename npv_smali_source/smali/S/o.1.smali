.class public abstract LS/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LV/n;I)Ljava/util/Locale;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.defaultLocale (CalendarLocale.android.kt:30)"

    const v2, -0x601a2757

    invoke-static {v2, p1, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x18

    if-lt p1, v0, :cond_2

    const p1, -0x46fa833e

    invoke-interface {p0, p1}, LV/n;->T(I)V

    sget-object p1, LS/n0;->a:LS/n0$a;

    const/4 v0, 0x6

    invoke-virtual {p1, p0, v0}, LS/n0$a;->a(LV/n;I)Ljava/util/Locale;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p0}, LV/n;->J()V

    goto :goto_1

    :cond_2
    const p1, 0x5f7f140

    invoke-interface {p0, p1}, LV/n;->T(I)V

    invoke-static {}, Landroidx/compose/ui/platform/T;->f()LV/O0;

    move-result-object p1

    invoke-interface {p0, p1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Configuration;

    invoke-static {p1}, Landroidx/core/os/f;->a(Landroid/content/res/Configuration;)Landroidx/core/os/i;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/core/os/i;->d(I)Ljava/util/Locale;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p1

    goto :goto_0

    :goto_1
    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-object p1
.end method
