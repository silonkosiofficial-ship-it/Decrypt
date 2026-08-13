.class public abstract LH/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LH/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LH/r$b;->K:LH/r$b;

    invoke-static {v0}, LH/r;->a(Lx7/l;)LH/q;

    move-result-object v0

    new-instance v1, LH/r$c;

    invoke-direct {v1, v0}, LH/r$c;-><init>(LH/q;)V

    sput-object v1, LH/r;->a:LH/q;

    return-void
.end method

.method public static final a(Lx7/l;)LH/q;
    .locals 1

    new-instance v0, LH/r$a;

    invoke-direct {v0, p0}, LH/r$a;-><init>(Lx7/l;)V

    return-object v0
.end method

.method public static final b()LH/q;
    .locals 1

    sget-object v0, LH/r;->a:LH/q;

    return-object v0
.end method
