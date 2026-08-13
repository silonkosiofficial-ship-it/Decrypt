.class public final synthetic Lcom/google/android/gms/internal/ads/OC;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/AF;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/YH;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/YH;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/OC;->a:Lcom/google/android/gms/internal/ads/YH;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/OC;->a:Lcom/google/android/gms/internal/ads/YH;

    check-cast p1, Lcom/google/android/gms/internal/ads/VC;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "Internal show error."

    :cond_0
    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/VC;->p(Ls3/W0;)V

    return-void
.end method
