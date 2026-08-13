.class public final LR9/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR9/l$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR9/i;
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

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LQ9/d;->e:LQ9/d$a;

    invoke-virtual {p1}, LQ9/d$a;->b()Z

    move-result p1

    const/4 p1, 0x0

    return p1
.end method

.method public c(Ljavax/net/ssl/SSLSocket;)LR9/m;
    .locals 1

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LR9/i;

    invoke-direct {p1}, LR9/i;-><init>()V

    return-object p1
.end method
