.class public final synthetic Lcom/google/android/gms/internal/ads/Nk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/hl;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/gl;

.field public final synthetic E:Lcom/google/android/gms/internal/ads/Bk;

.field public final synthetic F:Ljava/util/ArrayList;

.field public final synthetic G:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/hl;Lcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/Bk;Ljava/util/ArrayList;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Nk;->C:Lcom/google/android/gms/internal/ads/hl;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Nk;->D:Lcom/google/android/gms/internal/ads/gl;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Nk;->E:Lcom/google/android/gms/internal/ads/Bk;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Nk;->F:Ljava/util/ArrayList;

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/Nk;->G:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nk;->C:Lcom/google/android/gms/internal/ads/hl;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Nk;->D:Lcom/google/android/gms/internal/ads/gl;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Nk;->E:Lcom/google/android/gms/internal/ads/Bk;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Nk;->F:Ljava/util/ArrayList;

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/Nk;->G:J

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/hl;->j(Lcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/Bk;Ljava/util/ArrayList;J)V

    return-void
.end method
