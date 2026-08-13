.class public final synthetic Lcom/google/android/gms/internal/ads/PQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/QQ;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/Po;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/QQ;Lcom/google/android/gms/internal/ads/Po;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/PQ;->a:Lcom/google/android/gms/internal/ads/QQ;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/PQ;->b:Lcom/google/android/gms/internal/ads/Po;

    iput p3, p0, Lcom/google/android/gms/internal/ads/PQ;->c:I

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/PQ;->a:Lcom/google/android/gms/internal/ads/QQ;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/PQ;->b:Lcom/google/android/gms/internal/ads/Po;

    iget v2, p0, Lcom/google/android/gms/internal/ads/PQ;->c:I

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/QQ;->b(Lcom/google/android/gms/internal/ads/Po;ILjava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1
.end method
