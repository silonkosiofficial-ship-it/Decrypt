.class public final Lg8/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB8/s;


# static fields
.field public static final a:Lg8/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/l;

    invoke-direct {v0}, Lg8/l;-><init>()V

    sput-object v0, Lg8/l;->a:Lg8/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li8/q;Ljava/lang/String;LF8/M;LF8/M;)LF8/E;
    .locals 1

    .prologue
    const-string v0, "proto"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flexibleId"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lowerBound"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlin.jvm.PlatformType"

    invoke-static {p2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, LH8/j;->l0:LH8/j;

    invoke-virtual {p3}, LF8/M;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4}, LF8/M;->toString()Ljava/lang/String;

    move-result-object p4

    filled-new-array {p2, p3, p4}, [Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Ll8/a;->g:Lp8/i$f;

    invoke-virtual {p1, p2}, Lp8/i$d;->x(Lp8/i$f;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lc8/h;

    invoke-direct {p1, p3, p4}, Lc8/h;-><init>(LF8/M;LF8/M;)V

    return-object p1

    :cond_1
    invoke-static {p3, p4}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object p1

    return-object p1
.end method
