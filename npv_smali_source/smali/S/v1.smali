.class public abstract LS/v1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LV/n;I)I
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.android.kt:27)"

    const v2, -0x75fb68c5

    invoke-static {v2, p1, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/T;->f()LV/O0;

    move-result-object p1

    invoke-interface {p0, p1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/res/Configuration;

    iget p1, p0, Landroid/content/res/Configuration;->screenHeightDp:I

    iget p0, p0, Landroid/content/res/Configuration;->screenWidthDp:I

    if-ge p1, p0, :cond_1

    sget-object p0, LS/r1;->a:LS/r1$a;

    invoke-virtual {p0}, LS/r1$a;->a()I

    move-result p0

    goto :goto_0

    :cond_1
    sget-object p0, LS/r1;->a:LS/r1$a;

    invoke-virtual {p0}, LS/r1$a;->b()I

    move-result p0

    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    return p0
.end method
