.class public abstract LE4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(I)LE4/d;
    .locals 1

    .prologue
    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    invoke-static {}, LE4/h;->b()LE4/d;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, LE4/e;

    invoke-direct {p0}, LE4/e;-><init>()V

    return-object p0

    :cond_1
    new-instance p0, LE4/j;

    invoke-direct {p0}, LE4/j;-><init>()V

    return-object p0
.end method

.method static b()LE4/d;
    .locals 1

    new-instance v0, LE4/j;

    invoke-direct {v0}, LE4/j;-><init>()V

    return-object v0
.end method

.method static c()LE4/f;
    .locals 1

    new-instance v0, LE4/f;

    invoke-direct {v0}, LE4/f;-><init>()V

    return-object v0
.end method

.method public static d(Landroid/view/View;F)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    instance-of v0, p0, LE4/g;

    if-eqz v0, :cond_0

    check-cast p0, LE4/g;

    invoke-virtual {p0, p1}, LE4/g;->U(F)V

    :cond_0
    return-void
.end method

.method public static e(Landroid/view/View;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, LE4/g;

    if-eqz v1, :cond_0

    check-cast v0, LE4/g;

    invoke-static {p0, v0}, LE4/h;->f(Landroid/view/View;LE4/g;)V

    :cond_0
    return-void
.end method

.method public static f(Landroid/view/View;LE4/g;)V
    .locals 1

    .prologue
    invoke-virtual {p1}, LE4/g;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/google/android/material/internal/n;->f(Landroid/view/View;)F

    move-result p0

    invoke-virtual {p1, p0}, LE4/g;->Y(F)V

    :cond_0
    return-void
.end method
