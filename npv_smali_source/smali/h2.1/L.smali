.class public abstract Lh2/L;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/L$a;,
        Lh2/L$b;
    }
.end annotation


# instance fields
.field private final a:Lh2/p;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh2/p;

    sget-object v1, Lh2/L$c;->D:Lh2/L$c;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lh2/p;-><init>(Lx7/l;Lx7/a;ILy7/k;)V

    iput-object v0, p0, Lh2/L;->a:Lh2/p;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lh2/L;->a:Lh2/p;

    invoke-virtual {v0}, Lh2/p;->a()Z

    move-result v0

    return v0
.end method

.method public abstract b()Z
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract d(Lh2/M;)Ljava/lang/Object;
.end method

.method public final e()V
    .locals 4

    .prologue
    iget-object v0, p0, Lh2/L;->a:Lh2/p;

    invoke-virtual {v0}, Lh2/p;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lh2/K;->a:Lh2/K;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lh2/K;->a(I)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalidated PagingSource "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public abstract f(Lh2/L$a;Lm7/e;)Ljava/lang/Object;
.end method

.method public final g(Lx7/a;)V
    .locals 1

    const-string v0, "onInvalidatedCallback"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh2/L;->a:Lh2/p;

    invoke-virtual {v0, p1}, Lh2/p;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public final h(Lx7/a;)V
    .locals 1

    const-string v0, "onInvalidatedCallback"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh2/L;->a:Lh2/p;

    invoke-virtual {v0, p1}, Lh2/p;->d(Ljava/lang/Object;)V

    return-void
.end method
