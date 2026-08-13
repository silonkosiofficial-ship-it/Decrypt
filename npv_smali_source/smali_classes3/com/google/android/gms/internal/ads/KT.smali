.class public final Lcom/google/android/gms/internal/ads/KT;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/LT;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/MT;Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/NT;)Lcom/google/android/gms/internal/ads/QT;
    .locals 2

    .prologue
    const-string p0, "Google"

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/Pb0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Pb0;

    move-result-object p0

    const-string p1, "javascript"

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/KT;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Ob0;

    move-result-object p1

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/MT;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/KT;->n(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Gb0;

    move-result-object p2

    sget-object p7, Lcom/google/android/gms/internal/ads/Ob0;->F:Lcom/google/android/gms/internal/ads/Ob0;

    const/4 v0, 0x0

    if-ne p1, p7, :cond_0

    const-string p0, "Omid html session error; Unable to parse impression owner: javascript"

    :goto_0
    invoke-static {p0}, Lw3/p;->g(Ljava/lang/String;)V

    return-object v0

    :cond_0
    if-nez p2, :cond_1

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "Omid html session error; Unable to parse creative type: "

    :goto_1
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-static {p4}, Lcom/google/android/gms/internal/ads/KT;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Ob0;

    move-result-object p3

    sget-object v1, Lcom/google/android/gms/internal/ads/Gb0;->G:Lcom/google/android/gms/internal/ads/Gb0;

    if-ne p2, v1, :cond_2

    if-ne p3, p7, :cond_2

    invoke-static {p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "Omid html session error; Video events owner unknown for video creative: "

    goto :goto_1

    :cond_2
    const-string p4, ""

    invoke-static {p0, p5, p6, p4}, Lcom/google/android/gms/internal/ads/Db0;->b(Lcom/google/android/gms/internal/ads/Pb0;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Db0;

    move-result-object p0

    invoke-virtual {p8}, Lcom/google/android/gms/internal/ads/NT;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lcom/google/android/gms/internal/ads/KT;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Jb0;

    move-result-object p4

    const/4 p5, 0x1

    invoke-static {p2, p4, p1, p3, p5}, Lcom/google/android/gms/internal/ads/Cb0;->a(Lcom/google/android/gms/internal/ads/Gb0;Lcom/google/android/gms/internal/ads/Jb0;Lcom/google/android/gms/internal/ads/Ob0;Lcom/google/android/gms/internal/ads/Ob0;Z)Lcom/google/android/gms/internal/ads/Cb0;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/Bb0;->a(Lcom/google/android/gms/internal/ads/Cb0;Lcom/google/android/gms/internal/ads/Db0;)Lcom/google/android/gms/internal/ads/Bb0;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/QT;

    invoke-direct {p2, p1, p0}, Lcom/google/android/gms/internal/ads/QT;-><init>(Lcom/google/android/gms/internal/ads/Bb0;Lcom/google/android/gms/internal/ads/Db0;)V

    return-object p2
.end method

.method static synthetic m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/MT;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/NT;)Lcom/google/android/gms/internal/ads/QT;
    .locals 2

    .prologue
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/Pb0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Pb0;

    move-result-object p0

    const-string p1, "javascript"

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/KT;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Ob0;

    move-result-object p1

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/KT;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Ob0;

    move-result-object p2

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/MT;->toString()Ljava/lang/String;

    move-result-object p7

    invoke-static {p7}, Lcom/google/android/gms/internal/ads/KT;->n(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Gb0;

    move-result-object p7

    sget-object v0, Lcom/google/android/gms/internal/ads/Ob0;->F:Lcom/google/android/gms/internal/ads/Ob0;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    const-string p0, "Omid js session error; Unable to parse impression owner: javascript"

    :goto_0
    invoke-static {p0}, Lw3/p;->g(Ljava/lang/String;)V

    return-object v1

    :cond_0
    if-nez p7, :cond_1

    invoke-static {p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "Omid js session error; Unable to parse creative type: "

    :goto_1
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    sget-object p4, Lcom/google/android/gms/internal/ads/Gb0;->G:Lcom/google/android/gms/internal/ads/Gb0;

    if-ne p7, p4, :cond_2

    if-ne p2, v0, :cond_2

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "Omid js session error; Video events owner unknown for video creative: "

    goto :goto_1

    :cond_2
    const-string p3, ""

    invoke-static {p0, p5, p6, p3}, Lcom/google/android/gms/internal/ads/Db0;->c(Lcom/google/android/gms/internal/ads/Pb0;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Db0;

    move-result-object p0

    invoke-virtual {p8}, Lcom/google/android/gms/internal/ads/NT;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/KT;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Jb0;

    move-result-object p3

    const/4 p4, 0x1

    invoke-static {p7, p3, p1, p2, p4}, Lcom/google/android/gms/internal/ads/Cb0;->a(Lcom/google/android/gms/internal/ads/Gb0;Lcom/google/android/gms/internal/ads/Jb0;Lcom/google/android/gms/internal/ads/Ob0;Lcom/google/android/gms/internal/ads/Ob0;Z)Lcom/google/android/gms/internal/ads/Cb0;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/Bb0;->a(Lcom/google/android/gms/internal/ads/Cb0;Lcom/google/android/gms/internal/ads/Db0;)Lcom/google/android/gms/internal/ads/Bb0;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/QT;

    invoke-direct {p2, p1, p0}, Lcom/google/android/gms/internal/ads/QT;-><init>(Lcom/google/android/gms/internal/ads/Bb0;Lcom/google/android/gms/internal/ads/Db0;)V

    return-object p2
.end method

.method private static n(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Gb0;
    .locals 4

    .prologue
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x16d03d69

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    const v1, 0x6b0147b

    if-eq v0, v1, :cond_1

    const v1, 0x2a9c68ab

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "nativeDisplay"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    move p0, v3

    goto :goto_1

    :cond_1
    const-string v0, "video"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    move p0, v2

    goto :goto_1

    :cond_2
    const-string v0, "htmlDisplay"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p0, -0x1

    :goto_1
    if-eqz p0, :cond_6

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_4

    const/4 p0, 0x0

    return-object p0

    :cond_4
    sget-object p0, Lcom/google/android/gms/internal/ads/Gb0;->G:Lcom/google/android/gms/internal/ads/Gb0;

    return-object p0

    :cond_5
    sget-object p0, Lcom/google/android/gms/internal/ads/Gb0;->F:Lcom/google/android/gms/internal/ads/Gb0;

    return-object p0

    :cond_6
    sget-object p0, Lcom/google/android/gms/internal/ads/Gb0;->E:Lcom/google/android/gms/internal/ads/Gb0;

    return-object p0
.end method

.method private static o(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Jb0;
    .locals 4

    .prologue
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x41cfa846

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v1, :cond_2

    const v1, 0x4e906dcd

    if-eq v0, v1, :cond_1

    const v1, 0x768243c0

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "onePixel"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    move p0, v3

    goto :goto_1

    :cond_1
    const-string v0, "definedByJavascript"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    move p0, v2

    goto :goto_1

    :cond_2
    const-string v0, "beginToRender"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p0, -0x1

    :goto_1
    if-eqz p0, :cond_6

    if-eq p0, v2, :cond_5

    if-eq p0, v3, :cond_4

    sget-object p0, Lcom/google/android/gms/internal/ads/Jb0;->E:Lcom/google/android/gms/internal/ads/Jb0;

    return-object p0

    :cond_4
    sget-object p0, Lcom/google/android/gms/internal/ads/Jb0;->H:Lcom/google/android/gms/internal/ads/Jb0;

    return-object p0

    :cond_5
    sget-object p0, Lcom/google/android/gms/internal/ads/Jb0;->D:Lcom/google/android/gms/internal/ads/Jb0;

    return-object p0

    :cond_6
    sget-object p0, Lcom/google/android/gms/internal/ads/Jb0;->G:Lcom/google/android/gms/internal/ads/Jb0;

    return-object p0
.end method

.method private static p(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Ob0;
    .locals 1

    .prologue
    const-string v0, "native"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/ads/Ob0;->D:Lcom/google/android/gms/internal/ads/Ob0;

    return-object p0

    :cond_0
    const-string v0, "javascript"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lcom/google/android/gms/internal/ads/Ob0;->E:Lcom/google/android/gms/internal/ads/Ob0;

    return-object p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/Ob0;->F:Lcom/google/android/gms/internal/ads/Ob0;

    return-object p0
.end method

.method private static final q(Lcom/google/android/gms/internal/ads/JT;)Ljava/lang/Object;
    .locals 2

    .prologue
    :try_start_0
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/JT;->a()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "omid exception"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Lcom/google/android/gms/internal/ads/Uq;->w(Ljava/lang/Throwable;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static final r(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    :try_start_0
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string v0, "omid exception"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Lcom/google/android/gms/internal/ads/Uq;->w(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .prologue
    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->c5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/FT;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/FT;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/KT;->q(Lcom/google/android/gms/internal/ads/JT;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/Nb0;Landroid/view/View;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/ET;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/ET;-><init>(Lcom/google/android/gms/internal/ads/Nb0;Landroid/view/View;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/KT;->r(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/AT;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/AT;-><init>(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/KT;->r(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/xT;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/xT;-><init>(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/KT;->r(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/ads/Bb0;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->c5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zb0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/BT;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/BT;-><init>(Lcom/google/android/gms/internal/ads/Bb0;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/KT;->r(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final f(Landroid/content/Context;)Z
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->c5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "Omid flag is disabled"

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    return v1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/DT;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/DT;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/KT;->q(Lcom/google/android/gms/internal/ads/JT;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final g(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/NT;Lcom/google/android/gms/internal/ads/MT;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/QT;
    .locals 11

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->c5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zb0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/CT;

    const-string v9, ""

    const-string v4, "javascript"

    move-object v1, v0

    move-object/from16 v2, p6

    move-object v3, p1

    move-object/from16 v5, p5

    move-object/from16 v6, p8

    move-object v7, p2

    move-object/from16 v8, p9

    move-object/from16 v10, p7

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/CT;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/MT;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/NT;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/KT;->q(Lcom/google/android/gms/internal/ads/JT;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/QT;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final h(Lcom/google/android/gms/internal/ads/Bb0;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/IT;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/IT;-><init>(Lcom/google/android/gms/internal/ads/Bb0;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/KT;->r(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i(Lcom/google/android/gms/internal/ads/Nb0;Lcom/google/android/gms/internal/ads/iu;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/GT;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/GT;-><init>(Lcom/google/android/gms/internal/ads/Nb0;Lcom/google/android/gms/internal/ads/iu;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/KT;->r(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final j(Lw3/a;Landroid/webkit/WebView;Z)Lcom/google/android/gms/internal/ads/Nb0;
    .locals 1

    new-instance p3, Lcom/google/android/gms/internal/ads/HT;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, Lcom/google/android/gms/internal/ads/HT;-><init>(Lw3/a;Landroid/webkit/WebView;Z)V

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/KT;->q(Lcom/google/android/gms/internal/ads/JT;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Nb0;

    return-object p1
.end method

.method public final k(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/NT;Lcom/google/android/gms/internal/ads/MT;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/QT;
    .locals 11

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->c5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zb0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zT;

    const-string v4, "javascript"

    const-string v2, "Google"

    const-string v9, ""

    move-object v1, v0

    move-object v3, p1

    move-object/from16 v5, p7

    move-object/from16 v6, p5

    move-object v7, p2

    move-object/from16 v8, p8

    move-object/from16 v10, p6

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/zT;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/MT;Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/NT;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/KT;->q(Lcom/google/android/gms/internal/ads/JT;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/QT;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
