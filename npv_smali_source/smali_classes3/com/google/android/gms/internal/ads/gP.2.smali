.class public final synthetic Lcom/google/android/gms/internal/ads/gP;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/pP;

.field public final synthetic D:Ljava/lang/String;

.field public final synthetic E:Lcom/google/android/gms/internal/ads/ek;

.field public final synthetic F:Lcom/google/android/gms/internal/ads/M70;

.field public final synthetic G:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/pP;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ek;Lcom/google/android/gms/internal/ads/M70;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gP;->C:Lcom/google/android/gms/internal/ads/pP;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gP;->D:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/gP;->E:Lcom/google/android/gms/internal/ads/ek;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/gP;->F:Lcom/google/android/gms/internal/ads/M70;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/gP;->G:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gP;->C:Lcom/google/android/gms/internal/ads/pP;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gP;->D:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/gP;->E:Lcom/google/android/gms/internal/ads/ek;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/gP;->F:Lcom/google/android/gms/internal/ads/M70;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/gP;->G:Ljava/util/List;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/pP;->n(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ek;Lcom/google/android/gms/internal/ads/M70;Ljava/util/List;)V

    return-void
.end method
