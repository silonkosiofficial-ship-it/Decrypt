.class public final synthetic Lcom/google/android/gms/internal/ads/ZI0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/AJ0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/nJ0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/nJ0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ZI0;->a:Lcom/google/android/gms/internal/ads/nJ0;

    return-void
.end method


# virtual methods
.method public final a(ILcom/google/android/gms/internal/ads/Pm;[I)Ljava/util/List;
    .locals 9

    .prologue
    sget v0, Lcom/google/android/gms/internal/ads/GJ0;->k:I

    new-instance v0, Lcom/google/android/gms/internal/ads/Zh0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Zh0;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget v2, p2, Lcom/google/android/gms/internal/ads/Pm;->a:I

    if-ge v1, v2, :cond_0

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/ZI0;->a:Lcom/google/android/gms/internal/ads/nJ0;

    new-instance v8, Lcom/google/android/gms/internal/ads/kJ0;

    aget v7, p3, v1

    move-object v2, v8

    move v3, p1

    move-object v4, p2

    move v5, v1

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/kJ0;-><init>(ILcom/google/android/gms/internal/ads/Pm;ILcom/google/android/gms/internal/ads/nJ0;I)V

    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/Zh0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Zh0;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Zh0;->j()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    return-object p1
.end method
