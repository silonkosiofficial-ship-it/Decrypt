.class public final LF6/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LF6/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF6/n;

    invoke-direct {v0}, LF6/n;-><init>()V

    sput-object v0, LF6/n;->a:LF6/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT6/g0;)Ljava/net/Proxy;
    .locals 4

    const-string v0, "url"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/net/Proxy;

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    new-instance v2, Ljava/net/InetSocketAddress;

    invoke-virtual {p1}, LT6/g0;->p()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, LT6/g0;->q()I

    move-result p1

    invoke-direct {v2, v3, p1}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-direct {v0, v1, v2}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    return-object v0
.end method
