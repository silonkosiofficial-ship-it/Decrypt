.class public final Lcom/google/android/gms/internal/ads/mE0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lcom/google/android/gms/internal/ads/mE0;

.field private static final d:Lcom/google/android/gms/internal/ads/ci0;

.field static final e:Lcom/google/android/gms/internal/ads/fi0;


# instance fields
.field private final a:Landroid/util/SparseArray;

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/mE0;

    sget-object v1, Lcom/google/android/gms/internal/ads/dE0;->d:Lcom/google/android/gms/internal/ads/dE0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ci0;->P(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/mE0;-><init>(Ljava/util/List;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/mE0;->c:Lcom/google/android/gms/internal/ads/mE0;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/ci0;->R(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/mE0;->d:Lcom/google/android/gms/internal/ads/ci0;

    new-instance v0, Lcom/google/android/gms/internal/ads/ei0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ei0;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/ei0;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ei0;

    const/16 v1, 0x11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/ei0;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ei0;

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/ei0;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ei0;

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v3, 0xa

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/ads/ei0;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ei0;

    const/16 v1, 0x12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/ei0;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ei0;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/ads/ei0;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ei0;

    invoke-virtual {v0, v1, v1}, Lcom/google/android/gms/internal/ads/ei0;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ei0;

    const/16 v2, 0xe

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/ads/ei0;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ei0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ei0;->c()Lcom/google/android/gms/internal/ads/fi0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/mE0;->e:Lcom/google/android/gms/internal/ads/fi0;

    return-void
.end method

.method private constructor <init>(Ljava/util/List;)V
    .locals 5

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/mE0;->a:Landroid/util/SparseArray;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/dE0;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/mE0;->a:Landroid/util/SparseArray;

    iget v4, v2, Lcom/google/android/gms/internal/ads/dE0;->a:I

    invoke-virtual {v3, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mE0;->a:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mE0;->a:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/dE0;

    iget v1, v1, Lcom/google/android/gms/internal/ads/dE0;->b:I

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iput p1, p0, Lcom/google/android/gms/internal/ads/mE0;->b:I

    return-void
.end method

.method static a()Landroid/net/Uri;
    .locals 1

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/mE0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "external_surround_sound_enabled"

    invoke-static {v0}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method static c(Landroid/content/Context;Lcom/google/android/gms/internal/ads/vS;Lcom/google/android/gms/internal/ads/sE0;)Lcom/google/android/gms/internal/ads/mE0;
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.media.action.HDMI_AUDIO_PLUG"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    invoke-static {p0, v0, p1, p2}, Lcom/google/android/gms/internal/ads/mE0;->d(Landroid/content/Context;Landroid/content/Intent;Lcom/google/android/gms/internal/ads/vS;Lcom/google/android/gms/internal/ads/sE0;)Lcom/google/android/gms/internal/ads/mE0;

    move-result-object p0

    return-object p0
.end method

.method static d(Landroid/content/Context;Landroid/content/Intent;Lcom/google/android/gms/internal/ads/vS;Lcom/google/android/gms/internal/ads/sE0;)Lcom/google/android/gms/internal/ads/mE0;
    .locals 10

    .prologue
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "audio"

    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v3, Landroid/media/AudioManager;

    const/16 v4, 0x21

    if-nez p3, :cond_2

    sget p3, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/4 v5, 0x0

    if-lt p3, v4, :cond_0

    :try_start_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/vS;->a()Lcom/google/android/gms/internal/ads/jr;

    move-result-object p3

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/jr;->a:Landroid/media/AudioAttributes;

    invoke-static {v3, p3}, Lcom/google/android/gms/internal/ads/eE0;->a(Landroid/media/AudioManager;Landroid/media/AudioAttributes;)Ljava/util/List;

    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    :catch_0
    :cond_0
    :goto_0
    move-object p3, v5

    goto :goto_1

    :cond_1
    new-instance v5, Lcom/google/android/gms/internal/ads/sE0;

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/media/AudioDeviceInfo;

    invoke-direct {v5, p3}, Lcom/google/android/gms/internal/ads/sE0;-><init>(Landroid/media/AudioDeviceInfo;)V

    goto :goto_0

    :cond_2
    :goto_1
    sget v5, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v6, 0xc

    if-lt v5, v4, :cond_a

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/EW;->m(Landroid/content/Context;)Z

    move-result v7

    if-nez v7, :cond_3

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/EW;->i(Landroid/content/Context;)Z

    move-result v7

    if-eqz v7, :cond_a

    :cond_3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/vS;->a()Lcom/google/android/gms/internal/ads/jr;

    move-result-object p0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/jr;->a:Landroid/media/AudioAttributes;

    invoke-static {v3, p0}, Lcom/google/android/gms/internal/ads/fE0;->a(Landroid/media/AudioManager;Landroid/media/AudioAttributes;)Ljava/util/List;

    move-result-object p0

    new-instance p1, Lcom/google/android/gms/internal/ads/mE0;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-instance v0, Ljava/util/HashSet;

    filled-new-array {v6}, [I

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/Ij0;->g([I)Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p3

    if-ge v1, p3, :cond_8

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/gE0;->a(Ljava/lang/Object;)Landroid/media/AudioProfile;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/hE0;->a(Landroid/media/AudioProfile;)I

    move-result v0

    if-ne v0, v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/iE0;->a(Landroid/media/AudioProfile;)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/EW;->j(I)Z

    move-result v3

    if-nez v3, :cond_5

    sget-object v3, Lcom/google/android/gms/internal/ads/mE0;->e:Lcom/google/android/gms/internal/ads/fi0;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/fi0;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Ljava/util/Set;

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/jE0;->a(Landroid/media/AudioProfile;)[I

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/Ij0;->g([I)Ljava/util/List;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    :cond_6
    new-instance v3, Ljava/util/HashSet;

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/jE0;->a(Landroid/media/AudioProfile;)[I

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/Ij0;->g([I)Ljava/util/List;

    move-result-object p3

    invoke-direct {v3, p3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {p2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_3
    add-int/2addr v1, v2

    goto :goto_2

    :cond_8
    new-instance p0, Lcom/google/android/gms/internal/ads/Zh0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Zh0;-><init>()V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    new-instance v0, Lcom/google/android/gms/internal/ads/dE0;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Set;

    invoke-direct {v0, v1, p3}, Lcom/google/android/gms/internal/ads/dE0;-><init>(ILjava/util/Set;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Zh0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Zh0;

    goto :goto_4

    :cond_9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Zh0;->j()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/mE0;-><init>(Ljava/util/List;)V

    return-object p1

    :cond_a
    const/16 v7, 0x17

    if-lt v5, v7, :cond_f

    if-nez p3, :cond_b

    invoke-virtual {v3, v0}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    move-result-object p3

    goto :goto_5

    :cond_b
    new-array v3, v2, [Landroid/media/AudioDeviceInfo;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/sE0;->a:Landroid/media/AudioDeviceInfo;

    aput-object p3, v3, v1

    move-object p3, v3

    :goto_5
    new-instance v3, Lcom/google/android/gms/internal/ads/gi0;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/gi0;-><init>()V

    const/16 v7, 0x8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-array v9, v0, [Ljava/lang/Integer;

    aput-object v7, v9, v1

    aput-object v8, v9, v2

    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/ads/gi0;->h([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/gi0;

    const/16 v7, 0x1f

    if-lt v5, v7, :cond_c

    const/16 v7, 0x1a

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v8, 0x1b

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-array v9, v0, [Ljava/lang/Integer;

    aput-object v7, v9, v1

    aput-object v8, v9, v2

    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/ads/gi0;->h([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/gi0;

    :cond_c
    if-lt v5, v4, :cond_d

    const/16 v4, 0x1e

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/gi0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/gi0;

    :cond_d
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/gi0;->j()Lcom/google/android/gms/internal/ads/hi0;

    move-result-object v3

    array-length v4, p3

    move v5, v1

    :goto_6
    if-ge v5, v4, :cond_f

    aget-object v7, p3, v5

    invoke-virtual {v7}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/ads/Xh0;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_e

    sget-object p0, Lcom/google/android/gms/internal/ads/mE0;->c:Lcom/google/android/gms/internal/ads/mE0;

    return-object p0

    :cond_e
    add-int/2addr v5, v2

    goto :goto_6

    :cond_f
    new-instance p3, Lcom/google/android/gms/internal/ads/gi0;

    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/gi0;-><init>()V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p3, v3}, Lcom/google/android/gms/internal/ads/gi0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/gi0;

    sget v3, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v4, 0x1d

    const/16 v5, 0xa

    if-lt v3, v4, :cond_13

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/EW;->m(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_10

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/EW;->i(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_13

    :cond_10
    new-instance p0, Lcom/google/android/gms/internal/ads/Zh0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Zh0;-><init>()V

    sget-object p1, Lcom/google/android/gms/internal/ads/mE0;->e:Lcom/google/android/gms/internal/ads/fi0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fi0;->j()Lcom/google/android/gms/internal/ads/hi0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hi0;->n()Lcom/google/android/gms/internal/ads/jj0;

    move-result-object p1

    :cond_11
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/EW;->z(I)I

    move-result v3

    sget v4, Lcom/google/android/gms/internal/ads/EW;->a:I

    if-lt v4, v3, :cond_11

    new-instance v3, Landroid/media/AudioFormat$Builder;

    invoke-direct {v3}, Landroid/media/AudioFormat$Builder;-><init>()V

    invoke-virtual {v3, v6}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object v2

    const v3, 0xbb80

    invoke-virtual {v2, v3}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/vS;->a()Lcom/google/android/gms/internal/ads/jr;

    move-result-object v3

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/jr;->a:Landroid/media/AudioAttributes;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/cE0;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/Zh0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Zh0;

    goto :goto_7

    :cond_12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/Zh0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Zh0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Zh0;->j()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p0

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/ads/gi0;->i(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/gi0;

    new-instance p0, Lcom/google/android/gms/internal/ads/mE0;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/gi0;->j()Lcom/google/android/gms/internal/ads/hi0;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Ij0;->h(Ljava/util/Collection;)[I

    move-result-object p1

    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/mE0;->e([II)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/mE0;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_13
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string p2, "use_external_surround_sound_flag"

    invoke-static {p0, p2, v1}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v2, :cond_14

    move p2, v2

    goto :goto_8

    :cond_14
    move p2, v1

    :goto_8
    if-nez p2, :cond_15

    invoke-static {}, Lcom/google/android/gms/internal/ads/mE0;->f()Z

    move-result v0

    if-eqz v0, :cond_16

    :cond_15
    const-string v0, "external_surround_sound_enabled"

    invoke-static {p0, v0, v1}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v2, :cond_16

    sget-object p0, Lcom/google/android/gms/internal/ads/mE0;->d:Lcom/google/android/gms/internal/ads/ci0;

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/ads/gi0;->i(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/gi0;

    :cond_16
    if-eqz p1, :cond_18

    if-nez p2, :cond_18

    const-string p0, "android.media.extra.AUDIO_PLUG_STATE"

    invoke-virtual {p1, p0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v2, :cond_18

    const-string p0, "android.media.extra.ENCODINGS"

    invoke-virtual {p1, p0}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object p0

    if-eqz p0, :cond_17

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Ij0;->g([I)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/ads/gi0;->i(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/gi0;

    :cond_17
    new-instance p0, Lcom/google/android/gms/internal/ads/mE0;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/gi0;->j()Lcom/google/android/gms/internal/ads/hi0;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Ij0;->h(Ljava/util/Collection;)[I

    move-result-object p2

    const-string p3, "android.media.extra.MAX_CHANNEL_COUNT"

    invoke-virtual {p1, p3, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/mE0;->e([II)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/mE0;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_18
    new-instance p0, Lcom/google/android/gms/internal/ads/mE0;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/gi0;->j()Lcom/google/android/gms/internal/ads/hi0;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Ij0;->h(Ljava/util/Collection;)[I

    move-result-object p1

    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/mE0;->e([II)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/mE0;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method private static e([II)Lcom/google/android/gms/internal/ads/ci0;
    .locals 4

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/Zh0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Zh0;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget v2, p0, v1

    new-instance v3, Lcom/google/android/gms/internal/ads/dE0;

    invoke-direct {v3, v2, p1}, Lcom/google/android/gms/internal/ads/dE0;-><init>(II)V

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/Zh0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Zh0;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Zh0;->j()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p0

    return-object p0
.end method

.method private static f()Z
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/EW;->c:Ljava/lang/String;

    const-string v1, "Amazon"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "Xiaomi"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/vS;)Landroid/util/Pair;
    .locals 8

    .prologue
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/D;->k:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/ed;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    sget-object v1, Lcom/google/android/gms/internal/ads/mE0;->e:Lcom/google/android/gms/internal/ads/fi0;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/fi0;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_5

    :cond_0
    const/4 v1, 0x7

    const/16 v2, 0x8

    const/4 v3, 0x6

    const/16 v4, 0x12

    if-ne v0, v4, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mE0;->a:Landroid/util/SparseArray;

    invoke-static {v0, v4}, Lcom/google/android/gms/internal/ads/EW;->g(Landroid/util/SparseArray;I)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_2

    :cond_1
    move v0, v4

    :cond_2
    if-ne v0, v2, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mE0;->a:Landroid/util/SparseArray;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/EW;->g(Landroid/util/SparseArray;I)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v2

    goto :goto_1

    :cond_3
    :goto_0
    move v0, v1

    goto :goto_2

    :cond_4
    :goto_1
    const/16 v5, 0x1e

    if-ne v0, v5, :cond_5

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/mE0;->a:Landroid/util/SparseArray;

    invoke-static {v6, v5}, Lcom/google/android/gms/internal/ads/EW;->g(Landroid/util/SparseArray;I)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_0

    :cond_5
    :goto_2
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/mE0;->a:Landroid/util/SparseArray;

    invoke-static {v5, v0}, Lcom/google/android/gms/internal/ads/EW;->g(Landroid/util/SparseArray;I)Z

    move-result v5

    if-eqz v5, :cond_f

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/mE0;->a:Landroid/util/SparseArray;

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/dE0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v6, p1, Lcom/google/android/gms/internal/ads/D;->D:I

    const/4 v7, -0x1

    if-eq v6, v7, :cond_8

    if-ne v0, v4, :cond_6

    goto :goto_3

    :cond_6
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    const-string p2, "audio/vnd.dts.uhd;profile=p2"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget p1, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 p2, 0x21

    if-ge p1, p2, :cond_7

    const/16 p1, 0xa

    if-le v6, p1, :cond_a

    goto :goto_5

    :cond_7
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/dE0;->b(I)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_5

    :cond_8
    :goto_3
    iget p1, p1, Lcom/google/android/gms/internal/ads/D;->E:I

    if-ne p1, v7, :cond_9

    const p1, 0xbb80

    :cond_9
    invoke-virtual {v5, p1, p2}, Lcom/google/android/gms/internal/ads/dE0;->a(ILcom/google/android/gms/internal/ads/vS;)I

    move-result v6

    :cond_a
    sget p1, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 p2, 0x1c

    if-gt p1, p2, :cond_d

    if-ne v6, v1, :cond_b

    goto :goto_4

    :cond_b
    const/4 p2, 0x3

    if-eq v6, p2, :cond_c

    const/4 p2, 0x4

    if-eq v6, p2, :cond_c

    const/4 p2, 0x5

    if-ne v6, p2, :cond_d

    :cond_c
    move v2, v3

    goto :goto_4

    :cond_d
    move v2, v6

    :goto_4
    const/16 p2, 0x1a

    if-gt p1, p2, :cond_e

    const-string p1, "fugu"

    sget-object p2, Lcom/google/android/gms/internal/ads/EW;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    const/4 p1, 0x1

    if-ne v2, p1, :cond_e

    const/4 v2, 0x2

    :cond_e
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/EW;->A(I)I

    move-result p1

    if-eqz p1, :cond_f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_f
    :goto_5
    const/4 p1, 0x0

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/ads/mE0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/mE0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mE0;->a:Landroid/util/SparseArray;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/mE0;->a:Landroid/util/SparseArray;

    sget v4, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v5, 0x1f

    if-lt v4, v5, :cond_2

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/ads/kE0;->a(Landroid/util/SparseArray;Landroid/util/SparseArray;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v4

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-ne v4, v5, :cond_4

    move v5, v2

    :goto_0
    if-ge v5, v4, :cond_3

    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v6

    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v3, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7, v6}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    iget v1, p0, Lcom/google/android/gms/internal/ads/mE0;->b:I

    iget p1, p1, Lcom/google/android/gms/internal/ads/mE0;->b:I

    if-ne v1, p1, :cond_4

    return v0

    :cond_4
    return v2
.end method

.method public final hashCode()I
    .locals 5

    .prologue
    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mE0;->a:Landroid/util/SparseArray;

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_0

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lE0;->a(Landroid/util/SparseArray;)I

    move-result v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    const/16 v3, 0x11

    :goto_0
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-ge v0, v4, :cond_1

    mul-int/lit8 v3, v3, 0x1f

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v4

    add-int/2addr v3, v4

    mul-int/2addr v3, v2

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lj$/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_1
    iget v1, p0, Lcom/google/android/gms/internal/ads/mE0;->b:I

    mul-int/2addr v0, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mE0;->a:Landroid/util/SparseArray;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AudioCapabilities[maxChannelCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/google/android/gms/internal/ads/mE0;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", audioProfiles="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
