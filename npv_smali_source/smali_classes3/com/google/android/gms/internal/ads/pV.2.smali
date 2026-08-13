.class public final synthetic Lcom/google/android/gms/internal/ads/pV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/sV;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/R60;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/sV;Lcom/google/android/gms/internal/ads/R60;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pV;->a:Lcom/google/android/gms/internal/ads/sV;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/pV;->b:Lcom/google/android/gms/internal/ads/R60;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pV;->a:Lcom/google/android/gms/internal/ads/sV;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pV;->b:Lcom/google/android/gms/internal/ads/R60;

    check-cast p1, Lcom/google/android/gms/internal/ads/PL;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/sV;->e(Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/PL;)LP4/d;

    move-result-object p1

    return-object p1
.end method
