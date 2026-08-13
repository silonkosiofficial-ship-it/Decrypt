.class public abstract Lcom/google/android/gms/internal/ads/Sl;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LX3/a;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 1

    invoke-static {p0}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/lo;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/no;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/ads/Lg;->g:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->floatValue()F

    move-result v0

    invoke-interface {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/no;->b(Ljava/lang/Throwable;Ljava/lang/String;F)V

    return-void
.end method
