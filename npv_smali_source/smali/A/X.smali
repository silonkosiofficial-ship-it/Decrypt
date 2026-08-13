.class public abstract LA/X;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/core/graphics/f;Ljava/lang/String;)LA/Q;
    .locals 1

    new-instance v0, LA/Q;

    invoke-static {p0}, LA/X;->c(Landroidx/core/graphics/f;)LA/w;

    move-result-object p0

    invoke-direct {v0, p0, p1}, LA/Q;-><init>(LA/w;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final b(LA/S$a;LV/n;I)LA/S;
    .locals 2

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, -0x1

    const-string v0, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:200)"

    const v1, -0x10dd45b4

    invoke-static {v1, p2, p0, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p0, LA/T;->x:LA/T$a;

    const/4 p2, 0x6

    invoke-virtual {p0, p1, p2}, LA/T$a;->c(LV/n;I)LA/T;

    move-result-object p0

    invoke-virtual {p0}, LA/T;->d()LA/a;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p0
.end method

.method public static final c(Landroidx/core/graphics/f;)LA/w;
    .locals 4

    new-instance v0, LA/w;

    iget v1, p0, Landroidx/core/graphics/f;->a:I

    iget v2, p0, Landroidx/core/graphics/f;->b:I

    iget v3, p0, Landroidx/core/graphics/f;->c:I

    iget p0, p0, Landroidx/core/graphics/f;->d:I

    invoke-direct {v0, v1, v2, v3, p0}, LA/w;-><init>(IIII)V

    return-object v0
.end method
