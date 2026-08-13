.class public abstract Lcom/google/android/gms/internal/ads/Ni0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/util/Comparator;)Lcom/google/android/gms/internal/ads/Ni0;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Mh0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Mh0;-><init>(Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static c()Lcom/google/android/gms/internal/ads/Ni0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Li0;->C:Lcom/google/android/gms/internal/ads/Li0;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/ads/Ni0;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Xi0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Xi0;-><init>(Lcom/google/android/gms/internal/ads/Ni0;)V

    return-object v0
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
.end method
