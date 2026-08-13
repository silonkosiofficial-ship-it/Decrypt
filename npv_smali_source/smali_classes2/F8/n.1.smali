.class public final LF8/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/Z;


# static fields
.field public static final a:LF8/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF8/n;

    invoke-direct {v0}, LF8/n;-><init>()V

    sput-object v0, LF8/n;->a:LF8/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LP7/g;LF8/e0;LO7/m;)LF8/a0;
    .locals 0

    .prologue
    const-string p2, "annotations"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LP7/g;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p1, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {p1}, LF8/a0$a;->i()LF8/a0;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p2, LF8/a0;->D:LF8/a0$a;

    new-instance p3, LF8/i;

    invoke-direct {p3, p1}, LF8/i;-><init>(LP7/g;)V

    invoke-static {p3}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, LF8/a0$a;->h(Ljava/util/List;)LF8/a0;

    move-result-object p1

    :goto_0
    return-object p1
.end method
