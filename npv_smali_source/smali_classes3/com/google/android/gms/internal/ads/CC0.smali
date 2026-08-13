.class public final synthetic Lcom/google/android/gms/internal/ads/CC0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/aK;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/LB0;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/Os;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/Os;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/CC0;->a:Lcom/google/android/gms/internal/ads/LB0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/CC0;->b:Lcom/google/android/gms/internal/ads/Os;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/NB0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CC0;->a:Lcom/google/android/gms/internal/ads/LB0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/CC0;->b:Lcom/google/android/gms/internal/ads/Os;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/NB0;->g(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/Os;)V

    iget p1, v1, Lcom/google/android/gms/internal/ads/Os;->a:I

    return-void
.end method
