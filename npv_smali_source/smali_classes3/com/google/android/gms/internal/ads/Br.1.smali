.class final Lcom/google/android/gms/internal/ads/Br;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Ljava/lang/String;

.field final synthetic D:Ljava/lang/String;

.field final synthetic E:Lcom/google/android/gms/internal/ads/Ir;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Ir;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Br;->C:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Br;->D:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Br;->E:Lcom/google/android/gms/internal/ads/Ir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Br;->E:Lcom/google/android/gms/internal/ads/Ir;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Ir;->J(Lcom/google/android/gms/internal/ads/Ir;)Lcom/google/android/gms/internal/ads/Jr;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Br;->C:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Br;->D:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Ir;->J(Lcom/google/android/gms/internal/ads/Ir;)Lcom/google/android/gms/internal/ads/Jr;

    move-result-object v0

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Jr;->q(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
