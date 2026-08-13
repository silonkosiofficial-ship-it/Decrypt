.class final Lcom/google/android/gms/internal/ads/dq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lv3/s0;


# direct methods
.method constructor <init>(LV3/f;Lv3/s0;Lcom/google/android/gms/internal/ads/pq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dq;->a:Lv3/s0;

    return-void
.end method


# virtual methods
.method public final a(IJ)V
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->D0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq;->a:Lv3/s0;

    invoke-interface {v0}, Lv3/s0;->e()J

    move-result-wide v0

    sub-long v0, p2, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    const-string p1, "Receiving npa decision in the past, ignoring."

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    return-void

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->E0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/dq;->a:Lv3/s0;

    const/4 v0, -0x1

    invoke-interface {p1, v0}, Lv3/s0;->G(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/dq;->a:Lv3/s0;

    invoke-interface {p1, p2, p3}, Lv3/s0;->y(J)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dq;->a:Lv3/s0;

    invoke-interface {v0, p1}, Lv3/s0;->G(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/dq;->a:Lv3/s0;

    invoke-interface {p1, p2, p3}, Lv3/s0;->y(J)V

    return-void
.end method
