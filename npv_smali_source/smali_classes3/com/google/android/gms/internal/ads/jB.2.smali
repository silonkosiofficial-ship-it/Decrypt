.class public final Lcom/google/android/gms/internal/ads/jB;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/yF;
.implements Lcom/google/android/gms/internal/ads/uD;


# instance fields
.field private final C:LV3/f;

.field private final D:Lcom/google/android/gms/internal/ads/lB;

.field private final E:Lcom/google/android/gms/internal/ads/n70;

.field private final F:Ljava/lang/String;


# direct methods
.method constructor <init>(LV3/f;Lcom/google/android/gms/internal/ads/lB;Lcom/google/android/gms/internal/ads/n70;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jB;->C:LV3/f;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/jB;->D:Lcom/google/android/gms/internal/ads/lB;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/jB;->E:Lcom/google/android/gms/internal/ads/n70;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/jB;->F:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jB;->C:LV3/f;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/jB;->D:Lcom/google/android/gms/internal/ads/lB;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/jB;->F:Ljava/lang/String;

    invoke-interface {v0}, LV3/f;->c()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/lB;->e(Ljava/lang/String;J)V

    return-void
.end method

.method public final u()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jB;->C:LV3/f;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/jB;->F:Ljava/lang/String;

    invoke-interface {v0}, LV3/f;->c()J

    move-result-wide v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jB;->E:Lcom/google/android/gms/internal/ads/n70;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/jB;->D:Lcom/google/android/gms/internal/ads/lB;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->f:Ljava/lang/String;

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/lB;->d(Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method
