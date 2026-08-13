.class public abstract LI0/d;
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

    const-string v1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)"

    const v2, 0x48f30c41

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    invoke-static {p1, p2}, LI0/c;->a(LV/n;I)Landroid/content/res/Resources;

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
