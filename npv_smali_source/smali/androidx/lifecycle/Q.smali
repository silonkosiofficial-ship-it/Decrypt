.class public Landroidx/lifecycle/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/Q$a;
    }
.end annotation


# instance fields
.field private final a:Landroidx/lifecycle/t;

.field private final b:Landroid/os/Handler;

.field private c:Landroidx/lifecycle/Q$a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/r;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p1}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/lifecycle/Q;->a:Landroidx/lifecycle/t;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/Q;->b:Landroid/os/Handler;

    return-void
.end method

.method private final f(Landroidx/lifecycle/k$a;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/lifecycle/Q;->c:Landroidx/lifecycle/Q$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/lifecycle/Q$a;->run()V

    :cond_0
    new-instance v0, Landroidx/lifecycle/Q$a;

    iget-object v1, p0, Landroidx/lifecycle/Q;->a:Landroidx/lifecycle/t;

    invoke-direct {v0, v1, p1}, Landroidx/lifecycle/Q$a;-><init>(Landroidx/lifecycle/t;Landroidx/lifecycle/k$a;)V

    iput-object v0, p0, Landroidx/lifecycle/Q;->c:Landroidx/lifecycle/Q$a;

    iget-object p1, p0, Landroidx/lifecycle/Q;->b:Landroid/os/Handler;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/k;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/Q;->a:Landroidx/lifecycle/t;

    return-object v0
.end method

.method public b()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;

    invoke-direct {p0, v0}, Landroidx/lifecycle/Q;->f(Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public c()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/k$a;->ON_CREATE:Landroidx/lifecycle/k$a;

    invoke-direct {p0, v0}, Landroidx/lifecycle/Q;->f(Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public d()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    invoke-direct {p0, v0}, Landroidx/lifecycle/Q;->f(Landroidx/lifecycle/k$a;)V

    sget-object v0, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    invoke-direct {p0, v0}, Landroidx/lifecycle/Q;->f(Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public e()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;

    invoke-direct {p0, v0}, Landroidx/lifecycle/Q;->f(Landroidx/lifecycle/k$a;)V

    return-void
.end method
