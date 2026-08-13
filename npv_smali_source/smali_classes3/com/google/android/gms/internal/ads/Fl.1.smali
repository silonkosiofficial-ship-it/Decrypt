.class public final Lcom/google/android/gms/internal/ads/Fl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/hl;

.field private b:LP4/d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/hl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Fl;->a:Lcom/google/android/gms/internal/ads/hl;

    return-void
.end method

.method private final d()V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fl;->b:LP4/d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Fl;->b:LP4/d;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Fl;->a:Lcom/google/android/gms/internal/ads/hl;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/hl;->b(Lcom/google/android/gms/internal/ads/Z9;)Lcom/google/android/gms/internal/ads/bl;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/Cl;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/Cl;-><init>(Lcom/google/android/gms/internal/ads/mr;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/Dl;

    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/ads/Dl;-><init>(Lcom/google/android/gms/internal/ads/mr;)V

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/tr;->f(Lcom/google/android/gms/internal/ads/qr;Lcom/google/android/gms/internal/ads/or;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ol;Lcom/google/android/gms/internal/ads/nl;)Lcom/google/android/gms/internal/ads/Il;
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Fl;->d()V

    new-instance p1, Lcom/google/android/gms/internal/ads/Il;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fl;->b:LP4/d;

    const-string v1, "google.afma.activeView.handleUpdate"

    invoke-direct {p1, v0, v1, p2, p3}, Lcom/google/android/gms/internal/ads/Il;-><init>(LP4/d;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ol;Lcom/google/android/gms/internal/ads/nl;)V

    return-object p1
.end method

.method public final b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Fl;->d()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fl;->b:LP4/d;

    new-instance v1, Lcom/google/android/gms/internal/ads/El;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/ads/El;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Fl;->b:LP4/d;

    return-void
.end method

.method public final c(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fl;->b:LP4/d;

    new-instance v1, Lcom/google/android/gms/internal/ads/Bl;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/ads/Bl;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Nk0;->m(LP4/d;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Fl;->b:LP4/d;

    return-void
.end method
