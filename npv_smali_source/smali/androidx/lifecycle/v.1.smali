.class public abstract Landroidx/lifecycle/v;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r;


# instance fields
.field private final C:Landroidx/lifecycle/Q;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Landroidx/lifecycle/Q;

    invoke-direct {v0, p0}, Landroidx/lifecycle/Q;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/lifecycle/v;->C:Landroidx/lifecycle/Q;

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/v;->C:Landroidx/lifecycle/Q;

    invoke-virtual {p1}, Landroidx/lifecycle/Q;->b()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/v;->C:Landroidx/lifecycle/Q;

    invoke-virtual {v0}, Landroidx/lifecycle/Q;->c()V

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/v;->C:Landroidx/lifecycle/Q;

    invoke-virtual {v0}, Landroidx/lifecycle/Q;->d()V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/v;->C:Landroidx/lifecycle/Q;

    invoke-virtual {v0}, Landroidx/lifecycle/Q;->e()V

    invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result p1

    return p1
.end method

.method public u()Landroidx/lifecycle/k;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/v;->C:Landroidx/lifecycle/Q;

    invoke-virtual {v0}, Landroidx/lifecycle/Q;->a()Landroidx/lifecycle/k;

    move-result-object v0

    return-object v0
.end method
