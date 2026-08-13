.class public abstract LR/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lu/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lu/w0;

    invoke-static {}, Lu/H;->e()Lu/F;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/16 v1, 0xf

    const/4 v2, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lu/w0;-><init>(IILu/F;ILy7/k;)V

    sput-object v6, LR/p;->a:Lu/w0;

    return-void
.end method

.method public static final synthetic a(Lz/i;)Lu/j;
    .locals 0

    invoke-static {p0}, LR/p;->d(Lz/i;)Lu/j;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lz/i;)Lu/j;
    .locals 0

    invoke-static {p0}, LR/p;->e(Lz/i;)Lu/j;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lz/j;ZFLo0/B0;Lx7/a;)LF0/j;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LR/t;->d(Lz/j;ZFLo0/B0;Lx7/a;)LF0/j;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lz/i;)Lu/j;
    .locals 7

    .prologue
    instance-of v0, p0, Lz/g;

    if-eqz v0, :cond_1

    :cond_0
    sget-object p0, LR/p;->a:Lu/w0;

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lz/d;

    if-eqz v0, :cond_2

    new-instance p0, Lu/w0;

    invoke-static {}, Lu/H;->e()Lu/F;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/16 v2, 0x2d

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lu/w0;-><init>(IILu/F;ILy7/k;)V

    goto :goto_0

    :cond_2
    instance-of p0, p0, Lz/b;

    if-eqz p0, :cond_0

    new-instance p0, Lu/w0;

    invoke-static {}, Lu/H;->e()Lu/F;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/16 v1, 0x2d

    const/4 v2, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lu/w0;-><init>(IILu/F;ILy7/k;)V

    :goto_0
    return-object p0
.end method

.method private static final e(Lz/i;)Lu/j;
    .locals 6

    .prologue
    instance-of v0, p0, Lz/g;

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    sget-object p0, LR/p;->a:Lu/w0;

    goto :goto_1

    :cond_1
    instance-of v0, p0, Lz/d;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    instance-of p0, p0, Lz/b;

    if-eqz p0, :cond_0

    new-instance p0, Lu/w0;

    invoke-static {}, Lu/H;->e()Lu/F;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/16 v1, 0x96

    const/4 v2, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lu/w0;-><init>(IILu/F;ILy7/k;)V

    :goto_1
    return-object p0
.end method

.method public static final f(ZFJLV/n;II)Lv/G;
    .locals 4

    .prologue
    and-int/lit8 v0, p6, 0x1

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move p0, v1

    :cond_0
    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_1

    sget-object p1, LY0/i;->D:LY0/i$a;

    invoke-virtual {p1}, LY0/i$a;->c()F

    move-result p1

    :cond_1
    const/4 v0, 0x4

    and-int/2addr p6, v0

    if-eqz p6, :cond_2

    sget-object p2, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {p2}, Lo0/y0$a;->g()J

    move-result-wide p2

    :cond_2
    invoke-static {}, LV/q;->H()Z

    move-result p6

    if-eqz p6, :cond_3

    const/4 p6, -0x1

    const-string v2, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:146)"

    const v3, 0x61769d80

    invoke-static {v3, p5, p6, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_3
    invoke-static {p2, p3}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object p2

    shr-int/lit8 p3, p5, 0x6

    and-int/lit8 p3, p3, 0xe

    invoke-static {p2, p4, p3}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object p2

    and-int/lit8 p3, p5, 0xe

    xor-int/lit8 p3, p3, 0x6

    const/4 p6, 0x0

    if-le p3, v0, :cond_4

    invoke-interface {p4, p0}, LV/n;->d(Z)Z

    move-result p3

    if-nez p3, :cond_5

    :cond_4
    and-int/lit8 p3, p5, 0x6

    if-ne p3, v0, :cond_6

    :cond_5
    move p3, v1

    goto :goto_0

    :cond_6
    move p3, p6

    :goto_0
    and-int/lit8 v0, p5, 0x70

    xor-int/lit8 v0, v0, 0x30

    const/16 v2, 0x20

    if-le v0, v2, :cond_7

    invoke-interface {p4, p1}, LV/n;->h(F)Z

    move-result v0

    if-nez v0, :cond_9

    :cond_7
    and-int/lit8 p5, p5, 0x30

    if-ne p5, v2, :cond_8

    goto :goto_1

    :cond_8
    move v1, p6

    :cond_9
    :goto_1
    or-int/2addr p3, v1

    invoke-interface {p4}, LV/n;->g()Ljava/lang/Object;

    move-result-object p5

    if-nez p3, :cond_a

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p5, p3, :cond_b

    :cond_a
    new-instance p5, LR/e;

    const/4 p3, 0x0

    invoke-direct {p5, p0, p1, p2, p3}, LR/e;-><init>(ZFLV/G1;Ly7/k;)V

    invoke-interface {p4, p5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast p5, LR/e;

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_c

    invoke-static {}, LV/q;->P()V

    :cond_c
    return-object p5
.end method
