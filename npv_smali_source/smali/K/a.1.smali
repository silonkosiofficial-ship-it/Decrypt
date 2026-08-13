.class public final LK/a;
.super LK/q0;
.source "SourceFile"


# instance fields
.field private b:LW8/z0;

.field private c:LK/s0;

.field private d:LZ8/x;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LK/q0;-><init>()V

    return-void
.end method

.method public static final synthetic m(LK/a;)LZ8/x;
    .locals 0

    invoke-direct {p0}, LK/a;->p()LZ8/x;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(LK/a;LK/s0;)V
    .locals 0

    iput-object p1, p0, LK/a;->c:LK/s0;

    return-void
.end method

.method public static final synthetic o(LK/q0$a;[F)V
    .locals 0

    invoke-static {p0, p1}, LK/a;->r(LK/q0$a;[F)V

    return-void
.end method

.method private final p()LZ8/x;
    .locals 5

    .prologue
    iget-object v0, p0, LK/a;->d:LZ8/x;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, LI/c;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    sget-object v0, LY8/d;->E:LY8/d;

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v3, v4, v0, v2, v1}, LZ8/E;->b(IILY8/d;ILjava/lang/Object;)LZ8/x;

    move-result-object v0

    iput-object v0, p0, LK/a;->d:LZ8/x;

    return-object v0
.end method

.method private final q(Lx7/l;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, LK/q0;->i()LK/q0$a;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, LK/a$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v0, v2}, LK/a$b;-><init>(Lx7/l;LK/a;LK/q0$a;Lm7/e;)V

    invoke-interface {v0, v1}, LK/q0$a;->z0(Lx7/p;)LW8/z0;

    move-result-object p1

    iput-object p1, p0, LK/a;->b:LW8/z0;

    return-void
.end method

.method private static final r(LK/q0$a;[F)V
    .locals 1

    .prologue
    invoke-interface {p0}, LK/q0$a;->I0()LD0/t;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0}, LD0/t;->K()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p0, p1}, LD0/t;->M([F)V

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LK/a;->q(Lx7/l;)V

    return-void
.end method

.method public b(LS0/V;LS0/V;)V
    .locals 1

    .prologue
    iget-object v0, p0, LK/a;->c:LK/s0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LK/s0;->m(LS0/V;LS0/V;)V

    :cond_0
    return-void
.end method

.method public d(LS0/V;LS0/L;LM0/K;Lx7/l;Ln0/i;Ln0/i;)V
    .locals 6

    .prologue
    iget-object v0, p0, LK/a;->c:LK/s0;

    if-eqz v0, :cond_0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, LK/s0;->n(LS0/V;LS0/L;LM0/K;Ln0/i;Ln0/i;)V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 3

    .prologue
    iget-object v0, p0, LK/a;->b:LW8/z0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LW8/z0$a;->a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iput-object v1, p0, LK/a;->b:LW8/z0;

    invoke-direct {p0}, LK/a;->p()LZ8/x;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, LZ8/x;->m()V

    :cond_1
    return-void
.end method

.method public f(Ln0/i;)V
    .locals 1

    .prologue
    iget-object v0, p0, LK/a;->c:LK/s0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LK/s0;->j(Ln0/i;)V

    :cond_0
    return-void
.end method

.method public g(LS0/V;LS0/s;Lx7/l;Lx7/l;)V
    .locals 7

    new-instance v6, LK/a$a;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LK/a$a;-><init>(LS0/V;LK/a;LS0/s;Lx7/l;Lx7/l;)V

    invoke-direct {p0, v6}, LK/a;->q(Lx7/l;)V

    return-void
.end method

.method public k()V
    .locals 2

    .prologue
    invoke-direct {p0}, LK/a;->p()LZ8/x;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Li7/M;->a:Li7/M;

    invoke-interface {v0, v1}, LZ8/x;->n(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
