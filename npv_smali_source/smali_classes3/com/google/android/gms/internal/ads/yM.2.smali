.class public final synthetic Lcom/google/android/gms/internal/ads/yM;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/gj;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/AM;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/Ot;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/AM;Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yM;->a:Lcom/google/android/gms/internal/ads/AM;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/yM;->b:Lcom/google/android/gms/internal/ads/Ot;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yM;->a:Lcom/google/android/gms/internal/ads/AM;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yM;->b:Lcom/google/android/gms/internal/ads/Ot;

    check-cast p1, Lcom/google/android/gms/internal/ads/Ot;

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/internal/ads/AM;->g(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/Ot;Ljava/util/Map;)V

    return-void
.end method
