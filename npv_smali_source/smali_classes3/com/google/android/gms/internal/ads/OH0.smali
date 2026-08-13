.class public final synthetic Lcom/google/android/gms/internal/ads/OH0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/rF;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/VH0;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/HH0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/VH0;Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/OH0;->a:Lcom/google/android/gms/internal/ads/VH0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/OH0;->b:Lcom/google/android/gms/internal/ads/HH0;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/OH0;->a:Lcom/google/android/gms/internal/ads/VH0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/VH0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/OH0;->b:Lcom/google/android/gms/internal/ads/HH0;

    check-cast p1, Lcom/google/android/gms/internal/ads/WH0;

    const/4 v2, 0x0

    invoke-interface {p1, v2, v0, v1}, Lcom/google/android/gms/internal/ads/WH0;->B(ILcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/HH0;)V

    return-void
.end method
