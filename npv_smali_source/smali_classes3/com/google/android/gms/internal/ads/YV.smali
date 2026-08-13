.class public final synthetic Lcom/google/android/gms/internal/ads/YV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/aW;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/R60;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/e70;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/VT;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/aW;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/VT;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/YV;->a:Lcom/google/android/gms/internal/ads/aW;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/YV;->b:Lcom/google/android/gms/internal/ads/R60;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/YV;->c:Lcom/google/android/gms/internal/ads/e70;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/YV;->d:Lcom/google/android/gms/internal/ads/VT;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/YV;->a:Lcom/google/android/gms/internal/ads/aW;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/YV;->b:Lcom/google/android/gms/internal/ads/R60;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/YV;->c:Lcom/google/android/gms/internal/ads/e70;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/YV;->d:Lcom/google/android/gms/internal/ads/VT;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/ads/aW;->a(Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/VT;Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1
.end method
