.class public final synthetic Lcom/google/android/gms/internal/ads/TS;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nd;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/Yd;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Yd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/TS;->a:Lcom/google/android/gms/internal/ads/Yd;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/Xe;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Xe;->I()Lcom/google/android/gms/internal/ads/Qe;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->H()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Pe;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/TS;->a:Lcom/google/android/gms/internal/ads/Yd;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Pe;->A(Lcom/google/android/gms/internal/ads/Yd;)Lcom/google/android/gms/internal/ads/Pe;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Xe;->B(Lcom/google/android/gms/internal/ads/Pe;)Lcom/google/android/gms/internal/ads/Xe;

    return-void
.end method
