.class public final LU9/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LU9/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljavax/net/ssl/X509TrustManager;)LU9/c;
    .locals 1

    const-string v0, "trustManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LQ9/k;->a:LQ9/k$a;

    invoke-virtual {v0}, LQ9/k$a;->g()LQ9/k;

    move-result-object v0

    invoke-virtual {v0, p1}, LQ9/k;->c(Ljavax/net/ssl/X509TrustManager;)LU9/c;

    move-result-object p1

    return-object p1
.end method
