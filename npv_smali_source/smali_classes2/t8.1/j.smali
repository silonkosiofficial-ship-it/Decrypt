.class public final Lt8/j;
.super Lt8/g;
.source "SourceFile"


# instance fields
.field private final b:Ln8/b;

.field private final c:Ln8/f;


# direct methods
.method public constructor <init>(Ln8/b;Ln8/f;)V
    .locals 1

    const-string v0, "enumClassId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enumEntryName"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    invoke-direct {p0, v0}, Lt8/g;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lt8/j;->b:Ln8/b;

    iput-object p2, p0, Lt8/j;->c:Ln8/f;

    return-void
.end method


# virtual methods
.method public a(LO7/G;)LF8/E;
    .locals 3

    .prologue
    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt8/j;->b:Ln8/b;

    invoke-static {p1, v0}, LO7/x;->a(LO7/G;Ln8/b;)LO7/e;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-static {p1}, Lr8/f;->A(LO7/m;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, LO7/e;->w()LF8/M;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    sget-object p1, LH8/j;->a1:LH8/j;

    iget-object v0, p0, Lt8/j;->b:Ln8/b;

    invoke-virtual {v0}, Ln8/b;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lt8/j;->c:Ln8/f;

    invoke-virtual {v2}, Ln8/f;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public final c()Ln8/f;
    .locals 1

    iget-object v0, p0, Lt8/j;->c:Ln8/f;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lt8/j;->b:Ln8/b;

    invoke-virtual {v1}, Ln8/b;->j()Ln8/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt8/j;->c:Ln8/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
