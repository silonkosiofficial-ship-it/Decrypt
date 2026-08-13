.class public final synthetic Lcom/google/android/gms/internal/ads/wQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/xQ;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/Po;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/xQ;Lcom/google/android/gms/internal/ads/Po;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wQ;->a:Lcom/google/android/gms/internal/ads/xQ;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wQ;->b:Lcom/google/android/gms/internal/ads/Po;

    iput p3, p0, Lcom/google/android/gms/internal/ads/wQ;->c:I

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wQ;->a:Lcom/google/android/gms/internal/ads/xQ;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wQ;->b:Lcom/google/android/gms/internal/ads/Po;

    iget v2, p0, Lcom/google/android/gms/internal/ads/wQ;->c:I

    check-cast p1, Lcom/google/android/gms/internal/ads/AR;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/xQ;->b(Lcom/google/android/gms/internal/ads/Po;ILcom/google/android/gms/internal/ads/AR;)LP4/d;

    move-result-object p1

    return-object p1
.end method
