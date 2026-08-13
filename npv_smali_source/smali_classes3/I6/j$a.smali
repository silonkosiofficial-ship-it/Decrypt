.class public final LI6/j$a;
.super LU6/b$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/j;->a(LT6/h;LO6/d;Ljava/lang/Object;)LU6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/lang/Long;

.field private final b:LT6/h;

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method constructor <init>(LO6/d;LT6/h;Ljava/lang/Object;)V
    .locals 2

    .prologue
    iput-object p3, p0, LI6/j$a;->c:Ljava/lang/Object;

    invoke-direct {p0}, LU6/b$c;-><init>()V

    invoke-virtual {p1}, LO6/d;->a()LT6/q;

    move-result-object p1

    sget-object p3, LT6/v;->a:LT6/v;

    invoke-virtual {p3}, LT6/v;->g()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, LW6/B;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LI6/j$a;->a:Ljava/lang/Long;

    if-nez p2, :cond_1

    sget-object p1, LT6/h$a;->a:LT6/h$a;

    invoke-virtual {p1}, LT6/h$a;->a()LT6/h;

    move-result-object p2

    :cond_1
    iput-object p2, p0, LI6/j$a;->b:LT6/h;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, LI6/j$a;->a:Ljava/lang/Long;

    return-object v0
.end method

.method public b()LT6/h;
    .locals 1

    iget-object v0, p0, LI6/j$a;->b:LT6/h;

    return-object v0
.end method

.method public d()Lio/ktor/utils/io/d;
    .locals 3

    iget-object v0, p0, LI6/j$a;->c:Ljava/lang/Object;

    check-cast v0, Ljava/io/InputStream;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v0, v1, v1, v2, v1}, Le7/c;->b(Ljava/io/InputStream;Lm7/i;Lf7/c;ILjava/lang/Object;)Lio/ktor/utils/io/d;

    move-result-object v0

    return-object v0
.end method
