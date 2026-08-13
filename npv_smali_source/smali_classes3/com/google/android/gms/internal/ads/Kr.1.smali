.class public abstract Lcom/google/android/gms/internal/ads/Kr;
.super Landroid/view/TextureView;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/is;


# instance fields
.field protected final C:Lcom/google/android/gms/internal/ads/Zr;

.field protected final D:Lcom/google/android/gms/internal/ads/js;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/Zr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Zr;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Kr;->C:Lcom/google/android/gms/internal/ads/Zr;

    new-instance v0, Lcom/google/android/gms/internal/ads/js;

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/internal/ads/js;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/is;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Kr;->D:Lcom/google/android/gms/internal/ads/js;

    return-void
.end method


# virtual methods
.method public C(I)V
    .locals 0

    return-void
.end method

.method public D(I)V
    .locals 0

    return-void
.end method

.method public a(I)V
    .locals 0

    return-void
.end method

.method public b(I)V
    .locals 0

    return-void
.end method

.method public c(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/Kr;->r(Ljava/lang/String;)V

    return-void
.end method

.method public abstract d()I
.end method

.method public abstract e()I
.end method

.method public abstract f()I
.end method

.method public abstract g()I
.end method

.method public abstract h()I
.end method

.method public abstract i()J
.end method

.method public abstract j()J
.end method

.method public abstract k()J
.end method

.method public abstract l()Ljava/lang/String;
.end method

.method public abstract m()V
.end method

.method public abstract n()V
.end method

.method public abstract o()V
.end method

.method public abstract p(I)V
.end method

.method public abstract q(Lcom/google/android/gms/internal/ads/Jr;)V
.end method

.method public abstract r(Ljava/lang/String;)V
.end method

.method public abstract s()V
.end method

.method public abstract t(FF)V
.end method

.method public u()Ljava/lang/Integer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public w(I)V
    .locals 0

    return-void
.end method
