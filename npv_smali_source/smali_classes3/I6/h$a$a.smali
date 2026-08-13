.class public final LI6/h$a$a;
.super LU6/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/h$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:LT6/h;

.field private final b:J

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method constructor <init>(LT6/h;Ljava/lang/Object;)V
    .locals 0

    .prologue
    iput-object p2, p0, LI6/h$a$a;->c:Ljava/lang/Object;

    invoke-direct {p0}, LU6/b$a;-><init>()V

    if-nez p1, :cond_0

    sget-object p1, LT6/h$a;->a:LT6/h$a;

    invoke-virtual {p1}, LT6/h$a;->a()LT6/h;

    move-result-object p1

    :cond_0
    iput-object p1, p0, LI6/h$a$a;->a:LT6/h;

    check-cast p2, [B

    array-length p1, p2

    int-to-long p1, p1

    iput-wide p1, p0, LI6/h$a$a;->b:J

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 2

    iget-wide v0, p0, LI6/h$a$a;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public b()LT6/h;
    .locals 1

    iget-object v0, p0, LI6/h$a$a;->a:LT6/h;

    return-object v0
.end method

.method public d()[B
    .locals 1

    iget-object v0, p0, LI6/h$a$a;->c:Ljava/lang/Object;

    check-cast v0, [B

    return-object v0
.end method
