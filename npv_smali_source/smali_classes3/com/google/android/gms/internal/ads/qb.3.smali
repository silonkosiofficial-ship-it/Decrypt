.class public final Lcom/google/android/gms/internal/ads/qb;
.super Lcom/google/android/gms/internal/ads/tb;
.source "SourceFile"


# instance fields
.field private final h:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Da;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/u8;IILandroid/view/View;)V
    .locals 7

    const-string v3, "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc="

    const/16 v6, 0x39

    const-string v2, "mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg"

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/tb;-><init>(Lcom/google/android/gms/internal/ads/Da;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/u8;II)V

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/qb;->h:Landroid/view/View;

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qb;->h:Landroid/view/View;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->y3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->Qa:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/tb;->a:Lcom/google/android/gms/internal/ads/Da;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Da;->b()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/tb;->e:Ljava/lang/reflect/Method;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/qb;->h:Landroid/view/View;

    const/4 v5, 0x0

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v4, v6, v7

    const/4 v4, 0x1

    aput-object v2, v6, v4

    const/4 v2, 0x2

    aput-object v0, v6, v2

    const/4 v2, 0x3

    aput-object v1, v6, v2

    invoke-virtual {v3, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v3, Lcom/google/android/gms/internal/ads/Ha;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/Ha;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/P8;->b0()Lcom/google/android/gms/internal/ads/O8;

    move-result-object v2

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/Ha;->b:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/internal/ads/O8;->A(J)Lcom/google/android/gms/internal/ads/O8;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/Ha;->c:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/internal/ads/O8;->C(J)Lcom/google/android/gms/internal/ads/O8;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/Ha;->d:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/internal/ads/O8;->E(J)Lcom/google/android/gms/internal/ads/O8;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v3, Lcom/google/android/gms/internal/ads/Ha;->f:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/internal/ads/O8;->B(J)Lcom/google/android/gms/internal/ads/O8;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v3, Lcom/google/android/gms/internal/ads/Ha;->e:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/O8;->z(J)Lcom/google/android/gms/internal/ads/O8;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tb;->d:Lcom/google/android/gms/internal/ads/u8;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/P8;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/u8;->a0(Lcom/google/android/gms/internal/ads/P8;)Lcom/google/android/gms/internal/ads/u8;

    :cond_2
    return-void
.end method
