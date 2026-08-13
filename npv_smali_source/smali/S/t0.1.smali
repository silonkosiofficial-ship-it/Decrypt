.class public final LS/t0;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/h;
.implements LF0/E;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic C(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->d(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic F(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->b(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 9

    .prologue
    invoke-static {}, LS/k0;->a()LV/O0;

    move-result-object v0

    invoke-static {p0, v0}, LF0/i;->a(LF0/h;LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/i;

    invoke-virtual {v0}, LY0/i;->v()F

    move-result v0

    const/4 v1, 0x0

    int-to-float v2, v1

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v3

    invoke-static {v0, v3}, LE7/j;->c(FF)F

    move-result v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result p3

    const/4 p4, 0x1

    if-eqz p3, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p3

    xor-int/2addr p3, p4

    if-eqz p3, :cond_0

    invoke-static {v2}, LY0/i;->q(F)F

    move-result p3

    invoke-static {v0, p3}, LY0/i;->o(FF)I

    move-result p3

    if-lez p3, :cond_0

    move p3, p4

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    xor-int/2addr p4, v2

    if-eqz p4, :cond_1

    invoke-interface {p1, v0}, LY0/e;->S0(F)I

    move-result v1

    :cond_1
    invoke-virtual {p2}, LD0/X;->I0()I

    move-result p4

    if-eqz p3, :cond_2

    invoke-static {p4, v1}, Ljava/lang/Math;->max(II)I

    move-result p4

    :cond_2
    move v3, p4

    if-eqz p3, :cond_3

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result p3

    invoke-static {p3, v1}, Ljava/lang/Math;->max(II)I

    move-result p3

    :goto_1
    move v4, p3

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, LD0/X;->w0()I

    move-result p3

    goto :goto_1

    :goto_2
    new-instance v6, LS/t0$a;

    invoke-direct {v6, v3, p2, v4}, LS/t0$a;-><init>(ILD0/X;I)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public synthetic k(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->a(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic t(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->c(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method
