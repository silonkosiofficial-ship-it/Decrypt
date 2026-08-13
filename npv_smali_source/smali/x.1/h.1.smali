.class public final Lx/h;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LE/c;
.implements LF0/C;
.implements LF0/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/h$a;,
        Lx/h$b;
    }
.end annotation


# instance fields
.field private P:Lx/s;

.field private final Q:Lx/C;

.field private R:Z

.field private S:Lx/f;

.field private final T:Z

.field private final U:Lx/d;

.field private V:LD0/t;

.field private W:Ln0/i;

.field private X:Z

.field private Y:J

.field private Z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx/s;Lx/C;ZLx/f;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Lx/h;->P:Lx/s;

    iput-object p2, p0, Lx/h;->Q:Lx/C;

    iput-boolean p3, p0, Lx/h;->R:Z

    iput-object p4, p0, Lx/h;->S:Lx/f;

    new-instance p1, Lx/d;

    invoke-direct {p1}, Lx/d;-><init>()V

    iput-object p1, p0, Lx/h;->U:Lx/d;

    sget-object p1, LY0/t;->b:LY0/t$a;

    invoke-virtual {p1}, LY0/t$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lx/h;->Y:J

    return-void
.end method

.method public static final synthetic T1(Lx/h;Lx/f;)F
    .locals 0

    invoke-direct {p0, p1}, Lx/h;->d2(Lx/f;)F

    move-result p0

    return p0
.end method

.method public static final synthetic U1(Lx/h;)Lx/d;
    .locals 0

    iget-object p0, p0, Lx/h;->U:Lx/d;

    return-object p0
.end method

.method public static final synthetic V1(Lx/h;)Ln0/i;
    .locals 0

    invoke-direct {p0}, Lx/h;->i2()Ln0/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic W1(Lx/h;)Z
    .locals 0

    iget-boolean p0, p0, Lx/h;->R:Z

    return p0
.end method

.method public static final synthetic X1(Lx/h;)Lx/C;
    .locals 0

    iget-object p0, p0, Lx/h;->Q:Lx/C;

    return-object p0
.end method

.method public static final synthetic Y1(Lx/h;)Z
    .locals 0

    iget-boolean p0, p0, Lx/h;->X:Z

    return p0
.end method

.method public static final synthetic Z1(Lx/h;)Z
    .locals 0

    iget-boolean p0, p0, Lx/h;->Z:Z

    return p0
.end method

.method public static final synthetic a2(Lx/h;)V
    .locals 0

    invoke-direct {p0}, Lx/h;->m2()V

    return-void
.end method

.method public static final synthetic b2(Lx/h;Z)V
    .locals 0

    iput-boolean p1, p0, Lx/h;->Z:Z

    return-void
.end method

.method public static final synthetic c2(Lx/h;Z)V
    .locals 0

    iput-boolean p1, p0, Lx/h;->X:Z

    return-void
.end method

.method private final d2(Lx/f;)F
    .locals 5

    .prologue
    iget-wide v0, p0, Lx/h;->Y:J

    sget-object v2, LY0/t;->b:LY0/t$a;

    invoke-virtual {v2}, LY0/t$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/t;->e(JJ)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0}, Lx/h;->h2()Ln0/i;

    move-result-object v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lx/h;->X:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lx/h;->i2()Ln0/i;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-wide v1, p0, Lx/h;->Y:J

    invoke-static {v1, v2}, LY0/u;->d(J)J

    move-result-wide v1

    iget-object v3, p0, Lx/h;->P:Lx/s;

    sget-object v4, Lx/h$b;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_4

    const/4 v4, 0x2

    if-ne v3, v4, :cond_3

    invoke-virtual {v0}, Ln0/i;->i()F

    move-result v3

    invoke-virtual {v0}, Ln0/i;->j()F

    move-result v4

    invoke-virtual {v0}, Ln0/i;->i()F

    move-result v0

    sub-float/2addr v4, v0

    invoke-static {v1, v2}, Ln0/m;->i(J)F

    move-result v0

    :goto_1
    invoke-interface {p1, v3, v4, v0}, Lx/f;->a(FFF)F

    move-result p1

    goto :goto_2

    :cond_3
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_4
    invoke-virtual {v0}, Ln0/i;->l()F

    move-result v3

    invoke-virtual {v0}, Ln0/i;->e()F

    move-result v4

    invoke-virtual {v0}, Ln0/i;->l()F

    move-result v0

    sub-float/2addr v4, v0

    invoke-static {v1, v2}, Ln0/m;->g(J)F

    move-result v0

    goto :goto_1

    :goto_2
    return p1
.end method

.method private final e2(JJ)I
    .locals 2

    .prologue
    iget-object v0, p0, Lx/h;->P:Lx/s;

    sget-object v1, Lx/h$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, LY0/t;->g(J)I

    move-result p1

    invoke-static {p3, p4}, LY0/t;->g(J)I

    move-result p2

    :goto_0
    invoke-static {p1, p2}, Ly7/t;->g(II)I

    move-result p1

    goto :goto_1

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    invoke-static {p1, p2}, LY0/t;->f(J)I

    move-result p1

    invoke-static {p3, p4}, LY0/t;->f(J)I

    move-result p2

    goto :goto_0

    :goto_1
    return p1
.end method

.method private final f2(JJ)I
    .locals 2

    .prologue
    iget-object v0, p0, Lx/h;->P:Lx/s;

    sget-object v1, Lx/h$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, Ln0/m;->i(J)F

    move-result p1

    invoke-static {p3, p4}, Ln0/m;->i(J)F

    move-result p2

    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    goto :goto_1

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    invoke-static {p1, p2}, Ln0/m;->g(J)F

    move-result p1

    invoke-static {p3, p4}, Ln0/m;->g(J)F

    move-result p2

    goto :goto_0

    :goto_1
    return p1
.end method

.method private final g2(Ln0/i;J)Ln0/i;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lx/h;->o2(Ln0/i;J)J

    move-result-wide p2

    invoke-static {p2, p3}, Ln0/g;->u(J)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ln0/i;->t(J)Ln0/i;

    move-result-object p1

    return-object p1
.end method

.method private final h2()Ln0/i;
    .locals 8

    .prologue
    iget-object v0, p0, Lx/h;->U:Lx/d;

    invoke-static {v0}, Lx/d;->a(Lx/d;)LX/b;

    move-result-object v0

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_4

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    :cond_0
    aget-object v3, v0, v1

    check-cast v3, Lx/h$a;

    invoke-virtual {v3}, Lx/h$a;->b()Lx7/a;

    move-result-object v3

    invoke-interface {v3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln0/i;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ln0/i;->k()J

    move-result-wide v4

    iget-wide v6, p0, Lx/h;->Y:J

    invoke-static {v6, v7}, LY0/u;->d(J)J

    move-result-wide v6

    invoke-direct {p0, v4, v5, v6, v7}, Lx/h;->f2(JJ)I

    move-result v4

    if-gtz v4, :cond_1

    move-object v2, v3

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    move-object v2, v3

    :cond_2
    return-object v2

    :cond_3
    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-gez v1, :cond_0

    :cond_4
    return-object v2
.end method

.method private final i2()Ln0/i;
    .locals 4

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {p0}, LF0/k;->k(LF0/j;)LD0/t;

    move-result-object v0

    iget-object v2, p0, Lx/h;->V:LD0/t;

    if-eqz v2, :cond_3

    invoke-interface {v2}, LD0/t;->K()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    invoke-interface {v0, v2, v1}, LD0/t;->N(LD0/t;Z)Ln0/i;

    move-result-object v0

    return-object v0

    :cond_3
    :goto_1
    return-object v1
.end method

.method private final k2(Ln0/i;J)Z
    .locals 1

    .prologue
    invoke-direct {p0, p1, p2, p3}, Lx/h;->o2(Ln0/i;J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    const/high16 v0, 0x3f000000    # 0.5f

    cmpg-float p3, p3, v0

    if-gtz p3, :cond_0

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method static synthetic l2(Lx/h;Ln0/i;JILjava/lang/Object;)Z
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    iget-wide p2, p0, Lx/h;->Y:J

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lx/h;->k2(Ln0/i;J)Z

    move-result p0

    return p0
.end method

.method private final m2()V
    .locals 9

    .prologue
    invoke-direct {p0}, Lx/h;->p2()Lx/f;

    move-result-object v0

    iget-boolean v1, p0, Lx/h;->Z:Z

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    new-instance v1, Lx/I;

    invoke-interface {v0}, Lx/f;->b()Lu/j;

    move-result-object v2

    invoke-direct {v1, v2}, Lx/I;-><init>(Lu/j;)V

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v3

    sget-object v5, LW8/P;->F:LW8/P;

    new-instance v6, Lx/h$c;

    const/4 v2, 0x0

    invoke-direct {v6, p0, v1, v0, v2}, Lx/h$c;-><init>(Lx/h;Lx/I;Lx/f;Lm7/e;)V

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v8}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "launchAnimation called when previous animation was running"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final o2(Ln0/i;J)J
    .locals 4

    .prologue
    invoke-static {p2, p3}, LY0/u;->d(J)J

    move-result-wide p2

    iget-object v0, p0, Lx/h;->P:Lx/s;

    sget-object v1, Lx/h$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lx/h;->p2()Lx/f;

    move-result-object v0

    invoke-virtual {p1}, Ln0/i;->i()F

    move-result v1

    invoke-virtual {p1}, Ln0/i;->j()F

    move-result v3

    invoke-virtual {p1}, Ln0/i;->i()F

    move-result p1

    sub-float/2addr v3, p1

    invoke-static {p2, p3}, Ln0/m;->i(J)F

    move-result p1

    invoke-interface {v0, v1, v3, p1}, Lx/f;->a(FFF)F

    move-result p1

    invoke-static {p1, v2}, Ln0/h;->a(FF)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0}, Lx/h;->p2()Lx/f;

    move-result-object v0

    invoke-virtual {p1}, Ln0/i;->l()F

    move-result v1

    invoke-virtual {p1}, Ln0/i;->e()F

    move-result v3

    invoke-virtual {p1}, Ln0/i;->l()F

    move-result p1

    sub-float/2addr v3, p1

    invoke-static {p2, p3}, Ln0/m;->g(J)F

    move-result p1

    invoke-interface {v0, v1, v3, p1}, Lx/f;->a(FFF)F

    move-result p1

    invoke-static {v2, p1}, Ln0/h;->a(FF)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method private final p2()Lx/f;
    .locals 1

    .prologue
    iget-object v0, p0, Lx/h;->S:Lx/f;

    if-nez v0, :cond_0

    invoke-static {}, Lx/g;->a()LV/O0;

    move-result-object v0

    invoke-static {p0, v0}, LF0/i;->a(LF0/h;LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx/f;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public M(J)V
    .locals 5

    .prologue
    iget-wide v0, p0, Lx/h;->Y:J

    iput-wide p1, p0, Lx/h;->Y:J

    invoke-direct {p0, p1, p2, v0, v1}, Lx/h;->e2(JJ)I

    move-result v2

    if-ltz v2, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lx/h;->i2()Ln0/i;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v3, p0, Lx/h;->W:Ln0/i;

    if-nez v3, :cond_1

    move-object v3, v2

    :cond_1
    iget-boolean v4, p0, Lx/h;->Z:Z

    if-nez v4, :cond_2

    iget-boolean v4, p0, Lx/h;->X:Z

    if-nez v4, :cond_2

    invoke-direct {p0, v3, v0, v1}, Lx/h;->k2(Ln0/i;J)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, v2, p1, p2}, Lx/h;->k2(Ln0/i;J)Z

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx/h;->X:Z

    invoke-direct {p0}, Lx/h;->m2()V

    :cond_2
    iput-object v2, p0, Lx/h;->W:Ln0/i;

    :cond_3
    return-void
.end method

.method public T(Ln0/i;)Ln0/i;
    .locals 4

    .prologue
    iget-wide v0, p0, Lx/h;->Y:J

    sget-object v2, LY0/t;->b:LY0/t$a;

    invoke-virtual {v2}, LY0/t$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/t;->e(JJ)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lx/h;->Y:J

    invoke-direct {p0, p1, v0, v1}, Lx/h;->g2(Ln0/i;J)Ln0/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Expected BringIntoViewRequester to not be used before parents are placed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public Z(Lx7/a;Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ln0/i;

    if-eqz v2, :cond_3

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lx/h;->l2(Lx/h;Ln0/i;JILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, LW8/n;

    invoke-static {p2}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v0}, LW8/n;->E()V

    new-instance v1, Lx/h$a;

    invoke-direct {v1, p1, v0}, Lx/h$a;-><init>(Lx7/a;LW8/l;)V

    invoke-static {p0}, Lx/h;->U1(Lx/h;)Lx/d;

    move-result-object p1

    invoke-virtual {p1, v1}, Lx/d;->c(Lx/h$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Lx/h;->Z1(Lx/h;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p0}, Lx/h;->a2(Lx/h;)V

    :cond_0
    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_1
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final j2()J
    .locals 2

    iget-wide v0, p0, Lx/h;->Y:J

    return-wide v0
.end method

.method public synthetic m1(LD0/t;)V
    .locals 0

    invoke-static {p0, p1}, LF0/B;->a(LF0/C;LD0/t;)V

    return-void
.end method

.method public final n2(LD0/t;)V
    .locals 0

    iput-object p1, p0, Lx/h;->V:LD0/t;

    return-void
.end method

.method public final q2(Lx/s;ZLx/f;)V
    .locals 0

    iput-object p1, p0, Lx/h;->P:Lx/s;

    iput-boolean p2, p0, Lx/h;->R:Z

    iput-object p3, p0, Lx/h;->S:Lx/f;

    return-void
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Lx/h;->T:Z

    return v0
.end method
