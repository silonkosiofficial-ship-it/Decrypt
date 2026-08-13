.class final Lcom/google/android/gms/internal/ads/ri0;
.super Lcom/google/android/gms/internal/ads/ij0;
.source "SourceFile"


# instance fields
.field final synthetic D:Lcom/google/android/gms/internal/ads/si0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/si0;Ljava/util/ListIterator;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ri0;->D:Lcom/google/android/gms/internal/ads/si0;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/ij0;-><init>(Ljava/util/ListIterator;)V

    return-void
.end method


# virtual methods
.method final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ri0;->D:Lcom/google/android/gms/internal/ads/si0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/si0;->D:Lcom/google/android/gms/internal/ads/pg0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/pg0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
