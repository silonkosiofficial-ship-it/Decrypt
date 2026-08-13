.class public final LU5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU5/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU5/d$a;
    }
.end annotation


# static fields
.field public static final d:LU5/d$a;


# instance fields
.field private final a:LS5/b;

.field private final b:Lm7/i;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LU5/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU5/d$a;-><init>(Ly7/k;)V

    sput-object v0, LU5/d;->d:LU5/d$a;

    return-void
.end method

.method public constructor <init>(LS5/b;Lm7/i;Ljava/lang/String;)V
    .locals 1

    const-string v0, "appInfo"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blockingDispatcher"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseUrl"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU5/d;->a:LS5/b;

    iput-object p2, p0, LU5/d;->b:Lm7/i;

    iput-object p3, p0, LU5/d;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(LS5/b;Lm7/i;Ljava/lang/String;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const-string p3, "firebase-settings.crashlytics.com"

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LU5/d;-><init>(LS5/b;Lm7/i;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic b(LU5/d;)Ljava/net/URL;
    .locals 0

    invoke-direct {p0}, LU5/d;->c()Ljava/net/URL;

    move-result-object p0

    return-object p0
.end method

.method private final c()Ljava/net/URL;
    .locals 3

    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "https"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    iget-object v1, p0, LU5/d;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "spi"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "v2"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "platforms"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "android"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "gmp"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    iget-object v1, p0, LU5/d;->a:LS5/b;

    invoke-virtual {v1}, LS5/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "settings"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    iget-object v1, p0, LU5/d;->a:LS5/b;

    invoke-virtual {v1}, LS5/b;->a()LS5/a;

    move-result-object v1

    invoke-virtual {v1}, LS5/a;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "build_version"

    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    iget-object v1, p0, LU5/d;->a:LS5/b;

    invoke-virtual {v1}, LS5/b;->a()LS5/a;

    move-result-object v1

    invoke-virtual {v1}, LS5/a;->f()Ljava/lang/String;

    move-result-object v1

    const-string v2, "display_version"

    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    new-instance v1, Ljava/net/URL;

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public a(Ljava/util/Map;Lx7/p;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    iget-object v0, p0, LU5/d;->b:Lm7/i;

    new-instance v7, LU5/d$b;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, LU5/d$b;-><init>(LU5/d;Ljava/util/Map;Lx7/p;Lx7/p;Lm7/e;)V

    invoke-static {v0, v7, p4}, LW8/g;->g(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
