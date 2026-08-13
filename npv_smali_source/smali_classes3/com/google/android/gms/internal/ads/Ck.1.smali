.class public final synthetic Lcom/google/android/gms/internal/ads/Ck;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV3/o;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/gj;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/gj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ck;->a:Lcom/google/android/gms/internal/ads/gj;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/gj;

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/Ik;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ck;->a:Lcom/google/android/gms/internal/ads/gj;

    check-cast p1, Lcom/google/android/gms/internal/ads/Ik;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Ik;->b(Lcom/google/android/gms/internal/ads/Ik;)Lcom/google/android/gms/internal/ads/gj;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
