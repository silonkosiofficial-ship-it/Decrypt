.class public final LR9/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR9/l$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR9/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljavax/net/ssl/SSLSocket;)Z
    .locals 1

    .prologue
    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LQ9/e;->e:LQ9/e$a;

    invoke-virtual {v0}, LQ9/e$a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lorg/conscrypt/Conscrypt;->isConscrypt(Ljavax/net/ssl/SSLSocket;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c(Ljavax/net/ssl/SSLSocket;)LR9/m;
    .locals 1

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LR9/k;

    invoke-direct {p1}, LR9/k;-><init>()V

    return-object p1
.end method
