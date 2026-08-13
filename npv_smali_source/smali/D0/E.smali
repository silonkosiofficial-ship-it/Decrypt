.class public final LD0/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/t;


# instance fields
.field private final C:LF0/U;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF0/U;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD0/E;->C:LF0/U;

    return-void
.end method

.method private final c()J
    .locals 7

    iget-object v0, p0, LD0/E;->C:LF0/U;

    invoke-static {v0}, LD0/F;->a(LF0/U;)LF0/U;

    move-result-object v0

    invoke-virtual {v0}, LF0/U;->m1()LD0/t;

    move-result-object v1

    sget-object v2, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v2}, Ln0/g$a;->c()J

    move-result-wide v3

    invoke-virtual {p0, v1, v3, v4}, LD0/E;->G(LD0/t;J)J

    move-result-wide v3

    invoke-virtual {p0}, LD0/E;->b()LF0/d0;

    move-result-object v1

    invoke-virtual {v0}, LF0/U;->K1()LF0/d0;

    move-result-object v0

    invoke-virtual {v2}, Ln0/g$a;->c()J

    move-result-wide v5

    invoke-virtual {v1, v0, v5, v6}, LF0/d0;->G(LD0/t;J)J

    move-result-wide v0

    invoke-static {v3, v4, v0, v1}, Ln0/g;->q(JJ)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public C(J)J
    .locals 3

    invoke-virtual {p0}, LD0/E;->b()LF0/d0;

    move-result-object v0

    invoke-direct {p0}, LD0/E;->c()J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Ln0/g;->r(JJ)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, LF0/d0;->C(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public G(LD0/t;J)J
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, LD0/E;->m0(LD0/t;JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public H()LD0/t;
    .locals 1

    .prologue
    invoke-virtual {p0}, LD0/E;->K()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LD0/E;->b()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->p2()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/d0;->j2()LF0/U;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/U;->m1()LD0/t;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public K()Z
    .locals 1

    invoke-virtual {p0}, LD0/E;->b()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->K()Z

    move-result v0

    return v0
.end method

.method public M([F)V
    .locals 1

    invoke-virtual {p0}, LD0/E;->b()LF0/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/d0;->M([F)V

    return-void
.end method

.method public N(LD0/t;Z)Ln0/i;
    .locals 1

    invoke-virtual {p0}, LD0/E;->b()LF0/d0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LF0/d0;->N(LD0/t;Z)Ln0/i;

    move-result-object p1

    return-object p1
.end method

.method public W(J)J
    .locals 2

    invoke-virtual {p0}, LD0/E;->b()LF0/d0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LF0/d0;->W(J)J

    move-result-wide p1

    invoke-direct {p0}, LD0/E;->c()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Ln0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public Y(LD0/t;[F)V
    .locals 1

    invoke-virtual {p0}, LD0/E;->b()LF0/d0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LF0/d0;->Y(LD0/t;[F)V

    return-void
.end method

.method public a()J
    .locals 2

    iget-object v0, p0, LD0/E;->C:LF0/U;

    invoke-virtual {v0}, LD0/X;->I0()I

    move-result v1

    invoke-virtual {v0}, LD0/X;->w0()I

    move-result v0

    invoke-static {v1, v0}, LY0/u;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()LF0/d0;
    .locals 1

    iget-object v0, p0, LD0/E;->C:LF0/U;

    invoke-virtual {v0}, LF0/U;->K1()LF0/d0;

    move-result-object v0

    return-object v0
.end method

.method public b0()LD0/t;
    .locals 2

    .prologue
    invoke-virtual {p0}, LD0/E;->K()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LD0/E;->b()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->m0()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->p2()LF0/d0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/d0;->j2()LF0/U;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/U;->m1()LD0/t;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public h0(J)J
    .locals 3

    invoke-virtual {p0}, LD0/E;->b()LF0/d0;

    move-result-object v0

    invoke-direct {p0}, LD0/E;->c()J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Ln0/g;->r(JJ)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, LF0/d0;->h0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public m0(LD0/t;JZ)J
    .locals 5

    .prologue
    instance-of v0, p1, LD0/E;

    if-eqz v0, :cond_1

    check-cast p1, LD0/E;

    iget-object p1, p1, LD0/E;->C:LF0/U;

    invoke-virtual {p1}, LF0/U;->K1()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->C2()V

    invoke-virtual {p0}, LD0/E;->b()LF0/d0;

    move-result-object v0

    invoke-virtual {p1}, LF0/U;->K1()LF0/d0;

    move-result-object v1

    invoke-virtual {v0, v1}, LF0/d0;->a2(LF0/d0;)LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->j2()LF0/U;

    move-result-object v0

    if-eqz v0, :cond_0

    xor-int/lit8 v1, p4, 0x1

    invoke-virtual {p1, v0, v1}, LF0/U;->P1(LF0/U;Z)J

    move-result-wide v1

    invoke-static {p2, p3}, LY0/q;->d(J)J

    move-result-wide p1

    invoke-static {v1, v2, p1, p2}, LY0/p;->l(JJ)J

    move-result-wide p1

    iget-object p3, p0, LD0/E;->C:LF0/U;

    xor-int/lit8 p4, p4, 0x1

    invoke-virtual {p3, v0, p4}, LF0/U;->P1(LF0/U;Z)J

    move-result-wide p3

    invoke-static {p1, p2, p3, p4}, LY0/p;->k(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/p;->h(J)I

    move-result p3

    int-to-float p3, p3

    invoke-static {p1, p2}, LY0/p;->i(J)I

    move-result p1

    int-to-float p1, p1

    invoke-static {p3, p1}, Ln0/h;->a(FF)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, LD0/F;->a(LF0/U;)LF0/U;

    move-result-object v0

    xor-int/lit8 v1, p4, 0x1

    invoke-virtual {p1, v0, v1}, LF0/U;->P1(LF0/U;Z)J

    move-result-wide v1

    invoke-virtual {v0}, LF0/U;->t1()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, LY0/p;->l(JJ)J

    move-result-wide v1

    invoke-static {p2, p3}, LY0/q;->d(J)J

    move-result-wide p1

    invoke-static {v1, v2, p1, p2}, LY0/p;->l(JJ)J

    move-result-wide p1

    iget-object p3, p0, LD0/E;->C:LF0/U;

    invoke-static {p3}, LD0/F;->a(LF0/U;)LF0/U;

    move-result-object p3

    iget-object v1, p0, LD0/E;->C:LF0/U;

    xor-int/lit8 v2, p4, 0x1

    invoke-virtual {v1, p3, v2}, LF0/U;->P1(LF0/U;Z)J

    move-result-wide v1

    invoke-virtual {p3}, LF0/U;->t1()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, LY0/p;->l(JJ)J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, LY0/p;->k(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/p;->h(J)I

    move-result v1

    int-to-float v1, v1

    invoke-static {p1, p2}, LY0/p;->i(J)I

    move-result p1

    int-to-float p1, p1

    invoke-static {v1, p1}, Ln0/h;->a(FF)J

    move-result-wide p1

    invoke-virtual {p3}, LF0/U;->K1()LF0/d0;

    move-result-object p3

    invoke-virtual {p3}, LF0/d0;->p2()LF0/d0;

    move-result-object p3

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LF0/U;->K1()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->p2()LF0/d0;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p3, v0, p1, p2, p4}, LF0/d0;->m0(LD0/t;JZ)J

    move-result-wide p1

    :goto_0
    return-wide p1

    :cond_1
    iget-object v0, p0, LD0/E;->C:LF0/U;

    invoke-static {v0}, LD0/F;->a(LF0/U;)LF0/U;

    move-result-object v0

    invoke-virtual {v0}, LF0/U;->L1()LD0/E;

    move-result-object v1

    invoke-virtual {p0, v1, p2, p3, p4}, LD0/E;->m0(LD0/t;JZ)J

    move-result-wide p2

    invoke-virtual {v0}, LF0/U;->K1()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->m1()LD0/t;

    move-result-object v0

    sget-object v1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v1}, Ln0/g$a;->c()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2, p4}, LD0/t;->m0(LD0/t;JZ)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Ln0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public s(J)J
    .locals 2

    invoke-virtual {p0}, LD0/E;->b()LF0/d0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LF0/d0;->s(J)J

    move-result-wide p1

    invoke-direct {p0}, LD0/E;->c()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Ln0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method
