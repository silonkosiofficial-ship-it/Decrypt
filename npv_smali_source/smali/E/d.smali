.class public abstract LE/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ln0/i;)Landroid/graphics/Rect;
    .locals 0

    invoke-static {p0}, LE/d;->c(Ln0/i;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LF0/j;)LE/a;
    .locals 1

    new-instance v0, LE/d$a;

    invoke-direct {v0, p0}, LE/d$a;-><init>(LF0/j;)V

    return-object v0
.end method

.method private static final c(Ln0/i;)Landroid/graphics/Rect;
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
