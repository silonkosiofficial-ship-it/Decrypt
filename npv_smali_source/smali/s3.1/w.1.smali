.class public final Ls3/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ls3/V1;

.field private final b:Ls3/T1;

.field private final c:Ls3/v1;

.field private final d:Lcom/google/android/gms/internal/ads/mi;

.field private final e:Lcom/google/android/gms/internal/ads/Jn;

.field private final f:Lcom/google/android/gms/internal/ads/ni;

.field private g:Lcom/google/android/gms/internal/ads/no;

.field private final h:Ls3/W1;


# direct methods
.method public constructor <init>(Ls3/V1;Ls3/T1;Ls3/v1;Lcom/google/android/gms/internal/ads/mi;Lcom/google/android/gms/internal/ads/Ip;Lcom/google/android/gms/internal/ads/Jn;Lcom/google/android/gms/internal/ads/ni;Ls3/W1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/w;->a:Ls3/V1;

    iput-object p2, p0, Ls3/w;->b:Ls3/T1;

    iput-object p3, p0, Ls3/w;->c:Ls3/v1;

    iput-object p4, p0, Ls3/w;->d:Lcom/google/android/gms/internal/ads/mi;

    iput-object p6, p0, Ls3/w;->e:Lcom/google/android/gms/internal/ads/Jn;

    iput-object p7, p0, Ls3/w;->f:Lcom/google/android/gms/internal/ads/ni;

    iput-object p8, p0, Ls3/w;->h:Ls3/W1;

    return-void
.end method

.method static bridge synthetic a(Ls3/w;)Ls3/T1;
    .locals 0

    iget-object p0, p0, Ls3/w;->b:Ls3/T1;

    return-object p0
.end method

.method static bridge synthetic b(Ls3/w;)Ls3/V1;
    .locals 0

    iget-object p0, p0, Ls3/w;->a:Ls3/V1;

    return-object p0
.end method

.method static bridge synthetic g(Ls3/w;)Ls3/v1;
    .locals 0

    iget-object p0, p0, Ls3/w;->c:Ls3/v1;

    return-object p0
.end method

.method static bridge synthetic i(Ls3/w;)Lcom/google/android/gms/internal/ads/mi;
    .locals 0

    iget-object p0, p0, Ls3/w;->d:Lcom/google/android/gms/internal/ads/mi;

    return-object p0
.end method

.method static bridge synthetic k(Ls3/w;)Lcom/google/android/gms/internal/ads/Jn;
    .locals 0

    iget-object p0, p0, Ls3/w;->e:Lcom/google/android/gms/internal/ads/Jn;

    return-object p0
.end method

.method static bridge synthetic m(Ls3/w;)Lcom/google/android/gms/internal/ads/no;
    .locals 0

    iget-object p0, p0, Ls3/w;->g:Lcom/google/android/gms/internal/ads/no;

    return-object p0
.end method

.method static bridge synthetic p(Ls3/w;Lcom/google/android/gms/internal/ads/no;)V
    .locals 0

    iput-object p1, p0, Ls3/w;->g:Lcom/google/android/gms/internal/ads/no;

    return-void
.end method

.method static bridge synthetic q(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v0, "action"

    const-string v1, "no_ads_fallback"

    invoke-virtual {v4, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "flow"

    invoke-virtual {v4, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ls3/y;->b()Lw3/g;

    move-result-object v0

    invoke-static {}, Ls3/y;->c()Lw3/a;

    move-result-object p1

    iget-object v2, p1, Lw3/a;->C:Ljava/lang/String;

    const-string v3, "gmob-apps"

    const/4 v5, 0x1

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lw3/g;->p(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Z)V

    return-void
.end method


# virtual methods
.method public final c(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)Ls3/Q;
    .locals 1

    new-instance v0, Ls3/q;

    invoke-direct {v0, p0, p1, p2, p3}, Ls3/q;-><init>(Ls3/w;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)V

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Ls3/x;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/Q;

    return-object p1
.end method

.method public final d(Landroid/content/Context;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)Ls3/V;
    .locals 7

    new-instance v6, Ls3/m;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ls3/m;-><init>(Ls3/w;Landroid/content/Context;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)V

    const/4 p2, 0x0

    invoke-virtual {v6, p1, p2}, Ls3/x;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/V;

    return-object p1
.end method

.method public final e(Landroid/content/Context;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)Ls3/V;
    .locals 7

    new-instance v6, Ls3/o;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ls3/o;-><init>(Ls3/w;Landroid/content/Context;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)V

    const/4 p2, 0x0

    invoke-virtual {v6, p1, p2}, Ls3/x;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/V;

    return-object p1
.end method

.method public final f(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Vl;)Ls3/Q0;
    .locals 1

    new-instance v0, Ls3/g;

    invoke-direct {v0, p0, p1, p2}, Ls3/g;-><init>(Ls3/w;Landroid/content/Context;Lcom/google/android/gms/internal/ads/Vl;)V

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Ls3/x;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/Q0;

    return-object p1
.end method

.method public final h(Landroid/content/Context;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)Lcom/google/android/gms/internal/ads/th;
    .locals 1

    new-instance v0, Ls3/u;

    invoke-direct {v0, p0, p2, p3, p1}, Ls3/u;-><init>(Ls3/w;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/content/Context;)V

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Ls3/x;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/th;

    return-object p1
.end method

.method public final j(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Vl;)Lcom/google/android/gms/internal/ads/En;
    .locals 1

    new-instance v0, Ls3/k;

    invoke-direct {v0, p0, p1, p2}, Ls3/k;-><init>(Ls3/w;Landroid/content/Context;Lcom/google/android/gms/internal/ads/Vl;)V

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Ls3/x;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/En;

    return-object p1
.end method

.method public final l(Landroid/app/Activity;)Lcom/google/android/gms/internal/ads/Mn;
    .locals 5

    .prologue
    new-instance v0, Ls3/e;

    invoke-direct {v0, p0, p1}, Ls3/e;-><init>(Ls3/w;Landroid/app/Activity;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "com.google.android.gms.ads.internal.overlay.useClientJar"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    const-string v1, "useClientJar flag not found in activity intent extras."

    invoke-static {v1}, Lw3/p;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    :goto_0
    invoke-virtual {v0, p1, v4}, Ls3/x;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Mn;

    return-object p1
.end method

.method public final n(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)Lcom/google/android/gms/internal/ads/vp;
    .locals 1

    new-instance v0, Ls3/c;

    invoke-direct {v0, p0, p1, p2, p3}, Ls3/c;-><init>(Ls3/w;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)V

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Ls3/x;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/vp;

    return-object p1
.end method

.method public final o(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Vl;)Lcom/google/android/gms/internal/ads/Bq;
    .locals 1

    new-instance v0, Ls3/i;

    invoke-direct {v0, p0, p1, p2}, Ls3/i;-><init>(Ls3/w;Landroid/content/Context;Lcom/google/android/gms/internal/ads/Vl;)V

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Ls3/x;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Bq;

    return-object p1
.end method
