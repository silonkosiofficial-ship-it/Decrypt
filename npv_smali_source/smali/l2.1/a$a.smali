.class final Ll2/a$a;
.super Ll2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final b:Landroidx/privacysandbox/ads/adservices/topics/d;


# direct methods
.method public constructor <init>(Landroidx/privacysandbox/ads/adservices/topics/d;)V
    .locals 1

    const-string v0, "mTopicsManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ll2/a;-><init>()V

    iput-object p1, p0, Ll2/a$a;->b:Landroidx/privacysandbox/ads/adservices/topics/d;

    return-void
.end method

.method public static final synthetic c(Ll2/a$a;)Landroidx/privacysandbox/ads/adservices/topics/d;
    .locals 0

    iget-object p0, p0, Ll2/a$a;->b:Landroidx/privacysandbox/ads/adservices/topics/d;

    return-object p0
.end method


# virtual methods
.method public b(Landroidx/privacysandbox/ads/adservices/topics/a;)LP4/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/privacysandbox/ads/adservices/topics/a;",
            ")",
            "LP4/d;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LW8/d0;->c()LW8/J0;

    move-result-object v0

    invoke-static {v0}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v1

    new-instance v4, Ll2/a$a$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Ll2/a$a$a;-><init>(Ll2/a$a;Landroidx/privacysandbox/ads/adservices/topics/a;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->b(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/V;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lj2/b;->c(LW8/V;Ljava/lang/Object;ILjava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method
