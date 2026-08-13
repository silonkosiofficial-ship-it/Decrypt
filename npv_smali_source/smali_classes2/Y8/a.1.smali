.class LY8/a;
.super LY8/k;
.source "SourceFile"

# interfaces
.implements LY8/c;


# direct methods
.method public constructor <init>(Lm7/i;LY8/j;Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, LY8/k;-><init>(Lm7/i;LY8/j;ZZ)V

    sget-object p2, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p1, p2}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    check-cast p1, LW8/z0;

    invoke-virtual {p0, p1}, LW8/F0;->i0(LW8/z0;)V

    return-void
.end method


# virtual methods
.method protected F0(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, LY8/k;->k1()LY8/j;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    instance-of v2, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v2, :cond_0

    move-object v1, p1

    check-cast v1, Ljava/util/concurrent/CancellationException;

    :cond_0
    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LW8/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " was cancelled"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, LW8/o0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    move-object v1, p1

    :cond_1
    invoke-interface {v0, v1}, LY8/B;->o(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method protected f0(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, LW8/a;->getContext()Lm7/i;

    move-result-object v0

    invoke-static {v0, p1}, LW8/L;->a(Lm7/i;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method
