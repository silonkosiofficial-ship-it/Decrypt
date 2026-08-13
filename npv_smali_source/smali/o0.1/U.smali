.class public abstract Lo0/U;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0/U$a;
    }
.end annotation


# direct methods
.method public static final a()Lo0/N1;
    .locals 1

    new-instance v0, Lo0/T;

    invoke-direct {v0}, Lo0/T;-><init>()V

    return-object v0
.end method

.method public static final b(Landroid/graphics/Paint;)Lo0/N1;
    .locals 1

    new-instance v0, Lo0/T;

    invoke-direct {v0, p0}, Lo0/T;-><init>(Landroid/graphics/Paint;)V

    return-object v0
.end method

.method public static final c(Landroid/graphics/Paint;)F
    .locals 1

    invoke-virtual {p0}, Landroid/graphics/Paint;->getAlpha()I

    move-result p0

    int-to-float p0, p0

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p0, v0

    return p0
.end method

.method public static final d(Landroid/graphics/Paint;)J
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/Paint;->getColor()I

    move-result p0

    invoke-static {p0}, Lo0/A0;->b(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final e(Landroid/graphics/Paint;)I
    .locals 0

    .prologue
    invoke-virtual {p0}, Landroid/graphics/Paint;->isFilterBitmap()Z

    move-result p0

    if-nez p0, :cond_0

    sget-object p0, Lo0/z1;->a:Lo0/z1$a;

    invoke-virtual {p0}, Lo0/z1$a;->b()I

    move-result p0

    goto :goto_0

    :cond_0
    sget-object p0, Lo0/z1;->a:Lo0/z1$a;

    invoke-virtual {p0}, Lo0/z1$a;->a()I

    move-result p0

    :goto_0
    return p0
.end method

.method public static final f(Landroid/graphics/Paint;)I
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeCap()Landroid/graphics/Paint$Cap;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lo0/U$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    :cond_1
    sget-object p0, Lo0/g2;->a:Lo0/g2$a;

    invoke-virtual {p0}, Lo0/g2$a;->a()I

    move-result p0

    goto :goto_1

    :cond_2
    sget-object p0, Lo0/g2;->a:Lo0/g2$a;

    invoke-virtual {p0}, Lo0/g2$a;->c()I

    move-result p0

    goto :goto_1

    :cond_3
    sget-object p0, Lo0/g2;->a:Lo0/g2$a;

    invoke-virtual {p0}, Lo0/g2$a;->b()I

    move-result p0

    :goto_1
    return p0
.end method

.method public static final g(Landroid/graphics/Paint;)I
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeJoin()Landroid/graphics/Paint$Join;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lo0/U$a;->c:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    :cond_1
    sget-object p0, Lo0/h2;->a:Lo0/h2$a;

    invoke-virtual {p0}, Lo0/h2$a;->b()I

    move-result p0

    goto :goto_1

    :cond_2
    sget-object p0, Lo0/h2;->a:Lo0/h2$a;

    invoke-virtual {p0}, Lo0/h2$a;->c()I

    move-result p0

    goto :goto_1

    :cond_3
    sget-object p0, Lo0/h2;->a:Lo0/h2$a;

    invoke-virtual {p0}, Lo0/h2$a;->a()I

    move-result p0

    :goto_1
    return p0
.end method

.method public static final h(Landroid/graphics/Paint;)F
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeMiter()F

    move-result p0

    return p0
.end method

.method public static final i(Landroid/graphics/Paint;)F
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result p0

    return p0
.end method

.method public static final j()Landroid/graphics/Paint;
    .locals 2

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    return-object v0
.end method

.method public static final k(Landroid/graphics/Paint;F)V
    .locals 2

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr p1, v0

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->rint(D)D

    move-result-wide v0

    double-to-float p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public static final l(Landroid/graphics/Paint;I)V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    sget-object v0, Lo0/o2;->a:Lo0/o2;

    invoke-virtual {v0, p0, p1}, Lo0/o2;->a(Landroid/graphics/Paint;I)V

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    invoke-static {p1}, Lo0/F;->c(I)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    :goto_0
    return-void
.end method

.method public static final m(Landroid/graphics/Paint;J)V
    .locals 0

    invoke-static {p1, p2}, Lo0/A0;->k(J)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public static final n(Landroid/graphics/Paint;Lo0/z0;)V
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    invoke-static {p1}, Lo0/I;->b(Lo0/z0;)Landroid/graphics/ColorFilter;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method

.method public static final o(Landroid/graphics/Paint;I)V
    .locals 1

    sget-object v0, Lo0/z1;->a:Lo0/z1$a;

    invoke-virtual {v0}, Lo0/z1$a;->b()I

    move-result v0

    invoke-static {p1, v0}, Lo0/z1;->d(II)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    return-void
.end method

.method public static final p(Landroid/graphics/Paint;Lo0/R1;)V
    .locals 0

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-void
.end method

.method public static final q(Landroid/graphics/Paint;Landroid/graphics/Shader;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method

.method public static final r(Landroid/graphics/Paint;I)V
    .locals 2

    .prologue
    sget-object v0, Lo0/g2;->a:Lo0/g2$a;

    invoke-virtual {v0}, Lo0/g2$a;->c()I

    move-result v1

    invoke-static {p1, v1}, Lo0/g2;->e(II)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lo0/g2$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Lo0/g2;->e(II)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lo0/g2$a;->a()I

    move-result v0

    invoke-static {p1, v0}, Lo0/g2;->e(II)Z

    move-result p1

    sget-object p1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    return-void
.end method

.method public static final s(Landroid/graphics/Paint;I)V
    .locals 2

    .prologue
    sget-object v0, Lo0/h2;->a:Lo0/h2$a;

    invoke-virtual {v0}, Lo0/h2$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Lo0/h2;->e(II)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lo0/h2$a;->a()I

    move-result v1

    invoke-static {p1, v1}, Lo0/h2;->e(II)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p1, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lo0/h2$a;->c()I

    move-result v0

    invoke-static {p1, v0}, Lo0/h2;->e(II)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    return-void
.end method

.method public static final t(Landroid/graphics/Paint;F)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    return-void
.end method

.method public static final u(Landroid/graphics/Paint;F)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public static final v(Landroid/graphics/Paint;I)V
    .locals 1

    .prologue
    sget-object v0, Lo0/O1;->a:Lo0/O1$a;

    invoke-virtual {v0}, Lo0/O1$a;->b()I

    move-result v0

    invoke-static {p1, v0}, Lo0/O1;->d(II)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    goto :goto_0

    :cond_0
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method
