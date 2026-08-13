.class public abstract Lcom/google/android/gms/internal/ads/Jf0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static l()Lcom/google/android/gms/internal/ads/If0;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/df0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/df0;-><init>()V

    const v1, 0x800053

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/df0;->d(I)Lcom/google/android/gms/internal/ads/If0;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/If0;->e(F)Lcom/google/android/gms/internal/ads/If0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/If0;->c(I)Lcom/google/android/gms/internal/ads/If0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/If0;->f(I)Lcom/google/android/gms/internal/ads/If0;

    return-object v0
.end method


# virtual methods
.method public abstract a()F
.end method

.method public abstract b()I
.end method

.method public abstract c()I
.end method

.method public abstract d()I
.end method

.method public abstract e()I
.end method

.method public abstract f()Landroid/os/IBinder;
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public abstract k()Ljava/lang/String;
.end method
