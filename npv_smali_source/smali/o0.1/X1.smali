.class public abstract Lo0/X1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LY0/r;)Landroid/graphics/Rect;
    .locals 4

    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p0}, LY0/r;->g()I

    move-result v1

    invoke-virtual {p0}, LY0/r;->i()I

    move-result v2

    invoke-virtual {p0}, LY0/r;->h()I

    move-result v3

    invoke-virtual {p0}, LY0/r;->d()I

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public static final b(Ln0/i;)Landroid/graphics/Rect;
    .locals 4

    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p0}, Ln0/i;->i()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0}, Ln0/i;->l()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p0}, Ln0/i;->j()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p0}, Ln0/i;->e()F

    move-result p0

    float-to-int p0, p0

    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public static final c(Ln0/i;)Landroid/graphics/RectF;
    .locals 4

    new-instance v0, Landroid/graphics/RectF;

    invoke-virtual {p0}, Ln0/i;->i()F

    move-result v1

    invoke-virtual {p0}, Ln0/i;->l()F

    move-result v2

    invoke-virtual {p0}, Ln0/i;->j()F

    move-result v3

    invoke-virtual {p0}, Ln0/i;->e()F

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v0
.end method

.method public static final d(Landroid/graphics/Rect;)LY0/r;
    .locals 4

    new-instance v0, LY0/r;

    iget v1, p0, Landroid/graphics/Rect;->left:I

    iget v2, p0, Landroid/graphics/Rect;->top:I

    iget v3, p0, Landroid/graphics/Rect;->right:I

    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    invoke-direct {v0, v1, v2, v3, p0}, LY0/r;-><init>(IIII)V

    return-object v0
.end method

.method public static final e(Landroid/graphics/Rect;)Ln0/i;
    .locals 4

    new-instance v0, Ln0/i;

    iget v1, p0, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v2, p0, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    iget v3, p0, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    int-to-float p0, p0

    invoke-direct {v0, v1, v2, v3, p0}, Ln0/i;-><init>(FFFF)V

    return-object v0
.end method

.method public static final f(Landroid/graphics/RectF;)Ln0/i;
    .locals 4

    new-instance v0, Ln0/i;

    iget v1, p0, Landroid/graphics/RectF;->left:F

    iget v2, p0, Landroid/graphics/RectF;->top:F

    iget v3, p0, Landroid/graphics/RectF;->right:F

    iget p0, p0, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v1, v2, v3, p0}, Ln0/i;-><init>(FFFF)V

    return-object v0
.end method
