.class public abstract LH/J;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Landroid/view/KeyEvent;I)Z
    .locals 0

    invoke-static {p0, p1}, LH/J;->c(Landroid/view/KeyEvent;I)Z

    move-result p0

    return p0
.end method

.method public static final b(Landroidx/compose/ui/d;LH/w;Lm0/f;)Landroidx/compose/ui/d;
    .locals 1

    new-instance v0, LH/J$a;

    invoke-direct {v0, p2, p1}, LH/J$a;-><init>(Lm0/f;LH/w;)V

    invoke-static {p0, v0}, Landroidx/compose/ui/input/key/a;->b(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroid/view/KeyEvent;I)Z
    .locals 2

    .prologue
    invoke-static {p0}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lx0/f;->b(J)I

    move-result p0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
