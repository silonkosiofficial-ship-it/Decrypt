.class public final LC6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW8/N;
.implements Ljava/io/Closeable;


# static fields
.field private static final synthetic P:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private final C:LF6/b;

.field private final D:LC6/j;

.field private E:Z

.field private final F:LW8/y;

.field private final G:Lm7/i;

.field private final H:LO6/g;

.field private final I:LQ6/f;

.field private final J:LO6/i;

.field private final K:LQ6/b;

.field private final L:LW6/b;

.field private final M:LF6/j;

.field private final N:LS6/b;

.field private final O:LC6/j;

.field private volatile synthetic closed:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LC6/c;

    const-string v1, "closed"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LC6/c;->P:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(LF6/b;LC6/j;)V
    .locals 7

    .prologue
    const-string v0, "engine"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userConfig"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC6/c;->C:LF6/b;

    iput-object p2, p0, LC6/c;->D:LC6/j;

    const/4 v0, 0x0

    iput v0, p0, LC6/c;->closed:I

    invoke-interface {p1}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v1

    sget-object v2, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v1, v2}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v1

    check-cast v1, LW8/z0;

    invoke-static {v1}, LW8/C0;->a(LW8/z0;)LW8/y;

    move-result-object v1

    iput-object v1, p0, LC6/c;->F:LW8/y;

    invoke-interface {p1}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v2

    invoke-interface {v2, v1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object v2

    iput-object v2, p0, LC6/c;->G:Lm7/i;

    new-instance v2, LO6/g;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v2, v0, v3, v4}, LO6/g;-><init>(ZILy7/k;)V

    iput-object v2, p0, LC6/c;->H:LO6/g;

    new-instance v2, LQ6/f;

    invoke-direct {v2, v0, v3, v4}, LQ6/f;-><init>(ZILy7/k;)V

    iput-object v2, p0, LC6/c;->I:LQ6/f;

    new-instance v5, LO6/i;

    invoke-direct {v5, v0, v3, v4}, LO6/i;-><init>(ZILy7/k;)V

    iput-object v5, p0, LC6/c;->J:LO6/i;

    new-instance v6, LQ6/b;

    invoke-direct {v6, v0, v3, v4}, LQ6/b;-><init>(ZILy7/k;)V

    iput-object v6, p0, LC6/c;->K:LQ6/b;

    invoke-static {v3}, LW6/d;->a(Z)LW6/b;

    move-result-object v0

    iput-object v0, p0, LC6/c;->L:LW6/b;

    invoke-interface {p1}, LF6/b;->Q()LF6/j;

    move-result-object v0

    iput-object v0, p0, LC6/c;->M:LF6/j;

    new-instance v0, LS6/b;

    invoke-direct {v0}, LS6/b;-><init>()V

    iput-object v0, p0, LC6/c;->N:LS6/b;

    new-instance v0, LC6/j;

    invoke-direct {v0}, LC6/j;-><init>()V

    iput-object v0, p0, LC6/c;->O:LC6/j;

    iget-boolean v3, p0, LC6/c;->E:Z

    if-eqz v3, :cond_0

    new-instance v3, LC6/a;

    invoke-direct {v3, p0}, LC6/a;-><init>(LC6/c;)V

    invoke-interface {v1, v3}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    :cond_0
    invoke-interface {p1, p0}, LF6/b;->A0(LC6/c;)V

    sget-object p1, LO6/i;->g:LO6/i$a;

    invoke-virtual {p1}, LO6/i$a;->b()La7/i;

    move-result-object p1

    new-instance v1, LC6/c$a;

    invoke-direct {v1, p0, v4}, LC6/c$a;-><init>(LC6/c;Lm7/e;)V

    invoke-virtual {v5, p1, v1}, La7/d;->l(La7/i;Lx7/q;)V

    invoke-static {}, LI6/C;->i()LJ6/b;

    move-result-object p1

    const/4 v1, 0x2

    invoke-static {v0, p1, v4, v1, v4}, LC6/j;->q(LC6/j;LI6/r;Lx7/l;ILjava/lang/Object;)V

    invoke-static {}, LI6/d;->e()LJ6/b;

    move-result-object p1

    invoke-static {v0, p1, v4, v1, v4}, LC6/j;->q(LC6/j;LI6/r;Lx7/l;ILjava/lang/Object;)V

    invoke-static {}, LI6/l;->e()LJ6/b;

    move-result-object p1

    invoke-static {v0, p1, v4, v1, v4}, LC6/j;->q(LC6/j;LI6/r;Lx7/l;ILjava/lang/Object;)V

    invoke-virtual {p2}, LC6/j;->m()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, LC6/b;

    invoke-direct {p1}, LC6/b;-><init>()V

    const-string v3, "DefaultTransformers"

    invoke-virtual {v0, v3, p1}, LC6/j;->p(Ljava/lang/String;Lx7/l;)V

    :cond_1
    sget-object p1, LI6/E;->c:LI6/E$d;

    invoke-static {v0, p1, v4, v1, v4}, LC6/j;->q(LC6/j;LI6/r;Lx7/l;ILjava/lang/Object;)V

    invoke-static {}, LI6/p;->k()LJ6/b;

    move-result-object p1

    invoke-static {v0, p1, v4, v1, v4}, LC6/j;->q(LC6/j;LI6/r;Lx7/l;ILjava/lang/Object;)V

    invoke-virtual {p2}, LC6/j;->l()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LI6/y;->f()LJ6/b;

    move-result-object p1

    invoke-static {v0, p1, v4, v1, v4}, LC6/j;->q(LC6/j;LI6/r;Lx7/l;ILjava/lang/Object;)V

    :cond_2
    invoke-virtual {v0, p2}, LC6/j;->v(LC6/j;)V

    invoke-virtual {p2}, LC6/j;->m()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LI6/v;->i()LJ6/b;

    move-result-object p1

    invoke-static {v0, p1, v4, v1, v4}, LC6/j;->q(LC6/j;LI6/r;Lx7/l;ILjava/lang/Object;)V

    :cond_3
    invoke-static {v0}, LI6/g;->d(LC6/j;)V

    invoke-virtual {v0, p0}, LC6/j;->n(LC6/c;)V

    sget-object p1, LQ6/f;->g:LQ6/f$a;

    invoke-virtual {p1}, LQ6/f$a;->b()La7/i;

    move-result-object p1

    new-instance p2, LC6/c$b;

    invoke-direct {p2, p0, v4}, LC6/c$b;-><init>(LC6/c;Lm7/e;)V

    invoke-virtual {v2, p1, p2}, La7/d;->l(La7/i;Lx7/q;)V

    return-void
.end method

.method public constructor <init>(LF6/b;LC6/j;Z)V
    .locals 1

    const-string v0, "engine"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userConfig"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LC6/c;-><init>(LF6/b;LC6/j;)V

    iput-boolean p3, p0, LC6/c;->E:Z

    return-void
.end method

.method private static final R(LC6/c;)Li7/M;
    .locals 1

    const-string v0, "$this$install"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LI6/h;->d(LC6/c;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static synthetic a(LC6/c;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    invoke-static {p0, p1}, LC6/c;->g(LC6/c;Ljava/lang/Throwable;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LC6/c;)Li7/M;
    .locals 0

    invoke-static {p0}, LC6/c;->R(LC6/c;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LC6/c;Ljava/lang/Throwable;)Li7/M;
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    iget-object p0, p0, LC6/c;->C:LF6/b;

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, v0}, LW8/O;->e(LW8/N;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method


# virtual methods
.method public final D()LO6/g;
    .locals 1

    iget-object v0, p0, LC6/c;->H:LO6/g;

    return-object v0
.end method

.method public final H()LQ6/f;
    .locals 1

    iget-object v0, p0, LC6/c;->I:LQ6/f;

    return-object v0
.end method

.method public final N()LO6/i;
    .locals 1

    iget-object v0, p0, LC6/c;->J:LO6/i;

    return-object v0
.end method

.method public close()V
    .locals 4

    .prologue
    sget-object v0, LC6/c;->P:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LC6/c;->L:LW6/b;

    invoke-static {}, LI6/s;->a()LW6/a;

    move-result-object v1

    invoke-interface {v0, v1}, LW6/b;->b(LW6/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW6/b;

    invoke-interface {v0}, LW6/b;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LW6/a;

    const-string v3, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>"

    invoke-static {v2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2}, LW6/b;->b(LW6/a;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/io/Closeable;

    if-eqz v3, :cond_1

    check-cast v2, Ljava/io/Closeable;

    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LC6/c;->F:LW8/y;

    invoke-interface {v0}, LW8/y;->K0()Z

    iget-boolean v0, p0, LC6/c;->E:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LC6/c;->C:LF6/b;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    :cond_3
    return-void
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, LC6/c;->G:Lm7/i;

    return-object v0
.end method

.method public final i(LO6/d;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p2, LC6/c$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LC6/c$c;

    iget v1, v0, LC6/c$c;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LC6/c$c;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, LC6/c$c;

    invoke-direct {v0, p0, p2}, LC6/c$c;-><init>(LC6/c;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LC6/c$c;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LC6/c$c;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LC6/c;->N:LS6/b;

    invoke-static {}, LR6/a;->a()LS6/a;

    move-result-object v2

    invoke-virtual {p2, v2, p1}, LS6/b;->a(LS6/a;Ljava/lang/Object;)V

    iget-object p2, p0, LC6/c;->H:LO6/g;

    invoke-virtual {p1}, LO6/d;->e()Ljava/lang/Object;

    move-result-object v2

    iput v3, v0, LC6/c$c;->H:I

    invoke-virtual {p2, p1, v2, v0}, La7/d;->d(Ljava/lang/Object;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const-string p1, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall"

    invoke-static {p2, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, LD6/b;

    return-object p2
.end method

.method public final o()LC6/j;
    .locals 1

    iget-object v0, p0, LC6/c;->O:LC6/j;

    return-object v0
.end method

.method public final s()LS6/b;
    .locals 1

    iget-object v0, p0, LC6/c;->N:LS6/b;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HttpClient["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LC6/c;->C:LF6/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x0()LW6/b;
    .locals 1

    iget-object v0, p0, LC6/c;->L:LW6/b;

    return-object v0
.end method

.method public final y()LQ6/b;
    .locals 1

    iget-object v0, p0, LC6/c;->K:LQ6/b;

    return-object v0
.end method
