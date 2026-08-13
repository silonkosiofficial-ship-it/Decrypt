.class final LI4/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LK4/x;

.field private final b:Ljava/lang/String;

.field final c:LK4/d;


# direct methods
.method constructor <init>(Landroid/content/Context;LK4/x;)V
    .locals 8

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LI4/k;->b:Ljava/lang/String;

    iput-object p2, p0, LI4/k;->a:LK4/x;

    invoke-static {p1}, LK4/h;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Phonesky is not installed."

    invoke-virtual {p2, v0, p1}, LK4/x;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    const/4 p1, 0x0

    iput-object p1, p0, LI4/k;->c:LK4/d;

    return-void

    :cond_0
    new-instance v7, LK4/d;

    sget-object v4, LI4/l;->a:Landroid/content/Intent;

    sget-object v5, LI4/g;->a:LI4/g;

    const/4 v6, 0x0

    const-string v3, "IntegrityService"

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, LK4/d;-><init>(Landroid/content/Context;LK4/x;Ljava/lang/String;Landroid/content/Intent;LK4/E;LK4/D;)V

    iput-object v7, p0, LI4/k;->c:LK4/d;

    return-void
.end method

.method static bridge synthetic a(LI4/k;[BLjava/lang/Long;Landroid/os/Parcelable;)Landroid/os/Bundle;
    .locals 1

    .prologue
    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    const-string v0, "package.name"

    iget-object p0, p0, LI4/k;->b:Ljava/lang/String;

    invoke-virtual {p3, v0, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "nonce"

    invoke-virtual {p3, p0, p1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    const-string p0, "playcore.integrity.version.major"

    const/4 p1, 0x1

    invoke-virtual {p3, p0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "playcore.integrity.version.minor"

    const/4 p1, 0x2

    invoke-virtual {p3, p0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "playcore.integrity.version.patch"

    const/4 p1, 0x0

    invoke-virtual {p3, p0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    if-eqz p2, :cond_0

    const-string p0, "cloud.prj"

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p3, p0, p1, p2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const/4 p1, 0x3

    invoke-static {p1, p0}, LK4/p;->b(ILjava/util/List;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p0}, LK4/p;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p0, "event_timestamps"

    invoke-virtual {p3, p0, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object p3
.end method

.method static bridge synthetic c(LI4/k;)LK4/x;
    .locals 0

    iget-object p0, p0, LI4/k;->a:LK4/x;

    return-object p0
.end method


# virtual methods
.method public final b(LI4/d;)Ll4/l;
    .locals 11

    .prologue
    iget-object v0, p0, LI4/k;->c:LK4/d;

    if-nez v0, :cond_0

    new-instance p1, LI4/c;

    const/4 v0, -0x2

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LI4/c;-><init>(ILjava/lang/Throwable;)V

    invoke-static {p1}, Ll4/o;->d(Ljava/lang/Exception;)Ll4/l;

    move-result-object p1

    return-object p1

    :cond_0
    :try_start_0
    invoke-virtual {p1}, LI4/d;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, LI4/d;->c()Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {p1}, LI4/d;->a()Landroid/net/Network;

    iget-object v0, p0, LI4/k;->a:LK4/x;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "requestIntegrityToken(%s)"

    invoke-virtual {v0, v2, v1}, LK4/x;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Ll4/m;

    invoke-direct {v0}, Ll4/m;-><init>()V

    iget-object v1, p0, LI4/k;->c:LK4/d;

    new-instance v10, LI4/h;

    const/4 v7, 0x0

    move-object v2, v10

    move-object v3, p0

    move-object v4, v0

    move-object v8, v0

    move-object v9, p1

    invoke-direct/range {v2 .. v9}, LI4/h;-><init>(LI4/k;Ll4/m;[BLjava/lang/Long;Landroid/os/Parcelable;Ll4/m;LI4/d;)V

    invoke-virtual {v1, v10, v0}, LK4/d;->t(LK4/y;Ll4/m;)V

    invoke-virtual {v0}, Ll4/m;->a()Ll4/l;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, LI4/c;

    const/16 v1, -0xd

    invoke-direct {v0, v1, p1}, LI4/c;-><init>(ILjava/lang/Throwable;)V

    invoke-static {v0}, Ll4/o;->d(Ljava/lang/Exception;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
