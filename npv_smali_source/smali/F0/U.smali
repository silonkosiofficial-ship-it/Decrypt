.class public abstract LF0/U;
.super LF0/T;
.source "SourceFile"

# interfaces
.implements LD0/G;


# instance fields
.field private final R:LF0/d0;

.field private S:J

.field private T:Ljava/util/Map;

.field private final U:LD0/E;

.field private V:LD0/K;

.field private final W:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF0/d0;)V
    .locals 2

    invoke-direct {p0}, LF0/T;-><init>()V

    iput-object p1, p0, LF0/U;->R:LF0/d0;

    sget-object p1, LY0/p;->b:LY0/p$a;

    invoke-virtual {p1}, LY0/p$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LF0/U;->S:J

    new-instance p1, LD0/E;

    invoke-direct {p1, p0}, LD0/E;-><init>(LF0/U;)V

    iput-object p1, p0, LF0/U;->U:LD0/E;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LF0/U;->W:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic E1(LF0/U;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LD0/X;->a1(J)V

    return-void
.end method

.method public static final synthetic F1(LF0/U;LD0/K;)V
    .locals 0

    invoke-direct {p0, p1}, LF0/U;->R1(LD0/K;)V

    return-void
.end method

.method private final N1(J)V
    .locals 2

    .prologue
    invoke-virtual {p0}, LF0/U;->t1()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, LY0/p;->g(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p2}, LF0/U;->Q1(J)V

    invoke-virtual {p0}, LF0/U;->o1()LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->V()LF0/O;

    move-result-object p1

    invoke-virtual {p1}, LF0/O;->H()LF0/O$a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LF0/O$a;->v1()V

    :cond_0
    iget-object p1, p0, LF0/U;->R:LF0/d0;

    invoke-virtual {p0, p1}, LF0/T;->v1(LF0/d0;)V

    :cond_1
    invoke-virtual {p0}, LF0/T;->y1()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, LF0/U;->q1()LD0/K;

    move-result-object p1

    invoke-virtual {p0, p1}, LF0/T;->i1(LD0/K;)V

    :cond_2
    return-void
.end method

.method private final R1(LD0/K;)V
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    invoke-interface {p1}, LD0/K;->getWidth()I

    move-result v0

    invoke-interface {p1}, LD0/K;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, LY0/u;->a(II)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LD0/X;->Y0(J)V

    sget-object v0, Li7/M;->a:Li7/M;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, LY0/t;->b:LY0/t$a;

    invoke-virtual {v0}, LY0/t$a;->a()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LD0/X;->Y0(J)V

    :cond_1
    iget-object v0, p0, LF0/U;->V:LD0/K;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    if-eqz p1, :cond_5

    iget-object v0, p0, LF0/U;->T:Ljava/util/Map;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    invoke-interface {p1}, LD0/K;->f()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_5

    :cond_3
    invoke-interface {p1}, LD0/K;->f()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LF0/U;->T:Ljava/util/Map;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, LF0/U;->G1()LF0/b;

    move-result-object v0

    invoke-interface {v0}, LF0/b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0}, LF0/a;->m()V

    iget-object v0, p0, LF0/U;->T:Ljava/util/Map;

    if-nez v0, :cond_4

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LF0/U;->T:Ljava/util/Map;

    :cond_4
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    invoke-interface {p1}, LD0/K;->f()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_5
    iput-object p1, p0, LF0/U;->V:LD0/K;

    return-void
.end method


# virtual methods
.method public A0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public B1()V
    .locals 4

    invoke-virtual {p0}, LF0/U;->t1()J

    move-result-wide v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, LF0/U;->R0(JFLx7/l;)V

    return-void
.end method

.method public G1()LF0/b;
    .locals 1

    iget-object v0, p0, LF0/U;->R:LF0/d0;

    invoke-virtual {v0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->V()LF0/O;

    move-result-object v0

    invoke-virtual {v0}, LF0/O;->C()LF0/b;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final H1(LD0/a;)I
    .locals 1

    .prologue
    iget-object v0, p0, LF0/U;->W:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/high16 p1, -0x80000000

    :goto_0
    return p1
.end method

.method protected final I1()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LF0/U;->W:Ljava/util/Map;

    return-object v0
.end method

.method public final J1()J
    .locals 2

    invoke-virtual {p0}, LD0/X;->E0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final K1()LF0/d0;
    .locals 1

    iget-object v0, p0, LF0/U;->R:LF0/d0;

    return-object v0
.end method

.method public final L1()LD0/E;
    .locals 1

    iget-object v0, p0, LF0/U;->U:LD0/E;

    return-object v0
.end method

.method protected M1()V
    .locals 1

    invoke-virtual {p0}, LF0/U;->q1()LD0/K;

    move-result-object v0

    invoke-interface {v0}, LD0/K;->k()V

    return-void
.end method

.method public final O1(J)V
    .locals 2

    invoke-virtual {p0}, LD0/X;->u0()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, LY0/p;->l(JJ)J

    move-result-wide p1

    invoke-direct {p0, p1, p2}, LF0/U;->N1(J)V

    return-void
.end method

.method public final P1(LF0/U;Z)J
    .locals 5

    .prologue
    sget-object v0, LY0/p;->b:LY0/p$a;

    invoke-virtual {v0}, LY0/p$a;->a()J

    move-result-wide v0

    move-object v2, p0

    :goto_0
    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v2}, LF0/T;->x1()Z

    move-result v3

    if-eqz v3, :cond_0

    if-nez p2, :cond_1

    :cond_0
    invoke-virtual {v2}, LF0/U;->t1()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/p;->l(JJ)J

    move-result-wide v0

    :cond_1
    iget-object v2, v2, LF0/U;->R:LF0/d0;

    invoke-virtual {v2}, LF0/d0;->p2()LF0/d0;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, LF0/d0;->j2()LF0/U;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-wide v0
.end method

.method public Q1(J)V
    .locals 0

    iput-wide p1, p0, LF0/U;->S:J

    return-void
.end method

.method protected final R0(JFLx7/l;)V
    .locals 0

    .prologue
    invoke-direct {p0, p1, p2}, LF0/U;->N1(J)V

    invoke-virtual {p0}, LF0/T;->z1()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LF0/U;->M1()V

    return-void
.end method

.method public abstract S(I)I
.end method

.method public abstract T(I)I
.end method

.method public Z()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF0/U;->R:LF0/d0;

    invoke-virtual {v0}, LF0/d0;->Z()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, LF0/U;->R:LF0/d0;

    invoke-virtual {v0}, LF0/d0;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    iget-object v0, p0, LF0/U;->R:LF0/d0;

    invoke-virtual {v0}, LF0/d0;->getLayoutDirection()LY0/v;

    move-result-object v0

    return-object v0
.end method

.method public k1()LF0/T;
    .locals 1

    .prologue
    iget-object v0, p0, LF0/U;->R:LF0/d0;

    invoke-virtual {v0}, LF0/d0;->o2()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/d0;->j2()LF0/U;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public m1()LD0/t;
    .locals 1

    iget-object v0, p0, LF0/U;->U:LD0/E;

    return-object v0
.end method

.method public abstract n0(I)I
.end method

.method public n1()Z
    .locals 1

    .prologue
    iget-object v0, p0, LF0/U;->V:LD0/K;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o1()LF0/J;
    .locals 1

    iget-object v0, p0, LF0/U;->R:LF0/d0;

    invoke-virtual {v0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    return-object v0
.end method

.method public q1()LD0/K;
    .locals 2

    .prologue
    iget-object v0, p0, LF0/U;->V:LD0/K;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LookaheadDelegate has not been measured yet when measureResult is requested."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public r1()LF0/T;
    .locals 1

    .prologue
    iget-object v0, p0, LF0/U;->R:LF0/d0;

    invoke-virtual {v0}, LF0/d0;->p2()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/d0;->j2()LF0/U;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public abstract t(I)I
.end method

.method public t1()J
    .locals 2

    iget-wide v0, p0, LF0/U;->S:J

    return-wide v0
.end method

.method public v0()F
    .locals 1

    iget-object v0, p0, LF0/U;->R:LF0/d0;

    invoke-virtual {v0}, LF0/d0;->v0()F

    move-result v0

    return v0
.end method
