.class public final synthetic Lcom/google/android/gms/internal/ads/ru;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/tu;

.field public final synthetic D:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/tu;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ru;->C:Lcom/google/android/gms/internal/ads/tu;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ru;->D:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ru;->C:Lcom/google/android/gms/internal/ads/tu;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ru;->D:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/tu;->r6(Ljava/util/Map;)V

    return-void
.end method
