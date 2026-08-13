.class public final Lu/g0;
.super Lu/v0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu/g0$a;,
        Lu/g0$b;
    }
.end annotation


# static fields
.field private static final r:Lu/g0$a;

.field public static final s:I

.field private static final t:Lu/n;

.field private static final u:Lu/n;


# instance fields
.field private final b:LV/w0;

.field private final c:LV/w0;

.field private d:Ljava/lang/Object;

.field private e:Lu/s0;

.field private f:J

.field private final g:Lx7/a;

.field private final h:LV/q0;

.field private i:LW8/l;

.field private final j:Lf9/a;

.field private final k:Lu/d0;

.field private l:J

.field private final m:Lr/I;

.field private n:Lu/g0$b;

.field private final o:Lx7/l;

.field private p:F

.field private final q:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu/g0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu/g0$a;-><init>(Ly7/k;)V

    sput-object v0, Lu/g0;->r:Lu/g0$a;

    const/16 v0, 0x8

    sput v0, Lu/g0;->s:I

    new-instance v0, Lu/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu/n;-><init>(F)V

    sput-object v0, Lu/g0;->t:Lu/n;

    new-instance v0, Lu/n;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1}, Lu/n;-><init>(F)V

    sput-object v0, Lu/g0;->u:Lu/n;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 4

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu/v0;-><init>(Ly7/k;)V

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v2

    iput-object v2, p0, Lu/g0;->b:LV/w0;

    invoke-static {p1, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v1

    iput-object v1, p0, Lu/g0;->c:LV/w0;

    iput-object p1, p0, Lu/g0;->d:Ljava/lang/Object;

    new-instance p1, Lu/g0$f;

    invoke-direct {p1, p0}, Lu/g0$f;-><init>(Lu/g0;)V

    iput-object p1, p0, Lu/g0;->g:Lx7/a;

    const/4 p1, 0x0

    invoke-static {p1}, LV/J0;->a(F)LV/q0;

    move-result-object p1

    iput-object p1, p0, Lu/g0;->h:LV/q0;

    const/4 p1, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lf9/g;->b(ZILjava/lang/Object;)Lf9/a;

    move-result-object v2

    iput-object v2, p0, Lu/g0;->j:Lf9/a;

    new-instance v2, Lu/d0;

    invoke-direct {v2}, Lu/d0;-><init>()V

    iput-object v2, p0, Lu/g0;->k:Lu/d0;

    const-wide/high16 v2, -0x8000000000000000L

    iput-wide v2, p0, Lu/g0;->l:J

    new-instance v2, Lr/I;

    invoke-direct {v2, p1, v1, v0}, Lr/I;-><init>(IILy7/k;)V

    iput-object v2, p0, Lu/g0;->m:Lr/I;

    new-instance p1, Lu/g0$e;

    invoke-direct {p1, p0}, Lu/g0$e;-><init>(Lu/g0;)V

    iput-object p1, p0, Lu/g0;->o:Lx7/l;

    new-instance p1, Lu/g0$c;

    invoke-direct {p1, p0}, Lu/g0$c;-><init>(Lu/g0;)V

    iput-object p1, p0, Lu/g0;->q:Lx7/l;

    return-void
.end method

.method public static synthetic B(Lu/g0;Ljava/lang/Object;Lu/I;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    invoke-virtual {p0}, Lu/g0;->b()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lu/g0;->A(Ljava/lang/Object;Lu/I;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final C(Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    iget-wide v0, p0, Lu/g0;->l:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-object v0, p0, Lu/g0;->o:Lx7/l;

    invoke-static {v0, p1}, LV/l0;->c(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_1
    invoke-direct {p0, p1}, Lu/g0;->z(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method private final D()V
    .locals 1

    .prologue
    iget-object v0, p0, Lu/g0;->e:Lu/s0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu/s0;->g()V

    :cond_0
    iget-object v0, p0, Lu/g0;->m:Lr/I;

    invoke-virtual {v0}, Lr/I;->h()V

    iget-object v0, p0, Lu/g0;->n:Lu/g0$b;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lu/g0;->n:Lu/g0$b;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lu/g0;->S(F)V

    invoke-direct {p0}, Lu/g0;->P()V

    :cond_1
    return-void
.end method

.method private final J()V
    .locals 9

    .prologue
    iget-object v0, p0, Lu/g0;->e:Lu/s0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lu/g0;->n:Lu/g0$b;

    const/4 v2, 0x0

    if-nez v1, :cond_4

    iget-wide v3, p0, Lu/g0;->f:J

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-lez v1, :cond_3

    invoke-virtual {p0}, Lu/g0;->H()F

    move-result v1

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v3

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lu/g0;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lu/g0;->b()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Lu/g0$b;

    invoke-direct {v1}, Lu/g0$b;-><init>()V

    invoke-virtual {p0}, Lu/g0;->H()F

    move-result v3

    invoke-virtual {v1, v3}, Lu/g0$b;->o(F)V

    iget-wide v3, p0, Lu/g0;->f:J

    invoke-virtual {v1, v3, v4}, Lu/g0$b;->l(J)V

    long-to-double v3, v3

    invoke-virtual {p0}, Lu/g0;->H()F

    move-result v5

    float-to-double v5, v5

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v7, v5

    mul-double/2addr v3, v7

    invoke-static {v3, v4}, LA7/a;->e(D)J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lu/g0$b;->j(J)V

    invoke-virtual {v1}, Lu/g0$b;->f()Lu/n;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {p0}, Lu/g0;->H()F

    move-result v5

    invoke-virtual {v3, v4, v5}, Lu/n;->e(IF)V

    goto :goto_1

    :cond_3
    :goto_0
    move-object v1, v2

    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    iget-wide v3, p0, Lu/g0;->f:J

    invoke-virtual {v1, v3, v4}, Lu/g0$b;->l(J)V

    iget-object v3, p0, Lu/g0;->m:Lr/I;

    invoke-virtual {v3, v1}, Lr/I;->g(Ljava/lang/Object;)Z

    invoke-virtual {v0, v1}, Lu/s0;->I(Lu/g0$b;)V

    :cond_5
    iput-object v2, p0, Lu/g0;->n:Lu/g0$b;

    return-void
.end method

.method private final M(Lu/g0$b;J)V
    .locals 8

    .prologue
    invoke-virtual {p1}, Lu/g0$b;->e()J

    move-result-wide v0

    add-long v3, v0, p2

    invoke-virtual {p1, v3, v4}, Lu/g0$b;->n(J)V

    invoke-virtual {p1}, Lu/g0$b;->b()J

    move-result-wide p2

    cmp-long v0, v3, p2

    const/high16 v1, 0x3f800000    # 1.0f

    if-ltz v0, :cond_0

    invoke-virtual {p1, v1}, Lu/g0$b;->o(F)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lu/g0$b;->a()Lu/B0;

    move-result-object v2

    const/4 v0, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lu/g0$b;->f()Lu/n;

    move-result-object v5

    sget-object v6, Lu/g0;->u:Lu/n;

    invoke-virtual {p1}, Lu/g0$b;->d()Lu/n;

    move-result-object p2

    if-nez p2, :cond_1

    sget-object p2, Lu/g0;->t:Lu/n;

    :cond_1
    move-object v7, p2

    invoke-interface/range {v2 .. v7}, Lu/B0;->c(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p2

    check-cast p2, Lu/n;

    invoke-virtual {p2, v0}, Lu/n;->a(I)F

    move-result p2

    const/4 p3, 0x0

    invoke-static {p2, p3, v1}, LE7/j;->j(FFF)F

    move-result p2

    :goto_0
    invoke-virtual {p1, p2}, Lu/g0$b;->o(F)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lu/g0$b;->f()Lu/n;

    move-result-object v2

    invoke-virtual {v2, v0}, Lu/n;->a(I)F

    move-result v0

    long-to-float v2, v3

    long-to-float p2, p2

    div-float/2addr v2, p2

    invoke-static {v0, v1, v2}, Lu/z0;->k(FFF)F

    move-result p2

    goto :goto_0

    :goto_1
    return-void
.end method

.method private final N(Lm7/e;)Ljava/lang/Object;
    .locals 9

    .prologue
    instance-of v0, p1, Lu/g0$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lu/g0$g;

    iget v1, v0, Lu/g0$g;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu/g0$g;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu/g0$g;

    invoke-direct {v0, p0, p1}, Lu/g0$g;-><init>(Lu/g0;Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lu/g0$g;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lu/g0$g;->I:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const-wide/high16 v5, -0x8000000000000000L

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iget-object v2, v0, Lu/g0$g;->F:Ljava/lang/Object;

    check-cast v2, Lu/g0;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lu/g0;->m:Lr/I;

    invoke-virtual {p1}, Lr/P;->c()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lu/g0;->n:Lu/g0$b;

    if-nez p1, :cond_4

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_4
    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object p1

    invoke-static {p1}, Lu/q0;->n(Lm7/i;)F

    move-result p1

    const/4 v2, 0x0

    cmpg-float p1, p1, v2

    if-nez p1, :cond_5

    invoke-direct {p0}, Lu/g0;->D()V

    iput-wide v5, p0, Lu/g0;->l:J

    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_5
    iget-wide v7, p0, Lu/g0;->l:J

    cmp-long p1, v7, v5

    if-nez p1, :cond_6

    iget-object p1, p0, Lu/g0;->o:Lx7/l;

    iput-object p0, v0, Lu/g0$g;->F:Ljava/lang/Object;

    iput v4, v0, Lu/g0$g;->I:I

    invoke-static {p1, v0}, LV/l0;->c(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object v2, p0

    :cond_7
    :goto_3
    iget-object p1, v2, Lu/g0;->m:Lr/I;

    invoke-virtual {p1}, Lr/P;->d()Z

    move-result p1

    if-nez p1, :cond_9

    iget-object p1, v2, Lu/g0;->n:Lu/g0$b;

    if-eqz p1, :cond_8

    goto :goto_4

    :cond_8
    iput-wide v5, v2, Lu/g0;->l:J

    goto :goto_2

    :cond_9
    :goto_4
    iput-object v2, v0, Lu/g0$g;->F:Ljava/lang/Object;

    iput v3, v0, Lu/g0$g;->I:I

    invoke-direct {v2, v0}, Lu/g0;->z(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1
.end method

.method private final P()V
    .locals 5

    .prologue
    iget-object v0, p0, Lu/g0;->e:Lu/s0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lu/g0;->H()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v0}, Lu/s0;->q()J

    move-result-wide v3

    long-to-double v3, v3

    mul-double/2addr v1, v3

    invoke-static {v1, v2}, LA7/a;->e(D)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lu/s0;->H(J)V

    return-void
.end method

.method private final S(F)V
    .locals 1

    iget-object v0, p0, Lu/g0;->h:LV/q0;

    invoke-interface {v0, p1}, LV/q0;->h(F)V

    return-void
.end method

.method private final V(Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p1, Lu/g0$i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lu/g0$i;

    iget v1, v0, Lu/g0$i;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu/g0$i;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu/g0$i;

    invoke-direct {v0, p0, p1}, Lu/g0$i;-><init>(Lu/g0;Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lu/g0$i;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lu/g0$i;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lu/g0$i;->G:Ljava/lang/Object;

    iget-object v0, v0, Lu/g0$i;->F:Ljava/lang/Object;

    check-cast v0, Lu/g0;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lu/g0$i;->G:Ljava/lang/Object;

    iget-object v6, v0, Lu/g0$i;->F:Ljava/lang/Object;

    check-cast v6, Lu/g0;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_1

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lu/g0;->b()Ljava/lang/Object;

    move-result-object p1

    iget-object v2, p0, Lu/g0;->j:Lf9/a;

    iput-object p0, v0, Lu/g0$i;->F:Ljava/lang/Object;

    iput-object p1, v0, Lu/g0$i;->G:Ljava/lang/Object;

    iput v5, v0, Lu/g0$i;->J:I

    invoke-static {v2, v4, v0, v5, v4}, Lf9/a$a;->a(Lf9/a;Ljava/lang/Object;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v6, p0

    :goto_1
    iput-object v6, v0, Lu/g0$i;->F:Ljava/lang/Object;

    iput-object p1, v0, Lu/g0$i;->G:Ljava/lang/Object;

    iput v3, v0, Lu/g0$i;->J:I

    new-instance v2, LW8/n;

    invoke-static {v0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v3

    invoke-direct {v2, v3, v5}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v2}, LW8/n;->E()V

    invoke-virtual {v6, v2}, Lu/g0;->R(LW8/l;)V

    invoke-virtual {v6}, Lu/g0;->G()Lf9/a;

    move-result-object v3

    invoke-static {v3, v4, v5, v4}, Lf9/a$a;->c(Lf9/a;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v2}, LW8/n;->x()Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_5

    invoke-static {v0}, Lo7/h;->c(Lm7/e;)V

    :cond_5
    if-ne v2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v1, p1

    move-object p1, v2

    move-object v0, v6

    :goto_2
    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_7
    const-wide/high16 v1, -0x8000000000000000L

    iput-wide v1, v0, Lu/g0;->l:J

    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string v0, "targetState while waiting for composition"

    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final W(Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p1, Lu/g0$j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lu/g0$j;

    iget v1, v0, Lu/g0$j;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu/g0$j;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu/g0$j;

    invoke-direct {v0, p0, p1}, Lu/g0$j;-><init>(Lu/g0;Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lu/g0$j;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lu/g0$j;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lu/g0$j;->G:Ljava/lang/Object;

    iget-object v0, v0, Lu/g0$j;->F:Ljava/lang/Object;

    check-cast v0, Lu/g0;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lu/g0$j;->G:Ljava/lang/Object;

    iget-object v6, v0, Lu/g0$j;->F:Ljava/lang/Object;

    check-cast v6, Lu/g0;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_1

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lu/g0;->b()Ljava/lang/Object;

    move-result-object p1

    iget-object v2, p0, Lu/g0;->j:Lf9/a;

    iput-object p0, v0, Lu/g0$j;->F:Ljava/lang/Object;

    iput-object p1, v0, Lu/g0$j;->G:Ljava/lang/Object;

    iput v5, v0, Lu/g0$j;->J:I

    invoke-static {v2, v4, v0, v5, v4}, Lf9/a$a;->a(Lf9/a;Ljava/lang/Object;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v6, p0

    :goto_1
    iget-object v2, v6, Lu/g0;->d:Ljava/lang/Object;

    invoke-static {p1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object p1, v6, Lu/g0;->j:Lf9/a;

    invoke-static {p1, v4, v5, v4}, Lf9/a$a;->c(Lf9/a;Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_3

    :cond_5
    iput-object v6, v0, Lu/g0$j;->F:Ljava/lang/Object;

    iput-object p1, v0, Lu/g0$j;->G:Ljava/lang/Object;

    iput v3, v0, Lu/g0$j;->J:I

    new-instance v2, LW8/n;

    invoke-static {v0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v3

    invoke-direct {v2, v3, v5}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v2}, LW8/n;->E()V

    invoke-virtual {v6, v2}, Lu/g0;->R(LW8/l;)V

    invoke-virtual {v6}, Lu/g0;->G()Lf9/a;

    move-result-object v3

    invoke-static {v3, v4, v5, v4}, Lf9/a$a;->c(Lf9/a;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v2}, LW8/n;->x()Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_6

    invoke-static {v0}, Lo7/h;->c(Lm7/e;)V

    :cond_6
    if-ne v2, v1, :cond_7

    return-object v1

    :cond_7
    move-object v1, p1

    move-object p1, v2

    move-object v0, v6

    :goto_2
    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    :goto_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_8
    const-wide/high16 v2, -0x8000000000000000L

    iput-wide v2, v0, Lu/g0;->l:J

    new-instance v0, Ljava/util/concurrent/CancellationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "snapTo() was canceled because state was changed to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " instead of "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic h(Lu/g0;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lu/g0;->C(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i()Lu/g0$a;
    .locals 1

    sget-object v0, Lu/g0;->r:Lu/g0$a;

    return-object v0
.end method

.method public static final synthetic j(Lu/g0;)Lu/g0$b;
    .locals 0

    iget-object p0, p0, Lu/g0;->n:Lu/g0$b;

    return-object p0
.end method

.method public static final synthetic k(Lu/g0;)F
    .locals 0

    iget p0, p0, Lu/g0;->p:F

    return p0
.end method

.method public static final synthetic l(Lu/g0;)Lr/I;
    .locals 0

    iget-object p0, p0, Lu/g0;->m:Lr/I;

    return-object p0
.end method

.method public static final synthetic m(Lu/g0;)J
    .locals 2

    iget-wide v0, p0, Lu/g0;->l:J

    return-wide v0
.end method

.method public static final synthetic n()Lu/n;
    .locals 1

    sget-object v0, Lu/g0;->u:Lu/n;

    return-object v0
.end method

.method public static final synthetic o(Lu/g0;)Lu/s0;
    .locals 0

    iget-object p0, p0, Lu/g0;->e:Lu/s0;

    return-object p0
.end method

.method public static final synthetic p()Lu/n;
    .locals 1

    sget-object v0, Lu/g0;->t:Lu/n;

    return-object v0
.end method

.method public static final synthetic q(Lu/g0;)V
    .locals 0

    invoke-direct {p0}, Lu/g0;->J()V

    return-void
.end method

.method public static final synthetic r(Lu/g0;Lu/g0$b;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu/g0;->M(Lu/g0$b;J)V

    return-void
.end method

.method public static final synthetic s(Lu/g0;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lu/g0;->N(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t(Lu/g0;)V
    .locals 0

    invoke-direct {p0}, Lu/g0;->P()V

    return-void
.end method

.method public static final synthetic u(Lu/g0;Lu/g0$b;)V
    .locals 0

    iput-object p1, p0, Lu/g0;->n:Lu/g0$b;

    return-void
.end method

.method public static final synthetic v(Lu/g0;F)V
    .locals 0

    invoke-direct {p0, p1}, Lu/g0;->S(F)V

    return-void
.end method

.method public static final synthetic w(Lu/g0;J)V
    .locals 0

    iput-wide p1, p0, Lu/g0;->l:J

    return-void
.end method

.method public static final synthetic x(Lu/g0;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lu/g0;->V(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y(Lu/g0;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lu/g0;->W(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final z(Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-interface {p1}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    invoke-static {v0}, Lu/q0;->n(Lm7/i;)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-gtz v1, :cond_0

    invoke-direct {p0}, Lu/g0;->D()V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    iput v0, p0, Lu/g0;->p:F

    iget-object v0, p0, Lu/g0;->q:Lx7/l;

    invoke-static {v0, p1}, LV/l0;->c(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method


# virtual methods
.method public final A(Ljava/lang/Object;Lu/I;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    iget-object v1, p0, Lu/g0;->e:Lu/s0;

    if-nez v1, :cond_0

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    iget-object v6, p0, Lu/g0;->k:Lu/d0;

    new-instance v7, Lu/g0$d;

    const/4 v5, 0x0

    move-object v0, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lu/g0$d;-><init>(Lu/s0;Lu/g0;Ljava/lang/Object;Lu/I;Lm7/e;)V

    const/4 v4, 0x1

    const/4 v1, 0x0

    move-object v0, v6

    move-object v2, v7

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lu/d0;->e(Lu/d0;Lu/a0;Lx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final E()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/g0;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public final F()LW8/l;
    .locals 1

    iget-object v0, p0, Lu/g0;->i:LW8/l;

    return-object v0
.end method

.method public final G()Lf9/a;
    .locals 1

    iget-object v0, p0, Lu/g0;->j:Lf9/a;

    return-object v0
.end method

.method public final H()F
    .locals 1

    iget-object v0, p0, Lu/g0;->h:LV/q0;

    invoke-interface {v0}, LV/S;->b()F

    move-result v0

    return v0
.end method

.method public final I()J
    .locals 2

    iget-wide v0, p0, Lu/g0;->f:J

    return-wide v0
.end method

.method public final K()V
    .locals 3

    invoke-static {}, Lu/u0;->e()Lf0/u;

    move-result-object v0

    invoke-static {}, Lu/u0;->a()Lx7/l;

    move-result-object v1

    iget-object v2, p0, Lu/g0;->g:Lx7/a;

    invoke-virtual {v0, p0, v1, v2}, Lf0/u;->o(Ljava/lang/Object;Lx7/l;Lx7/a;)V

    return-void
.end method

.method public final L()V
    .locals 5

    .prologue
    iget-wide v0, p0, Lu/g0;->f:J

    invoke-virtual {p0}, Lu/g0;->K()V

    iget-wide v2, p0, Lu/g0;->f:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu/g0;->n:Lu/g0$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v2, v3}, Lu/g0$b;->l(J)V

    invoke-virtual {v0}, Lu/g0$b;->a()Lu/B0;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lu/g0$b;->f()Lu/n;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lu/n;->a(I)F

    move-result v1

    float-to-double v1, v1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v3, v1

    iget-wide v1, p0, Lu/g0;->f:J

    long-to-double v1, v1

    mul-double/2addr v3, v1

    invoke-static {v3, v4}, LA7/a;->e(D)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lu/g0$b;->j(J)V

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lu/g0;->P()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final O(FLjava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 12

    .prologue
    const/4 v0, 0x0

    cmpg-float v0, v0, p1

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expecting fraction between 0 and 1. Got "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu/e0;->a(Ljava/lang/String;)V

    :cond_1
    iget-object v5, p0, Lu/g0;->e:Lu/s0;

    if-nez v5, :cond_2

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lu/g0;->b()Ljava/lang/Object;

    move-result-object v3

    iget-object v0, p0, Lu/g0;->k:Lu/d0;

    new-instance v8, Lu/g0$h;

    const/4 v7, 0x0

    move-object v1, v8

    move-object v2, p2

    move-object v4, p0

    move v6, p1

    invoke-direct/range {v1 .. v7}, Lu/g0$h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lu/g0;Lu/s0;FLm7/e;)V

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v6, v0

    move-object v9, p3

    invoke-static/range {v6 .. v11}, Lu/d0;->e(Lu/d0;Lu/a0;Lx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final Q(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lu/g0;->d:Ljava/lang/Object;

    return-void
.end method

.method public final R(LW8/l;)V
    .locals 0

    iput-object p1, p0, Lu/g0;->i:LW8/l;

    return-void
.end method

.method public T(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lu/g0;->b:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final U(J)V
    .locals 0

    iput-wide p1, p0, Lu/g0;->f:J

    return-void
.end method

.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/g0;->c:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/g0;->b:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lu/g0;->c:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public f(Lu/s0;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lu/g0;->e:Lu/s0;

    if-eqz v0, :cond_1

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An instance of SeekableTransitionState has been used in different Transitions. Previous instance: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu/g0;->e:Lu/s0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", new instance: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu/e0;->b(Ljava/lang/String;)V

    :cond_2
    iput-object p1, p0, Lu/g0;->e:Lu/s0;

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lu/g0;->e:Lu/s0;

    invoke-static {}, Lu/u0;->e()Lf0/u;

    move-result-object v0

    invoke-virtual {v0, p0}, Lf0/u;->k(Ljava/lang/Object;)V

    return-void
.end method
