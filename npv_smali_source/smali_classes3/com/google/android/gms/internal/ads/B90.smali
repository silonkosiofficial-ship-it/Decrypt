.class public final Lcom/google/android/gms/internal/ads/B90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/qG;
.implements Lcom/google/android/gms/internal/ads/VC;
.implements Lcom/google/android/gms/internal/ads/vG;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/Q90;

.field private final D:Lcom/google/android/gms/internal/ads/E90;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Q90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/B90;->C:Lcom/google/android/gms/internal/ads/Q90;

    const/16 p2, 0xd

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/D90;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/E90;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B90;->D:Lcom/google/android/gms/internal/ads/E90;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/vg;->d:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/B90;->C:Lcom/google/android/gms/internal/ads/Q90;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/B90;->D:Lcom/google/android/gms/internal/ads/E90;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    :cond_0
    return-void
.end method

.method public final k()V
    .locals 0

    return-void
.end method

.method public final l()V
    .locals 1

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/vg;->d:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/B90;->D:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/E90;->h()Lcom/google/android/gms/internal/ads/E90;

    :cond_0
    return-void
.end method

.method public final p(Ls3/W0;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/vg;->d:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/B90;->C:Lcom/google/android/gms/internal/ads/Q90;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/B90;->D:Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {p1}, Ls3/W0;->e()Lk3/b;

    move-result-object p1

    invoke-virtual {p1}, Lk3/b;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/E90;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/E90;

    const/4 p1, 0x0

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    :cond_0
    return-void
.end method
