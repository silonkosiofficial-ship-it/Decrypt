.class public final Lcom/google/android/gms/internal/ads/OK0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/n;

.field private c:Lcom/google/android/gms/internal/ads/kr;

.field private d:Lcom/google/android/gms/internal/ads/Mj;

.field private final e:Ljava/util/List;

.field private f:Lcom/google/android/gms/internal/ads/mD;

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/OK0;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/OK0;->b:Lcom/google/android/gms/internal/ads/n;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/OK0;->e:Ljava/util/List;

    sget-object p1, Lcom/google/android/gms/internal/ads/mD;->a:Lcom/google/android/gms/internal/ads/mD;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/OK0;->f:Lcom/google/android/gms/internal/ads/mD;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/OK0;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/OK0;->a:Landroid/content/Context;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/OK0;)Lcom/google/android/gms/internal/ads/Mj;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/OK0;->d:Lcom/google/android/gms/internal/ads/Mj;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/OK0;)Lcom/google/android/gms/internal/ads/mD;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/OK0;->f:Lcom/google/android/gms/internal/ads/mD;

    return-object p0
.end method

.method static bridge synthetic f(Lcom/google/android/gms/internal/ads/OK0;)Lcom/google/android/gms/internal/ads/n;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/OK0;->b:Lcom/google/android/gms/internal/ads/n;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/OK0;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/OK0;->e:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final d(Lcom/google/android/gms/internal/ads/mD;)Lcom/google/android/gms/internal/ads/OK0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/OK0;->f:Lcom/google/android/gms/internal/ads/mD;

    return-object p0
.end method

.method public final e()Lcom/google/android/gms/internal/ads/j;
    .locals 4

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/OK0;->g:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/OK0;->d:Lcom/google/android/gms/internal/ads/Mj;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/OK0;->c:Lcom/google/android/gms/internal/ads/kr;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/g;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/g;-><init>(Lcom/google/android/gms/internal/ads/i;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/OK0;->c:Lcom/google/android/gms/internal/ads/kr;

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/h;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/OK0;->c:Lcom/google/android/gms/internal/ads/kr;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/h;-><init>(Lcom/google/android/gms/internal/ads/kr;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/OK0;->d:Lcom/google/android/gms/internal/ads/Mj;

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/j;

    invoke-direct {v0, p0, v2}, Lcom/google/android/gms/internal/ads/j;-><init>(Lcom/google/android/gms/internal/ads/OK0;Lcom/google/android/gms/internal/ads/i;)V

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/OK0;->g:Z

    return-object v0
.end method
