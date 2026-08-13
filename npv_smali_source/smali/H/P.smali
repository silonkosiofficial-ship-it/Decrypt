.class public abstract LH/P;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH/P$a;
    }
.end annotation


# direct methods
.method public static final synthetic a(LY0/e;ILS0/e0;LM0/K;ZI)Ln0/i;
    .locals 0

    invoke-static/range {p0 .. p5}, LH/P;->b(LY0/e;ILS0/e0;LM0/K;ZI)Ln0/i;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LY0/e;ILS0/e0;LM0/K;ZI)Ln0/i;
    .locals 7

    .prologue
    if-eqz p3, :cond_1

    invoke-virtual {p2}, LS0/e0;->a()LS0/L;

    move-result-object p2

    invoke-interface {p2, p1}, LS0/L;->b(I)I

    move-result p1

    invoke-virtual {p3, p1}, LM0/K;->e(I)Ln0/i;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v0, p1

    goto :goto_2

    :cond_1
    :goto_1
    sget-object p1, Ln0/i;->e:Ln0/i$a;

    invoke-virtual {p1}, Ln0/i$a;->a()Ln0/i;

    move-result-object p1

    goto :goto_0

    :goto_2
    invoke-static {}, LH/G;->b()F

    move-result p1

    invoke-interface {p0, p1}, LY0/e;->S0(F)I

    move-result p0

    if-eqz p4, :cond_2

    int-to-float p1, p5

    invoke-virtual {v0}, Ln0/i;->i()F

    move-result p2

    sub-float/2addr p1, p2

    int-to-float p2, p0

    sub-float/2addr p1, p2

    :goto_3
    move v1, p1

    goto :goto_4

    :cond_2
    invoke-virtual {v0}, Ln0/i;->i()F

    move-result p1

    goto :goto_3

    :goto_4
    if-eqz p4, :cond_3

    int-to-float p0, p5

    invoke-virtual {v0}, Ln0/i;->i()F

    move-result p1

    sub-float/2addr p0, p1

    move v3, p0

    goto :goto_5

    :cond_3
    invoke-virtual {v0}, Ln0/i;->i()F

    move-result p1

    int-to-float p0, p0

    add-float/2addr p1, p0

    move v3, p1

    :goto_5
    const/16 v5, 0xa

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Ln0/i;->d(Ln0/i;FFFFILjava/lang/Object;)Ln0/i;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/d;LH/Q;LS0/V;LS0/g0;Lx7/a;)Landroidx/compose/ui/d;
    .locals 4

    .prologue
    invoke-virtual {p1}, LH/Q;->f()Lx/s;

    move-result-object v0

    invoke-virtual {p2}, LS0/V;->h()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, LH/Q;->e(J)I

    move-result v1

    invoke-virtual {p2}, LS0/V;->h()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, LH/Q;->i(J)V

    invoke-virtual {p2}, LS0/V;->f()LM0/d;

    move-result-object p2

    invoke-static {p3, p2}, LH/c0;->c(LS0/g0;LM0/d;)LS0/e0;

    move-result-object p2

    sget-object p3, LH/P$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p3, p3, v0

    const/4 v0, 0x1

    if-eq p3, v0, :cond_1

    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    new-instance p3, LH/n;

    invoke-direct {p3, p1, v1, p2, p4}, LH/n;-><init>(LH/Q;ILS0/e0;Lx7/a;)V

    goto :goto_0

    :cond_0
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :cond_1
    new-instance p3, LH/d0;

    invoke-direct {p3, p1, v1, p2, p4}, LH/d0;-><init>(LH/Q;ILS0/e0;Lx7/a;)V

    :goto_0
    invoke-static {p0}, Ll0/e;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    invoke-interface {p0, p3}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/d;LH/Q;Lz/l;Z)Landroidx/compose/ui/d;
    .locals 2

    .prologue
    invoke-static {}, Landroidx/compose/ui/platform/E0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LH/P$b;

    invoke-direct {v0, p1, p2, p3}, LH/P$b;-><init>(LH/Q;Lz/l;Z)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object v0

    :goto_0
    new-instance v1, LH/P$c;

    invoke-direct {v1, p1, p3, p2}, LH/P$c;-><init>(LH/Q;ZLz/l;)V

    invoke-static {p0, v0, v1}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/d;Lx7/l;Lx7/q;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
