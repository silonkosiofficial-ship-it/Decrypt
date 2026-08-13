.class public final Lcom/google/android/gms/internal/ads/Ae0;
.super Lcom/google/android/gms/internal/ads/te0;
.source "SourceFile"


# instance fields
.field private C:Lcom/google/android/gms/internal/ads/Tg0;

.field private D:Lcom/google/android/gms/internal/ads/Tg0;

.field private E:Lcom/google/android/gms/internal/ads/ze0;

.field private F:Ljava/net/HttpURLConnection;


# direct methods
.method constructor <init>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/ve0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ve0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/we0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/we0;-><init>()V

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/ads/Ae0;-><init>(Lcom/google/android/gms/internal/ads/Tg0;Lcom/google/android/gms/internal/ads/Tg0;Lcom/google/android/gms/internal/ads/ze0;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/ads/Tg0;Lcom/google/android/gms/internal/ads/Tg0;Lcom/google/android/gms/internal/ads/ze0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/te0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ae0;->C:Lcom/google/android/gms/internal/ads/Tg0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ae0;->D:Lcom/google/android/gms/internal/ads/Tg0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Ae0;->E:Lcom/google/android/gms/internal/ads/ze0;

    return-void
.end method

.method static synthetic f()Ljava/lang/Integer;
    .locals 1

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method static synthetic g()Ljava/lang/Integer;
    .locals 1

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method static synthetic i(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method static synthetic o(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static y(Ljava/net/HttpURLConnection;)V
    .locals 0

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/ue0;->a()V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ae0;->F:Ljava/net/HttpURLConnection;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Ae0;->y(Ljava/net/HttpURLConnection;)V

    return-void
.end method

.method public r()Ljava/net/HttpURLConnection;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ae0;->C:Lcom/google/android/gms/internal/ads/Tg0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Tg0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ae0;->D:Lcom/google/android/gms/internal/ads/Tg0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Tg0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/ue0;->b(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ae0;->E:Lcom/google/android/gms/internal/ads/ze0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ze0;->a()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Ae0;->F:Ljava/net/HttpURLConnection;

    return-object v0
.end method

.method public s(Lcom/google/android/gms/internal/ads/ze0;II)Ljava/net/HttpURLConnection;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/xe0;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/xe0;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Ae0;->C:Lcom/google/android/gms/internal/ads/Tg0;

    new-instance p2, Lcom/google/android/gms/internal/ads/ye0;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/ye0;-><init>(I)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ae0;->D:Lcom/google/android/gms/internal/ads/Tg0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ae0;->E:Lcom/google/android/gms/internal/ads/ze0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Ae0;->r()Ljava/net/HttpURLConnection;

    move-result-object p1

    return-object p1
.end method
