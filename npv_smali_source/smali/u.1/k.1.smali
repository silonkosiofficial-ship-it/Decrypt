.class public abstract Lu/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lu/x0;Ljava/lang/Object;)Lu/r;
    .locals 0

    invoke-static {p0, p1}, Lu/k;->b(Lu/x0;Ljava/lang/Object;)Lu/r;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lu/x0;Ljava/lang/Object;)Lu/r;
    .locals 0

    .prologue
    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lu/x0;->a()Lx7/l;

    move-result-object p0

    invoke-interface {p0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lu/r;

    return-object p0
.end method

.method public static final c(Lu/j;J)Lu/j;
    .locals 1

    new-instance v0, Lu/m0;

    invoke-direct {v0, p0, p1, p2}, Lu/m0;-><init>(Lu/j;J)V

    return-object v0
.end method

.method public static final d(Lu/E;Lu/f0;J)Lu/Q;
    .locals 7

    new-instance v6, Lu/Q;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    invoke-direct/range {v0 .. v5}, Lu/Q;-><init>(Lu/E;Lu/f0;JLy7/k;)V

    return-object v6
.end method

.method public static synthetic e(Lu/E;Lu/f0;JILjava/lang/Object;)Lu/Q;
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p1, Lu/f0;->C:Lu/f0;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 p4, 0x2

    invoke-static {p3, p3, p4, p2}, Lu/o0;->c(IIILy7/k;)J

    move-result-wide p2

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lu/k;->d(Lu/E;Lu/f0;J)Lu/Q;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lx7/l;)Lu/W;
    .locals 2

    new-instance v0, Lu/W;

    new-instance v1, Lu/W$b;

    invoke-direct {v1}, Lu/W$b;-><init>()V

    invoke-interface {p0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, v1}, Lu/W;-><init>(Lu/W$b;)V

    return-object v0
.end method

.method public static final g(I)Lu/h0;
    .locals 1

    new-instance v0, Lu/h0;

    invoke-direct {v0, p0}, Lu/h0;-><init>(I)V

    return-object v0
.end method

.method public static synthetic h(IILjava/lang/Object;)Lu/h0;
    .locals 0

    .prologue
    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lu/k;->g(I)Lu/h0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(FFLjava/lang/Object;)Lu/l0;
    .locals 1

    new-instance v0, Lu/l0;

    invoke-direct {v0, p0, p1, p2}, Lu/l0;-><init>(FFLjava/lang/Object;)V

    return-object v0
.end method

.method public static synthetic j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;
    .locals 0

    .prologue
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/high16 p0, 0x3f800000    # 1.0f

    :cond_0
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_1

    const p1, 0x44bb8000    # 1500.0f

    :cond_1
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    const/4 p2, 0x0

    :cond_2
    invoke-static {p0, p1, p2}, Lu/k;->i(FFLjava/lang/Object;)Lu/l0;

    move-result-object p0

    return-object p0
.end method

.method public static final k(IILu/F;)Lu/w0;
    .locals 1

    new-instance v0, Lu/w0;

    invoke-direct {v0, p0, p1, p2}, Lu/w0;-><init>(IILu/F;)V

    return-object v0
.end method

.method public static synthetic l(IILu/F;ILjava/lang/Object;)Lu/w0;
    .locals 0

    .prologue
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/16 p0, 0x12c

    :cond_0
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_1

    const/4 p1, 0x0

    :cond_1
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    invoke-static {}, Lu/H;->d()Lu/F;

    move-result-object p2

    :cond_2
    invoke-static {p0, p1, p2}, Lu/k;->k(IILu/F;)Lu/w0;

    move-result-object p0

    return-object p0
.end method
