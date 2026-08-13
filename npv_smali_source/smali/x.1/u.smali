.class public final Lx/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/t;
.implements LY0/e;


# instance fields
.field private final synthetic C:LY0/e;

.field private D:Z

.field private E:Z

.field private final F:Lf9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LY0/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx/u;->C:LY0/e;

    const/4 p1, 0x0

    invoke-static {p1}, Lf9/g;->a(Z)Lf9/a;

    move-result-object p1

    iput-object p1, p0, Lx/u;->F:Lf9/a;

    return-void
.end method


# virtual methods
.method public B0(F)F
    .locals 1

    iget-object v0, p0, Lx/u;->C:LY0/e;

    invoke-interface {v0, p1}, LY0/e;->B0(F)F

    move-result p1

    return p1
.end method

.method public K0(J)I
    .locals 1

    iget-object v0, p0, Lx/u;->C:LY0/e;

    invoke-interface {v0, p1, p2}, LY0/e;->K0(J)I

    move-result p1

    return p1
.end method

.method public O(F)J
    .locals 2

    iget-object v0, p0, Lx/u;->C:LY0/e;

    invoke-interface {v0, p1}, LY0/n;->O(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public P(J)J
    .locals 1

    iget-object v0, p0, Lx/u;->C:LY0/e;

    invoke-interface {v0, p1, p2}, LY0/e;->P(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public S0(F)I
    .locals 1

    iget-object v0, p0, Lx/u;->C:LY0/e;

    invoke-interface {v0, p1}, LY0/e;->S0(F)I

    move-result p1

    return p1
.end method

.method public X(J)F
    .locals 1

    iget-object v0, p0, Lx/u;->C:LY0/e;

    invoke-interface {v0, p1, p2}, LY0/n;->X(J)F

    move-result p1

    return p1
.end method

.method public b1(J)J
    .locals 1

    iget-object v0, p0, Lx/u;->C:LY0/e;

    invoke-interface {v0, p1, p2}, LY0/e;->b1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final f()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx/u;->E:Z

    iget-object v1, p0, Lx/u;->F:Lf9/a;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, Lf9/a$a;->c(Lf9/a;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public g1(J)F
    .locals 1

    iget-object v0, p0, Lx/u;->C:LY0/e;

    invoke-interface {v0, p1, p2}, LY0/e;->g1(J)F

    move-result p1

    return p1
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, Lx/u;->C:LY0/e;

    invoke-interface {v0}, LY0/e;->getDensity()F

    move-result v0

    return v0
.end method

.method public j0(Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p1, Lx/u$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lx/u$b;

    iget v1, v0, Lx/u$b;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx/u$b;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx/u$b;

    invoke-direct {v0, p0, p1}, Lx/u$b;-><init>(Lx/u;Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lx/u$b;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx/u$b;->I:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lx/u$b;->F:Ljava/lang/Object;

    check-cast v0, Lx/u;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lx/u;->D:Z

    if-nez p1, :cond_4

    iget-boolean p1, p0, Lx/u;->E:Z

    if-nez p1, :cond_4

    iget-object p1, p0, Lx/u;->F:Lf9/a;

    iput-object p0, v0, Lx/u$b;->F:Ljava/lang/Object;

    iput v4, v0, Lx/u$b;->I:I

    invoke-static {p1, v3, v0, v4, v3}, Lf9/a$a;->a(Lf9/a;Ljava/lang/Object;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p1, v0, Lx/u;->F:Lf9/a;

    invoke-static {p1, v3, v4, v3}, Lf9/a$a;->c(Lf9/a;Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_2

    :cond_4
    move-object v0, p0

    :goto_2
    iget-boolean p1, v0, Lx/u;->D:Z

    invoke-static {p1}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final k()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx/u;->D:Z

    iget-object v1, p0, Lx/u;->F:Lf9/a;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, Lf9/a$a;->c(Lf9/a;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public k0(F)J
    .locals 2

    iget-object v0, p0, Lx/u;->C:LY0/e;

    invoke-interface {v0, p1}, LY0/e;->k0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public o0(I)F
    .locals 1

    iget-object v0, p0, Lx/u;->C:LY0/e;

    invoke-interface {v0, p1}, LY0/e;->o0(I)F

    move-result p1

    return p1
.end method

.method public q0(F)F
    .locals 1

    iget-object v0, p0, Lx/u;->C:LY0/e;

    invoke-interface {v0, p1}, LY0/e;->q0(F)F

    move-result p1

    return p1
.end method

.method public final s(Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p1, Lx/u$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lx/u$a;

    iget v1, v0, Lx/u$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx/u$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx/u$a;

    invoke-direct {v0, p0, p1}, Lx/u$a;-><init>(Lx/u;Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lx/u$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx/u$a;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lx/u$a;->F:Ljava/lang/Object;

    check-cast v0, Lx/u;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lx/u;->F:Lf9/a;

    iput-object p0, v0, Lx/u$a;->F:Ljava/lang/Object;

    iput v3, v0, Lx/u$a;->I:I

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v3, v2}, Lf9/a$a;->a(Lf9/a;Ljava/lang/Object;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 p1, 0x0

    iput-boolean p1, v0, Lx/u;->D:Z

    iput-boolean p1, v0, Lx/u;->E:Z

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public v0()F
    .locals 1

    iget-object v0, p0, Lx/u;->C:LY0/e;

    invoke-interface {v0}, LY0/n;->v0()F

    move-result v0

    return v0
.end method
