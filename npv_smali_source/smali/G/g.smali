.class public abstract LG/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LG/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x32

    invoke-static {v0}, LG/g;->a(I)LG/f;

    move-result-object v0

    sput-object v0, LG/g;->a:LG/f;

    return-void
.end method

.method public static final a(I)LG/f;
    .locals 0

    invoke-static {p0}, LG/c;->a(I)LG/b;

    move-result-object p0

    invoke-static {p0}, LG/g;->b(LG/b;)LG/f;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LG/b;)LG/f;
    .locals 1

    new-instance v0, LG/f;

    invoke-direct {v0, p0, p0, p0, p0}, LG/f;-><init>(LG/b;LG/b;LG/b;LG/b;)V

    return-object v0
.end method

.method public static final c(F)LG/f;
    .locals 0

    invoke-static {p0}, LG/c;->b(F)LG/b;

    move-result-object p0

    invoke-static {p0}, LG/g;->b(LG/b;)LG/f;

    move-result-object p0

    return-object p0
.end method

.method public static final d(FFFF)LG/f;
    .locals 1

    new-instance v0, LG/f;

    invoke-static {p0}, LG/c;->b(F)LG/b;

    move-result-object p0

    invoke-static {p1}, LG/c;->b(F)LG/b;

    move-result-object p1

    invoke-static {p2}, LG/c;->b(F)LG/b;

    move-result-object p2

    invoke-static {p3}, LG/c;->b(F)LG/b;

    move-result-object p3

    invoke-direct {v0, p0, p1, p2, p3}, LG/f;-><init>(LG/b;LG/b;LG/b;LG/b;)V

    return-object v0
.end method

.method public static final e()LG/f;
    .locals 1

    sget-object v0, LG/g;->a:LG/f;

    return-object v0
.end method
