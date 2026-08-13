.class final Lcom/android/billingclient/api/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/billingclient/api/y;


# instance fields
.field private b:Lcom/google/android/gms/internal/play_billing/j4;

.field private final c:Lcom/android/billingclient/api/B;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/j4;)V
    .locals 1

    new-instance v0, Lcom/android/billingclient/api/B;

    invoke-direct {v0, p1}, Lcom/android/billingclient/api/B;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/android/billingclient/api/A;->c:Lcom/android/billingclient/api/B;

    iput-object p2, p0, Lcom/android/billingclient/api/A;->b:Lcom/google/android/gms/internal/play_billing/j4;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/a4;)V
    .locals 2

    .prologue
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/A4;->I()Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v0

    iget-object v1, p0, Lcom/android/billingclient/api/A;->b:Lcom/google/android/gms/internal/play_billing/j4;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/y4;->u(Lcom/google/android/gms/internal/play_billing/j4;)Lcom/google/android/gms/internal/play_billing/y4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/y4;->t(Lcom/google/android/gms/internal/play_billing/a4;)Lcom/google/android/gms/internal/play_billing/y4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/A4;

    iget-object v0, p0, Lcom/android/billingclient/api/A;->c:Lcom/android/billingclient/api/B;

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/B;->a(Lcom/google/android/gms/internal/play_billing/A4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingLogger"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/play_billing/K4;)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/A4;->I()Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v0

    iget-object v1, p0, Lcom/android/billingclient/api/A;->b:Lcom/google/android/gms/internal/play_billing/j4;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/y4;->u(Lcom/google/android/gms/internal/play_billing/j4;)Lcom/google/android/gms/internal/play_billing/y4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/y4;->w(Lcom/google/android/gms/internal/play_billing/K4;)Lcom/google/android/gms/internal/play_billing/y4;

    iget-object p1, p0, Lcom/android/billingclient/api/A;->c:Lcom/android/billingclient/api/B;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/A4;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/B;->a(Lcom/google/android/gms/internal/play_billing/A4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingLogger"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/play_billing/G4;)V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/A;->c:Lcom/android/billingclient/api/B;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/A4;->I()Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v1

    iget-object v2, p0, Lcom/android/billingclient/api/A;->b:Lcom/google/android/gms/internal/play_billing/j4;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/y4;->u(Lcom/google/android/gms/internal/play_billing/j4;)Lcom/google/android/gms/internal/play_billing/y4;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/y4;->v(Lcom/google/android/gms/internal/play_billing/G4;)Lcom/google/android/gms/internal/play_billing/y4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/A4;

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/B;->a(Lcom/google/android/gms/internal/play_billing/A4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingLogger"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/play_billing/N3;)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/A4;->I()Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v0

    iget-object v1, p0, Lcom/android/billingclient/api/A;->b:Lcom/google/android/gms/internal/play_billing/j4;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/y4;->u(Lcom/google/android/gms/internal/play_billing/j4;)Lcom/google/android/gms/internal/play_billing/y4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/y4;->q(Lcom/google/android/gms/internal/play_billing/N3;)Lcom/google/android/gms/internal/play_billing/y4;

    iget-object p1, p0, Lcom/android/billingclient/api/A;->c:Lcom/android/billingclient/api/B;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/A4;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/B;->a(Lcom/google/android/gms/internal/play_billing/A4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingLogger"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/play_billing/N3;I)V
    .locals 1

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/A;->b:Lcom/google/android/gms/internal/play_billing/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/L2;->n()Lcom/google/android/gms/internal/play_billing/J2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/h4;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/h4;->q(I)Lcom/google/android/gms/internal/play_billing/h4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/j4;

    iput-object p2, p0, Lcom/android/billingclient/api/A;->b:Lcom/google/android/gms/internal/play_billing/j4;

    invoke-virtual {p0, p1}, Lcom/android/billingclient/api/A;->d(Lcom/google/android/gms/internal/play_billing/N3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingLogger"

    const-string v0, "Unable to log."

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final f(Lcom/google/android/gms/internal/play_billing/S3;I)V
    .locals 1

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/A;->b:Lcom/google/android/gms/internal/play_billing/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/L2;->n()Lcom/google/android/gms/internal/play_billing/J2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/h4;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/h4;->q(I)Lcom/google/android/gms/internal/play_billing/h4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/j4;

    iput-object p2, p0, Lcom/android/billingclient/api/A;->b:Lcom/google/android/gms/internal/play_billing/j4;

    invoke-virtual {p0, p1}, Lcom/android/billingclient/api/A;->g(Lcom/google/android/gms/internal/play_billing/S3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingLogger"

    const-string v0, "Unable to log."

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final g(Lcom/google/android/gms/internal/play_billing/S3;)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/A4;->I()Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v0

    iget-object v1, p0, Lcom/android/billingclient/api/A;->b:Lcom/google/android/gms/internal/play_billing/j4;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/y4;->u(Lcom/google/android/gms/internal/play_billing/j4;)Lcom/google/android/gms/internal/play_billing/y4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/y4;->r(Lcom/google/android/gms/internal/play_billing/S3;)Lcom/google/android/gms/internal/play_billing/y4;

    iget-object p1, p0, Lcom/android/billingclient/api/A;->c:Lcom/android/billingclient/api/B;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/A4;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/B;->a(Lcom/google/android/gms/internal/play_billing/A4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingLogger"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
