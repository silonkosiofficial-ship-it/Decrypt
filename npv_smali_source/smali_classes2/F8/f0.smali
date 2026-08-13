.class public abstract LF8/f0;
.super LF8/l0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/f0$a;
    }
.end annotation


# static fields
.field public static final c:LF8/f0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF8/f0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF8/f0$a;-><init>(Ly7/k;)V

    sput-object v0, LF8/f0;->c:LF8/f0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LF8/l0;-><init>()V

    return-void
.end method

.method public static final i(LF8/e0;Ljava/util/List;)LF8/l0;
    .locals 1

    sget-object v0, LF8/f0;->c:LF8/f0$a;

    invoke-virtual {v0, p0, p1}, LF8/f0$a;->b(LF8/e0;Ljava/util/List;)LF8/l0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Ljava/util/Map;)LF8/f0;
    .locals 1

    sget-object v0, LF8/f0;->c:LF8/f0$a;

    invoke-virtual {v0, p0}, LF8/f0$a;->c(Ljava/util/Map;)LF8/f0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public e(LF8/E;)LF8/i0;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object p1

    invoke-virtual {p0, p1}, LF8/f0;->k(LF8/e0;)LF8/i0;

    move-result-object p1

    return-object p1
.end method

.method public abstract k(LF8/e0;)LF8/i0;
.end method
