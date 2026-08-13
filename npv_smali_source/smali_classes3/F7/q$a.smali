.class public final LF7/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF7/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LF7/q$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LF7/o;)LF7/q;
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF7/q;

    sget-object v1, LF7/r;->D:LF7/r;

    invoke-direct {v0, v1, p1}, LF7/q;-><init>(LF7/r;LF7/o;)V

    return-object v0
.end method

.method public final b(LF7/o;)LF7/q;
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF7/q;

    sget-object v1, LF7/r;->E:LF7/r;

    invoke-direct {v0, v1, p1}, LF7/q;-><init>(LF7/r;LF7/o;)V

    return-object v0
.end method

.method public final c()LF7/q;
    .locals 1

    sget-object v0, LF7/q;->d:LF7/q;

    return-object v0
.end method

.method public final d(LF7/o;)LF7/q;
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF7/q;

    sget-object v1, LF7/r;->C:LF7/r;

    invoke-direct {v0, v1, p1}, LF7/q;-><init>(LF7/r;LF7/o;)V

    return-object v0
.end method
