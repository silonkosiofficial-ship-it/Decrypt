.class public abstract Landroidx/compose/foundation/gestures/b;
.super LF0/m;
.source "SourceFile"

# interfaces
.implements LF0/v0;
.implements LF0/h;


# instance fields
.field private R:Lx/s;

.field private S:Lx7/l;

.field private T:Z

.field private U:Lz/l;

.field private final V:Lx7/l;

.field private W:LY8/j;

.field private X:Lz/b;

.field private Y:Z

.field private Z:Lz0/W;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/l;ZLz/l;Lx/s;)V
    .locals 0

    invoke-direct {p0}, LF0/m;-><init>()V

    iput-object p4, p0, Landroidx/compose/foundation/gestures/b;->R:Lx/s;

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b;->S:Lx7/l;

    iput-boolean p2, p0, Landroidx/compose/foundation/gestures/b;->T:Z

    iput-object p3, p0, Landroidx/compose/foundation/gestures/b;->U:Lz/l;

    new-instance p1, Landroidx/compose/foundation/gestures/b$a;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/gestures/b$a;-><init>(Landroidx/compose/foundation/gestures/b;)V

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b;->V:Lx7/l;

    return-void
.end method

.method public static final synthetic Z1(Landroidx/compose/foundation/gestures/b;)LY8/j;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/b;->W:LY8/j;

    return-object p0
.end method

.method public static final synthetic a2(Landroidx/compose/foundation/gestures/b;)Lx/s;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/b;->R:Lx/s;

    return-object p0
.end method

.method public static final synthetic b2(Landroidx/compose/foundation/gestures/b;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/gestures/b;->Y:Z

    return p0
.end method

.method public static final synthetic c2(Landroidx/compose/foundation/gestures/b;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/gestures/b;->o2(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d2(Landroidx/compose/foundation/gestures/b;Landroidx/compose/foundation/gestures/a$c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/b;->p2(Landroidx/compose/foundation/gestures/a$c;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e2(Landroidx/compose/foundation/gestures/b;Landroidx/compose/foundation/gestures/a$d;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/b;->q2(Landroidx/compose/foundation/gestures/a$d;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f2(Landroidx/compose/foundation/gestures/b;LY8/j;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b;->W:LY8/j;

    return-void
.end method

.method public static final synthetic g2(Landroidx/compose/foundation/gestures/b;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/b;->s2()V

    return-void
.end method

.method private final l2()Lz0/W;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/gestures/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/gestures/b$b;-><init>(Landroidx/compose/foundation/gestures/b;Lm7/e;)V

    invoke-static {v0}, Lz0/U;->a(Lx7/p;)Lz0/W;

    move-result-object v0

    return-object v0
.end method

.method private final o2(Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p1, Landroidx/compose/foundation/gestures/b$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/gestures/b$c;

    iget v1, v0, Landroidx/compose/foundation/gestures/b$c;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/foundation/gestures/b$c;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/b$c;

    invoke-direct {v0, p0, p1}, Landroidx/compose/foundation/gestures/b$c;-><init>(Landroidx/compose/foundation/gestures/b;Lm7/e;)V

    :goto_0
    iget-object p1, v0, Landroidx/compose/foundation/gestures/b$c;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/foundation/gestures/b$c;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Landroidx/compose/foundation/gestures/b$c;->F:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/foundation/gestures/b;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b;->X:Lz/b;

    if-eqz p1, :cond_4

    iget-object v2, p0, Landroidx/compose/foundation/gestures/b;->U:Lz/l;

    if-eqz v2, :cond_3

    new-instance v4, Lz/a;

    invoke-direct {v4, p1}, Lz/a;-><init>(Lz/b;)V

    iput-object p0, v0, Landroidx/compose/foundation/gestures/b$c;->F:Ljava/lang/Object;

    iput v3, v0, Landroidx/compose/foundation/gestures/b$c;->I:I

    invoke-interface {v2, v4, v0}, Lz/l;->c(Lz/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 p1, 0x0

    iput-object p1, v0, Landroidx/compose/foundation/gestures/b;->X:Lz/b;

    goto :goto_2

    :cond_4
    move-object v0, p0

    :goto_2
    sget-object p1, LY0/A;->b:LY0/A$a;

    invoke-virtual {p1}, LY0/A$a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/compose/foundation/gestures/b;->n2(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method private final p2(Landroidx/compose/foundation/gestures/a$c;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    instance-of v0, p2, Landroidx/compose/foundation/gestures/b$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/compose/foundation/gestures/b$d;

    iget v1, v0, Landroidx/compose/foundation/gestures/b$d;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/foundation/gestures/b$d;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/b$d;

    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/gestures/b$d;-><init>(Landroidx/compose/foundation/gestures/b;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Landroidx/compose/foundation/gestures/b$d;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/foundation/gestures/b$d;->K:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Landroidx/compose/foundation/gestures/b$d;->H:Ljava/lang/Object;

    check-cast p1, Lz/b;

    iget-object v1, v0, Landroidx/compose/foundation/gestures/b$d;->G:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/foundation/gestures/a$c;

    iget-object v0, v0, Landroidx/compose/foundation/gestures/b$d;->F:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/foundation/gestures/b;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Landroidx/compose/foundation/gestures/b$d;->G:Ljava/lang/Object;

    check-cast p1, Landroidx/compose/foundation/gestures/a$c;

    iget-object v2, v0, Landroidx/compose/foundation/gestures/b$d;->F:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/foundation/gestures/b;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/compose/foundation/gestures/b;->X:Lz/b;

    if-eqz p2, :cond_4

    iget-object v2, p0, Landroidx/compose/foundation/gestures/b;->U:Lz/l;

    if-eqz v2, :cond_4

    new-instance v5, Lz/a;

    invoke-direct {v5, p2}, Lz/a;-><init>(Lz/b;)V

    iput-object p0, v0, Landroidx/compose/foundation/gestures/b$d;->F:Ljava/lang/Object;

    iput-object p1, v0, Landroidx/compose/foundation/gestures/b$d;->G:Ljava/lang/Object;

    iput v4, v0, Landroidx/compose/foundation/gestures/b$d;->K:I

    invoke-interface {v2, v5, v0}, Lz/l;->c(Lz/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    new-instance p2, Lz/b;

    invoke-direct {p2}, Lz/b;-><init>()V

    iget-object v4, v2, Landroidx/compose/foundation/gestures/b;->U:Lz/l;

    if-eqz v4, :cond_6

    iput-object v2, v0, Landroidx/compose/foundation/gestures/b$d;->F:Ljava/lang/Object;

    iput-object p1, v0, Landroidx/compose/foundation/gestures/b$d;->G:Ljava/lang/Object;

    iput-object p2, v0, Landroidx/compose/foundation/gestures/b$d;->H:Ljava/lang/Object;

    iput v3, v0, Landroidx/compose/foundation/gestures/b$d;->K:I

    invoke-interface {v4, p2, v0}, Lz/l;->c(Lz/i;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    return-object v1

    :cond_5
    move-object v1, p1

    move-object p1, p2

    move-object v0, v2

    :goto_2
    move-object p2, p1

    move-object v2, v0

    move-object p1, v1

    :cond_6
    iput-object p2, v2, Landroidx/compose/foundation/gestures/b;->X:Lz/b;

    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/a$c;->a()J

    move-result-wide p1

    invoke-virtual {v2, p1, p2}, Landroidx/compose/foundation/gestures/b;->m2(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method private final q2(Landroidx/compose/foundation/gestures/a$d;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, Landroidx/compose/foundation/gestures/b$e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/compose/foundation/gestures/b$e;

    iget v1, v0, Landroidx/compose/foundation/gestures/b$e;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/foundation/gestures/b$e;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/b$e;

    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/gestures/b$e;-><init>(Landroidx/compose/foundation/gestures/b;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Landroidx/compose/foundation/gestures/b$e;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/foundation/gestures/b$e;->J:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Landroidx/compose/foundation/gestures/b$e;->G:Ljava/lang/Object;

    check-cast p1, Landroidx/compose/foundation/gestures/a$d;

    iget-object v0, v0, Landroidx/compose/foundation/gestures/b$e;->F:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/foundation/gestures/b;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/compose/foundation/gestures/b;->X:Lz/b;

    if-eqz p2, :cond_4

    iget-object v2, p0, Landroidx/compose/foundation/gestures/b;->U:Lz/l;

    if-eqz v2, :cond_3

    new-instance v4, Lz/c;

    invoke-direct {v4, p2}, Lz/c;-><init>(Lz/b;)V

    iput-object p0, v0, Landroidx/compose/foundation/gestures/b$e;->F:Ljava/lang/Object;

    iput-object p1, v0, Landroidx/compose/foundation/gestures/b$e;->G:Ljava/lang/Object;

    iput v3, v0, Landroidx/compose/foundation/gestures/b$e;->J:I

    invoke-interface {v2, v4, v0}, Lz/l;->c(Lz/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 p2, 0x0

    iput-object p2, v0, Landroidx/compose/foundation/gestures/b;->X:Lz/b;

    goto :goto_2

    :cond_4
    move-object v0, p0

    :goto_2
    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/a$d;->a()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/gestures/b;->n2(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method private final s2()V
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/foundation/gestures/b;->Y:Z

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v1

    new-instance v4, Landroidx/compose/foundation/gestures/b$f;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Landroidx/compose/foundation/gestures/b$f;-><init>(Landroidx/compose/foundation/gestures/b;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method


# virtual methods
.method public E1()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/foundation/gestures/b;->Y:Z

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->h2()V

    return-void
.end method

.method public synthetic Y0()Z
    .locals 1

    invoke-static {p0}, LF0/u0;->d(LF0/v0;)Z

    move-result v0

    return v0
.end method

.method public synthetic f1()V
    .locals 0

    invoke-static {p0}, LF0/u0;->c(LF0/v0;)V

    return-void
.end method

.method public g0()V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/gestures/b;->Z:Lz0/W;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LF0/v0;->g0()V

    :cond_0
    return-void
.end method

.method public final h2()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/gestures/b;->X:Lz/b;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b;->U:Lz/l;

    if-eqz v1, :cond_0

    new-instance v2, Lz/a;

    invoke-direct {v2, v0}, Lz/a;-><init>(Lz/b;)V

    invoke-interface {v1, v2}, Lz/l;->a(Lz/i;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/gestures/b;->X:Lz/b;

    :cond_1
    return-void
.end method

.method public abstract i2(Lx7/p;Lm7/e;)Ljava/lang/Object;
.end method

.method protected final j2()Lx7/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b;->S:Lx7/l;

    return-object v0
.end method

.method protected final k2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/b;->T:Z

    return v0
.end method

.method public abstract m2(J)V
.end method

.method public synthetic n0()Z
    .locals 1

    invoke-static {p0}, LF0/u0;->a(LF0/v0;)Z

    move-result v0

    return v0
.end method

.method public abstract n2(J)V
.end method

.method public abstract r2()Z
.end method

.method public synthetic t0()V
    .locals 0

    invoke-static {p0}, LF0/u0;->b(LF0/v0;)V

    return-void
.end method

.method public final t2(Lx7/l;ZLz/l;Lx/s;Z)V
    .locals 1

    .prologue
    iput-object p1, p0, Landroidx/compose/foundation/gestures/b;->S:Lx7/l;

    iget-boolean p1, p0, Landroidx/compose/foundation/gestures/b;->T:Z

    const/4 v0, 0x1

    if-eq p1, p2, :cond_2

    iput-boolean p2, p0, Landroidx/compose/foundation/gestures/b;->T:Z

    if-nez p2, :cond_1

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->h2()V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b;->Z:Lz0/W;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LF0/m;->W1(LF0/j;)V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b;->Z:Lz0/W;

    :cond_1
    move p5, v0

    :cond_2
    iget-object p1, p0, Landroidx/compose/foundation/gestures/b;->U:Lz/l;

    invoke-static {p1, p3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->h2()V

    iput-object p3, p0, Landroidx/compose/foundation/gestures/b;->U:Lz/l;

    :cond_3
    iget-object p1, p0, Landroidx/compose/foundation/gestures/b;->R:Lx/s;

    if-eq p1, p4, :cond_4

    iput-object p4, p0, Landroidx/compose/foundation/gestures/b;->R:Lx/s;

    goto :goto_0

    :cond_4
    move v0, p5

    :goto_0
    if-eqz v0, :cond_5

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b;->Z:Lz0/W;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lz0/W;->o1()V

    :cond_5
    return-void
.end method

.method public w0(Lz0/p;Lz0/r;J)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/b;->T:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b;->Z:Lz0/W;

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/b;->l2()Lz0/W;

    move-result-object v0

    invoke-virtual {p0, v0}, LF0/m;->T1(LF0/j;)LF0/j;

    move-result-object v0

    check-cast v0, Lz0/W;

    iput-object v0, p0, Landroidx/compose/foundation/gestures/b;->Z:Lz0/W;

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/gestures/b;->Z:Lz0/W;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3, p4}, LF0/v0;->w0(Lz0/p;Lz0/r;J)V

    :cond_1
    return-void
.end method
