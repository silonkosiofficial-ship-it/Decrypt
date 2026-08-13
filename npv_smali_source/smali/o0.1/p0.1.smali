.class public abstract synthetic Lo0/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lo0/q0;Ln0/i;I)V
    .locals 6

    invoke-virtual {p1}, Ln0/i;->i()F

    move-result v1

    invoke-virtual {p1}, Ln0/i;->l()F

    move-result v2

    invoke-virtual {p1}, Ln0/i;->j()F

    move-result v3

    invoke-virtual {p1}, Ln0/i;->e()F

    move-result v4

    move-object v0, p0

    move v5, p2

    invoke-interface/range {v0 .. v5}, Lo0/q0;->c(FFFFI)V

    return-void
.end method

.method public static b(Lo0/q0;Ln0/i;Lo0/N1;)V
    .locals 6

    invoke-virtual {p1}, Ln0/i;->i()F

    move-result v1

    invoke-virtual {p1}, Ln0/i;->l()F

    move-result v2

    invoke-virtual {p1}, Ln0/i;->j()F

    move-result v3

    invoke-virtual {p1}, Ln0/i;->e()F

    move-result v4

    move-object v0, p0

    move-object v5, p2

    invoke-interface/range {v0 .. v5}, Lo0/q0;->l(FFFFLo0/N1;)V

    return-void
.end method

.method public static synthetic c(Lo0/q0;Lo0/Q1;IILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lo0/x0;->a:Lo0/x0$a;

    invoke-virtual {p2}, Lo0/x0$a;->b()I

    move-result p2

    :cond_0
    invoke-interface {p0, p1, p2}, Lo0/q0;->b(Lo0/Q1;I)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic d(Lo0/q0;FFFFIILjava/lang/Object;)V
    .locals 6

    .prologue
    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    sget-object p5, Lo0/x0;->a:Lo0/x0$a;

    invoke-virtual {p5}, Lo0/x0$a;->b()I

    move-result p5

    :cond_0
    move v5, p5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-interface/range {v0 .. v5}, Lo0/q0;->c(FFFFI)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: clipRect-N_I0leg"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic e(Lo0/q0;Ln0/i;IILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lo0/x0;->a:Lo0/x0$a;

    invoke-virtual {p2}, Lo0/x0$a;->b()I

    move-result p2

    :cond_0
    invoke-interface {p0, p1, p2}, Lo0/q0;->e(Ln0/i;I)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
