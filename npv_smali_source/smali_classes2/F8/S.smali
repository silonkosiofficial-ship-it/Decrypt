.class public final LF8/S;
.super LF8/j0;
.source "SourceFile"


# instance fields
.field private final a:LF8/E;


# direct methods
.method public constructor <init>(LL7/g;)V
    .locals 1

    const-string v0, "kotlinBuiltIns"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/j0;-><init>()V

    invoke-virtual {p1}, LL7/g;->I()LF8/M;

    move-result-object p1

    const-string v0, "getNullableAnyType(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LF8/S;->a:LF8/E;

    return-void
.end method


# virtual methods
.method public a()LF8/u0;
    .locals 1

    sget-object v0, LF8/u0;->I:LF8/u0;

    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getType()LF8/E;
    .locals 1

    iget-object v0, p0, LF8/S;->a:LF8/E;

    return-object v0
.end method

.method public v(LG8/g;)LF8/i0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
