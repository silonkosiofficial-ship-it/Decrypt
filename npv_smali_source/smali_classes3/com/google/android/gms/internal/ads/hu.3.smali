.class public final synthetic Lcom/google/android/gms/internal/ads/hu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/ju;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/OT;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ju;Lcom/google/android/gms/internal/ads/OT;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hu;->C:Lcom/google/android/gms/internal/ads/ju;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/hu;->D:Lcom/google/android/gms/internal/ads/OT;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/iu;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hu;->C:Lcom/google/android/gms/internal/ads/ju;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/iu;-><init>(Lcom/google/android/gms/internal/ads/ju;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hu;->D:Lcom/google/android/gms/internal/ads/OT;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/OT;->f(Lcom/google/android/gms/internal/ads/iu;)V

    return-void
.end method
