.class public abstract LW8/a;
.super LW8/F0;
.source "SourceFile"

# interfaces
.implements LW8/z0;
.implements Lm7/e;
.implements LW8/N;


# instance fields
.field private final E:Lm7/i;


# direct methods
.method public constructor <init>(Lm7/i;ZZ)V
    .locals 0

    .prologue
    invoke-direct {p0, p3}, LW8/F0;-><init>(Z)V

    if-eqz p2, :cond_0

    sget-object p2, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p1, p2}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p2

    check-cast p2, LW8/z0;

    invoke-virtual {p0, p2}, LW8/F0;->i0(LW8/z0;)V

    :cond_0
    invoke-interface {p1, p0}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p1

    iput-object p1, p0, LW8/a;->E:Lm7/i;

    return-void
.end method


# virtual methods
.method protected final G0(Ljava/lang/Object;)V
    .locals 1

    .prologue
    instance-of v0, p1, LW8/A;

    if-eqz v0, :cond_0

    check-cast p1, LW8/A;

    iget-object v0, p1, LW8/A;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, LW8/A;->a()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, LW8/a;->h1(Ljava/lang/Throwable;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LW8/a;->i1(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method protected I()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LW8/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 1

    invoke-super {p0}, LW8/F0;->f()Z

    move-result v0

    return v0
.end method

.method protected g1(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, LW8/F0;->u(Ljava/lang/Object;)V

    return-void
.end method

.method public final getContext()Lm7/i;
    .locals 1

    iget-object v0, p0, LW8/a;->E:Lm7/i;

    return-object v0
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, LW8/a;->E:Lm7/i;

    return-object v0
.end method

.method public final h0(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LW8/a;->E:Lm7/i;

    invoke-static {v0, p1}, LW8/L;->a(Lm7/i;Ljava/lang/Throwable;)V

    return-void
.end method

.method protected h1(Ljava/lang/Throwable;Z)V
    .locals 0

    return-void
.end method

.method protected i1(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final j1(LW8/P;Ljava/lang/Object;Lx7/p;)V
    .locals 0

    invoke-virtual {p1, p3, p2, p0}, LW8/P;->g(Lx7/p;Ljava/lang/Object;Lm7/e;)V

    return-void
.end method

.method public final t(Ljava/lang/Object;)V
    .locals 1

    .prologue
    invoke-static {p1}, LW8/C;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LW8/F0;->v0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LW8/G0;->b:Lb9/D;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LW8/a;->g1(Ljava/lang/Object;)V

    return-void
.end method

.method public w0()Ljava/lang/String;
    .locals 3

    .prologue
    iget-object v0, p0, LW8/a;->E:Lm7/i;

    invoke-static {v0}, LW8/H;->g(Lm7/i;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, LW8/F0;->w0()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, LW8/F0;->w0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
