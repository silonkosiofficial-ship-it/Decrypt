.class public final Lcom/google/android/gms/internal/ads/MB;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/eE;
.implements Lcom/google/android/gms/internal/ads/ZG;


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Lcom/google/android/gms/internal/ads/n70;

.field private final E:Lw3/a;

.field private final F:Lv3/s0;

.field private final G:Lcom/google/android/gms/internal/ads/pP;

.field private final H:Lcom/google/android/gms/internal/ads/T90;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/n70;Lw3/a;Lv3/s0;Lcom/google/android/gms/internal/ads/pP;Lcom/google/android/gms/internal/ads/T90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/MB;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/MB;->D:Lcom/google/android/gms/internal/ads/n70;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/MB;->E:Lw3/a;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/MB;->F:Lv3/s0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/MB;->G:Lcom/google/android/gms/internal/ads/pP;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/MB;->H:Lcom/google/android/gms/internal/ads/T90;

    return-void
.end method

.method private final b()V
    .locals 7

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->b4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/MB;->F:Lv3/s0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/MB;->C:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/MB;->E:Lw3/a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/MB;->D:Lcom/google/android/gms/internal/ads/n70;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/MB;->H:Lcom/google/android/gms/internal/ads/T90;

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/n70;->f:Ljava/lang/String;

    invoke-interface {v0}, Lv3/s0;->i()Lcom/google/android/gms/internal/ads/Oq;

    move-result-object v5

    invoke-static {}, Lr3/v;->d()Lr3/f;

    move-result-object v1

    invoke-virtual/range {v1 .. v6}, Lr3/f;->c(Landroid/content/Context;Lw3/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Oq;Lcom/google/android/gms/internal/ads/T90;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/MB;->G:Lcom/google/android/gms/internal/ads/pP;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pP;->r()V

    return-void
.end method


# virtual methods
.method public final B(Lcom/google/android/gms/internal/ads/Po;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/MB;->b()V

    return-void
.end method

.method public final G(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final a(LB3/N;)V
    .locals 1

    .prologue
    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->c4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/MB;->b()V

    :cond_0
    return-void
.end method

.method public final w0(Lcom/google/android/gms/internal/ads/e70;)V
    .locals 0

    return-void
.end method
