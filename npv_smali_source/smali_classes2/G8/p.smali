.class public final LG8/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LG8/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG8/p;

    invoke-direct {v0}, LG8/p;-><init>()V

    sput-object v0, LG8/p;->a:LG8/p;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LF8/t0;LF8/t0;)Z
    .locals 2

    const-string v0, "a"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LF8/d;->a:LF8/d;

    sget-object v1, LG8/o;->a:LG8/o;

    invoke-virtual {v0, v1, p1, p2}, LF8/d;->b(LJ8/o;LJ8/i;LJ8/i;)Z

    move-result p1

    return p1
.end method
