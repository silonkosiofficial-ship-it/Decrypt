.class final Lcom/google/android/gms/measurement/internal/Z4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic C:Z

.field private final synthetic D:Lcom/google/android/gms/measurement/internal/M5;

.field private final synthetic E:Z

.field private final synthetic F:Lcom/google/android/gms/measurement/internal/e;

.field private final synthetic G:Lcom/google/android/gms/measurement/internal/e;

.field private final synthetic H:Lcom/google/android/gms/measurement/internal/F4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/F4;ZLcom/google/android/gms/measurement/internal/M5;ZLcom/google/android/gms/measurement/internal/e;Lcom/google/android/gms/measurement/internal/e;)V
    .locals 0

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/google/android/gms/measurement/internal/Z4;->C:Z

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/Z4;->D:Lcom/google/android/gms/measurement/internal/M5;

    iput-boolean p4, p0, Lcom/google/android/gms/measurement/internal/Z4;->E:Z

    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/Z4;->F:Lcom/google/android/gms/measurement/internal/e;

    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/Z4;->G:Lcom/google/android/gms/measurement/internal/e;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/Z4;->H:Lcom/google/android/gms/measurement/internal/F4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/Z4;->H:Lcom/google/android/gms/measurement/internal/F4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/F4;->B(Lcom/google/android/gms/measurement/internal/F4;)Li4/f;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/Z4;->H:Lcom/google/android/gms/measurement/internal/F4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/w3;->j()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/n2;->G()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v0

    const-string v1, "Discarding data. Failed to send conditional user property to service"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/p2;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/Z4;->C:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/Z4;->D:Lcom/google/android/gms/measurement/internal/M5;

    invoke-static {v1}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/Z4;->H:Lcom/google/android/gms/measurement/internal/F4;

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/Z4;->E:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/Z4;->F:Lcom/google/android/gms/measurement/internal/e;

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/Z4;->D:Lcom/google/android/gms/measurement/internal/M5;

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/measurement/internal/F4;->O(Li4/f;LR3/a;Lcom/google/android/gms/measurement/internal/M5;)V

    goto :goto_2

    :cond_2
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/Z4;->G:Lcom/google/android/gms/measurement/internal/e;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/e;->C:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/Z4;->D:Lcom/google/android/gms/measurement/internal/M5;

    invoke-static {v1}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/Z4;->F:Lcom/google/android/gms/measurement/internal/e;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/Z4;->D:Lcom/google/android/gms/measurement/internal/M5;

    invoke-interface {v0, v1, v2}, Li4/f;->w2(Lcom/google/android/gms/measurement/internal/e;Lcom/google/android/gms/measurement/internal/M5;)V

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/Z4;->F:Lcom/google/android/gms/measurement/internal/e;

    invoke-interface {v0, v1}, Li4/f;->m3(Lcom/google/android/gms/measurement/internal/e;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/Z4;->H:Lcom/google/android/gms/measurement/internal/F4;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/w3;->j()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/n2;->G()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v1

    const-string v2, "Failed to send conditional user property to the service"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/p2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/Z4;->H:Lcom/google/android/gms/measurement/internal/F4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/F4;->s0(Lcom/google/android/gms/measurement/internal/F4;)V

    return-void
.end method
