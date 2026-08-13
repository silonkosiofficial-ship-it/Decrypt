.class public abstract LQ3/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ3/o$a;
    }
.end annotation


# static fields
.field private static final a:LQ3/L;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ3/I;

    invoke-direct {v0}, LQ3/I;-><init>()V

    sput-object v0, LQ3/o;->a:LQ3/L;

    return-void
.end method

.method public static a(LO3/g;LQ3/o$a;)Ll4/l;
    .locals 3

    sget-object v0, LQ3/o;->a:LQ3/L;

    new-instance v1, Ll4/m;

    invoke-direct {v1}, Ll4/m;-><init>()V

    new-instance v2, LQ3/J;

    invoke-direct {v2, p0, v1, p1, v0}, LQ3/J;-><init>(LO3/g;Ll4/m;LQ3/o$a;LQ3/L;)V

    invoke-virtual {p0, v2}, LO3/g;->a(LO3/g$a;)V

    invoke-virtual {v1}, Ll4/m;->a()Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static b(LO3/g;)Ll4/l;
    .locals 1

    new-instance v0, LQ3/K;

    invoke-direct {v0}, LQ3/K;-><init>()V

    invoke-static {p0, v0}, LQ3/o;->a(LO3/g;LQ3/o$a;)Ll4/l;

    move-result-object p0

    return-object p0
.end method
