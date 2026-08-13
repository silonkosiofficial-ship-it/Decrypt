.class final LZ8/Q;
.super La9/d;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, La9/d;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LZ8/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static final synthetic c(LZ8/Q;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, LZ8/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LZ8/O;

    invoke-virtual {p0, p1}, LZ8/Q;->d(LZ8/O;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)[Lm7/e;
    .locals 0

    check-cast p1, LZ8/O;

    invoke-virtual {p0, p1}, LZ8/Q;->f(LZ8/O;)[Lm7/e;

    move-result-object p1

    return-object p1
.end method

.method public d(LZ8/O;)Z
    .locals 1

    .prologue
    iget-object p1, p0, LZ8/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Lb9/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p0, LZ8/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, LZ8/P;->b()Lb9/D;

    move-result-object v0

    invoke-static {p1, v0}, Lb9/c;->b(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final e(Lm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    new-instance v0, LW8/n;

    invoke-static {p1}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v0}, LW8/n;->E()V

    invoke-static {p0}, LZ8/Q;->c(LZ8/Q;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-static {}, LZ8/P;->b()Lb9/D;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lu/c0;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Li7/w;->D:Li7/w$a;

    sget-object v1, Li7/M;->a:Li7/M;

    invoke-static {v1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-static {p1}, Lo7/h;->c(Lm7/e;)V

    :cond_1
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_2

    return-object v0

    :cond_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public f(LZ8/O;)[Lm7/e;
    .locals 1

    iget-object p1, p0, LZ8/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lb9/c;->b(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V

    sget-object p1, La9/c;->a:[Lm7/e;

    return-object p1
.end method

.method public final g()V
    .locals 4

    .prologue
    iget-object v0, p0, LZ8/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_0
    invoke-static {v0}, Lb9/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-static {}, LZ8/P;->c()Lb9/D;

    move-result-object v2

    if-ne v1, v2, :cond_2

    return-void

    :cond_2
    invoke-static {}, LZ8/P;->b()Lb9/D;

    move-result-object v2

    if-ne v1, v2, :cond_3

    iget-object v2, p0, LZ8/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, LZ8/P;->c()Lb9/D;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lu/c0;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_3
    iget-object v2, p0, LZ8/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, LZ8/P;->b()Lb9/D;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lu/c0;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    check-cast v1, LW8/n;

    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    return-void
.end method

.method public final h()Z
    .locals 2

    .prologue
    iget-object v0, p0, LZ8/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, LZ8/P;->b()Lb9/D;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {}, LZ8/P;->c()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
