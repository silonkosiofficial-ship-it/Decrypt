.class public final synthetic Lcom/google/android/gms/internal/ads/dJ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/AJ0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/GJ0;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/nJ0;

.field public final synthetic c:Z

.field public final synthetic d:[I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/GJ0;Lcom/google/android/gms/internal/ads/nJ0;Z[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dJ0;->a:Lcom/google/android/gms/internal/ads/GJ0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dJ0;->b:Lcom/google/android/gms/internal/ads/nJ0;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/dJ0;->c:Z

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/dJ0;->d:[I

    return-void
.end method


# virtual methods
.method public final a(ILcom/google/android/gms/internal/ads/Pm;[I)Ljava/util/List;
    .locals 16

    .prologue
    move-object/from16 v0, p0

    new-instance v10, Lcom/google/android/gms/internal/ads/gJ0;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/dJ0;->a:Lcom/google/android/gms/internal/ads/GJ0;

    invoke-direct {v10, v1}, Lcom/google/android/gms/internal/ads/gJ0;-><init>(Lcom/google/android/gms/internal/ads/GJ0;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/dJ0;->d:[I

    aget v11, v1, p1

    new-instance v12, Lcom/google/android/gms/internal/ads/Zh0;

    invoke-direct {v12}, Lcom/google/android/gms/internal/ads/Zh0;-><init>()V

    const/4 v1, 0x0

    move-object/from16 v14, p2

    move v13, v1

    :goto_0
    iget v1, v14, Lcom/google/android/gms/internal/ads/Pm;->a:I

    if-ge v13, v1, :cond_0

    iget-boolean v7, v0, Lcom/google/android/gms/internal/ads/dJ0;->c:Z

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/dJ0;->b:Lcom/google/android/gms/internal/ads/nJ0;

    new-instance v15, Lcom/google/android/gms/internal/ads/jJ0;

    aget v6, p3, v13

    move-object v1, v15

    move/from16 v2, p1

    move-object/from16 v3, p2

    move v4, v13

    move-object v8, v10

    move v9, v11

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/ads/jJ0;-><init>(ILcom/google/android/gms/internal/ads/Pm;ILcom/google/android/gms/internal/ads/nJ0;IZLcom/google/android/gms/internal/ads/Bg0;I)V

    invoke-virtual {v12, v15}, Lcom/google/android/gms/internal/ads/Zh0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Zh0;

    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/Zh0;->j()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v1

    return-object v1
.end method
