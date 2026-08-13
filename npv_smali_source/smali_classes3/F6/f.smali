.class public abstract LF6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF6/b;


# static fields
.field private static final synthetic F:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private final C:Ljava/lang/String;

.field private final D:Li7/n;

.field private final E:Li7/n;

.field private volatile synthetic closed:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LF6/f;

    const-string v1, "closed"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LF6/f;->F:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "engineName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF6/f;->C:Ljava/lang/String;

    const/4 p1, 0x0

    iput p1, p0, LF6/f;->closed:I

    new-instance p1, LF6/d;

    invoke-direct {p1, p0}, LF6/d;-><init>(LF6/f;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LF6/f;->D:Li7/n;

    new-instance p1, LF6/e;

    invoke-direct {p1, p0}, LF6/e;-><init>(LF6/f;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LF6/f;->E:Li7/n;

    return-void
.end method

.method public static synthetic a(LF6/f;)LW8/J;
    .locals 0

    invoke-static {p0}, LF6/f;->i(LF6/f;)LW8/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LF6/f;)Lm7/i;
    .locals 0

    invoke-static {p0}, LF6/f;->g(LF6/f;)Lm7/i;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LF6/f;)Lm7/i;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, LW6/q;->b(LW8/z0;ILjava/lang/Object;)Lm7/i;

    move-result-object v0

    invoke-virtual {p0}, LF6/f;->o()LW8/J;

    move-result-object v1

    invoke-interface {v0, v1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object v0

    new-instance v1, LW8/M;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p0, p0, LF6/f;->C:Ljava/lang/String;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "-context"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, LW8/M;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p0

    return-object p0
.end method

.method private static final i(LF6/f;)LW8/J;
    .locals 0

    .prologue
    invoke-interface {p0}, LF6/b;->Q()LF6/j;

    move-result-object p0

    invoke-virtual {p0}, LF6/j;->a()LW8/J;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-static {}, LF6/g;->a()LW8/J;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public A0(LC6/c;)V
    .locals 0

    invoke-static {p0, p1}, LF6/b$a;->h(LF6/b;LC6/c;)V

    return-void
.end method

.method public W()Ljava/util/Set;
    .locals 1

    invoke-static {p0}, LF6/b$a;->g(LF6/b;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 3

    .prologue
    sget-object v0, LF6/f;->F:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LF6/f;->getCoroutineContext()Lm7/i;

    move-result-object v0

    sget-object v1, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v0, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    instance-of v1, v0, LW8/y;

    if-eqz v1, :cond_1

    check-cast v0, LW8/y;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-interface {v0}, LW8/y;->K0()Z

    return-void
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, LF6/f;->E:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm7/i;

    return-object v0
.end method

.method public o()LW8/J;
    .locals 1

    iget-object v0, p0, LF6/f;->D:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW8/J;

    return-object v0
.end method
