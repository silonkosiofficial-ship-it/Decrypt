.class public final synthetic Lcom/google/android/gms/internal/ads/hB0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/mB0;

.field public final synthetic D:Landroid/util/Pair;

.field public final synthetic E:Lcom/google/android/gms/internal/ads/BH0;

.field public final synthetic F:Lcom/google/android/gms/internal/ads/HH0;

.field public final synthetic G:Ljava/io/IOException;

.field public final synthetic H:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/mB0;Landroid/util/Pair;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hB0;->C:Lcom/google/android/gms/internal/ads/mB0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/hB0;->D:Landroid/util/Pair;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/hB0;->E:Lcom/google/android/gms/internal/ads/BH0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/hB0;->F:Lcom/google/android/gms/internal/ads/HH0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/hB0;->G:Ljava/io/IOException;

    iput-boolean p6, p0, Lcom/google/android/gms/internal/ads/hB0;->H:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hB0;->D:Landroid/util/Pair;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hB0;->C:Lcom/google/android/gms/internal/ads/mB0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/mB0;->b:Lcom/google/android/gms/internal/ads/rB0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/rB0;->e(Lcom/google/android/gms/internal/ads/rB0;)Lcom/google/android/gms/internal/ads/KB0;

    move-result-object v2

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/internal/ads/LH0;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/hB0;->E:Lcom/google/android/gms/internal/ads/BH0;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/hB0;->F:Lcom/google/android/gms/internal/ads/HH0;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/hB0;->G:Ljava/io/IOException;

    iget-boolean v8, p0, Lcom/google/android/gms/internal/ads/hB0;->H:Z

    invoke-interface/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/WH0;->F(ILcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;Ljava/io/IOException;Z)V

    return-void
.end method
