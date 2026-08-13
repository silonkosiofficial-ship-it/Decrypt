.class public final synthetic Lcom/google/android/gms/internal/ads/sA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/vA;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/Jk0;

.field public final synthetic c:LP4/d;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/vA;Lcom/google/android/gms/internal/ads/Jk0;LP4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sA;->a:Lcom/google/android/gms/internal/ads/vA;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/sA;->b:Lcom/google/android/gms/internal/ads/Jk0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/sA;->c:LP4/d;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sA;->a:Lcom/google/android/gms/internal/ads/vA;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sA;->b:Lcom/google/android/gms/internal/ads/Jk0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sA;->c:LP4/d;

    check-cast p1, Lcom/google/android/gms/internal/ads/fA;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/vA;->a(Lcom/google/android/gms/internal/ads/Jk0;LP4/d;Lcom/google/android/gms/internal/ads/fA;)LP4/d;

    move-result-object p1

    return-object p1
.end method
