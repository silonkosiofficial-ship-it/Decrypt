.class public abstract Laa/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LV/O0;LV/n;I)Laa/r;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x4b262184

    invoke-interface {p1, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "org.jetbrains.compose.resources.<get-currentOrPreview> (ResourceReader.android.kt:108)"

    invoke-static {v0, p2, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    invoke-static {p1, p2}, Lorg/jetbrains/compose/resources/a;->a(LV/n;I)V

    invoke-interface {p1, p0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Laa/r;

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface {p1}, LV/n;->J()V

    return-object p0
.end method

.method public static final b()Laa/r;
    .locals 1

    new-instance v0, Laa/t$a;

    invoke-direct {v0}, Laa/t$a;-><init>()V

    return-object v0
.end method
