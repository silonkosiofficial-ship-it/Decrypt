.class final Landroidx/core/app/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field C:Ljava/lang/Object;

.field private D:Landroid/app/Activity;

.field private final E:I

.field private F:Z

.field private G:Z

.field private H:Z


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/core/app/d$d;->F:Z

    iput-boolean v0, p0, Landroidx/core/app/d$d;->G:Z

    iput-boolean v0, p0, Landroidx/core/app/d$d;->H:Z

    iput-object p1, p0, Landroidx/core/app/d$d;->D:Landroid/app/Activity;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iput p1, p0, Landroidx/core/app/d$d;->E:I

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/core/app/d$d;->D:Landroid/app/Activity;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/core/app/d$d;->D:Landroid/app/Activity;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/core/app/d$d;->G:Z

    :cond_0
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    .prologue
    iget-boolean v0, p0, Landroidx/core/app/d$d;->G:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/core/app/d$d;->H:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/core/app/d$d;->F:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/core/app/d$d;->C:Ljava/lang/Object;

    iget v1, p0, Landroidx/core/app/d$d;->E:I

    invoke-static {v0, v1, p1}, Landroidx/core/app/d;->h(Ljava/lang/Object;ILandroid/app/Activity;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/core/app/d$d;->H:Z

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/core/app/d$d;->C:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/core/app/d$d;->D:Landroid/app/Activity;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/core/app/d$d;->F:Z

    :cond_0
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
