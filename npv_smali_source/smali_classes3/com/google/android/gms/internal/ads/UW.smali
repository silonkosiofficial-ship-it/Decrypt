.class public final Lcom/google/android/gms/internal/ads/UW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/VT;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/vz;

.field private final c:Lcom/google/android/gms/internal/ads/Wf;

.field private final d:Lcom/google/android/gms/internal/ads/Yk0;

.field private final e:Lcom/google/android/gms/internal/ads/v90;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/vz;Lcom/google/android/gms/internal/ads/v90;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/Wf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/UW;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/UW;->b:Lcom/google/android/gms/internal/ads/vz;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/UW;->e:Lcom/google/android/gms/internal/ads/v90;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/UW;->d:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/UW;->c:Lcom/google/android/gms/internal/ads/Wf;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)Z
    .locals 0

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/UW;->c:Lcom/google/android/gms/internal/ads/Wf;

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/W60;->a:Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)LP4/d;
    .locals 7

    new-instance v6, Lcom/google/android/gms/internal/ads/SW;

    new-instance v2, Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/UW;->a:Landroid/content/Context;

    invoke-direct {v2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v4, Lcom/google/android/gms/internal/ads/QW;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/QW;-><init>()V

    iget-object v0, p2, Lcom/google/android/gms/internal/ads/R60;->u:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/android/gms/internal/ads/S60;

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/SW;-><init>(Lcom/google/android/gms/internal/ads/UW;Landroid/view/View;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/dA;Lcom/google/android/gms/internal/ads/S60;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/wA;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/UW;->b:Lcom/google/android/gms/internal/ads/vz;

    invoke-virtual {p1, v0, v6}, Lcom/google/android/gms/internal/ads/vz;->a(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/Xy;)Lcom/google/android/gms/internal/ads/Ry;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/Rf;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ry;->l()Lcom/google/android/gms/internal/ads/TW;

    move-result-object v1

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/W60;->b:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/W60;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Lcom/google/android/gms/internal/ads/Rf;-><init>(Lr3/g;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p2, Lcom/google/android/gms/internal/ads/p90;->W:Lcom/google/android/gms/internal/ads/p90;

    new-instance v1, Lcom/google/android/gms/internal/ads/RW;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/RW;-><init>(Lcom/google/android/gms/internal/ads/UW;Lcom/google/android/gms/internal/ads/Rf;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/UW;->e:Lcom/google/android/gms/internal/ads/v90;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/UW;->d:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v1, v2, p2, v0}, Lcom/google/android/gms/internal/ads/e90;->d(Lcom/google/android/gms/internal/ads/Z80;Lcom/google/android/gms/internal/ads/Yk0;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p2

    sget-object v0, Lcom/google/android/gms/internal/ads/p90;->X:Lcom/google/android/gms/internal/ads/p90;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/l90;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ry;->h()Lcom/google/android/gms/internal/ads/Qy;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/l90;->d(LP4/d;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/Rf;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/UW;->c:Lcom/google/android/gms/internal/ads/Wf;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Wf;->d1(Lcom/google/android/gms/internal/ads/Tf;)V

    return-void
.end method
