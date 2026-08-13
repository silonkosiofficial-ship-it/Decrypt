.class public final Lb9/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW8/V0;


# instance fields
.field private final C:Ljava/lang/Object;

.field private final D:Ljava/lang/ThreadLocal;

.field private final E:Lm7/i$c;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/L;->C:Ljava/lang/Object;

    iput-object p2, p0, Lb9/L;->D:Ljava/lang/ThreadLocal;

    new-instance p1, Lb9/M;

    invoke-direct {p1, p2}, Lb9/M;-><init>(Ljava/lang/ThreadLocal;)V

    iput-object p1, p0, Lb9/L;->E:Lm7/i$c;

    return-void
.end method


# virtual methods
.method public D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LW8/V0$a;->a(LW8/V0;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public P0(Lm7/i;)Ljava/lang/Object;
    .locals 2

    iget-object p1, p0, Lb9/L;->D:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lb9/L;->D:Ljava/lang/ThreadLocal;

    iget-object v1, p0, Lb9/L;->C:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object p1
.end method

.method public c1(Lm7/i;Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lb9/L;->D:Ljava/lang/ThreadLocal;

    invoke-virtual {p1, p2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public getKey()Lm7/i$c;
    .locals 1

    iget-object v0, p0, Lb9/L;->E:Lm7/i$c;

    return-object v0
.end method

.method public i(Lm7/i$c;)Lm7/i$b;
    .locals 1

    .prologue
    invoke-virtual {p0}, Lb9/L;->getKey()Lm7/i$c;

    move-result-object v0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get"

    invoke-static {p0, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p1, p0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public o0(Lm7/i;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, LW8/V0$a;->b(LW8/V0;Lm7/i;)Lm7/i;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ThreadLocal(value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb9/L;->C:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", threadLocal = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb9/L;->D:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public y0(Lm7/i$c;)Lm7/i;
    .locals 1

    .prologue
    invoke-virtual {p0}, Lb9/L;->getKey()Lm7/i$c;

    move-result-object v0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lm7/j;->C:Lm7/j;

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    return-object p1
.end method
