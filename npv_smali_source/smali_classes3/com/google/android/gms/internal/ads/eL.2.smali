.class public final synthetic Lcom/google/android/gms/internal/ads/eL;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Iu;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/kL;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/Ot;

.field public final synthetic E:Lcom/google/android/gms/internal/ads/lr;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/kL;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/lr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eL;->C:Lcom/google/android/gms/internal/ads/kL;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/eL;->D:Lcom/google/android/gms/internal/ads/Ot;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/eL;->E:Lcom/google/android/gms/internal/ads/lr;

    return-void
.end method


# virtual methods
.method public final a(ZILjava/lang/String;Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eL;->C:Lcom/google/android/gms/internal/ads/kL;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eL;->D:Lcom/google/android/gms/internal/ads/Ot;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eL;->E:Lcom/google/android/gms/internal/ads/lr;

    move v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/kL;->g(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/lr;ZILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
