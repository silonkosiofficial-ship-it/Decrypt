.class public final LF8/t;
.super LF8/l0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/t$a;
    }
.end annotation


# static fields
.field public static final e:LF8/t$a;


# instance fields
.field private final c:LF8/l0;

.field private final d:LF8/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF8/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF8/t$a;-><init>(Ly7/k;)V

    sput-object v0, LF8/t;->e:LF8/t$a;

    return-void
.end method

.method private constructor <init>(LF8/l0;LF8/l0;)V
    .locals 0

    invoke-direct {p0}, LF8/l0;-><init>()V

    iput-object p1, p0, LF8/t;->c:LF8/l0;

    iput-object p2, p0, LF8/t;->d:LF8/l0;

    return-void
.end method

.method public synthetic constructor <init>(LF8/l0;LF8/l0;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LF8/t;-><init>(LF8/l0;LF8/l0;)V

    return-void
.end method

.method public static final i(LF8/l0;LF8/l0;)LF8/l0;
    .locals 1

    sget-object v0, LF8/t;->e:LF8/t$a;

    invoke-virtual {v0, p0, p1}, LF8/t$a;->a(LF8/l0;LF8/l0;)LF8/l0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    iget-object v0, p0, LF8/t;->c:LF8/l0;

    invoke-virtual {v0}, LF8/l0;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LF8/t;->d:LF8/l0;

    invoke-virtual {v0}, LF8/l0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public b()Z
    .locals 1

    .prologue
    iget-object v0, p0, LF8/t;->c:LF8/l0;

    invoke-virtual {v0}, LF8/l0;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LF8/t;->d:LF8/l0;

    invoke-virtual {v0}, LF8/l0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public d(LP7/g;)LP7/g;
    .locals 2

    const-string v0, "annotations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/t;->d:LF8/l0;

    iget-object v1, p0, LF8/t;->c:LF8/l0;

    invoke-virtual {v1, p1}, LF8/l0;->d(LP7/g;)LP7/g;

    move-result-object p1

    invoke-virtual {v0, p1}, LF8/l0;->d(LP7/g;)LP7/g;

    move-result-object p1

    return-object p1
.end method

.method public e(LF8/E;)LF8/i0;
    .locals 1

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/t;->c:LF8/l0;

    invoke-virtual {v0, p1}, LF8/l0;->e(LF8/E;)LF8/i0;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, LF8/t;->d:LF8/l0;

    invoke-virtual {v0, p1}, LF8/l0;->e(LF8/E;)LF8/i0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g(LF8/E;LF8/u0;)LF8/E;
    .locals 2

    const-string v0, "topLevelType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/t;->d:LF8/l0;

    iget-object v1, p0, LF8/t;->c:LF8/l0;

    invoke-virtual {v1, p1, p2}, LF8/l0;->g(LF8/E;LF8/u0;)LF8/E;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, LF8/l0;->g(LF8/E;LF8/u0;)LF8/E;

    move-result-object p1

    return-object p1
.end method
