.class public final LW9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LW9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW9/d;

    invoke-direct {v0}, LW9/d;-><init>()V

    sput-object v0, LW9/d;->a:LW9/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LH9/x;LH9/z;LW9/b;)LW9/a;
    .locals 0

    invoke-static {p0, p1, p2}, LW9/d;->c(LH9/x;LH9/z;LW9/b;)LW9/a;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LH9/x;)LW9/a$a;
    .locals 1

    const-string v0, "client"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LW9/c;

    invoke-direct {v0, p0}, LW9/c;-><init>(LH9/x;)V

    return-object v0
.end method

.method private static final c(LH9/x;LH9/z;LW9/b;)LW9/a;
    .locals 2

    .prologue
    const-string v0, "$client"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Accept"

    invoke-virtual {p1, v0}, LH9/z;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, LH9/z;->h()LH9/z$a;

    move-result-object p1

    const-string v1, "text/event-stream"

    invoke-virtual {p1, v0, v1}, LH9/z$a;->a(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    move-result-object p1

    invoke-virtual {p1}, LH9/z$a;->b()LH9/z;

    move-result-object p1

    :cond_0
    new-instance v0, LT9/a;

    invoke-direct {v0, p1, p2}, LT9/a;-><init>(LH9/z;LW9/b;)V

    invoke-virtual {v0, p0}, LT9/a;->e(LH9/x;)V

    return-object v0
.end method
