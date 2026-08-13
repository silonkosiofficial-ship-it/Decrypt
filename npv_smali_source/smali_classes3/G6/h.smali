.class public final LG6/h;
.super LF6/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG6/h$b;
    }
.end annotation


# static fields
.field private static final L:LG6/h$b;

.field private static final M:Li7/n;


# instance fields
.field private final G:LG6/d;

.field private final H:Ljava/util/Set;

.field private final I:Lm7/i;

.field private final J:Lm7/i;

.field private final K:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LG6/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LG6/h$b;-><init>(Ly7/k;)V

    sput-object v0, LG6/h;->L:LG6/h$b;

    new-instance v0, LG6/e;

    invoke-direct {v0}, LG6/e;-><init>()V

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, LG6/h;->M:Li7/n;

    return-void
.end method

.method public constructor <init>(LG6/d;)V
    .locals 4

    const-string v0, "config"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ktor-okhttp"

    invoke-direct {p0, v0}, LF6/f;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LG6/h;->G:LG6/d;

    const/4 p1, 0x3

    new-array p1, p1, [LF6/h;

    sget-object v0, LI6/F;->a:LI6/F;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    sget-object v0, LN6/a;->a:LN6/a;

    const/4 v1, 0x1

    aput-object v0, p1, v1

    sget-object v0, LM6/a;->a:LM6/a;

    const/4 v1, 0x2

    aput-object v0, p1, v1

    invoke-static {p1}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LG6/h;->H:Ljava/util/Set;

    new-instance p1, LG6/h$c;

    invoke-direct {p1, p0}, LG6/h$c;-><init>(Ljava/lang/Object;)V

    new-instance v0, LG6/f;

    invoke-direct {v0}, LG6/f;-><init>()V

    invoke-virtual {p0}, LG6/h;->R0()LG6/d;

    move-result-object v1

    invoke-virtual {v1}, LG6/d;->f()I

    move-result v1

    invoke-static {p1, v0, v1}, LW6/f;->a(Lx7/l;Lx7/l;I)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LG6/h;->K:Ljava/util/Map;

    invoke-super {p0}, LF6/f;->getCoroutineContext()Lm7/i;

    move-result-object p1

    sget-object v0, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p1, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p1, LW8/z0;

    invoke-static {p1}, LW6/q;->a(LW8/z0;)Lm7/i;

    move-result-object p1

    iput-object p1, p0, LG6/h;->I:Lm7/i;

    invoke-super {p0}, LF6/f;->getCoroutineContext()Lm7/i;

    move-result-object v0

    invoke-interface {v0, p1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p1

    iput-object p1, p0, LG6/h;->J:Lm7/i;

    sget-object p1, LW8/t0;->C:LW8/t0;

    invoke-super {p0}, LF6/f;->getCoroutineContext()Lm7/i;

    move-result-object v0

    sget-object v1, LW8/P;->E:LW8/P;

    new-instance v2, LG6/h$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, LG6/h$a;-><init>(LG6/h;Lm7/e;)V

    invoke-static {p1, v0, v1, v2}, LW8/g;->c(LW8/N;Lm7/i;LW8/P;Lx7/p;)LW8/z0;

    return-void
.end method

.method public static synthetic D(LH9/x;)Li7/M;
    .locals 0

    invoke-static {p0}, LG6/h;->r0(LH9/x;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final E0(LH9/C;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    invoke-virtual {p0}, LH9/C;->close()V

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final synthetic H(LG6/h;LI6/G;)LH9/x;
    .locals 0

    invoke-direct {p0, p1}, LG6/h;->y0(LI6/G;)LH9/x;

    move-result-object p0

    return-object p0
.end method

.method private final K0(LH9/x;LH9/z;Lm7/i;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p4, LG6/h$f;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, LG6/h$f;

    iget v1, v0, LG6/h$f;->L:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LG6/h$f;->L:I

    goto :goto_0

    :cond_0
    new-instance v0, LG6/h$f;

    invoke-direct {v0, p0, p4}, LG6/h$f;-><init>(LG6/h;Lm7/e;)V

    :goto_0
    iget-object p4, v0, LG6/h$f;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LG6/h$f;->L:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LG6/h$f;->I:Ljava/lang/Object;

    check-cast p1, LG6/n;

    iget-object p2, v0, LG6/h$f;->H:Ljava/lang/Object;

    check-cast p2, LY6/b;

    iget-object p3, v0, LG6/h$f;->G:Ljava/lang/Object;

    check-cast p3, Lm7/i;

    iget-object v0, v0, LG6/h$f;->F:Ljava/lang/Object;

    check-cast v0, LG6/h;

    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    const/4 p4, 0x0

    invoke-static {p4, v3, p4}, LY6/a;->b(Ljava/lang/Long;ILjava/lang/Object;)LY6/b;

    move-result-object p4

    new-instance v2, LG6/n;

    invoke-direct {v2, p1, p2, p3}, LG6/n;-><init>(LH9/x;LH9/z;Lm7/i;)V

    invoke-virtual {v2}, LG6/n;->e()LW8/v;

    move-result-object p1

    iput-object p0, v0, LG6/h$f;->F:Ljava/lang/Object;

    iput-object p3, v0, LG6/h$f;->G:Ljava/lang/Object;

    iput-object p4, v0, LG6/h$f;->H:Ljava/lang/Object;

    iput-object v2, v0, LG6/h$f;->I:Ljava/lang/Object;

    iput v3, v0, LG6/h$f;->L:I

    invoke-interface {p1, v0}, LW8/V;->d1(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object p2, p4

    move-object p4, p1

    move-object p1, v2

    :goto_1
    check-cast p4, LH9/B;

    invoke-direct {v0, p4, p2, p1, p3}, LG6/h;->q0(LH9/B;LY6/b;Ljava/lang/Object;Lm7/i;)LO6/h;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic N(LG6/h;LH9/x;LH9/z;Lm7/i;LO6/e;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, LG6/h;->z0(LH9/x;LH9/z;Lm7/i;LO6/e;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final P0(LH9/x;LH9/z;Lm7/i;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p4, LG6/h$g;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, LG6/h$g;

    iget v1, v0, LG6/h$g;->L:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LG6/h$g;->L:I

    goto :goto_0

    :cond_0
    new-instance v0, LG6/h$g;

    invoke-direct {v0, p0, p4}, LG6/h$g;-><init>(LG6/h;Lm7/e;)V

    :goto_0
    iget-object p4, v0, LG6/h$g;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LG6/h$g;->L:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LG6/h$g;->I:Ljava/lang/Object;

    check-cast p1, LG6/o;

    iget-object p2, v0, LG6/h$g;->H:Ljava/lang/Object;

    check-cast p2, LY6/b;

    iget-object p3, v0, LG6/h$g;->G:Ljava/lang/Object;

    check-cast p3, Lm7/i;

    iget-object v0, v0, LG6/h$g;->F:Ljava/lang/Object;

    check-cast v0, LG6/h;

    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    const/4 p4, 0x0

    invoke-static {p4, v3, p4}, LY6/a;->b(Ljava/lang/Long;ILjava/lang/Object;)LY6/b;

    move-result-object p4

    new-instance v2, LG6/o;

    invoke-virtual {p0}, LG6/h;->R0()LG6/d;

    move-result-object v4

    invoke-virtual {v4}, LG6/d;->i()LH9/F$a;

    move-result-object v4

    if-nez v4, :cond_3

    move-object v4, p1

    :cond_3
    invoke-direct {v2, p1, v4, p2, p3}, LG6/o;-><init>(LH9/x;LH9/F$a;LH9/z;Lm7/i;)V

    invoke-virtual {v2}, LG6/o;->k()V

    invoke-virtual {v2}, LG6/o;->i()LW8/v;

    move-result-object p1

    iput-object p0, v0, LG6/h$g;->F:Ljava/lang/Object;

    iput-object p3, v0, LG6/h$g;->G:Ljava/lang/Object;

    iput-object p4, v0, LG6/h$g;->H:Ljava/lang/Object;

    iput-object v2, v0, LG6/h$g;->I:Ljava/lang/Object;

    iput v3, v0, LG6/h$g;->L:I

    invoke-interface {p1, v0}, LW8/V;->d1(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p0

    move-object p2, p4

    move-object p4, p1

    move-object p1, v2

    :goto_1
    check-cast p4, LH9/B;

    invoke-direct {v0, p4, p2, p1, p3}, LG6/h;->q0(LH9/B;LY6/b;Ljava/lang/Object;Lm7/i;)LO6/h;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic R(LG6/h;LH9/x;LH9/z;Lm7/i;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LG6/h;->K0(LH9/x;LH9/z;Lm7/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final Y0()LH9/x;
    .locals 1

    new-instance v0, LH9/x$a;

    invoke-direct {v0}, LH9/x$a;-><init>()V

    invoke-virtual {v0}, LH9/x$a;->a()LH9/x;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic e0(LG6/h;LH9/x;LH9/z;Lm7/i;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LG6/h;->P0(LH9/x;LH9/z;Lm7/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g0(LG6/h;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, LG6/h;->K:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic n0()Li7/n;
    .locals 1

    sget-object v0, LG6/h;->M:Li7/n;

    return-object v0
.end method

.method public static final synthetic o0(LG6/h;)Lm7/i;
    .locals 0

    iget-object p0, p0, LG6/h;->I:Lm7/i;

    return-object p0
.end method

.method private final q0(LH9/B;LY6/b;Ljava/lang/Object;Lm7/i;)LO6/h;
    .locals 7

    new-instance v1, LT6/C;

    invoke-virtual {p1}, LH9/B;->o()I

    move-result v0

    invoke-virtual {p1}, LH9/B;->R()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, LT6/C;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1}, LH9/B;->o0()LH9/y;

    move-result-object v0

    invoke-static {v0}, LG6/q;->d(LH9/y;)LT6/B;

    move-result-object v4

    invoke-virtual {p1}, LH9/B;->H()LH9/t;

    move-result-object p1

    invoke-static {p1}, LG6/q;->c(LH9/t;)LT6/p;

    move-result-object v3

    new-instance p1, LO6/h;

    move-object v0, p1

    move-object v2, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, LO6/h;-><init>(LT6/C;LY6/b;LT6/p;LT6/B;Ljava/lang/Object;Lm7/i;)V

    return-object p1
.end method

.method private static final r0(LH9/x;)Li7/M;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static synthetic s()LH9/x;
    .locals 1

    invoke-static {}, LG6/h;->Y0()LH9/x;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic y(LH9/C;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    invoke-static {p0, p1}, LG6/h;->E0(LH9/C;Ljava/lang/Throwable;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private final y0(LI6/G;)LH9/x;
    .locals 2

    .prologue
    invoke-virtual {p0}, LG6/h;->R0()LG6/d;

    move-result-object v0

    invoke-virtual {v0}, LG6/d;->h()LH9/x;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LG6/h;->L:LG6/h$b;

    invoke-virtual {v0}, LG6/h$b;->a()LH9/x;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, LH9/x;->C()LH9/x$a;

    move-result-object v0

    new-instance v1, LH9/p;

    invoke-direct {v1}, LH9/p;-><init>()V

    invoke-virtual {v0, v1}, LH9/x$a;->c(LH9/p;)LH9/x$a;

    invoke-virtual {p0}, LG6/h;->R0()LG6/d;

    move-result-object v1

    invoke-virtual {v1}, LG6/d;->g()Lx7/l;

    move-result-object v1

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, LG6/h;->R0()LG6/d;

    move-result-object v1

    invoke-virtual {v1}, LF6/j;->b()Ljava/net/Proxy;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, LH9/x$a;->L(Ljava/net/Proxy;)LH9/x$a;

    :cond_1
    if-eqz p1, :cond_2

    invoke-static {v0, p1}, LG6/l;->f(LH9/x$a;LI6/G;)LH9/x$a;

    :cond_2
    invoke-virtual {v0}, LH9/x$a;->a()LH9/x;

    move-result-object p1

    return-object p1
.end method

.method private final z0(LH9/x;LH9/z;Lm7/i;LO6/e;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p5, LG6/h$e;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, LG6/h$e;

    iget v1, v0, LG6/h$e;->L:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LG6/h$e;->L:I

    goto :goto_0

    :cond_0
    new-instance v0, LG6/h$e;

    invoke-direct {v0, p0, p5}, LG6/h$e;-><init>(LG6/h;Lm7/e;)V

    :goto_0
    iget-object p5, v0, LG6/h$e;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LG6/h$e;->L:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LG6/h$e;->I:Ljava/lang/Object;

    check-cast p1, LY6/b;

    iget-object p2, v0, LG6/h$e;->H:Ljava/lang/Object;

    move-object p4, p2

    check-cast p4, LO6/e;

    iget-object p2, v0, LG6/h$e;->G:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Lm7/i;

    iget-object p2, v0, LG6/h$e;->F:Ljava/lang/Object;

    check-cast p2, LG6/h;

    invoke-static {p5}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Li7/x;->b(Ljava/lang/Object;)V

    const/4 p5, 0x0

    invoke-static {p5, v3, p5}, LY6/a;->b(Ljava/lang/Long;ILjava/lang/Object;)LY6/b;

    move-result-object p5

    iput-object p0, v0, LG6/h$e;->F:Ljava/lang/Object;

    iput-object p3, v0, LG6/h$e;->G:Ljava/lang/Object;

    iput-object p4, v0, LG6/h$e;->H:Ljava/lang/Object;

    iput-object p5, v0, LG6/h$e;->I:Ljava/lang/Object;

    iput v3, v0, LG6/h$e;->L:I

    invoke-static {p1, p2, p4, p3, v0}, LG6/q;->b(LH9/x;LH9/z;LO6/e;Lm7/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p2, p0

    move-object v4, p5

    move-object p5, p1

    move-object p1, v4

    :goto_1
    check-cast p5, LH9/B;

    invoke-virtual {p5}, LH9/B;->a()LH9/C;

    move-result-object v0

    sget-object v1, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p3, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v1, LW8/z0;

    new-instance v2, LG6/g;

    invoke-direct {v2, v0}, LG6/g;-><init>(LH9/C;)V

    invoke-interface {v1, v2}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LH9/C;->g()LX9/f;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0, p3, p4}, LG6/l;->g(LX9/f;Lm7/i;LO6/e;)Lio/ktor/utils/io/d;

    move-result-object p4

    if-nez p4, :cond_5

    :cond_4
    sget-object p4, Lio/ktor/utils/io/d;->a:Lio/ktor/utils/io/d$a;

    invoke-virtual {p4}, Lio/ktor/utils/io/d$a;->a()Lio/ktor/utils/io/d;

    move-result-object p4

    :cond_5
    invoke-direct {p2, p5, p1, p4, p3}, LG6/h;->q0(LH9/B;LY6/b;Ljava/lang/Object;Lm7/i;)LO6/h;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public bridge synthetic Q()LF6/j;
    .locals 1

    invoke-virtual {p0}, LG6/h;->R0()LG6/d;

    move-result-object v0

    return-object v0
.end method

.method public R0()LG6/d;
    .locals 1

    iget-object v0, p0, LG6/h;->G:LG6/d;

    return-object v0
.end method

.method public W()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LG6/h;->H:Ljava/util/Set;

    return-object v0
.end method

.method public W0(LO6/e;Lm7/e;)Ljava/lang/Object;
    .locals 10

    .prologue
    instance-of v0, p2, LG6/h$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LG6/h$d;

    iget v1, v0, LG6/h$d;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LG6/h$d;->J:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, LG6/h$d;

    invoke-direct {v0, p0, p2}, LG6/h$d;-><init>(LG6/h;Lm7/e;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, LG6/h$d;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, v6, LG6/h$d;->J:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_5

    if-eq v1, v5, :cond_4

    if-eq v1, v4, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_5

    :cond_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_4

    :cond_4
    iget-object p1, v6, LG6/h$d;->G:Ljava/lang/Object;

    check-cast p1, LO6/e;

    iget-object v1, v6, LG6/h$d;->F:Ljava/lang/Object;

    check-cast v1, LG6/h;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    :goto_2
    move-object v5, p1

    goto :goto_3

    :cond_5
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iput-object p0, v6, LG6/h$d;->F:Ljava/lang/Object;

    iput-object p1, v6, LG6/h$d;->G:Ljava/lang/Object;

    iput v5, v6, LG6/h$d;->J:I

    invoke-static {v6}, LF6/t;->c(Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_6

    return-object v0

    :cond_6
    move-object v1, p0

    goto :goto_2

    :goto_3
    move-object p1, p2

    check-cast p1, Lm7/i;

    invoke-static {v5, p1}, LG6/l;->d(LO6/e;Lm7/i;)LH9/z;

    move-result-object p2

    iget-object v7, v1, LG6/h;->K:Ljava/util/Map;

    sget-object v8, LI6/F;->a:LI6/F;

    invoke-virtual {v5, v8}, LO6/e;->c(LF6/h;)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LH9/x;

    if-eqz v7, :cond_c

    invoke-static {v5}, LO6/f;->c(LO6/e;)Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_8

    iput-object v9, v6, LG6/h$d;->F:Ljava/lang/Object;

    iput-object v9, v6, LG6/h$d;->G:Ljava/lang/Object;

    iput v4, v6, LG6/h$d;->J:I

    invoke-direct {v1, v7, p2, p1, v6}, LG6/h;->P0(LH9/x;LH9/z;Lm7/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_7

    return-object v0

    :cond_7
    :goto_4
    return-object p2

    :cond_8
    invoke-static {v5}, LO6/f;->b(LO6/e;)Z

    move-result v4

    iput-object v9, v6, LG6/h$d;->F:Ljava/lang/Object;

    iput-object v9, v6, LG6/h$d;->G:Ljava/lang/Object;

    if-eqz v4, :cond_a

    iput v3, v6, LG6/h$d;->J:I

    invoke-direct {v1, v7, p2, p1, v6}, LG6/h;->K0(LH9/x;LH9/z;Lm7/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_9

    return-object v0

    :cond_9
    :goto_5
    return-object p2

    :cond_a
    iput v2, v6, LG6/h$d;->J:I

    move-object v2, v7

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, LG6/h;->z0(LH9/x;LH9/z;Lm7/i;LO6/e;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_b

    return-object v0

    :cond_b
    :goto_6
    return-object p2

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "OkHttpClient can\'t be constructed because HttpTimeout plugin is not installed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 2

    invoke-super {p0}, LF6/f;->close()V

    iget-object v0, p0, LG6/h;->I:Lm7/i;

    sget-object v1, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v0, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LW8/y;

    invoke-interface {v0}, LW8/y;->K0()Z

    return-void
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, LG6/h;->J:Lm7/i;

    return-object v0
.end method
