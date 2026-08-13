.class public final Lcom/google/android/gms/internal/ads/nM;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nM;->a:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nM;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/vC;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/vC;->a()Lcom/google/android/gms/internal/ads/n70;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->o:Lcom/google/android/gms/internal/ads/Z60;

    iget v0, v0, Lcom/google/android/gms/internal/ads/Z60;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/vd;->O:Lcom/google/android/gms/internal/ads/vd;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/vd;->K:Lcom/google/android/gms/internal/ads/vd;

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/iz0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
