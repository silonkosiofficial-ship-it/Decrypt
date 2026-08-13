.class final Lf4/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field private final C:Landroid/app/Activity;

.field final synthetic D:Lf4/D;


# direct methods
.method public constructor <init>(Lf4/D;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lf4/z;->D:Lf4/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf4/z;->C:Landroid/app/Activity;

    return-void
.end method

.method static bridge synthetic a(Lf4/z;)V
    .locals 0

    invoke-direct {p0}, Lf4/z;->b()V

    return-void
.end method

.method private final b()V
    .locals 1

    iget-object v0, p0, Lf4/z;->D:Lf4/D;

    invoke-static {v0}, Lf4/D;->b(Lf4/D;)Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    iget-object p2, p0, Lf4/z;->D:Lf4/D;

    invoke-static {p2}, Lf4/D;->c(Lf4/D;)Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-boolean v0, p2, Lf4/D;->l:Z

    if-eqz v0, :cond_2

    invoke-static {p2}, Lf4/D;->c(Lf4/D;)Landroid/app/Dialog;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    iget-object p2, p0, Lf4/z;->D:Lf4/D;

    invoke-static {p2}, Lf4/D;->e(Lf4/D;)Lf4/Z;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lf4/D;->e(Lf4/D;)Lf4/Z;

    move-result-object p2

    invoke-virtual {p2, p1}, Lf4/Z;->a(Landroid/app/Activity;)V

    :cond_0
    iget-object p2, p0, Lf4/z;->D:Lf4/D;

    invoke-static {p2}, Lf4/D;->f(Lf4/D;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lf4/z;

    if-eqz p2, :cond_1

    invoke-direct {p2}, Lf4/z;->b()V

    iget-object p2, p0, Lf4/z;->D:Lf4/D;

    new-instance v0, Lf4/z;

    invoke-direct {v0, p2, p1}, Lf4/z;-><init>(Lf4/D;Landroid/app/Activity;)V

    invoke-static {p2}, Lf4/D;->b(Lf4/D;)Landroid/app/Application;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object p1, p0, Lf4/z;->D:Lf4/D;

    invoke-static {p1}, Lf4/D;->f(Lf4/D;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Lf4/z;->D:Lf4/D;

    invoke-static {p1}, Lf4/D;->c(Lf4/D;)Landroid/app/Dialog;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-static {p1}, Lf4/D;->c(Lf4/D;)Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_2
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lf4/z;->C:Landroid/app/Activity;

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lf4/z;->D:Lf4/D;

    iget-boolean v0, p1, Lf4/D;->l:Z

    if-eqz v0, :cond_1

    invoke-static {p1}, Lf4/D;->c(Lf4/D;)Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lf4/D;->c(Lf4/D;)Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void

    :cond_1
    iget-object p1, p0, Lf4/z;->D:Lf4/D;

    new-instance v0, Lf4/Z0;

    const/4 v1, 0x3

    const-string v2, "Activity is destroyed."

    invoke-direct {v0, v1, v2}, Lf4/Z0;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1, v0}, Lf4/D;->i(Lf4/Z0;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
