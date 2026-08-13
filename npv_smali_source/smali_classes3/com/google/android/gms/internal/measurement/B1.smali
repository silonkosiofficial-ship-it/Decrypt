.class final Lcom/google/android/gms/internal/measurement/B1;
.super Lcom/google/android/gms/internal/measurement/e1$a;
.source "SourceFile"


# instance fields
.field private final synthetic G:Landroid/os/Bundle;

.field private final synthetic H:Landroid/app/Activity;

.field private final synthetic I:Lcom/google/android/gms/internal/measurement/e1$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1$c;Landroid/os/Bundle;Landroid/app/Activity;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/B1;->G:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/B1;->H:Landroid/app/Activity;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/B1;->I:Lcom/google/android/gms/internal/measurement/e1$c;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/e1$c;->C:Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/e1$a;-><init>(Lcom/google/android/gms/internal/measurement/e1;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/B1;->G:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/B1;->G:Landroid/os/Bundle;

    const-string v2, "com.google.app_measurement.screen_service"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/B1;->G:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Landroid/os/Bundle;

    if-eqz v3, :cond_1

    check-cast v1, Landroid/os/Bundle;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/B1;->I:Lcom/google/android/gms/internal/measurement/e1$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/e1$c;->C:Lcom/google/android/gms/internal/measurement/e1;

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/e1;->e(Lcom/google/android/gms/internal/measurement/e1;)Lcom/google/android/gms/internal/measurement/P0;

    move-result-object v1

    invoke-static {v1}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/P0;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/B1;->H:Landroid/app/Activity;

    invoke-static {v2}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v2

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/e1$a;->D:J

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/google/android/gms/internal/measurement/P0;->onActivityCreated(LX3/a;Landroid/os/Bundle;J)V

    return-void
.end method
