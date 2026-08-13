.class public final synthetic Lcom/google/android/gms/internal/ads/tA0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/aK;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/internal/ads/ri;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/ri;


# direct methods
.method public synthetic constructor <init>(ILcom/google/android/gms/internal/ads/ri;Lcom/google/android/gms/internal/ads/ri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/tA0;->a:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/tA0;->b:Lcom/google/android/gms/internal/ads/ri;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/tA0;->c:Lcom/google/android/gms/internal/ads/ri;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/Rh;

    sget v0, Lcom/google/android/gms/internal/ads/GA0;->V:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tA0;->c:Lcom/google/android/gms/internal/ads/ri;

    iget v1, p0, Lcom/google/android/gms/internal/ads/tA0;->a:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/tA0;->b:Lcom/google/android/gms/internal/ads/ri;

    invoke-interface {p1, v2, v0, v1}, Lcom/google/android/gms/internal/ads/Rh;->V(Lcom/google/android/gms/internal/ads/ri;Lcom/google/android/gms/internal/ads/ri;I)V

    return-void
.end method
