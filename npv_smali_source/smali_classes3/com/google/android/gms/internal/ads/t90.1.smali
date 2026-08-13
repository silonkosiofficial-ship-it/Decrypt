.class public final synthetic Lcom/google/android/gms/internal/ads/t90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/AF;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/a90;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/a90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t90;->a:Lcom/google/android/gms/internal/ads/a90;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t90;->a:Lcom/google/android/gms/internal/ads/a90;

    check-cast p1, Lcom/google/android/gms/internal/ads/w90;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/a90;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/p90;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/a90;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/w90;->z(Lcom/google/android/gms/internal/ads/p90;Ljava/lang/String;)V

    return-void
.end method
