.class public final Lcom/google/android/gms/internal/ads/NW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/VT;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/XT;

.field private final b:Lcom/google/android/gms/internal/ads/cU;

.field private final c:Lcom/google/android/gms/internal/ads/v90;

.field private final d:Lcom/google/android/gms/internal/ads/Yk0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/v90;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/XT;Lcom/google/android/gms/internal/ads/cU;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/NW;->c:Lcom/google/android/gms/internal/ads/v90;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/NW;->d:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/NW;->b:Lcom/google/android/gms/internal/ads/cU;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/NW;->a:Lcom/google/android/gms/internal/ads/XT;

    return-void
.end method

.method static final e(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error from: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", code: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)Z
    .locals 0

    .prologue
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/R60;->t:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)LP4/d;
    .locals 6

    .prologue
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/R60;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/NW;->a:Lcom/google/android/gms/internal/ads/XT;

    iget-object v3, p2, Lcom/google/android/gms/internal/ads/R60;->v:Lorg/json/JSONObject;

    invoke-interface {v2, v1, v3}, Lcom/google/android/gms/internal/ads/XT;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/YT;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/u70; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance p1, Lcom/google/android/gms/internal/ads/AV;

    const-string p2, "Unable to instantiate mediation adapter class."

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/AV;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/MW;

    invoke-direct {v2, p0, v0, v1}, Lcom/google/android/gms/internal/ads/MW;-><init>(Lcom/google/android/gms/internal/ads/NW;Lcom/google/android/gms/internal/ads/YT;Lcom/google/android/gms/internal/ads/mr;)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/ads/qD;->L0(Lcom/google/android/gms/internal/ads/pD;)V

    iget-boolean v2, p2, Lcom/google/android/gms/internal/ads/R60;->M:Z

    if-eqz v2, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    iget-object v2, v2, Ls3/X1;->O:Landroid/os/Bundle;

    const-class v3, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    if-nez v4, :cond_2

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    const-string v2, "render_test_ad_label"

    const/4 v3, 0x1

    invoke-virtual {v4, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/NW;->c:Lcom/google/android/gms/internal/ads/v90;

    sget-object v3, Lcom/google/android/gms/internal/ads/p90;->T:Lcom/google/android/gms/internal/ads/p90;

    new-instance v4, Lcom/google/android/gms/internal/ads/KW;

    invoke-direct {v4, p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/KW;-><init>(Lcom/google/android/gms/internal/ads/NW;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/NW;->d:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v4, v5, v3, v2}, Lcom/google/android/gms/internal/ads/e90;->d(Lcom/google/android/gms/internal/ads/Z80;Lcom/google/android/gms/internal/ads/Yk0;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/ads/p90;->U:Lcom/google/android/gms/internal/ads/p90;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/l90;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/l90;->d(LP4/d;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/p90;->V:Lcom/google/android/gms/internal/ads/p90;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/l90;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/LW;

    invoke-direct {v2, p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/LW;-><init>(Lcom/google/android/gms/internal/ads/NW;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/l90;->e(Lcom/google/android/gms/internal/ads/Y80;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;Ljava/lang/Void;)Ljava/lang/Object;
    .locals 0

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/NW;->b:Lcom/google/android/gms/internal/ads/cU;

    invoke-interface {p4, p1, p2, p3}, Lcom/google/android/gms/internal/ads/cU;->b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final synthetic d(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NW;->b:Lcom/google/android/gms/internal/ads/cU;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/cU;->a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V

    return-void
.end method
