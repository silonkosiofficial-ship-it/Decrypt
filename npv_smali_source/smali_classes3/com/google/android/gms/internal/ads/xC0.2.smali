.class public final synthetic Lcom/google/android/gms/internal/ads/xC0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/aK;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/LB0;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/LB0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xC0;->a:Lcom/google/android/gms/internal/ads/LB0;

    iput p2, p0, Lcom/google/android/gms/internal/ads/xC0;->b:I

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/NB0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xC0;->a:Lcom/google/android/gms/internal/ads/LB0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/xC0;->b:I

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/NB0;->h(Lcom/google/android/gms/internal/ads/LB0;I)V

    return-void
.end method
