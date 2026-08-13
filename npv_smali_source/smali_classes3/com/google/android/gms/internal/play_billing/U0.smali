.class final Lcom/google/android/gms/internal/play_billing/U0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final C:Lcom/google/android/gms/internal/play_billing/a1;

.field final D:Lcom/google/android/gms/internal/play_billing/x1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/play_billing/a1;Lcom/google/android/gms/internal/play_billing/x1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/U0;->C:Lcom/google/android/gms/internal/play_billing/a1;

    iput-object p2, p0, Lcom/google/android/gms/internal/play_billing/U0;->D:Lcom/google/android/gms/internal/play_billing/x1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/U0;->C:Lcom/google/android/gms/internal/play_billing/a1;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a1;->f(Lcom/google/android/gms/internal/play_billing/a1;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/U0;->D:Lcom/google/android/gms/internal/play_billing/x1;

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/U0;->C:Lcom/google/android/gms/internal/play_billing/a1;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a1;->h(Lcom/google/android/gms/internal/play_billing/x1;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/a1;->b()Lcom/google/android/gms/internal/play_billing/P0;

    move-result-object v2

    invoke-virtual {v2, v1, p0, v0}, Lcom/google/android/gms/internal/play_billing/P0;->f(Lcom/google/android/gms/internal/play_billing/a1;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/U0;->C:Lcom/google/android/gms/internal/play_billing/a1;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/a1;->m(Lcom/google/android/gms/internal/play_billing/a1;Z)V

    :cond_1
    :goto_0
    return-void
.end method
