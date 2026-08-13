.class public final synthetic Lcom/google/android/gms/internal/ads/Ix;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Kx;

.field public final synthetic D:Ljava/lang/Throwable;

.field public final synthetic E:Lcom/google/android/gms/internal/ads/La0;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:Lw3/w;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Kx;Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/La0;Ljava/lang/String;Lw3/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ix;->C:Lcom/google/android/gms/internal/ads/Kx;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ix;->D:Ljava/lang/Throwable;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Ix;->E:Lcom/google/android/gms/internal/ads/La0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Ix;->F:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/Ix;->G:Lw3/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->ia:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ix;->C:Lcom/google/android/gms/internal/ads/Kx;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Ix;->D:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/Kx;->d:Lcom/google/android/gms/internal/ads/Lx;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Lx;->a(Lcom/google/android/gms/internal/ads/Lx;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/lo;->e(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v3

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/Lx;->i:Lcom/google/android/gms/internal/ads/no;

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/Kx;->d:Lcom/google/android/gms/internal/ads/Lx;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Lx;->i:Lcom/google/android/gms/internal/ads/no;

    const-string v1, "AttributionReporting.registerSourceAndPingClickUrl"

    :goto_0
    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/no;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/Kx;->d:Lcom/google/android/gms/internal/ads/Lx;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Lx;->a(Lcom/google/android/gms/internal/ads/Lx;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/lo;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v3

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/Lx;->h:Lcom/google/android/gms/internal/ads/no;

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/Kx;->d:Lcom/google/android/gms/internal/ads/Lx;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Lx;->h:Lcom/google/android/gms/internal/ads/no;

    const-string v1, "AttributionReportingSampled.registerSourceAndPingClickUrl"

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ix;->G:Lw3/w;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ix;->F:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Ix;->E:Lcom/google/android/gms/internal/ads/La0;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v0, v3}, Lcom/google/android/gms/internal/ads/La0;->d(Ljava/lang/String;Lw3/w;Lcom/google/android/gms/internal/ads/Q90;)V

    return-void
.end method
