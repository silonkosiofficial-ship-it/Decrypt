.class public abstract Lo0/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(IIIZLp0/c;)Lo0/E1;
    .locals 3

    .prologue
    invoke-static {p2}, Lo0/Q;->d(I)Landroid/graphics/Bitmap$Config;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    invoke-static {p0, p1, p2, p3, p4}, Lo0/d0;->b(IIIZLp0/c;)Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    invoke-static {p2, p0, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-virtual {p0, p3}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    :goto_0
    new-instance p1, Lo0/N;

    invoke-direct {p1, p0}, Lo0/N;-><init>(Landroid/graphics/Bitmap;)V

    return-object p1
.end method

.method public static final b(Lo0/E1;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    instance-of v0, p0, Lo0/N;

    if-eqz v0, :cond_0

    check-cast p0, Lo0/N;

    invoke-virtual {p0}, Lo0/N;->c()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Unable to obtain android.graphics.Bitmap"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(Landroid/graphics/Bitmap;)Lo0/E1;
    .locals 1

    new-instance v0, Lo0/N;

    invoke-direct {v0, p0}, Lo0/N;-><init>(Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public static final d(I)Landroid/graphics/Bitmap$Config;
    .locals 4

    .prologue
    sget-object v0, Lo0/F1;->b:Lo0/F1$a;

    invoke-virtual {v0}, Lo0/F1$a;->b()I

    move-result v1

    invoke-static {p0, v1}, Lo0/F1;->i(II)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lo0/F1$a;->a()I

    move-result v1

    invoke-static {p0, v1}, Lo0/F1;->i(II)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p0, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lo0/F1$a;->e()I

    move-result v1

    invoke-static {p0, v1}, Lo0/F1;->i(II)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object p0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_4

    invoke-virtual {v0}, Lo0/F1$a;->c()I

    move-result v3

    invoke-static {p0, v3}, Lo0/F1;->i(II)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {}, Lo0/O;->a()Landroid/graphics/Bitmap$Config;

    move-result-object p0

    goto :goto_0

    :cond_4
    if-lt v1, v2, :cond_0

    invoke-virtual {v0}, Lo0/F1$a;->d()I

    move-result v0

    invoke-static {p0, v0}, Lo0/F1;->i(II)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lo0/P;->a()Landroid/graphics/Bitmap$Config;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final e(Landroid/graphics/Bitmap$Config;)I
    .locals 3

    .prologue
    sget-object v0, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    if-ne p0, v0, :cond_0

    sget-object p0, Lo0/F1;->b:Lo0/F1$a;

    invoke-virtual {p0}, Lo0/F1$a;->a()I

    move-result p0

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    if-ne p0, v0, :cond_1

    sget-object p0, Lo0/F1;->b:Lo0/F1$a;

    invoke-virtual {p0}, Lo0/F1$a;->e()I

    move-result p0

    goto :goto_0

    :cond_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    if-ne p0, v0, :cond_3

    :cond_2
    sget-object p0, Lo0/F1;->b:Lo0/F1$a;

    invoke-virtual {p0}, Lo0/F1$a;->b()I

    move-result p0

    goto :goto_0

    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_4

    invoke-static {}, Lo0/O;->a()Landroid/graphics/Bitmap$Config;

    move-result-object v2

    if-ne p0, v2, :cond_4

    sget-object p0, Lo0/F1;->b:Lo0/F1$a;

    invoke-virtual {p0}, Lo0/F1$a;->c()I

    move-result p0

    goto :goto_0

    :cond_4
    if-lt v0, v1, :cond_2

    invoke-static {}, Lo0/P;->a()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    if-ne p0, v0, :cond_2

    sget-object p0, Lo0/F1;->b:Lo0/F1$a;

    invoke-virtual {p0}, Lo0/F1$a;->d()I

    move-result p0

    :goto_0
    return p0
.end method
