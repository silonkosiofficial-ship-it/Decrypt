.class public final synthetic Lcom/google/android/gms/internal/ads/SG0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/YG0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/D;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/D;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/SG0;->a:Lcom/google/android/gms/internal/ads/D;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 1

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/AG0;

    sget v0, Lcom/google/android/gms/internal/ads/fH0;->b:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SG0;->a:Lcom/google/android/gms/internal/ads/D;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/AG0;->d(Lcom/google/android/gms/internal/ads/D;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
