.class public abstract LF8/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/l0$b;
    }
.end annotation


# static fields
.field public static final a:LF8/l0$b;

.field public static final b:LF8/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF8/l0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF8/l0$b;-><init>(Ly7/k;)V

    sput-object v0, LF8/l0;->a:LF8/l0$b;

    new-instance v0, LF8/l0$a;

    invoke-direct {v0}, LF8/l0$a;-><init>()V

    sput-object v0, LF8/l0;->b:LF8/l0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final c()LF8/n0;
    .locals 2

    invoke-static {p0}, LF8/n0;->g(LF8/l0;)LF8/n0;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(LP7/g;)LP7/g;
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract e(LF8/E;)LF8/i0;
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g(LF8/E;LF8/u0;)LF8/E;
    .locals 1

    const-string v0, "topLevelType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final h()LF8/l0;
    .locals 1

    new-instance v0, LF8/l0$c;

    invoke-direct {v0, p0}, LF8/l0$c;-><init>(LF8/l0;)V

    return-object v0
.end method
