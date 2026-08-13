.class public final Lcom/google/android/gms/internal/ads/JV;
.super Lcom/google/android/gms/internal/ads/IV;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Su;

.field private final b:Lcom/google/android/gms/internal/ads/lC;

.field private final c:Lcom/google/android/gms/internal/ads/EF;

.field private final d:Lcom/google/android/gms/internal/ads/TV;

.field private final e:Lcom/google/android/gms/internal/ads/bU;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Su;Lcom/google/android/gms/internal/ads/lC;Lcom/google/android/gms/internal/ads/EF;Lcom/google/android/gms/internal/ads/TV;Lcom/google/android/gms/internal/ads/bU;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/IV;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/JV;->a:Lcom/google/android/gms/internal/ads/Su;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/JV;->b:Lcom/google/android/gms/internal/ads/lC;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/JV;->c:Lcom/google/android/gms/internal/ads/EF;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/JV;->d:Lcom/google/android/gms/internal/ads/TV;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/JV;->e:Lcom/google/android/gms/internal/ads/bU;

    return-void
.end method


# virtual methods
.method protected final c(Lcom/google/android/gms/internal/ads/n70;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/e70;)LP4/d;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/JV;->b:Lcom/google/android/gms/internal/ads/lC;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/lC;->k(Lcom/google/android/gms/internal/ads/n70;)Lcom/google/android/gms/internal/ads/lC;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/lC;->g(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/lC;

    new-instance p1, Lcom/google/android/gms/internal/ads/dC;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/JV;->d:Lcom/google/android/gms/internal/ads/TV;

    invoke-direct {p1, p4, p3, p2}, Lcom/google/android/gms/internal/ads/dC;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/TV;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/lC;->h(Lcom/google/android/gms/internal/ads/dC;)Lcom/google/android/gms/internal/ads/lC;

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->H3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/JV;->b:Lcom/google/android/gms/internal/ads/lC;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/JV;->e:Lcom/google/android/gms/internal/ads/bU;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/lC;->e(Lcom/google/android/gms/internal/ads/bU;)Lcom/google/android/gms/internal/ads/lC;

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/JV;->a:Lcom/google/android/gms/internal/ads/Su;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/JV;->b:Lcom/google/android/gms/internal/ads/lC;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Su;->k()Lcom/google/android/gms/internal/ads/Cy;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/lC;->l()Lcom/google/android/gms/internal/ads/nC;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/Cy;->a(Lcom/google/android/gms/internal/ads/nC;)Lcom/google/android/gms/internal/ads/Cy;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/JV;->c:Lcom/google/android/gms/internal/ads/EF;

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/Cy;->b(Lcom/google/android/gms/internal/ads/EF;)Lcom/google/android/gms/internal/ads/Cy;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Cy;->d()Lcom/google/android/gms/internal/ads/Ey;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ey;->b()Lcom/google/android/gms/internal/ads/LA;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/LA;->i()LP4/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/LA;->h(LP4/d;)LP4/d;

    move-result-object p1

    return-object p1
.end method
