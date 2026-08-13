.class public final Lu/s0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/G1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field private final C:Lu/x0;

.field private final D:Ljava/lang/String;

.field private final E:LV/w0;

.field private final F:Lu/l0;

.field private final G:LV/w0;

.field private final H:LV/w0;

.field private I:Lu/g0$b;

.field private J:Lu/r0;

.field private final K:LV/w0;

.field private final L:LV/q0;

.field private M:Z

.field private final N:LV/w0;

.field private O:Lu/r;

.field private final P:LV/u0;

.field private Q:Z

.field private final R:Lu/I;

.field final synthetic S:Lu/s0;


# direct methods
.method public constructor <init>(Lu/s0;Ljava/lang/Object;Lu/r;Lu/x0;Ljava/lang/String;)V
    .locals 8

    .prologue
    iput-object p1, p0, Lu/s0$d;->S:Lu/s0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lu/s0$d;->C:Lu/x0;

    iput-object p5, p0, Lu/s0$d;->D:Ljava/lang/String;

    const/4 p1, 0x0

    const/4 p5, 0x2

    invoke-static {p2, p1, p5, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    iput-object v0, p0, Lu/s0$d;->E:LV/w0;

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-static {v1, v1, p1, v0, p1}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v0

    iput-object v0, p0, Lu/s0$d;->F:Lu/l0;

    invoke-static {v0, p1, p5, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    iput-object v0, p0, Lu/s0$d;->G:LV/w0;

    new-instance v0, Lu/r0;

    invoke-virtual {p0}, Lu/s0$d;->n()Lu/I;

    move-result-object v3

    invoke-direct {p0}, Lu/s0$d;->s()Ljava/lang/Object;

    move-result-object v6

    move-object v2, v0

    move-object v4, p4

    move-object v5, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, Lu/r0;-><init>(Lu/j;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Lu/r;)V

    invoke-static {v0, p1, p5, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    iput-object v0, p0, Lu/s0$d;->H:LV/w0;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, p1, p5, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    iput-object v0, p0, Lu/s0$d;->K:LV/w0;

    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {v0}, LV/J0;->a(F)LV/q0;

    move-result-object v0

    iput-object v0, p0, Lu/s0$d;->L:LV/q0;

    invoke-static {p2, p1, p5, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p5

    iput-object p5, p0, Lu/s0$d;->N:LV/w0;

    iput-object p3, p0, Lu/s0$d;->O:Lu/r;

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object p3

    invoke-virtual {p3}, Lu/r0;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, LV/n1;->a(J)LV/u0;

    move-result-object p3

    iput-object p3, p0, Lu/s0$d;->P:LV/u0;

    invoke-static {}, Lu/Q0;->h()Ljava/util/Map;

    move-result-object p3

    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Float;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p3

    invoke-interface {p4}, Lu/x0;->a()Lx7/l;

    move-result-object p4

    invoke-interface {p4, p2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lu/r;

    invoke-virtual {p2}, Lu/r;->b()I

    move-result p4

    const/4 p5, 0x0

    :goto_0
    if-ge p5, p4, :cond_0

    invoke-virtual {p2, p5, p3}, Lu/r;->e(IF)V

    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lu/s0$d;->C:Lu/x0;

    invoke-interface {p3}, Lu/x0;->b()Lx7/l;

    move-result-object p3

    invoke-interface {p3, p2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, p1

    :goto_1
    const/4 p3, 0x3

    invoke-static {v1, v1, p2, p3, p1}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p1

    iput-object p1, p0, Lu/s0$d;->R:Lu/I;

    return-void
.end method

.method private final E(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lu/s0$d;->E:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final G(Ljava/lang/Object;Z)V
    .locals 7

    .prologue
    iget-object v0, p0, Lu/s0$d;->J:Lu/r0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu/r0;->g()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0}, Lu/s0$d;->s()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p2, Lu/r0;

    iget-object v2, p0, Lu/s0$d;->R:Lu/I;

    iget-object v3, p0, Lu/s0$d;->C:Lu/x0;

    iget-object v0, p0, Lu/s0$d;->O:Lu/r;

    invoke-static {v0}, Lu/s;->g(Lu/r;)Lu/r;

    move-result-object v6

    move-object v1, p2

    move-object v4, p1

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lu/r0;-><init>(Lu/j;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Lu/r;)V

    invoke-direct {p0, p2}, Lu/s0$d;->y(Lu/r0;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu/s0$d;->M:Z

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object p1

    invoke-virtual {p1}, Lu/r0;->b()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lu/s0$d;->A(J)V

    return-void

    :cond_1
    if-eqz p2, :cond_2

    iget-boolean p2, p0, Lu/s0$d;->Q:Z

    if-nez p2, :cond_2

    invoke-virtual {p0}, Lu/s0$d;->n()Lu/I;

    move-result-object p2

    instance-of p2, p2, Lu/l0;

    if-eqz p2, :cond_3

    :cond_2
    invoke-virtual {p0}, Lu/s0$d;->n()Lu/I;

    move-result-object p2

    goto :goto_1

    :cond_3
    iget-object p2, p0, Lu/s0$d;->R:Lu/I;

    :goto_1
    iget-object v0, p0, Lu/s0$d;->S:Lu/s0;

    invoke-virtual {v0}, Lu/s0;->m()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_4

    :goto_2
    move-object v1, p2

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lu/s0$d;->S:Lu/s0;

    invoke-virtual {v0}, Lu/s0;->m()J

    move-result-wide v0

    invoke-static {p2, v0, v1}, Lu/k;->c(Lu/j;J)Lu/j;

    move-result-object p2

    goto :goto_2

    :goto_3
    new-instance p2, Lu/r0;

    iget-object v2, p0, Lu/s0$d;->C:Lu/x0;

    invoke-direct {p0}, Lu/s0$d;->s()Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Lu/s0$d;->O:Lu/r;

    move-object v0, p2

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lu/r0;-><init>(Lu/j;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Lu/r;)V

    invoke-direct {p0, p2}, Lu/s0$d;->y(Lu/r0;)V

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object p1

    invoke-virtual {p1}, Lu/r0;->b()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lu/s0$d;->A(J)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lu/s0$d;->M:Z

    iget-object p1, p0, Lu/s0$d;->S:Lu/s0;

    invoke-static {p1}, Lu/s0;->b(Lu/s0;)V

    return-void
.end method

.method static synthetic H(Lu/s0$d;Ljava/lang/Object;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lu/s0$d;->getValue()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-direct {p0, p1, p2}, Lu/s0$d;->G(Ljava/lang/Object;Z)V

    return-void
.end method

.method private final s()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/s0$d;->E:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final y(Lu/r0;)V
    .locals 1

    iget-object v0, p0, Lu/s0$d;->H:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final z(Lu/I;)V
    .locals 1

    iget-object v0, p0, Lu/s0$d;->G:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final A(J)V
    .locals 1

    iget-object v0, p0, Lu/s0$d;->P:LV/u0;

    invoke-interface {v0, p1, p2}, LV/u0;->j(J)V

    return-void
.end method

.method public final B(Z)V
    .locals 1

    iget-object v0, p0, Lu/s0$d;->K:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final C(Lu/g0$b;)V
    .locals 7

    .prologue
    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object v0

    invoke-virtual {v0}, Lu/r0;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object v1

    invoke-virtual {v1}, Lu/r0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object v0

    iput-object v0, p0, Lu/s0$d;->J:Lu/r0;

    iput-object p1, p0, Lu/s0$d;->I:Lu/g0$b;

    :cond_0
    new-instance p1, Lu/r0;

    iget-object v2, p0, Lu/s0$d;->R:Lu/I;

    iget-object v3, p0, Lu/s0$d;->C:Lu/x0;

    invoke-virtual {p0}, Lu/s0$d;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0}, Lu/s0$d;->getValue()Ljava/lang/Object;

    move-result-object v5

    iget-object v0, p0, Lu/s0$d;->O:Lu/r;

    invoke-static {v0}, Lu/s;->g(Lu/r;)Lu/r;

    move-result-object v6

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lu/r0;-><init>(Lu/j;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Lu/r;)V

    invoke-direct {p0, p1}, Lu/s0$d;->y(Lu/r0;)V

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object p1

    invoke-virtual {p1}, Lu/r0;->b()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu/s0$d;->A(J)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu/s0$d;->M:Z

    return-void
.end method

.method public final D(F)V
    .locals 1

    iget-object v0, p0, Lu/s0$d;->L:LV/q0;

    invoke-interface {v0, p1}, LV/q0;->h(F)V

    return-void
.end method

.method public F(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lu/s0$d;->N:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final I(Ljava/lang/Object;Ljava/lang/Object;Lu/I;)V
    .locals 1

    .prologue
    invoke-direct {p0, p2}, Lu/s0$d;->E(Ljava/lang/Object;)V

    invoke-direct {p0, p3}, Lu/s0$d;->z(Lu/I;)V

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object p3

    invoke-virtual {p3}, Lu/r0;->i()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object p3

    invoke-virtual {p3}, Lu/r0;->g()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x2

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2, p3}, Lu/s0$d;->H(Lu/s0$d;Ljava/lang/Object;ZILjava/lang/Object;)V

    return-void
.end method

.method public final J()V
    .locals 6

    .prologue
    iget-object v0, p0, Lu/s0$d;->I:Lu/g0$b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lu/s0$d;->J:Lu/r0;

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Lu/g0$b;->c()J

    move-result-wide v2

    long-to-double v2, v2

    invoke-virtual {v0}, Lu/g0$b;->g()F

    move-result v4

    float-to-double v4, v4

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, LA7/a;->e(D)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lu/r0;->f(J)Ljava/lang/Object;

    move-result-object v1

    iget-boolean v4, p0, Lu/s0$d;->M:Z

    if-eqz v4, :cond_2

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object v4

    invoke-virtual {v4, v1}, Lu/r0;->k(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object v4

    invoke-virtual {v4, v1}, Lu/r0;->j(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object v4

    invoke-virtual {v4}, Lu/r0;->b()J

    move-result-wide v4

    invoke-virtual {p0, v4, v5}, Lu/s0$d;->A(J)V

    invoke-virtual {p0}, Lu/s0$d;->r()F

    move-result v4

    const/high16 v5, -0x40000000    # -2.0f

    cmpg-float v4, v4, v5

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    iget-boolean v4, p0, Lu/s0$d;->M:Z

    if-eqz v4, :cond_4

    :goto_0
    invoke-virtual {p0, v1}, Lu/s0$d;->F(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lu/s0$d;->S:Lu/s0;

    invoke-virtual {v1}, Lu/s0;->m()J

    move-result-wide v4

    invoke-virtual {p0, v4, v5}, Lu/s0$d;->x(J)V

    :goto_1
    invoke-virtual {v0}, Lu/g0$b;->c()J

    move-result-wide v4

    cmp-long v1, v2, v4

    if-ltz v1, :cond_5

    const/4 v0, 0x0

    iput-object v0, p0, Lu/s0$d;->I:Lu/g0$b;

    iput-object v0, p0, Lu/s0$d;->J:Lu/r0;

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lu/g0$b;->k(Z)V

    :goto_2
    return-void
.end method

.method public final K(Ljava/lang/Object;Lu/I;)V
    .locals 4

    .prologue
    iget-boolean v0, p0, Lu/s0$d;->M:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu/s0$d;->J:Lu/r0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu/r0;->g()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-direct {p0}, Lu/s0$d;->s()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lu/s0$d;->r()F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-direct {p0, p1}, Lu/s0$d;->E(Ljava/lang/Object;)V

    invoke-direct {p0, p2}, Lu/s0$d;->z(Lu/I;)V

    invoke-virtual {p0}, Lu/s0$d;->r()F

    move-result p2

    const/high16 v0, -0x3fc00000    # -3.0f

    cmpg-float p2, p2, v0

    if-nez p2, :cond_3

    move-object p2, p1

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lu/s0$d;->getValue()Ljava/lang/Object;

    move-result-object p2

    :goto_1
    invoke-virtual {p0}, Lu/s0$d;->t()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    invoke-direct {p0, p2, v2}, Lu/s0$d;->G(Ljava/lang/Object;Z)V

    invoke-virtual {p0}, Lu/s0$d;->r()F

    move-result p2

    cmpg-float p2, p2, v0

    const/4 v2, 0x0

    if-nez p2, :cond_4

    goto :goto_2

    :cond_4
    move v3, v2

    :goto_2
    invoke-virtual {p0, v3}, Lu/s0$d;->B(Z)V

    invoke-virtual {p0}, Lu/s0$d;->r()F

    move-result p2

    const/4 v3, 0x0

    cmpl-float p2, p2, v3

    if-ltz p2, :cond_5

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object p1

    invoke-virtual {p1}, Lu/r0;->b()J

    move-result-wide p1

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object v0

    long-to-float p1, p1

    invoke-virtual {p0}, Lu/s0$d;->r()F

    move-result p2

    mul-float/2addr p1, p2

    float-to-long p1, p1

    invoke-virtual {v0, p1, p2}, Lu/r0;->f(J)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    invoke-virtual {p0, p1}, Lu/s0$d;->F(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    invoke-virtual {p0}, Lu/s0$d;->r()F

    move-result p2

    cmpg-float p2, p2, v0

    if-nez p2, :cond_6

    goto :goto_3

    :cond_6
    :goto_4
    iput-boolean v2, p0, Lu/s0$d;->M:Z

    invoke-virtual {p0, v1}, Lu/s0$d;->D(F)V

    return-void
.end method

.method public final e()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lu/s0$d;->J:Lu/r0;

    iput-object v0, p0, Lu/s0$d;->I:Lu/g0$b;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu/s0$d;->M:Z

    return-void
.end method

.method public final g()Lu/r0;
    .locals 1

    iget-object v0, p0, Lu/s0$d;->H:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu/r0;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/s0$d;->N:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final n()Lu/I;
    .locals 1

    iget-object v0, p0, Lu/s0$d;->G:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu/I;

    return-object v0
.end method

.method public final o()J
    .locals 2

    iget-object v0, p0, Lu/s0$d;->P:LV/u0;

    invoke-interface {v0}, LV/h0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public final q()Lu/g0$b;
    .locals 1

    iget-object v0, p0, Lu/s0$d;->I:Lu/g0$b;

    return-object v0
.end method

.method public final r()F
    .locals 1

    iget-object v0, p0, Lu/s0$d;->L:LV/q0;

    invoke-interface {v0}, LV/S;->b()F

    move-result v0

    return v0
.end method

.method public final t()Z
    .locals 1

    iget-object v0, p0, Lu/s0$d;->K:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "current value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu/s0$d;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", target: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lu/s0$d;->s()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", spec: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu/s0$d;->n()Lu/I;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(JZ)V
    .locals 0

    .prologue
    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object p1

    invoke-virtual {p1}, Lu/r0;->b()J

    move-result-wide p1

    :cond_0
    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lu/r0;->f(J)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p0, p3}, Lu/s0$d;->F(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lu/r0;->d(J)Lu/r;

    move-result-object p3

    iput-object p3, p0, Lu/s0$d;->O:Lu/r;

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lu/r0;->e(J)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lu/s0$d;->B(Z)V

    :cond_1
    return-void
.end method

.method public final v()V
    .locals 1

    const/high16 v0, -0x40000000    # -2.0f

    invoke-virtual {p0, v0}, Lu/s0$d;->D(F)V

    return-void
.end method

.method public final w(F)V
    .locals 2

    .prologue
    const/high16 v0, -0x3f800000    # -4.0f

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v1, -0x3f600000    # -5.0f

    cmpg-float v1, p1, v1

    if-nez v1, :cond_3

    :goto_0
    iget-object p1, p0, Lu/s0$d;->J:Lu/r0;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object v1

    invoke-virtual {p1}, Lu/r0;->g()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Lu/r0;->j(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lu/s0$d;->I:Lu/g0$b;

    iput-object p1, p0, Lu/s0$d;->J:Lu/r0;

    :cond_1
    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object p1

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lu/r0;->i()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lu/r0;->g()Ljava/lang/Object;

    move-result-object p1

    :goto_1
    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu/r0;->j(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu/r0;->k(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lu/s0$d;->F(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object p1

    invoke-virtual {p1}, Lu/r0;->b()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu/s0$d;->A(J)V

    goto :goto_2

    :cond_3
    invoke-virtual {p0, p1}, Lu/s0$d;->D(F)V

    :goto_2
    return-void
.end method

.method public final x(J)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lu/s0$d;->r()F

    move-result v0

    const/high16 v1, -0x40800000    # -1.0f

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu/s0$d;->Q:Z

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object v0

    invoke-virtual {v0}, Lu/r0;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object v1

    invoke-virtual {v1}, Lu/r0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object p1

    invoke-virtual {p1}, Lu/r0;->g()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lu/s0$d;->F(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lu/r0;->f(J)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lu/s0$d;->F(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lu/s0$d;->g()Lu/r0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lu/r0;->d(J)Lu/r;

    move-result-object p1

    iput-object p1, p0, Lu/s0$d;->O:Lu/r;

    :cond_1
    :goto_0
    return-void
.end method
