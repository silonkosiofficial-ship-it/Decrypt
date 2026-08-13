.class public final Lcom/google/android/gms/internal/ads/I1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/net/Uri;

.field private final c:Lcom/google/android/gms/internal/ads/j2;

.field private final d:Ljava/util/List;

.field private final e:Lcom/google/android/gms/internal/ads/ci0;

.field private final f:Lcom/google/android/gms/internal/ads/m4;

.field private final g:Lcom/google/android/gms/internal/ads/q6;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/j2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/j2;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/I1;->c:Lcom/google/android/gms/internal/ads/j2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/I1;->d:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/I1;->e:Lcom/google/android/gms/internal/ads/ci0;

    new-instance v0, Lcom/google/android/gms/internal/ads/m4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/m4;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/I1;->f:Lcom/google/android/gms/internal/ads/m4;

    sget-object v0, Lcom/google/android/gms/internal/ads/q6;->d:Lcom/google/android/gms/internal/ads/q6;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/I1;->g:Lcom/google/android/gms/internal/ads/q6;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/I1;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/I1;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final b(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/I1;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/I1;->b:Landroid/net/Uri;

    return-object p0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/Q7;
    .locals 23

    .prologue
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/I1;->b:Landroid/net/Uri;

    const/4 v13, 0x0

    if-eqz v2, :cond_0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/I1;->d:Ljava/util/List;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/I1;->e:Lcom/google/android/gms/internal/ads/ci0;

    new-instance v14, Lcom/google/android/gms/internal/ads/o5;

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v1, v14

    invoke-direct/range {v1 .. v12}, Lcom/google/android/gms/internal/ads/o5;-><init>(Landroid/net/Uri;Ljava/lang/String;Lcom/google/android/gms/internal/ads/L3;Lcom/google/android/gms/internal/ads/h1;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ci0;Ljava/lang/Object;JLcom/google/android/gms/internal/ads/p7;)V

    move-object/from16 v18, v14

    goto :goto_0

    :cond_0
    move-object/from16 v18, v13

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ads/Q7;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/I1;->a:Ljava/lang/String;

    if-nez v2, :cond_1

    const-string v2, ""

    :cond_1
    move-object/from16 v16, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/I1;->c:Lcom/google/android/gms/internal/ads/j2;

    new-instance v3, Lcom/google/android/gms/internal/ads/k3;

    invoke-direct {v3, v2, v13}, Lcom/google/android/gms/internal/ads/k3;-><init>(Lcom/google/android/gms/internal/ads/j2;Lcom/google/android/gms/internal/ads/p7;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/I1;->f:Lcom/google/android/gms/internal/ads/m4;

    new-instance v4, Lcom/google/android/gms/internal/ads/N4;

    invoke-direct {v4, v2, v13}, Lcom/google/android/gms/internal/ads/N4;-><init>(Lcom/google/android/gms/internal/ads/m4;Lcom/google/android/gms/internal/ads/p7;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/I1;->g:Lcom/google/android/gms/internal/ads/q6;

    sget-object v20, Lcom/google/android/gms/internal/ads/Y9;->z:Lcom/google/android/gms/internal/ads/Y9;

    const/16 v22, 0x0

    move-object v15, v1

    move-object/from16 v17, v3

    move-object/from16 v19, v4

    move-object/from16 v21, v2

    invoke-direct/range {v15 .. v22}, Lcom/google/android/gms/internal/ads/Q7;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/k3;Lcom/google/android/gms/internal/ads/o5;Lcom/google/android/gms/internal/ads/N4;Lcom/google/android/gms/internal/ads/Y9;Lcom/google/android/gms/internal/ads/q6;Lcom/google/android/gms/internal/ads/p7;)V

    return-object v1
.end method
