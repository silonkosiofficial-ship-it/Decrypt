.class public final LG8/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LG8/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG8/n;

    invoke-direct {v0}, LG8/n;-><init>()V

    sput-object v0, LG8/n;->a:LG8/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LF8/t0;)Z
    .locals 4

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LF8/c;->a:LF8/c;

    sget-object v1, LG8/o;->a:LG8/o;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, LG8/o;->F0(ZZ)LF8/d0;

    move-result-object v1

    invoke-static {p1}, LF8/B;->c(LF8/E;)LF8/M;

    move-result-object p1

    sget-object v2, LF8/d0$c$b;->a:LF8/d0$c$b;

    invoke-virtual {v0, v1, p1, v2}, LF8/c;->a(LF8/d0;LJ8/j;LF8/d0$c;)Z

    move-result p1

    return p1
.end method
