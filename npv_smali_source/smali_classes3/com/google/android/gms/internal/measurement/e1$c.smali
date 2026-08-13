.class final Lcom/google/android/gms/internal/measurement/e1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/e1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/measurement/e1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/e1$c;->C:Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/e1$c;->C:Lcom/google/android/gms/internal/measurement/e1;

    new-instance v1, Lcom/google/android/gms/internal/measurement/B1;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/android/gms/internal/measurement/B1;-><init>(Lcom/google/android/gms/internal/measurement/e1$c;Landroid/os/Bundle;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/e1;->o(Lcom/google/android/gms/internal/measurement/e1;Lcom/google/android/gms/internal/measurement/e1$a;)V

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/e1$c;->C:Lcom/google/android/gms/internal/measurement/e1;

    new-instance v1, Lcom/google/android/gms/internal/measurement/G1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/G1;-><init>(Lcom/google/android/gms/internal/measurement/e1$c;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/e1;->o(Lcom/google/android/gms/internal/measurement/e1;Lcom/google/android/gms/internal/measurement/e1$a;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/e1$c;->C:Lcom/google/android/gms/internal/measurement/e1;

    new-instance v1, Lcom/google/android/gms/internal/measurement/F1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/F1;-><init>(Lcom/google/android/gms/internal/measurement/e1$c;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/e1;->o(Lcom/google/android/gms/internal/measurement/e1;Lcom/google/android/gms/internal/measurement/e1$a;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/e1$c;->C:Lcom/google/android/gms/internal/measurement/e1;

    new-instance v1, Lcom/google/android/gms/internal/measurement/C1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/C1;-><init>(Lcom/google/android/gms/internal/measurement/e1$c;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/e1;->o(Lcom/google/android/gms/internal/measurement/e1;Lcom/google/android/gms/internal/measurement/e1$a;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/measurement/Q0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/Q0;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/e1$c;->C:Lcom/google/android/gms/internal/measurement/e1;

    new-instance v2, Lcom/google/android/gms/internal/measurement/H1;

    invoke-direct {v2, p0, p1, v0}, Lcom/google/android/gms/internal/measurement/H1;-><init>(Lcom/google/android/gms/internal/measurement/e1$c;Landroid/app/Activity;Lcom/google/android/gms/internal/measurement/Q0;)V

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/e1;->o(Lcom/google/android/gms/internal/measurement/e1;Lcom/google/android/gms/internal/measurement/e1$a;)V

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/Q0;->y0(J)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/e1$c;->C:Lcom/google/android/gms/internal/measurement/e1;

    new-instance v1, Lcom/google/android/gms/internal/measurement/D1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/D1;-><init>(Lcom/google/android/gms/internal/measurement/e1$c;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/e1;->o(Lcom/google/android/gms/internal/measurement/e1;Lcom/google/android/gms/internal/measurement/e1$a;)V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/e1$c;->C:Lcom/google/android/gms/internal/measurement/e1;

    new-instance v1, Lcom/google/android/gms/internal/measurement/E1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/E1;-><init>(Lcom/google/android/gms/internal/measurement/e1$c;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/e1;->o(Lcom/google/android/gms/internal/measurement/e1;Lcom/google/android/gms/internal/measurement/e1$a;)V

    return-void
.end method
