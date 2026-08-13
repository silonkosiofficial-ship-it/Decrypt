.class public final synthetic Lcom/google/android/gms/internal/ads/db0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/gb0;

.field public final synthetic b:Lk3/c;

.field public final synthetic c:Lj$/util/Optional;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/gb0;Lk3/c;Lj$/util/Optional;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/db0;->a:Lcom/google/android/gms/internal/ads/gb0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/db0;->b:Lk3/c;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/db0;->c:Lj$/util/Optional;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/db0;->a:Lcom/google/android/gms/internal/ads/gb0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/db0;->b:Lk3/c;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/db0;->c:Lj$/util/Optional;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/gb0;->g(Lk3/c;Lj$/util/Optional;Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
