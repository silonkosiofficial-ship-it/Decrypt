.class final Lcom/google/android/gms/internal/ads/kP;
.super Lcom/google/android/gms/internal/ads/dk;
.source "SourceFile"


# instance fields
.field final synthetic C:Ljava/lang/Object;

.field final synthetic D:Ljava/lang/String;

.field final synthetic E:J

.field final synthetic F:Lcom/google/android/gms/internal/ads/E90;

.field final synthetic G:Lcom/google/android/gms/internal/ads/mr;

.field final synthetic H:Lcom/google/android/gms/internal/ads/pP;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/pP;Ljava/lang/Object;Ljava/lang/String;JLcom/google/android/gms/internal/ads/E90;Lcom/google/android/gms/internal/ads/mr;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/kP;->C:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/kP;->D:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/kP;->E:J

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/kP;->F:Lcom/google/android/gms/internal/ads/E90;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/kP;->G:Lcom/google/android/gms/internal/ads/mr;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kP;->H:Lcom/google/android/gms/internal/ads/pP;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dk;-><init>()V

    return-void
.end method


# virtual methods
.method public final e()V
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kP;->C:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kP;->H:Lcom/google/android/gms/internal/ads/pP;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kP;->D:Ljava/lang/String;

    const-string v3, ""

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v4

    invoke-interface {v4}, LV3/f;->c()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/kP;->E:J

    sub-long/2addr v4, v6

    long-to-int v4, v4

    const/4 v5, 0x1

    invoke-static {v1, v2, v5, v3, v4}, Lcom/google/android/gms/internal/ads/pP;->k(Lcom/google/android/gms/internal/ads/pP;Ljava/lang/String;ZLjava/lang/String;I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kP;->H:Lcom/google/android/gms/internal/ads/pP;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/pP;->d(Lcom/google/android/gms/internal/ads/pP;)Lcom/google/android/gms/internal/ads/qO;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kP;->D:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/qO;->d(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kP;->H:Lcom/google/android/gms/internal/ads/pP;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/pP;->c(Lcom/google/android/gms/internal/ads/pP;)Lcom/google/android/gms/internal/ads/kG;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kP;->D:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/kG;->Z(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kP;->H:Lcom/google/android/gms/internal/ads/pP;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/pP;->e(Lcom/google/android/gms/internal/ads/pP;)Lcom/google/android/gms/internal/ads/T90;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kP;->F:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v2, v5}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/E90;->m()Lcom/google/android/gms/internal/ads/J90;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/T90;->b(Lcom/google/android/gms/internal/ads/J90;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kP;->G:Lcom/google/android/gms/internal/ads/mr;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/mr;->c(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final o(Ljava/lang/String;)V
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kP;->C:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kP;->H:Lcom/google/android/gms/internal/ads/pP;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kP;->D:Ljava/lang/String;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v3

    invoke-interface {v3}, LV3/f;->c()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/kP;->E:J

    sub-long/2addr v3, v5

    long-to-int v3, v3

    const/4 v4, 0x0

    invoke-static {v1, v2, v4, p1, v3}, Lcom/google/android/gms/internal/ads/pP;->k(Lcom/google/android/gms/internal/ads/pP;Ljava/lang/String;ZLjava/lang/String;I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kP;->H:Lcom/google/android/gms/internal/ads/pP;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/pP;->d(Lcom/google/android/gms/internal/ads/pP;)Lcom/google/android/gms/internal/ads/qO;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kP;->D:Ljava/lang/String;

    const-string v3, "error"

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/qO;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kP;->H:Lcom/google/android/gms/internal/ads/pP;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/pP;->c(Lcom/google/android/gms/internal/ads/pP;)Lcom/google/android/gms/internal/ads/kG;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kP;->D:Ljava/lang/String;

    const-string v3, "error"

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/kG;->q(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kP;->H:Lcom/google/android/gms/internal/ads/pP;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/pP;->e(Lcom/google/android/gms/internal/ads/pP;)Lcom/google/android/gms/internal/ads/T90;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kP;->F:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v2, p1}, Lcom/google/android/gms/internal/ads/E90;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v2, v4}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/E90;->m()Lcom/google/android/gms/internal/ads/J90;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/T90;->b(Lcom/google/android/gms/internal/ads/J90;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kP;->G:Lcom/google/android/gms/internal/ads/mr;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/mr;->c(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
