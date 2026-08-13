.class public final Lcom/google/android/gms/internal/ads/PS;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/w90;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/DS;

.field private final D:Lcom/google/android/gms/internal/ads/HS;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/DS;Lcom/google/android/gms/internal/ads/HS;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/PS;->C:Lcom/google/android/gms/internal/ads/DS;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/PS;->D:Lcom/google/android/gms/internal/ads/HS;

    return-void
.end method


# virtual methods
.method public final i(Lcom/google/android/gms/internal/ads/p90;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->b6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/google/android/gms/internal/ads/p90;->G:Lcom/google/android/gms/internal/ads/p90;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/PS;->C:Lcom/google/android/gms/internal/ads/DS;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/DS;->c()J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/PS;->C:Lcom/google/android/gms/internal/ads/DS;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p2

    invoke-interface {p2}, LV3/f;->c()J

    move-result-wide p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/PS;->C:Lcom/google/android/gms/internal/ads/DS;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/DS;->c()J

    move-result-wide v0

    sub-long/2addr p2, v0

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/ads/DS;->f(J)V

    :cond_0
    return-void
.end method

.method public final p(Lcom/google/android/gms/internal/ads/p90;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final w(Lcom/google/android/gms/internal/ads/p90;Ljava/lang/String;)V
    .locals 4

    .prologue
    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->b6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/google/android/gms/internal/ads/p90;->G:Lcom/google/android/gms/internal/ads/p90;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/PS;->C:Lcom/google/android/gms/internal/ads/DS;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/DS;->c()J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/PS;->C:Lcom/google/android/gms/internal/ads/DS;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p2

    invoke-interface {p2}, LV3/f;->c()J

    move-result-wide v0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/PS;->C:Lcom/google/android/gms/internal/ads/DS;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/DS;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/DS;->f(J)V

    :cond_0
    return-void
.end method

.method public final z(Lcom/google/android/gms/internal/ads/p90;Ljava/lang/String;)V
    .locals 2

    .prologue
    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->b6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/ads/p90;->G:Lcom/google/android/gms/internal/ads/p90;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/PS;->C:Lcom/google/android/gms/internal/ads/DS;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p2

    invoke-interface {p2}, LV3/f;->c()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/DS;->g(J)V

    return-void

    :cond_1
    sget-object p2, Lcom/google/android/gms/internal/ads/p90;->d0:Lcom/google/android/gms/internal/ads/p90;

    if-eq p2, p1, :cond_3

    sget-object p2, Lcom/google/android/gms/internal/ads/p90;->F:Lcom/google/android/gms/internal/ads/p90;

    if-ne p2, p1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    return-void

    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/PS;->C:Lcom/google/android/gms/internal/ads/DS;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p2

    invoke-interface {p2}, LV3/f;->c()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/DS;->h(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/PS;->D:Lcom/google/android/gms/internal/ads/HS;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/PS;->C:Lcom/google/android/gms/internal/ads/DS;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/DS;->d()J

    move-result-wide v0

    new-instance p2, Lcom/google/android/gms/internal/ads/GS;

    invoke-direct {p2, p1, v0, v1}, Lcom/google/android/gms/internal/ads/GS;-><init>(Lcom/google/android/gms/internal/ads/HS;J)V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/MS;->b:Lcom/google/android/gms/internal/ads/zS;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zS;->a(Lcom/google/android/gms/internal/ads/Y80;)V

    return-void
.end method
