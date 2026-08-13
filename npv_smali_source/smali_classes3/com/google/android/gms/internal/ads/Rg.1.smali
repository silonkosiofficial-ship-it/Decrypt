.class public final Lcom/google/android/gms/internal/ads/Rg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/fI0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/fI0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/fI0;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Rg;->a:Lcom/google/android/gms/internal/ads/fI0;

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/google/android/gms/internal/ads/Rg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Rg;->a:Lcom/google/android/gms/internal/ads/fI0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/fI0;->a(I)Lcom/google/android/gms/internal/ads/fI0;

    return-object p0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/sh;)Lcom/google/android/gms/internal/ads/Rg;
    .locals 3

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/sh;->a(Lcom/google/android/gms/internal/ads/sh;)Lcom/google/android/gms/internal/ads/fJ0;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fJ0;->b()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Rg;->a:Lcom/google/android/gms/internal/ads/fI0;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/fJ0;->a(I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/fI0;->a(I)Lcom/google/android/gms/internal/ads/fI0;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public final varargs c([I)Lcom/google/android/gms/internal/ads/Rg;
    .locals 3

    .prologue
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x14

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Rg;->a:Lcom/google/android/gms/internal/ads/fI0;

    aget v2, p1, v0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/fI0;->a(I)Lcom/google/android/gms/internal/ads/fI0;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public final d(IZ)Lcom/google/android/gms/internal/ads/Rg;
    .locals 0

    .prologue
    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Rg;->a:Lcom/google/android/gms/internal/ads/fI0;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/fI0;->a(I)Lcom/google/android/gms/internal/ads/fI0;

    :cond_0
    return-object p0
.end method

.method public final e()Lcom/google/android/gms/internal/ads/sh;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Rg;->a:Lcom/google/android/gms/internal/ads/fI0;

    new-instance v1, Lcom/google/android/gms/internal/ads/sh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fI0;->b()Lcom/google/android/gms/internal/ads/fJ0;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/sh;-><init>(Lcom/google/android/gms/internal/ads/fJ0;Lcom/google/android/gms/internal/ads/Qi;)V

    return-object v1
.end method
