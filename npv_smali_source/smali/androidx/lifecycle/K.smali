.class public final Landroidx/lifecycle/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;
.implements Ljava/io/Closeable;


# instance fields
.field private final C:Ljava/lang/String;

.field private final D:Landroidx/lifecycle/I;

.field private E:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroidx/lifecycle/I;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handle"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/K;->C:Ljava/lang/String;

    iput-object p2, p0, Landroidx/lifecycle/K;->D:Landroidx/lifecycle/I;

    return-void
.end method


# virtual methods
.method public final a(Lx2/d;Landroidx/lifecycle/k;)V
    .locals 2

    .prologue
    const-string v0, "registry"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/lifecycle/K;->E:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Landroidx/lifecycle/K;->E:Z

    invoke-virtual {p2, p0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    iget-object p2, p0, Landroidx/lifecycle/K;->C:Ljava/lang/String;

    iget-object v0, p0, Landroidx/lifecycle/K;->D:Landroidx/lifecycle/I;

    invoke-virtual {v0}, Landroidx/lifecycle/I;->c()Lx2/d$c;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lx2/d;->h(Ljava/lang/String;Lx2/d$c;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached to lifecycleOwner"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public i(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 1

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    if-ne p2, v0, :cond_0

    const/4 p2, 0x0

    iput-boolean p2, p0, Landroidx/lifecycle/K;->E:Z

    invoke-interface {p1}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    :cond_0
    return-void
.end method

.method public final r()Landroidx/lifecycle/I;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/K;->D:Landroidx/lifecycle/I;

    return-object v0
.end method

.method public final s()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/lifecycle/K;->E:Z

    return v0
.end method
