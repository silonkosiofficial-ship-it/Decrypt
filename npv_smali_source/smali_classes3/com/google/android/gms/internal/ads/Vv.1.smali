.class final Lcom/google/android/gms/internal/ads/Vv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/SO;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/Ij;

.field private final c:Lcom/google/android/gms/internal/ads/Ev;

.field private final d:Lcom/google/android/gms/internal/ads/Vv;

.field private final e:Lcom/google/android/gms/internal/ads/kz0;

.field private final f:Lcom/google/android/gms/internal/ads/kz0;

.field private final g:Lcom/google/android/gms/internal/ads/kz0;

.field private final h:Lcom/google/android/gms/internal/ads/kz0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Ev;Landroid/content/Context;Lcom/google/android/gms/internal/ads/Ij;Lcom/google/android/gms/internal/ads/kw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/google/android/gms/internal/ads/Vv;->d:Lcom/google/android/gms/internal/ads/Vv;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Vv;->c:Lcom/google/android/gms/internal/ads/Ev;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Vv;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Vv;->b:Lcom/google/android/gms/internal/ads/Ij;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/bz0;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/az0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Vv;->e:Lcom/google/android/gms/internal/ads/kz0;

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/bz0;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/az0;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Vv;->f:Lcom/google/android/gms/internal/ads/kz0;

    new-instance p3, Lcom/google/android/gms/internal/ads/OO;

    invoke-direct {p3, p2}, Lcom/google/android/gms/internal/ads/OO;-><init>(Lcom/google/android/gms/internal/ads/rz0;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Vv;->g:Lcom/google/android/gms/internal/ads/kz0;

    new-instance p2, Lcom/google/android/gms/internal/ads/QO;

    invoke-direct {p2, p1, p3}, Lcom/google/android/gms/internal/ads/QO;-><init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Zy0;->c(Lcom/google/android/gms/internal/ads/kz0;)Lcom/google/android/gms/internal/ads/kz0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Vv;->h:Lcom/google/android/gms/internal/ads/kz0;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/Vv;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Vv;->a:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ads/Vv;)Lcom/google/android/gms/internal/ads/NO;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Vv;->b:Lcom/google/android/gms/internal/ads/Ij;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/OO;->c(Lcom/google/android/gms/internal/ads/Ij;)Lcom/google/android/gms/internal/ads/NO;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/ads/HO;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/Sv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vv;->c:Lcom/google/android/gms/internal/ads/Ev;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Vv;->d:Lcom/google/android/gms/internal/ads/Vv;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/Sv;-><init>(Lcom/google/android/gms/internal/ads/Ev;Lcom/google/android/gms/internal/ads/Vv;Lcom/google/android/gms/internal/ads/kw;)V

    return-object v0
.end method

.method public final f()Lcom/google/android/gms/internal/ads/PO;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Vv;->h:Lcom/google/android/gms/internal/ads/kz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/PO;

    return-object v0
.end method
