.class public Lcom/google/android/gms/internal/ads/Eo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I

.field private e:I

.field private f:I

.field private g:Z

.field private final h:Lcom/google/android/gms/internal/ads/ci0;

.field private final i:Lcom/google/android/gms/internal/ads/ci0;

.field private final j:Lcom/google/android/gms/internal/ads/ci0;

.field private final k:I

.field private final l:I

.field private final m:Lcom/google/android/gms/internal/ads/ci0;

.field private final n:Lcom/google/android/gms/internal/ads/fo;

.field private o:Lcom/google/android/gms/internal/ads/ci0;

.field private p:I

.field private final q:Ljava/util/HashMap;

.field private final r:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->a:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->b:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->c:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->d:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->e:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->f:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/Eo;->g:Z

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/Eo;->h:Lcom/google/android/gms/internal/ads/ci0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/Eo;->i:Lcom/google/android/gms/internal/ads/ci0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/Eo;->j:Lcom/google/android/gms/internal/ads/ci0;

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->k:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->l:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Eo;->m:Lcom/google/android/gms/internal/ads/ci0;

    sget-object v0, Lcom/google/android/gms/internal/ads/fo;->b:Lcom/google/android/gms/internal/ads/fo;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Eo;->n:Lcom/google/android/gms/internal/ads/fo;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Eo;->o:Lcom/google/android/gms/internal/ads/ci0;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->p:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Eo;->q:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Eo;->r:Ljava/util/HashSet;

    return-void
.end method

.method protected constructor <init>(Lcom/google/android/gms/internal/ads/fp;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->a:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->b:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->c:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->d:I

    iget v1, p1, Lcom/google/android/gms/internal/ads/fp;->i:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/Eo;->e:I

    iget v1, p1, Lcom/google/android/gms/internal/ads/fp;->j:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/Eo;->f:I

    iget-boolean v1, p1, Lcom/google/android/gms/internal/ads/fp;->k:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/Eo;->g:Z

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/fp;->l:Lcom/google/android/gms/internal/ads/ci0;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/Eo;->h:Lcom/google/android/gms/internal/ads/ci0;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/fp;->m:Lcom/google/android/gms/internal/ads/ci0;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/Eo;->i:Lcom/google/android/gms/internal/ads/ci0;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/fp;->o:Lcom/google/android/gms/internal/ads/ci0;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/Eo;->j:Lcom/google/android/gms/internal/ads/ci0;

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->k:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->l:I

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/fp;->s:Lcom/google/android/gms/internal/ads/ci0;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Eo;->m:Lcom/google/android/gms/internal/ads/ci0;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/fp;->t:Lcom/google/android/gms/internal/ads/fo;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Eo;->n:Lcom/google/android/gms/internal/ads/fo;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/fp;->u:Lcom/google/android/gms/internal/ads/ci0;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Eo;->o:Lcom/google/android/gms/internal/ads/ci0;

    iget v0, p1, Lcom/google/android/gms/internal/ads/fp;->v:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->p:I

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/fp;->C:Lcom/google/android/gms/internal/ads/hi0;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/Eo;->r:Ljava/util/HashSet;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/fp;->B:Lcom/google/android/gms/internal/ads/fi0;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Eo;->q:Ljava/util/HashMap;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/Eo;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/Eo;->p:I

    return p0
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/Eo;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/Eo;->f:I

    return p0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/Eo;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/Eo;->e:I

    return p0
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/Eo;)Lcom/google/android/gms/internal/ads/fo;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Eo;->n:Lcom/google/android/gms/internal/ads/fo;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/Eo;)Lcom/google/android/gms/internal/ads/ci0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Eo;->j:Lcom/google/android/gms/internal/ads/ci0;

    return-object p0
.end method

.method static bridge synthetic h(Lcom/google/android/gms/internal/ads/Eo;)Lcom/google/android/gms/internal/ads/ci0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Eo;->m:Lcom/google/android/gms/internal/ads/ci0;

    return-object p0
.end method

.method static bridge synthetic i(Lcom/google/android/gms/internal/ads/Eo;)Lcom/google/android/gms/internal/ads/ci0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Eo;->o:Lcom/google/android/gms/internal/ads/ci0;

    return-object p0
.end method

.method static bridge synthetic j(Lcom/google/android/gms/internal/ads/Eo;)Lcom/google/android/gms/internal/ads/ci0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Eo;->i:Lcom/google/android/gms/internal/ads/ci0;

    return-object p0
.end method

.method static bridge synthetic k(Lcom/google/android/gms/internal/ads/Eo;)Lcom/google/android/gms/internal/ads/ci0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Eo;->h:Lcom/google/android/gms/internal/ads/ci0;

    return-object p0
.end method

.method static bridge synthetic l(Lcom/google/android/gms/internal/ads/Eo;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Eo;->q:Ljava/util/HashMap;

    return-object p0
.end method

.method static bridge synthetic m(Lcom/google/android/gms/internal/ads/Eo;)Ljava/util/HashSet;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Eo;->r:Ljava/util/HashSet;

    return-object p0
.end method

.method static bridge synthetic n(Lcom/google/android/gms/internal/ads/Eo;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/Eo;->g:Z

    return p0
.end method


# virtual methods
.method public final e(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/Eo;
    .locals 2

    .prologue
    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_2

    :cond_0
    const-string v0, "captioning"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/CaptioningManager;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x440

    iput v0, p0, Lcom/google/android/gms/internal/ads/Eo;->p:I

    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ci0;->P(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Eo;->o:Lcom/google/android/gms/internal/ads/ci0;

    :cond_2
    :goto_0
    return-object p0
.end method

.method public final f(IIZ)Lcom/google/android/gms/internal/ads/Eo;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Eo;->e:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/Eo;->f:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/Eo;->g:Z

    return-object p0
.end method
